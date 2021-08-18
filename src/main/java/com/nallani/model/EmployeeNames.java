package com.nallani.model;

import java.util.List;

public class EmployeeNames {

    private List<EmployeeName> employeeNameList;

    public void setEmployeeNameList(List<EmployeeName> employeeNameList) {
        this.employeeNameList = employeeNameList;
    }

    public List<EmployeeName> getEmployeeNameList() {
        return employeeNameList;
    }

    @Override
    public String toString() {
        return "EmployeeNames{" +
                "employeeNameList=" + employeeNameList +
                '}';
    }
}
