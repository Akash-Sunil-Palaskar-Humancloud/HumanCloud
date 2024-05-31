package practice;

public class SumOfThreeLargestNoInArray {
	int arr[]= {1,5,4,99,45,25};
	
	int sumOfThreeLagreNo() {
		int size =arr.length;
		
		for (int i=0;i<=size-2;i++) {
			
			for (int j=i+1;j<=size-1;j++) {
				if(arr[i]>arr[j]) {
					
				int	temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		
		int max1 = arr[size-1];
		int max2 = arr[size-2];
		int max3 = arr[size-3];
		System.out.println(max1+" "+max2+" "+max3);
		int sum = max1+max2+max3;
			return sum;
		}
public static void main(String[] args) {

	SumOfThreeLargestNoInArray obj = new SumOfThreeLargestNoInArray();
	System.out.println(obj.sumOfThreeLagreNo());
}
}
