class Bentuk {
    public void gambar() {
        System.out.println("Menggambar bentuk...");
    }
}

class Lingkaran extends Bentuk {
    @Override
    public void gambar() {
        System.out.println("Menggambar lingkaran...");
    }
    
    public void gambar(int radius) {
        System.out.println("Menggambar lingkaran dengan radius " + radius);
    }
}

class Segitiga extends Bentuk {
    @Override
    public void gambar() {
        System.out.println("Menggambar segitiga...");
    }
    
    public void gambar(int alas, int tinggi) {
        System.out.println("Menggambar segitiga dengan alas " + alas + " dan tinggi " + tinggi);
    }
}

public class BentukLS {
    public static void main(String[] args) {
        Bentuk bentuk1 = new Lingkaran();
        Bentuk bentuk2 = new Segitiga();
        
        bentuk1.gambar();
        ((Lingkaran) bentuk1).gambar(5); // casting objek untuk mengakses metode overload
        bentuk2.gambar();
        ((Segitiga) bentuk2).gambar(4, 6); // casting objek untuk mengakses metode overload
    }
}
