package by.andrey.twikss.exercisehuman.service;

import by.andrey.twikss.exercisehuman.bean.Human;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class HumanDemo {
    private static Logger logger = LoggerFactory.getLogger(HumanDemo.class);

    private HumanDemo() {
    }

    public static String greet(Human human) {
        String greeting = "Hi! My name is " + human.getName() + ", I`m " + human.getAge() + " years old";
        logger.info(greeting);
        return greeting;
    }
}
