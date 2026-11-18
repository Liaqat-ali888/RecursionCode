class Find{
     static boolean Search(int[]  arr, int index, int target){
     	if(index == arr.length){
     		return false;
     	}
     	return arr[index] == target || Search(arr, index+1, target);
     }
       static int findIndex(int[]  arr, int index, int target){
     	if(index == arr.length){
     		return -1;
     	}
     	if(arr[index] == target){
     	return index;
     }
     else{
     	return  findIndex(arr, index+1, target);
     }
     }
	public static void main(String arg[]){
   int[] arr = {1,2,3,4};
    System.out.println(Find.Search(arr,0,5));
    System.out.println("Find Index: "+Find.findIndex(arr,0,3));

	}
}