package com.learn.Concepts.DI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author vdokku
 */
public class IngectionApp {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("C:\\Venkat_DO\\SpringBootMicroServices\\src\\main\\resources\\SpringInjection\\autowireBean.xml");
        Vehicle carMercy = (Vehicle) context.getBean("TheMercedes");
        Vehicle carBmw = (Vehicle) context.getBean("TheBmw");

        System.out.println(carMercy);
        carMercy.move();
        System.out.println("-----------------------------------------------------------------");
        System.out.println(carBmw);
        carBmw.move();
    }

}
