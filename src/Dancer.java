public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    String dancing(){
        return getName()+"dancing";
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
        return "Dancer\n" +
                "Group Name: " + groupName ;

    }
}
