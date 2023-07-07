import java.util.Arrays;
import java.util.Scanner;

/**
 * coded by - eraboy
 * version - v1.0
 */
public class AppInitializer {
    /*Static Arrays*/
    //user credential arrays
    public static String[] passwords = new String[1000];

    // supplier arrays
    public static String[] supplierIds = new String[1000];
    public static String[] supplierNames = new String[supplierIds.length];

    // Item category Array
    public static String[] itemCategories = new String[1000];

    public static String[][] items = new String[1000][7];
    public static int itemCount = 0;
    public static int supplierCount = 0;

    // main method
    public static void main(String[] args) {
        logInConsole(itemCategories, supplierIds, supplierNames, items);
    }

    //login to the system.
    private static void logInConsole(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner usernameAndPassword = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print(" \t\t\t\t\t\t\t\t LOGIN PAGE ");
        System.out.println("\t\t\t\t\t\t\t\t\t    |");
        System.out.println("+-----------------------------------------------------------------------------------+");

        boolean validCredentials = false;
        do {
            System.out.print("User Name:");
            String userName = usernameAndPassword.next();

            if (!userName.equals("eraboy")) {
                System.out.println("Invalid User name. Try again!");
            } else {
                validCredentials = true;
            }
        } while (!validCredentials);

        validCredentials = false;
        do {
            System.out.print("Password:");
            String password = usernameAndPassword.next();

            if (password.equals("1234") || Arrays.asList(passwords).contains(password)) {
                validCredentials = true;
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
            } else {
                System.out.println("Invalid Password. Try again!");
            }
        } while (!validCredentials);
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
            System.err.println(e.getMessage());
        }
    }

    // main menu.
    private static void mainMenuConsole() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\tWELCOME TO IJSE STOCK MANAGEMENT SYSTEM");
        System.out.println("\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.print("[1] Change the Credentials\t\t\t\t");
        System.out.println("[2] Supplier Manage");
        System.out.print("[3] Stock Manage\t\t\t\t\t\t");
        System.out.println("[4] Log Out");
        System.out.print("[5] Exit the system\t\t\t\t");
        System.out.println();
    }

    // input a number of main menu
    private static void mainMenuInput(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                changeTheCredentials(itemCategory, supIds, supNames, item);
                break;
            case 2:
                supplierManageMenuConsole();
                break;
            case 3:
                stockManageMenuConsole(itemCategory, supIds, supNames, item);
                break;
            case 4:
                logOut(true, itemCategory, supIds, supNames, item);
                break;
            case 5:
                exitTheSystem(itemCategory, supIds, supNames, item);
                break;
            default:
                System.out.println("Invalid Number...Please try again!!!");
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
                break;
        }
    }

    // exit the system
    private static void exitTheSystem(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner exitNum = new Scanner(System.in);
        System.out.print("Did You exit the System?[Y/N] >");
        String yesNo = exitNum.next();
        switch (yesNo) {
            case "y":
            case "Y":
                clearWorkingConsole();
                System.exit(0);
                break;
            case "n":
            case "N":
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
                break;
            default:
                System.out.println("Invalid Value.. Try Again..!");
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
                break;
        }
    }

    // log out in the system
    private static boolean logOut(boolean isLogOut, String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        if (isLogOut) {
            logInConsole(itemCategory, supIds, supNames, item);
            mainMenuInput(itemCategory, supIds, supNames, item);
        }
        return false;
    }

    //stock manage menu
    private static void stockManageMenuConsole(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\t\t STOCK MANAGEMENT");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.print("[1] Manage Item Categories \t\t\t\t");
        System.out.println("[2] Add Item");
        System.out.print("[3] Get Items Supplier Wise\t\t\t\t");
        System.out.println("[4] View Items");
        System.out.print("[5] Rank Items Per Unit Price\t\t\t");
        System.out.print("[6] Home Page");
        System.out.println();
        clearWorkingConsole();
        inputStockManageMenu(itemCategory, supIds, supNames, item);
    }

    // user inputs in stock manage menu
    private static void inputStockManageMenu(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                manageItemCategories(itemCategory, supIds, supNames, item);
                break;
            case 2:
                addItem(itemCategory, supIds, supNames, item);
                break;
            case 3:
                getItemsSupplierWise(itemCategory, supIds, supNames, item);
                break;
            case 4:
                viewItems();
                break;
            case 5:
                rankItemsPerUnitPrice();
                break;
            case 6:
                homePage(itemCategory, supIds, supNames, item);
                break;
            default:
                System.out.println("Invalid Number...Please try again!!!");
                clearWorkingConsole();
                inputStockManageMenu(itemCategory, supIds, supNames, item);
                stockManageMenuConsole(itemCategory, supIds, supNames, item);
                break;
        }
    }

    // navigating home page
    private static void homePage(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner exitNum = new Scanner(System.in);
        System.out.print("Did You want to go to the Home Page?[Y/N] >");
        String yesNo = exitNum.next();
        switch (yesNo) {
            case "y":
            case "Y":
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
                break;
            case "n":
            case "N":
                clearWorkingConsole();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Value.. Try Again..!");
                homePage(itemCategory, supIds, supNames, item);
                break;
        }
    }


    // Ranking unit prices in the items
    private static void rankItemsPerUnitPrice() {

    }

    // view items
    private static void viewItems() {
        // Print items in tabular format grouped by category
        String currentCategory = null;
        for (int i = 0; i < itemCategories.length; i++) {
            String category = itemCategories[i];
            String[] item = items[i];

            if (category != null && item != null) {
                if (!category.equals(currentCategory)) {
                    System.out.println(category + ":");
                    System.out.println("SID\tCODE\tDESC\tPRICE\tQTY");
                    currentCategory = category;
                }

                for (String field : item) {
                    System.out.print(field + "\t");
                }
                System.out.println();
            }
        }
    }

    /*Scanner scanner = new Scanner(System.in);

           String supplierId;
           boolean validSupplierId = false;

           while (!validSupplierId) {
               System.out.print("Enter Supplier Id: ");
               supplierId = scanner.nextLine();

               for (int i = 0; i < supplierIds.length; i++) {
                   if (supplierIds[i] != null && supplierIds[i].equals(supplierId)) {
                       System.out.println("Supplier Name: " + supplierNames[i]);
                       System.out.println("ITEM CODE\tDESCRIPTION\tUNIT PRICE\tQTY ON HAND\tCATEGORY");

                       for (int j = 0; j < items.length; j++) {
                           if (items[j][0] != null && items[j][0].equals(supplierId)) {
                               System.out.println(items[j][1] + "\t\t" + items[j][2] + "\t\t" + items[j][3] + "\t\t" +
                                       items[j][4] + "\t\t" + itemCategories[j]);
                           }
                       }

                       validSupplierId = true;
                       break;
                   }
               }

               if (!validSupplierId) {
                   System.out.println("Invalid supplier id. Please try again.");
               }
           }

           System.out.print("Search successfully! Do you want to perform another search? (Y/N) ");
           String anotherSearch = scanner.nextLine();

           if (anotherSearch.equalsIgnoreCase("Y")) {
               getItemsSupplierWise();
           }*/
    // Get Items for supplier wise
    /*private static void getItemsSupplierWise() {
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.println("|" + "\t\t\t\t\t\t\t\t\tGET ITEMS SUPPLIER WISE" +
                "\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        Scanner scanner = new Scanner(System.in);

        String supplierId;
        boolean validSupplierId = false;

        while (!validSupplierId) {
            System.out.print("Enter Supplier Id: ");
            supplierId = scanner.nextLine();

            for (int i = 0; i < itemCount; i++) {
                if (supplierIds[i] != null && supplierIds[i].equals(supplierId)) {
                    System.out.println("Supplier Name: " + supplierNames[i]);
                    System.out.println("ITEM CODE\tDESCRIPTION\tUNIT PRICE\tQTY ON HAND\tCATEGORY");

                    for (int j = 0; j < itemCount; j++) {
                        if (items[j][0] != null && items[j][0].equals(supplierId)) {
                            System.out.println(items[j][1] + "\t\t" + items[j][2] + "\t\t" + items[j][3] + "\t\t" +
                                    items[j][4] + "\t\t" + itemCategories[j]);
                        }
                    }

                    validSupplierId = true;
                    break;
                }
            }
            if (!validSupplierId) {
                System.out.println("Invalid supplier id. Please try again.");
            }
        }

        System.out.print("Search successfully! Do you want to perform another search? (Y/N) ");
        String anotherSearch = scanner.nextLine();

        if (anotherSearch.equalsIgnoreCase("Y")) {
            getItemsSupplierWise();
        }
    }*/
    /*private static void getItemsSupplierWise() {
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.println("|" + "\t\t\t\t\t\t\t\t\tGET ITEMS SUPPLIER WISE" +
                "\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        Scanner scanner = new Scanner(System.in);

        String supplierId;
        boolean validSupplierId = false;

        while (!validSupplierId) {
            System.out.print("Enter Supplier Id: ");
            supplierId = scanner.nextLine();

            boolean supplierFound = true;

            for (int i = 0; i < itemCount; i++) {
                if (items[i][0] != null && items[i][0].equals(supplierId)) {
                    if (supplierFound!=true) {
                        System.out.println("Supplier Name: " + getSupplierName(supplierId));
                        System.out.println("ITEM CODE\tDESCRIPTION\tUNIT PRICE\tQTY ON HAND\tCATEGORY");
                        supplierFound = true;
                    }
                    System.out.println(items[i][1] + "\t\t" + items[i][2] + "\t\t" + items[i][3] + "\t\t" +
                            items[i][4] + "\t\t" + itemCategories[i]);
                }
            }

            if (!supplierFound) {
                System.out.println("Invalid supplier id. Please try again.");
            } else {
                validSupplierId = true;
            }
        }

        System.out.print("Search successfully! Do you want to perform another search? (Y/N) ");
        String anotherSearch = scanner.nextLine();

        if (anotherSearch.equalsIgnoreCase("Y")) {
            getItemsSupplierWise();
        }
    }*/
    private static void getItemsSupplierWise(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.println("|" + "\t\t\t\t\t\t\t\t\tGET ITEMS SUPPLIER WISE" +
                "\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Supplier Id: ");
            String supplierId = scanner.nextLine();
            String supplierName = "";

            // Find the supplier name based on the supplier ID
            for (int i = 0; i < supIds.length; i++) {
                if (supIds[i] != null && supIds[i].equals(supplierId)) {
                    supplierName = supNames[i];
                    break;
                }
            }

            if (supplierName.isEmpty()) {
                System.out.println("Invalid supplier id. Please try again.");
                continue;
            }

            System.out.println("Supplier Name: " + supplierName);
            System.out.println("\nITEM CODE\tDESCRIPTION\tUNIT PRICE\tQTY ON HAND\tCATEGORY");
            boolean foundItems = false;

            // Display items for the specified supplier
            for (String[] items : items) {
                /*System.out.println(Arrays.toString(items));*/
                if (items[0] != null && items[1].equals(supplierId)) {
                    System.out.println(items[0] + "\t\t" + items[4] + "\t\t" + items[5] + "\t\t" + items[6] + "\t\t" + items[3]);
                    foundItems = true;
                }
            }

            if (!foundItems) {
                System.out.println("No items found for the specified supplier.");
            }

            System.out.print("\nSearch successfully! Do you want to perform another search? (Y/N): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    // add items
    private static void addItem(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner addItem = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print(" \t\t\t\t\t\t\t\t ADD ITEM ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |");
        System.out.println("+-----------------------------------------------------------------------------------+");

        // Check if item categories exist
        if (itemCategory[0] == null) {
            System.out.print("OOPS! It seems that you don't have any item categories in the system. " +
                    "Do you want to add a new item category? (Y/N) ");
            char addCategory = addItem.next().charAt(0);
            switch (addCategory) {
                case 'Y':
                case 'y':
                    clearWorkingConsole();
                    addNewItemCategory(itemCategory, supIds, supNames, item);
                case 'N':
                case 'n':
                    clearWorkingConsole();
                    mainMenuConsole();
                    mainMenuInput(itemCategory, supIds, supNames, item);
            }
        }

        // Check if suppliers exist
        if (supIds[0] == null) {
            System.out.print("OOPS! It seems that you don't have any suppliers in the system. " +
                    "Do you want to add a new supplier? (Y/N) ");
            char addSupplier = addItem.next().charAt(0);
            switch (addSupplier) {
                case 'Y':
                case 'y':
                    clearWorkingConsole();
                    addSupplier(itemCategory, supIds, supNames, item);
                case 'N':
                case 'n':
                    clearWorkingConsole();
                    mainMenuConsole();
                    mainMenuInput(itemCategory, supIds, supNames, item);
            }
        }

        // Continue with adding items
        System.out.print("Item Code: ");
        String itemCode = addItem.nextLine();

        // Check if the item code already exists
        for (int i = 0; i < itemCount; i++) {
            if (item[i][0] != null && item[i][0].equals(itemCode)) {
                System.out.println("Item with the same code already exists.");
                System.out.print("Item Code: ");
                itemCode = addItem.nextLine();
            }
        }

        // Display supplier details
        System.out.println("Suppliers list:");
        System.out.println();
        System.out.println("+----------------+---------------+--------------------------------+");
        System.out.println("|\t\t #      |\t\tSUPPLIER ID       |\t\tSUPPLIER NAME        |");
        System.out.println("+----------------+---------------+--------------------------------+");
        for (int i = 0; i < supIds.length; i++) {
            if (supIds[i] != null) {
                System.out.println("|" + (i + 1) + "|" + "\t" + supIds[i] + "|" + "\t\t" + supNames[i] + "|");
            }
        }

        System.out.print("Enter the supplier number > ");
        int supplierNumber = addItem.nextInt();
        addItem.nextLine();

        // Check if the selected supplier exists
        if (supplierNumber < 1 || supplierNumber > supIds.length || supIds[supplierNumber - 1] == null) {
            System.out.println("Invalid supplier number.");
            return;
        }

        // Get the item category name
        System.out.println("Item Categories:");
        System.out.println("#\tCategory Name");
        for (int i = 0; i < itemCategory.length; i++) {
            if (itemCategory[i] != null) {
                System.out.println((i + 1) + "\t" + itemCategory[i]);
            }
        }

        System.out.print("Enter the category number > ");
        int categoryNumber = addItem.nextInt();
        addItem.nextLine();

        // Check if the selected category exists
        if (categoryNumber < 1 || categoryNumber > itemCategory.length || itemCategory[categoryNumber - 1] == null) {
            System.out.println("Invalid category number.");
            return;
        }

        // Add item details
        System.out.print("Description: ");
        String description = addItem.nextLine();

        System.out.print("Unit price: ");
        double unitPrice = addItem.nextDouble();

        System.out.print("Qty on hand: ");
        int quantityOnHand = addItem.nextInt();
        addItem.nextLine(); // Consume newline character

       /* // Add item to the items array
        item[itemCount][0] = itemCode;
        item[itemCount][1] = supIds[supplierNumber - 1];
        item[itemCount][2] = supNames[supplierNumber - 1];
        item[itemCount][3] = itemCategory[categoryNumber - 1];
        item[itemCount][4] = description;
        item[itemCount][5] = String.valueOf(unitPrice);
        item[itemCount][6] = String.valueOf(quantityOnHand);
        itemCount++;

        System.out.println(Arrays.toString(new String[]{item[itemCount][0]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][1]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][2]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][3]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][4]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][5]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][6]}));*/

        // Add item to the items array
        item[itemCount][0] = itemCode;
        item[itemCount][1] = supIds[supplierNumber - 1];
        item[itemCount][2] = supNames[supplierNumber - 1];
        item[itemCount][3] = itemCategory[categoryNumber - 1];
        item[itemCount][4] = description;
        item[itemCount][5] = String.valueOf(unitPrice);
        item[itemCount][6] = String.valueOf(quantityOnHand);

        System.out.println(Arrays.toString(new String[]{item[itemCount][0]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][1]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][2]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][3]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][4]}));
        System.out.println(Arrays.toString(new String[]{item[itemCount][5]}));

        itemCount++; // Increment itemCount after accessing the array

        System.out.print("Item added successfully! Do you want to add another Item? (Y/N) ");
        char addAnotherItem = addItem.next().charAt(0);
        switch (addAnotherItem) {
            case 'Y':
            case 'y':
                clearWorkingConsole();
                addItem(itemCategory, supIds, supNames, item);
            case 'N':
            case 'n':
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
        }
    }


    // manage item categories
    private static void manageItemCategories(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tMANAGE ITEM CATEGORY");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.print("[1] Add New Item Category \t\t\t\t");
        System.out.println("[2] Delete Item Category");
        System.out.print("[3] Update Item Category\t\t\t\t");
        System.out.println("[4] Stock Management");
        System.out.println();
        clearWorkingConsole();
        inputManageItemCategories(itemCategory, supIds, supNames, item);
    }

    // user inputs in manage item categories
    private static void inputManageItemCategories(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                addNewItemCategory(itemCategory, supIds, supNames, item);
                break;
            case 2:
                deleteItemCategory(itemCategory, supIds, supNames, item);
                break;
            case 3:
                updateItemCategory(itemCategory, supIds, supNames, item);
                break;
            case 4:
                stockManagement(itemCategory, supIds, supNames, item);
                break;
            default:
                System.out.println("Invalid Number...Please try again!!!");
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
                break;
        }
    }

    private static void stockManagement(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        stockManageMenuConsole(itemCategory, supIds, supNames, item);
        inputManageItemCategories(itemCategory, supIds, supNames, item);
    }

    private static void updateItemCategory(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner updateCategory = new Scanner(System.in);
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.println("|");
        System.out.println("\t\t\t\t\t\t\t\tUPDATE ITEM CATEGORY");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.print("Enter the Item Category Name to update: ");
        String categoryToUpdate = updateCategory.nextLine();
        int index = -1;

        // Check if the category name exists before updating.
        for (int i = 0; i < itemCategory.length; i++) {
            if (categoryToUpdate.equalsIgnoreCase(itemCategory[i])) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Item Category not found. Try again.");
            updateItemCategory(itemCategory, supIds, supNames, item);
            return;
        }

        System.out.println("Current Item Category Name: " + itemCategory[index]);
        System.out.print("Enter the new Item Category Name: ");
        String newCategoryName = updateCategory.nextLine();
        itemCategory[index] = newCategoryName;

        System.out.print("Updated Successfully! Do you want to update another item category? [Y/N] > ");
        char yesNo = updateCategory.next().charAt(0);

        switch (yesNo) {
            case 'y':
            case 'Y':
                clearWorkingConsole();
                updateItemCategory(itemCategory, supIds, supNames, item);
                break;
            case 'n':
            case 'N':
                clearWorkingConsole();
                manageItemCategories(itemCategory, supIds, supNames, item);
                inputManageItemCategories(itemCategory, supIds, supNames, item);
                break;
            default:
                System.out.println("Invalid Value. Try Again.");
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
                break;
        }
    }


    // delete item category
    private static void deleteItemCategory(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner deleteCategory = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tDELETE ITEM CATEGORY");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        L1:
        while (true) {
            System.out.print("Enter The Item Category Name: ");
            String tempItemCategoryName = deleteCategory.next();

            boolean found = false;
            for (int i = 0; i < itemCategory.length; i++) {
                if (tempItemCategoryName.equalsIgnoreCase(itemCategory[i])) {
                    found = true;
                    for (int j = i; j < itemCategory.length - 1; j++) {
                        itemCategory[j] = itemCategory[j + 1];
                    }
                    itemCategory = Arrays.copyOf(itemCategory, itemCategory.length - 1);
                    System.out.print("Deleted Successfully. Do you want to delete another category? (Y/N): ");
                    char ch = deleteCategory.next().charAt(0);
                    switch (ch) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            deleteItemCategory(itemCategory, supIds, supNames, item);
                            break;
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            manageItemCategories(itemCategory, supIds, supNames, item);
                            inputManageItemCategories(itemCategory, supIds, supNames, item);
                            break L1;
                        default:
                            System.out.println("Invalid input. Please try again!");
                            clearWorkingConsole();
                            mainMenuConsole();
                            mainMenuInput(itemCategory, supIds, supNames, item);
                            break L1;
                    }
                }
            }
        }
    }

    // add item category
    private static void addNewItemCategory(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner addCategory = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tADD ITEM CATEGORY");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        int index = nextEmptyIndex(itemCategories);
        if (index != -1) {
            System.out.print("Enter the New Item Category: ");
            String newCategory = addCategory.nextLine();

            boolean categoryExists = false;
            for (String category : itemCategories) {
                if (newCategory.equalsIgnoreCase(category)) {
                    System.out.println("Category already exists. Try another item category!");
                    categoryExists = true;
                    break;
                }
            }

            if (!categoryExists) {
                itemCategories[index] = newCategory;
                System.out.print("Added successfully! Do you want to add another item category? [Y/N] > ");
                char choice = addCategory.nextLine().charAt(0);
                switch (choice) {
                    case 'y':
                    case 'Y':
                        clearWorkingConsole();
                        addNewItemCategory(itemCategory, supIds, supNames, item);
                        break;
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        manageItemCategories(itemCategory, supIds, supNames, item);
                        inputManageItemCategories(itemCategory, supIds, supNames, item);
                        break;
                    default:
                        System.out.println("Invalid value. Try again!");
                }
            }
        }
    }

    // checking the empty of item categories array.
    private static int nextEmptyIndex(String[] itemCategories) {
        for (int i = 0; i < itemCategories.length; i++) {
            if (itemCategories[i] == null || itemCategories[i].isEmpty()) {
                return i;
            }
        }
        return -1;
    }

    //supplier manage menu
    private static void supplierManageMenuConsole() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\t\tSUPPLIER MANAGE");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.print("[1] Add Supplier \t\t\t\t");
        System.out.println("[2] Update Supplier");
        System.out.print("[3] Delete Supplier\t\t\t\t");
        System.out.println("[4] View Suppliers");
        System.out.print("[5] Search Supplier\t\t\t\t");
        System.out.print("[6] Home Page");
        System.out.println();
        inputSupplierManageMenu(itemCategories, supplierIds, supplierNames, items);
        clearWorkingConsole();
    }

    // user inputs in supplier manage menu
    private static void inputSupplierManageMenu(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                addSupplier(itemCategory, supIds, supNames, item);
                break;
            case 2:
                updateSupplier(itemCategory, supIds, supNames, item);
                break;
            case 3:
                deleteSupplier(itemCategory, supIds, supNames, item);
                break;
            case 4:
                viewSupplier(itemCategory, supIds, supNames, item);
                break;
            case 5:
                searchSupplier(itemCategory, supIds, supNames, item);
                break;
            case 6:
                /*I didn't create new method for navigating homepage.
                because we created this method before in using stock manage.*/
                homePage(itemCategory, supIds, supNames, item);
                break;
            default:
                System.out.println("Invalid Number...Please try again!!!");
                clearWorkingConsole();
                supplierManageMenuConsole();
                inputSupplierManageMenu(itemCategory, supIds, supNames, item);
                break;
        }
    }

    /*Crud Operations of Supplier Array*/
    //Search supplier
    private static void searchSupplier(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner searchSupplier = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tSEARCH SUPPLIER");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        // validating supplier id for using boolean variable
        boolean validSupplierId = false;

        // main loop
        while (!validSupplierId) {
            System.out.print("Supplier ID: ");
            String tempSupplierId = searchSupplier.next();
            boolean supplierFound = false;

            // inner loop
            for (int i = 0; i < supIds.length; i++) {
                if (tempSupplierId.equals(supIds[i])) {
                    System.out.println("Supplier Name: " + supNames[i]);
                    supplierFound = true;
                    break;
                }
            }

            if (!supplierFound) {
                System.out.println("Supplier ID not found. Please try again.");
            } else {
                validSupplierId = true;
            }
        }

        System.out.print("Searched Successfully.. Do you want to search for another supplier? [Y/N]: ");
        char ch = searchSupplier.next().charAt(0);
        switch (ch) {
            case 'y':
            case 'Y':
                clearWorkingConsole();
                searchSupplier(itemCategory, supIds, supNames, item);
                break;
            case 'n':
            case 'N':
                clearWorkingConsole();
                supplierManageMenuConsole();
                inputSupplierManageMenu(itemCategory, supIds, supNames, item);
                break;
            default:
                System.out.println("Invalid Value... Please try again!!!");
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
        }
    }

    // view supplier
    private static void viewSupplier(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner viewSupplier = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tVIEW SUPPLIER");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.println();
        System.out.println("+------------------------------------+--------------------------------------+");
        System.out.println("|\t\t\t\tSUPPLIER ID          |\t\t\t\tSUPPLIER NAME           |");
        System.out.println("+------------------------------------+--------------------------------------+");

        for (int i = 0; i < supIds.length; i++) {
            if (supIds[i] != null && supNames[i] != null) {
                System.out.printf("|\t\t\t %-25s|\t\t\t %-25s|\n", supIds[i], supNames[i]);
            }
        }
        char ch;
        System.out.println("+------------------------------------+---------------------------------------");
        System.out.println();
        System.out.print("Do you want to go to the supplier management menu? (Y/N) : ");
        ch = viewSupplier.next().charAt(0);
        switch (ch) {
            case 'y':
            case 'Y':
                clearWorkingConsole();
                supplierManageMenuConsole();
                inputSupplierManageMenu(itemCategory, supIds, supNames, item);
                break;
            case 'n':
            case 'N':
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput(itemCategory, supIds, supNames, item);
            default:
                System.out.println("Invalid option. Please try again..");
                System.exit(0);
        }
    }


    // delete supplier
    private static void deleteSupplier(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner deleteSupplier = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tDELETE SUPPLIER");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        // main loop
        L1:
        for (int i = 0; i < supIds.length; i++) {
            System.out.print("Supplier ID:");
            String tempSupplierId = deleteSupplier.next();

            //check exists the id before deleting.
            if (!tempSupplierId.equals(supIds[i])) {
                System.out.println("Can't find supplier Id. Try again..");
                System.out.print("Supplier ID:");
                deleteSupplier.next();
            }

            // inside loop
            for (int j = 0; j < supIds.length; j++) {
                if (tempSupplierId.equals(supIds[j])) {
                    for (int k = j; k < supIds.length - 1; k++) {
                        supIds[k] = supIds[k + 1];
                        supNames[k] = supNames[k + 1];
                    }
                    String[] tempSupId = new String[supIds.length - 1];
                    String[] tempSupName = new String[supNames.length - 1];

                    for (int l = 0; l < tempSupId.length; l++) {
                        tempSupId[l] = supIds[l];
                        tempSupName[l] = supNames[l];
                    }
                    supIds = tempSupId;
                    supNames = tempSupName;
                    System.out.print("Deleted Successfully. Do you want to delete another supplier? (Y/N) : ");
                    char ch = deleteSupplier.next().charAt(0);
                    switch (ch) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            deleteSupplier(itemCategory, supIds, supNames, item);
                            break;
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            supplierManageMenuConsole();
                            inputSupplierManageMenu(itemCategory, supIds, supNames, item);
                            break;
                        default:
                            System.out.println("Invalid Number...Please try again!!!");
                            clearWorkingConsole();
                            mainMenuConsole();
                            mainMenuInput(itemCategory, supIds, supNames, item);
                    }
                    continue L1;
                }
            }
        }
    }

    // update supplier
    private static void updateSupplier(String[] itemCategory, String[] supId, String[] supName, String[][] item) {
        Scanner updateSupplier = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tUPDATE SUPPLIER");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        //main loop
        for (String s : supId) {
            System.out.print("Supplier ID:");
            String tempSupplierId = updateSupplier.next();
            char yesNo;

            //check exists the id before updating.
            if (!tempSupplierId.equals(s)) {
                System.out.println("Can't find supplier Id. Try again..");
                System.out.print("Supplier ID:");
                updateSupplier.next();
            }

            // validating the id for updating.
            for (int j = 0; j < supId.length; j++) {
                if (tempSupplierId.equals(supId[j])) {
                    System.out.println("Supplier Name:" + supName[j]);
                    System.out.println();
                    System.out.print("Enter the new Supplier Name:");
                    String tempSupplierName = updateSupplier.next();
                    supName[j] = tempSupplierName;
                    System.out.print("Updated Successfully! Do You want to update another supplier? [Y/N] >");
                    yesNo = updateSupplier.next().charAt(0);
                    switch (yesNo) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            updateSupplier(itemCategory, supId, supName, item);
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            supplierManageMenuConsole();
                            inputSupplierManageMenu(itemCategory, supId, supName, item);
                            break;
                        default:
                            System.out.println("Invalid Value.. Try Again..!");
                    }
                }
            }
        }
    }

    // add supplier
    private static void addSupplier(String[] itemCategory, String[] supId, String[] supName, String[][] item) {
        Scanner inputSupplier = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tADD SUPPLIER");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        int indexValues = nextIdValues(supId);
        for (int i = indexValues; i < supId.length; i++) {
            System.out.print("Supplier ID:");
            String tempId = inputSupplier.next();

            boolean supIdFounded = false;
            for (String s : supId) {
                if (tempId.equals(s)) {
                    System.out.println("Already Exists. try another supplier id!");
                    supIdFounded = true;
                    break;
                }
            }

            if (!supIdFounded) {
                supId[i] = tempId;
                System.out.print("Supplier Name:");
                supName[i] = inputSupplier.next();
                System.out.print("Added Successfully! Do You want to add another supplier? [Y/N] >");
                char c = inputSupplier.next().charAt(0);
                switch (c) {
                    case 'y':
                    case 'Y':
                        clearWorkingConsole();
                        addSupplier(itemCategory, supId, supName, item);
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        supplierManageMenuConsole();
                        inputSupplierManageMenu(itemCategory, supId, supName, item);
                        break;
                    default:
                        System.out.println("Invalid Value.. Try Again..!");
                }
            }
        }
    }

    // store values in the array
    public static int nextIdValues(String[] id) {
        int array = id.length;
        for (int i = 0; i < id.length; i++) {
            if (id[i] == null) {
                array = i;
                break;
            }
        }
        return array;
    }

    // change credentials
    private static void changeTheCredentials(String[] itemCategory, String[] supIds, String[] supNames, String[][] item) {
        Scanner changeCredentials = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\t\tCREDENTIAL MANAGE");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        boolean validCredentials = false;
        int attemptCount = 0;
        int maxAttempts = 10;

        do {
            System.out.print("Please Enter the user name to verify it's you: ");
            String username = changeCredentials.next();

            if (!username.equals("eraboy")) {
                System.out.println("Invalid User name. Try again!");
                System.out.println();
                attemptCount++;

                if (attemptCount >= maxAttempts) {
                    System.out.println("Max attempts exceeded. Exiting the program.");
                    System.exit(0);
                }
            } else {
                System.out.println("Hey " + username);
                System.out.print("Enter your current password: ");
                String password = changeCredentials.next();

                if (password.equals("1234") || password.equals(passwords[password.length()])) {
                    System.out.print("Enter your new password: ");
                    String newPassword = changeCredentials.next();
                    passwords[newPassword.length()] = newPassword;
                    System.out.println("Password changed successfully!");
                    System.out.print("Do you want to go home page? (Y/N):");
                    char c = changeCredentials.next().charAt(0);

                    switch (c) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            mainMenuConsole();
                            mainMenuInput(itemCategory, supIds, supNames, item);
                            break;
                        case 'n':
                        case 'N':
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid Value. Try Again!");
                            break;
                    }
                } else {
                    System.out.println("Invalid Password. Try again!");
                    System.out.println();
                }
            }
        } while (!validCredentials);
    }
}