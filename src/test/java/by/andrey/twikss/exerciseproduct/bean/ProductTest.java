package by.andrey.twikss.exerciseproduct.bean;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest extends TestCase {

    @Test
    public void testTestEqualsReturnTrue() {
        Product product1 = new Product("Milk");
        Product product2 = new Product("Milk");

        boolean expected = true;
        boolean actual = product1.equals(product2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestEqualsReturnFalseUseSetRegularPrice() {
        Product product1 = new Product("Milk");
        Product product2 = new Product("Milk");
        product1.setRegularPrice(2.43);

        boolean expected = false;
        boolean actual = product1.equals(product2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestEqualsReturnFalse() {
        Product product1 = new Product("Milk");
        Product product2 = new Product("Sugar");

        boolean expected = false;
        boolean actual = product1.equals(product2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestHashCode() {
        Product product = new Product("Milk");

        boolean expected = true;
        boolean actual = product.hashCode() == -1990202918;

        assertEquals(expected,actual);
    }

    @Test
    public void testTestToString() {
        Product product1 = new Product("Milk");
        product1.setRegularPrice(4.34);
        product1.setDiscount(0.05);

        boolean expected = true;
        boolean actual = product1.toString().equals("Product{name='Milk', regularPrice=4.34, discount=0.05}");

        assertEquals(expected,actual);
    }
}