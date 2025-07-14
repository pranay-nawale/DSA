// Given a number n, find the sum of its digits.
public class Problem6{
 public static void main(String[] args) {
  int n = 634;
  int sum = 0;
   
  while (n!=0){
    int lastno = n%10;
    sum = sum + lastno;
    n = n/10;
  }
  System.out.println(sum);
 }
}