package practicaMona;

public class Octocats {

    public static void main(String[] args) {
        topguntocat();
        luchadorcat();
        daftpunktocat();
        spidertocat();
        homertocat();
        gangnamtocat();
    }

    static void topguntocat(){
        Topguntocat top = new Topguntocat();
        System.out.println(top.show());
        top.frase();
        System.out.println();
    }
    static void luchadorcat(){
        Luchadorcat luchador = new Luchadorcat();
        System.out.println(luchador.show());
        luchador.frase();
        System.out.println();
    }
    static void daftpunktocat(){
        Daftpunktocat daft = new Daftpunktocat();
        System.out.println(daft.show());
        daft.frase();
        System.out.println();
    }
    static void spidertocat(){
        Spidertocat spider = new Spidertocat();
        System.out.println(spider.show());
        spider.frase();
        System.out.println();
    }
    static void homertocat(){
        Homercat homer = new Homercat();
        System.out.println(homer.show());
        homer.frase();
        System.out.println();
    }
    static void gangnamtocat(){
        Gangnamtocat gang = new Gangnamtocat();
        System.out.println(gang.show());
        gang.frase();
        System.out.println();
    }
}
