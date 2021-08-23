import java.util.Scanner;

public class Main {
    public static void main(String args []){


        Scanner scan = new Scanner(System.in);
        String userChoice;

        String ccr = "\n\nComputer Choice: rock";
        String ccp = "\n\nComputer Choice: paper";
        String ccs = "\n\nComputer Choice: scissors";

        String ucr = "\t\tPlayer Choice: rock";
        String ucp = "\t\tPlayer Choice: paper";
        String ucs = "\t\tPlayer Choice: scissors";

        String w = "\nYou Win!";
        String l = "\nYou Lose!";
        String t = "\nDraw!";

        String invalid = "\nInvalid selection please play again.\n";

        int c = 0;
        int p = 0;

        System.out.println("\nChoose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors. To exit choose 'x'");

        /*All the contents above consist of variables that will stay constant throughout the program while it runs*/

        do{

            int cnc = (int) (Math.random() * 3);
            String numberIndex = "rps";
            String computerChoice = (numberIndex.substring(cnc, cnc+1));

        /*The randomizing of 'rps' must be added into the do while loop so that the value can be randomly
        shuffled every time it runs through the loop*/

            System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * *\n");
            System.out.println("Wins: " + p + " Losses: " + c + "\n");
            System.out.println("Players Choice:\n");

            userChoice = (scan.next());

        /*The contents above consist of strings that need to be refreshed after every round. It also consists of
        the scanner which must rescan the new user input in each round*/

            if(userChoice.equals("r")) {
                if (computerChoice.equals("r")) {
                    System.out.println(t + ccr + ucr);
                } else if (computerChoice.equals("p")) {
                    p++;
                    System.out.println(l + ccp + ucr);
                } else if (computerChoice.equals("s")) {
                    c++;
                    System.out.println(w + ccs + ucr);
                } else {
                    System.out.println(invalid);
                }
            }



            else if (userChoice.equals("p")) {
                if (computerChoice.equals("p")) {
                    System.out.println(t + ccp + ucp);
                } else if (computerChoice.equals("s")) {
                    p++;
                    System.out.println(l + ccs + ucp);
                } else if (computerChoice.equals("r")) {
                    c++;
                    System.out.println(w + ccr + ucp);
                } else {
                    System.out.println(invalid);
                }
            }


            else if (userChoice.equals("s")) {
                if (computerChoice.equals("s")) {
                    System.out.println(t + ccs + ucs);
                } else if (computerChoice.equals("r")) {
                    p++;
                    System.out.println(l + ccr + ucs);
                } else if (computerChoice.equals("p")) {
                    c++;
                    System.out.println(w + ccp + ucs);
                } else {
                    System.out.println(invalid);
                }
            }

        /*The components above run through if statements to evaluate any scenarios of the user input 'r', 'p'
        or 's'. If the value is not 'r', 'p', 's' or 'x' then it will return to the start of the do component
        of the loop*/

        }while (!userChoice.equals("x"));

        System.out.println("\nThank you for playing!");

        /*If the user choice is 'x' then the while component above will cause a breakout from the loop. It
        will then end the program with the closing statement*/

    }}