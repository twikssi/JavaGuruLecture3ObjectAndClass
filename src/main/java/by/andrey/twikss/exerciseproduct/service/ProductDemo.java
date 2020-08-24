package by.andrey.twikss.exerciseproduct.service;

import by.andrey.twikss.exerciseproduct.bean.Product;
import org.decimal4j.util.DoubleRounder;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class ProductDemo {
    private static Logger logger = LoggerFactory.getLogger(ProductDemo.class);

    private ProductDemo() {
    }

    public static double actualPrice(Product product) {
        return DoubleRounder.round(product.getRegularPrice() - (product.getRegularPrice()*product.getDiscount()),2);
    }

    public static String printlnFormation(Product product, double price) {
        String log = "Product : " + product.getName() +
                ", regular price = " + product.getRegularPrice() +
                " EUR, discount = " + product.getDiscount() +
                "%, actual price = " + price + " EUR";
        logger.info(log);
        return log;
    }
}
