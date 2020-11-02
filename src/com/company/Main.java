package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

//1
	    String[] words = {"table", "cat", "dog", "apple", "cat", "zoom", "bag", "water", "count", "leg", "leg"};
	    HashMap<String, Integer> wds = new HashMap<>();
	    for (String x : words) {
		    wds.put(x, wds.getOrDefault(x,0)+1);
	    }
	    System.out.println(wds);

//2
	    Phonebook contact = new Phonebook();
	    contact.add("Петя", "89048883338");
	    contact.add("Лаша", "89996543728");
	    contact.add("Леша", "87774448383");
	    contact.add("Алена", "89773880383");
	    contact.add("Ваня", "89047722767");

	    contact.findPhone("Лаша");
	    contact.findPhone("Алена");
	    contact.findPhone("Ваня");

    }
}
