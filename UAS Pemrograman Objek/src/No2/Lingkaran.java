
package No2;


public class Lingkaran extends Segitiga {
   
    public void HitungLuas(){
        double luas;
            luas = 3.14 * jarijari * jarijari;
            System.out.println("Jari-jari Lingkaran :" + jarijari);
            System.out.println("Luas Lingkaran Adalah :" + luas);
    }
    
    public void HitungKeliling(){
        double keliling;
            keliling = 2* 3.14 * jarijari;
            System.out.println("Jari-jari Lingkaran :" + jarijari);
            System.out.println("Luas Lingkaran Adalah :" + keliling);
           
    }
    
}
