//given positive integer n , find the sum of the first n natural number
public class Problem3 {
public static void main(String[] args) {
  int n = 10;
  int temp = 0;
  for(int i=0; i<=n ;i++){
    temp=temp+i;
  }
  System.out.println(temp);
}
}
