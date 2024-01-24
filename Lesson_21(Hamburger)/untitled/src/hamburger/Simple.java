package hamburger;

import product.BaseProducts;
import product_types.ProductTypes;

import java.util.ArrayList;
import java.util.List;

public class Simple implements Hamburger{
    private  int count;
    private List<BaseProducts> garnirs=new ArrayList<>();

    public Simple(int count) {
        this.count = count;
        garnirs.add(new BaseProducts(ProductTypes.SALAD,1));
    }
    public  boolean addGarnir(List<BaseProducts> garnirs){
        if (!garnirs.isEmpty()){
            this.garnirs.clear();
            this.garnirs.addAll(garnirs);
            return true;
        }


        return  false;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "count=" + count +
                ", garnirs=" + garnirs +
                '}';
    }
}
