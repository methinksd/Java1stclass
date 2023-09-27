package net.javacode;

import java.util.Scanner;

public class marklist {

	public static void main(String[] args) {
		Scanner name= new Scanner(System.in);
		Scanner mark= new Scanner(System.in);
		
		
		String [] Name= new String[4];
		int [][] scores=new int[4][3];
		int [] total = new int[4];
		String Grade = "";
		String hasPassed="";
		float ave;
		float average[]= new float[4];
		
		
		System.out.print("Enter name:");
		for(int i=0; i<4; i++) {
		Name[i] = name.nextLine();	
		}
		
		for( int i=0; i<4; i++) { 
		System.out.print("Enter marks for student :"+i);
		for(int j=0; j<12; j++) {
		scores[i][j] = mark.nextInt();
		total[i]+=scores[i][j];
		}
		average[i] =total[i]/3;
	}	
		
		for(int k=0;k<4; k++) {
		  if(average[k]>=80 && average[k]<=100) {
		    	hasPassed ="P";
		    	Grade ="A";
		    }else if(average[k]>=75) {
		    	hasPassed ="P";
		    	Grade ="B+";
		    }else if(average[k]>=65) {
		    	hasPassed ="P";
		    	Grade ="B";
		    }else if(average[k]>=55) {
		    	hasPassed ="P";
		    	Grade ="C+";
		    }else if(average[k]>=50) {
		    	hasPassed ="P";
		    	Grade ="C";
		    }else if(average[k]>=40){
		    	hasPassed ="P";
		    	Grade ="D";
		    }else {
		    	System.out.println("F");
		    }
		}
		
	System.out.println("********************************************************************************************************");
	System.out.println("\t\t\t\t\tSTUDDENT MARKLIST");
	System.out.println("********************************************************************************************************");
	System.out.println("ROLL\tNAME\t\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\t\tAverage\t\tGRADE");
	
	System.out.println("101\t"+Name[0]+"\t\t"+scores[0][0]+"\t"+scores[0][1]+"\t"+scores[0][2]+"\t"+total[0]+"\t"+hasPassed+"\t"+average[0]+"\t"+Grade);
	System.out.println("101\t"+Name[1]+"\t\t"+scores[1][0]+"\t"+scores[1][1]+"\t"+scores[1][2]+"\t"+total[1]+"\t"+hasPassed+"\t"+average[1]+"\t"+Grade);
	System.out.println("101\t"+Name[2]+"\t\t"+scores[2][0]+"\t"+scores[1][1]+"\t"+scores[2][2]+"\t"+total[2]+"\t"+hasPassed+"\t"+average[2]+"\t"+Grade);
	System.out.println("101\t"+Name[3]+"\t\t"+scores[3][0]+"\t"+scores[1][1]+"\t"+scores[3][2]+"\t"+total[3]+"\t"+hasPassed+"\t"+average[3]+"\t"+Grade);
	
	
	

	}

}
