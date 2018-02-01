package com.learn.reactive.Functional_Reactive_EndPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.server.EntityResponse;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import reactor.core.publisher.Flux;
import reactor.ipc.netty.http.server.HttpServer;

import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by vdokku on 1/22/2018.
 */

@SpringBootApplication
public class BootifulReactiveApplication {


    @Bean
    RouterFunction<?> router() {
        return RouterFunctions.route(RequestPredicates.GET("/persons"), request -> null)
                .and(RouterFunctions.route(RequestPredicates.GET("/persons/{id}"), request -> null));
    }

    @Bean
    HttpServer server(RouterFunction<?> router, ServerProperties serverProperties) {
        HttpHandler handler = RouterFunctions.toHttpHandler(router);
       /* HttpServer httpServer = HttpServer.create(serverProperties.getPort());
        */
        HttpServer httpServer = HttpServer.create(8080);
        httpServer.start(new ReactorHttpHandlerAdapter(handler));

        return httpServer;

    }

    public static void main(String[] args) {
        SpringApplication.run(BootifulReactiveApplication.class, args);
    }

}


@Component
class PersonHandler {


}


@Component
class SampleDataCLR implements CommandLineRunner {

    private final PersonRepository personRepo;

    @Autowired
    public SampleDataCLR(PersonRepository personRepository) {
        this.personRepo = personRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Ram", "Robert", "Rahim", "Amy", "Xin", "Lang", "Jeff")
                .forEach(name -> personRepo.save(new Person(name, new Random().nextInt(100))));


        personRepo.findAll().forEach(System.out::println);

    }
}


interface PersonRepository extends MongoRepository<Person, String> {

}


@Document
class Person {

    @Id
    private int personID;
    private String personName;
    private int age;


    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", personName='" + personName + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {

    }

    public Person(String personName, int age) {
        this.personName = personName;
        this.age = age;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

