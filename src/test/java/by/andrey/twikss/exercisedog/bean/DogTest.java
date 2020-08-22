package by.andrey.twikss.exercisedog.bean;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest extends TestCase {

    @Test
    public void testTestEqualsFalse() {
        Dog dog1 = new Dog(3,"red","krid");
        var dog2 = new Dog(4,"green","vlad");

        boolean expected = false;
        boolean actual = dog1.equals(dog2);

        assertEquals(expected, actual);
    }

    @Test
    public void testTestEqualsTrue() {
        Dog dog1 = new Dog(3,"red","krid");
        var dog2 = new Dog(3,"red","krid");

        boolean expected = true;
        boolean actual = dog1.equals(dog2);

        assertEquals(expected, actual);
    }

    @Test
    public void testTestHashCodeReturnValueTrue() {
        Dog dog1 = new Dog(3,"red","krid");

        boolean expected = true;
        boolean actual = dog1.hashCode() == 6829555;

        assertEquals(expected, actual);
    }

    @Test
    public void testTestToStringReturnValueTrue() {
        Dog dog1 = new Dog(3,"red","krid");

        boolean expected = true;
        boolean actual = dog1.toString().equals("Dog{age=3, color='red', name='krid'}");

        assertEquals(expected, actual);
    }
}