package desafio3.model;

public class Product {

    private String productName;

    private String productType;

    private String productValue;

    public Product() {
        //
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductType() {
        return this.productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductValue() {
        return this.productValue;
    }

    public void setProductValue(String productValue){
        this.productValue = productValue;
    }
}
