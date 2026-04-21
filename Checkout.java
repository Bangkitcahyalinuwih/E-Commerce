
public class Checkout {

    public void bayar(IMetodePembayaran metode, String nomorVA, double jumlah) {
        System.out.println("\n[chekout] Memproses pembayaran");
        System.out.println("[chekout]Nomor VA/HP :" + nomorVA);


        if (metode.validasiVA(nomorVA)) {
            metode.prosesPembayaran(jumlah);
        } else {
            System.out.println("[chekout] ERROR : nomor VA/HP tidak valid");
        }
    }
}
