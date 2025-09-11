import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "=" + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Utils {

    public static void sortUsers(List<User> users) {
        // your code here
        users.sort((user1, user2) -> {
            int nameComparison = user1.getName().compareTo(user2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            } else {
                return Integer.compare(user2.getAge(), user1.getAge());
            }
        });
    }
}