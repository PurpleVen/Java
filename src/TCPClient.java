import java.io.*;
import java.net.*;

class TCPClient
{
    public static void main(String argv[]) throws Exception
    {

        String FromServer;
        String ToServer;

        Socket clientSocket = new Socket("localhost", 5000);
        /* Socket(SSockettring host, int port)  */
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        /*An InputStreamReader is a bridge from byte streams to character streams: 			It reads bytes and decodes them into characters using a specified charset.*/
        PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(),true);

	  	/* public PrintWriter(OutputStream out, boolean autoFlush)
	     	   Parameters:
	     		out - An output stream
	     		autoFlush - A boolean; if true, the println() methods will flush the 						output buffer
	        */

        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while (true)
        {

            FromServer = inFromServer.readLine();


            if ( FromServer.equals("q") || FromServer.equals("Q"))
            {
                clientSocket.close();
                break;
            }

            else
            {
                System.out.println("RECIEVED:" + FromServer);
                System.out.println("SEND(Type Q or q to Quit):");

                ToServer = inFromUser.readLine();

                if (ToServer.equals("Q") || ToServer.equals("q"))
                {
                    outToServer.println (ToServer) ;
                    clientSocket.close();
                    break;
                }

                else
                {
                    outToServer.println(ToServer);
                }  //end of else
            } //end of outer else
        }  // end of while
    }  // end of main
}  // end of class

