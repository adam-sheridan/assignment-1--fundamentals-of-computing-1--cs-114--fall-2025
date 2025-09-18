import java.util.Scanner;
import java.util.Random;
public class Assignment1Program1 {
  public static void main(String[] args) {
    //------------------------------------------------------
    //Initials
    //------------------------------------------------------
    System.out.println("        AA          SSSS");
    System.out.println("      AA  AA      SS");
    System.out.println("    AAAAAAAAAA    SSSSSS");
    System.out.println("  AA          AA        SS");
    System.out.println("AA              AA  SSSS");
    //------------------------------------------------------
    //5 character string
    //------------------------------------------------------
    Scanner scan = new Scanner(System.in);
    String input = scan.next();
    String chop = input.substring(1,5);
    String reverse = "" + chop.charAt(2) + chop.charAt(1) + chop.charAt(0);
    System.out.println(reverse);
    //------------------------------------------------------
    //Temperature conversion
    //------------------------------------------------------
    int fahrenheit = scan.nextInt();
    int celsius = (int)((fahrenheit - 32) / 1.8);
    System.out.println(celsius);
    //------------------------------------------------------
    //Random number generator
    //------------------------------------------------------
    Random rand = new Random();
    int num = rand.nextInt(16384 - 32 + 1) + 32;
    System.out.println(num);
    //------------------------------------------------------
    //Final sequence
    //------------------------------------------------------
    System.out.println(celsius + reverse + num);
    scan.close();
    }
}
