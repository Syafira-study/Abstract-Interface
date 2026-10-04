/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] argv) {
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas sebelum diperbesar = "+se.luas);
        System.out.println("Keliling sebelum diperbesar = "+se.keliling);
        se.perbesar();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperbesar = "+se.luas);
        System.out.println("Keliling setelah diperbesar = "+se.keliling);
        System.out.println("--------------------");
        
        SegiTigaSamaKaki st = new SegiTigaSamaKaki();
        st.alas = 10;
        st.tinggi = 12;
        st.hitungKeliling();
        st.hitungLuas();
        System.out.println("Luas sebelum diperbesar = "+st.luas);
        System.out.println("Keliling sebelum diperbesar = "+st.keliling);
        st.perbesar();
        st.hitungKeliling();
        st.hitungLuas();
        System.out.println("Luas setelah diperbesar = "+st.luas);
        System.out.println("Keliling setelah diperbesar = "+st.keliling);
        System.out.println("--------------------");
        
        Lingkaran li = new Lingkaran();
        li.jariJari = 14;
        li.hitungKeliling();
        li.hitungLuas();
        System.out.println("Luas sebelum diperbesar = "+li.luas);
        System.out.println("Keliling sebelum diperbesar = "+li.keliling);
        li.perbesar();
        li.hitungKeliling();
        li.hitungLuas();
        System.out.println("Luas setelah diperbesar = "+li.luas);
        System.out.println("Keliling setelah diperbesar = "+li.keliling);
    }
}
