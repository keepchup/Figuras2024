public class Heptagono extends Figura_Geometrica{
    double lado;

    public Heptagono() {
    }
    public Heptagono(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularApotema(){
        return (lado/0.96);
    }

    public double calculaPerimetro() {
        return lado * 7;
    }

    public double calculaArea() {
        return (calculaPerimetro()*calcularApotema())/2;
    }
}
