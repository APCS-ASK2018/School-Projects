
public class ForLoopDemo
{
    //instance variables and constructors could be used, but are not really needed
    
    //runForLoop() will run a for loop from start to stop going up by increment
    public static void runForLoop(int start, int stop, int increment )
    {
        for(int i = start ; i < stop ; i += increment) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();


    }
}