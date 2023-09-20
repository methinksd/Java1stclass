

		import java.util.Scanner;

		public class payroll {

			public static void main(String[] args) {
				Scanner employeeNo= new Scanner(System.in);
				Scanner employeeName= new Scanner(System.in);
				Scanner designation=new Scanner(System.in);
				Scanner daysWorked= new Scanner(System.in);
				Scanner payRate= new Scanner(System.in);
				Scanner genDate= new Scanner(System.in);
				
				int no;
				String name;
				String deag;
				int days;
				int rate;
				String date;
				
				
				System.out.println("ENTER THE EMPLOYEE DATA:");
				System.out.println("ENTER THE EMPLOYEE NAME: ");
				name= employeeName.nextLine();
				System.out.print("ENTER THE EMPLOYEE DESIGNATION:");
				deag= designation.nextLine();
				System.out.print("ENTER THE DAYS WORKED:");
				days= daysWorked.nextInt();
				System.out.print("ENTER PAY RATE:");
				rate= payRate.nextInt();
				System.out.print("ENTER GENERATIVE DATE:");
				date= genDate.nextLine();
				System.out.print("\n");
				
				
				
			int basicPay = days+rate;
			int grossEarnings = basicPay;
			int pf = basicPay/10;
			double profTax = 0.2*basicPay;
			double deduct = pf + profTax;
			double netPay = basicPay - deduct;
			System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP:");
			no= employeeNo.nextInt();
			
			System.out.println("\t\t\tSHREE KRISHNA CHEMISTS AND DRUGGIST");
			System.out.println("\t\t\t\tSALARY MONTH 9 2013");
			System.out.println("EMP.NO.: "+ no +"\t\tEMP.NAME: "+name +"\t\tDESIGNATION:"+deag);
			
			
			System.out.println("DAY5 WORKED: "+days + "\t\tPAY RATE: "+ rate +"\t\t\tGEN.DATE:"+ date);
			System.out.println("__________________________________________________________________________");
			System.out.println("EARNINGS\t AMOUNT(RS.)\t\t DEDUCTIONS\t AMOUNT(RS.)");
			System.out.println("__________________________________________________________________________");
			System.out.println("BASIC PAY\t "+ basicPay+ "\t\t\t"+ " P.F\t\t" + pf);
			System.out.println("\t\t\t\t\t PROF.TAX\t "+(int)profTax);
			
			System.out.println("__________________________________________________________________________");
			System.out.println("GROSS EARN.\t"+ grossEarnings+ "\t\t\t"+"TOTAL DEDUCT.\t"+(int)deduct);
			System.out.println("\t\t\t\t\t NXY PAY\t" + (int)netPay);
			
			System.out.println("__________________________________________________________________________");
			
			
			
			
			

			}

		}
		
		
	


