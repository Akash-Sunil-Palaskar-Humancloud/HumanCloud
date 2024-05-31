package practice;

public class splitArray {
	public static void main(String[] args) {
		int sumFromBegin =0;
		
		int index=0;
		
		int arr[]= {2,3,0,5};
		System.out.println("demo");
		for (int i=0;i<=3;i++) {
			
			//System.out.println(arr[i]);
			sumFromBegin=sumFromBegin+arr[i];
			System.out.println("sumFromBegin"+sumFromBegin);
			int sumFromEnd =0;
			for (int j = arr.length-1; j >= 0 ;j--) {
				sumFromEnd=sumFromEnd+arr[j];
				
				System.out.println("sum From End "+sumFromEnd);
				
				
				if(sumFromBegin==sumFromEnd ) {
					index = arr[j];
					
					break;
				}
				
				//System.out.println(arr[j]);	
			}
			System.out.println();
			
		}
		if(index != 0) {
		System.out.println("Index is  "+index);
		}
		else {
			System.out.println("there is no such index ");
		}
	}
}
