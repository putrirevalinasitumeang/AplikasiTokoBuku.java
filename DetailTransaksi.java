public class DetailTransaksi {
    int jumlah;
    double subtotal;
    
    Produk produk;

void hitungSubtotal(){
    subtotal = jumlah * produk.hargaProduk;

}

void TampilDetail(){
    System.out.println("Nama Produk:" + produk.namaProduk);
    System.out.println("Harga Produk:" + produk.hargaProduk);
    System.out.println("Jumlah:" + jumlah);
    System.out.println("Subtotal:" + subtotal);

}
    
}
