package Asem4.h8;


import Asem4.h8.Observer.ConsoleObserver;
import Asem4.h8.Observer.MeteoStation;
import Asem4.h8.State.RadioDFM;
import Asem4.h8.State.Radio;
import Asem4.h8.State.Station;
import Asem4.h8.State.DetskoeRadio;
import Asem4.h8.State.ComedyRadio;


public class Main {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        station.addObserver(new ConsoleObserver());
        station.setMeasurements(25, 760);
        station.setMeasurements(28, 745);

        Station dfm = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(dfm);
        for(int i=0; i< 10; i++){
            radio.play();
            radio.nextStation();
        }
    }

}
