public class LinearSearch {
    public static  void  main (String[]args){
        int [] arr = {1,2,3,4,5};
        int target = 3;
        System.out.println( linearSearch(arr,target));
    }
    static int linearSearch(int[]arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
              return element;
            }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }
