package Ex3;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        ArraysNumbers object = new ArraysNumbers();
        int[] Array1=new int[]{1,3,8,5,0,0,0};
        int[] Array2=new int[]{6,7,9,7,0,0,0};
        System.out.println(Arrays.toString(object.sum(Array1,Array2)));
    }
}