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
		
		daysInMonth1 =totalDaysInMonth(month1,daysInMonth1);
		daysInMonth2 =totalDaysInMonth(month2,daysInMonth2);
		//call to the total days method, returning total number of days from month entered.
		
		daysInYear1 = year1 * 365.2425;
		daysInYear2 = year2 * 365.2425;
		
		totalDays1 = daysInYear1 + daysInMonth1 + day1;
		System.out.println(totalDays1);
		totalDays2 = daysInYear2 + daysInMonth2 + day2;
		System.out.println(totalDays2);
		
		if (totalDays2 > totalDays1 ){
			double x = totalDays1;
			totalDays1 = totalDays2;
			totalDays2 = x;
		}
		dateDifference = (int)Math.round(totalDays1 - totalDays2);
		// takes care of rounding issues as it rounds down when changing from double to integer. 
		System.out.println("The difference between the two dates is " + dateDifference +" days.");
	}
	static public int totalDaysInMonth(int month,int daysInMonth){
		for (int count = month;count>1;--count){
			if(count == 3){
				daysInMonth += 28;
			}else{
				if(count >= 9){
					if(count % 2 == 0){
						daysInMonth += 30;
					}else{
						daysInMonth += 31;
					}
				}
				else{
					if(count % 2 == 0){
						daysInMonth += 31;
					}else{
						daysInMonth += 30;
					}
				}
			}	
		}
		return daysInMonth;
		/* parses in two parameters, the month and daysInMonth, we calculate the number of days from the month entered.
		*  we never include any days from December because this will be given to us from the user input, hence count is 
		*  always bigger than the number of days in a month that we're calculating by 1
		*  pattern is 31 days for odd number months and 30 for even, exception is February which has 28 days.
		*  pattern is the same until August where it then becomes 30 for odd and 31 for even.
		*/
	}
	
}
