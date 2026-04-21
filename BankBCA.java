
public class BankBCA implements IMetodePembayaran {

    @Override
    public boolean validasiVA(String nomorVA) {
        // Validasi BCA harus diawali 8808
        return nomorVA != null && nomorVA.startsWith("BCA") && nomorVA.length() == 16;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("==============================");
        System.out.println("  Pembayaran via Bank BCA");
        System.out.println("  Jumlah: Rp " + String.format("%,.0f", jumlah));
        System.out.println("  Status: BERHASIL");
        System.out.println("==============================");
    }
}