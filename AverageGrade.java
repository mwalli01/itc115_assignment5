package assignments;
//*******************************************************************


//AverageGrade
//
//this method takes a name, and any number of numbers to find an average
//By: m.w.
//10/28/2019
//*******************************************************************
import java.util.*;
public class AverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGPA();
	}

	public static void printGPA() {
		//instantiate scanner object
		Scanner scanObj = new Scanner(System.in);
		//instantiate arraylist for grades
		ArrayList<Integer> grades = new ArrayList<Integer>();
		//int to store grade to average
		int total = 0;
		//user prompt
		System.out.println("enter name");
		//get the name
		String name = scanObj.nextLine();
		System.out.println("Enter grade. Press enter after each grade. Enter D when Done.");
		//check if user is done entering grades
		while(!(scanObj.hasNext("[D]|[d]"))) {	
			//add grade to arraylist for averaging
			grades.add(scanObj.nextInt());
		}
		
		System.out.print(name + "'s average grade is : ");
		//iterate over the arraylist to get a total
		for(int i = 0;i<grades.size();i++) {
			total= total+grades.get(i);
		}
		//find the average grade
		System.out.print(total / grades.size());
	}

}
