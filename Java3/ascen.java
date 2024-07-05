import java.util.*;
class ascen{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements ");
    int n = sc.nextInt();
        int arr[] =new  int[n];

    System.out.println("Enter the elements");
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("Array elements");
      for(int i=0;i<n;i++){
              System.out.print(arr[i]+" ");

      }
      System.out.println("Ascending order");
     for(int i=0;i<n-1;i++)
   {        
    int minIndex = i;
        for(int j=i+1;j<n;j++){
          //Descending order
           if(arr[minIndex]>arr[j]){
            //Ascending order
          //  if(arr[minIndex]<arr[j]){

            minIndex=j;
        }
        }
           int temp =arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i]  = temp;
           

}
    for(int i=0;i<n;i++) {
       System.out.print(arr[i]+" ");
    }

     
  }
}