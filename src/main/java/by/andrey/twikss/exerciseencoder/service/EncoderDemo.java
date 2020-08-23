package by.andrey.twikss.exerciseencoder.service;

import by.andrey.twikss.exercisedog.service.DogDemo;
import by.andrey.twikss.exerciseencoder.bean.Encoder;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class EncoderDemo {
    private static Logger logger = LoggerFactory.getLogger(EncoderDemo.class);

    public static char encoder(Encoder encoder) {
        char encoderNumberIs = (char) encoder.getNumber();
        String textInfo = "" + encoder.getNumber() + " => " + encoderNumberIs;
        logger.info(textInfo);
        return encoderNumberIs;
    }
}
