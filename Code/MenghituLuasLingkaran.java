import java.util.Scanner;


public class MenghituLuasLingkaran {
    public double luas;
    public double phi=3.14;
    public int r;
  
  // Construktur
    public MenghitungLuasLingkaran(double  luas,  double phi, int r){
       System.out.println ("Menghitung Luas Lingkaran");
       this.luas = luas;
       this.phi=phi;
       this.r=r;
  }
  
  //ini method setter
  
     public void setLuas(double luas){
        this.luas = luas;
  }
  
     public void setPhi(double  phi){
        this.phi = phi;
  }
  
  public void set(int r){
     this.r = r;
  }
  
   // ini method getter
     public double getLuas (){
        return this.luas; 
  }
  
      public double getPhi (){
        return this.phi; 
  }
  
  public int  getR (){
     return this.r; 
  }
  
  
  
  public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     double luas, phi=3.14;
     int r;
     
     System.out.print("Masukan jari-jari : ");
     r=input.nextInt();
     
     luas=phi*r*r;
     System.out.println("Luas Lingkaran = "+luas);
  }  
    
}
