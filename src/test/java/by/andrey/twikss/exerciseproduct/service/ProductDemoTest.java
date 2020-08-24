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

    @Test
    public void testPrintLnFormationReturnTrue(){
        var product = new Product("Tea");
        product.setRegularPrice(3.14);
        product.setDiscount(0.1);

        String expected = "Product : Tea, regular price = 3.14 EUR, discount = 0.1%, actual price = 2.83 EUR";
        String actual =  ProductDemo.printlnFormation(product,ProductDemo.actualPrice(product));

        assertEquals(expected, actual);
    }

}