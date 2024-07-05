import java.util.*;
class fibb{
  public static void main(String []args){
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter no of values");
    int n = sc.nextInt();
    int f1=0;
    int f2=1;
    System.out.println(f1+" ");
    System.out.println(f2+" ");
    for(int i=2;i<n;i++){
   int  f3 = f1+f2;
      System.out.println(f3+" ");
      f1=f2;
      f2=f3;

    }
    
  }
}