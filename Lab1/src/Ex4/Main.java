package Ex4;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        int[] Keyboards={40,35,70,15,45,15};
        int[] USBs={20,15,40,15};
        System.out.println(shop.CheapestKeyboard(Keyboards));
    }
}
