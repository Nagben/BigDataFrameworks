import java.util.Random;
import java.util.Scanner;

//The program chooses a random number, and asks the user to find it

public class DichotomicResearch {
    public static void main(String[  ] args) {
        //Select randomly an integer between 0 and 10
        Random randomGenerate = new Random();
        int randomInt = randomGenerate.nextInt(10);

        //sc will take integer value passed by the user on keyboard
        Scanner sc = new Scanner(System.in);
        boolean b = false;

        //To keep in while loop, you must have b==false. As soon as the right integer is entered, b=True,
        //a success message is printed and you quit the loop
        while (b == false)  {
            System.out.println("Please enter an integer between 0 and 10");
            int a = sc.nextInt();

            if (a < randomInt) {
                System.out.println("The secret number is taller");
            }
            else if (a > randomInt) {
                System.out.println("The secret number is smaller");
            }
            else {
                System.out.println("Good job! You found the secret number");
                b = true;
                break;
            }
        }
    }
}


