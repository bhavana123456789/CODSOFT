
import java.util.*;
public class StudentGradeCalculator {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total no.of subjects");


        int TotalNumberOfSubjects = sc.nextInt();
        int percentage,TotalMarks = 0;
        
        
             
        
        for(int i=0; i<TotalNumberOfSubjects; i++) {
            System.out.println("Enter marks for Subject" +" "+ (i+1));
            TotalMarks = TotalMarks + sc.nextInt();
        }
        
        percentage = TotalMarks / TotalNumberOfSubjects;
        System.out.println("Total : " + TotalMarks);
        System.out.println("Percentage : "+ percentage);
        if(percentage >= 81 && percentage <= 100){
            System.out.println("Grade: O");
        }
        if(percentage >= 75 && percentage <= 80){
            System.out.println("Grade: A");
        }
        else if(percentage > 50 && percentage < 75) {
            System.out.println("Grade: B");
        }
        else if(percentage >= 35 && percentage < 50)
        {
            System.out.println("Grade: C");
        }
        if(percentage <35) {
            System.out.println("Grade: Failed");
        }
        
       
       
        else {
            System.out.println(" PLEASE ENTER VALID MARKS!!");
        }
    }
}
    

