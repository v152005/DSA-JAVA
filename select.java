
public class select {
     public static void select1(int arr[]){

         int n= arr.length;
         for(int i=0;i<n-1;i++){
             int minindex=i;
             for(int j=i+1;j<=n-1;j++){
                 if(arr[j]<arr[minindex]){
                     minindex=j;
                 }
             }
             int temp = arr[i];
             arr[i]=arr[minindex];
             arr[minindex]=temp;
         }


     }


    static void main() {
         int[] arr= {2,7,5,9,8};
         select1(arr);
         for(int i=0;i<arr.length;i++){
             System.out.println(" "+arr[i]);
         }


    }
}
