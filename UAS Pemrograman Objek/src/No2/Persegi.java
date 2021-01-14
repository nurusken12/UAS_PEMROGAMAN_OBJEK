
package No2;

public class Persegi extends Segitiga {
   
    public void HitungLuas(){
        double luas;
        luas = this.sisic * this.sisic;
        System.out.println("Panjang SISI :" + this.sisic + "CM");
        System.out.println("Luas Persegi Adalah :" + luas + "CM");
    }
    
    
    public void HitungKeliling(){
        double Keliling;
        double keliling = this.sisic * 2;
        System.out.println("Panjang SISI :" + this.sisic + "CM");
        System.out.println("Luas Persegi Adalah :" + keliling + "CM");
    }
}
