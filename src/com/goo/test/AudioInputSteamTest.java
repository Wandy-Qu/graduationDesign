package com.goo.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;



public class AudioInputSteamTest {
	public static void main(String[] args) {
		try {
		//	AudioInputStream a = AudioSystem.getAudioInputStream(new File("E:/dingdong.wav"));
			FileInputStream fis = new FileInputStream(new File("E:/dingdong.wav"));
			DataInputStream is  = new DataInputStream(fis);
			byte[] samples = new byte[fis.available()];
			is.readFully(samples);
			byte[] t = "24FD52CE0224".getBytes();
			
//			for (int i = 0; i < samples.length; i++) {
//				System.out.print(samples[i]);
//			}
//			System.out.println();
			byte[] streamData = new byte[t.length+samples.length];
			System.arraycopy(t, 0, streamData, 0, t.length);
			System.arraycopy(samples, 0, streamData, t.length,samples.length);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			//DataOutputStream dos = new DataOutputStream(bos);
			bos.write(streamData);
			ByteArrayInputStream bis = new ByteArrayInputStream(streamData);
			//DataInputStream dis = new DataInputStream(bis);
			byte[] samples2 = new byte[samples.length];
		//	System.out.println(samples.length);
			int i=0;
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			ByteArrayOutputStream baos2=new ByteArrayOutputStream();


			while(true){
				int b =  bis.read();
				
				i++;
				if (i>12)
				{
					
					baos.write(b);
				}else
				{
					baos2.write(b);
				}
				if(i>streamData.length){
					break;
				}
			}

//			if(Byte b = bis.read()!=null){
//				if(i<12){
//				bis.read(samples2);
//				}
//				i++;
//			}
			System.out.println();
			samples2=baos.toByteArray();
			byte[] c=baos2.toByteArray();
			System.out.println(new String(c));
//			for (int j = 0; j < samples2.length; j++) {
//				System.out.print(samples2[j]);
//			}
			FileOutputStream fos = new FileOutputStream("E:/dingdong2.wav");
			
			fos.write(samples2);
			//fos.close();
////			505270685350676948505052
////			5052457068455350456769454850455052
////			
//			byte[] t = "24-FD-52-CE-02-24".getBytes();
//			for (int i = 0; i < t.length; i++) {
//				System.out.print(t[i]);
//			}
		    
//			int i =0;
//			while (i<100){
//				
//				System.out.print(a.read());
//				i++;
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
