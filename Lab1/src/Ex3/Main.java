package Ex3;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        ArraysNumbers object = new ArraysNumbers();
        int[] Array1=new int[]{9,2,6,9,3,4,2};
        int[] Array2=new int[]{6,5,9,7,9,1,2};
        System.out.println("Addition: "+Arrays.toString(object.sum(Array1,Array2)));
        System.out.println("Subtraction: "+Arrays.toString(object.difference(Array1,Array2)));
        System.out.println("Multiplication: "+Arrays.toString(object.multiplication(Array1,1)));
        System.out.println("Division: "+Arrays.toString(object.division(Array1,3)));
    }
}