import java.io.*;
import java.net.*;

class TCPServer
{
    public static void main(String argv[]) throws Exception
    {
        String fromclient;
        String toclient;

        ServerSocket Server = new ServerSocket (5000);
        /* ServerSocket (Port Number) */
        System.out.println ("TCPServer Waiting for client on port 5000");

        while(true)
        {
            Socket connected = Server.accept();
            //Server recieves request and get connected to client socket.

            System.out.println( " THE CLIENT"+" "+ connected.getInetAddress() +":"+connected.getPort()+" IS CONNECTED ");

		/* getInetAddress() : The remote IP address to which this socket is connected, or null if the socket is not connected.
		getPort() : get the port no to which the socket is connected... */


            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader (connected.getInputStream()));

            PrintWriter outToClient = new PrintWriter(connected.getOutputStream(),true);

			 /* public PrintWriter(OutputStream out, boolean autoFlush)
			   Parameters:
		  	   out - An output stream
			   autoFlush - A boolean; if true, the println() methods will flush the output buffer
       */
            while ( true )
            {

                System.out.println("SEND(Type Q or q to Quit):");
                toclient = inFromUser.readLine();

                if ( toclient.equals ("q") || toclient.equals("Q") )
                {
                    outToClient.println(toclient);
                    connected.close();
                    break;
                }
                else
                { outToClient.println(toclient);            }

                fromclient = inFromClient.readLine();

                if ( fromclient.equals("q") || fromclient.equals("Q") )
                {
                    connected.close();
                    break;
                }
                else
                {
                    System.out.println( "RECIEVED:" + fromclient );
                }
            }    }      } }
