package abstrak;
public class Abstrak {
    public static void main(String[] argv) {
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 8;
        stsk.hitungKeliling();
        stsk.hitungLuas();
        System.out.println("Luas STSK = "+stsk.luas);
        System.out.println("Keliling STSK = "+stsk.keliling);
        System.out.println("--------------------");
        
        SegiEmpat se = new SegiEmpat();
        se.lebar = 14;
        se.panjang = 21;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("luas se = "+se.luas);
        System.out.println("Keliling se = "+se.keliling);
        System.out.println("--------------------");
        
        Lingkaran l = new Lingkaran();
        l.jariJari = 7;
        l.hitungKeliling();
        l.hitungLuas();
        System.out.println("luas l = "+l.luas);
        System.out.println("Keliling l = "+l.keliling);
    }
    
}
