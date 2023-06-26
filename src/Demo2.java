import java.util.Scanner;

/**
 * coded by - eraboy
 * version - v1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("User Name :  ");
        String username = input.next();

        username = "umayagk";
        int password = 1234;

        if (username.equals("umayagk")) {
            System.out.print("Password :  ");
            password = input.nextInt();

            if (password != 1234) {
                System.out.println("password is invalid.please try again! ");
            }


        } else {
            System.out.println("User name is invalid.please try again! ");
        }
    }

}
