package com.nallani.model;

public class EmployeeAddress {

    private String houseNo;
    private String streetNo;
    private String zipCode;

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "houseNo='" + houseNo + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
