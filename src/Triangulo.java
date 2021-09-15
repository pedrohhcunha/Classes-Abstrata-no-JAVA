public abstract class Triangulo {
    private int base;
    private int altura;

    abstract double area();


    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
}
