import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        logInApp();
        String[] id = new String[30];
        String[] name = new String[id.length];
        int[] prf = new int[id.length];
        int[] dbms = new int[id.length];
        input(id, name, prf, dbms);
    }

    public static void input(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter an option > ");
        int opNum = inputNum.nextInt();
        clearWorkingConsole();
        switch (opNum) {
            case 1:
                addNewStudent(id, name, prf, dbms);
                break;
            case 2:
                addNewStudentWithMarks(id, name, prf, dbms);
                break;
            case 3:
                addMarks(id, name, prf, dbms);
                break;
            case 4:
                updateStudentDetails(id, name, prf, dbms);
                break;
            case 5:
                updateMarks(id, name, prf, dbms);
                break;
            case 6:
                deleteStudent(id, name, prf, dbms);
                break;
            case 7:
                printStudentDetails(id, name, prf, dbms);
                break;
            case 8:
                printStudentRank(id, name, prf, dbms);
                break;
            case 9:
                bestInPrf(id, name, prf, dbms);
                break;
            case 10:
                bestInDbms(id, name, prf, dbms);
                break;
            default:
                System.out.println("Invalid Number...Try again!!!");
        }
    }

    //case 1
    public static void addNewStudent(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner inputAdd = new Scanner(System.in);

        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("----------------------------" + "\n|\t\t\t\t" + boldString + "Add New Student" + normalString + "\t\t\t\t|\n" + "---------------------------------");
        int indexValues = nextValues(id);
        l1:
        for (int i = indexValues; i < id.length; i++) {
            System.out.print("\nEnter Student Id:- ");
            String tempId = inputAdd.next();

            boolean stuIdFounded = false;
            for (int j = 0; j < id.length; j++) {
                if (tempId.equals(id[j])) {
                    System.out.println("The Student id was already exists");
                    stuIdFounded = true;
                    break;
                }
            }

            if (!stuIdFounded) {
                id[i] = tempId;
                System.out.print("Enter Student Name:- ");
                name[i] = inputAdd.next();
                System.out.print("Student has been added successfully. Do you want to add new student? [Y/N] :-  ");
                char c = inputAdd.next().charAt(0);
                switch (c) {
                    case 'y':
                    case 'Y':
                        clearWorkingConsole();
                        System.out.println("---------------------------------------------------------------------------------------------------------------");
                    default:
                        System.out.println("Incorrect Entry...! Please try again..");
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        getMenuConsole();
                        input(id, name, prf, dbms);
                        break;
                }
            }

            if (stuIdFounded) {
                i--;
            }
        }

    }

    // store values in the array
    public static int nextValues(String[] id) {
        int array = id.length;
        for (int i = 0; i < id.length; i++) {
            if (id[i] == null) {
                array = i;
                break;
            }
        }
        return array;
    }

    //case 2
    public static void addNewStudentWithMarks(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner input = new Scanner(System.in);

        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("----------------------------------------------" + "\n|\t\t\t" + boldString + "Add new student with marks" + normalString + "\t\t\t|\n" + "-------------------------------------------------------------");

        boolean b = true;
        while (b == true) {
            int indexValues = nextValues(id);
            for (int i = indexValues; i < id.length; i++) {
                System.out.print("\nEnter Student Id:- ");
                String tempId = input.next();

                boolean studentIdFound = false;
                for (int j = 0; j < id.length; j++) {
                    if (tempId.equals(id[j])) {
                        System.out.println("Student Id already exists");
                        studentIdFound = true;
                        break;
                    }
                }

                if (!studentIdFound) {
                    id[i] = tempId;

                    System.out.print("Enter Student Name:- ");
                    name[i] = input.next();
                    System.out.println();

                    do {
                        System.out.print("Programming Fundamental Score:- ");
                        prf[i] = input.nextInt();
                        if (prf[i] < 0 || prf[i] > 100) {
                            System.out.println("Entered invalid mark... please enter suitable mark.");
                        }
                    } while (prf[i] < 0 || prf[i] > 100);

                    do {
                        System.out.print("DBMS Marks:- ");
                        dbms[i] = input.nextInt();
                        if (dbms[i] < 0 || dbms[i] > 100) {
                            System.out.println("Entered invalid mark... please enter suitable mark.");
                        }
                    } while (dbms[i] < 0 || dbms[i] > 100);

                    System.out.println();
                    System.out.print("Student has been added successfully. Do you want to add new student? [Y/N] :-  ");
                    char ch = input.next().charAt(0);
                    switch (ch) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            System.out.println("---------------------------------------------------------------------------------------------------------------");
                        default:
                            System.out.println("Incorrect Entry...! Please try again..");
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            getMenuConsole();
                            input(id, name, prf, dbms);
                            break;
                    }
                }
                if (studentIdFound) {
                    i--;
                }
            }
        }
    }

    //case 3
    public static void addMarks(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner input = new Scanner(System.in);
        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("-------------------------------------------------" + "\n|\t\t\t" + boldString + "Add marks" + normalString + "\t\t\t|\n" + "-----------------------------------------------------------------------");
        System.out.println();

        char z;

        L1:
        for (int i = 0; i < id.length; i++) {
            System.out.print("Enter Student Id:- ");
            String tempStuId = input.next();

            L2:
            for (int j = 0; j < id.length; j++) {
                if (tempStuId.equals(id[j])) {
                    System.out.println("Student Name:-" + name[j]);

                    if (prf[j] == 0) {
                        do {
                            System.out.print("\nProgramming Fundamentals Marks:- ");
                            prf[j] = input.nextInt();
                            if (prf[j] < 0 || prf[j] > 100) {
                                System.out.println("Entered invalid mark... please enter suitable mark.");
                                System.out.println();
                            }
                        } while (prf[j] < 0 || prf[j] > 100);

                        do {
                            System.out.print("DBMS Marks:- ");
                            dbms[j] = input.nextInt();
                            if (dbms[j] < 0 || dbms[j] > 100) {
                                System.out.println("Entered invalid mark... please enter suitable mark.");
                                System.out.println();
                            }
                        } while (dbms[j] < 0 || dbms[j] > 100);

                        System.out.print("Marks has been added successfully. Do you want to add Marks for another student? [Y/N] :-  ");
                        char ch = input.next().charAt(0);
                        switch (ch) {
                            case 'y':
                            case 'Y':
                                clearWorkingConsole();
                                System.out.println("---------------------------------------------------------------------------------------------------------------");
                            default:
                                System.out.println("Incorrect Entry...! Please try again..");
                            case 'n':
                            case 'N':
                                clearWorkingConsole();
                                getMenuConsole();
                                input(id, name, prf, dbms);
                                break;
                        }
                        continue L1;

                    } else if (prf[j] != 0) {
                        System.out.println("This student's marks already exists..You want to update marks, please use option 4(update marks)..");
                        System.out.print("\nDo you want add marks for other student ? [Y/N]:- ");
                        z = input.next().charAt(0);
                        switch (z) {
                            case 'y':
                            case 'Y':
                                clearWorkingConsole();
                                System.out.println("---------------------------------------------------------------------------------------------------------------");
                            default:
                                System.out.println("Incorrect Entry...! Please try again..");
                            case 'n':
                            case 'N':
                                clearWorkingConsole();
                                getMenuConsole();
                                input(id, name, prf, dbms);
                                break;
                        }
                        i--;
                        continue L1;
                    }
                }
            }
            L3:
            if (!tempStuId.equals(id[i])) {
                System.out.print("You searched invalid student id. Do you want to search again? [Y/N]");
                z = input.next().charAt(0);
                switch (z) {
                    case 'y':
                    case 'Y':
                        clearWorkingConsole();
                        System.out.println("---------------------------------------------------------------------------------------------------------------");
                    default:
                        System.out.println("Incorrect Entry...! Please try again..");
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        getMenuConsole();
                        input(id, name, prf, dbms);
                        break;
                }
                break L3;
            }
        }
    }

    //case 4
    public static void updateStudentDetails(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner input = new Scanner(System.in);
        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("----------------------------------------------------" + "\n|\t\t\t" + boldString + "update student details" + normalString + "\t\t\t|\n" + "-----------------------------------------------------------------------------------------");
        System.out.println();

        L1:
        for (int i = 0; i < id.length; i++) {
            System.out.print("Enter Student Id : ");
            String tempStuId = input.next();

            char y;

            L2:
            for (int j = 0; j < id.length; j++) {
                if (tempStuId.equals(id[j])) {
                    System.out.println("Student name:- " + name[j]);
                    System.out.print("\nEnter the new student name:- ");
                    String tempStuName = input.next();
                    name[j] = tempStuName;
                    System.out.print("Student details has been updated successfully. \nDo you want to update other student details? [Y/N] :-  ");
                    char ch = input.next().charAt(0);
                    switch (ch) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            System.out.println("---------------------------------------------------------------------------------------------------------------");
                        default:
                            System.out.println("Incorrect Entry...! Please try again..");
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            getMenuConsole();
                            input(id, name, prf, dbms);
                            break;
                    }
                }
            }
            L3:
            if (!tempStuId.equals(id[i])) {
                System.out.print("You searched invalid student id. Do you want to search again? [Y/N]");
                y = input.next().charAt(0);
                switch (y) {
                    case 'y':
                    case 'Y':
                        clearWorkingConsole();
                        System.out.println("---------------------------------------------------------------------------------------------------------------");
                    default:
                        System.out.println("Incorrect Entry...! Please try again..");
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        getMenuConsole();
                        input(id, name, prf, dbms);
                        break;
                }
                break L3;
            }
        }
    }

    //case 5
    public static void updateMarks(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner input = new Scanner(System.in);
        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("----------------------------------------------------" + "\n|\t\t\t" + boldString + "update marks" + normalString + "\t\t\t|\n" + "-----------------------------------------------------------------------------------------");
        System.out.println();

        char y;
        L1:
        for (int i = 0; i < id.length; i++) {
            System.out.print("Enter Student ID : ");
            String tempStuId = input.next();

            L2:
            for (int j = 0; j < id.length; j++) {
                if (tempStuId.equals(id[j])) {
                    System.out.println("Student Name:-" + name[j]);

                    if (prf[j] != 0) {
                        System.out.println("\nProgramming Fundermental Marks:- " + prf[j]);
                        System.out.println("DBMS Marks:- " + dbms[j]);
                        do {
                            System.out.print("\nEnter new Programming Fundermental Marks:- ");
                            prf[j] = input.nextInt();
                            if (prf[j] < 0 || prf[j] > 100) {
                                System.out.println("Entered invalid mark... please enter suitable mark.");
                            }
                        } while (prf[j] < 0 || prf[j] > 100);

                        do {
                            System.out.print("\nEnter new DBMS Marks:- ");
                            dbms[j] = input.nextInt();
                            if (dbms[j] < 0 || dbms[j] > 100) {
                                System.out.println("Entered invalid mark... please enter suitable mark.");
                            }
                        } while (dbms[j] < 0 || dbms[j] > 100);
                    }
                    System.out.print("Marks has been updated successfully. Do you want to update Marks for other student? [Y/N] :-  ");
                    char ch = input.next().charAt(0);
                    switch (ch) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            System.out.println("---------------------------------------------------------------------------------------------------------------");
                        default:
                            System.out.println("Incorrect Entry...! Please try again..");
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            getMenuConsole();
                            input(id, name, prf, dbms);
                            break;
                    }
                    continue L1;
                }
                if (prf[j] == 0) {
                    System.out.print("\nThis student's marks yet to be added.\nDo you want to update the marks of other student? (Y/N) : ");
                    y = input.next().charAt(0);
                    switch (y) {
                        case 'y':
                        case 'Y':
                            break;
                        default:
                            System.out.println("Incorrect Entry...! Please try again..");
                            System.exit(0);
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            getMenuConsole();
                            input(id, name, prf, dbms);
                            break;
                    }
                    i--;
                    continue L1;
                }
            }
            L3:
            if (!tempStuId.equals(id[i])) {
                System.out.print("You searched invalid student id. Do you want to search again? (Y/N) : ");
                y = input.next().charAt(0);
                switch (y) {
                    case 'y':
                    case 'Y':
                        break;
                    default:
                        System.out.println("Incorrect Entry...! Please try again..");
                        System.exit(0);
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        getMenuConsole();
                        input(id, name, prf, dbms);
                        break;
                }
                i--;
                break L3;
            }
        }
    }

    //case 6
    public static void deleteStudent(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner input = new Scanner(System.in);
        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("----------------------------------------------------" + "\n|\t\t\t" + boldString + "delete student" + normalString + "\t\t\t|\n" + "-----------------------------------------------------------------------------------------");
        System.out.println();

        L1:
        for (int i = 0; i < id.length; i++) {

            System.out.print("Enter Student ID : ");
            String tempStuId = input.next();

            L2:
            for (int j = 0; j < id.length; j++) {

                if (tempStuId.equals(id[j])) {
                    for (int x = j; x < id.length - 1; x++) {
                        id[x] = id[x + 1];
                        name[x] = name[x + 1];
                        prf[x] = prf[x + 1];
                        dbms[x] = dbms[x + 1];
                    }
                    String[] tempId = new String[id.length - 1];
                    String[] tempStuName = new String[id.length - 1];
                    int[] tempPrf = new int[id.length - 1];
                    int[] tempDbms = new int[id.length - 1];

                    for (int l = 0; l < tempId.length; l++) {
                        tempId[l] = id[l];
                        tempStuName[l] = name[l];
                        tempPrf[l] = prf[l];
                        tempDbms[l] = dbms[l];
                    }
                    id = tempId;
                    name = tempStuName;
                    prf = tempPrf;
                    dbms = tempDbms;

                    System.out.print("Student has been deleted  sucesfully\nDo you want to delete another student? (Y/n) : ");
                    char ch = input.next().charAt(0);
                    switch (ch) {
                        case 'y':
                        case 'Y':
                            clearWorkingConsole();
                            System.out.println("-----------------------------------------------------------------------------------------" + "\n|\t\t\t\t\t" + boldString + "DELETE STUDENT" + normalString + "\t\t\t\t\t|\n" + "-----------------------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("Incorrect Entry...! Please try again..");
                            System.exit(0);
                        case 'n':
                        case 'N':
                            clearWorkingConsole();
                            getMenuConsole();
                            input(id, name, prf, dbms);
                            break;
                    }
                    continue L1;
                }
            }

            L3:
            if (!tempStuId.equals(id[i])) {
                System.out.print("You searched invalid student id. Do you want to search again? (Y/N) : ");
                char ch = input.next().charAt(0);
                switch (ch) {
                    case 'y':
                    case 'Y':
                        break;
                    default:
                        System.out.println("Incorrect Entry...! Please try again..");
                        System.exit(0);
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        getMenuConsole();
                        input(id, name, prf, dbms);
                        break;
                }
                i--;
                break L3;
            }
        }
    }

    //case 7
    public static void printStudentDetails(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner input = new Scanner(System.in);
        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("----------------------------------------------------" + "\n|\t\t\t" + boldString + "print student details" + normalString + "\t\t\t|\n" + "----------------------------------------------");
        System.out.println();
        int index = nextValues(id);

        int[] temp = studentSort(prf, dbms);
        int[] sTot = new int[id.length];
        double[] sAvg = new double[id.length];

        for (int i = 0; i < id.length; i++) {
            sTot[i] = prf[i] + dbms[i];
            sAvg[i] = sTot[i] / 2;
        }

        L1:
        for (int i = 0; i < id.length; i++) {

            System.out.print("Enter Student Id : ");
            String tempId = input.next();

            L2:
            for (int j = 0; j < id.length; j++) {

                if (tempId.equals(id[j])) {
                    System.out.println("Student Name : " + name[j]);
                    int tot = prf[j] + dbms[j];

                    if (tot == 0) {
                        System.out.print("Marks yet to be added\n");
                        System.out.print("Do you want to search other student details? (Y/N) ");
                        char ch = input.next().charAt(0);
                        switch (ch) {
                            case 'y':
                            case 'Y':
                                clearWorkingConsole();
                                break;
                            default:
                                System.out.println("Incorrect Entry...! Please try again..");
                                System.exit(0);
                            case 'n':
                            case 'N':
                                clearWorkingConsole();
                                getMenuConsole();
                                input(id, name, prf, dbms);
                                break;

                        }
                        continue L1;
                    }

                    for (int k = 0; k < temp.length; k++) {
                        if (tot == temp[k]) {
                            int a = (temp.length) - (k);

                            System.out.println("+---------------------------------------+----------------+");
                            System.out.print("|Programming Fundamental Marks\t\t|");
                            System.out.printf("%16d", prf[j]);
                            System.out.print("|\n|DBMS Marks\t\t|");
                            System.out.printf("%16d", dbms[j]);
                            System.out.print("|\n|Total Marks\t\t\t\t|");
                            System.out.printf("%16d", sTot[j]);
                            System.out.print("|\n|Avg. Marks\t\t\t\t|");
                            System.out.printf("%16.2f", sAvg[j]);
                            System.out.print("|\n|Rank\t\t\t\t\t|");
                            System.out.print("\t\t" + a);
                            System.out.print("|");
                            System.out.println("\n+---------------------------------------+----------------+");

                            System.out.print("Do you want search other student details? (Y/N) : ");
                            char YorN = input.next().charAt(0);
                            switch (YorN) {
                                case 'y':
                                case 'Y':
                                    clearWorkingConsole();
                                    System.out.println("------------------------------------------------------------------" + "\n|\t\t\t\t" + boldString + "print student details" + normalString + "\t\t\t\t\t|\n" + "------------------------------------------------");
                                    continue L1;
                                default:
                                    System.out.println("Incorrect Entry...! Please try again..");
                                    System.exit(0);
                                case 'n':
                                case 'N':
                                    clearWorkingConsole();
                                    getMenuConsole();
                                    input(id, name, prf, dbms);
                            }
                        }
                    }
                }
            }

            if (!tempId.equals(id[i])) {
                System.out.print("You searched invalid student id.\nDo you want to search again? (Y/N) : ");
                char ch = input.next().charAt(0);
                switch (ch) {
                    case 'y':
                    case 'Y':
                        continue L1;
                    default:
                        System.out.println("Incorrect Entry...! Please try again..");
                        System.exit(0);
                    case 'n':
                    case 'N':
                        clearWorkingConsole();
                        getMenuConsole();
                        input(id, name, prf, dbms);
                }
            }
        }
    }

    public static int[] studentSort(int[] prf, int[] dbms) {
        int[] total = new int[prf.length];

        for (int i = 0; i < prf.length; i++) {
            total[i] = prf[i] + dbms[i];
        }
        int[] x = new int[total.length];
        x = total;
        for (int j = 0; j < x.length - 1; j++) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    int t = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = t;
                }
            }
        }
        return x;
    }

    public static int[] sortArray(int[] total) {
        for (int i = total.length; i > 0; i--) {
            int min = total[0];
            int index = 0;
            for (int j = 1; j < i; j++) {
                if (total[j] < min) {
                    min = total[j];
                    index = j;
                }
            }
            total[index] = total[i - 1];
            total[i - 1] = min;
        }
        return total;
    }

    //case 8
    public static void printStudentRank(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner input = new Scanner(System.in);
        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("----------------------------------------------------" + "\n|\t\t\t" + boldString + "print student rank" + normalString + "\t\t\t|\n" + "-----------------------------------------------------------------------------------------");
        System.out.println();
        int[] temp = studentSort(prf, dbms);
        int[] total = new int[id.length];
        double[] sAvg = new double[id.length];

        System.out.println("+------+--------+----------------------+------------+-----------+");
        System.out.println("|Rank  |ID      |Name                  |Total Marks |Avg. Marks |");
        System.out.println("+------+--------+----------------------+------------+-----------+");

        for (int i = 0; i < id.length; i++) {
            total[i] = prf[i] + dbms[i];
            sAvg[i] = total[i] / 2;

        }
        int index = nextValues(id);

        L1:
        for (int i = 0; i < id.length; i++) {
            for (int k = 0; k < temp.length; k++) {
                if (total[i] == temp[k]) {
                    int a = (temp.length - 1) - (k);
                    if (total[i] == 0 && sAvg[i] == 0) {
                        continue L1;
                    }
                    System.out.printf("%s%-6d%s%-8s%s%-22s%s%12d%s%10.2f %s\n", "|", a, "|", id[i], "|", name[i], "|", total[i], "|", sAvg[i], "|");
                    break;
                }
            }
        }

        System.out.println("+------+--------+----------------------+------------+-----------+");
        System.out.println();
        System.out.print("Do you want to go back to main menu? (Y/N) : ");
        char ch = input.next().charAt(0);
        switch (ch) {
            case 'y':
            case 'Y':
                clearWorkingConsole();
                getMenuConsole();
                input(id, name, prf, dbms);
                break;
            default:
                System.out.println("Incorrect Entry...! Please try again..");
                System.exit(0);
            case 'n':
            case 'N':
                System.exit(0);
        }
    }

    public static int[] dbmsSort(int[] dbms) {
        int[] dbmsMark = new int[dbms.length];

        for (int i = 0; i < dbmsMark.length; i++) {
            dbmsMark[i] = dbms[i];
        }

        int[] temp = new int[dbmsMark.length];
        temp = dbmsMark;

        for (int j = 0; j < temp.length - 1; j++) {
            for (int i = 0; i < temp.length - 1; i++) {
                if (temp[i] > temp[i + 1]) {
                    int t = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = t;
                }
            }
        }
        return temp;
    }

    //case 9
    public static void bestInPrf(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner input = new Scanner(System.in);
        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("----------------------------------------------------" + "\n|\t\t\t" + boldString + "best in prf" + normalString + "\t\t\t|\n" + "----------------------------------------------");
        System.out.println();

        int index = nextValues(id);
        int[] temp = pfSort(prf);
        int[] pfMark = new int[index];

        for (int i = 0; i < pfMark.length; i++) {
            pfMark[i] = prf[i];
        }

        System.out.println();
        System.out.println("+-----+--------------------+----------+----------+");
        System.out.println("|ID   |Name                |PF Marks  |DBMS Marks|");
        System.out.println("+-----+--------------------+----------+----------+");

        L1:
        for (int i = temp.length - 1; i >= 0; i--) {
            for (int j = pfMark.length - 1; j >= 0; j--) {
                if (pfMark[j] == temp[i]) {
                    if (temp[i] == 0 && dbms[j] == 0) {
                        break L1;
                    }
                    System.out.printf("|%-5s|%-20s|%10d|%10d|\n", id[j], name[j], temp[i], dbms[j]);
                    break;
                }
            }
        }

        System.out.println("+-----+--------------------+----------+----------+");
        System.out.println();
        System.out.print("Do you want to go back to main menu? (Y/N) : ");
        char ch = input.next().charAt(0);
        switch (ch) {
            case 'y':
            case 'Y':
                clearWorkingConsole();
                getMenuConsole();
                input(id, name, prf, dbms);
                break;
            default:
                System.out.println("Incorrect Entry...! Please try again..");
                System.exit(0);
            case 'n':
            case 'N':
                System.exit(0);
        }
    }

    public static int[] pfSort(int[] prf) {
        int[] pfMark = new int[prf.length];
        for (int i = 0; i < pfMark.length; i++) {
            pfMark[i] = prf[i];
        }
        System.out.println(Arrays.toString(pfMark));
        int[] temp = new int[pfMark.length];
        temp = pfMark;
        for (int j = 0; j < temp.length - 1; j++) {
            for (int i = 0; i < temp.length - 1; i++) {
                if (temp[i] > temp[i + 1]) {
                    int t = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(temp));
        return temp;
    }

    //case 10
    private static void bestInDbms(String[] id, String[] name, int[] prf, int[] dbms) {
        Scanner input = new Scanner(System.in);

        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("----------------------------------------------" + "\n|\t\t\t" + boldString + "best in dbms" + normalString + "\t\t\t|\n" + "-------------------------------------------------------------");

        int index=nextValues(id);
        int []temp=dbmsSort(dbms);
        int[] pfMark=new int[index];
        String copyId[]=new String[20];
        String copyName[]=new String[20];

        for (int i = 0; i < pfMark.length ; i++){
            pfMark[i]=dbms[i];
            copyId[i]=id[i];
            copyName[i]=name[i];
        }

        System.out.println();

        System.out.println("+-----+--------------------+----------+----------+");
        System.out.println("|ID   |Name                |DBMS Marks|PF Marks  |");
        System.out.println("+-----+--------------------+----------+----------+");

        L1: for( int i=temp.length-1; i>=0 ; i--){
            for( int j=pfMark.length-1; j>=0; j--){

                if(pfMark[j]==temp[i]){
                    if(temp[i]==0&&prf[j]==0){break L1;}
                    System.out.printf("|%-5s|%-20s|%10d|%10d|\n",copyId[j],copyName[j],temp[i],prf[j]);
                    break;
                }
            }
        }

        System.out.println("+-----+--------------------+----------+----------+");
        System.out.println();

        System.out.print("Do you want to go back to main menu? (Y/N) : ");
        char ch=input.next().charAt(0);
        switch(ch){
            case 'y' :
            case 'Y' :clearWorkingConsole();getMenuConsole();input(id,name,prf,dbms);break;
            default :System.out.println("Sorry for removing you from the software due to an incorrect entry...!"); System.exit(0);
            case 'n' :
            case 'N' : System.exit(0);
        }
    }

    //Starting menu in Console App
    private static void getMenuConsole() {

        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("|%65s%23s\n", "+" + boldString + "WELCOME TO MINDARTLK MARKS MANAGEMENT SYSTEM - v0.1.0" + normalString + "+", "|");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("[1] Add New Student\t\t\t  [2] Add New Student With Marks");
        System.out.println("[3] Add Marks\t\t\t  [4] Update Student Details");
        System.out.println("[5] Update Marks\t\t\t  [6] Delete Student");
        System.out.println("[7] Print Student Details\t\t\t  [8] Print Student Rank");
        System.out.println("[9] Best in Programming Fundamentals\t\t\t  [10] Best in DBMS");
        System.out.println();
    }


    //Log in method
    public static void logInApp() {
        Scanner inputUserNameAndPassword = new Scanner(System.in);

        //bold and normal string
        String boldString = "\033[0;1m";
        String normalString = "\033[0;0m";

        String userName;
        String password;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("|%65s%23s\n", "+" + boldString + "WELCOME TO MINDARTLK MARKS MANAGEMENT SYSTEM - v0.1.0" + normalString + "+", "|");
        System.out.printf("|%50s%38s\n", "+" + boldString + "Log In Page" + normalString + "+", "|");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

        System.out.print("\t\tEnter User Name:-");
        userName = inputUserNameAndPassword.next();

        System.out.print("\t\tEnter User Password:-");
        password = inputUserNameAndPassword.next();

        if (password.equals("admin") && userName.equals("era")) {
            clearWorkingConsole();
            getMenuConsole();
        } else {
            while (true) {
                System.out.println("\t\t Try Again...!");

                System.out.print("\t\tEnter User Name:-");
                userName = inputUserNameAndPassword.next();

                System.out.print("\t\tEnter User Password:-");
                password = inputUserNameAndPassword.next();

                if (password.equals("admin") && userName.equals("era")) {
                    clearWorkingConsole();
                    getMenuConsole();
                    break;
                }
            }
        }
    }

    public final static void clearWorkingConsole() {
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
}