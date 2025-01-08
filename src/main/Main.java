package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args){
		try {
			File file = new File("Index.html");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			writer.write("hello world");
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
