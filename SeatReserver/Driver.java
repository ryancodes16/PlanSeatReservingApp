import java.util.Scanner;
/**
 * Set up airline reservation system
 *
 * @Ryan
 * @8/21/2017
 */
public class Driver
{
    private static Scanner scan = new Scanner(System.in);
    private static String ans = "";
    private static int x = -1, y = -1;
    private static boolean checkie;
    private static Plane myPlane;
    public static void main(String args[])
    {
        myPlane = new Plane("United Airlines", 90, "9:30 PM");
        do
        {
            System.out.println("Do you want to reserve airline seats?[yes/no]");
            ans = scan.nextLine();
            if(ans.equalsIgnoreCase("yes"))
            {
                getSeat();            
            }
            ans = "hi";//check again if user wants to reserve seats
        }while(!ans.equalsIgnoreCase("yes") && !ans.equalsIgnoreCase("no"));
    }

    public static void getSeat()
    {
        do
        {
            System.out.println("Enter the row for the seat you want, enter a number 0-" + myPlane.getRSize());
            x = scan.nextInt();
            System.out.println("Enter the column for the seat you want 0-" + myPlane.getCSize());
            y = scan.nextInt();
        }while(x < 0 && y < 0 && y > myPlane.getCSize() && x > myPlane.getRSize());
        checkie = myPlane.openSeat(x, y);
        if(checkie)
        {
            myPlane.reserveSeat(x, y);
        }
        else
        {
            getSeat();
        }
    }
}

