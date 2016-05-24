package test;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String revers = solution.reverseString("hello");
		System.out.println(revers);
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
