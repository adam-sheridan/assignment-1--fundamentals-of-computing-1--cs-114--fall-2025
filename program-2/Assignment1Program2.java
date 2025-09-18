public class Assignment1Program2 {
  public static void main(String[] args) {
    int number = 45;
    int radix = 4;
    String base4Number = Integer.toString(number, radix);
    System.out.println("The base 4 number converted from 45 base 10 is: " + base4Number);
  }
}
