package assignments;
//*******************************************************************


import java.time.Year;
//FindSeason
//
//this method takes a month and a day, and determines what season it is.
//By: m.w.
//10/28/2019
//*******************************************************************
import java.util.*;
import java.util.GregorianCalendar;
public class FindSeason {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(season(12,14));
	}
	
	public static String season(int month, int day) {
		/*
		//instantiate main calender with parameter values and season calanders to compare it to 
		GregorianCalendar mainCalender = new GregorianCalendar(Year.now().getValue(),month,day);
		GregorianCalendar winterCalender = new GregorianCalendar(Year.now().getValue(), 12, 16);
		GregorianCalendar springCalender = new GregorianCalendar(Year.now().getValue(), 3, 16);
		GregorianCalendar summerCalender = new GregorianCalendar(Year.now().getValue(), 6, 16);
		GregorianCalendar fallCalender = new GregorianCalendar(Year.now().getValue(), 9, 16);
		
		//compare set dates in season calenders to the calender set with parameter dates to determine what
		//season the main calender is in 
		if(mainCalender.after(winterCalender) && mainCalender.before(springCalender)) {
			System.out.print("its winter! brrr");
			return("winter");
		}
		else if(mainCalender.after(springCalender) && mainCalender.before(summerCalender)) {
			System.out.print("Its spring! tweet tweet");
			return("spring");
		}
		else if(mainCalender.after(summerCalender) && mainCalender.before(fallCalender)) {
			System.out.print("Its summer! woooo");
			return("summer");
		}
		else if(mainCalender.after(fallCalender) && mainCalender.before(winterCalender)) {
			System.out.print("Its fall! ding dong dung dong");
			return("fall");
		}
		else return("its not any season?");*/
		
		//The mainCalender object in the code block above wouldn't automatically set its values properly for some reason..
		//I tried running it after setting its values manually, and it works! But not out of the box
		//So I did the assignment in a less readable way below, which works.
		
		//These months are within their seasons with no need to determine the days
		if((month == 1)||(month ==2)) {
			return("winter");
		}
		else if ((month == 4)||( month == 5)) {
			return("Spring");
		}
		else if((month == 7)||(month == 8)) {
			return("summer");
		}
		else if ((month == 10)||(month == 11)) {
			return("fall");
		}
		else if ((month == 3)&&(day <= 15)) {
			return("winter");
		}
		//These months need conditionals for the day that the seasons change.
		else if((month == 3)&&(day > 15)) {
			return("spring");
		}
		else if ((month == 6)&&(day <= 15)) {
			return("spring");
		}
		else if((month == 6)&&(day >= 16)) {
			return("summer");
		}
		else if((month == 9)&&(day <= 15)) {
			return("summer");
		}
		else if ((month == 9)&&(day >15)) {
			return("fall");
		}
		else if ((month == 12)&&(day <= 15)) {
			return("fall");
		}
		else if ((month == 12)&&(day > 15)) {
			return("winter");
		}
		else return null;
	}

}
