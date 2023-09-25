import java.util.ArrayList;

public class Encuesta {
    //Atributos
    private int id_encuesta;
    private String organismo;
    private ArrayList<Formulario> formularios = new ArrayList<>();
    private ArrayList<Encuestador> encuestadores = new ArrayList<>();
    private ArrayList<Persona> encuestados = new ArrayList<>();

    //Constructor


    public Encuesta(int id_encuesta, String organismo) {
        this.id_encuesta = id_encuesta;
        this.organismo = organismo;
    }
}
