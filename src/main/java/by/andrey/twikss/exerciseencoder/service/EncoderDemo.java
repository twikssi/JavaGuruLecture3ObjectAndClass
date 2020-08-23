package by.andrey.twikss.exerciseencoder.service;

import by.andrey.twikss.exerciseencoder.bean.Encoder;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class EncoderDemo {
    private static Logger logger = LoggerFactory.getLogger(EncoderDemo.class);

    private EncoderDemo() {
    }

    public static char encoder(Encoder encoder) {
        char encoderNumberIs = (char) encoder.getNumber();
        String textInfo = "" + encoder.getNumber() + " => " + encoderNumberIs;
        logger.info(textInfo);
        return encoderNumberIs;
    }

    public static int decode(Encoder encoder) {
        int decodeNumberIs = (int) encoder.getSymbol();
        String textInfo = "" + encoder.getSymbol() + " => " + decodeNumberIs;
        logger.info(textInfo);
        return decodeNumberIs;
    }
}
