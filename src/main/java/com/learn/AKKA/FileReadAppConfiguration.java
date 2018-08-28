package com.learn.AKKA_WithSpring;

import akka.actor.ActorSystem;
import com.learn.AKKA_WithSpring.Spring_Specifics.SpringExtension;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vdokku
 */

@Configuration
public class FileReadAppConfiguration {

    @Autowired
    private ApplicationContext applicationContext;


    @Autowired
    private SpringExtension springExtension;


    @Bean
    public ActorSystem actorSystem() {
        /* You can either APPLY of CREATE in the ACTOR System. */
        ActorSystem actorSystem = ActorSystem.create("akkaSystem", akkaConfiguration());
        /* Initialize the APPLICATION Context and return the actor. */
        springExtension.initialize(applicationContext);
        return actorSystem;

    }


    @Bean
    public Config akkaConfiguration() {
        return ConfigFactory.load();
    }

}
