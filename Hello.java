import java.util.List;

public class Hello {

    public static void main(String args[]) {

        Hello h = new Hello();
        List<User> users = h.getUser();
        users.stream().filter(user -> user.getGender().equals(Hello.User.Gender.male)).forEach(System.out::println);

        List<String> address = users.stream().map(User::getAddress).toList();
        System.out.println(address);
    }

    List<User> getUser() {
        return List.of(new User(1L, "a", "111", Hello.User.Gender.male, "sss"),
                new User(1L, "a", "111", Hello.User.Gender.male, "sss"),
                new User(1L, "a", "111", Hello.User.Gender.male, "sss"),
                new User(1L, "a", "111", Hello.User.Gender.male, "sss"));
    }

    public class User {
        Long id;
        String username;
        String password;
        Gender gender;
        String address;

        public User() {

        }

        public User(Long id,
                String username,
                String password,
                Gender male,
                String address) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.gender = male;
            this.address = address;
        }

        Long getId() {
            return this.id;
        }

        void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "User [id=" + id + ", username=" + username + ", password=" + password + ", gender=" + gender
                    + ", address=" + address + "]";
        }

        enum Gender {
            male, female, other
        }
    }

}
