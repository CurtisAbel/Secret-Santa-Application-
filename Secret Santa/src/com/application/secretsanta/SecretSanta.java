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

	/**
	 * prints secret santa list
	 * assigns each person a secret santa
	 * uses two lists. Assigns people in random lists to people in original list
	 * @param originalList
	 * @param randomList
	 */
	public  void printSecretSantaList(List<Person>originalList, List<Person>randomList) {
		
		Collections.shuffle(randomList);
		
		for(int i =0; i<originalList.size() && i<randomList.size();i++) {
				
			
			System.out.println( originalList.get(i).getName() + "'s secret santa is... " + randomList.get(i).getName());
			
			
		}
}
}
