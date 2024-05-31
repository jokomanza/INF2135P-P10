package training;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Joko Supriyanto", "231110062");
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
    }
}
