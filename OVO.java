public class OVO implements IMetodePembayaran {
    
    @Override
    public boolean validasiVA(String nomorHP) {
        // di ewallet nomorHP digunakan sebagai validasi
        return nomorHP != null && nomorHP.startsWith("08") && nomorHP.length() == 12; 
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("==============================");
        System.out.println("  Pembayaran via OVO");
        System.out.println("  Jumlah: Rp " + String.format("%,.0f", jumlah));
        System.out.println("  OVO Points earned: " + (int)(jumlah * 0.01));
        System.out.println("  Status: BERHASIL");
        System.out.println("==============================");
    }
}
