package com.company.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		Map<String, Integer> tempExits = new HashMap<>();
		locations.put(0, new Location(0, "You are in your room learning java.",tempExits));
	    tempExits = new HashMap<>();
		tempExits.put("N",5);
		tempExits.put("W",2);
		tempExits.put("E",3);
		tempExits.put("S",4);
		locations.put(1, new Location(1, "You are standing at the end of the road.",tempExits));
		
		tempExits = new HashMap<>();
		tempExits.put("N",5);
		locations.put(2, new Location(2, "You are at the top of the hill.",tempExits));
		
		tempExits = new HashMap<>();
		tempExits.put("W",1);
		locations.put(3, new Location(3, "You are inside a building.",tempExits));
		
		tempExits = new HashMap<>();
		tempExits.put("W",2);
		tempExits.put("N",1);
		locations.put(4, new Location(4, "You are in a valley beside a stream.",tempExits));
		
		tempExits = new HashMap<>();
		tempExits.put("W",2);
		tempExits.put("S",1);
		locations.put(5, new Location(5, "You are inside a forest.",tempExits));
		
		Map<String, String> vocabulary = new HashMap<>();
		vocabulary.put("WEST", "W");
		vocabulary.put("EAST", "E");
		vocabulary.put("NORTH", "N");
		vocabulary.put("SOUTH", "S");
		vocabulary.put("QUIT", "Q");

	    int loc = 1;
	    while(true){
            System.out.println(locations.get(loc).getDescription());
	        if(loc == 0){
	            break;
            }
	        Map<String, Integer> exits = locations.get(loc).getExits();
			System.out.print("Available exits are: ");
	        for(String exit: exits.keySet()){
				System.out.print(exit+"  ");
			}
			System.out.println();
	        String direction = scanner.nextLine().toUpperCase();
			if(direction.length() > 1){
				String[] statement = direction.split(" ");
				for(String word: statement) {
					if(vocabulary.containsKey(word)){
						direction = vocabulary.get(word);
						break;
					}
				}
			}
	        if(exits.containsKey(direction)){
	        	loc = exits.get(direction);
			}else {
				System.out.println("You cannot go in that direction.");
			}
	        if(!locations.containsKey(loc)){
                System.out.println("You cannot go in that direction.");
            }
        }
    }
}
