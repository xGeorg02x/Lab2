import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor

import java.util.List;
import java.util.stream.Collectors;

class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;

    // Метод 1: Сортировка по lastName
    public static List<User> sortByLastName(List<User> users) {
        return users.stream()
                .sorted((u1, u2) -> u1.getLastName().compareTo(u2.getLastName()))
                .collect(Collectors.toList());
    }

    // Метод 2: Сортировка по age
    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted((u1, u2) -> Integer.compare(u1.getAge(), u2.getAge()))
                .collect(Collectors.toList());
    }

    // Метод 3: Проверка, что age > 7 для всех пользователей
    public static boolean checkAgeGreaterThan7(List<User> users) {
        return users.stream().allMatch(user -> user.getAge() > 7);
    }

    // Метод 4: Вычисление среднего возраста
    public static double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }

    // Метод 5: Количество разных стран
    public static long countUniqueCountries(List<User> users) {
        return users.stream()
                .map(User::getCountry)
                .distinct()
                .count();
    }
}