package practicaMona;

public class Homercat extends Mona{

    public Homercat(){
        setNombre("HomerCat");
        setAspecto("Amarillento y cabezón");
        setActividad("Beber cerveza y rosquillas");
    }

    @Override
    public void frase() {
        System.out.println("OWW..!!!");
    }
}
