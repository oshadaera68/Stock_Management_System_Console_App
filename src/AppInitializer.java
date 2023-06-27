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

    // input a number of main menu
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
                System.out.println("Invalid Number...Please try again!!!");
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput();
        }
    }

    // exit the system
    private static void exitTheSystem() {
        Scanner exitNum = new Scanner(System.in);

        System.out.print("Did You exit the System?[Y/N] >");
        String yesNo = exitNum.next();
        switch (yesNo) {
            case "Y":
                System.exit(0);
                break;
            case "N":
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput();
                break;
            default:
                System.out.println("Invalid Value.. Try Again..!");
                break;
        }
    }

    // log out in the system
    private static void logOut() {

    }

    //stock manage menu
    private static void stockManageMenu() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\t\t\t   STOCK MANAGE");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.print("[1] Manage Item Categories \t\t\t\t");
        System.out.println("[2] Add Item");
        System.out.print("[3] Get Items Supplier Wise\t\t\t\t");
        System.out.println("[4] View Items");
        System.out.print("[5] Rank Items Per Unit Price\t\t");
        System.out.print("[6] Home Page");
        System.out.println();
        clearWorkingConsole();
        inputStockManageMenu();
    }

    // user inputs in stock manage menu
    private static void inputStockManageMenu() {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                manageItemCategories();
                break;
            case 2:
                addItem();
                break;
            case 3:
                getItemsSupplierWise();
                break;
            case 4:
                viewItems();
                break;
            case 5:
                rankItemsPerUnitPrice();
                break;
            case 6:
                homePage();
                break;
            default:
                System.out.println("Invalid Number...Please try again!!!");
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput();
        }
    }

    private static void rankItemsPerUnitPrice() {
    }

    // navigating home page
    private static void homePage() {
        Scanner exitNum = new Scanner(System.in);

        System.out.print("Did You want to go to the Home Page?[Y/N] >");
        String yesNo = exitNum.next();
        switch (yesNo) {
            case "Y":
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput();
                break;
            case "N":
                clearWorkingConsole();
                stockManageMenu();
                inputStockManageMenu();
                break;
            default:
                System.out.println("Invalid Value.. Try Again..!");
                break;
        }

        clearWorkingConsole();
        mainMenuConsole();
        mainMenuInput();
    }

    private static void viewItems() {
    }

    private static void getItemsSupplierWise() {
    }

    private static void addItem() {
    }

    private static void manageItemCategories() {
    }

    //supplier manage menu
    private static void supplierManageMenu() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tSUPPLIER MANAGE");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");
    }

    // change credentials
    private static void changeTheCredentials() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tCHANGE THE CREDENTIALS");
        System.out.println("\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");
    }
}
