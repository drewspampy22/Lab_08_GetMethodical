import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;
        favInt = SafeInput.getInt(in, "Enter your first Integer");
        favDouble = SafeInput.getDouble(in, "Enter your favorite Double");
        System.out.println("\nYour favorite integer is " + favInt + " your favorite double is " + favDouble);
    }



}
