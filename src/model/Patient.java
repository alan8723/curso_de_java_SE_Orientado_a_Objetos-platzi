package model;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

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
