package practice;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class frequentChar {
	public String frequentCharacter() {
		int max=0;
		char c=' ';
	Map<Character,Integer > map = new HashMap<>();
	String s="abracadabra";
	for (int i=0;i<s.length();i++) {
		
		if(map.containsKey(s.charAt(i))) {
			
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
			
		}
		else {
			map.put(s.charAt(i), 1);
		}
	}
	
	System.out.println(map);
	for (Entry<Character,Integer> e : map.entrySet()) {
		int value=  e.getValue();
		
		if (max < value) {
			max=value;
			c=e.getKey();
		}
		System.out.println(e.getKey()+" "+e.getValue());
		
	}
	
	String s1=c+" "+max;
	return s1;
	
	}
	public static void main(String[] args) {
		frequentChar o=new frequentChar();
		String maximumValue=o.frequentCharacter();
		
		System.out.println("character that apper most is "+maximumValue);
	}
	
}
