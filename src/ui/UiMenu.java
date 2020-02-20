package ui;

import java.util.Scanner;

public class UiMenu {

    public static final String MONTHS [] = {"Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "mayo",
            "junio",
            "Julio",
            "Agosto",
            "Sepstiembr",
            "Octubre",
            "Novienbre",
            "Diciembre"};

    public static void showMenu(){
        System.out.println("Welcome to My Appointment");
        System.out.println("Seleccionar la opcion deseada");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct anwer");
            }
        }while (response !=0);

    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0. Return");
            Scanner sc= new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an Appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointment");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct anwer");
            }
        }while (response != 0);
    }

}
