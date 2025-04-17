public class OOP{
    public static void main(String args[]){
        dog indian = new dog();
        indian.setAge(7);
        indian.setColor("Green");

        System.out.println(indian.age);
        System.out.println(indian.color);
        
        // Access Modifers
        accountInfo ayushBhosale = new accountInfo();
        ayushBhosale.Username="ayushBhosale";
        ayushBhosale.setPwd("nagmodi");

        System.out.println(ayushBhosale.Username);
        // System.out.println(ayushBhosale.pwd); The field accountInfo.pwd is not visibleJava(33554503) String pwd

        // Inheritence
        human ayush = new human();
        System.out.println(ayush.numberOfEyes);  
        System.out.println(ayush.numberOfLegs);      
        ayush.eats();
    }
}
class dog{
    String color;
    int age;
    void setAge(int newAge){
        age = newAge;
    }
    void setColor(String newColor){
        color = newColor;
    }

}
// MOdifiers:-
class accountInfo{
    public String Username;
    private String pwd;
    void setPwd(String newPwd) {
        pwd = newPwd;
    }

}

class animal{
    int numberOfLegs;
    int numberOfEyes=2;
    void setLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }
    void eats(){
        System.out.println("Eats");
    }
}
class human extends animal{
    human(){
        this.numberOfLegs=2;
    }
    @Override
    void eats(){
        System.out.println("eats like mfker ");
    }
}

