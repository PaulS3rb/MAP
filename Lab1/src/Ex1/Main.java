package Ex1;

import java.util.Arrays;

import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Grades object = new Grades();
        int[] grades=new int[]{17, 29, 66 , 45, 37, 80, 92};
        System.out.println(Arrays.toString(object.insufficientGrade(grades)));
        System.out.println(Arrays.toString(object.AdjustGrades(grades)));
        System.out.println(object.AverageGrade(grades));

    }

}
