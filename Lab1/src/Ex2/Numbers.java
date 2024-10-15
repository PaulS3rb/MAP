package Ex2;

public class Numbers {

    public int FindMaximum(int[] numbers)
    {
        int max=-1;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>max)
                max=numbers[i];
        }
        return max;
    }

    public int FindMinimum(int [] numbers)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]<min)
                min=numbers[i];
        }
        return min;
    }

    public int MaxSum(int [] numbers)
    {
        int sum=0;
        boolean found=false;
        int minnumber=FindMinimum(numbers);
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] == minnumber) {
                if (!found) {
                    found = true;
                    continue;
                }
            }

            sum+=numbers[i];

        }
        return sum;
    }

}
