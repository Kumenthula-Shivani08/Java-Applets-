import java.util.*;
class freq{
  public static void main(String [] args){
    // int n= arr.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n = sc.nextInt();
    int arr[] = new int [n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++){
      arr[i]= sc.nextInt();
    }
    System.out.println("Array elements:");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
      System.out.println();

    int fr[] = new int[n];
     int visited = -1;
      for(int i=0 ;i<n;i++){
        int count=1;
        for(int j=i+1;j<n;j++){
          if(arr[i] == arr[j]){
            count++;
            fr[j] = visited;
          }
        }
        if(fr[i]!=visited){
          fr[i]=count;
        }
      }
       System.out.println("-----------");
       System.out.println("Element | Frequency" );
       for(int i=0;i<fr.length;i++){
        if(fr[i]!=visited)
        System.out.println("|"+arr[i]+    " |     "+fr[i]+"|");
       }
        System.out.println("-----------");

  
      }
}