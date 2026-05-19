package org.sebsy.grasps;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.beans.TypeReservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.TypeReservationDao;
import org.sebsy.grasps.utils.DateUtils;

import java.time.LocalDateTime;

/**
 * Controlleur qui prend en charge la gestion des réservations client
 */
public class ReservationController {

    private ClientDao clientDao = new ClientDao();
    private TypeReservationDao typeReservationDao = new TypeReservationDao();

    /**
     * Méthode qui créée une réservation pour un client à partir des informations
     * transmises
     */
    public Reservation creerReservation(Params params) {

        LocalDateTime dateReservation = DateUtils.toLocalDateTime(params.getDateReservation());
        Client client = clientDao.extraireClient(params.getIdentifiantClient());
        TypeReservation type = typeReservationDao.extraireTypeReservation(params.getTypeReservation());

        return client.creerReservation(dateReservation, params.getNbPlaces(), type);
    }
}