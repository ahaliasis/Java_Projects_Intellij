public class MusicSystem {
    private boolean isPlaying;
    private int volume;


    public MusicSystem(boolean isPlaying, int Volume){
        this.isPlaying = isPlaying;
        if((volume < 0) || (volume > 100)){
            System.out.println("Volume must be between 0 - 100");
        }else{
            this.volume = volume;
        }

    }
    public void play(){
        isPlaying = true;
        System.out.println("Music starts");
    }
    public void stop(){
        isPlaying = false;
        System.out.println("Music stopped");
    }
    public void setVolume(int volume1){
        volume = volume1;
        System.out.println("the volume is now: " + volume);
    }

    public void printStatus(){
        System.out.println("music is playing: " + isPlaying);
        System.out.println("Volume: " + volume);
    }
}
