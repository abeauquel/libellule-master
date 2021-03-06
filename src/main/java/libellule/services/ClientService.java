package libellule.services;

import libellule.domain.Client;
import libellule.exception.TechnicalException;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> findAll() throws TechnicalException;

    Optional<Client> findOne(Integer id);

    Client insertOne(Client client);

    void insertMany(List<Client> clients);

    void deleteOne(Integer idClient);

    void updateOne(Client client) throws TechnicalException;
}
