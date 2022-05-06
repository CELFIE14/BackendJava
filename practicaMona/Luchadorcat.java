package practicaMona;

public class Luchadorcat extends Mona {

    public Luchadorcat(){
        setNombre("Luchadorcat");
        setAspecto("Mascara de luchador mexicano");
        setActividad("Hacer las mejores acrobacias en el ring");
    }

    @Override
    public void frase() {
        System.out.println("Siempre entre cuerdas");
    }
}
