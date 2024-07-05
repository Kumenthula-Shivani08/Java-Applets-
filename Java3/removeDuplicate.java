import java.util.*;
class removeDuplicate{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no of elements");
    int n = sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
    }
    
     int length = RemoveDuplicates(n,arr);
     System.out.println("After removing duplicates");
     for(int i=0;i<length;i++){
          System.out.println(arr[i]+" ");

     }
    

  }

  public static int RemoveDuplicates(int n,int[]arr){
    if (n == 0 || n == 1) {
            return n;
        }
    int []temp = new int[n];
    int j=0;
    for(int i=0;i<n-1;i++){
      if(arr[i]!=arr[i+1]){
        temp[j++] = arr[i];
      }

    }
    temp[j++] = arr[n-1];
    for(int i=0;i<j;i++){
      arr[i]  = temp[i];
    }
    return j;
  
}
}