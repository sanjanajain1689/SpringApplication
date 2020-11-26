package com.capgemini.creating_apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreatingAppsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreatingAppsApplication.class, args);
    }

}


//curl -X PUT -H "Content-Type: application/json" -d '{"firstName":"Abhinav","lastName":"Thakur"}' "http://localhost:8080/hello/put/{Abhinav}"
//curl -X PUT "http://localhost:8080/hello/put/Abhinav?lastName=Thakur"