package com.learn.Concepts.AUTOWIRING_BY_CONSTRUCTOR;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author vdokku
 */
public class MainApp {


    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("C:\\Venkat_DO\\SpringBootMicroServices\\src\\main\\resources\\AUTOWIRING_BY_CONSTRUCTOR\\applicationContext.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");

        te.spellCheck();
    }

}
