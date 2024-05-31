package practice;

public class palindromeWithoutTemp {
	
	public static void palindrome() {
		
	String str="abcacba";
	boolean flag=true;
	
	for (int i = 0, j =str.length()-1 ; i <= str.length()/2 && j >= str.length()/2 ; i++ , j--) {
		
		if(str.charAt(i) != str.charAt(j)){
			flag=false;
			break;
		}
	}
	
	if(flag) {
		System.out.println("given String in palindrome");
	}
	else {
		System.out.println("given string is not palindrome");
	}
	
	}
	public static void main(String[] args) {
		palindrome();
	}
}
