package Ex4;

public class Shop {

    public int CheapestKeyboard(int[] Keyboards)
    {   int min=Integer.MAX_VALUE;
        for(int i = 0; i < Keyboards.length; i++)
            if(Keyboards[i]<min)
                min = Keyboards[i];
        return min;
    }

    public int MostExpensiveItem(int[] Keyboards, int[] USBs)
    {
        int max=Integer.MIN_VALUE;
        for(int i = 0; i < Keyboards.length; i++)
            if(Keyboards[i]>max)
                max = Keyboards[i];
        for(int i=0;i<USBs.length;i++)
            if(USBs[i]>max)
                max = USBs[i];
        return max;
    }

    public int MostExpensiveAffordableUSB(int[] USBs,int Budget)
    {
        int MinimalDifference = Integer.MAX_VALUE;
        int USB=-1;
        for (int i = 0; i < USBs.length; i++)
        {
            if (Budget - USBs[i] < MinimalDifference && Budget >= USBs[i])
            {
                MinimalDifference = Budget - USBs[i];
                USB = USBs[i];
            }
        }
        return USB;
    }
}
