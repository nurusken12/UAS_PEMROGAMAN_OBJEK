
package No2;

public class Segitiga extends bangundatar {
    private final double sisia = 8;
    protected double sisib = 1;
    protected double sisic = 8; 
    protected double jarijari = 18;
    
    @Override
    public void HitungLuas(){
        double luas ;
        luas = this.sisib * this.sisic/2;
        System.out.println("Alas : " + this.sisib + " CM ");
        System.out.println("Tinggi : " + this.sisic + " CM ");
        System.out.println("Luas Segitiga Adalah : " + luas + " CM ");
    }
    @Override
    public void HitungKeliling(){
        double keliling ;
        keliling = this.sisia + this.sisib + this.sisic;
        System.out.println("Sisi A : " + this.sisib + " CM ");
        System.out.println("Sisi B : " + this.sisic + " CM ");
        System.out.println("Sisi C : " + this.sisia + " CM ");
        System.out.println("Keliling Seitiga Adalah : " + keliling + " CM ");
    }
    
    }