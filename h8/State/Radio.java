package Asem4.h8.State;

public class Radio {
    Station station;
    public void setStation(Station st){
        station = st;
    }
    public void nextStation(){
        if(station instanceof RadioDFM){
            setStation(new DetskoeRadio());
        }
        else if(station instanceof DetskoeRadio){
            setStation(new ComedyRadio());
        }
        else if (station instanceof ComedyRadio){
            setStation(new RadioDFM());
        }
    }
    public void play(){
        station.play();
    }
}
