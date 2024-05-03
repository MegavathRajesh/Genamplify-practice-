package datawrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Datawrite {

	public static void main(String[] args) throws IOException {
		 
		File f1 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Genamplify\\testdata\\test data");
		
		FileWriter flw = new FileWriter(f1);
		
		BufferedWriter ber = new BufferedWriter(flw);
		
		String data = "Today class about file data entry but we did't understand";
		
		ber.write(data);
		ber.close();

	}

}
