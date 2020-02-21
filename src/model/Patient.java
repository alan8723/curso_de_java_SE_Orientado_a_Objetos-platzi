package model;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email){
        super(name, email);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + " Kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getHeight() {
        return this.height + "Ms.";
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getBirthday() {
        return birthday;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    public String getBlood() {
        return blood;
    }

    //aplicando polimorfismo de un metodo heredado
    @Override
    public String toString() {
        return super.toString() +
                "birthday: " + birthday  +
                ", weight: " + getWeight() +
                ",\n height: " + getHeight() +
                ", blood: " + blood;
    }

    //implementando metodo abstracto (obligatoriio) heredado
    @Override
    public void ShowDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial del paciente");
    }
}
