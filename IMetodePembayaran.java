public interface IMetodePembayaran {
    boolean validasiVA(String nomorVA);
    void prosesPembayaran(double jumlah);
}
