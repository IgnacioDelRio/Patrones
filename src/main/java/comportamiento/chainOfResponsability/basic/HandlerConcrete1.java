package comportamiento.chainOfResponsability.basic;

public class HandlerConcrete1 implements  IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(int amount) {
        //  condicion para poder hacerme responsable de esa informacion

        if (amount < 100){
            System.out.println("Proceso Atendio por : HandlerConcrete1");
        } else {
            this.next.criteriaHandler(amount);
        }

    }
}
