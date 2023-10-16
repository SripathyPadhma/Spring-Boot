package com.thinkconstructive.restdemo.Model;

public class CloudVendor {
    private String VendorId;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhNo;
    

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhNo) {
        VendorId = vendorId;
        VendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhNo = vendorPhNo;
    }

    /**
     * @return String return the VendorId
     */
    public String getVendorId() {
        return VendorId;
    }

    /**
     * @param VendorId the VendorId to set
     */
    public void setVendorId(String VendorId) {
        this.VendorId = VendorId;
    }

    /**
     * @return String return the VendorName
     */
    public String getVendorName() {
        return VendorName;
    }

    /**
     * @param VendorName the VendorName to set
     */
    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    /**
     * @return String return the VendorAddress
     */
    public String getVendorAddress() {
        return VendorAddress;
    }

    /**
     * @param VendorAddress the VendorAddress to set
     */
    public void setVendorAddress(String VendorAddress) {
        this.VendorAddress = VendorAddress;
    }

    /**
     * @return String return the VendorPhNo
     */
    public String getVendorPhNo() {
        return VendorPhNo;
    }

    /**
     * @param VendorPhNo the VendorPhNo to set
     */
    public void setVendorPhNo(String VendorPhNo) {
        this.VendorPhNo = VendorPhNo;
    }

}
