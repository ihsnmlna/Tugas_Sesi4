class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Anjing menggonggong...");
    }
}

class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Kucing mengeong...");
    }
}

public class SuaraHewan{
    public static void main(String[] args) {
        Hewan hewan1 = new Anjing();
        Hewan hewan2 = new Kucing();
        
        hewan1.bersuara();
        hewan2.bersuara();
    }
}
