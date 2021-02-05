import java.util.Scanner;

public class MyDieTest {

  public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Number of sides: ");

      int sides = sc.nextInt();
      Die dice = new Die(sides);

      int sum = 0;

      for (int i=0; i < 10; i++)
      {
          sum = sum + dice.roll();
          System.out.println("current sum: " + sum);
      }
      System.out.println("Something shady: " + sum);
  }
}
