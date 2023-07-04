package api.menu;

public class ExitMenuItem  extends MenuItem{

    @Override
    public void action() {

        isRunning = false;
        System.out.println("Bye Bye!");
    }
}
