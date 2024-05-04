import java.util.Objects;

public class Laptop {
    private int id;
    private String brand;
    private float ram;
    private float hdd;
    private String cpu;
    private String opSys;
    private String color;
    private int price;

    public Laptop(
            int id, String brand, float ram, float hdd, String cpu, String opSys, String color, int price) {
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

    public float getRam() {
        return ram;
    }

    public float getHdd() {
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

    public void setRam(float ram) {
        this.ram = ram;
    }

    public void setHdd(float hdd) {
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
}
