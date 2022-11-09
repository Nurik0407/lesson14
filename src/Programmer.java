public class Programmer extends Person {

    private String companyName;


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    String coding() {
      return  getName() + "coding";
    }


    @Override
    String learn() {
        return
                super.learn();
    }

    @Override
    String walk() {
        return
                super.walk();
    }

    @Override
    String eat() {
        return
                super.eat();
    }

    @Override
    public String toString() {
        return "Programmer\n" +
                "Company Name: " + companyName
                ;
    }
}
