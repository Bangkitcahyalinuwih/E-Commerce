
public class Main {
    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        System.out.println("=== DEMO SISTEM PEMBAYARAN MULTIBANK DAN EWALLET ===");

        IMetodePembayaran bca = new BankBCA();
        IMetodePembayaran mandiri = new BankMandiri();
        IMetodePembayaran bri = new BankBRI();
        IMetodePembayaran bni = new BankBNI();
        IMetodePembayaran ovo = new OVO();
        IMetodePembayaran gopay = new GoPay();

        // Bank 
        checkout.bayar(bca, "BCA1234567890123", 10_000);   // valid
        checkout.bayar(mandiri, "MDR1234567890987", 20_000); // valid
        checkout.bayar(bni, "BNI1234567890123", 10_0000);   // valid
        checkout.bayar(bri, "BRI1234567890123", 20_000); // valid
        

        // Ewallet
        checkout.bayar(ovo,   "081234567890", 75_000);
        checkout.bayar(gopay, "081234567891", 120_000);

        // va tidak valid error
        System.out.println("\n == contoh uji coba nomor va eror == ");
        checkout.bayar(ovo,   "08123456789000", 75_000); // digit lebih dari 12
        checkout.bayar(mandiri, "1234567890", 120_000); // tidak diawali mdr


    }
}
