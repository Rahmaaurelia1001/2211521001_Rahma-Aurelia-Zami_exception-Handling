import java.util.Scanner;

public class Item  extends Pembelian implements DetailPembelian
{
    private String namaItem;
    private double hargaItem;
    private int jumlahItem;
    private double totalIHarga;

    public Item() 
    {
        masukkanDetails();
        calculateTotal();
    }

    @Override
    public void masukkanDetails() 
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama Item: ");
        this.namaItem = scanner.nextLine();
        System.out.println("Harga Item: ");
        this.hargaItem = Double.parseDouble(scanner.nextLine());
        boolean jumlah = false;
        while (!jumlah) 
        {
            try 
            {
                    System.out.println("Jumlah Beli: ");
                    this.jumlahItem = scanner.nextInt();
                    if (jumlahItem <= 0) throw new Exception();
                    jumlah = true;
            }
            catch (Exception e) 
            {
                System.out.println("Input jumlah barang salah");
            }
        }
    }

    private void calculateTotal()
    {
        this.totalIHarga = hargaItem* jumlahItem;
    }

    @Override
    public void tampilkanDetails() 
    {
        System.out.println("Detail Item:");
        System.out.println("Nama Item: " + namaItem);
        System.out.println("Harga Item: " + hargaItem);
        System.out.println("Jumlah Item: " + jumlahItem);
        System.out.println("Total : " + totalIHarga);
    }    
}
