package com.learn.AKKA_WithSpring.actors;

import akka.actor.UntypedAbstractActor;
import com.learn.AKKA_WithSpring.messages.LineProcessingResult;
import com.learn.AKKA_WithSpring.messages.LogLineMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author vdokku
 */


@Component("logLineProcessor")
@Scope("prototype")
public class LogLineProcessor extends UntypedAbstractActor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof LogLineMessage) {
            // What data does each actor process?
//            logger.info("Line: " + ((LogLineMessage) message).getData());
            // Uncomment this line to see the thread number and the actor name relationship
//            logger.info("Thread ["+Thread.currentThread().getId()+"] handling ["+ getSelf().toString()+"]");

            // get the message payload, this will be just one line from the log file
            String messageData = ((LogLineMessage) message).getData();

            int idx = messageData.indexOf('-');
            if (idx != -1) {
                // get the ip address
                String ipAddress = messageData.substring(0, idx).trim();

                // tell the sender that we got a result using a new type of message
                this.getSender().tell(new LineProcessingResult(ipAddress), this.getSelf());
            }
        } else {
            // ignore any other message type
            this.unhandled(message);
        }
    }


}
