
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class U1L09GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get a list of grades (make it an ArrayList so that it can change sizes)
		ArrayList<Double> gradeList = new ArrayList<Double>();
	
		double grade = 1;
		while (grade > 0) {
			String input = JOptionPane.showInputDialog(null, "Enter a grade: (type '-1' to finish entering grades)");
				double grade = Double.parseDouble(input);
			gradeList.add(input);
		}
		System.out.println(gradeList);
		
		
		//add up everything with a loop in the list and divide by the length - 1
		double gradeTotal = 0;
		for (int i = 0; i < gradeList.size(); i++) {
			gradeTotal += gradeList.get(i);		
		}
		//System.out.println(gradeTotal);
		double gradeAvg = gradeTotal / gradeList.size();
		System.out.println("Your grade average is: " + gradeAvg + "%");
		String whichLetter = letterGrade(gradeAvg);
		System.out.println("Your letter grade is: " + whichLetter);
	
		
		//make a for loop to find the lowest score (remember the index)
		double lowestScore = 100000000.0;
		for (int i = 0; i < gradeList.size(); i++) {
			if (gradeList.get(i) < lowestScore) {
				lowestScore = gradeList.get(i);
			}
		}
		//System.out.println(lowestScore);
		//System.out.println(gradeList);
		
		//remove that index with nameOfList.remove(index)
		
		//Calculate the new average with the new list
		double newGradeTotal = 0;
		for (int i = 0; i < gradeList.size(); i++) {
			newGradeTotal += gradeList.get(i);		
		}
		newGradeTotal -= lowestScore;
		double newGradeAvg = newGradeTotal / (gradeList.size() - 1);
		System.out.println("Without your lowest score your new grade average is: " + newGradeAvg + "%");
		String whichNewLetter = letterGrade(gradeAvg);
		System.out.println("Without your lowest score your new letter grade is: " + whichNewLetter);
		
	}
		
		
		//write a function that calculate letter grade with w/ if statements
		public static String letterGrade(double gradeAvg){
		 {
		    // determine number of stars between 0 and 4 based on totalSentiment value 
		   String letter = "Z";
		    // write if statements here

		    if (gradeAvg <= 101.0 && gradeAvg >= 90.0){
		    	letter = "A";
		    }
		    
		    else if (gradeAvg <= 89.0 && gradeAvg >= 80.0){
		    	letter = "B";
		    }
		  
		    else if (gradeAvg <= 79.0 && gradeAvg >= 70.0){
		    	letter = "C";
		    }
		    
		    else if (gradeAvg <= 69.0 && gradeAvg >= 60.0){
		    	letter = "D";
		    }

		    // return number letter grade
		    return letter;
		  
		    
		  }
		
		
		
		
		
	}}


