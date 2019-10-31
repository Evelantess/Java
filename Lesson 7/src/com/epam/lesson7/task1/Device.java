package com.epam.lesson7.task1;

/**
 * Created by Tetiana_Moskalenko on 10/31/2019.
 */
public class Device {
    private String serialNumber;
    private String manufacturer;
    private double price;

    public Device(String serialNumber, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "class= " + this.getClass().getSimpleName() + ": " +
                "serialNumber= " + serialNumber +
                ", manufacturer= " + manufacturer  +
                ", price=" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Double.compare(device.price, price) != 0) return false;
        if (serialNumber != null ? !serialNumber.equals(device.serialNumber) : device.serialNumber != null)
            return false;
        return manufacturer != null ? manufacturer.equals(device.manufacturer) : device.manufacturer == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = serialNumber != null ? serialNumber.hashCode() : 0;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
