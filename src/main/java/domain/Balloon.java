package domain;

public class Balloon {
    
    private String color;
    private String material;
    private int number;
    
    public Balloon(String color, String material, int number) {
        this.color = color;
        this.material = material;
        this.number = number;
    }
    
    public String toString() {
        return String.format("Color:%s, Material: %s, Number: %s", 
        this.color, this.material, this.number);
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String getMaterial() {
        return this.material;
    }
    
    public int getNumber() {
        return this.number;
    }
}