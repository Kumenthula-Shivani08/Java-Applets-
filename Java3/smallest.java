import java.util.*;
class smallest{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no of elements");
    int n = sc.nextInt();
    int arr[] = int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
      if(arr[i]>arr[j])
         arr[i] = arr[j];
    }
    }
  }
}