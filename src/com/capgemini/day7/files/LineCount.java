package com.capgemini.day7.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCount {
	

	
		private static int linenumber;

		public static int countNumberOflines(String string) {
			

			try {
				File file =new File("C:\\Naina\\naveena.txt");
				if(file.exists()) {
					
					FileReader fr = new FileReader(file);
					LineNumberReader lnr = new LineNumberReader(fr);
					int linenumber = 0;
					
					while(lnr.readLine() != null) {
						linenumber++;
					}
				
					System.out.println("Total number of lines: " +linenumber);
					lnr.close();
				
			}
				else
				{
					System.out.println("File dose not exists");
				}
			}
				catch(IOException e) {
					e.printStackTrace();
				}
		
			return 0;
		}

}

