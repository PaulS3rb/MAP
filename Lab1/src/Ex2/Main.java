package Ex2;

public class Main {

    public static void main(String[] args) {
        Numbers n = new Numbers();
        int [] numbers={6,4,12,3,12,3};
        System.out.println(n.FindMaximum(numbers));
        System.out.println(n.FindMinimum(numbers));
        System.out.println(n.MaxSum(numbers));
    }
}
