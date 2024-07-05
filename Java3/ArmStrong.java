import java.util.*;
class ArmStrong{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
     int sum=0,r;
     int temp=num;
     while(num!=0){
    r=num%10;
    // sum+=Math.pow(r,3);
        sum+=r*r*r;
    num/=10;
     }
         System.out.println(sum);
    if(temp==sum){
      System.out.println("It is  a Armstrong");
    }
    else{
            System.out.println("It is not an Armstrong");

    }
  }
}