

public class ProductWarehouse extends Warehouse {
    private String productName;
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.productName = productName;
    }

    /**
     * @return String return the productName
     */
    public String getName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return this.productName+": "+super.toString();
    }


}