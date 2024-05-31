// File: Main.java
package assignment;

public class Main {
    public static void main(String[] args) {
        PengurusHM phm = new PengurusHM("Joko Supriyanto", "231110062", "Ketua");
        System.out.println("Nama: " + phm.getNama());
        System.out.println("NIM: " + phm.getNim());
        System.out.println("Jabatan: " + phm.getJabatan());
    }
}
