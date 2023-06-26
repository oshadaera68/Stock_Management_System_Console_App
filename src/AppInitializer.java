import java.util.Scanner;

/**
 * coded by - eraboy
 * version - v1.0
 */
public class AppInitializer {
    // main method
    public static void main(String[] args) {
        logInConsole();
        mainMenuInput();
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
        } else {

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
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tWELCOME TO IJSE STOCK MANAGEMENT SYSTEM");
        System.out.println("\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.print("[1] Change the Credentials\t\t\t\t");
        System.out.println("[2] Supplier Manage");
        System.out.print("[3] Stock Manage\t\t\t\t\t\t");
        System.out.println("[4] Log Out");
        System.out.print("[5] Exit the system\t\t\t\t");
        System.out.println();
    }

    // input a number
    private static void mainMenuInput() {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                changeTheCredentials();
                break;
            case 2:
                supplierManageMenu();
                break;
            case 3:
                stockManageMenu();
                break;
            case 4:
                logOut();
                break;
            case 5:
                exitTheSystem();
                break;
            default:
                System.out.println("Invalid Number...Try again!!!");
        }
    }

    private static void exitTheSystem() {

    }

    private static void logOut() {

    }

    private static void stockManageMenu() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\t\t\t   STOCK MANAGE");
        System.out.println("\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");
    }

    private static void supplierManageMenu() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tSUPPLIER MANAGE");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");
    }

    private static void changeTheCredentials() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tCHANGE THE CREDENTIALS");
        System.out.println("\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");
    }
}
