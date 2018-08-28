package com.learn.Akka_Tuts.actors;


import akka.actor.AbstractActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import com.learn.Akka_Tuts.VO.Employee;

/**
 * @author vdokku
 */
public class ChildActor extends AbstractActor {

    private LoggingAdapter logger = Logging.getLogger(this);

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Employee.class, emp -> {
                    logger.info("name {} : " + emp.getName());
                })
                .build();
    }

}