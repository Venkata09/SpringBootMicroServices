package com.learn.Akka_Tuts.actors;

import akka.actor.AbstractActor;

/**
 * @author vdokku
 */
public class SendMsgActor extends AbstractActor{

    @Override
    public AbstractActor.Receive createReceive() {

        return receiveBuilder()
                .match(String.class, msg -> {
                    System.out.println(msg);
                })
                .build();
    }

}