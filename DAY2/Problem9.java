public class Problem9 {
  public static void main(String[] args) {
    int num = 121;
    int original = num; 
    int rev = 0;

    while (num > 0) {
      int lastdigit = num % 10;
      rev = rev * 10 + lastdigit;
      num = num / 10;
    }

    if (original == rev) {
      System.out.println("Number is palindrome...");
    } else {
      System.out.println("Number is not palindrome...");
    }
  }
}
