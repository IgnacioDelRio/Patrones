package examenes.examen3IgnacioDelRio.decorator;

public class Carcasa extends Decorator {
    private int precio;

    public Carcasa(IMarca marca, int precio) {
        super(marca);
        this.precio = precio;
    }

    public void showData() {
        super.addCarcasa(precio);
    }
}
