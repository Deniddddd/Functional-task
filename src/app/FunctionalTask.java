package app;

public class FunctionalTask {
    public static void main(String[] args) {
        // Створення об'єкту класу UserRegistry
        UserRegistry registry = new UserRegistry();

        // Додавання користувачів
        registry.addUser(new User("Павло ", "+555-666-777"));
        registry.addUser(new User("Юрій ", "+555-666-778"));
        registry.addUser(new User("Андрій ", "+555-666-797"));
        registry.addUser(new User("Богдан ", "+555-666-770"));
        registry.addUser(new User("Лев ", "+555-666-000"));

        // Виведення даних всіх користувачів за допомогою Consumer
        System.out.println("Дані користувачів:");
        registry.displayUsers(user -> System.out.println("Ім'я: " + user.getName() + ", Телефон: " + user.getPhoneNumber()));
    }
}
