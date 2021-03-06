package carRent.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity

public class Resevation {
    @Id
    @GeneratedValue
    private int id;
    private LocalDate reservationDate;
    @OneToOne
    private Client client;
    @OneToOne
    private Car car;
    private LocalDate fromDate;
    private LocalDate toDate;

    public Resevation(int id, LocalDate reservationDate, Client client, Car car, LocalDate fromDate, LocalDate toDate) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.client = client;
        this.car = car;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
}
