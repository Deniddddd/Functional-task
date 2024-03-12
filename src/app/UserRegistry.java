package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class UserRegistry {
    private List<User> users = new ArrayList<>();

    // Додати користувача до реєстру
    public void addUser(User user) {
        users.add(user);
    }

    // Вивести дані всіх користувачів
    public void displayUsers(Consumer<User> consumer) {
        users.forEach(consumer);
    }
}


