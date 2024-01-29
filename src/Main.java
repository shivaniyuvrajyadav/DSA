public class Main {
    public static void main(String[] args) {
        int [] arr = {23,80,30,20,22,40};
        System.out.println(max(arr));
    }
    static int max(int [] arr){
     int maxv =  arr[0];
     for(int i = 0;i<arr.length;i++){
         if(arr[i]>maxv){
             maxv = arr[i];
         }
     }
     return  maxv;
    }
}