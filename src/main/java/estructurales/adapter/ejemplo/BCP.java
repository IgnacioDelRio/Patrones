package estructurales.adapter.ejemplo;

public class BCP implements IPayPal {

    String documentoIdentidad;
    int monto;

    public BCP(String documentoIdentidad, int monto){
        this.documentoIdentidad=documentoIdentidad;
        this.monto=monto;
    }


    @Override
    public int getMonto() {
        return this.monto;
    }

    @Override
    public String getDocumentoIdentidad() {
        return this.documentoIdentidad;
    }
}
