package com;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;


public class Adsde {


		public void devopdisplay() {
			
			System.out.println("Welcome Phase1 Project");
	    	System.out.println("Project on core jave by Debjani Dana");
		}	
	public void menu()
	      { 
		System.out.println("Main Menu:");
	    System.out.println("1. Add file");
	    System.out.println("2. Display file in Ascending");
	    System.out.println("3. Search file.");
	    System.out.println("4. Delete file ");
	    System.out.println("5. Exit");}
	public void addfile()  {
		try {
		Scanner sc1 = new Scanner(System.in);	
	    System.out.println("Enter the desired name of your file: ");
	           String fileName = sc1.nextLine();
	           fileName = fileName + ".txt";
	    File file = new File(fileName);
	           if (file.createNewFile()) {
	    	System.out.println("File created is created Successfully in below mwntioned path.");
	    	System.out.println(file.getCanonicalPath());
	           }
	    else {
	        System.out.println("File already exists.   "+ file.getName()); 
	         }
		}
	       catch(Exception e1)
		{
	    	   System.out.println(e1);
		
		}
		}
	public void getfile() {
		
		  File directoryPath = new File("C:/Users/Dell/eclipse-workspace/Ph2corJavapro");
	    FilenameFilter textFilefilter = new FilenameFilter(){
	       public boolean accept(File dir, String name) {
	          String lowercaseName = name.toLowerCase();
	          if (lowercaseName.endsWith(".txt")) {
	             return true;
	          } else {
	             return false;
	          }
	       }
	    };
	    //List of all the text files
	    String filesList[] = directoryPath.list(textFilefilter);
	    System.out.println("List of  files created or added:");
	    for(String fileName : filesList) {
	       System.out.println(fileName);
	    }
	}
	public void checkfile()  {   
		  
		String path ="C:/Users/Dell/eclipse-workspace/Ph2corJavapro";
	   Scanner sc2 = new Scanner(System.in) ;
			System.out.println("Enter name of  file to be searched  " );
			String name = sc2.nextLine();
			name = name + ".txt";

			File f = new File(path+"\\"+name);
			if(f.exists() && f.isFile()) { 
			    System.out.println("File is found Successfully (location/path):"+path);
			    System.out.println(name);
			  }  else {

			  System.out.println("No file with this name");
			  
			  }
		
	}
	public void deletefile() {
		
		String path ="C:/Users/Dell/eclipse-workspace/Ph2corJavapro";
	    Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter name of file to be deleted  " );
			String name1 = sc3.nextLine();
			name1 = name1 + ".txt";

			File f = new File(path+"\\"+name1);
			if(f.exists() && f.isFile()) { 
				f.delete();
			    System.out.println("Above mentioned file deleted Successfully");
			  }  else {

			  System.out.println("No file with this name to delete");}
		}
	   
		
		public  void acessmain() {
			
			java.util.Scanner userchoice=new Scanner(System.in);
			System.out.println("Main Menu:");
	        System.out.println("1. Add file");
	        System.out.println("2. Display file in Ascending");
	        System.out.println("3. Search file.");
	        System.out.println("4. Delete file ");
	        System.out.println("5. Exit");
	   	    boolean quit = false;
	   	 do {
				System.out.println("Enter your choice: ");
				int choice=userchoice.nextInt();

				switch(choice)
				{ case 1:
					
						this.addfile();
						this.menu();
			        break;
			    case 2:
			        this.getfile();
			        this.menu();
			        break;
			    case 3:
			       this.checkfile();
			       this.menu();
			        break;
			    case 4:
			       this.deletefile();
			       this.menu();
			        break;
			    case 5:
			    	System.out.println("Exit of operation");
			    	quit = true;
			    	break;
			    	default:
			    		System.out.println("Invalid Entry");}
				}while(!quit);
	   	 
		}
			
		public static void main(String args[]) {
			// TODO Auto-genera()ted method stub
			Adsde add=new Adsde();
			add.devopdisplay();
			add.acessmain();

	}

}
