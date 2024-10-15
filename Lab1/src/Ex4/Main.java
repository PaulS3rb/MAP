package Ex4;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        int[] Keyboards={40,35,70,15,45,15};
        int[] USBs={20,15,40,15,90,20};
        System.out.println(shop.CheapestKeyboard(Keyboards));
        System.out.println(shop.MostExpensiveItem(Keyboards,USBs));
        System.out.println(shop.MostExpensiveAffordableUSB(USBs,40));
    }
}
