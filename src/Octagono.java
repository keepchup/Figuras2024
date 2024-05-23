public class Octagono extends Figura_Geometrica{
    double lado;

    public Octagono() {
    }

    public Octagono(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularApotema(){
        return (lado/0.82);
    }

    public double calculaPerimetro() {
        return lado * 8;
    }

    public double calculaArea() {
        return (calculaPerimetro()*calcularApotema())/2;
    }
}
