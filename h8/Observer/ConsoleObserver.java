package Asem4.h8.Observer;

public class ConsoleObserver implements Observer{
    @Override
    public void handleEvent(int temp, int pres) {
        System.out.println("Погода изменилась. Температура = " + temp +", Давление = " + pres);
    }
}
