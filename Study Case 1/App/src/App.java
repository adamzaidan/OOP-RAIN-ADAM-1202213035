import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Restoran EAD"
                            +"\nSilahkan Register Terlebih Dahulu"
                            +"\n================================");


        String nama, nohp;
        Scanner input = new Scanner (System.in);

        System.out.print("Nama: ");
        nama = input.nextLine();

        System.out.print("Phone Number: ");
        nohp = input.nextLine();

        System.out.println("\nRegister Success");
 
        System.out.println("Name: "+nama);
        System.out.println("Phone Number: "+nohp);
        System.out.println("===============================");


    }

    
}

