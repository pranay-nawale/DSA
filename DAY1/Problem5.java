//swap two number
public class Problem5 {
  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int temp;
    System.out.println("before swapping " + " a = " + a + " b = " + b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("after swapping " + "a = " + a + " b = " + b);
  }
}
