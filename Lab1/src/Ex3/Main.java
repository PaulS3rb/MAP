package Ex3;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        ArraysNumbers object = new ArraysNumbers();
        int[] Array1=new int[]{6,3,8,5,3,4,2};
        int[] Array2=new int[]{7,7,9,7,9,1,2};
        System.out.println(Arrays.toString(object.sum(Array1,Array2)));
        System.out.println(Arrays.toString(object.difference(Array1,Array2)));
    }
}