package com.telusko.quizapp.models;

public class Vehicle {

    private int empId;

    private String vehicleNo;

    private String vehicleName;

    private String insurance;

    private int manufacturingYear;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "empId=" + empId +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", insurance='" + insurance + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }
}
