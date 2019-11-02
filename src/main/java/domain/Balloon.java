package domain;

public class Balloon {
    
    public static class Builder {
        
        private String color;
        private String material;
        private int number;
        
        public Builder(String color) {
            this.color = color;
        }
        
        public Builder withMaterial(String material) {
            this.material = material;
            
            return this;
        }
        
        public Builder withNumber(int number) {
            this.number = number;
            
            return this;
        }
        
        public Balloon build() {
            return new Balloon(this.color, this.material, this.number);
        }
    }
    
    private String color;
    private String material;
    private int number;
    
    private Balloon(String color, String material, int number) {
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