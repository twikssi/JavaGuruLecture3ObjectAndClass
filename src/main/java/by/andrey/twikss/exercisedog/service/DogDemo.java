package by.andrey.twikss.exercisedog.service;

import by.andrey.twikss.exercisedog.bean.Dog;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class DogDemo {
    private Logger logger = LoggerFactory.getLogger(DogDemo.class);
    private Dog dog;

    public DogDemo(Dog dog) {
        this.dog = dog;
    }

        public String bark(){
        String dogBark = "Dog " + dog.getName() + " say: bau bau bau";
        logger.info(dogBark);
        return dogBark;
    }

    public String eat() {
        String eat ="Dog " + dog.getName() + " is eating nom nom nom";
        logger.info(eat);
        return eat;
    }
}
