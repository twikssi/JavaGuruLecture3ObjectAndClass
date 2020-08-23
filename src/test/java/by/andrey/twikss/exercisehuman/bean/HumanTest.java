package by.andrey.twikss.exercisehuman.bean;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class HumanTest extends TestCase {

    @Test
    public void testTestEqualsReturnTrue() {
        Human human1 = new Human("Dolly", 18);
        Human human2 = new Human("Dolly", 18);

        boolean expected = true;
        boolean actual = human1.equals(human2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestEqualsReturnFalse() {
        Human human1 = new Human("Dolly", 18);
        Human human2 = new Human("Dolly", 14);

        boolean expected = false;
        boolean actual = human1.equals(human2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestHashCode() {
        Human human1 = new Human("Dolly", 18);

        boolean expected = true;
        boolean actual = human1.hashCode() == 2052619045;

        assertEquals(expected,actual);
    }

    @Test
    public void testTestToString() {
        Human human1 = new Human("Dolly", 18);

        boolean expected = true;
        boolean actual = human1.toString().equals("Human{name='Dolly', age=18}");

        assertEquals(expected,actual);
    }
}