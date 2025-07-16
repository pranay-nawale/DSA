public class Problem8 {
  public static void main(String[] args) {
    int num = 123;
    int sum = 0;
    int product = 1;

    while (num != 0) {
      int lastdigit = num % 10;
      sum = sum + lastdigit;
      product = product * lastdigit;
      num = num / 10;
    }

    if (sum == product) {
      System.out.println("it is spy number...");
    } else {
      System.out.println("it is not spy number...");
    }
  }
}