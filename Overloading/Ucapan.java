public class Ucapan {
    public void ucapkanSalam(String nama) {
        System.out.println("Selamat pagi, " + nama + "!");
    }

    public void ucapkanSalam(String nama, String waktu) {
        System.out.println("Selamat " + waktu + ", " + nama + "!");
    }

    public static void main(String[] args) {
        Ucapan ucapan = new Ucapan();
        ucapan.ucapkanSalam("D. Ihsan Maulana");
        ucapan.ucapkanSalam("Gina Amalia", "siang");
    }
}
