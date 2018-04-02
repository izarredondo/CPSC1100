public class Peevish
{
    public static void main(String[] args)
    {
        boolean[] door;
        final int NODOORS = 101; // We will not use door[0]
        final boolean OPEN = true;
        final boolean CLOSED = false;
        // Initialize the doors
        door = new boolean[NODOORS];
        for (int i = 0; i < NODOORS; i++)
        {
            door[i] = CLOSED;
        }
        // Print the state of each door (only doors 1-100)
        System.out.println("Before:");
        for (int i = 1; i < NODOORS; i++)
        {
            if (door[i] == true)
            {
                System.out.println("Door " + i + " is open.");
            }
            else
            {
                System.out.println("Door " + i + " is closed.");
            }
        }
        // Your code here
        
        System.out.println();
        System.out.println("After:");
        for(int i = 1; i < NODOORS; i++)   //NUMBER OF PASSES 
        {
            for (int j = 0; j < NODOORS; j += i)    //DOOR NUMBER
            {
                if(j != 0)
                {
                    door[j] = !door[j];
                }
            }
        }

        for (int i = 1; i < NODOORS; i++)
        {
            if (door[i] == true)
            {
                System.out.println("Door " + i + " is open.");
            }
            else
            {
                System.out.println("Door " + i + " is closed.");
            }
        }

    }
}