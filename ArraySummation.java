public class ArraySummation{
	public static void main(String[] args){
	
		int[] arr ={10, 12, 20, 18, 19};
		
		//int sum =  calculateSum(arr);
	 
		//System.out.println("Sum of the array is: " + sum);
		int max = findLargest(arr);
		System.out.println("Largest element is: " + max);
	}
	
	
	public static int calculateSum(int arr[]){
		int sum =0; 
		
		for(int i =0; i< arr.length; i++){
			sum+= arr[i];
	}
	return sum;
    }
	
	
	public static int findLargest(int[] arr){
		int max = arr[0];
			for(int i=1; i<arr.length; i++){
				if(arr[i] > max){
					max =arr[i];
				}
			}
		return max;
	}
}


























