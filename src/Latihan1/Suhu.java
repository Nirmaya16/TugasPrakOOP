package Latihan1;

import java.util.Scanner;

public class Suhu {
    private double celcius;
    private double fahreinheit;
    private double kelvin;
    private double reamur;
    private double bil;
    private int pilihan;

    public void menu() {
        System.out.println("Pilih suhu dari : ");
        System.out.println("1. Celcius");
        System.out.println("2. Fahreinheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Reamur");
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pilihan    : ");
        pilihan = scanner.nextInt();
        System.out.print("Masukkan Suhu   : ");
        bil = scanner.nextDouble();
    }
    public void konversi() {
        switch (pilihan) {
            case 1:
                System.out.println("Konversi : ");
                celcius = bil;
                System.out.println("Celcius     : "+celcius);
                fahreinheit = bil * 9 / 5 + 32;
                System.out.println("Fahreinheit : "+fahreinheit);
                kelvin = bil + 273;
                System.out.println("Kelvin      : "+ kelvin);
                reamur = bil * 4 / 5;
                System.out.println("Reamur      : "+ reamur);
                break;

            case 2:
                System.out.println("Konversi :");
                celcius = (bil - 32) * 5 / 9;
                System.out.println("Celcius     : "+celcius);
                fahreinheit = bil;
                System.out.println("Fahreinheit : "+fahreinheit);
                kelvin = (bil - 32) * 5 / 9 + 273;
                System.out.println("Kelvin      : "+kelvin);
                reamur = (bil - 32) * 4 / 9;
                System.out.println("Reamur      : " + reamur);
                break;

            case 3:
                System.out.println("Konversi :");
                celcius = bil - 273;
                System.out.println("Celcius     : "+celcius);
                fahreinheit = (bil - 273) * 9 / 5 + 32;
                System.out.println("Fahreinheit : "+fahreinheit);
                kelvin = bil;
                System.out.println("Kelvin      : "+kelvin);
                reamur = (bil - 273) * 4 / 5;
                System.out.println("Reamur      : "+ reamur);
                break;

            case 4:
                System.out.println("Konversi :");
                celcius = bil * 5 / 4;
                System.out.println("Celcius     : "+celcius);
                fahreinheit = (bil * 9 / 4) + 32;
                System.out.println("Fahreinheit : "+fahreinheit);
                kelvin = (bil * 5 / 4) + 273;
                System.out.println("Kelvin      : "+kelvin);
                reamur = bil;
                System.out.println("Reamur      : "+reamur);
                break;

            default:
                System.out.println("Oops, not valid!");
        }
    }
}
