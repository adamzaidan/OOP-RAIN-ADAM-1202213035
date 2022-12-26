public class Sampan extends TransportasiAir {
    // attribute
    protected int layar;
  
    // constructor
    public Sampan(int JumlahKursi, int biaya, int layar) {
      super(JumlahKursi, biaya);
      this.layar = layar;
    }
  
    // method
    @Override
    public void informasi() {
      System.out.println("\nTransportasi air dengan jenis Sampan dengan jumlah kursi sebanyak " + JumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya + ".");
    }
  
    @Override
    public void berlayar() {
      System.out.println("Transportasi air dengan jenis Sampan sedang berlayar menggunakan " + layar + " layar.");
    }
  
    @Override
    public void berlabuh() {
      System.out.println("Transportasi air dengan jenis Sampan sedang berlabuh di pelabuhan.");
    }
  
    public void berlabuh(int jangkar) {
      System.out.println("Transportasi air dengan jenis Sampan sedang berlabuh di pantai menggunakan " + jangkar + " jangkar.");
    }
  }