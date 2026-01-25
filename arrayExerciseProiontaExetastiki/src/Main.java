package dev.lpa;
import java.util.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /*Για 10 προϊόντα να διαβάζετε:

        Όνομα προϊόντος

        Κατηγορία (μόνο “trofimo”, “rouxo”, “ilektroniko” — με έλεγχο εγκυρότητας)

        Τιμή (θετικός αριθμός)

        Να υπολογίζετε:

        πόσα προϊόντα υπάρχουν σε κάθε κατηγορία

        το ακριβότερο προϊόν ανά κατηγορία

        τη μέση τιμή όλων των προϊόντων*/

        String [] onomaProiontos = new String[10];
        String [] katigoria = new String[10];
        double [] timi = new double[10];

        kataxwrisi(onomaProiontos,katigoria,timi);
        System.out.println("-------------------------------------------");
        ipologismosKatheKatigorias(onomaProiontos,katigoria,timi);
        System.out.println("-------------------------------------------");
        akrivoteroProion(onomaProiontos,katigoria,timi);
        System.out.println("-------------------------------------------");
        mesiTimi(onomaProiontos,katigoria,timi);
        System.out.println("-------------------------------------------");





    }
    public static void kataxwrisi(String [] array1, String [] array2, double [] array3){
        System.out.println("Menu proiontwn");
        for(int i = 0; i < array1.length; i++){
            System.out.print("Onoma Proiontos: ");
            array1[i] = scanner.nextLine();


            array2[i] = ""; // den proxwrouse giati htan null prepei na to arxikopoiisw
            while(!array2[i].equalsIgnoreCase("trofimo") && (!array2[i].equalsIgnoreCase("rouxo")) && (!array2[i].equalsIgnoreCase("ilektroniko"))) {
                //elegxos gia mono tis treis katigories
                System.out.print("se ti katigoria anikei(trofimo-rouxo-hlektroniko): ");
                array2[i] = scanner.nextLine();


            }
            do {
                System.out.print("dwse timi gia: " + array1[i] + ": ");
                array3[i] = scanner.nextDouble();
                scanner.nextLine();
            }while(array3[i] < 0); //elegxos gia mono thetikous arithmous
        }

        System.out.println("Epitixis kataxwrisi");
    }
    public static void ipologismosKatheKatigorias(String [] array1, String [] array2, double [] array3){
        int countTrofimo = 0;
        int countRouxo = 0;
        int countIlektroniko = 0;

        for(int i = 0; i < array1.length;i++){

            if(array2[i].equalsIgnoreCase("trofimo")){
                countTrofimo ++;
            }
            if(array2[i].equalsIgnoreCase("rouxo")){
                countRouxo++;
            }
            if(array2[i].equalsIgnoreCase("ilektroniko")){
                countIlektroniko++;
            }

        }
        System.out.println("Stin katigoria trofima iparxoun: " + countTrofimo);
        System.out.println("Stin katigoria rouxo iparxoun:" + countRouxo);
        System.out.println("Stin katigoria ilektroniko yparxoun: " + countIlektroniko);
    }
    public static void akrivoteroProion(String [] array1, String [] array2, double [] array3){
        String maxTrofimo = array1[0];
        double maxTrofimoTimi = array3[0];
        String maxRouxo =array1[0];
        double maxRouxoTimi = array3[0];
        String maxIlektroniko = array1[0];
        double maxIlektronikoTimi = array3[0];

        for(int i = 0; i < array1.length;i++){
            if(array2[i].equalsIgnoreCase("trofimo")){
                if(array3[i] > maxTrofimoTimi){
                    maxTrofimoTimi = array3[i];
                    maxTrofimo = array1[i];
                }
            }
            if(array2[i].equalsIgnoreCase("rouxo")){
                if(array3[i] > maxRouxoTimi){
                    maxRouxoTimi = array3[i];
                    maxRouxo = array1[i];
                }
            }
            if(array2[i].equalsIgnoreCase("ilektroniko")){
                if(array3[i] > maxIlektronikoTimi){
                    maxIlektronikoTimi = array3[i];
                    maxIlektroniko = array1[i];
                }
            }

        }
        System.out.println("To pio akrivo proion stin katigoria trofimwn einai: " + maxTrofimo + " me timi: " + maxTrofimoTimi);
        System.out.println("To pio akrivo proion stin katigoria rouxwn einai: " + maxRouxo + " me timi: " + maxRouxoTimi);
        System.out.println("To pio akrivo proion stin katigoria ilektronikwn einai: " + maxIlektroniko + " me timi: " + maxIlektronikoTimi);






    }
    public static void mesiTimi(String [] array1, String [] array2, double [] array3){
        double sum =0;
        double average =0;
        for(int i = 0; i < array1.length;i++){
            sum+= array3[i];

        }
        average = sum / 10;
        System.out.println("O mesos oros olwn twn proiontwn einai: " + average);
    }




}