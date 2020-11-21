package pboif2.pkg10119065.latihan59.detectiveconan;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program detektif conan
 */
public class Karakter {
    protected String nama, peran;
    protected int tinggiBadan;

    public Karakter(String nama, int tinggiBadan, String peran) {
        this.nama = nama;
        this.tinggiBadan = tinggiBadan;
        this.peran = peran;
    }

    public String getNama() {
        return nama;
    }

    public int tinggiBadan() {
        return tinggiBadan;
    }

    public String getPeran() {
        return peran;
    }
    
    public void TampillDetails(){
        System.out.println("Nama: "+nama);
        System.out.println("asal: "+tinggiBadan);
        System.out.println("peran: "+peran);
    }
}
