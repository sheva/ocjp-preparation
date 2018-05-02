package simpleServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServerSimple {

    public static final void main(String[] args) throws Throwable {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
        Socket socket = serverSocket.accept();
        new Thread(new SocketProcessor(socket)).start();
        }
    }

    private static class SocketProcessor implements Runnable {

        private Socket socket;
        private InputStream inputStream;
        private OutputStream outputStream;

        private SocketProcessor(Socket socket) throws IOException {
            this.socket = socket;
            this.inputStream = socket.getInputStream();
            this.outputStream = socket.getOutputStream();
        }

        @Override
        public void run() {
            try {
                readRequest();
                writeResponse("Hello!");
            } catch (Throwable t) {
                System.err.println(t.getMessage());
            } finally {
                try {
                socket.close();
                } catch (Throwable t) {
                    System.err.println(t.getMessage());
                }
            }
        }

        private void writeResponse(String s) throws Throwable {
            String response = "HTTP/1.1 200 OK\r\n" +
                    "Server: YarServer/2009-09-09\r\n" +
                    "Content-Type: text/html\r\n" +
                    "Content-Length: " + s.length() + "\r\n" +
                    "Connection: close\r\n\r\n";
            String result = response + s;
            outputStream.write(result.getBytes());
            outputStream.flush();
        }

        private void readRequest() throws Throwable {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

}
