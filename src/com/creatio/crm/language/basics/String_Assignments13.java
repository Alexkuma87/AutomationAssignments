package com.creatio.crm.language.basics;

public class String_Assignments13 {

	public static void main(String[] args) {

		System.out.println("*********Total Number Of Words***********");

		String sentance = "Java programming is fun and challenging";
		String[] count;

		count = sentance.split(" ");

		int wordsCount = count.length;

		System.out.println("Number of words in the sentance:"+ wordsCount);


		System.out.println("*********String Reverse Order***********");


		String  reverseWord="";

		for (String word : count) {

			for(int i=word.length()-1; i>=0; i--) {
				reverseWord+=word.charAt(i);
			}
			reverseWord+=" ";

		}


		System.out.println("Words in Reverse Order :"+reverseWord);	

		System.out.println("*********String Convert Into Uppercase***********");	

		String reqString ="";

		for(int i=0;i<count.length; i++) {

			char words = count[i].charAt(0);
			String upperCase= String.valueOf(words).toUpperCase();
			String sub=count[i].substring(1);
			reqString = reqString+upperCase+sub+ " ";


		}
		System.out.print(reqString);
		System.out.println();

		System.out.println("*********Occurrences***********");

		String paragraph ="Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		String targetWord = "Java";

		int count1=0;

		paragraph = paragraph.toLowerCase();
		targetWord = targetWord.toLowerCase();

		String[] c = paragraph.split(" ");

		for (String word : c) {
			if(word.equals(targetWord)) {
				count1++;
			}
			System.out.println(word);
		}

		System.out.println("The word " +targetWord+ " appears " +count1+ " times.");
			



	}




}


