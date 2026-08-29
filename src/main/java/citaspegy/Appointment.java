package citaspegy;

import java.util.Date;
public class Appointment {
    private int appointmentId;

    private Date Date;

    private String starTime;

    private String status;

    private String bookingCode;

    public Appointment(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Appointment(int appointmentId, Date date) {
        this.appointmentId = appointmentId;
        Date = date;
    }

    public Appointment(int appointmentId, Date date, String starTime, String status, String bookingCode) {
        this.appointmentId = appointmentId;
        this.Date = date;
        this.starTime = starTime;
        this.status = status;
        this.bookingCode = bookingCode;
    }

    public int getAgendaId() {
        return appointmentId;
    }

    public void setAppointmentIdId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public void create(){
    }
    public void selectAll(){
    }
    public void update() {
    }
    public void delete(int id){
    }
}

