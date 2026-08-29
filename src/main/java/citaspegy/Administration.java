package citaspegy;
import java.util.Date;

public class Administration extends Person{

    private String role;

    public Administration(String role) {
        this.role = role;
    }

    public Administration(String email, String name, String lastName, String role) {
        super(email, name, lastName);
        this.role = role;
    }

    public Administration(int id, String docType, String name, String lastName, String phone, String email, String password, Date birthDate, String role) {
        super(id, docType, name, lastName, phone, email, password, birthDate);
        this.role = role;

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public void create(){
    }
    @Override
    public void selectAll(){
    }
    @Override
    public void update(){
    }
    @Override
    public void delete(int id){
    }
}
