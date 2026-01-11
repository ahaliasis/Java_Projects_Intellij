public class SmartGym {

    private Treadmill treadmill;
    private MusicSystem musicSystem;
    private AirConditioner airConditioner;

    public SmartGym(){
        this.treadmill = new Treadmill(true,5);
        this.musicSystem = new MusicSystem(false,50);
        this.airConditioner = new AirConditioner(true,25);
    }

    public void startGymDay(){
        treadmill.start();
        musicSystem.play();
        airConditioner.turnOn();
    }
    public void shutDownGym(){
        treadmill.stop();
        musicSystem.stop();
        airConditioner.turnOff();
    }
    public void printStatus(){
        treadmill.printStatus();
        musicSystem.printStatus();
        airConditioner.printStatus();
    }
    public void startTreadmill(){

        treadmill.start();
    }
    public void stopTreadmill(){
        treadmill.stop();
    }
    public void setTemperature(double temp){
        airConditioner.setTemperature(temp);

    }
    public void playMusic(){

        musicSystem.play();
    }
    public void stopMusic(){
        musicSystem.stop();
    }
    public void setTreadmill(double speed){
        treadmill.setSpeed(speed);
    }

    public void setMusicSystem(int volume){
        musicSystem.setVolume(volume);
    }




}
