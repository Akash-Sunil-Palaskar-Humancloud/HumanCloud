package practice;

import java.util.ArrayList;

public class Palindrome {
	
	public  String checkPalindrome(int arr []) {
		
		ArrayList<String> palindrom=new ArrayList<String>();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			String original="";
			String reverse="";
			
			String str=""+arr[i];
			
			for (int j=0;j<str.length();j++) {
				
				String str1 = " "+str.charAt(j);
				original=original.concat(str1);
				
			}
			for (int k=str.length()-1;k>=0;k--) {
				
				String str1 = " "+str.charAt(k);
				reverse=reverse.concat(str1);
				
			}
			
			System.out.println("original is-"+original);
			System.out.println("reverse is-"+reverse);
	
			System.out.println(reverse.equals(original));
			System.out.println();
			
			if(reverse.equals(original) ) {
				
				palindrom.add(reverse);
			}
		}
		System.out.println();
		System.out.println("palindrom is "+palindrom);
		return " ";
	}
	
	public static void main(String[] args) {
		int arr[]= {123,121,454,567};
		Palindrome obj=new Palindrome();
		obj.checkPalindrome(arr);
		//System.out.println(obj.checkPalindrome(arr));
	}

}
