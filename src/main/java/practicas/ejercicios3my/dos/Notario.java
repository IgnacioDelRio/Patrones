package practicas.ejercicios3my.dos;

public class Notario implements IPersonal{
    private IPersonal next;

    @Override
    public void setNext(IPersonal iPersonal) {
        this.next = iPersonal;
    }

    @Override
    public IPersonal next() {
        return this.next;
    }

    @Override
    public void handle(Persona persona) {
        System.out.println("Senor " + persona.getName() + " le falta el certificado. Sacando certificado.");
        System.out.println("Certificado obtenido, pasando con el responsable.");
        this.next.handle(persona);
    }
}
