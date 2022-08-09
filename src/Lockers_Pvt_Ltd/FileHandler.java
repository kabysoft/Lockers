package Lockers_Pvt_Ltd;



	import java.io.File;
import java.util.List;

	/**
	 * File Handler logic implementation goes here Please complete these methods.
	 * 
	 * 
	 */
	public class FileHandler implements FileManager {

		@Override
		public void addFile(String fileName) {
			

		}

		@Override
		public void deleteFile(String fileName) {

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

