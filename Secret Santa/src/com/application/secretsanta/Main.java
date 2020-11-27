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
		
		//creating list 
		SecretSanta list = new SecretSanta();
		
		//adding person objects to list
		list.addPersonToList(jacob);
		list.addPersonToList(nelson);
		list.addPersonToList(beatrice);
		list.addPersonToList(montel);
		list.addPersonToList(daniel);
		
		//Creating list of original list and random list.
		List<Person> originalList = new ArrayList<>(list.getPeopleForSecretSanta());
		List<Person> randomList =  new ArrayList<>(list.getPeopleForSecretSanta());
		
		
		printSecretSantaList(originalList, randomList);
	}
	
	/**
	 * prints secret santa list
	 * assigns each person a secret santa
	 * uses two lists
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
