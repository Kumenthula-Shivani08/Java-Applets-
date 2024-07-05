import java.util.*;
class largest{
  public static void main(String  []args){
    int a[]={1,2,5,6,3,2};
    int b[]={44,66,99,77,33,22,55};
        System.out.println("The third "+ getThird(a,a.length));
        System.out.println("The third "+ getThird(b,b.length));
  }
 public static int getThird(int []a,int total){
  int temp;
  for(int i=0;i<total;i++){
      for(int j=i+1;j<total;j++){
      {
        if(a[i]>a[j]){
          temp = a[i];
          a[i] = a[j];
          a[j]  = temp;
        }
      }
  }
 }
 return a[total-3];
    
 }
}
