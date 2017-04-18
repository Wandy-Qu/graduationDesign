package com.goo.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketTest {
	public static void main(String[] args) {
		try{
			
			Socket socket = new Socket("119.59.182.37",8189);
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter os =new PrintWriter(socket.getOutputStream());
			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String readline;
			readline = sin.readLine();
			while(!readline.equals("bye")){
				os.println(readline);
				os.flush();
				System.out.println("client:"+readline);
				System.out.println("server:"+is.readLine());
				readline = sin.readLine();
			}
			sin.close();
			os.close();
			is.close();
			socket.close();
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
