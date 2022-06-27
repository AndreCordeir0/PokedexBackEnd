package Rest;

import DTOs.PokemonDTO;
import Services.PokemonService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
@Path("/pokemon")
public class PokemonRest {

    @Inject
    PokemonService pokeServ;

    @GET
    @Path("/all")
    public Response listarPokemons(){
    return  Response.status(Response.Status.OK).entity( pokeServ.listarPokemons()).build();
    }
    @GET
    @Path("{id}")
    public Response buscarPorID(@PathParam("id") final Long id){
        PokemonDTO pokeDTO = pokeServ.buscarPorID(id);
        return Response.ok(pokeDTO).build();
    }
}
