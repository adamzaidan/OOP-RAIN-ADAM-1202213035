public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        
        TransportasiAir transportasi = new TransportasiAir(20, 5000);
        transportasi.informasi();
        transportasi.berlayar();
        transportasi.berlabuh();

        Sampan sampan1 = new Sampan(10, 15000, 4);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh(1);

        Kapal kapal1 = new Kapal(500, 100000, "TurboJet");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(350);
        kapal1.berlabuh();;
    }
}
