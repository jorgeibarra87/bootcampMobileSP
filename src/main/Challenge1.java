package main;

import java.util.Random;
import java.util.Scanner;

public class Challenge1 {
	
	Scanner entry = new Scanner(System.in);
	static int numbers[]= new int[10];
	static String stringNumbers="";
	double promedio=0;
	
	public static String stringRandom(String typeString) {
		if(typeString == "TipoA") {
			Random myRandom = new Random();
			for(int i=0;i<10;i++) {
				numbers[i]=myRandom.nextInt(9);
			}
			numbers[0]=5;
			numbers[1]=4;
			for(int i=0;i<10;i++) {
				stringNumbers+=Integer.toString(numbers[i]);
			}
		} 
		return stringNumbers;
	}

	public static void main(String[] args) {
		
				
		
		System.out.println(stringRandom("TipoA"));

	}

}
