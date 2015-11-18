public class Punto {

    private float x;

    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public float getX() {
        return x;
    }

    public void sposta(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float distanzaOrigine() {
        return (float)Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }

    public float getY() {
        return this.y;
    }

    public float distanzaAltroPunto(Punto P) {
        return (float)Math.sqrt(Math.pow(this.x - P.getX(), 2) + Math.pow(this.y - P.getY(), 2));
    }
}
