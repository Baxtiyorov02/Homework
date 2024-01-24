package db;

import product.BaseProducts;
import product_types.ProductTypes;

import java.util.ArrayList;
import java.util.List;

public class KingBurgersDB {

    private  static  KingBurgersDB instance=null;
    private List<BaseProducts> products=new ArrayList<>();

    private KingBurgersDB() {
        products.add(new BaseProducts(ProductTypes.MEET,10_000,10));
        products.add(new BaseProducts(ProductTypes.RULON_BREAD,3_000,10));
        products.add(new BaseProducts(ProductTypes.CHEESE,3_000,10));
        products.add(new BaseProducts(ProductTypes.TOMATO,1_000,10));
        products.add(new BaseProducts(ProductTypes.CUCUMBER,1_000,10));
        products.add(new BaseProducts(ProductTypes.SALAD,2_000,10));

    }
    public  static  KingBurgersDB getInstance(){
        if(instance==null){
            instance=new KingBurgersDB();
        }
        return instance;
    }

    public  void setProducts(List<BaseProducts> iProducts){
        for (int i = 0; i <iProducts.size() ; i++) {
            BaseProducts imputBaseProduct=iProducts.get(i);
            for (int j = 0; j <getProducts().size(); j++) {
                BaseProducts product=getProducts().get(j);
                if (imputBaseProduct.getProductTypes()!=null && product.getProductTypes()!=null){
                    if(imputBaseProduct.getProductTypes().equals(product.getProductTypes()));{
                    product.incrementCount(imputBaseProduct.getCount());}
                }
            }

        }
    }

    public List<BaseProducts> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "KingBurgersDB{" +
                "products=" + products +
                '}';
    }
}
