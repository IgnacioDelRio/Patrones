package creacionales.factoryMethod.ejercicios.ej2my;

public class Deportivo {
    private int talla;
    private String color;
    private int numero;

    public Deportivo(int talla, String color, int numero) {
        this.talla = talla;
        this.color = color;
        this.numero = numero;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
