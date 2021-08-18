package com.nallani.model;

import java.util.List;

public class EmployeeAddresses {

    private List<EmployeeAddress> employeeAddressList;

    public void setEmployeeAddressList(List<EmployeeAddress> employeeAddressList) {
        this.employeeAddressList = employeeAddressList;
    }

    public List<EmployeeAddress> getEmployeeAddressList() {
        return employeeAddressList;
    }

    @Override
    public String toString() {
        return "EmployeeAddresses{" +
                "employeeAddressList=" + employeeAddressList +
                '}';
    }
}
