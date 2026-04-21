
public class BankMandiri implements IMetodePembayaran {

    @Override
    public boolean validasiVA(String nomorVA) {
        // VAlidasi Mandiri harus 10 digit
        return nomorVA != null && nomorVA.startsWith("MDR") && nomorVA.length() == 16;
    }

    @Override
     public void prosesPembayaran(double jumlah) {
        System.out.println("==============================");
        System.out.println("  Pembayaran via Bank MANDIRI");
        System.out.println("  Jumlah: Rp " + String.format("%,.0f", jumlah));
        System.out.println("  Status: BERHASIL");
        System.out.println("==============================");
    }
}