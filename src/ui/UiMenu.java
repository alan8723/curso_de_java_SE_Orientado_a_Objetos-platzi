package ui;

import model.Doctor;
import model.Patient;

import javax.print.Doc;
import java.util.ArrayList;
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

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointment");
        System.out.println("Seleccionar la opcion deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    atthUser(1);
                    break;
                case 2:
                    response = 0;
                    atthUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct anwer");
            }
        }while (response !=0);

    }

    private static void atthUser(int userType){
        //userType: 1 Doctor
        //userType: 2 patient

        ArrayList<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor("Alejandro Martinez", "Alegandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "Karen@mail.com"));
        doctors.add(new Doctor("Rocio Gomez", "Rosco@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new Patient("Anahi Salgado", "anahi@mail.com"));
        patients.add(new Patient("Roberto Rodrigez", "roberto@mail.com"));
        patients.add(new Patient("Carlos Sanches", "carlos@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("incert your email [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1){
                for (Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        //obtener el usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }

            }else if(userType == 2){
                    for (Patient p: patients) {
                        if (p.getEmail().equals(email)){
                            emailCorrect = true;
                            patientLogged = p;
                            showPatientMenu();
                        }
                    }
                }

        }while (!emailCorrect);

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
