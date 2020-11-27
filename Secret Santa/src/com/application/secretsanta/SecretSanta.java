package com.application.secretsanta;

import java.util.*;

public class SecretSanta  {
	private Person person;
	private List<Person> peopleForSecretSanta;

	public SecretSanta() {
		super();
		this.peopleForSecretSanta = new ArrayList<Person>();
	}

	public List<Person> getPeopleForSecretSanta() {
		return peopleForSecretSanta;
	}
	
	//adding people to secret santa list.
	public boolean addPersonToList(Person person) {
		if(!peopleForSecretSanta.contains(person)) {
		peopleForSecretSanta.add(person);
		
		return true;
	}else {
		
		System.out.println("Person already exists in list");
		return false;
	}

	

}
}
