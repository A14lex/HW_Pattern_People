import java.util.Objects;
import java.util.OptionalInt;
    /*
    Правка: код отформатирован
    Правка: введен OptionalInt, изменен toString, доработан getAge (теперь с empty).
     */

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String adress;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.adress = null;
        this.age = null;

    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = null;
    }

    public Person(String name, String surname, String adress) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.age = null;
    }

    public Person(String name, String surname, Integer age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }


    public OptionalInt getAge() {
        if (age == null) {
            return OptionalInt.empty();
        } else {
            return OptionalInt.of(age);
        }


    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String city) {
        this.adress = adress;
    }

    public void happyBirthday() {
        this.age = age + 1;
    }

    public boolean hasAge() {
        if (age == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasAddress() {
        if (adress == null) {
            return false;
        } else {
            return true;
        }
    }

    public PersonBuilder newChildBuilder() {


        PersonBuilder personBuilder = new PersonBuilder()

                .setSurname(this.getSurname())

                .setAdress(this.getAdress());

        return personBuilder;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "; SurName: " + this.surname + "; age: " + this.age + "; Adress:" + this.adress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, adress);
    }


}