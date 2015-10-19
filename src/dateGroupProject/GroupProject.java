package dateGroupProject;

public class GroupProject {

	static public void main(String args[])
	{
		int day1,day2,month1,month2,year1,year2,daysInMonth1 = 0,daysInMonth2 = 0,dateDifference;
		double daysInYear1,daysInYear2,totalDays1,totalDays2;
		day1=14;
		day2=23;
		month1=9;
		month2=7;
		year1=1752;
		year2=2345;
		// inputs for the dates
		// this will work for all dates from 14/09/1752, the date gregorian calendar was adopted by UK
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
