
import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        year = SafeInput.getRangedInt(in,"Please enter the year your were born", 1950, 2010);
        month = SafeInput.getRangedInt(in,"Please enter the month your were born", 1, 12);
        day = SafeInput.getRangedInt(in,"Please enter the day your were born", 1, 31);
        hour = SafeInput.getRangedInt(in,"Please enter the hour your were born", 1, 24);
        minute = SafeInput.getRangedInt(in,"Please enter the minute your were born", 1, 59);
        System.out.println("\nYou were born on " + month + "/" + day + "/" + year +" at hour " + hour + " and minute " + minute);

    }





}
