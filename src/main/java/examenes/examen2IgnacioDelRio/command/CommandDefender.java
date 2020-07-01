package examenes.examen2IgnacioDelRio.command;

public class CommandDefender implements ICommand {
    private RecieverJuego juego;

    public CommandDefender(RecieverJuego juego) {
        this.juego = juego;
    }

    @Override
    public void execute() {
        this.juego.operacionDefender();
    }
}