import java.util.*;
public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        boolean isRunning = true;
        boolean valid = false;
        int choice = 0;
        boolean valid1 = false;
        int choice1 = 0;
        boolean valid2 = false;
        int choice2 = 0;
        boolean valid3 = false;
        int choice3 = 0;
        boolean valid4 = false;
        int choice4 = 0;
       
        while(isRunning){
            System.out.println("-----------------");
            System.out.println("Welcome to Cinema Paris");
            System.out.println("-----------------");
            System.out.println("1-Available Movies");
            System.out.println("2-TimeScreens");
            System.out.println("3-Choose a seat");
            System.out.println("4-Total");
            System.out.println("5-Exit");

            do{
                try{
                    System.out.print("Choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    valid = true;
                }catch (InputMismatchException e){
                    System.out.println("Only Numbers");
                    scanner.nextLine();
                    valid = false;
                }


            }while(!valid);

            switch (choice){
                case 1:
                    System.out.println("1-Amnet");
                    System.out.println("2-Fall Guy");
                    System.out.println("3-Annabelle");
                    System.out.println("4-Zootopia 2");

                    do{
                        try{
                            System.out.print("Choice: ");
                            choice1 = scanner.nextInt();
                            scanner.nextLine();
                            valid1 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only Numbers");
                            scanner.nextLine();
                            valid1 = false;
                        }


                    }while(!valid1);

                    switch (choice1){
                        case 1:
                            order.chooseMovie(new Movie("Amnet",7.00));
                            break;
                        case 2:
                            order.chooseMovie(new Movie("Fall Guy", 8.00));
                            break;
                        case 3:
                            order.chooseMovie(new Movie("Annabelle",6.40));
                            break;
                        case 4:
                            order.chooseMovie(new Movie("Zootopia 2", 5.50));
                            break;
                        default:
                            System.out.println("enter a valid choice");
                            break;
                    }


                    System.out.println("Movie selected");
                    break;

                case 2:
                    if(order.getMovie() == null){
                        System.out.println("You must select a movie first");
                        break;
                    }

                    Movie m = order.getMovie();

                    if(m.getMovieName().equals("Amnet")){
                        System.out.println("Available hours:");
                        System.out.println("1-21:00");
                        System.out.println("2-23:00");

                        int c = scanner.nextInt();

                        if(c == 1){
                            order.chooseTimeScreen(new TimeScreen("21:00"));
                        } else {
                            order.chooseTimeScreen(new TimeScreen("23:00"));
                        }
                    }

                    if(m.getMovieName().equals("Fall Guy")){
                        System.out.println("Available hours:");
                        System.out.println("1-20:00");
                        System.out.println("2-21:30");

                        int c = scanner.nextInt();

                        if(c == 1){
                            order.chooseTimeScreen(new TimeScreen("20:00"));
                        } else {
                            order.chooseTimeScreen(new TimeScreen("21:30"));
                        }
                    }

                    if(m.getMovieName().equals("Annabelle")){
                        System.out.println("Available hours:");
                        System.out.println("1-22:30");
                        System.out.println("2-21:00");

                        int c = scanner.nextInt();

                        if(c == 1){
                            order.chooseTimeScreen(new TimeScreen("22:30"));
                        } else {
                            order.chooseTimeScreen(new TimeScreen("21:00"));
                        }
                    }

                    if(m.getMovieName().equals("Zootopia 2")){
                        System.out.println("Available hours:");
                        System.out.println("1-19:00");
                        System.out.println("2-20:30");

                        int c = scanner.nextInt();

                        if(c == 1){
                            order.chooseTimeScreen(new TimeScreen("19:00"));
                        } else {
                            order.chooseTimeScreen(new TimeScreen("20:30"));
                        }
                    }

                    System.out.println("Time selected!");
                    break;


                case 3:
                    if(order.getMovie() == null){
                        System.out.println("You must choose a movie first");
                        break;
                    }

                    System.out.println("Seats");
                    System.out.println("1-A");
                    System.out.println("2-B");
                    System.out.println("3-C");
                    System.out.println("4-D");

                    do{
                        try{
                            System.out.print("Choice: ");
                            choice3 = scanner.nextInt();
                            scanner.nextLine();
                            valid3 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only Numbers");
                            scanner.nextLine();
                            valid3 = false;
                        }


                    }while(!valid3);

                    switch (choice3){
                        case 1:
                            order.chooseSeat(new Seat("A",10.50));
                            break;

                        case 2:
                            order.chooseSeat(new Seat("B",9.30));
                            break;

                        case 3:
                            order.chooseSeat(new Seat("C",8.70));
                            break;

                        case 4:
                            order.chooseSeat(new Seat("D",7.20));
                            break;

                        default:
                            System.out.println("Enter a valid choice");
                            break;


                    }

                    System.out.println("Do you have a discount? (Student, Not working, 4 Members family?");
                    System.out.println("1-Yes");
                    System.out.println("2-No");

                    do{
                        try{
                            System.out.print("Choice: ");
                            choice4 = scanner.nextInt();
                            scanner.nextLine();
                            valid4 = true;
                        }catch (InputMismatchException e){
                            System.out.println("Only Numbers");
                            scanner.nextLine();
                            valid4 = false;
                        }


                    }while(!valid4);

                    if(choice4 == 1){
                        order.setDiscount(true);
                    }else {
                        order.setDiscount(false);
                    }
                    break;

                case 4:
                    System.out.println("Your total is: " + order.calculateTotal());
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Enter a valid choice");
                    break;



            }






        }


    }}

