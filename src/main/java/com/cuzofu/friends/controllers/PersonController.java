package com.cuzofu.friends.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuzofu.friends.entities.Person;
import com.cuzofu.friends.repositories.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository person;

//	@RequestMapping("/save")
//	public String save() {
//		person.save(new Person("Chen", "Liang", 32, "男", "13886665321", "湖北神宜都市红花套镇渔洋溪村一组"));
//		return "success";
//	}

	@RequestMapping("/all")
	public Iterable<Person> findAll() {
		return person.findAll();
	}
}
