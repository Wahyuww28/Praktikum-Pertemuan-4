package com.TugasPertemuan4;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika Matematika = new Matematika();
        Matematika2 MTK2 = new Matematika2();

        int tambah = Matematika.Tambah(20, 10);
        System.out.println("Hasil pertambahan : " + tambah);

        int kurang = Matematika.Kurang(10, 5);
        System.out.println("Hasil pengurangan : " + kurang);

        int kali = Matematika.Perkalian(10, 3);
        System.out.println("Hasil perkalian : " + kali);

        int bagi = Matematika.Pembagian(21, 2);
        System.out.println("Hasil Pembagian : " + bagi);

        int modulus = Matematika2.modulus(4,5);
        System.out.println("Hasil modulus : " + modulus);

    }
}
