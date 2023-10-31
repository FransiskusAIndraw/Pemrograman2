package soal1;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    LinkedList<dadu> listDadu = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Dadu : ");
        int jumlahDadu = input.nextInt();
        for (int i = 0; i < jumlahDadu; i++ ){
            dadu dadu1 = new dadu();
            listDadu.add(dadu1);}
        for (int i = 0; i < listDadu.size(); i++){
            System.out.println("Dadu ke "+ (i + 1)+ " adalah :  " + listDadu.get(i).getAngka());}
        int jTotal = 0;
        for (dadu dadu1 : listDadu){
            jTotal += dadu1.getAngka();}
        System.out.println("Total Nilai Dadu Keseluruhan = " + jTotal);}}
