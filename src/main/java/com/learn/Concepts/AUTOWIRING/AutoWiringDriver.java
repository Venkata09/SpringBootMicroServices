package com.learn.Concepts.AUTOWIRING;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author vdokku
 */
public class AutoWiringDriver {

    private static ApplicationContext context;
    private static Traveler firstTraveler, secondTraveler, thirdTraveler, fourthTraveler;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("src\\main\\resources\\AutowireByType\\Beans.xml");

        firstTraveler = (Traveler) context.getBean("theFirstTraveler");
        System.out.println(firstTraveler);
        firstTraveler.showCar();
        firstTraveler.startJounery();
        System.out.println("============================================================");

        secondTraveler = (Traveler) context.getBean("theSecondTraveler");
        System.out.println(secondTraveler);
        secondTraveler.showCar();
        secondTraveler.startJounery();
        System.out.println("============================================================");

        thirdTraveler = (Traveler) context.getBean("theThirdTraveler");
        System.out.println(thirdTraveler);
        thirdTraveler.showCar();
        thirdTraveler.startJounery();
        System.out.println("============================================================");

        fourthTraveler = (Traveler) context.getBean("theFourthTraveler");
        System.out.println(fourthTraveler);
        fourthTraveler.showCar();
        fourthTraveler.startJounery();
        System.out.println("============================================================");

    }


}
