package by.andrey.twikss.exerciseencoder.bean;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class EncoderTest extends TestCase {

    @Test
    public void testTestEqualsReturnTrue() {
        Encoder encoder1 = new Encoder((short) 89, 'g');
        Encoder encoder2 = new Encoder((short) 89, 'g');

        boolean expected = true;
        boolean actual = encoder1.equals(encoder2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestEqualsReturnFalse() {
        Encoder encoder1 = new Encoder((short) 89, 'g');
        Encoder encoder2 = new Encoder((short) 100, 'g');

        boolean expected = false;
        boolean actual = encoder1.equals(encoder2);

        assertEquals(expected,actual);
    }

    @Test
    public void testTestHashCode() {
        Encoder encoder = new Encoder((short) 89, 'g');

        boolean expected = true;
        boolean actual = encoder.hashCode() == 3823;

        assertEquals(expected,actual);
    }

    @Test
    public void testTestToString() {
        Encoder encoder = new Encoder((short) 89, 'g');

        boolean expected = true;
        boolean actual = encoder.toString().equals("Encoder{number=89, symbol=g}");

        assertEquals(expected,actual);
    }
}