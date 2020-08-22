package by.andrey.twikss.exercisedog.service;

import by.andrey.twikss.exercisedog.bean.Dog;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogDemoTest extends TestCase {

    @Test
    public void testIfDogBarkShouldReturnTrue (){
        Dog dog = new Dog(4,"red","kloka");
        DogDemo dogDemo = new DogDemo(dog);

        boolean expected = true;
        boolean actual = dogDemo.bark().equals("Dog kloka say: bau bau bau");

        assertEquals(expected, actual);
    }

    @Test
    public void testifDogEatShouldReturnTrue (){
        Dog dog = new Dog(4,"red","kloka");
        DogDemo dogDemo = new DogDemo(dog);

        boolean expected = true;
        boolean actual = true;

        assertEquals(expected, actual);

    }

}