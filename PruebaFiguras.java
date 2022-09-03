import java.util.Scanner;

public class PruebaFiguras {
    public static void main(String[] args) {
        int radfig1, basfig2, altfig2, ladofig3, basfig4, altfig4;

        Scanner sc = new Scanner(System.in);

        System.out.println("Primera figura Circulo: ingrese el radio");
        radfig1 = sc.nextInt();

        System.out.println("Segunda figura Rectangulo: ingrese la base");
        basfig2 = sc.nextInt();

        System.out.println("Segunda figura Rectangulo: ingrese la altura");
        altfig2 = sc.nextInt();

        System.out.println("Tercera figura Cuadrado: ingrese la base");
        ladofig3 = sc.nextInt();

        System.out.println("Cuarta figura Triangulo Rectangulo: ingrese la base");
        basfig4 = sc.nextInt();

        System.out.println("Cuarta figura Triangulo Rectangulo: ingrese la altura");
        altfig4 = sc.nextInt();

        Circulo figura1 = new Circulo(radfig1);
        Rectangulo figura2 = new Rectangulo(basfig2,altfig2);
        Cuadrado figura3 = new Cuadrado(ladofig3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(basfig4,altfig4);
        System.out.println("El área del círculo es = " + figura1.
                calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.
                calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.
                calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.
                calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.
                calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.
                calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.
                calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.
                calcularPerimetro());
        figura4.determinarTipoTriángulo();
    }
}
