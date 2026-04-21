public class GoPay implements IMetodePembayaran{

    @Override
    public boolean validasiVA(String nomorHP) {
        return nomorHP != null && nomorHP.startsWith("08") && nomorHP.length() == 12;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("==============================");
        System.out.println("  Pembayaran via GoPay");
        System.out.println("  Jumlah: Rp " + String.format("%,.0f", jumlah));
        System.out.println("  GoPay Points earned: " + (int)(jumlah * 0.01));
        System.out.println("  Status: BERHASIL");
        System.out.println("==============================");
    }
}
