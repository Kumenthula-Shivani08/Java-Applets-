import java.util.*;
class freq1{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no of elements");
    int  n = sc.nextInt();
    int []arr = new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++){
         arr[i] = sc.nextInt();

    }
     for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
     }
         int fr[]=new int[n];
         int visited = -1;

    for(int i=0;i<n;i++){
      int count=1;
       for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
          count++;
          fr[j] = visited;
        }
        if(fr[i]!=visited){
          fr[i]=count;
        }
       }
    }
    System.out.println("----------");
    System.out.println("Elements  |  Frequency");
    for(int  i=0;i<fr.length;i++){
      if(fr[i]!=visited){
      System.out.println(arr[i]+"       |    "+fr[i]);}
    }
  }
}