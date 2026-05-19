package org.sebsy.grasps.services;

import java.time.LocalDateTime;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.beans.TypeReservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.TypeReservationDao;
import org.sebsy.grasps.utils.DateUtils;
import org.sebsy.grasps.dto.CreateReservationDto;

public class ReservationService implements IReservationService {

    private ClientDao clientDao = new ClientDao();
    private TypeReservationDao typeReservationDao = new TypeReservationDao();

    @Override
    public Reservation creerReservation(CreateReservationDto dto) {
        LocalDateTime date = DateUtils.toLocalDateTime(dto.getDateReservation());

        Client client = clientDao.extraireClient(dto.getIdentifiantClient());

        TypeReservation type = typeReservationDao.extraireTypeReservation(dto.getTypeReservation());

        return client.creerReservation(date, dto.getNbPlaces(), type);
    }
}
