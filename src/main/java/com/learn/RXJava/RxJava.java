package com.learn.RXJava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * @author vdokku
 */


/*
RxJava works like this. Subscriber subscribes to Observable, then Observable calls Subscriber.onNext()
for any number of items, if something goes wrong here is Subsciber.onError() and if all finishes fine,
here is Subscriber.onCompleted(). You see this is easy!




 */

public class RxJava {

    public static void main(String[] args) {

    }

    private void observableExample() {


        Observable myObs = Observable.create(new ObservableOnSubscribe<Object>() {

            public void call() {

            }

            @Override
            public void subscribe(ObservableEmitter<Object> observableEmitter) throws Exception {

            }
        });


        Observable obs = Observable.just("");


        Observable myObservable = Observable.create(observableEmitter -> {
            observableEmitter.onNext("Blue Factory ");
            observableEmitter.onComplete();
        });


    }


}
