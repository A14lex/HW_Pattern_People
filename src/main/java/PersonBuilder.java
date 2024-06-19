public class PersonBuilder {
    /*
    Правка: код отформатирован
    Правка: скорректирован класс исключения
     */
    protected String name;
    protected String surname;
    protected Integer age;
    protected String adress;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Ошибка: некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age, adress);
        if (name == null) {
            throw new IllegalStateException("Ошибка: не указано имя");
        }
        if (surname == null) {
            throw new IllegalStateException("Ошибка: не указана фамилия");
        }
        if (adress == null) {
            throw new IllegalStateException("Ошибка: не указан адрес");
        }
        return person;
        /*...*/
    }
}