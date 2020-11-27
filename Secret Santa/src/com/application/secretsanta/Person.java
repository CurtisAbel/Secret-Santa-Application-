package com.application.secretsanta;

public class Person implements Comparable<Person> {
private String name;

public Person(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

@Override
public int compareTo(Person person) {
	// TODO Auto-generated method stub
	return this.name.compareToIgnoreCase(person.getName());
}



}
