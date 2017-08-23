/**
 * Reservation system
 *
 * @Ryan Regier
 * @8/21/2017
 */
public class Plane
{
    private String name, departureTime;
    private static int size, x, y;
    private int[][] seats;
    public Plane(String name, int size, String departureTime)
    {
        this.name = name;
        this.size = size;
        this.departureTime = departureTime;
        generateSeats();
    }
    public void generateSeats()
    {
        seats = new int[4][25];
    }
    public void reserveSeat(int x, int y)
    {
        seats[x][y] = 1;
        printSeats();
    }
    public void printSeats()
    {
        for(int r = 0; r < seats.length; r++)
        {
            for(int c = 0; c < seats[r].length; c++)
            {
                System.out.print(seats[r][c] + " ");                
            } 
            System.out.println();
        }
        
    }
    public boolean openSeat(int x, int y) //checks for open seat, true=open, false=taken
    {
        for(int r = 0; r < seats.length; r++)
        {
            for(int c = 0; c < seats[r].length; c++)
            {
                if(seats[r][c] != 0)
                {
                    return(false);
                }
            }
        }
        return(true);
    }
    public int getCSize()
    {
        return(seats.length);
    }
    public int getRSize()
    {
        return(seats[0].length);
    }
}
