package practicaHarry;

public class Personaje {
    private String nombre;
    private String genero;
    private String casaHoghwarts;
    private String boggart;
    private String patronus;

    //Constructor
    public Personaje(){

    }
    //declaraciones
    public Personaje(String nombre, String genero, String casaHoghwarts, String boggart, String patronus){
        this.nombre = nombre;
        this.genero = genero;
        this.casaHoghwarts = casaHoghwarts;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    //getters

    public String getNombre() {  return nombre;  }
    public String getGenero() {  return genero;  }
    public String getCasaHoghwarts() {  return casaHoghwarts;  }
    public String getBoggart() {  return boggart;  }
    public String getPatronus() {  return patronus;  }

    //Setters con las validaciones

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }
        else
            return false;
    }
    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero=genero;
            return true;
        }
        else
            return false;
    }
    public boolean setCasaHoghwarts(String casaHoghwarts){
        if (!casaHoghwarts.isEmpty()){
            this.casaHoghwarts=casaHoghwarts;
            return true;
        }
        else
            return false;
    }
    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart=boggart;
            return true;
        }
        else
            return false;
    }
    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus=patronus;
            return true;
        }
        else
            return false;
    }

    //método para mostrar el estado de las variables
    public String printStates(){
        return "Nombre de personaje: "+nombre+"\n"+
                "Genero: "+genero+"\n"+
                "Casa a la que pertenece: "+casaHoghwarts+"\n"+
                "Su boggart es: "+boggart+"\n"+
                "Su patronus es: "+patronus;

    }
}
