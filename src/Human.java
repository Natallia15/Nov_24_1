import java.util.Objects;

public class Human {
    String name;
    String lastName;
    int age;
    Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " +lastName + " " +  age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName);
    }

   @Override
    public int hashCode() {
        return name.length() + age;
    }

}
