package practice;

public class targetedSumFromArray {
	
	static int[] sum() {
		
	int arr[]= {2,11,71,15};
	int targeTSum = 9 ;
	
	
	for(int i=0;i<arr.length ;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]+arr[j]==targeTSum) {
				int[] a = new int[2];
				 a[0] = i;
				 a[1]=j;
			}
		}
		
	}
	
	return null;  
	}
	
	public static void main(String[] args) {
		int a[]=sum();
		
		if (a==null) {
			System.out.println("not any pair index match the targeted sum");
		}
		else {
		System.out.println("index are "+a[a.length-1]+" "+a[a.length-2]);
		}
	}
}
