public class MataUang {
    public double konversiRupiah(double dollar) {
        return dollar * 14.500;
    }

    public double konversiRupiah(int yen) {
        return yen * 125;
    }

    public static void main(String[] args) {
        MataUang mataUang = new MataUang();
        System.out.println("10 USD = Rp" + mataUang.konversiRupiah(10));
        System.out.println("1000 Yen = Rp" + mataUang.konversiRupiah(1000));
    }
}
