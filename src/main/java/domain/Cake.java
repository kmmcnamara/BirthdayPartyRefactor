package domain;

public class Cake {
    
    private String cakeFlavor;
    private String frostingFlavor;
    private String shape;
    private String size;
    private String cakeColor;
    
    /**
     * I'm writing this in AWS Cloud9 and none of the formatting/indentation
     * options look that good here, so I guess I'm just going to go with this
     */
    public Cake(
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