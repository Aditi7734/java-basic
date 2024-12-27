import java.util.Scanner;
public class first {

    public static void main(String[] args) {
       
     Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your name");
      String name = scanner.nextLine();

      System.out.println("Enter your age: ");
      int age = scanner.nextInt();

      System.out.println("enter your height: ");
      int height = scanner.nextInt();

      
      System.out.println("enter a: ");
      int a = scanner.nextInt();
      System.out.println("enter b: ");
      int b = scanner.nextInt();
      
      int sum= a+b;
      System.out.println("sum of" +a "and "+b "is: "+sum);

      System.out.println("name: "+name);
      System.out.println("age: "+age);
      System.out.println("Height: "+height);

       



    }
}
