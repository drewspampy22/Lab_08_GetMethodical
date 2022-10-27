import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
      String SSN = "";
      String M = "";
      String Menu = "";
      SSN = SafeInput.getRegExString(in,"What is your social security number ###-##-####","\\d{3}-\\d{2}-\\d{4}");
      M = SafeInput.getRegExString(in,"What is your M number  M########","(M|m)\\d{8}");
      Menu = SafeInput.getRegExString(in,"What is your menu options (Open, Save, View , Quit respond with (Oo or Ss or Vv or Qq) ","[OoSsVvQq]");
      System.out.println("Your social is " + SSN);
      System.out.println("Your M# is " + M);
      System.out.println("Your menu option was " + Menu);
    }
}
