package com.cuzofu.friends.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cuzofu.friends.entities.Person;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends JpaRepository<Person, Long> {

	Person findById(@Param("id") Long id);

	List<Person> findByFirstName(@Param("firstname") String firstName);

	List<Person> findByLastName(@Param("lastname") String lastName);

	List<Person> findByGender(@Param("gender") String gender);

	List<Person> findByAge(@Param("age") int age);

	List<Person> findByAddress(@Param("address") String address);

}
