
//chose your own advanture plane flying simulator 
import java.util.Scanner;

public class ChoseYourOwnAdvanture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String beginingText = "Welcome to my chose your own adventure where you get to test your skills with 1 or 2. Good Luck!!";
        String planeText = "You are in your private jet flying in the co pilot seat when all the suden the captin just colapses while stearing";
        System.out.println(beginingText);
        System.out.println(planeText);
        System.out.println("do you Take the stering yoke? 1 or let let it be 2?");
        String userInput = sc.nextLine();
        if (userInput.equals("1")) {
            System.out.println("do you keep the yoke steady 1 or do you try to move the yoke to steer 2?");
            userInput = sc.nextLine();
            if (userInput.equals("1")) {
                System.out.println("You spoted a runway do you either 1 fly over or 2 try to contact the radio");
                userInput = sc.nextLine();
                if (userInput.equals("2")) {
                    System.out.println(
                            "the radio answers do you try to get permishon to land 1 or try to land without permison 2");
                    userInput = sc.nextLine();
                    if (userInput.equals("1")) {
                        System.out.println("you wait for permision to land the plane fling in circles");
                        System.out.println(
                                "you get the signal to land but they tell you their is crosswind do you 1 land into the crosswind or 2 land with the crosswind behind you");
                        userInput = sc.nextLine();
                        if (userInput.equals("1")) {
                            System.err
                                    .println("you slowly land and get to safty. congrats you survived the incident!!!");
                        } else {
                            System.out.println(
                                    "you got pushed by the crosswind and over shot the runway killing yourslef you lose");
                        }
                    } else {
                        System.out.println(
                                "you try to land and end up creahsing into another plane while landing killing you");
                    }
                } else {
                    System.out.println("you flew past it and ran out of fule crashing and dieing");
                }
            } else {
                System.out.println(
                        "the plane jerked to the side and the wings fell of casuing you to crash killing you ");
            }
        } else {
            System.out.println("The pilot never woke up and you end up dying try again");
        }

    }
}