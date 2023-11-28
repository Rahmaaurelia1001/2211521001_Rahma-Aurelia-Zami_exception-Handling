public class App {
    public static void main(String[] args) {
        DetailPembelian transaksi1 = new Pembeli(); // Objek Barang sebagai DetailTransaksi menggunakan polimorfisme
        DetailPembelian transaksi2 = new Item(); // Memanggil metode sesuai dengan perilaku yang bervariasi
        System.out.println();
        transaksi1.tampilkanDetails(); 
        System.out.println();
        transaksi2.tampilkanDetails(); 
        System.out.println();
    }
}