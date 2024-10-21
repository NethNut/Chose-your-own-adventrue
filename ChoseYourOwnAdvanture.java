
//chose your own advanture plane flying simulator 
import java.util.Scanner;

public class ChoseYourOwnAdvanture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String beginingText = "Welcome to my chose your own adventure where you get to test your skills with 1 or 2. Good Luck!!";
        String planeText = "You are in your private jet flying in the co pilot seat when all the suden the captin just colapses while stearing";
        System.out.println(beginingText);
        System.out.println(planeText);
        System.out.println("do you Take the stering yolk? 1 or let let it be 2?");
        String userInput = sc.nextLine();
        if (userInput.equals("1")) {
            System.out.println("you take the yolk 1 or do you try to keep the yolk steady 2?");
            userInput = sc.nextLine();
            if (userInput.equals("2")) {
                System.out.println("You spoted");
            } else {
                System.out.println("the plane jerked and the wing fell off causing the plane to crash kill you");
            }
        } else {
            System.out.println("The pilot never woke up and you end up dying try again");
        }

    }
}