import java.io.FileNotFoundException;
import java.io.PrintStream;

/** Driver */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
            PrintStream output = new PrintStream("Semaphore3test.txt");
            System.setOut(output);
        }
        catch(FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            System.exit(0);
        }
        
    	Network objNetwork = new Network( );            /* Activate the network */
        objNetwork.start();

        Server objServer1 = new Server("Thread1");
        objServer1.start();
        Server objServer2 = new Server("Thread2");
        objServer2.start();
        Server objServer3 = new Server("Thread3");
        objServer3.start();

        Client objClient1 = new Client("sending");          /* Start the sending client thread */
        objClient1.start();
        Client objClient2 = new Client("receiving");        /* Start the receiving client thread */
        objClient2.start();
    }
 }
