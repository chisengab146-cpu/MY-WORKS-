import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your favourite meal: ");
        String food = sc.nextLine();
        System.out.print("Enter your favourite number: ");
        int num = sc.nextInt();
        
        System.out.println("Hello, " + name + ", you love " + food + " and your favourite number is " + num);
    }
}