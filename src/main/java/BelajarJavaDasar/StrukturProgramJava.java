package BelajarJavaDasar; //ini adalah Package/folder

import java.util.Scanner;

//Ini adalah Classs, Wadah, Blue_Print dari kelas ini
public class StrukturProgramJava { //Body Class Start
    //    Ini adalah main funtion, program yang pertama kali di jalankan
    public static void main(String[] args){  //Body Main Funtion Start
        Scanner scan = new Scanner(System.in);
        String nama;
        int tahunLahir;
        int tahunSekarang;
        int umur;
        System.out.println("=====PROGRAM TEBAK UMUR=====");
        System.out.print("Masukan Nama Anda     : ");
        nama = scan.next();
        System.out.print("Masukan tahun sekarang: ");
        tahunSekarang = scan.nextInt();
        System.out.print("Masukan tahun lahir   : ");
        tahunLahir = scan.nextInt();
        umur = tahunLahir - tahunSekarang;
        System.out.println("Berarti "+nama+" umur kamu adalah "+umur);

    }//Body Mian Funtion End
}//Body Class End

