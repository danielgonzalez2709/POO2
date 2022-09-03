public class Rombo {

    int diagonalmayor, diagonalmenor;
    double lado;

    Rombo(int diagonalmayor, int diagonalmenor){
        this.diagonalmayor = diagonalmayor;
        this.diagonalmenor = diagonalmenor;
    }

    Rombo(int diagonalmayor, int diagonalmenor, double lado){
        this.diagonalmayor = diagonalmayor;
        this.diagonalmenor = diagonalmenor;
        this.lado = lado;
    }

    public void calcularLado(int diagonalmayor, int diagonalmenor) {
        this.lado = Math.pow((diagonalmayor/2)*(diagonalmayor/2)+(diagonalmenor/2)*(diagonalmenor/2),0.5);
    }

    double calcularArea(){
        return  (diagonalmayor*diagonalmenor/2);
    }
    double calcularPerimetro(){
        return (lado*4);
    }
}
