package DAOs;

import DTOs.PokemonDTO;
import models.Pokemon;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PokemonDAO extends GenericDAO<Pokemon , Long> {

    public List<PokemonDTO> listarPokemon() {
        var querySQL = "SELECT p FROM Pokemon p";
        var query = this.getEntityManager().createQuery(querySQL);
        List<PokemonDTO> podto = query.getResultList();

        return podto.stream().collect(Collectors.toList());
    }
    public PokemonDTO buscarPokemonPorId(Long id){
        var query = "SELECT p FROM Pokemon p WHERE id_pokemon = :id";
        var querySQL = this.createQuery(query);
        querySQL.setParameter("id",id);

        var convertToDTO = querySQL.getSingleResult();
        PokemonDTO pokeDTO = new PokemonDTO(convertToDTO);
        return pokeDTO;
    }
}
