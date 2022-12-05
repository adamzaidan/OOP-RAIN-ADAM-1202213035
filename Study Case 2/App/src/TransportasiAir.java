public class TransportasiAir {
    // attribute
    protected int JumlahKursi; 
    protected int biaya;
  
    // constructor
    public TransportasiAir(int JumlahKursi, int biaya){
      this.JumlahKursi = JumlahKursi;
      this.biaya = biaya;
    }
    // method
    public void informasi() {
      System.out.println("\nTransportasi air yang tidak diketahui jenisnya mempunyai kursi berjumlah " + JumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya + ".");//
    }
    public void berlayar() {
      System.out.println("Transportasi air yang tidak diketahui jenisnya sedang berlayar dengan lancar.");
    }
    public void berlabuh () {
      System.out.println("Transportasi air yang tidak diketahui jenisnya diketahui sedang berlabuh di pantai.");
    }
  }
