package ui;

import model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatient {
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome" + UiMenu.patientLogged.getName());
            System.out.println("1. Book and appointment");
            System.out.println("2. My appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointment();
                    break;
                case 2:
                    showPatientMyAppointment();
                    break;
                case 0:
                    UiMenu.showMenu();
                    break;
            }

        }while (response!=0);
    }

    private static void showBookAppointment(){
        int response = 0;
        do {


            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");
            //Numeracion de la lista de fechas
            //Integer segundo Map: Indice de la fecha que seleccionada
            //Lista de Doctores
            //primer Integer
            //1.- doctor1
                    // Segundo Integer
                    //-1. fecha1
                    //-2. fecha2
                    //-3. fecha3
            //2.- doctor2
            //3.- doctor3
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvalableAppointment.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvalableAppointment.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvalableAppointment.get(i));

                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor  doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc:doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
                }

            System.out.println(doctorSelected.getName() +
                    ". Date" +
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime() +
                    ". Time" +
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n 2. Change Data");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1){
                UiMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();
            }

        }while (response!=0);
    }

    private static void showPatientMyAppointment(){
        int respose = 0;
        do {
            System.out.println("::My appointments");
            if (UiMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UiMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i+1;
                System.out.println(j + ". "+
                        "Date: " +
                        UiMenu.patientLogged.getAppointmentDoctors().get(i).getDate()+
                        "Time: "+
                        UiMenu.patientLogged.getAppointmentDoctors().get(i).getTime()+
                        "\nDoctor: " +
                        UiMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor()
                );
            }
            System.out.println("0. Return");
        }while (respose != 0);
    }
}
