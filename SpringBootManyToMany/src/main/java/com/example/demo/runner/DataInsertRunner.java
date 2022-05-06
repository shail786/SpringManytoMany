package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Person;
import com.example.demo.model.Profile;
import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.ProfileRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

		@Autowired
		private ProfileRepository prRepo;
		
		@Autowired
		private PersonRepository peRepo;
		
	@Override
	public void run(String... args) throws Exception {
		
		
		Profile p1 = new Profile(50, "p50", "Pancard", 2362, "hyd");
		prRepo.save(p1);
		
		Person pe1=new Person(1501, "Shail", "A", "552522", "male", p1);
		peRepo.save(pe1);

	}

}
