import java.util.Scanner;

public class PrettyHeader
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What message do you want centerd?");
        String msg = in.nextLine();
        SafeInput.prettyHeader(msg);
    }
}
