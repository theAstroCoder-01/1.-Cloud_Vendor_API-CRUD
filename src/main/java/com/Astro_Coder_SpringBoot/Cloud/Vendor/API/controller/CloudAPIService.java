package com.Astro_Coder_SpringBoot.Cloud.Vendor.API.controller;

import com.Astro_Coder_SpringBoot.Cloud.Vendor.API.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendor;
        // ("C1", "Vendor 1", "Address One", "xxx");
    }

    @PostMapping ("{vendorId}")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor created successfully!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor updated successfully!";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId) {
        this.cloudVendor = cloudVendor;
        return "Cloud vendor deleted successfully!";

    }
}
