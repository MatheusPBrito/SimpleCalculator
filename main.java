import java.util.Scanner;

public class main {
  
  public static void main(String ... args){
      int num1 = 0, num2 = 0, choise = 0; 
      Scanner input = new Scanner(System.in);
      while(true){
        System.out.print("Write the first number: ");
        if (input.hasNextInt()) {
            num1 = input.nextInt(); 
            input.nextLine();
            break;
        }
        else {
          System.out.println("Invalid input");
          input.nextLine();
        }
      }

      while (true) {
        System.out.print("(1) + (2) - (3) * (4) / : ");
        if(input.hasNextInt()){
          choise = input.nextInt();
          input.nextLine();
          if(choise > 0 && choise < 5)
            break;
          System.out.println("Invalid input");
        }
        else{
          System.out.println("Invalid input");
          input.nextLine();
        }
      }

      while (true) {
        System.out.print("Write the second number: "); 
        if(input.hasNextInt()){
          num2 = input.nextInt();
          input.nextLine();
          break;
        }
        else{
          System.out.println("Invalid input");
          input.nextLine();
        }
      }

      switch (choise) {
        case 1:
          System.out.println("Resultado: " + (num1 + num2)); 
          break;
        case 2:
          System.out.println("Resultado: " + (num1 - num2));
          break;
        case 3:
          System.out.println("Resultado: " + (num1 * num2));
          break;
        case 4:
          System.out.println("Resultado: " + (num1 / num2));
          break;
      }
  }
}
