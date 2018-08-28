package com.learn.AKKA_MapReduce;


import java.util.concurrent.TimeUnit;

import com.learn.AKKA_MapReduce.actors.MasterActor;
import com.learn.AKKA_MapReduce.messages.Result;
import scala.concurrent.duration.Duration;
import scala.concurrent.Future;
import scala.concurrent.Await;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.util.Timeout;
import akka.pattern.Patterns;

/**
 * @author vdokku
 */
public class Driver {

    public static void main(String[] args) throws Exception {
        Timeout timeout = new Timeout(Duration.create(5, TimeUnit.SECONDS));
        ActorSystem _system = ActorSystem.create("MapReduceApp");
        ActorRef master = _system.actorOf(Props.create(MasterActor.class), "master");

        master.tell("The quick brown fox tried to jump over the lazy dog and fell on the dog", master);
        master.tell("The quick brown fox tried to jump over the lazy dog and fell on the dog", master);
        master.tell("Dog is man's best friend", master);
        master.tell("Dog and Fox belong to the same family", master);

        Thread.sleep(5000);
        Future<Object> future = Patterns.ask(master, new Result(), timeout);
        String result = (String) Await.result(future, timeout.duration());
        System.out.println(result);
        _system.terminate();
    }

}
