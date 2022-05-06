package practicaHarry;

public class UniversoHarry {
    public static void main(String[] args) {
        Harry();
        Ron();
        Draco();
        Snape();
        Remus();

    }

    public static void Harry(){
        Personaje harry = new Personaje();
        harry.setNombre("Harry Potter");
        harry.setGenero("Masculino");
        harry.setCasaHoghwarts("Gryffindor");
        harry.setBoggart("Dementores");
        harry.setPatronus("Ciervo");
        System.out.println(harry.printStates());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*"+"\n");
    }

    public static void Ron(){
        Personaje ron = new Personaje();
        ron.setNombre("Ron Weasley");
        ron.setGenero("Masculino");
        ron.setCasaHoghwarts("Gryffindor");
        ron.setBoggart("Araña gigante");
        ron.setPatronus("Jack Russell Terrier");
        System.out.println(ron.printStates());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*"+"\n");
    }

    public static void Draco(){
        Personaje draco = new Personaje();
        draco.setNombre("Draco Malfoy");
        draco.setGenero("Masculino");
        draco.setCasaHoghwarts("Slytherin");
        draco.setBoggart("Lord Voldemort");
        draco.setPatronus("Sin conocimiento");
        System.out.println(draco.printStates());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*"+"\n");
    }

    public static void Snape(){
        Personaje snape = new Personaje();
        snape.setNombre("Severus Snape");
        snape.setGenero("Masculino");
        snape.setCasaHoghwarts("Slytherin");
        snape.setBoggart("Desconocido");
        snape.setPatronus("Cierva");
        System.out.println(snape.printStates());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*"+"\n");
    }
    public static void Remus(){
        Personaje remus = new Personaje();
        remus.setNombre("Remus Lupin");
        remus.setGenero("Masculino");
        remus.setCasaHoghwarts("Gryffindor");
        remus.setBoggart("Luna llena");
        remus.setPatronus("Lobo");
        System.out.println(remus.printStates());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*"+"\n");
    }

}
