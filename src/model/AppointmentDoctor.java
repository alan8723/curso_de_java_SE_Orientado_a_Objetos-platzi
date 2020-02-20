package model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable {

    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    @Override
    public void schedule(Date date, String time) {

    }
}
