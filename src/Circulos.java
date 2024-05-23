public class Circulos extends Figura_Geometrica{
    double radio;

    public Circulos(){}
    public Circulos(double radio){
        this.radio = radio;
    }

    public double getRadio(){return radio;}
    public void setRadio(double radio){this.radio = radio;}

    public double calculaArea(){
        return Math.PI * radio * radio;
    }
    public double calculaPerimetro(){
        return 2 * Math.PI * radio;
    }
}
