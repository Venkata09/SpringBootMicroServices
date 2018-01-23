package com.learn.reactive;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdokku on 1/22/2018.
 */
public class SimpleDemo {


    public static void main(String[] args) {


        Observable.just("Hello", "GoodBye")
                .subscribe(new Consumer<String>() {
                    public void accept(String sampleStr) throws Exception {
                        System.out.println("String Value:>>>>> " + sampleStr);
                    }
                });

        System.out.println("Observable with the String ");

        Observable.just("", "").subscribe(new Consumer<String>() {
            public void accept(String sampleStr) throws Exception {
                System.out.println("String Value:>>>>> " + sampleStr);
            }
        });


        System.out.println("<<<<<<<<<< Observable with a String using the Lambda >>>>>>>>>>> ");

        Observable.just("item3", "item4", "item4")
                .subscribe(str -> System.out.println(str));


        System.out.println("<<<<<<<<<< Observable with a String using a List of Items >>>>>>>>>>> ");

        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("Hello");
        listOfStrings.add("World");
        listOfStrings.add("is ");
        listOfStrings.add("Boring ");
        listOfStrings.add("Without ");
        listOfStrings.add("the ");
        listOfStrings.add("need to Java");
        listOfStrings.add("Hence Spark A-rise");

        /*

        JUST lo strings pedutunnam kabatti ... you getting string in the subscribe..


        * */

        Observable.just(listOfStrings).subscribe(new Consumer<List<String>>() {
            @Override
            public void accept(List<String> strings) throws Exception {
                strings.forEach(entry -> System.out.println("Entry :>>> " + entry));
            }
        });


        /**

         It doesn't  matter what the input string you are passing, after passing


         */


        Observable.just(listOfStrings).subscribe(strings ->
                strings.forEach(entry -> System.out.println("Entry :>>> " + entry)));


        List<String> iamAFanOfSpark = new ArrayList<>();

        iamAFanOfSpark.add("I ");
        iamAFanOfSpark.add("Am ");
        iamAFanOfSpark.add("a ");
        iamAFanOfSpark.add("Fan  ");
        iamAFanOfSpark.add("Of Spark ");


        Observable.fromIterable(iamAFanOfSpark).subscribe(entry -> System.out.println(" I am printing the Entries " +
                "here --->" + entry));


        Observable.fromIterable(iamAFanOfSpark).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println(" On onSubscribe ");
            }

            @Override
            public void onNext(String s) {
                System.out.println(" On onNext ");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(" On onError ");
            }

            @Override
            public void onComplete() {
                System.out.println(" On Complete ");
            }
        });


    }
}
