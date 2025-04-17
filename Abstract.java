public class Abstract {
    public static void main(String args[]){
        platipus wakankar = new platipus();
        wakankar.eats();
        wakankar.walks();
        wakankar.sees();
        System.out.println(wakankar.color);
        wakankar.changeColor("Green");
        System.out.println(wakankar.color);
        // Elephant
        elephant gajRaj = new elephant();
        gajRaj.eats();
        gajRaj.walks();
        System.out.println(gajRaj.hasTrunk());
    }
}
abstract class mammal{
    String color;
    mammal(){
        color = "Brown";
    }
    void changeColor(String color){
        this.color=color;
    }
    void eats(){
        System.out.println("Munch Munch Munch Gobal Gobal Gobal");
    }
    abstract void walks();
}

class platipus extends mammal{
    void walks(){
        System.out.println("It swims and walks");
    }    
    void sees(){
        System.out.println("Can see Water!");
    }
}

class elephant extends mammal{
    void walks(){
        System.out.println("Runs at speed of 50k/hr");
    }
    boolean hasTrunk(){
        return true;
    }
}