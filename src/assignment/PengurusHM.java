// File: PengurusHM.java
package assignment;

public class PengurusHM extends Mahasiswa {
    private String jabatan;

    public PengurusHM() { }

    public PengurusHM(String nama, String nim, String jabatan) {
        super(nama, nim);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
