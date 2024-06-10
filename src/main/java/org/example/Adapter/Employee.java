package org.example.Adapter;

import java.util.Objects;

// Adaptee
public class Employee {

    private String fullName;

    private String jobTitle;

    private String officeLocation;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName) && Objects.equals(jobTitle, employee.jobTitle) && Objects.equals(officeLocation, employee.officeLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, jobTitle, officeLocation);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", officeLocation='" + officeLocation + '\'' +
                '}';
    }
}
