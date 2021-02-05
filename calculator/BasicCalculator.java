import java.util.Scanner;



class BasicCalculator{
  public static void main(String args[]){


      Scanner input = new Scanner(System.in);
      Scanner inputOp = new Scanner(System.in);
      double first, second, answer;
      String operation;

      System.out.println("Enter the first number: ");
      first = input.nextDouble();

      System.out.println("Enter the operation: ");
      operation = inputOp.nextLine();

      System.out.println("Enter the second number: ");
      second = input.nextDouble();


      switch (operation) {
        case "+":
          answer = first + second;
          System.out.println("The answer: " + answer);
          break;
        case "-":
          answer = first - second;
          System.out.println("The answer: " + answer);
          break;
        case "%":
          answer = first % second;
          System.out.println("The answer: " + answer);
          break;
        case "*":
          answer = first * second;
          System.out.println("The answer: " + answer);
          break;
        case "x":
          answer = first * second;
          System.out.println("The answer: " + answer);
          break;
        default:
          System.out.println("you broke it");

      }

  }
}
