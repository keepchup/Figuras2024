public class Triangulos extends Figura_Geometrica{
    double base;
    double altura;

    public Triangulos() {
    }
    public Triangulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea() {
        return base*altura;
    }
    public double calculaPerimetro() {
        return 2*base*altura;
    }
}
