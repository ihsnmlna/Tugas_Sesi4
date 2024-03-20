class Binatang {
    public void makan() {
        System.out.println("Binatang sedang makan...");
    }
}

class Burung extends Binatang {
    @Override
    public void makan() {
        System.out.println("Burung sedang makan biji-bijian...");
    }
}

class Singa extends Binatang {
    @Override
    public void makan() {
        System.out.println("Singa sedang makan daging...");
    }
}

public class MakananBinatang {
    public static void main(String[] args) {
        Binatang binatang1 = new Burung();
        Binatang binatang2 = new Singa();
        
        binatang1.makan();
        binatang2.makan();
    }
}
