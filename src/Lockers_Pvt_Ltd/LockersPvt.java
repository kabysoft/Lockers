package Lockers_Pvt_Ltd;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;

public class LockersPvt {
	static FileHandler fm = new FileHandler();
	public static void main(String[] args) throws SecurityException, IOException {
		System.out.println("===============================================================================");
		System.out.println("/////////////////   Welcome to Company LOCKERS  Pvt. Ltd ! ////////////////////");
		System.out.println("----------------  Application Name : Lockers Degital  V B1.1 ------------------");
		System.out.println("===============================================================================");
		System.out.println("====================================");
		System.out.println("||Developer Name: SALAH BOUTEMEUR ||");
		System.out.println("====================================");
		;
		System.out.println("!");
		System.out.println("! ");
		
		System.out.println("Please Enter one of below options:");
		
		while (true) {
			String mainMenuOptons = mainMenuOptions();
			System.out.println(mainMenuOptons);
			int mainSelection = new Scanner(System.in).nextInt();
			try {
			switch (mainSelection) {

			case 1:
				// logic to invoke for list files
				
				List<String> fileNames = fm.listFiles();
			
				System.out.println("=======================================");
				System.out.println("Navigation Main Menu Below To Continue");
				System.out.println("=======================================");
				break;

			case 2:
				// logic to invoke for detailed options
				executeDetailedOptions(fm);
				break;

			case 3:
				// Break program and close application
				System.out.println("=======================================");
				System.out.println("||   APPLICATION  CLOSED BY USER      ||");
				System.out.println("=======================================");
				System.exit(0);
				break;

			default:
				System.out.println("Please select one of valid option");
				//System.exit(0);

			}
			}
			catch(Exception e) {
		         // if any error occurs
		         e.printStackTrace();
			}
		}
			}
	
	private static void executeDetailedOptions(FileHandler fm) throws SecurityException, IOException {
		FileHandler add = new  FileHandler();
		while (true) {
			String detailedOption = detailedMenuOptions();
			System.out.println(detailedOption);

			Scanner sc = new Scanner(System.in);
			String subOption = sc.next();

			if ("2.1".equals(subOption)) {
				System.out.println("Input File Name to Add");
				fm.addFile(subOption);
							
			} else if ("2.2".equals(subOption)) {
				System.out.println("Input File To Delete");
				fm.deleteFile(subOption);
				
			} else if ("2.3".equals(subOption)) {
				System.out.println("Input File To Search");
				fm.searchFile(subOption);
				
			
			} else if ("2.4".equals(subOption)) {
				System.out.println("=======================================");
				System.out.println("||           Main Menu               ||");
				System.out.println("=======================================");
				
				break;
			} else {
				System.out.println("Invalido Option : Please select again");
			}
		}
	}

	private static String detailedMenuOptions() {
		StringBuilder sb = new StringBuilder();
		System.out.println("========================================================");
    	System.out.println("||*******      Detailed Options      *******           ||");
    	System.out.println("=========================================================");
		sb.append("2.1. Add File \n");
		sb.append("2.2. Delete File \n");
		sb.append("2.3. Search File \n");
		sb.append("2.4. Return Main Menu \n");
		return sb.toString();
	}

	private static String mainMenuOptions() {
		StringBuilder sb = new StringBuilder();
		System.out.println("=======================================");
		System.out.println("||           Main Menu               ||");
		System.out.println("=======================================");
		sb.append("1. List All Files \n");
		sb.append("2. Detailed Options \n");
		sb.append("3. Close Application \n");
		return sb.toString();
	}
  
	
}
