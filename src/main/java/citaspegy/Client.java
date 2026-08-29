package citaspegy;
import java.util.Date;
public class Client extends Person {
    public Client() {
    }

    public Client(String email, String name, String lastName) {
        super(email, name, lastName);
    }

    public Client(int id, String docType, String name, String lastName, String phone, String email, String password, Date birthDate){
        super(id, docType, name, lastName, phone, email, password, birthDate);
    }
}
