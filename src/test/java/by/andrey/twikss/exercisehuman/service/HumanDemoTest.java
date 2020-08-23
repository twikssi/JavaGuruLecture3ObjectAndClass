package by.andrey.twikss.exercisehuman.service;

import by.andrey.twikss.exercisehuman.bean.Human;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanDemoTest extends TestCase {

    @Test
    public void testGreetReturnTrue (){
        Human human = new Human("Peter",18);

        boolean expected = true;
        boolean actual = HumanDemo.greet(human).equals("Hi! My name is Peter, I`m 18 years old");
        assertEquals(expected,actual);
    }

}