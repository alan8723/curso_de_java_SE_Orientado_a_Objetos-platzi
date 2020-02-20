package model;

import java.util.Date;

//interfas: conjutos de metodos que pueden heredar las clases (todos los metodos de la interfas son obligatorios para las clases que lo herdan)
// a partir de java 8 se le agrega default y en java 9 private (se le puede agregar implementacion y comportamiento)


public interface ISchedulable {

    void schedule(Date date, String time);
}
