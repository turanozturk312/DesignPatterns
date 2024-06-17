package org.example.Proxy.hotswappingexample;

import java.io.IOException;
import java.util.Scanner;

public class BeanHowSwippingMain {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonService personService = new PersonService();

    public static void main(String[] args) {


        printMainMenu();
        while (true) {
            String mainMenuSelection = scanner.nextLine();
            handleMainMenuSelection(mainMenuSelection);
        }

    }

    public static void printMainMenu() {
        String mainMenu = """
                
                -- MAIN MENU -------------
                1- Get Person Information
                2- Change Database
                0- Exit
                """;
        System.out.println(mainMenu);
        System.out.print("Seçim: ");
    }

    public static void handleMainMenuSelection(String selection) {
        if (selection.equals("1")) {
            getPersonInformation();
        } else if (selection.equals("2")) {
            changeDatabase();
        } else if (selection.equals("0")) {
            System.exit(0);
        } else {
            System.out.println("Wrong Selection!");
        }
    }

    public static void getPersonInformation() {
        String databaseSelectionMenu = """
                
                -- GET PERSON INFO ----
                """;
        System.out.print(databaseSelectionMenu);
        System.out.print("Enter person ID: ");
        String personId = scanner.nextLine();

        try{
            Long id = Long.parseLong(personId);
            if(id <= 0)
                throw new RuntimeException();
            personService.getPersonInformations(id);
            System.out.println("You are redirected to the main menu... ");
            wait(3000);
            printMainMenu();
        } catch (RuntimeException e) {
            System.out.println("Wrong person ID");
        }
    }

    public static void changeDatabase() {
        String databaseSelectionMenu = """
                
                -- DATABASE SELECTION ---- 
                """;
        System.out.print(databaseSelectionMenu);
        System.out.print("Enter database type (master/slave): ");
        String database = scanner.nextLine();

        if (!(database.equalsIgnoreCase("master") || database.equalsIgnoreCase("slave"))) {
            System.out.println("Wrong database type. It must be 'master' or 'slave'");
            changeDatabase();
        }

        try {
            DataSourceFactory.getDataSource().changePrimaryDataSource(database);
            System.out.println("Dabatase has been successfully set up. You are redirected to the main menu...");
            wait(3000);
//            clearConsole();
            printMainMenu();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public static void clearConsole() throws IOException {
        Runtime.getRuntime().exec("cls");
    }

    public static  void wait(int waitTime){
        try {
            Thread.sleep(waitTime); // Wait for 3000 milliseconds (3 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
