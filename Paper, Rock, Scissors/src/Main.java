import java.util.Scanner;

public class Main {
    public static void main(String args []){

     /* This section allows the user to make a choice by displaying the instructions and then creating a
     scanner to retrieve their input */

        Scanner scan = new Scanner(System.in);
        String userChoice;
        System.out.println("\nChoose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors.\n");
        userChoice = (scan.next());

     /* This section creates a random choice for the computer by multiplying the Math.random function by 3.
     After creating a number, it then uses the substring function and picks a letter from the 'rps' index */

        int cnc = (int) (Math.random() * 3);
        String numberIndex = "rps";
        String computerChoice = (numberIndex.substring(cnc, cnc+1));

     /* This section formulates all possible variables that would be printed out to show the result of a
     win, loss or tie for the user as well as the choices made by them and the computer. It also accounts
     for proper spacing of text */

        String ccr = "\n\nComputer Choice: rock";
        String ccp = "\n\nComputer Choice: paper";
        String ccs = "\n\nComputer Choice: scissors";

        String ucr = "\t\tPlayer Choice: rock\n";
        String ucp = "\t\tPlayer Choice: paper\n";
        String ucs = "\t\tPlayer Choice: scissors\n";

        String w = "\nYou Win!";
        String l = "\nYou Lose!";
        String t = "\nDraw!";

        String invalid = "\nInvalid selection please play again.\n";

     /* This section compares all possible scenarios by using nested 'if' statements inside of a broader 'if'
     statement. After an instance has filtered through the section, it prints out the appropriate information
     so that the user can see the results. If the user enters an invalid character that isn't r, p or s,
     then the section will print out a statement notifying the use that there choice was invalid */

        if(computerChoice.equals("r")){
            if(userChoice.equals("r")){
                System.out.println(t + ccr + ucr);}
            else if (userChoice.equals("p")){
                System.out.println(w + ccr + ucp);}
            else if (userChoice.equals("s")){
                System.out.println(l + ccr + ucs);}
            else{
                System.out.println(invalid);
            }
        }

        else if(computerChoice.equals("p")){
            if(userChoice.equals("p")){
                System.out.println(t + ccp + ucp);}
            else if (userChoice.equals("s")){
                System.out.println(w + ccp + ucs);}
            else if (userChoice.equals("r")){
                System.out.println(l + ccp + ucr);}
            else{
                System.out.println(invalid);
            }
        }

        else{
            if(userChoice.equals("s")){
                System.out.println(t + ccs + ucs);}
            else if (userChoice.equals("r")){
                System.out.println(w + ccs + ucr);}
            else if (userChoice.equals("p")){
                System.out.println(l + ccs + ucp);}
            else{
                System.out.println(invalid);
            }
        }

    }}
