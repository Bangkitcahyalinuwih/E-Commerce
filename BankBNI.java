
public class BankBNI implements IMetodePembayaran {

    @Override
    public boolean validasiVA(String nomorVA) {
        // VA BNI harus angka semua
        return nomorVA != null && nomorVA.startsWith("BNI") && nomorVA.length() == 16;
    }

    @Override
     public void prosesPembayaran(double jumlah) {
        System.out.println("==============================");
        System.out.println("  Pembayaran via Bank BNI");
        System.out.println("  Jumlah: Rp " + String.format("%,.0f", jumlah));
        System.out.println("  Status: BERHASIL");
        System.out.println("==============================");
    }
}