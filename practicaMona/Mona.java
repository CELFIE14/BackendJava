package practicaMona;

public class Mona {
    private String nombre="Octogato", aspecto = "Nada particular", actividad="Mascota de github";

    //Constructor
    public Mona(){

    }

    //Getters de los componentes


    public String getNombre() {
        return nombre;
    }

    public String getAspecto() {
        return aspecto;
    }

    public String getActividad() {
        return actividad;
    }

    //Setters y validaciones de variables

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }
        else
            return false;
    }

    public boolean setAspecto(String aspecto){
        if(!aspecto.isEmpty()){
            this.aspecto = aspecto;
            return true;
        }
        else
            return false;
    }

    public boolean setActividad(String actividad){
        if(!actividad.isEmpty()){
            this.actividad = actividad;
            return true;
        }
        else
            return false;
    }

    public void frase(){
        System.out.println("Hola githubbers!!!");
    }

    public boolean frase(String newMessage){
        if (!newMessage.isEmpty()){
            System.out.println(newMessage+ "Hola githubbers");
            return true;
        }else
            return false;
    }

    public String show(){
        return "Nombre: "+nombre+"\n"+
                "Aspecto: "+aspecto+"\n"+
                "Actividad: "+actividad+"\n";
    }
}
