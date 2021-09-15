public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programa com classe abstrata que calcula a area!");

        TrianguloEquilatero T = new TrianguloEquilatero(20, 30);
        System.out.println("A base é: " + T.area());
    }
}
