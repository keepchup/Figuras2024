public class Figura_Geometrica {
    String nombre;
    int lados;
    boolean regular;

    public Figura_Geometrica() {}
    public Figura_Geometrica(String nombre, int lados, boolean regular) {
        this.nombre = nombre;
        this.lados = lados;
        this.regular = regular;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getLados() {
        return lados;
    }
    public void setLados(int lados) {
        this.lados = lados;
    }
    public boolean isRegular() {
        return regular;
    }
    public void setRegular(boolean regular) {
        this.regular = regular;
    }


}
