package com.thinkconstructive.restdemo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.restdemo.Model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService
{
    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetails(String VendorId)
    {
        return cloudVendor;
        //new CloudVendor("C1","Vendor 1","Address One","xxxx");
      
    }


    @PostMapping
    public String createVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor= cloudVendor;
        return "Vendor Created Successfully";
    }


    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor= cloudVendor;
        return "Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendorDetails(String vendorId)
    {
        this.cloudVendor= null;
        return "Vendor Deleted Successfully";
    }
}
