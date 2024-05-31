package training;

public class Mahasiswa extends Manusia {

    private String nim;

    public Mahasiswa() { }

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String getNama() {
        System.out.println("getNama method has been overridden!");
        return super.getNama();
    }
}
