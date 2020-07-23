import java.util.ArrayList;
import java.util.Collection;
class StepTracker {
	static int activeSteps = 0;
	public StepTracker(int i) {
		activeSteps = i;
	}
	public int activeDays() {
		int days = 0;
		for(int i=0;i<dailySteps.size(); i++) {
			if(dailySteps.get(i) >= activeSteps)
				days ++;
		}
		return days;
	}
	static ArrayList<Integer> dailySteps = new ArrayList<Integer>();
	public void addDailySteps(int steps) {
		dailySteps.add(steps);
	}
	public double averageSteps() {
		int steps = 0;
		for(int i=0;i<dailySteps.size();i++) {
			steps += dailySteps.get(i);
		}
		if(dailySteps.size() == 0) {
			return 0.0;
		}
		return steps/dailySteps.size();
	}
}

class runTracker {
	int goalMiles;
	public runTracker(int i) {
		goalMiles = i;
	}
	static ArrayList<Integer> days = new ArrayList<Integer>();
	static ArrayList<Integer> miles = new ArrayList<Integer>();
	static ArrayList<Integer> times = new ArrayList<Integer>();
 	public static int getTotalMile() {
 		int totalMiles = 0;
 		for(int i=0;i<miles.size();i++)  {
 			totalMiles += miles.get(i);
 		}
		return totalMiles;
	}
 	public static int getTotalTime() {
 		int totalTime = 0;
 		for(int i=0;i<times.size();i++) {
 			totalTime += times.get(i);
 		}
 		return totalTime;
 	}
 	public static int getTotalDays() {
 		int totalDays = 0;
 		for(int i=0;i<days.size();i++) {
 			totalDays += days.get(i);
 		}
 		return totalDays;
 	}
	public static void addLog(int day, int mile, int time) {
		int lastRecordedDay = days.get(days.size()-1);
		if(day > lastRecordedDay + 1) {
			for(int i=lastRecordedDay+1;i<day;i++) {
				days.add(i);
				miles.add(0);
				times.add(0);
			}
		} else {
			days.add(day);
			miles.add(mile);
			times.add(time);
		}
	}
}

public class APCompSciQs {
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		System.out.println(dayOfWeek(3, 19, 2100));
	}
	public static int numberOfLeapYears(int year1, int year2) {
		int firstYear = Math.min(year1, year2);
		int secondYear = Math.max(year1, year2);
		int numOfLeapYears = 0;
		for(int i=firstYear; i<=secondYear; i++) {
			if(isLeapYear(i))
				numOfLeapYears ++;
		}
		return numOfLeapYears;
	}
	public static boolean isLeapYear(int year) {
		if(year%4 == 0 && !(year%100 == 0 && year%400 != 0))
			return true;
		return false;
	}
	public static String dayOfWeek(int month, int day, int year) {
		boolean invalidDate = (month == 2 && day == 29 && !isLeapYear(year)) || day < 1 || day > 31 || (month == 2 && isLeapYear(year) && day < 29) || (month == 2 && !isLeapYear(year) && day < 28) || ((month == 4 || month == 6 || month == 9 || month == 11) && day>30);
		if(invalidDate)
			return month + "/" + day + "/" + year + " is not a valid date. Please try again.";
		int dayOfWeek = (firstDayOfYear(year) + (dayOfYear(month, day, year)-1))%7;
		switch(dayOfWeek) {
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		default: return "Error";
		}
	}
	public static int firstDayOfYear(int year) {
		int day = 0;
		if(year >= 2017) {
			for(int i=2018; i<=year; i++) {
				if(isLeapYear(i-1))
					day += 2;
				else 
					day += 1;
			}
		} else {
			day = 7;
			for(int i=2016; i>=year; i--) {
				if(isLeapYear(i)) {
					day -= 2;
				}
				else 
					day --;
				if(day == -1)
					day = 6;
				if(day == -2)
					day = 5;
			}
		}
		return day;
	}
	
	
	public static int dayOfYear(int month, int day, int year) {
		int numberOfRemovedDays = 0;
		if(month >= 3) {
			if(isLeapYear(year))
				numberOfRemovedDays -= 2;
			else
				numberOfRemovedDays -= 3;
			if(month >= 4 && month < 8) {
				numberOfRemovedDays -= (month-3)/2;
			} else if(month == 8) {
				numberOfRemovedDays -= 2;
			} else if(month >= 9) {
				numberOfRemovedDays -= 2 + (month-8)/2;
			}
		}
		return (month-1)*31+numberOfRemovedDays + day;
	}
}
