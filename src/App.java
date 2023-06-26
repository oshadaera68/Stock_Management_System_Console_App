import java.util.Scanner;

/**
 * coded by - eraboy
 * version - v1.0
 */
public class App {
    public static String IDSearch(String sIDNum){
        Scanner input=new Scanner(System.in);
        L4:while (true){
            System.out.print("Enter Student ID : ");
            sIDNum=input.nextLine();

            char[] charArray=sIDNum.toCharArray();
            if (charArray.length!=4){
                System.out.println("Incorrect ID");
                System.out.print("\n");
                continue L4;
            }
            char sIDNumDigit1=sIDNum.charAt(0);
            char sIDNumDigit2=sIDNum.charAt(1);
            char sIDNumDigit3=sIDNum.charAt(2);
            char sIDNumDigit4=sIDNum.charAt(3);
            if (sIDNumDigit1!='S'){
                System.out.println("Incorrect ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit2<48){
                System.out.println("Incorrect ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit2>57){
                System.out.println("Incorrect ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit3<48){
                System.out.println("Incorrect ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit3>57){
                System.out.println("Incorrect ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit4<48){
                System.out.println("Incorrect ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit4>57){
                System.out.println("Incorrect ID");
                System.out.print("\n");
                continue L4;
            }
            return sIDNum;
        }
    }

    public static char isYesOrNo(char option){
        Scanner input=new Scanner(System.in);
        L6:while(true){
            System.out.print("Student has been addedsuccessfully. Do you want to add a new student (Y/N) : ");
            option = input.next().charAt(0);
            if(option!='Y' && option!='N'){
                System.out.println("Wrong selection!");
                continue L6;
            }
            return option;
        }
    }
    public static char isYesOrNoDelete(char option){
        Scanner input=new Scanner(System.in);
        L6:while(true){
            System.out.print("Do you want to delete a new student (Y/N) : ");
            option = input.next().charAt(0);
            if(option!='Y' && option!='N'){
                System.out.println("Wrong selection!");
                continue L6;
            }
            return option;
        }
    }
    public static char isYesOrNoBestInPRO(char option){
        Scanner input=new Scanner(System.in);
        L6:while(true){
            System.out.print("Do you want to go back to main menu(Y/N) : ");
            option = input.next().charAt(0);
            if(option!='Y' && option!='N'){
                System.out.println("Wrong selection!");
                continue L6;
            }
            return option;
        }
    }
    public static char isYesOrNoPrintDetils(char option){
        Scanner input=new Scanner(System.in);
        L6:while(true){
            System.out.print("Do you want to search another student details? (Y/N) : ");
            option = input.next().charAt(0);
            if(option!='Y' && option!='N'){
                System.out.println("Wrong selection!");
                continue L6;
            }
            return option;
        }
    }

    public static char isYesOrNoAddMark(char option){
        Scanner input=new Scanner(System.in);
        L6:while(true){
            System.out.print("Do you want to search again? (Y/N) : ");
            option = input.next().charAt(0);
            if(option!='Y' && option!='N'){
                System.out.println("Wrong selection!");
                continue L6;
            }
            return option;
        }
    }

    public static char isYesOrNoUpdateStudent(char option){
        Scanner input=new Scanner(System.in);
        L6:while(true){
            System.out.print("Do you want to update another student details? (Y/N) : ");
            option = input.next().charAt(0);
            if(option!='Y' && option!='N'){
                System.out.println("Wrong selection!");
                continue L6;
            }
            return option;
        }
    }
    public static char isSure(char option){
        Scanner input=new Scanner(System.in);
        L6:while(true){
            System.out.print("Are you sure you want to remove this? (Y/N) : ");
            option = input.next().charAt(0);
            if(option!='Y' && option!='N'){
                System.out.println("Wrong selection!");
                continue L6;
            }
            return option;
        }
    }


    public static char isYesOrNoUpdateMarks(char option){
        Scanner input=new Scanner(System.in);
        L6:while(true){
            System.out.print("Do you want to update marks for another student? (Y/N) : ");
            option = input.next().charAt(0);
            if(option!='Y' && option!='N'){
                System.out.println("Wrong selection!");
                continue L6;
            }
            return option;
        }
    }

    public static int prfMarkCheck(int prfmark){
        Scanner input=new Scanner(System.in);
        L2:while (true){
            System.out.print("Programming Fundamentals Marks : ");
            prfmark = input.nextInt();

            if(prfmark<=0){
                System.out.print("Invalid marks, please enter correct marks.");
                System.out.println("\n");
                continue L2;
            }
            if (prfmark>100){
                System.out.print("Invalid marks, please enter correct marks.");
                System.out.println("\n");
                continue L2;
            }
            return prfmark;
        }
    }
    public static int dbmsMarkCheck(int dbmsmark){
        Scanner input=new Scanner(System.in);
        L3:while (true){
            System.out.print("Database Managment System Marks : ");
            dbmsmark = input.nextInt();

            if(dbmsmark<=0){
                System.out.print("Invalid marks, please enter correct marks.");
                System.out.println("\n");
                continue L3;
            }
            if (dbmsmark>100){
                System.out.print("Invalid marks, please enter correct marks.");
                System.out.println("\n");
                continue L3;
            }
            return dbmsmark;
        }
    }

    public static int prfNullMark(){
        int prfNullMark = -1;
        return prfNullMark;
    }

    public static String IDCheck2(String sIDNum){
        Scanner input=new Scanner(System.in);

        L4:while (true){

            System.out.print("Enter Student ID : ");
            sIDNum=input.nextLine();
            c++;
            char[] charArray=sIDNum.toCharArray();
            if (charArray.length!=4){
                System.out.println("Incorrect Student ID");
                System.out.print("\n");
                continue L4;
            }

            char sIDNumDigit1=sIDNum.charAt(0);
            char sIDNumDigit2=sIDNum.charAt(1);
            char sIDNumDigit3=sIDNum.charAt(2);
            char sIDNumDigit4=sIDNum.charAt(3);


            if (sIDNumDigit1!='S'){
                System.out.println("Incorrect Student ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit2<48){
                System.out.println("Incorrect Student ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit2>57){
                System.out.println("Incorrect Student ID");
                System.out.print("\n");
                continue L4;
            }

            if (sIDNumDigit3<48){
                System.out.println("Incorrect Student ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit3>57){
                System.out.println("Incorrect Student ID");
                System.out.print("\n");
                continue L4;
            }

            if (sIDNumDigit4<48){
                System.out.println("Incorrect Student ID");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit4>57){
                System.out.println("Incorrect Student ID");
                System.out.print("\n");
                continue L4;
            }
            return sIDNum;

        }
    }
    public static int c=0;
    public static String IDCheck(String sIDNum){
        Scanner input=new Scanner(System.in);
        L4:while (true){
            System.out.print("Enter Student ID : ");
            sIDNum=input.nextLine();
            c++;

            char[] charArray=sIDNum.toCharArray();
            if (charArray.length!=4){
                System.out.println("Incorrect ID : Length");
                System.out.print("\n");
                continue L4;
            }

            char sIDNumDigit1=sIDNum.charAt(0);
            char sIDNumDigit2=sIDNum.charAt(1);
            char sIDNumDigit3=sIDNum.charAt(2);
            char sIDNumDigit4=sIDNum.charAt(3);


            if (sIDNumDigit1!='S'){
                System.out.println("Incorrect ID, Please Enter 'S' for First digit!");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit2<48){
                System.out.println("Incorrect ID, Please Enter Number for Second digit!");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit2>57){
                System.out.println("Incorrect ID, Please Enter Number for Second digit!");
                System.out.print("\n");
                continue L4;
            }

            if (sIDNumDigit3<48){
                System.out.println("Incorrect ID, Please Enter Number for Third digit!");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit3>57){
                System.out.println("Incorrect ID, Please Enter Number for Third digit!");
                System.out.print("\n");
                continue L4;
            }

            if (sIDNumDigit4<48){
                System.out.println("Incorrect ID, Please Enter Number for Forth digit!");
                System.out.print("\n");
                continue L4;
            }
            if (sIDNumDigit4>57){
                System.out.println("Incorrect ID, Please Enter Number for Forth digit!");
                System.out.print("\n");
                continue L4;
            }
            return sIDNum;

        }
    }

    public static String[] sID=new String[0];
    public static String[] sName=new String[0];
    public static int[] prfmarkarray=new int[0];
    public static int[] dbmsmarkarray=new int[0];

    public static String[] temp=new String[0];
    public static int[] temp1=new int[0];

    public static String sIDNum;
    public static int prfmark;
    public static int dbmsmark;

    public static int[] prftemp=new int[0];
    public static int[] dbmstemp=new int[0];

    public static int[] prfNull=new int[0];
    public static int[] dbmsNull=new int[0];


    public static String sname="";

    public static void addNewStudent(){
        Scanner input=new Scanner(System.in);
        Scanner Obj = new Scanner(System.in);
        clearConsole();

        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }

        System.out.print("\n");
        System.out.print("|");
        System.out.print("\t\t\t\t\t\tAdd New Student");
        System.out.println("\t\t\t\t\t\t\t|");
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }

        System.out.println("\n");
        int N=0;
        int i=0;
        char option='N';
        L1:for (int q = 0; ; q++){
            do{
                if(option=='Y'){

                    for (int e = 0; e < 113; e++){
                        System.out.print("-");
                    }

                    System.out.print("\n");
                    System.out.print("|");
                    System.out.print("\t\t\t\t\t\tAdd New Student");
                    System.out.println("\t\t\t\t\t\t\t|");
                    for (int e = 0; e < 113; e++){
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.println();
                }

                sIDNum=IDCheck(sIDNum);
                boolean isDpulicate=false;
                for(int r=0; r<sID.length; r++){
                    if(sIDNum.equals (sID[r])){
                        System.out.println("The Student ID already exists");
                        System.out.println();
                        isDpulicate=true;
                        option='N';
                        continue L1;
                    }
                }




                System.out.print("Enter Student Name : ");
                String sname = Obj.nextLine();

                String[] temp=new String[sID.length+1];
                String[] temp1=new String[sName.length+1];

                for (int o = 0; o < sID.length; o++){
                    temp[o]=sID[o];
                    temp1[o]=sName[o];

                }
                int[] prfNull=new int[sID.length+1];
                int[] dbmstemp=new int[sID.length+1];

                for (int o = 0; o < prftemp.length; o++){
                    prfNull[o]=prftemp[o];
                }
                for (int o = 0; o < dbmsNull.length; o++){
                    dbmstemp[o]=dbmsNull[o];
                }

                prftemp=prfNull;
                dbmsNull=dbmstemp;

                prfNull[prfNull.length-1]=-1;
                prftemp=prfNull;

                dbmstemp[dbmstemp.length-1]=-1;
                dbmsNull=dbmstemp;

                sID=temp;
                sName=temp1;

                temp[temp.length-1]=sIDNum;
                sID=temp;

                temp1[temp1.length-1]=sname;
                sName=temp1;
                option=isYesOrNo(option);
                clearConsole();
            }while (option=='Y');
            mainMenu();
            break;
        }
    }


    public static void addNewStudentWithMarks(){
        Scanner input=new Scanner(System.in);
        Scanner Obj = new Scanner(System.in);
        clearConsole();
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }
        System.out.print("\n");
        System.out.println("|\t\t\t\t\t\tAdd New Student With Marks\t\t\t\t\t|");
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }


        System.out.println("\n");
        int N=0;
        int i=0;
        char option='N';

        L1:for (int q = 0; ; q++){
            do{
                if(option=='Y'){

                    for (int e = 0; e < 113; e++){
                        System.out.print("-");
                    }

                    System.out.print("\n");
                    System.out.println("|\t\t\t\t\t\tAdd New Student With Marks\t\t\t\t\t|");
                    for (int e = 0; e < 113; e++){
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.println();

                }
                sIDNum=IDCheck(sIDNum);

                boolean isDpulicate=false;
                for(int r=0; r<sID.length; r++){
                    if(sIDNum.equals (sID[r])){
                        System.out.println("The Student ID already exists");
                        System.out.println();
                        isDpulicate=true;
                        option='N';
                        continue L1;
                    }
                }


                System.out.print("Enter Student Name : ");
                sname = Obj.nextLine();
                System.out.println();

                String[] temp=new String[sID.length+1];
                String[] temp1=new String[sName.length+1];

                for (int j = 0; j <sID.length ; j++){
                    temp[j]=sID[j];
                    temp1[j]=sName[j];
                }
                sID=temp;
                sName=temp1;

                temp[temp.length-1]=sIDNum;
                sID=temp;

                temp1[temp1.length-1]=sname;
                sName=temp1;


                int[] prfNull=new int[sID.length];
                int[] dbmstemp=new int[sID.length];

                for (int t = 0; t < prftemp.length; t++){
                    prfNull[t]=prftemp[t];
                    dbmstemp[t]=dbmsNull[t];
                }

                prftemp=prfNull;
                dbmsNull=dbmstemp;

                prfNull[prfNull.length-1]=prfMarkCheck(prfmark);
                prftemp=prfNull;

                dbmstemp[dbmstemp.length-1]=dbmsMarkCheck(dbmsmark);
                dbmsNull=dbmstemp;

                option=isYesOrNo(option);
                clearConsole();
            }while (option=='Y');
            clearConsole();
            mainMenu();
        }


    }
    public static String[] idArray=new String[prftemp.length];
    public static double[] avgArray;

    public static double[] createAvgArray(){
        avgArray=new double [prftemp.length];
        for (int i = 0; i < prftemp.length; i++){
            int avg=(prftemp[i]+dbmsNull[i])/2;
            avgArray[i]=avg;
        }
        return avgArray;
    }



    public static void addMarks(){
        Scanner input=new Scanner(System.in);
        char option='Y';
        clearConsole();

        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }

        System.out.print("\n");
        System.out.println("|\t\t\t\t\t\t\tAdd Marks\t\t\t\t\t\t|") ;
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }
        System.out.println("\n");

        A1:do{
            sIDNum=IDCheck2(sIDNum);
            for (int i = 0; i < sID.length; i++){
                if (sIDNum.equals(sID[i])){
                    System.out.println("Student Name 	 : "+sName[i]);
                    if (prftemp[i]==-1){
                        prfmark=prfMarkCheck(prfmark);
                        prftemp[i]=prfmark;
                        dbmsmark=dbmsMarkCheck(dbmsmark);
                        dbmsNull[i]=dbmsmark;
                        System.out.print("Marks have been added. ");
                        option=isYesOrNoAddMark(option);
                        if (option=='Y'){
                            clearConsole();

                            for (int d = 0; d < 113; d++){
                                System.out.print("-");
                            }

                            System.out.print("\n");
                            System.out.println("|\t\t\t\t\t\t\tAdd Marks\t\t\t\t\t\t|") ;
                            for (int d = 0; d < 113; d++){
                                System.out.print("-");
                            }
                            System.out.println("\n");

                            continue A1;
                        }else{
                            break A1;
                        }
                    }else{
                        System.out.println("This student's marks have been already added.");
                        System.out.println("If you want to update the marks, please use [5] Update Marks option.\n");
                        option=isYesOrNoAddMark(option);
                        if (option=='Y'){
                            clearConsole();

                            for (int d = 0; d < 113; d++){
                                System.out.print("-");
                            }

                            System.out.print("\n");
                            System.out.println("|\t\t\t\t\t\t\tAdd Marks\t\t\t\t\t\t|") ;
                            for (int d = 0; d < 113; d++){
                                System.out.print("-");
                            }
                            System.out.println("\n");

                            continue A1;
                        }else{
                            break A1;
                        }
                    }
                }
            }

        }while(true);
        clearConsole();
        mainMenu();
    }


    public static void updateStudentDetails(){
        Scanner input=new Scanner(System.in);
        clearConsole();
        char option='Y';
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }

        System.out.print("\n");
        System.out.println("|\t\t\t\t\t\tUpdate Student Details\t\t\t\t\t\t|");
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }
        System.out.print("\n");
        A1:do{
            clearConsole();

            for (int a = 0; a < 113; a++){
                System.out.print("-");
            }

            System.out.print("\n");
            System.out.println("|\t\t\t\t\t\tUpdate Student Details\t\t\t\t\t\t|");
            for (int a = 0; a < 113; a++){
                System.out.print("-");
            }
            System.out.print("\n");

            sIDNum=IDCheck2(sIDNum);
            for (int i = 0; i < sID.length; i++){
                if (sIDNum.equals(sID[i])){
                    System.out.println("Student Name 	 : "+sName[i]);
                    System.out.print("Enter the new student name : ");
                    String SN=input.nextLine();
                    sName[i]=SN;
                    System.out.print("\nStudent details has been updated successfully.\n");
                    option=isYesOrNoUpdateStudent(option);
                    if(option=='Y'){
                        continue A1;
                    }
                    else{
                        break A1;
                    }
                }
            }
        }while(true);
        clearConsole();
        mainMenu();
    }


    public static void updateMarks(){
        char option='Y';
        A1:do{
            clearConsole();
            for (int i = 0; i < 113; i++){
                System.out.print("-");
            }

            System.out.print("\n");
            System.out.println("|\t\t\t\t\t\tUpdate Marks\t\t\t\t\t\t\t|");
            for (int i = 0; i < 113; i++){
                System.out.print("-");
            }
            System.out.println();
            sIDNum=IDCheck2(sIDNum);
            for (int i = 0; i < sID.length; i++){
                if (sIDNum.equals(sID[i])){
                    System.out.println("Student Name 	 : "+sName[i]+"\n");
                    if (prftemp[i]!=-1){
                        System.out.println("Programming Fundamentals Marks : "+prftemp[i]);
                        System.out.println("Database Management System Marks : "+dbmsNull[i]+"\n");
                        prfmark=prfMarkCheck(prfmark);
                        prftemp[i]=prfmark;
                        dbmsmark=dbmsMarkCheck(dbmsmark);
                        dbmsNull[i]=dbmsmark;
                        System.out.print("Marks have been updated successfully. \n");
                        option=isYesOrNoUpdateMarks(option);
                        if(option=='Y'){
                            continue A1;
                        }
                        else{
                            break A1;
                        }
                    }else{
                        System.out.println("This student's marks yet to be added.");
                        option=isYesOrNoUpdateMarks(option);
                        if(option=='Y'){
                            continue A1;
                        }
                        else{
                            break A1;
                        }
                    }
                }
            }
        } while (true);
        clearConsole();
        mainMenu();
    }



    public static void deleteStudent(){
        char option='Y';
        clearConsole();
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }

        System.out.print("\n");
        System.out.println("|\t\t\t\t\t\tDelete Student\t\t\t\t\t\t\t|");
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }
        String [] sIDtemp=new String[sID.length-1];
        String [] sNametemp=new String[sID.length-1];
        int [] PRFtemp=new int[sID.length-1];
        int [] DBMStemp=new int[sID.length-1];

        A1:do{
            System.out.println();
            sIDNum=IDCheck2(sIDNum);
            for (int i = 0; i < sID.length; i++){
                if (sIDNum.equals(sID[i])){
                    option=isSure(option);
                    if (option=='N'){
                        continue A1;
                    }
                    for (int x = i; x < sID.length-1; x++){
                        sID[x]=sID[x+1];
                        sName[x]=sName[x+1];
                        prftemp[x]=prftemp[x+1];
                        dbmsNull[x]=dbmsNull[x+1];

                    }
                    for (int t = 0; t < sID.length-1; t++){
                        sIDtemp[t]=sID[t];
                        sNametemp[t]=sName[t];
                        PRFtemp[t]=prftemp[t];
                        DBMStemp[t]=dbmsNull[t];
                    }
                    sID=sIDtemp;
                    sName=sNametemp;
                    prftemp=PRFtemp;
                    dbmsNull=DBMStemp;

                    System.out.print("Deleted Successfull.");
                    System.out.println();
                    option=isYesOrNoDelete(option);
                    if (option=='Y'){
                        clearConsole();
                        for (int r = 0; r < 113; r++){
                            System.out.print("-");
                        }

                        System.out.print("\n");
                        System.out.println("|\t\t\t\t\t\tDelete Student\t\t\t\t\t\t\t|");
                        for (int r = 0; r < 113; r++){
                            System.out.print("-");
                        }
                        continue A1;
                    }
                    else{
                        break A1;
                    }
                }
            }
        }while(true);
        clearConsole();
        mainMenu();
    }

    public static int Ind=0;
    public static String rank;
    public static void printStudentDetails(){
        A1:do{
            clearConsole();
            createAvgArray();
            System.out.println();
            for (int i = 0; i < 113; i++){
                System.out.print("-");
            }
            System.out.print("\n");
            System.out.println("|\t\t\t\t\t\tPrint Student Details\t\t\t\t\t\t|");
            for (int i = 0; i < 113; i++){
                System.out.print("-");
            }
            System.out.print("\n");

            System.out.print("\n");
            sIDNum=IDCheck2(sIDNum);
            for (int i = 0; i < sID.length; i++){
                if (sIDNum.equals(sID[i])){
                    System.out.println("Student Name 	 : "+sName[i]+"\n");
                    int Ind=i;
                }
            }
            for (int i = 0; i < 61; i++){
                if (i==0 || i==39){
                    System.out.print("+");
                }
                System.out.print("-");
            }

            String[] tempIdArray=sID;
            double[] tempAvgArray=new double[avgArray.length];
            for (int i = 0; i < avgArray.length; i++){
                tempIdArray[i]=sID[i];
                tempAvgArray[i]=avgArray[i];
            }
            for(int i=0; i<avgArray.length-1; i++){
                for(int j=0; j<avgArray.length-1; j++){
                    if(tempAvgArray[j]<tempAvgArray[j+1]){
                        double temAvg=tempAvgArray[j];
                        tempAvgArray[j]=tempAvgArray[j+1];
                        tempAvgArray[j+1]=temAvg;

                        String tempId=tempIdArray[j];
                        tempIdArray[j]=tempIdArray[j+1];
                        tempIdArray[j+1]=tempId;
                    }
                }
            }
            int[] rankARR=new int[tempAvgArray.length];
            for (int i = 0; i < sID.length; i++){
                rankARR[i]=i+1;
            }

            int x=0;
            for (int i = 0; i < tempIdArray.length; i++){
                if (tempIdArray[i].equals(sIDNum)){
                    x=i;
                }
            }

            System.out.print("+");
            if (0==x){
                rank="1 (First)";
            }
            else if(1==x){
                rank="2 (Second)";
            }
            else if(3==x){
                rank="3 (Third)";
            }
            else{
                rank=String.valueOf(Ind+4);

            }
            System.out.printf("\n%-40s%10d|\n","|Programming Fundamentals Marks		|	",prftemp[Ind]);
            System.out.printf("%-40s%10d|\n","|Database Managment System Marks	|	",dbmsNull[Ind]);
            System.out.printf("%-23s%10d|\n","|Total Marks				|	",prftemp[Ind]+dbmsNull[Ind]);
            System.out.printf("%-22s%10.2f|\n","|Avg. Marks			   	|	     ",(prftemp[Ind]+dbmsNull[Ind])/2f);
            System.out.printf("%-24s%10s|\n","|Rank		       		 	|	     ",rank);

            for (int i = 0; i < 61; i++){
                if (i==0 || i==39){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            char option='Y';
            System.out.print("+");
            System.out.println("\n");
            option=isYesOrNoPrintDetils(option);
            if (option=='Y'){
                continue A1;
            }
            else{
                break A1;
            }
        }while (true);
        clearConsole();
        mainMenu();
    }

    public static void printStudentRank(){
        A1:do{
            char option='Y';
            clearConsole();
            for (int i = 0; i < 113; i++){
                System.out.print("-");
            }
            System.out.print("\n");
            System.out.println("|\t\t\t\t\t\tPrint Student Rank\t\t\t\t\t\t|");
            for (int i = 0; i < 113; i++){
                System.out.print("-");
            }
            int[] totalArray=new int[sID.length];
            for (int i = 0; i < sID.length; i++){
                int t=prftemp[i]+dbmsNull[i];
                totalArray[i]=t;
            }

            System.out.print("\n");
            createAvgArray();
            String[] tempIdArray=sID;
            double[] tempAvgArray=new double[avgArray.length];
            int[] tempTotalArray=new int[avgArray.length];
            for (int i = 0; i < avgArray.length; i++){
                tempIdArray[i]=sID[i];
                tempAvgArray[i]=avgArray[i];
                tempTotalArray[i]=totalArray[i];
            }
            for(int i=0; i<avgArray.length-1; i++){
                for(int j=0; j<avgArray.length-1; j++){
                    if(tempAvgArray[j]<tempAvgArray[j+1]){
                        double temAvg=tempAvgArray[j];
                        tempAvgArray[j]=tempAvgArray[j+1];
                        tempAvgArray[j+1]=temAvg;

                        String tempId=tempIdArray[j];
                        tempIdArray[j]=tempIdArray[j+1];
                        tempIdArray[j+1]=tempId;

                        int tot=tempTotalArray[j];
                        tempTotalArray[j]=tempTotalArray[j+1];
                        tempTotalArray[j+1]=tot;
                    }
                }
            }
            System.out.println("\n");
            for (int i = 0; i < 66; i++){
                if (i==0 ||i==7||i==14||i==45||i==56||i==66){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.print("+\n");
            System.out.println("|Rank\t|ID\t|Name				|Total Marks|Avg. Marks|");
            for (int i = 0; i < 66; i++){
                if (i==0 || i==7 ||i==14||i==45||i==56||i==66){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.print("+\n");
            for(int i=0; i<tempIdArray.length; i++){
                System.out.printf("|%-1s%-6s","",i+1);
                System.out.printf("|%-1s%-6s","",tempIdArray[i]);
                System.out.printf("|%-1s%-30s","",sName[i]);
                System.out.printf("|%1s%10d","",tempTotalArray[i]);
                System.out.printf("|%1s%9s|","",tempAvgArray[i]);
                System.out.print("\n");
            }
            for (int i = 0; i < 66; i++){
                if (i==0 || i==7 ||i==14||i==45||i==56||i==66){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.print("+\n");
            option=isYesOrNoBestInPRO(option);
            if (option=='Y'){
                continue A1;
            }else{
                break A1;
            }
        }while(true);
        clearConsole();
        mainMenu();
    }

    public static void bestInProgrammingFundamentals(){
        clearConsole();
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }
        System.out.print("\n");
        System.out.println("|\t\t\t\t\tBest In Programming Fundamentals\t\t\t\t\t|");
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }
        A1:do{
            char option='Y';

            int[] tempPRFArray=prftemp;
            int[] tempDBMSArray=dbmsNull;
            String[] tempIdArray=sID;
            String[] tempNAMEArray=sName;
            for (int i = 0; i < idArray.length; i++){
                tempIdArray[i]=sID[i];
            }
            for(int i=0; i<prftemp.length-1; i++){
                for(int j=0; j<prftemp.length-1; j++){
                    if(tempPRFArray[j]<tempPRFArray[j+1]){
                        int temPRF=tempPRFArray[j];
                        tempPRFArray[j]=tempPRFArray[j+1];
                        tempPRFArray[j+1]=temPRF;

                        String tempId=tempIdArray[j];
                        tempIdArray[j]=tempIdArray[j+1];
                        tempIdArray[j+1]=tempId;

                        int temDBMS=tempDBMSArray[j];
                        tempDBMSArray[j]=tempDBMSArray[j+1];
                        tempDBMSArray[j+1]=temDBMS;

                        String tempNAME=tempNAMEArray[j];
                        tempNAMEArray[j]=tempNAMEArray[j+1];
                        tempNAMEArray[j+1]=tempNAME;
                    }
                }
            }

            System.out.println("\n");
            for (int i = 0; i < 57; i++){
                if (i==0 || i==7 ||i==38||i==47||i==57){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.print("+\n");
            System.out.println("|ID\t|Name				|PRF Marks|DBMS Marks|");
            for (int i = 0; i < 57; i++){
                if (i==0 || i==7 ||i==38||i==47||i==57){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.print("+\n");
            for(int i=0; i<tempIdArray.length; i++){
                System.out.printf("|%-1s%-6s","",tempIdArray[i]);
                System.out.printf("|%-1s%-30s","",tempNAMEArray[i]);
                System.out.printf("|%-1s%8d","",tempPRFArray[i]);
                System.out.printf("|%-1s%9s|","",tempDBMSArray[i]);
                System.out.print("\n");
            }
            for (int i = 0; i < 57; i++){
                if (i==0 || i==7 ||i==38||i==47||i==57){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.print("+\n");

            option=isYesOrNoBestInPRO(option);
            if (option=='Y'){
                clearConsole();
                for (int i = 0; i < 113; i++){
                    System.out.print("-");
                }
                System.out.print("\n");
                System.out.println("|\t\t\t\t\tBest In Programming Fundamentals\t\t\t\t\t|");
                for (int i = 0; i < 113; i++){
                    System.out.print("-");
                }
                continue A1;
            }else{
                break A1;
            }
        } while (true);
        clearConsole();
        mainMenu();
    }

    public static void bestInDatabaseManagementSystem(){
        clearConsole();
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }

        System.out.print("\n");
        System.out.println("|\t\t\t\t\tBest In Database Management System\t\t\t\t\t|");
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }
        A1:do{
            char option='Y';

            int[] tempPRFArray=prftemp;
            int[] tempDBMSArray=dbmsNull;
            String[] tempIdArray=sID;
            String[] tempNAMEArray=sName;
            for (int i = 0; i < idArray.length; i++){
                tempIdArray[i]=sID[i];
            }
            for(int i=0; i<prftemp.length-1; i++){
                for(int j=0; j<prftemp.length-1; j++){
                    if(tempDBMSArray[j]<tempDBMSArray[j+1]){
                        int temDBMS=tempPRFArray[j];
                        tempDBMSArray[j]=tempDBMSArray[j+1];
                        tempDBMSArray[j+1]=temDBMS;

                        String tempId=tempIdArray[j];
                        tempIdArray[j]=tempIdArray[j+1];
                        tempIdArray[j+1]=tempId;

                        int temPRF=tempPRFArray[j];
                        tempPRFArray[j]=tempPRFArray[j+1];
                        tempPRFArray[j+1]=temPRF;

                        String tempNAME=tempNAMEArray[j];
                        tempNAMEArray[j]=tempNAMEArray[j+1];
                        tempNAMEArray[j+1]=tempNAME;
                    }
                }
            }

            System.out.println("\n");
            for (int i = 0; i < 57; i++){
                if (i==0 || i==7 ||i==38||i==47||i==57){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.print("+\n");
            System.out.println("|ID\t|Name				|DBMS Marks|PRF Marks|");
            for (int i = 0; i < 57; i++){
                if (i==0 || i==7 ||i==38||i==47||i==57){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.print("+\n");
            for(int i=0; i<tempIdArray.length; i++){
                System.out.printf("|%-1s%-6s","",tempIdArray[i]);
                System.out.printf("|%-1s%-30s","",tempNAMEArray[i]);
                System.out.printf("|%-1s%8s","",tempDBMSArray[i]);
                System.out.printf("|%-1s%9d|","",tempPRFArray[i]);
                System.out.print("\n");
            }
            for (int i = 0; i < 57; i++){
                if (i==0 || i==7 ||i==38||i==47||i==57){
                    System.out.print("+");
                }
                System.out.print("-");
            }
            System.out.print("+\n");

            option=isYesOrNoBestInPRO(option);
            if (option=='Y'){
                clearConsole();
                for (int i = 0; i < 113; i++){
                    System.out.print("-");
                }

                System.out.print("\n");
                System.out.println("|\t\t\t\t\tBest In Database Management System\t\t\t\t\t|");
                for (int i = 0; i < 113; i++){
                    System.out.print("-");
                }
                continue A1;
            }else{
                break A1;
            }
        } while (true);
        clearConsole();
        mainMenu();
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }
        catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.

        }
    }
    public static void mainMenu(){
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }
        System.out.print("\n");
        System.out.print("|");
        System.out.print("\t\t\t\t\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM");
        System.out.println("\t\t	                |");
        for (int i = 0; i < 113; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println();
        System.out.print("[1] Add New Student\t\t\t\t");
        System.out.println("[2] Add New Student With Marks");
        System.out.print("[3] Add Marks\t\t\t\t\t");
        System.out.println("[4] Update Student Details");
        System.out.print("[5] Update Marks\t\t\t\t");
        System.out.println("[6] Delete Student");
        System.out.print("[7] Print Student Details\t\t\t");
        System.out.println("[8] Print Student Rank");
        System.out.print("[9] Best In Programming Fundamentals\t\t");
        System.out.println("[10] Best In Database Management System");
        System.out.println();
        A1:do{
            System.out.print("Enter an option to continue > ");
            int num=input.nextInt();
            switch (num){
                case 1:addNewStudent();break;
                case 2:addNewStudentWithMarks();break;
                case 3:addMarks();break;
                case 4:updateStudentDetails();break;
                case 5:updateMarks();break;
                case 6:deleteStudent();break;
                case 7:printStudentDetails();break;
                case 8:printStudentRank();break;
                case 9:bestInProgrammingFundamentals();break;
                case 10:bestInDatabaseManagementSystem();break;
                default:System.out.print("Invalid Number");
                    mainMenu();
            }
        } while (true);
    }
    public static void main(String args[]){
        mainMenu();
    }
}
