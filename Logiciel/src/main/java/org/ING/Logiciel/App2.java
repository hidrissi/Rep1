package org.ING.Logiciel;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		
        String path = "myFile.txt";
        int ch =0;
        
        fichier f = new fichier();
        
        Scanner sc = new Scanner(System.in);
        
        while(ch !=3) {
        System.out.println(" ");
		System.out.println(" *************************");
		System.out.println(" ******  Menu File  ******");
		System.out.println(" 1 -  Write ");
		System.out.println(" 2 -  Read ");
		System.out.println(" 3 -  Exit ");
        
		System.out.println(" ");
		System.out.println(" Choose : ");
		ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println(" ");
			System.out.println(" Please Write in the file :");
			String text = sc.next();
			System.out.println(" text := " + text);
		    f.write(path, text);
		    break;
		    
		case 2:
			System.out.println(" ");
			System.out.println(" File Content ::::: ");
			f.read(path);
			break;
			
		case 3:
			break;
		}
		
        }
        
        
        

	}

}
