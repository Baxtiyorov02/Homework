import db.KingBurgersDB;
import hamburger.Hamburger;
import product.BaseProducts;
import product_types.ProductTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<BaseProducts> userChoiseGarnirs=new ArrayList<>();
    private  static  List<Hamburger> userChoiseHamburgers=new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        KingBurgersDB db= KingBurgersDB.getInstance();


        System.out.println(db);
        List<BaseProducts> products=new ArrayList<>();


       // products.add(new BaseProducts(ProductTypes.MEET,10_000,5));
       /// products.add(new BaseProducts(ProductTypes.RULON_BREAD,3_000,5));
       // products.add(new BaseProducts(ProductTypes.SALAD,2_000,5));
        products.add(new BaseProducts(ProductTypes.TOMATO,1_000,5));

        db.setProducts(products);
        System.out.println("\n");

        System.out.println(db);




    }
}
