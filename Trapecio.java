public class Trapecio {
    int base1, base2;
    int lado1, lado2;
    double altura;

    Trapecio(int base1, int base2, int lado1, int lado2){
        this.base1 = base1;
        this.base2 = base2;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    double calcularArea(){
        this.altura = Math.pow((4*Math.pow((this.base1-this.lado1),2)*Math.pow(lado2,2))
                -(Math.pow(Math.pow(lado2,2)+Math.pow((this.base1-this.lado1),2)-Math.pow(this.base2, 2),2)),0.5)
                /2*(this.base1-this.base2);
        return  ((base1+base2)*altura/2);
    }
    double calcularPerimetro(){
        return (base1+base2+lado1+lado2);
    }
}
