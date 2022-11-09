public class Singer extends Person {

    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    String singing() {
       return getName() + " Singing";
    }

    String playGitar() {
        return getName()+ " Play Gitar";
    }

    @Override
    String learn() {
        return super.learn();
    }

    @Override
    String walk() {
        return super.walk();
    }

    @Override
    String eat() {
        return super.eat();
    }

    @Override
    public String toString() {
        return "Singer\n" +
                "Band Name: " + bandName ;

    }
}
