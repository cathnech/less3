package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
	HashMap<String, HashSet<String>> pb;

	public Phonebook() {
		this.pb = new HashMap<>();
	}

	public void add(String name, String phone) {
		HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
		book.add(phone);
		pb.put(name, book);
	}

	public void findPhone(String name) {
		System.out.printf("Contact: %s Phone number: %s \n"   ,name, pb.getOrDefault(name, new HashSet<>()));
	}
}
