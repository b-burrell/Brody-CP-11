import java.util.Scanner;

public class Main {
    public static void main(String args []){

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter the word you would like to have mixed:\n");

        String ipt1 = (scan.nextLine());

        int iptl1 = (ipt1.length());

        System.out.println("\nY" + ipt1.substring(iptl1-2,iptl1) + ipt1.substring(0,iptl1-2) + "a");

        /*The first component of the program (above) starts by mixing the string that is inputted by the user.
        The inputted string has its last two values moved to the front, a 'Y' is moved to the start of
        the string and an 'a' is added to the end*/

        System.out.println("\nEnter the word you would like to have unmixed:\n");


        String ipt2 = (scan.nextLine());

        int iptl2 = (ipt2.length());

        System.out.println("\n" + ipt2.substring(3,iptl2-1) + ipt2.substring(1,3));

        /*The second component of the program (above) asks the user to input the mixed string that they want
        returned back to normal. The program will remove the 'Y' & 'a' and move the two values at the front
        back to the end of the string*/

    }
}
