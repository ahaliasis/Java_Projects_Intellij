public class Treadmill {
    private boolean isRunning;
    private double speed;



    public Treadmill(boolean isRunning,double speed){
        this.isRunning = isRunning;
        if((speed < 0) || (speed > 8)){
            System.out.println("choose a speed between 0 - 8");
        }else {
            this.speed = speed;
        }
    }
    public void start(){
        isRunning =true;
        System.out.println("Tredmill starts");
    }

    public void stop(){
        isRunning = false;
        System.out.println("Tredmill stoped");
    }
    public void setSpeed(double speed2){
        speed =speed2;
        System.out.println("the speed is now: " + speed);
    }

    public void printStatus(){
        System.out.println("Tredmill running: " + isRunning);
        System.out.println("Speed: " + speed);
    }
}
