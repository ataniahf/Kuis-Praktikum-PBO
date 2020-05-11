package kuis_pbo;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author ATANIA
 */
public class Main {
    public static void main(String[] args) throws Exception{
        
        int pilih;
        char ulang;
        Scanner input = new Scanner(System.in);
   
        do {
        
        System.out.println("-------- MENU ---------");
        System.out.println("1. Pendaftaran Admin Laboratorium");
        System.out.println("2. Pendaftaran Asisten Laboratorium");
        System.out.print("Pilih menu: ");
        try {
            pilih = input.nextInt();
            System.out.println("");
            switch(pilih)
            {
                case 1:
                {
                    String nama;
                    int nim, tes_tulis, tes_praktek_coding, tes_wawancara, tes_praktek_jaringan;
                    int jumlah=0;
                    System.out.println("---REGISTRASI ADMIN LABORATORIUM---");
                    System.out.print("Masukkan banyak data calon pendaftar: ");
                    jumlah = input.nextInt();
                    for (int i = 0; i < jumlah; i++) 
                    {
                        System.out.print("Masukkan Nama : ");
                        input.nextLine();
                        nama = input.nextLine();
                        System.out.print("Masukkan NIM : ");
                        nim = input.nextInt();
                        System.out.println("");
                        System.out.println("---PENILAIAN---");
                        System.out.print("Masukkan Nilai Tes Tulis : ");
                        tes_tulis = input.nextInt();
                        System.out.print("Masukkan Nilai Tes Praktek Coding : ");
                        tes_praktek_coding = input.nextInt();
                        System.out.print("Masukkan Nilai Tes Wawancara : ");
                        tes_wawancara = input.nextInt(); 
                        System.out.print("Masukkan Nilai Tes Praktek Jaringan : ");
                        tes_praktek_jaringan = input.nextInt();
                        
                        Admin satu = new Admin(nama, nim, tes_tulis, tes_praktek_coding, tes_wawancara, tes_praktek_jaringan);
                        System.out.println("Nilai Rata-rata : " + satu.hasil_rata2);
                        
                        if(satu.hasil_rata2 > 85)
                        {
                            System.out.println("Selamat "+satu.nama+" dengan NIM "+satu.nim+"! anda LOLOS dan diterima sebagai Admin Laboratorium");
                            System.out.println("");
                        }
                        else
                        {
                           System.out.println("Maaf "+satu.nama+" dengan NIM "+satu.nim+" ! anda GAGAL diterima sebagai Asisten Laboratorium");
                           System.out.println("Tetap Semangat!!");
                           System.out.println("");
                        }
                    
                    
                    }
                    break;
                }
                case 2:
                {
                    String nama;
                    int nim, tes_tulis, tes_praktek_coding, tes_wawancara, tes_microteaching;
                    int jumlah=0;
                    System.out.println("---REGISTRASI ASISTEN LABORATORIUM---");
                    System.out.print("Masukkan banyak data calon pendaftar: ");
                    jumlah = input.nextInt();
                    for (int i = 0; i < jumlah; i++) 
                    {
                        System.out.print("Masukkan Nama : ");
                         input.nextLine();
                        nama = input.nextLine();
                        System.out.print("Masukkan NIM : ");
                        nim = input.nextInt();
                        System.out.println("---PENILAIAN---");
                        System.out.print("Masukkan Nilai Tes Tulis : ");
                        tes_tulis = input.nextInt();
                        System.out.print("Masukkan Nilai Tes Praktek Coding : ");
                        tes_praktek_coding = input.nextInt();
                        System.out.print("Masukkan Nilai Tes Wawancara : ");
                        tes_wawancara = input.nextInt();      
                        System.out.print("Masukkan Nilai Tes Microteaching : ");
                        tes_microteaching = input.nextInt();
                        
                        Aslab dua= new Aslab(nama, nim, tes_tulis, tes_praktek_coding, tes_wawancara, tes_microteaching);
                        System.out.println("Nilai Rata-rata : " + dua.hasil_rata2);
                        if(dua.hasil_rata2 > 85)
                        {
                            System.out.println("Selamat "+dua.nama+" dengan NIM "+dua.nim+" ! anda LOLOS dan diterima sebagai Asisten Laboratorium");
                            System.out.println("");
                        }
                        else
                        {
                            System.out.println("Maaf "+dua.nama+" dengan NIM "+dua.nim+" ! anda GAGAL diterima sebagai Asisten Laboratorium");
                            System.out.println("Tetap Semangat!!");
                            System.out.println("");
                        }
                    }
                    break;
                }
            }
            
        } catch (InputMismatchException e) {
            System.err.println("Exception: Input harus number tidak boleh string!");
            input.nextLine();
        }
            System.out.print("Apakah anda ingin mengulang? (y/n) : ");
            ulang = input.next().charAt(0);
            System.out.println("");
        } while (ulang == 'y' || ulang == 'Y');
        
    }
   
}

