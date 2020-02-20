package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;

    //metodos
    //constructor
    public Doctor(String name, String email){
        super(name, email);

    }

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //comportamientos

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void ShowDataUser() {
        System.out.println("Hospital: Cruz roja");
        System.out.println("Departamento: Cancerologia");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }
        public void setDate(Date date) {
            this.date = date;
        }

        public Date getDate() {
            return date;
        }
        public void setId(int id) {
            this.id = id;
        }

        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime" + time;
        }
    }
}
