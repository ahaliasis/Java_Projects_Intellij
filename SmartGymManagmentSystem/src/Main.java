import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SmartGym smartGym = new SmartGym();
        boolean isRunning = true;
        int choice = 0;
        double speed = 0;
        int volume = 0;
        double temperature = 0;
        boolean valid = false;
        boolean valid2 = false;
        boolean valid3 = false;
        boolean valid4 = false;


        while(isRunning){

            System.out.println("------MENU------");
            System.out.println("1-Start gym day");
            System.out.println("2-Start treadmill");
            System.out.println("3-Set treadmill speed");
            System.out.println("4-Play music");
            System.out.println("5-Set music volume");
            System.out.println("6-Set Ac temperature");
            System.out.println("7-Show status");
            System.out.println("8-Shutdown gym");
            System.out.println("9-Exit");



            do{
                try{
                    System.out.print("choice: ");
                    choice = scanner.nextInt();
                    valid = true;
                }catch (InputMismatchException e){
                    System.out.println("only numbers");
                    scanner.nextLine();
                    valid = false;
                }
            }while(!valid);

            switch(choice){
                case 1:
                    smartGym.startGymDay();
                    break;

                case 2:
                    smartGym.startTreadmill();
                    break;

                case 3:
                    do{
                        try{
                            System.out.print("set treadmill speed: ");
                            speed = scanner.nextDouble();
                            valid2 = true;
                        }catch (InputMismatchException e){
                            System.out.println("only numbers");
                            scanner.nextLine();
                            valid2 = false;
                        }
                    }while(!valid2);

                    smartGym.setTreadmill(speed);
                    break;

                case 4:
                    smartGym.playMusic();
                    break;

                case 5:
                    do{
                        try{
                            System.out.print("set volume: ");
                            volume = scanner.nextInt();
                            valid3 = true;
                        }catch (InputMismatchException e){
                            System.out.println("only numbers!");
                            scanner.nextLine();
                            valid3 = false;
                        }
                    }while(!valid3);

                    smartGym.setMusicSystem(volume);
                    break;

                case 6:
                    do{
                        try {
                            System.out.print("set temperature: ");
                            temperature = scanner.nextDouble();
                            valid4 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only numbers");
                            scanner.nextLine();
                            valid4 = false;
                        }
                    }while(!valid4);

                    smartGym.setTemperature(temperature);
                    break;

                case 7:
                    smartGym.printStatus();
                    break;

                case 8:
                    smartGym.shutDownGym();
                    break;

                case 9:
                    isRunning = false;
                    System.out.println("Exit.....");
                    break;

                default:
                    System.out.println("enter a valid choice");
                    break;


            }






        }





    }}

