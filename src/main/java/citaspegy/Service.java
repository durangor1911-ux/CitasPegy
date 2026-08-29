package citaspegy;

public class Service {

    private int serviceId;
    private String name;
    private int durationMinutes;
    private double price;

    public Service(int serviceId, String name) {
        this.serviceId = serviceId;
        this.name = name;
    }

    public Service() {
    }


    public Service(int serviceId, String name, int durationMinutes, double price) {
        this.serviceId = serviceId;
        this.name = name;
        this.durationMinutes = durationMinutes;
        this.price = price;
    }


    public void create() {

    }

    public void selectAll() {

    }

    public void update() {

    }

    public void delete(int id) {

    }


    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}