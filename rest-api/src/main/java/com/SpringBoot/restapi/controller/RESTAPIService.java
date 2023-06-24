package com.SpringBoot.restapi.controller;

import com.SpringBoot.restapi.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class RESTAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return new CloudVendor("C1","vendor1","c1@gmail.com","XXX");
    }
    @PostMapping
    public String CreateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "created successfully";

    }
    @PutMapping
    public String UpdateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "updated successfully";
    }
    @DeleteMapping("{vendorId")
    public String DeleteCloudVendorDetails(String vendorID) {
        this.cloudVendor = null;
        return "deleted successfully";
    }



}
