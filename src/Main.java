import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {

        //Creo los objetos
        Formulario formulario1 = new Formulario(1, 1, true);
        Formulario formulario2 = new Formulario(1, 1, false);

        Persona persona1 = new Persona("Juana", "De Arco", "132563");
        Persona persona2 = new Persona("Pepe", "Grillo", "56321565");

        Encuestador encuestador1 = new Encuestador("Pablo", "García", "9632165");
        Encuestador encuestador2 = new Encuestador("María", "Lopez", "2536598");

        Encuesta encuesta1 = new Encuesta(1, "Estado");


        System.out.println(persona1.getId());
        System.out.println(persona2.getId());
        System.out.println(encuestador1.cantEncuestas());
        
    }
}