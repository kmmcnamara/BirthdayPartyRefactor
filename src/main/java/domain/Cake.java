package domain;

public class Cake {
    
    public static class Builder {
        private String cakeFlavor;
        private String frostingFlavor;
        private String shape;
        private String size;
        private String cakeColor;
        
        public Builder(String cakeFlavor) {
            this.cakeFlavor = cakeFlavor;
        }
        
        public Builder withFrostingFlavor(String frostingFlavor) {
            this.frostingFlavor = frostingFlavor;
            
            return this;
        }
        
        public Builder withShape(String shape) {
            this.shape = shape;
            
            return this;
        }
        
        public Builder withSize(String size) {
            this.size = size;
            
            return this;
        }
        
        public Builder withCakeColor(String cakeColor) {
            this.cakeColor = cakeColor;
            
            return this;
        }
        
        public Cake build() {
            Cake cake = new Cake(
                this.cakeFlavor,
                this.frostingFlavor,
                this.shape,
                this.size,
                this.cakeColor
            );
                
            this.validateCake(cake);
                
            return cake;
        }
        
        private void validateCake(Cake cake) {
            /**
             * This is really messy but I'm not familiar anymore with if it's ok
             * to use reflection to loop through all the properties to assert
             * not-null-ness, or if there are better ways not to ensure
             * correctness.
             */
            if (
                cake.getCakeFlavor() == null ||
                cake.getFrostingFlavor() == null ||
                cake.getShape() == null ||
                cake.getSize() == null ||
                cake.getCakeColor() == null
            ) {
                throw new IllegalStateException();
            }
        }
    }
    
    private String cakeFlavor;
    private String frostingFlavor;
    private String shape;
    private String size;
    private String cakeColor;
    
    private Cake(
        String cakeFlavor,
        String frostingFlavor, 
        String shape, 
        String size, 
        String cakeColor
    ) {
        this.cakeFlavor = cakeFlavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.cakeColor = cakeColor;
    }
    
    public String toString() {
        return String.format("Cake Flavor: %s, Frosting Flavor: %s, " +
        "Shape: %s, Size: %s, Cake Color: %s", 
        this.cakeFlavor, this.frostingFlavor, this.shape, this.size, this.cakeColor);
    }
    
    public String getCakeFlavor() {
        return this.cakeFlavor;
    }
    
    public String getFrostingFlavor() {
        return this.frostingFlavor;
    }
    
    public String getShape() {
        return this.shape;
    }
    
    public String getSize() {
        return this.size;
    }
    
    public String getCakeColor() {
        return this.cakeColor;
    }
}