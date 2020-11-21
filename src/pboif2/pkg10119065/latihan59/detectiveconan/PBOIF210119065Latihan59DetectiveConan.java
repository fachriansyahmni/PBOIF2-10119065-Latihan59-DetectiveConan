package pboif2.pkg10119065.latihan59.detectiveconan;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program detektif conan
 */
public class PBOIF210119065Latihan59DetectiveConan {
    
    public static void main(String[] args) {
        Detektif detektif1 = new Detektif("Shinichi Kudo", 174, 
                "Tokoh utama protagonis");
        detektif1.setKeahlian("Detektif brillian");
        detektif1.TampillDetails();
        
        System.out.println("");
        Detektif detektif2 = new Detektif("Conan Edogawa", 95, 
                "Tokoh utama protagonis");
        detektif1.setKeahlian("Detektif yang teliti");
        detektif1.TampillDetails();
    }
    
}
