package Ex3;

import static java.lang.Math.abs;

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
        if(result[0]==1)
            return result;

        int[] ShiftedResult = new int[result.length-1];
        for(int i=0;i<result.length-1;i++)
            ShiftedResult[i]=result[i+1];
        return ShiftedResult;
    }

    public int[] difference(int[] Array1, int[] Array2)
    {   int[] arr1;
        int[] arr2;
        boolean NumberOneBigger=true;
        if(!BiggerNumber(Array1,Array2)) {
            arr1=Array2.clone();
            arr2=Array1.clone();
            NumberOneBigger=false;
        }
        else
        {
            arr1=Array1.clone();
            arr2=Array2.clone();
        }
        int[] result=new int[arr1.length];
        for(int i=arr1.length-1;i>=0;i--)
        {
            int diff=arr1[i]-arr2[i];
            if(diff>=0)
            {
                result[i]=diff;
            }
            else
            {
                result[i]=10-abs(diff);
                int j=i-1;
                while(arr1[j]==0)
                {
                    arr1[j]=9;
                    j--;
                }
                arr1[j]--;
            }
        }


        if(result[0]==0)
        {
            int[] ShiftedResult = new int[result.length - 1];
            for (int i = 0; i < result.length - 1; i++)
                ShiftedResult[i] = result[i + 1];
            if(!NumberOneBigger)
                ShiftedResult[0]=-ShiftedResult[0];
            return ShiftedResult;
        }
        if(!NumberOneBigger)
            result[0]=-result[0];
        return result;
    }

    public int[] multiplication(int[] Array1, int multiplier)
    {
        int[]result=new int[Array1.length+1];
        int carry=0;
        for(int i=Array1.length-1;i>=0;i--)
        {
            int sum=Array1[i]*multiplier+carry;
            result[i+1]=sum%10;
            carry=sum/10;
        }
        result[0]=carry;
        if(result[0]!=0)
            return result;

        int[] ShiftedResult = new int[result.length-1];
        for(int i=0;i<result.length-1;i++)
            ShiftedResult[i]=result[i+1];
        return ShiftedResult;
    }


    public int[] division(int [] Array1, int divisor)
    {   int []arr=Array1.clone();
        int[] result=new int[arr.length];
        int quotient;
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                if(arr[i]>=divisor)
                {
                    quotient=arr[i]/divisor;
                    result[i]=quotient;
                    arr[i]=arr[i]-quotient*divisor;
                }
                continue;
            }
            if(arr[i-1]!=0)
            {
                quotient=(arr[i-1]*10+arr[i])/divisor;
                result[i]=quotient;
                arr[i]=(arr[i-1]*10+arr[i])-quotient*divisor;
            }
            else
            {
                quotient=arr[i]/divisor;
                result[i]=quotient;
                arr[i]=arr[i]-quotient*divisor;
            }
        }
        if(result[0]==0) {
            int[] ShiftedResult = new int[result.length - 1];
            for (int i = 0; i < result.length - 1; i++)
                ShiftedResult[i] = result[i + 1];
            return ShiftedResult;
        }
        return result;
    }
    private boolean BiggerNumber(int[] Array1, int[] Array2)
    {
        for(int i=0;i<Array1.length;i++)
        {
            if(Array1[i]>Array2[i])
                return true;
            if(Array1[i]<Array2[i])
                return false;
        }
        return true;
    }
}


