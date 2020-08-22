package by.andrey.twikss.exercisedog.bean;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest extends TestCase {

    @Test
    public void testTestEquals() {
        Dog dog1 = new Dog(3,"red","krid");
        var dog2 = new Dog(4,"green","vlad");

        boolean expected = false;
        boolean actual = dog1.equals(dog2);

        assertEquals(expected, actual);
    }
}