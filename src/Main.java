public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Sanjar","Work","Google");
        Dancer dancer = new Dancer("Dastan","work","Olayni");
        Singer singer = new Singer("Ilim","hobby","Black Star");
        System.out.println(programmer+"\n"+programmer.learn()+"\n"+programmer.walk()+"\n"+programmer.eat()+"\n"+programmer.coding());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(dancer+"\n"+dancer.learn()+"\n"+dancer.walk()+"\n"+dancer.eat()+"\n"+dancer.dancing());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(singer+"\n"+singer.learn()+"\n"+singer.walk()+"\n"+singer.eat()+"\n"+singer.singing()+"\n"+singer.playGitar());


    }
}