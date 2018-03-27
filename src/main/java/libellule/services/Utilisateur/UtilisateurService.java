package libellule.services.Utilisateur;

import libellule.domain.Utilisateur.Token;
import libellule.domain.Utilisateur.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurService {
    List<Utilisateur> findAll();

    Optional<Utilisateur> findById(String id);

    Optional<Utilisateur> authentification(String login, String password);

    void insertOne(Utilisateur user);

    void insertMany(List<Utilisateur> users);

    void deleteOne(Integer idUser);

    void updateOne(Utilisateur user);

}
