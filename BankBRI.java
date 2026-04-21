public class BankBRI implements IMetodePembayaran {

    @Override
    public boolean validasiVA(String nomorVA) {
        return nomorVA != null && nomorVA.startsWith("BRI") && nomorVA.length() == 16;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("==============================");
        System.out.println("  Pembayaran via Bank BRI");
        System.out.println("  Jumlah: Rp " + String.format("%,.0f", jumlah));
        System.out.println("  Status: BERHASIL");
        System.out.println("==============================");
    }
}
