package com.goo.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerTest {
	//10.18.91.151
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8189);
			Socket socket = server.accept();
			String line;
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter os =new PrintWriter(socket.getOutputStream());
			System.out.println("client:"+is.readLine());
			line = sin.readLine();
			while(!line.equals("bye")){
				os.println(line);
				os.flush();
				System.out.println("client:"+is.readLine());
				System.out.println("server:"+line);
				line = sin.readLine();
			}
			sin.close();
			os.close();
			is.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
