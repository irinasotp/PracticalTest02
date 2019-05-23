package ro.pub.cs.systems.eim.practicaltest02.network;

import android.util.Log;

import java.io.IOException;
import java.net.ServerSocket;

import ro.pub.cs.systems.eim.practicaltest02.general.Constants;

public class ServerThread extends Thread {
    private int port = 0;
    private ServerSocket serverSocket = null;



    public ServerThread(int port) {
        this.port = port
        try {
            this.serverSocket = new ServerSocket(port);
        } catch (IOException ioException) {
            Log.e(Constants.TAG, "An exception has occurred: " + ioException.getMessage());
            if (Constants.DEBUG) {
                ioException.printStackTrace();
            }
        }
    }
}
