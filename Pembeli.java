import java.util.Scanner;

public class Pembeli extends Pembelian implements DetailPembelian
{
    private String namaPembeli;
    private String nomorHandphone;

    public Pembeli() 
    {
        masukkanDetails();
    }

    @Override
    public void masukkanDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama Pembeli: ");
        this.namaPembeli = scanner.nextLine();
        System.out.println("Nomor HP: ");
        this.nomorHandphone = scanner.nextLine();
    }

    @Override
    public void tampilkanDetails() 
    {
        System.out.println("Detail Pembeli:");
        System.out.println("Nama: " + namaPembeli);
        System.out.println("Nomor HP: " + nomorHandphone);
    }
}
