import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Main {
    public static void main(String[] args) {
        // Пример создания списка пользователей
        List<User> users = List.of(
                new User(1, "John", "Doe", 25, "USA"),
                new User(2, "Jane", "Smith", 30, "Canada"),
                new User(3, "Mike", "Johnson", 20, "USA"),
                new User(4, "Alice", "Brown", 15, "UK"),
                new User(5, "Tom", "Williams", 12, "Canada")
        );

        System.out.println("Users sorted by lastName:");
        User.sortByLastName(users).forEach(user -> System.out.println(user.getLastName()));

        System.out.println("\nUsers sorted by age:");
        User.sortByAge(users).forEach(user -> System.out.println(user.getAge()));

        System.out.println("\nAll users have age > 7: " + User.checkAgeGreaterThan7(users));

        System.out.println("\nAverage age: " + User.calculateAverageAge(users));

        System.out.println("\nNumber of unique countries: " + User.countUniqueCountries(users));
    }
}