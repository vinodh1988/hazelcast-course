package com.solution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solution.entities.Person;

public interface PeopleRepository extends JpaRepository<Person, Long>{
  public Person findBySno(int sno);
}
