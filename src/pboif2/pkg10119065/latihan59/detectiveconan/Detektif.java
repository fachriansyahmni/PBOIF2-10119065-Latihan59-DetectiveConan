package pboif2.pkg10119065.latihan59.detectiveconan;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program detektif conan
 */
public class Detektif extends Karakter{
    private String keahlian;

    public Detektif(String nama, int tinggiBadan, String peran) {
        super(nama, tinggiBadan, peran);
    }
    
    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
    
    @Override
    public void TampillDetails()
    {
        System.out.println("Nama: "+nama);
        System.out.println("Tinggi Badan: "+tinggiBadan+ " cn");
        System.out.println("peran: "+peran);
        System.out.println("keahlian: "+keahlian);
    }
}
