package Ex4;

public class Shop {

    public int CheapestKeyboard(int[] Keyboards)
    {   int min=Integer.MAX_VALUE;
        for(int i = 0; i < Keyboards.length; i++)
            if(Keyboards[i]<min)
                min = Keyboards[i];
        return min;
    }

}
