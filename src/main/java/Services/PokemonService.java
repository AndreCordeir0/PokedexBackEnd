package Services;

import DAOs.PokemonDAO;
import DTOs.PokemonDTO;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class PokemonService {
@Inject
    PokemonDAO pokeDao;

public List<PokemonDTO> listarPokemons(){
    return  pokeDao.listarPokemon();
}

public PokemonDTO buscarPorID(Long id) throws RuntimeException {
    if(Objects.isNull(id)){
        throw new RuntimeException("Não foi possível encontrar o id");
    }
    return pokeDao.buscarPokemonPorId(id);

}
}
