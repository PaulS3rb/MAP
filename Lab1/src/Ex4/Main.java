package Ex4;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        int[] Keyboards={60};
        int[] USBs={8,12};
        int Budget=60;
        System.out.println("Cheapest keyboard: " + shop.CheapestKeyboard(Keyboards));
        System.out.println("Most expensive Item: " +shop.MostExpensiveItem(Keyboards,USBs));
        System.out.println("Most expensive USB Markus can afford: " + shop.MostExpensiveAffordableUSB(USBs,Budget));
        System.out.println("Most amount of money Markus can spend: " +shop.MostMoneySpent(Keyboards,USBs,Budget));
    }
}
