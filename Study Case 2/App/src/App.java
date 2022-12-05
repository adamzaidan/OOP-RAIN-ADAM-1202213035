public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        
        TransportasiAir transportasi = new TransportasiAir(20, 5000);
        transportasi.informasi();
        transportasi.berlayar();
        transportasi.berlabuh();

        Sampan sampanbaru = new Sampan(10, 15000, 4);
        sampanbaru.informasi();
        sampanbaru.berlayar();
        sampanbaru.berlabuh();
        sampanbaru.berlabuh(1);

        Kapal kapalbaru = new Kapal(500, 100000, "TurboJet");
        kapalbaru.informasi();
        kapalbaru.berlayar();
        kapalbaru.berlayar(350);
        kapalbaru.berlabuh();;
    }
}
