package Ex3;

public class ArraysNumbers {

    public int[] sum(int[] Array1, int[] Array2)
    {   int[] result=new int[Array1.length+1];
        int carry=0;
        for(int i=Array1.length-1;i>=0;i--)
        {
            int sum=Array1[i]+Array2[i]+carry;
            result[i+1]=sum%10;
            carry=sum/10;
        }
        result[0]=carry;
        return result;
    }

}
