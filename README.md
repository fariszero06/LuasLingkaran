## Menghitung Luas Lingkaran menggunakan bahasa pemrograman Java </p>
Halo guys kali ini membahas mengenai program java untuk menghitung luas lingkaran (Konstruktor dan Getter&Setter). Buat teman-teman yang mungkin saat ini sedang menempuh studi dan belajar bahasa pemrograman java, pasti akan sering mendapat tugas untuk membuat program-program sederhana untuk menyelesaikan suatu permasalahan, misalnya saja untuk menghitung luas lingkaran. </p>
Untuk menghitung luas lingkaran tentunya kita harus mengetahui terlebih dahulu rumusnya, berikut ini adalah rumus luas lingkaran: </p>

<b> Rumus Luas Lingkaran: </b> </p>
![rumus](screenshot/rumus.png) </p>
<b> Keterangan: </b> </p>

π = 22/7 atau 3,14 </p>
r = jari-jari lingkaran </p>

π (Phi) adalah sebuah konstanta dalam matematika yang merupakan perbandingan keliling lingkaran dengan diameternya. Sementara jari-jari lingkaran merupakan jarak antara titik pusat lingkaran dengan tepinya. </p>

Pada program yang akan kita buat nilai phi yang diguanakan adalah 3,14 dengan asumsi jari-jari lingkarang sudah kita ketahui, jadi kita hanya tinggal mencari luas lingkaran berdasarkan rumusnya. </p>

# Program Java Menghitung Luas Lingkaran </p>
```java
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

``` 
</p>

# Penjelasan Program:
Pada program diatas kita menggunakan fungsi scanner untuk proses input saat program dijalankan. Kita membuat objek dengan nama input yang mengacu ke <b> class scanner </b>. </p>
Pada program ini kita membuat 3 variabel yaitu variabel luas dan phi menggunakan tipe data <b> double </b> (untuk bilangan desimal), variabel phi kita set sebagai variabel konstanta dengan <b> nilai 3,14. </b> variabel yang ketiga adalah <b> r (jari-jari) </b> untuk menampung nilai jari-jari lingkaran yang akan dimasukan oleh pengguna. </p>

Selanjutnya user akan memasukan nilai r lewat sintak <b> r=input.nextInt(); </b> sintak ini merupakan objek input yang telah kita inisialisasi di dalam fungsi main() yang mengacu pada <b> class scanner. nextInt() </b> merupakan fungsi didalam class scanner yang menerima nilai inputan dengan tipe integer. Selanjutnya terdapat rumus <b> luas=phi*r*r; </b> rumus ini adalah rumus luas lingkaran nantinya nilai <b> phi (3,14) </b> akan dikalikan dengan jari-jari kuadrat. Terakhir sintak <b> System.out.println(“Luas Lingkaran = “+luas); </b> akan mencetak kalimat <b> “Luas lingkaran = “ </b> dengan menampilkan hasil perhitungan rumus luas lingkaran. </p>

# Hasil Output Program: </p>
![Output](screenshot/output.png </p>


