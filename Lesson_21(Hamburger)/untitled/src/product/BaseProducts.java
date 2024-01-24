package product;

import product_types.ProductTypes;

public class BaseProducts {
   private ProductTypes productTypes;
   private int price;
   private int count;

    public BaseProducts(ProductTypes productTypes, int price, int count) {
        this.productTypes = productTypes;
        this.price = price;
        this.count = count;
    }

    public BaseProducts(ProductTypes productTypes,int count) {
        this.productTypes = productTypes;
        this.count = count;
    }

    public ProductTypes getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(ProductTypes productTypes) {
        this.productTypes = productTypes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public  void  decrementCount(int count){
        this.count-=count;
    }
    public  void  incrementCount(int count){
        this.count+=count;
    }

    @Override
    public String toString() {
        return "BaseProducts{" +
                "productTypes=" + productTypes +
                ", price=" + price +
                ", count=" + count +
                '}' +"\n";

    }
}
