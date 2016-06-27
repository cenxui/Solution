package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String revers = solution.reverseString("hello");
		System.out.println(revers);
		File file = new File("c:\\text\\abc.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ObjectOutputStream objectOutputStream = null; 
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(file,true));
			Data data = new Data();
			data.name = "cenxui";
			data.score = 100;
			objectOutputStream.writeObject(data);
			data = new Data();
			data.name = "miabanana";
			data.score = 99;
			objectOutputStream.writeObject(data);
			objectOutputStream.flush();
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	static class Data implements Serializable {
		String name;
		int score;
	}
	
	private String reverseString(String string) {
		byte[] beytes = string.getBytes();
		int length = beytes.length;
		byte[] reversebyte = new byte[length];
		int position = length-1;
		for (int i = 0;i<length;i++) {
			reversebyte[i] = beytes[position-i];
		}
		return new String(reversebyte);
	}

}
