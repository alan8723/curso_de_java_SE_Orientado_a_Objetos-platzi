import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Anahi salgado", "pedriatia");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        User user = new Doctor("Anahi", "ana@ana.com");
        user.ShowDataUser();

        User userPasent = new Patient("alejandro", "ale@g.com");
        userPasent.ShowDataUser();

        User user1 = new User("ana", "ana@ana.com") {
            @Override
            public void ShowDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz verde");
                System.out.println("Departamento: Geriatria");
            }
        };

        user1.ShowDataUser();

        ISchedulable iSchuedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        /*System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        
        System.out.println(patient);

        System.out.println(myDoctor);
       myDoctor.showName();
        myDoctor.showId();

        model.Doctor myDoctorAnn = new model.Doctor();
        myDoctor.showId();

       showMenu();*/
    }
};


