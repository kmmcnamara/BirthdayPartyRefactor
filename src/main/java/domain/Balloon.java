package domain;

/**
 * It's a Balloon, with a Builder class.
 * I'd usually put a description of what domain object this represents
 * but I'm pretty sure everyone knows what a ballooon is
 */
public class Balloon {
    
    public static class Builder {
        
        private String color;
        private String material;
        private Integer number;
        
        public Builder(String color) {
            this.color = color;
        }
        
        public Builder withMaterial(String material) {
            this.material = material;
            
            return this;
        }
        
        public Builder withNumber(Integer number) {
            this.number = number;
            
            return this;
        }
        
        public Balloon build() {
            Balloon balloon = new Balloon(this.color, this.material, this.number);
            
            this.validateBalloon(balloon);
            
            return balloon;
        }
        
        private void validateBalloon(Balloon balloon) {
            /**
             * I really want `number` to be an int because it doesn't make any
             * sense to me as a String, I then have it as an Integer because 
             * int defaults to `0` which seems to invite unintented behavior
             */
            if (
                balloon.getColor() == null ||
                balloon.getMaterial() == null ||
                balloon.getNumber() == null
            ) {
                throw new IllegalStateException("Balloon built without all properties");
            }
        }
    }
    
    private String color;
    private String material;
    private Integer number;
    
    private Balloon(String color, String material, Integer number) {
        this.color = color;
        this.material = material;
        this.number = number;
    }
    
    public String toString() {
        return String.format("Color: %s, Material: %s, Number: %s", 
        this.color, this.material, this.number);
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String getMaterial() {
        return this.material;
    }
    
    public Integer getNumber() {
        return this.number;
    }
}