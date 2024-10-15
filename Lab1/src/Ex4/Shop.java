package Ex4;

import java.util.Arrays;

public class Shop {

    public int CheapestKeyboard(int[] Keyboards) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < Keyboards.length; i++)
            if (Keyboards[i] < min)
                min = Keyboards[i];
        return min;
    }

    public int MostExpensiveItem(int[] Keyboards, int[] USBs) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < Keyboards.length; i++)
            if (Keyboards[i] > max)
                max = Keyboards[i];
        for (int i = 0; i < USBs.length; i++)
            if (USBs[i] > max)
                max = USBs[i];
        return max;
    }

    public int MostExpensiveAffordableUSB(int[] USBs, int Budget) {
        int MinimalDifference = Integer.MAX_VALUE;
        int USB = -1;
        for (int i = 0; i < USBs.length; i++) {
            if (Budget - USBs[i] < MinimalDifference && Budget >= USBs[i]) {
                MinimalDifference = Budget - USBs[i];
                USB = USBs[i];
            }
        }
        return USB;
    }

    public int MostMoneySpent(int[] Keyboards, int[] USBs, int Budget)
    {
        int MoneySpent = -1;
        int MinimalDifference=Integer.MAX_VALUE;
        int[] arr1= Keyboards.clone();
        int[] arr2= USBs.clone();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=arr1.length-1;i>=0;i--)
        {
            if(arr1[i]>Budget)
                continue;
            for(int j=arr2.length-1;j>=0;j--)
            {
                if(arr1[i]+arr2[j]>Budget)
                    continue;
                if(Budget-(arr1[i]+arr2[j])<MinimalDifference)
                {
                    MinimalDifference = Budget-(arr1[i]+arr2[j]);
                    MoneySpent = arr1[i]+arr2[j];
                }
            }
        }
        return MoneySpent;
    }
}
