package citaspegy;

public class Business {
    private int businessId;
    private String name;
    private String type;
    private String address;
    private String phone;

    public Business(int businessId) {
        this.businessId = businessId;
    }

    public Business(int businessId, String name, String type) {
        this.businessId = businessId;
        this.name = name;
        this.type = type;
    }

    public Business(int bussinesId, String name, String type, String address, String phone) {
        this.businessId = bussinesId;
        this.name = name;
        this.type = type;
        this.address = address;
        this.phone = phone;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getaddres() {
        return address;
    }

    public void setAddres(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void created(){
    }
    public void selectAll(){
    }
    public void updated(){
    }
    public void deleted(int id){
    }
}