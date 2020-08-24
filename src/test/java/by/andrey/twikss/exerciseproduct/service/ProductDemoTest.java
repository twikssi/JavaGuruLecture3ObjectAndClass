package by.andrey.twikss.exerciseproduct.service;

import by.andrey.twikss.exerciseproduct.bean.Product;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductDemoTest extends TestCase {

    @Test
    public void testActualPriceReturnTrue (){
        var product = new Product("Tea");
        product.setRegularPrice(3.45);
        product.setDiscount(0.3);

        boolean expected = true;
        boolean actual = ProductDemo.actualPrice(product) == 2.42;

        assertEquals(expected, actual);
    }
}