package practicaMona;

public class Topguntocat extends Mona{

    public Topguntocat(){
        setNombre("Topguntocat");
        setAspecto("Vestimenta de piloto");
        setActividad("Volar y enamorar octocats");
    }

    @Override
    public void frase() {
        System.out.println("Take my breath away...");
    }
}
