import java.util.*;
class ArrayUserInput{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of elements");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter a value");
    for(int i=0;i<n;i++){
       a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      System.out.println(a[i]);
    }
  
  }
}