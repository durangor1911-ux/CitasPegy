package citaspegy;

import java.util.Date;

public class Specialist extends Person {

    private String specialty;

    public Specialist(String specialty) {
        this.specialty = specialty;
    }

    public Specialist(String email, String name, String lastName, String specialty) {
        super(email, name, lastName);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override

    public void create() {

        super.create();

    }

    @Override

    public void selectAll() {

        super.selectAll();

    }

    @Override

    public void update() {

        super.update();

    }

    @Override

    public void delete(int id) {

        super.delete(id);

    }

    @Override

    public void selectAllById(int id) {

        super.selectAllById(id);

    }

}

