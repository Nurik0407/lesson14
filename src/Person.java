public class Person {

    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    String learn() {
        return name +" learn";
    }

    String walk() {
        return name + " walk";
    }

    String eat() {
        return  name + " eat";
    }
}

