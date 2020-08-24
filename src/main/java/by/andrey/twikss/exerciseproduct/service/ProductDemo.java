package by.andrey.twikss.exerciseproduct.service;

import by.andrey.twikss.exerciseproduct.bean.Product;
import org.decimal4j.util.DoubleRounder;

public class ProductDemo {

    private ProductDemo() {
    }

    public static double actualPrice(Product product) {
        return DoubleRounder.round(product.getRegularPrice() - (product.getRegularPrice()*product.getDiscount()),2);
    }
}
