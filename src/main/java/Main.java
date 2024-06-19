public class Main {
    /*
    Правка: код отформатирован
     */


    public static void main(String[] args) {
        Person personFather = new PersonBuilder()
                .setName("Лина")
                .setSurname("Кошко")
                .setAge(33)
                .setAdress("Питер")
                .build();
        Person son = personFather.newChildBuilder()
                .setName("Дима")
                .build();
        System.out.println("Мама: " + personFather);
        System.out.println("Сын: " + son);

        try {
            // Не хватает обязательных полей
            System.out.println("Не хватает обязательных полей");
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            System.out.println("Возраст недопустимый");
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }


}
