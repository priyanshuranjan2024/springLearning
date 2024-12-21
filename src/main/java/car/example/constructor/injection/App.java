package car.example.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //firstly import the context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");
        Car car = (Car) applicationContext.getBean("myCar");
        car.displayDetails();
    }
}
