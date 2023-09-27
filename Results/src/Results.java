import java.io.IOException;
import java.util.Scanner;
public class Results {

	public static void main(String[] args) throws IOException {
		
		Scanner scan= new Scanner(System.in);
		
		Scanner sub1= new Scanner(System.in);
		Scanner sub2= new Scanner(System.in);
		Scanner sub3= new Scanner(System.in);
		Scanner sub4= new Scanner(System.in);
		Scanner unit1= new Scanner(System.in);
		Scanner unit2= new Scanner(System.in);
		Scanner unit3= new Scanner(System.in);
		Scanner unit4= new Scanner(System.in);
		
		String units1;
		String units2;
		String units3;
		String units4;
		int score1=0;
		int score2=0;
		int score3=0;
		int score4=0;
		int total=0;
		float average=0;
	
		System.out.println("\t\t\t\t\tDepartment Of Computer Science");
		System.out.println("\t\t\t\t\t\tEnd Semester Results");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.print("|Name:-Leo chege Ng'ang'a");
		System.out.print("\t\t|Roll_No:-C026-01-0912/2022");
	    System.out.println("\t\tSemester:2nd");
	    System.out.println("_______________________________________________________________________________________________________");
	    System.out.print("|Unit Code");
	    System.out.print("\t\t\t\t|Unit Name");
	    System.out.println("\t\t\t\tScore");
	    System.out.println("-------------------------------------------------------------------------------------------------------");
	    System.out.print("|");
	    units1=unit1.next();
	    System.in.skip(System.in.available());
	    System.out.print("\t\t\t\t\t|Database\t\t\t\t");
	    System.out.print("|");
	    score1=sub1.nextInt();
	    System.out.print("|");
	    units2=unit2.next();
	    System.in.skip(System.in.available());
	    System.out.print("\t\t\t\t\t|Systems\t\t\t\t");
	    System.out.print("|");
	    score2=sub2.nextInt();
	    System.out.print("|");
	    units3=unit3.next();
	    System.in.skip(System.in.available());
	    System.out.print("\t\t\t\t\t|Algorithm\t\t\t\t");
	    System.out.print("|");
	    score3=sub3.nextInt();
	    System.out.print("|");
	    units4=unit4.next();
	    System.in.skip(System.in.available());
	    System.out.print("\t\t\t\t\t|Statistics\t\t\t\t");
	    System.out.print("|");
	    score4=sub4.nextInt();
	    System.out.println("-------------------------------------------------------------------------------------------------------");
	    total=score1+score2+score3+score4;
	    System.out.print("|Total\t\t\t\t\t\t\t\t\t\t");
	    System.out.println("|"+total);
	    System.out.println("-------------------------------------------------------------------------------------------------------");
	    average=total/4;
	    System.out.print("|Average\t\t\t\t\t\t\t\t\t");
	    System.out.println("|"+average);
	    System.out.println("-------------------------------------------------------------------------------------------------------");
	    System.out.print("|Grade\t\t\t\t\t\t\t\t\t\t|");
	    if(average>=70 && average<=100) {
	    	System.out.println("A");
	    }else if(average>=60) {
	    	System.out.println("B");
	    }else if(average>=50) {
	    	System.out.println("C");
	    }else if(average>=40) {
	    	System.out.println("D");
	    }else {
	    	System.out.println("F");
	    }
	    
	    System.out.println("-------------------------------------------------------------------------------------------------------");
	    System.out.println("\t\t\t\t\t\t\t\tRecommendation\t|");
	    System.out.println("-------------------------------------------------------------------------------------------------------");
	    System.out.println("Grading Criteria\t\tOverall Grade(A-D)\t\t Recommend Pass");
	    System.out.println("70-100 \t\t A");
		System.out.println("60-69 \t\t B");
		System.out.println("50-59 \t\t C");
		System.out.println("40-49 \t\t D");
		System.out.println("Below 40\t F");
		System.out.println("-------------------------------------------------------------------------");  
	}

}
