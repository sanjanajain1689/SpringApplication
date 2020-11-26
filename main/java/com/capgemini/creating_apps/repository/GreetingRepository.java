package com.capgemini.creating_apps.repository;


import com.capgemini.creating_apps.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> {

}