import java.util.Scanner;

public class Die {
  private int numberOfSides;
  private int value;

  public Die(){
      this.numberOfSides = 6;
  }

  public Die(int numberOfSides){
      this.numberOfSides = numberOfSides;
  }

  public int roll(){
      this.value = (int) (Math.random() * numberOfSides) +1;
      return this.get();
  }

  public int get(){
      return value;
  }


  public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int confirmed = 0;
      int sides = 0;
      while(confirmed!=1)
      {
          System.out.print("Number of sides: ");
          sides = sc.nextInt();
          if (sides > 0 && sides < 7)
          {
              confirmed = 1;
          }
      }

      Die d = new Die(sides);
      System.out.println("Something shady: " + d.roll());
  }
}
