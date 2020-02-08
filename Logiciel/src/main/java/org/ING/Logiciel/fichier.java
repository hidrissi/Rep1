package org.ING.Logiciel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class fichier {
	
	
	
	public void write(String path , String s) {
		BufferedWriter bw = null;
		
		 try {
			bw = new BufferedWriter(new FileWriter("myFile.txt", true));
			 bw.write(s);
			 bw.newLine();
			 bw.flush();
			 bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	
	public void read(String path) {
		 try {
		BufferedReader reader = new BufferedReader(new FileReader(path));
	    String line;
	   
			while ((line = reader.readLine()) != null)
			{
			  System.out.println(line);
			}
			 reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
	}
	
	
	
	
	

}
