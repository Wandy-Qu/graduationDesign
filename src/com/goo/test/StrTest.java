package com.goo.test;//package com.goo.test;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import com.goo.abc.entity.User;
//import com.goo.abc.service.UserLoginService;
//
//public class StrTest {
//	public static void main(String args[]) {
//		// String a = "abcdef";
//		// System.out.println(StrTest.StringReverse(a));
//		
////		String fileName = "D:/newTemp.txt"; 
////		String content = "new append!\r\n asdfja;"; 
////		
////		FileWriter writer;
////		PrintWriter pWriter;
////		try {
////			writer = new FileWriter(fileName, true);
////			pWriter = new PrintWriter(writer);
////			pWriter.println("asdfa");
////			pWriter.print("123124");
////			pWriter.flush();
////			pWriter.close();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} 
//		new Thread (new Runnable(){
//
//			@Override
//			public void run() {
//			
//				
//			}
//			
//		}){
//			
//		}.run();
//		
//
//	}
//
//	public static String StringReverse(String s) {
//		char[] b = s.toCharArray();
//		String c = new String();
//
//		for (int i = 0; i < b.length; i++) {
//			c = String.valueOf(b[i]) + c;
//		}
//		return c;
//	}
//
//	public static ArrayList<String> MaxSubStr(String small, String big) {
//		int i = small.length() * (small.length() - 1) + 1;
//		int count = 0;
//		ArrayList<String> strArr = new ArrayList<String>();
//		for (int j = 0; j < small.length(); j++) {
//			for (int j2 = j + 1; j2 < small.length() + 1; j2++) {
//				if (big.indexOf(small.substring(j, j2)) != -1) {
//					if (small.substring(j, j2) == "sl") {
//						System.out.println("!!");
//					}
//					strArr.add(small.substring(j, j2));
//					count++;
//				}
//			}
//		}
//		int maxLength = 0;
//		for (int j = 0; j < strArr.size(); j++) {
//			if (strArr.get(j).length() > maxLength) {
//				maxLength = strArr.get(j).length();
//			}
//		}
//		ArrayList<String> resultArr = new ArrayList<String>();
//		boolean flag =true;
//		for (int j = 0; j < strArr.size(); j++) {
//			if (maxLength == strArr.get(j).length()) {
//				if(resultArr.size()==0){
//					resultArr.add(strArr.get(j));
//				}
//				System.out.println(strArr.get(j));
//				for (int j2 = 0; j2 < resultArr.size(); j2++) {
//					if ((strArr.get(j)).equals(resultArr.get(j2))) {
//
//						flag=false;
//					} else {
//						
//					}
//				}
//				if(flag){
//					resultArr.add(strArr.get(j));
//					
//				}
//				flag=true;
//
//			}
//		}
//		return resultArr;
//	}
//}
