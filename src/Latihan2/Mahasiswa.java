package Latihan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mahasiswa {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);
        String nama;
        String alamat;
        String nilai;
        String prodi;
        System.out.println("+===============PENDAFTARAN MAHASISWA BARU===============+");
        System.out.print("\n");
        System.out.println("Selamat datang di IT Telkom Purwokerto,");
        System.out.println("Silakan isi form dibawah untuk mendaftar.");
        try {
            System.out.print(" Nama                       : ");
            nama = bufferedReader.readLine();
            System.out.print(" Asal Sekolah               : ");
            alamat = bufferedReader.readLine();
            System.out.print(" Rata-rata Nilai Smt 1-5    : ");
            nilai = bufferedReader.readLine();
            System.out.print(" Masukkan Pilihan Prodi     : ");
            prodi = bufferedReader.readLine();
            System.out.print("\n");
            System.out.println("+===============KONFIRMASI REGISTRASI===============+");
            System.out.println(" Nama                 : " + nama);
            System.out.println(" Asal Sekolah         : " + alamat);
            System.out.println(" Rata-rata Nilai      : " + nilai);
            System.out.println(" Pilihan Prodi        : " + prodi);
            System.out.println( nama + " Kamu berhasil melakukan registrasi, silakan tunggu pengumuman berikutnya ya!");
        } catch (IOException eox) {
            System.out.println(eox);
        }
    }
}
