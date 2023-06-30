import java.util.Scanner;

/**
 * coded by - eraboy
 * version - v1.0
 */
public class AppInitializer {
    /*Static Arrays*/
    //password arrays
    public static String[] passwords = new String[1000];

    // supplier arrays
    public static String[] supplierIds = new String[1000];
    public static String[] supplierNames = new String[supplierIds.length];

    // Item category Array
    public static String[] itemCategoriesIds = new String[1000];
    public static String[] itemCategories = new String[itemCategoriesIds.length];

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
            System.out.println("Try Again..Please check the user name or password");
            clearWorkingConsole();
            logInConsole();
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
                supplierManageMenuConsole();
                break;
            case 3:
                stockManageMenuConsole();
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
                break;
        }
    }

    // exit the system
    private static void exitTheSystem() {
        Scanner exitNum = new Scanner(System.in);
        System.out.print("Did You exit the System?[Y/N] >");
        String yesNo = exitNum.next();
        switch (yesNo) {
            case "y":
            case "Y":
                System.exit(0);
                break;
            case "n":
            case "N":
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput();
                break;
            default:
                System.out.println("Invalid Value.. Try Again..!");
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput();
                break;
        }
    }

    // log out in the system
    private static void logOut() {

    }

    //stock manage menu
    private static void stockManageMenuConsole() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\t\t\t   STOCK MANAGEMENT");
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
                inputStockManageMenu();
                break;
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
            case "y":
            case "Y":
                clearWorkingConsole();
                mainMenuConsole();
                mainMenuInput();
                break;
            case "n":
            case "N":
                clearWorkingConsole();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Value.. Try Again..!");
                homePage();
                break;
        }
    }


    // view items
    private static void viewItems() {
    }

    // Get Items for supplier wise
    private static void getItemsSupplierWise() {
    }

    // add items
    private static void addItem() {
    }

    // manage item categories
    private static void manageItemCategories() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tMANAGE ITEM CATEGORY");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.print("[1] Add New Item Category \t\t\t\t");
        System.out.println("[2] Delete Item Category");
        System.out.print("[3] Update Item Category\t\t\t\t");
        System.out.println("[4] Stock Management");
        System.out.println();
        clearWorkingConsole();
        inputManageItemCategories(itemCategoriesIds, itemCategories);
    }

    // user inputs in manage item categories
    private static void inputManageItemCategories(String[] itemCategoryId, String[] itemCategory) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                addNewItemCategory(itemCategoryId, itemCategory);
                break;
            case 2:
                deleteItemCategory(itemCategoryId, itemCategory);
                break;
            case 3:
                updateItemCategory(itemCategoryId, itemCategory);
                break;
            case 4:
                stockManagement();
                break;
            default:
                System.out.println("Invalid Number...Please try again!!!");
                clearWorkingConsole();
                break;
        }
    }

    private static void stockManagement() {

    }

    private static void updateItemCategory(String[] itemCategoriesIds, String[] itemCategory) {
        Scanner updateCategory = new Scanner(System.in);
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.println("|");
        System.out.println("\t\t\t\t\t\t\t\tUPDATE ITEM CATEGORY");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        for (int i = 0; i < itemCategoriesIds.length; i++) {
            System.out.print("Enter The Item Category ID:");
            String tempItemCategoryId = updateCategory.next();
            char yesNo;

            //check exists the id before updating.
            if (!tempItemCategoryId.equals(itemCategoriesIds[i])) {
                System.out.println("Can't find item category Id. Try again..");
                System.out.print("Enter The Item Category ID:");
                updateCategory.next();
            }

            // validating the id for updating.
            for (int j = 0; j < itemCategoriesIds.length; j++) {
                if (tempItemCategoryId.equals(itemCategoriesIds[j])) {
                    System.out.println("Item Category Name:" + itemCategory[j]);
                    System.out.println();
                    System.out.print("Enter the new Supplier Name:");
                    String tempItemCategoryName = updateCategory.next();
                    itemCategory[j] = tempItemCategoryName;
                    System.out.print("Updated Successfully! Do You want to update another item category? [Y/N] >");
                    yesNo = updateCategory.next().charAt(0);
                    switch (yesNo) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            updateItemCategory(itemCategoriesIds, itemCategory);
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            manageItemCategories();
                            inputManageItemCategories(itemCategoriesIds, itemCategory);
                            break;
                        default:
                            System.out.println("Invalid Value.. Try Again..!");
                    }
                }
            }
        }
    }


    private static void deleteItemCategory(String[] itemCategoriesId, String[] itemCategory) {
        Scanner deleteCategory = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tDELETE ITEM CATEGORY");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        L1:
        for (int i = 0; i < itemCategoriesId.length; i++) {
            System.out.print("Enter The Item Category ID:");
            String tempItemCategoryId = deleteCategory.next();

            //check exists the id before deleting.
            if (!tempItemCategoryId.equals(itemCategoriesId[i])) {
                System.out.println("Can't find Item Category Id. Try again..");
                System.out.print("Enter The Item Category ID:");
                deleteCategory.next();
            }

            // inside loop
            for (int j = 0; j < itemCategoriesId.length; j++) {
                if (tempItemCategoryId.equals(itemCategoriesId[j])) {
                    for (int k = j; k < itemCategoriesId.length - 1; k++) {
                        itemCategoriesId[k] = itemCategoriesId[k + 1];
                        itemCategory[k] = itemCategory[k + 1];
                    }
                    String[] tempItemCateId = new String[itemCategoriesId.length - 1];
                    String[] tempItemCateName = new String[itemCategory.length - 1];

                    for (int l = 0; l < tempItemCateId.length; l++) {
                        tempItemCateId[l] = itemCategoriesId[l];
                        tempItemCateName[l] = itemCategory[l];
                    }
                    itemCategoriesId = tempItemCateId;
                    itemCategory = tempItemCateName;
                    System.out.print("Deleted Successfully. Do you want to delete another supplier? (Y/N) : ");
                    char ch = deleteCategory.next().charAt(0);
                    switch (ch) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            deleteItemCategory(itemCategoriesId, itemCategory);
                            break;
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            inputManageItemCategories(itemCategoriesId, itemCategory);
                            break;
                        default:
                            System.out.println("Invalid Number...Please try again!!!");
                            clearWorkingConsole();
                            mainMenuConsole();
                            mainMenuInput();
                    }
                    continue L1;
                }
            }
        }
    }


    private static void addNewItemCategory(String[] itemCategoriesId, String[] itemCategories) {
        Scanner addCategory = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tADD ITEM CATEGORY");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        int indexValues = nextIdValues(itemCategoriesId);
        for (int i = indexValues; i < itemCategoriesId.length; i++) {
            System.out.print("Item Category ID:");
            String tempId = addCategory.next();

            boolean itemCategoryIdFounded = false;
            for (int j = 0; j < itemCategoriesId.length; j++) {
                if (tempId.equals(itemCategoriesId[j])) {
                    System.out.println("Already Exists. try another Item category id!");
                    itemCategoryIdFounded = true;
                    break;
                }
            }

            if (!itemCategoryIdFounded) {
                itemCategoriesId[i] = tempId;
                System.out.print("Enter the New Item category:");
                itemCategories[i] = addCategory.next();
                System.out.print("Added Successfully! Do You want to add another Item Category? [Y/N] >");
                char c = addCategory.next().charAt(0);
                switch (c) {
                    case 'y':
                    case 'Y':
                        clearWorkingConsole();
                        addNewItemCategory(itemCategoriesId, itemCategories);
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        stockManageMenuConsole();
                        inputStockManageMenu();
                        break;
                    default:
                        System.out.println("Invalid Value.. Try Again..!");
                }
            }
        }
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
        inputSupplierManageMenu(supplierIds, supplierNames);
        clearWorkingConsole();
    }

    // user inputs in supplier manage menu
    private static void inputSupplierManageMenu(String[] supId, String[] supName) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option to continue > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                addSupplier(supId, supName);
                break;
            case 2:
                updateSupplier(supId, supName);
                break;
            case 3:
                deleteSupplier(supId, supName);
                break;
            case 4:
                viewSupplier(supId, supName);
                break;
            case 5:
                searchSupplier(supId, supName);
                break;
            case 6:
                /*I didn't create new method for navigating homepage.
                because we created this method before in using stock manage.*/
                homePage();
                break;
            default:
                System.out.println("Invalid Number...Please try again!!!");
                clearWorkingConsole();
                supplierManageMenuConsole();
                inputSupplierManageMenu(supId, supName);
                break;
        }
    }

    /*Crud Operations of Supplier Array*/
    //Search supplier
    private static void searchSupplier(String[] supId, String[] supName) {
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
            for (int i = 0; i < supId.length; i++) {
                if (tempSupplierId.equals(supId[i])) {
                    System.out.println("Supplier Name: " + supName[i]);
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
                searchSupplier(supId, supName);
                break;
            case 'n':
            case 'N':
                clearWorkingConsole();
                supplierManageMenuConsole();
                inputSupplierManageMenu(supId, supName);
                break;
            default:
                System.out.println("Invalid Value... Please try again!!!");
                mainMenuConsole();
                mainMenuInput();
        }
    }

    // view supplier
    private static void viewSupplier(String[] supId, String[] supName) {
        Scanner viewSupplier = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tVIEW SUPPLIER");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        System.out.println();
        System.out.println("+----------------------------------+-------------------------------------+");
        System.out.println("|\t\t\t\tSUPPLIER ID           |\t\t\t\tSUPPLIER NAME           |");
        System.out.println("+----------------------------------+-------------------------------------+");

        // Display supplier details in tabular format, excluding null values
        for (int i = 0; i < supId.length; i++) {
            if (supId[i] != null && supName[i] != null) {
                System.out.printf("|\t\t\t %-25s|\t\t\t %-25s|\n", supId[i], supName[i]);
            }
        }

        System.out.println("+----------------------------------+-------------------------------------+");
        System.out.println();
        System.out.print("Do you want to go to the supplier management menu? (Y/N) : ");
        char ch = viewSupplier.next().charAt(0);
        switch (ch) {
            case 'y':
            case 'Y':
                clearWorkingConsole();
                supplierManageMenuConsole();
                inputSupplierManageMenu(supId, supName);
                break;
            case 'n':
            case 'N':
                System.out.println("Exiting the program... Thank you!");
                System.exit(0);
            default:
                System.out.println("Invalid option. Please try again..");
                System.out.print("Do you want to go to the supplier management menu? (Y/N) : ");
                ch = viewSupplier.next().charAt(0);
        }
    }


    // delete supplier
    private static void deleteSupplier(String[] supId, String[] supName) {
        Scanner deleteSupplier = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tDELETE SUPPLIER");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        // main loop
        L1:
        for (int i = 0; i < supId.length; i++) {
            System.out.print("Supplier ID:");
            String tempSupplierId = deleteSupplier.next();

            //check exists the id before deleting.
            if (!tempSupplierId.equals(supId[i])) {
                System.out.println("Can't find supplier Id. Try again..");
                System.out.print("Supplier ID:");
                deleteSupplier.next();
            }

            // inside loop
            for (int j = 0; j < supId.length; j++) {
                if (tempSupplierId.equals(supId[j])) {
                    for (int k = j; k < supId.length - 1; k++) {
                        supId[k] = supId[k + 1];
                        supName[k] = supName[k + 1];
                    }
                    String[] tempSupId = new String[supId.length - 1];
                    String[] tempSupName = new String[supName.length - 1];

                    for (int l = 0; l < tempSupId.length; l++) {
                        tempSupId[l] = supId[l];
                        tempSupName[l] = supName[l];
                    }
                    supId = tempSupId;
                    supName = tempSupName;
                    System.out.print("Deleted Successfully. Do you want to delete another supplier? (Y/N) : ");
                    char ch = deleteSupplier.next().charAt(0);
                    switch (ch) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            deleteSupplier(supId, supName);
                            break;
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            supplierManageMenuConsole();
                            inputSupplierManageMenu(supId, supName);
                            break;
                        default:
                            System.out.println("Invalid Number...Please try again!!!");
                            clearWorkingConsole();
                            mainMenuConsole();
                            mainMenuInput();
                    }
                    continue L1;
                }
            }
        }
    }

    // update supplier
    private static void updateSupplier(String[] supId, String[] supName) {
        Scanner updateSupplier = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tUPDATE SUPPLIER");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        //main loop
        for (int i = 0; i < supId.length; i++) {
            System.out.print("Supplier ID:");
            String tempSupplierId = updateSupplier.next();
            char yesNo;

            //check exists the id before updating.
            if (!tempSupplierId.equals(supId[i])) {
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
                            updateSupplier(supId, supName);
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            supplierManageMenuConsole();
                            inputSupplierManageMenu(supId, supName);
                            break;
                        default:
                            System.out.println("Invalid Value.. Try Again..!");
                    }
                }
            }
        }
    }

    // add supplier
    private static void addSupplier(String[] supId, String[] supName) {
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
            for (int j = 0; j < supId.length; j++) {
                if (tempId.equals(supId[j])) {
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
                        addSupplier(supId, supName);
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        supplierManageMenuConsole();
                        inputSupplierManageMenu(supId, supName);
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
    private static void changeTheCredentials() {
        System.out.print("\n");
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\t\t\tCHANGE THE CREDENTIALS");
        System.out.println("\t\t\t\t\t\t|");
        System.out.println("+-------------------------------------------------------------------------------------------+");
    }
}