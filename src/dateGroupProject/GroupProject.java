package dateGroupProject;
import java.util.Scanner;

public class GroupProject {

	static public void main(String args[])
	{
		int day1,day2,month1,month2,year1,year2,daysInMonth1 = 0,daysInMonth2 = 0,dateDifference;
		double daysInYear1,daysInYear2,totalDays1,totalDays2;
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.println("Enter a valid day: ");
			day1 = reader.nextInt();
		}while(day1 < 1 || day1 > 31);
		
		do {
			System.out.println("Enter a  valid month: ");
			month1 = reader.nextInt();
		}while(month1 < 1 ||  month1 >12);
		
		do {
			System.out.println("Enter a year starting from 1752: ");
			year1 = reader.nextInt();
		}while((year1 <= 1752) );
		
		do {
			System.out.println("Enter a 2nd valid day: ");
			day2 = reader.nextInt();
		}while(day2 < 1 || day2 > 31);
			
		do {
			System.out.println("Enter a 2nd valid month: ");
			month2 = reader.nextInt();
		}while(month2 < 1 ||  month2 >12);
			
		do {
			System.out.println("Enter a 2nd year starting from 1752: ");
			year2 = reader.nextInt();
		}while((year2 <= 1752) );
		// inputs for the dates
		// this will work for all dates from 14/09/1752, the date Gregorian calendar was adopted by UK
		
		switch (month1) {
		case 1:
			daysInMonth1 = 0;
			// January
			break;
		case 2:
			daysInMonth1 = 31;
			// February
			break;
		case 3:
			daysInMonth1 = 31 + 28;
			// March
			break;
		case 4:
			daysInMonth1 = 31 + 28 + 31;
			//April
			break;
		case 5: 
			daysInMonth1 =  31 + 28 + 31 + 30;
			// May
			break;
		case 6:
			daysInMonth1 = 31 + 28 + 31 + 30 + 31;
			break;
			// June
		case 7: 
			daysInMonth1 = 31 + 28 + 31 + 30 + 31 + 30;
			break;
			// July
		case 8:
			daysInMonth1 = 31 + 28 + 31 + 30 + 31 + 30 + 31;
			break;
			// August
		case 9:
			daysInMonth1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			// September 
			break;
		case 10:
			daysInMonth1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			// October
			break;
		case 11:
			daysInMonth1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
			//November
		case 12:
			daysInMonth1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			break;
			//December
		default:
			System.out.println("please enter a valid month");
			break;
		}
		
		switch (month2) {
		case 1:
			daysInMonth2 = 0;
			// January
			break;
		case 2:
			daysInMonth2 = 31;
			// February
			break;
		case 3:
			daysInMonth2 = 31 + 28;
			// March
			break;
		case 4:
			daysInMonth2 = 31 + 28 + 31;
			//April
			break;
		case 5: 
			daysInMonth2 =  31 + 28 + 31 + 30;
			// May
			break;
		case 6:
			daysInMonth2 = 31 + 28 + 31 + 30 + 31;
			break;
			// June
		case 7: 
			daysInMonth2 = 31 + 28 + 31 + 30 + 31 + 30;
			break;
			// July
		case 8:
			daysInMonth2 = 31 + 28 + 31 + 30 + 31 + 30 + 31;
			break;
			// August
		case 9:
			daysInMonth2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			// September 
			break;
		case 10:
			daysInMonth2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			// October
			break;
		case 11:
			daysInMonth2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
			//November
		case 12:
			daysInMonth2 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			//December
			break;
		default:
			System.out.println("please enter a valid month");
			break;	
		}
		
		daysInYear1 = year1 * 365.2425 ;
		daysInYear2 = year2 * 365.2425 ;
		
		totalDays1 = daysInYear1 + daysInMonth1 + day1;
		totalDays2 = daysInYear2 + daysInMonth2 + day2;
		
		if (totalDays2 > totalDays1 ){
			double x = totalDays1;
			totalDays1 = totalDays2;
			totalDays2 = x;
		}
		dateDifference = (int) (totalDays1 - totalDays2);
		System.out.println("The difference between the two dates is " + dateDifference +" days.");
	}
}
