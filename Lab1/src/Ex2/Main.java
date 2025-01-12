package Ex2;

public class Main {

    public static void main(String[] args) {
        Numbers n = new Numbers();
        int [] numbers={-4,8,3,10,17};
        System.out.println("Biggest number: " +n.FindMaximum(numbers));
        System.out.println("Smallest number: "+n.FindMinimum(numbers));
        System.out.println("Biggest sum of all numbers except one: "+n.MaxSum(numbers));
        System.out.println("Smallest sum of all numbers except one: "+ n.MinSum(numbers));
    }
}
