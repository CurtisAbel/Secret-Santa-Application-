package com.application.secretsanta;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		//creating person objects
		Person daniel = new Person("Daniel");
		Person nelson = new Person("Nelson");
		Person beatrice = new Person ("beatrice");
		Person montel = new Person("Montel");
		Person jacob = new Person ("Jacob");
		
		//creating list object
		SecretSanta secretSantaList = new SecretSanta();
		
		//adding person objects to list
		secretSantaList.addPersonToList(jacob);
		secretSantaList.addPersonToList(nelson);
		secretSantaList.addPersonToList(beatrice);
		secretSantaList.addPersonToList(montel);
		secretSantaList.addPersonToList(daniel);
		
		//Creating two list. One original and one randomised
		List<Person> originalList = new ArrayList<>(secretSantaList.getPeopleForSecretSanta());
		List<Person> randomList =  new ArrayList<>(secretSantaList.getPeopleForSecretSanta());
		
		//prints secret santa list
		secretSantaList.printSecretSantaList(originalList, randomList);
	}
	
	


}
