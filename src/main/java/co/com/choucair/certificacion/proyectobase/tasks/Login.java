package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{

    private String strUser;
    private String srtPassword;

   public Login(String strUser, String srtPassword) {
        this.strUser = strUser;
        this.srtPassword = srtPassword;
    }

    public static Login onThePAge(String strUser, String srtPassword) {
        return Tasks.instrumented(Login.class,strUser,srtPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(srtPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
