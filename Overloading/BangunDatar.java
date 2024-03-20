public class BangunDatar {
    public double hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public double hitungLuas(int sisi) {
        return sisi * sisi;
    }

    public double hitungLuas(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        System.out.println("Luas Persegi Panjang: " + bangunDatar.hitungLuas(5, 3));
        System.out.println("Luas Persegi: " + bangunDatar.hitungLuas(4));
        System.out.println("Luas Lingkaran: " + bangunDatar.hitungLuas(7.5));
    }
}
