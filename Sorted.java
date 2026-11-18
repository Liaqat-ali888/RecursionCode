class Sorted{
     static boolean sorted(int[]  arr, int index){
     	if(index == arr.length-1){
     		return true;
     	}
     	return arr[index] < arr[index+1] && sorted(arr, index+1);
     }

	public static void main(String arg[]){
   int[] arr = {1,2,3,4};
    System.out.println(Sorted.sorted(arr,0));
	}
}