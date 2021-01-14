
package No2;


public class Main {
    
    public static void main (String[] args){
        bangundatar bd = new bangundatar();
        bd.HitungLuas();
        bd.HitungKeliling();
        
        System.out.println("NIM SAYA 201969040018");
        System.out.println("=======================");
        System.out.println("LUAS DAN KELILING SEITIGA");
        
        Segitiga st = new  Segitiga();
        st.HitungLuas();
        System.out.println("=====================");
        st.HitungKeliling();
        
        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");
        
        System.out.println("LUAS DAN KELILING PERSEGI");
        Persegi kotak = new Persegi();
        kotak.HitungLuas();
        System.out.println("=====================");
        kotak.HitungKeliling();
        
        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");
        
        System.out.println("LUAS DAN KELLING LINGKARAN");
        Lingkaran bundar = new Lingkaran();
        bundar.HitungLuas();
        System.out.println("=====================");
        bundar.HitungKeliling();
        
    }
}
