import java.util.ArrayList;

public class Encuestador extends Persona {
    //Atributos
    private int sueldo;
    private ArrayList<Formulario> formularios= new ArrayList<>();

    public Encuestador(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.sueldo = 100000;
    }

    //Metodos
    //Agregar formulario
    public void addFormulario(){
        //Agregar los formularios con id de este encuestador
    }
    //Obtener cantidad de encuestas
    public int cantEncuestas(){
        int cantidad=0;
        for (Formulario f: formularios) {
            if(f.isCompletado()==true){
                cantidad = formularios.size();

            }
        }
        return cantidad;
    }

    //Obtener sueldo
    public int getSueldo(){
        sueldo=cantEncuestas()*this.sueldo;
        return sueldo;
    }
}

