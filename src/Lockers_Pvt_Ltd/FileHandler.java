package Lockers_Pvt_Ltd;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

	
	public class FileHandler implements FileManager {

		
		public void addFile(String fileName) {
			Scanner sc = new Scanner(System.in);
			String subOption = sc.next();
			String subOption1 = new String (subOption.toLowerCase());

			try {
			
				File myObj = new File("./MainFolder",subOption1);
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

	
		public void deleteFile(String fileName) {
			Scanner sc = new Scanner(System.in);
			String subOption = sc.next();
			String subOption1 = new String (subOption.toLowerCase());
			File myObj = new File("./MainFolder",subOption1); 
				
			    if (myObj.delete()) { 
			      System.out.println("Deleted  file: " + myObj.getName()+ " Successful Operation");
			    } else {
			      System.out.println("Failed to delete the file, Respect upper and lower case letters, Or File Not exist.");
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

	
		public boolean searchFile(String fileName) {
			Scanner sc = new Scanner(System.in);
			String subOption = sc.next();
			String subOption1 = new String (subOption.toLowerCase());
			File directory = new File("./MainFolder/");
			 File files = new File(subOption1);
	        // Create an object of Class MyFilenameFilter
	        // Constructor with name of file which is being
	        // searched
	        MyFilenameFilter filter
	            = new MyFilenameFilter(subOption1);
	  
	        // store all names with same name 
	        // with/without extension
	        String[] flist = directory.list(filter);
	        String[] filList = files.list(filter);
	        // Empty array
	        int flag =0;
	        if (flist == null ) {
	            System.out.println("Empty directory OR File or directory(File) does not exists.");
	        }
	        else {
	  
	            // Print all files with same name in directory2
	        	
	        	
	            // as provided in object of MyFilenameFilter
	            // class
	            for (int i = 0; i < flist.length; i++) {
	            	String filename =flist[i];
	            	if (filename.equalsIgnoreCase(subOption1)) {
	                    System.out.println(filename + " found");
	                    flag = 1;
	               
	            }
	            
	            	
	            }
	            }
	        if (flag == 0) {
	            System.out.println("File Not Found");
	        }
			
			return false;
		}


		public void main(String[] args) {
			// TODO Auto-generated method stub
			
		}


	}