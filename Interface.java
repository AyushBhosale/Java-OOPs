public class Interface {
    public static void main(String[] args) {
        platipus wakankar = new platipus();
        elephant gajRaj = new elephant();
        shark ayush = new shark();
        wakankar.walks();
        gajRaj.walks();
        ayush.swims();
        wakankar.swims();

    }
}
interface Amibians{
    void swims();
}
interface Mammal{
    void walks();
}
class platipus implements Mammal, Amibians{
    public void walks(){
        System.out.println("Turu Turu");
    }
    public void swims(){
        System.out.println("Zur Zur");
    }
}
class elephant implements Mammal {
    public void walks(){
        System.out.println("Dhup Dhup");
    }
}
class shark implements Amibians{
    public void swims(){
        System.out.println("Zup Zup");
    }
}