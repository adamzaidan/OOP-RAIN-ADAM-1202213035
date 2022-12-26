public class Kapal extends TransportasiAir {
    // attribute
    protected String mesin;
  
    // constructor
    public Kapal(int JumlahKursi, int biaya, String mesin) {
      super(JumlahKursi, biaya);
      this.mesin = mesin;
    }
  
    // method
    @Override
    public void informasi() {
      System.out.println("\nTransportasi air dengan jenis Kapal dengan jumlah kursi sebanyak " + JumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya + ".");
    }
  
    @Override
    public void berlayar() {
      System.out.println("Transportasi air dengan jenis Kapal sedang berlayar menggunakan mesin " + mesin + " dengan kecepatan yang tidak stabil.");
    }
  
    public void berlayar(int kecepatan) {
      System.out.println("Transportasi air dengan jenis Kapal sedang berlayar menggunakan mesin " + mesin + " dengan kecepatan di kisaran " + kecepatan + " knot.");
    }
  
    @Override
    public void berlabuh() {
      System.out.println("Transportasi air dengan jenis Kapal sedang berlabuh di pantai.");
    }
  }
