class Find{
     static boolean sorted(int[]  arr, int index, int target){
     	if(index == arr.length){
     		return false;
     	}
     	return arr[index] == target || sorted(arr, index+1, target);
     }

	public static void main(String arg[]){
   int[] arr = {1,2,3,4};
    System.out.println(Sorted.sorted(arr,0,5));
	}
}