package by.andrey.twikss.exerciseencoder.service;

import by.andrey.twikss.exerciseencoder.bean.Encoder;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class EncoderDemoTest extends TestCase {

    @Test
    public void testEncoderReturnTrue(){
        Encoder encoder = new Encoder((short) 88,'f');

        boolean expected = true;
        boolean actual = EncoderDemo.encoder(encoder) == 'X';

        assertEquals(expected,actual);
    }

    @Test
    public void testDecodeReturnTrue(){
        Encoder encoder = new Encoder((short) 88,'f');

        boolean expected = true;
        boolean actual = EncoderDemo.decode(encoder) == 102;

        assertEquals(expected,actual);
    }

}