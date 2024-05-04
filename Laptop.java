import java.util.Objects;

public class Laptop {
    private int id;
    private String brand;
    private double ram;
    private double hdd;
    private String cpu;
    private String opSys;
    private String color;
    private int price;

    public Laptop(
            int id, String brand, double ram, double hdd, String cpu, String opSys, String color, int price) {
        this.id = id;
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.opSys = opSys;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getRam() {
        return ram;
    }

    public double getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOpSys() {
        return opSys;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public void setHdd(double hdd) {
        this.hdd = hdd;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setOpSys(String opSys) {
        this.opSys = opSys;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, Brand: %s, RAM: %.1f GB, HDD: %.1f TB, CPU: %s, Operating System: %s, Color: %s, Price: %d USD",
                id, brand, ram, hdd, cpu, opSys, color, price);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop lap = (Laptop) obj;
        return id == lap.id
                && brand.equals(lap.brand)
                && ram == lap.ram
                && hdd == lap.hdd
                && color.equals(lap.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, ram, hdd, color);
    }
}
