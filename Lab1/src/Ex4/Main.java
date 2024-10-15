package Ex4;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        int[] Keyboards={40,35,70,15,45,15};
        int[] USBs={20,15,40,15,90,20};
        int Budget=23;
        System.out.println("Cheapest keyboard: " + shop.CheapestKeyboard(Keyboards));
        System.out.println("Most expensive Item: " +shop.MostExpensiveItem(Keyboards,USBs));
        System.out.println("Most expensive USB Markus can afford: " + shop.MostExpensiveAffordableUSB(USBs,Budget));
        System.out.println("Most amount of money Markus can spend: " +shop.MostMoneySpent(Keyboards,USBs,Budget));
    }
}
