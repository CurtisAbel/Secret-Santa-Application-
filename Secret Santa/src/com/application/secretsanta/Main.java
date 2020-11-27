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
		printSecretSantaList(originalList, randomList);
	}
	
	/**
	 * prints secret santa list
	 * assigns each person a secret santa
	 * uses two lists. Assigns people in random lists to people in original list
	 * @param originalList
	 * @param randomList
	 */
	
	public static void printSecretSantaList(List<Person>originalList, List<Person>randomList) {
		
		Collections.shuffle(randomList);
		
		for(int i =0; i<originalList.size() && i<randomList.size();i++) {
				
			
			System.out.println( originalList.get(i).getName() + "'s secret santa is... " + randomList.get(i).getName());
			
			
		}
		
		
	}

}
