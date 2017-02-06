package josecuentas.com.builderpattern;

/**
 * Created by jcuentast on 6/02/17.
 */
public class Main {

    public static void main(String[] args) {
        User user = User.Builder.create()
                .setName("José")
                .setLastName("Cuentas")
                .setCity("Lima")
                .build();
        System.out.println(user.toString());
    }
}