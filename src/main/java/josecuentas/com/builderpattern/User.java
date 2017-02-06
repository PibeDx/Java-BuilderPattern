package josecuentas.com.builderpattern;

/**
 * Created by jcuentast on 6/02/17.
 */
public class User {

    private final String name;
    private final String lastName;
    private final String city;

    public User(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.city = builder.city;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public static final class Builder {
        private String name;
        private String lastName;
        private String city;

        private Builder() {}

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public static Builder create(){
            return new Builder();
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
