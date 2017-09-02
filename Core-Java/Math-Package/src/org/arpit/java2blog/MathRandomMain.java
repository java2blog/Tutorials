package org.arpit.java2blog;

import java.util.Random;

public class MathRandomMain {

	public static void main(String[] args) {
		
		System.out.println("Math's random method output");
		for (int i = 1; i < 10; i++) {
			System.out.print(" "+Math.random());
		}
		
		System.out.println("Generating random number from 1 to 10");
		for (int i = 1; i < 10; i++) {
			System.out.print(" "+getRandomInteger(1,10));
		}
		
		System.out.println();
		System.out.println("Generating random number using Random's nextInt");
		Random random=new Random();
		for (int i = 1; i < 10; i++) {
			System.out.print(" "+random.nextInt(10));
		}
	}

	/* * returns random integer between minimum and maximum range */ 
	public static int getRandomInteger(int minimum, int maximum){
		return ((int) (Math.random()*(maximum - minimum))) + minimum; 
	}
}
