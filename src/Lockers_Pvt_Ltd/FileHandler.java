package Lockers_Pvt_Ltd;



	import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

	/**
	 * File Handler logic implementation goes here Please complete these methods.
	 * 
	 * 
	 */
	public class FileHandler implements FileManager {

		@Override
		public void addFile(String fileName) {
			Scanner sc = new Scanner(System.in);
			String subOption = sc.next();

			try {
			
				File myObj = new File("./MainFolder",subOption);
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }

		}

		@Override
		public void deleteFile(String fileName) {
			Scanner sc = new Scanner(System.in);
			String subOption = sc.next();
			File myObj = new File("./MainFolder",subOption); 
				
			    if (myObj.delete()) { 
			      System.out.println("Deleted  file: " + myObj.getName()+ " Successful Operation");
			    } else {
			      System.out.println("Failed to delete the file, Respect upper and lower case letters, Or File Not exist");
			    } 
		}

		public List<String> listFiles() {
					
			File f = null;
		      String[] paths;
		            
		      try {    
		      
		         // create new file path
		    	  
		         f = new File("./MainFolder");
		                                 
		         // array of files and directory
		         paths = f.list();
		            
		         // for each name in the path array
		         System.out.println("========================================================");
		        	System.out.println("*******      List Of File In Main Directory      *******");
		        	 System.out.println("=========================================================");
		         for(String path:paths) {
		         
		            // prints filename and directory name
		        	 
		        	
		            System.out.println(path);
		         }
		         
		      } catch(Exception e) {
		         // if any error occurs
		         e.printStackTrace();
		      }

			return null;
		}

		@Override
		public boolean searchFile(String fileName) {

			return false;
		}

	}

