import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0.0;
        double TotalCost = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            price = SafeInput.getRangeddouble(in, "What is the price of your item?", .50, 9.99);
            keepGoing = SafeInput.getYNconfirm(in, "Continue [Y/N]?");
            TotalCost= TotalCost + price;
        }
        System.out.println("\nYour total cost is " + TotalCost);
    }
}
