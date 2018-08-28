package com.learn.Akka_Tuts;


import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.learn.Akka_Tuts.actors.MasterActor;

/**
 * @author vdokku
 */
public class EmployeeDriver {


    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create("actor-path-selection");

        LoggingAdapter logger = Logging.getLogger(system, "system-logger");

        ActorRef master = system.actorOf(Props.create(MasterActor.class), "master-actor");
        logger.info("Master Actor path {} : " + master.path().toString());

        master.tell("Master Actor Started", ActorRef.noSender());

        master.tell(DummyData.getEmployeeDetails(), ActorRef.noSender());

        ActorSelection sendMsgRef = system.actorSelection("/user/send-msg-actor");

        sendMsgRef.tell("Actor Selection concept done!", ActorRef.noSender());

        system.terminate();
    }
}
