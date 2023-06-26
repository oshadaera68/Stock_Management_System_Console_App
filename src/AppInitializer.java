import java.util.Scanner;

/**
 * coded by - eraboy
 * version - v1.0
 */
public class AppInitializer {
    // main method
    public static void main(String[] args) {
        logInConsole();
    }

    //login to the system.
    private static void logInConsole() {
        Scanner usernameAndPassword = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tLOGIN PAGE");
        System.out.println("\t\t\t\t\t\t	                |");
        System.out.println("+-----------------------------------------------------------------------------------+");

        System.out.print("User Name:");
        String userName = usernameAndPassword.next();

        System.out.print("Password:");
        String password = usernameAndPassword.next();

        if (userName.equals("eraboy") && password.equals("1234")) {
            mainMenuConsole();
            clearWorkingConsole();
        }else{

        }
    }

    // clearing console.
    private static void clearWorkingConsole() {
        final String os = System.getProperty("os.name");
        try {
            if (os.equals("Linux")) {
                System.out.print("\033\143");
            } else if (os.equals("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            //handle the exception
            System.err.println(e.getMessage());
        }
    }

    // main menu.
    private static void mainMenuConsole() {

    }
}
