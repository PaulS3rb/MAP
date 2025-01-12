package Ex1;

import java.util.Arrays;

import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
        Grades object = new Grades();
        int[] grades=new int[]{29, 37, 38, 41, 84, 67};
        System.out.println("Insufficient Grades: "+Arrays.toString(object.insufficientGrade(object.AdjustGrades(grades))));
        System.out.println("Average Grade: "+ object.AverageGrade(grades));
        System.out.println("Modified Grades: "+Arrays.toString(object.AdjustGrades(grades)));
        System.out.println("Biggest Modified Grade: "+ object.MaximalGrade(grades));


    }

}
