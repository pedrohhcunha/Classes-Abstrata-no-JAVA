

public class TrianguloEquilatero extends Triangulo{
    

    public TrianguloEquilatero(int base, int altura) {
        super(base, altura);
    }

    double area(){
        return getBase() * getAltura() / 2;
    }

}
