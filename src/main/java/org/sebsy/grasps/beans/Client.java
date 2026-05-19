package org.sebsy.grasps.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {

    @Id
    private String identifiantClient;

    private boolean premium;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations = new ArrayList<>();

    public Client() {

    }

    public Client(String identifiantClient, boolean premium) {
        super();
        this.identifiantClient = identifiantClient;
        this.premium = premium;
    }

    /**
     * Getter
     *
     * @return the identifiantClient
     */
    public String getIdentifiantClient() {
        return identifiantClient;
    }

    /**
     * Setter
     *
     * @param identifiantClient the identifiantClient to set
     */
    public void setIdentifiantClient(String identifiantClient) {
        this.identifiantClient = identifiantClient;
    }

    /**
     * Getter
     *
     * @return the premium
     */
    public boolean isPremium() {
        return premium;
    }

    /**
     * Setter
     *
     * @param premium the premium to set
     */
    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    /**
     * Getter
     *
     * @return the reservations
     */
    public List<Reservation> getReservations() {
        return reservations;
    }

    /**
     * Setter
     *
     * @param reservations the reservations to set
     */
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    /**
     * Crée, configure et ajoute une réservation pour ce client
     */
    public Reservation faireReservation(LocalDateTime date, int nbPlaces, TypeReservation type) {
        Reservation reservation = new Reservation(date);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(this);
        
        double total = type.calculerMontantTotal(nbPlaces, this.isPremium());
        reservation.setTotal(total);
        
        this.reservations.add(reservation);
        
        return reservation;
    }
}
