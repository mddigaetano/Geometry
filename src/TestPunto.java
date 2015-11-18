public class TestPunto {

    public static void main(String [] args) {
        Punto p1 = new Punto(2,4);
        Punto p2 = new Punto(-2,1);
        Cerchio c1 = new Cerchio(5, p1);
        
        System.out.println("La distanza di p1 dall'origine e': "+p1.distanzaOrigine());
        System.out.println("La distanza tra p1 e p2 e': "+p1.distanzaAltroPunto(p2));
        
        System.out.println("L'area del cerchio c1 e': "+c1.area());
        System.out.println("La circonferenza del cerchio c1 e': "+c1.circonferenza());
        System.out.println("Il punto p2 si trova all'interno del cerchio c1? "+c1.contienePunto(p2));
    }
}
