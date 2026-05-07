public class Transaksi {
    String idTransaksi;
    String tanggalTransaksi;
    double totalHarga;
    DetailTransaksi[] detail;
    int jumlahItem;

    Pembayaran pembayaran;

void tambahDetail(DetailTransaksi dt){
    if(jumlahItem < detail.length){
        detail[jumlahItem] = dt;
        jumlahItem++;
    } else {
        System.out.println("Jumlah item melebihi kapasitas detail transaksi");
    

    }
    }
}

double hitungTotal(){
    totalHarga = 0;
    for(int i = 0; i < jummlahItem; i++){
        totalHarga += detail[i].subtotal;
        
 }



}