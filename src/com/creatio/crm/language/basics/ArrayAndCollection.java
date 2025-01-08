package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayAndCollection {

	public static void main(String[] args) {
		
		List<String> countryName = new ArrayList<String>();
		
		countryName.add("USA");
		countryName.add("China");
		countryName.add("Russia");
		countryName.add("Canada");
		countryName.add("Australia");
		
		System.out.println("The Top Second Country is :"+countryName.get(1));
		
		Set<String> touristPlace = new HashSet<String>();
		
		touristPlace.add("Paris");
		touristPlace.add("London");
		touristPlace.add("Istanbul");
		touristPlace.add("Sydney");
		touristPlace.add("Rome");
		touristPlace.add("Bankok");
		touristPlace.add("Barcelona");
		touristPlace.add("Colosseum");
		touristPlace.add("Eiffel Tower");
		touristPlace.add("Maldives");
		
		System.out.println(touristPlace.size());
		
		Map<String, Integer> largestCity = new HashMap<String, Integer>();
		
		largestCity.put("Los Angeles", 3898747);
		largestCity.put("Chicago", 2746388);
		largestCity.put("Houston", 2304580);
		largestCity.put("Phoenix", 1608139);
		largestCity.put("Philadelphia", 1603797);
		System.out.println(largestCity);
		
		int [] randomValue = new int[10];
		
		int sum=0;
		
		randomValue[0] = 112;
		randomValue[1] = 213;
		randomValue[2] = 444;
		randomValue[3] = 346;
		randomValue[4] = 229;
		randomValue[5] = 678;
		randomValue[6] = 567;
		randomValue[7] = 98;
		randomValue[8] = 777;
		randomValue[9] = 435;
		
		System.out.println(" Sum of 3rd & 5th Value is : "+(sum=randomValue[3]+randomValue[5]));
		
		List<String> highGrossMovies = new ArrayList<String>();
		
		highGrossMovies.add("Avatar");
		highGrossMovies.add("Avengers: Endgame");
		highGrossMovies.add("Avatar: The Way of Water");
		highGrossMovies.add("Jurassic World");
		highGrossMovies.add("Titanic");
		
		System.out.println("Highest Gross Movie :"+highGrossMovies.get(2));

	}

}
