package DTOs;

import models.Pokemon;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PokemonDTO {

    private Long id;
    @NotEmpty(message = "nome do pokemon não pode ser vazio")
    private String nome;

    private int ataque;

    private int defesa;

    private String tipo;

    private String fraqueza;

    private String image;

    public PokemonDTO(Pokemon pokemon) {
        this.id = pokemon.getId();
        this.nome = pokemon.getNome();
        this.ataque = pokemon.getAtaque();
        this.defesa = pokemon.getDefesa();
        this.tipo = pokemon.getTipo();
        this.fraqueza = pokemon.getFraqueza();
        this.image = pokemon.getImage();
    }
    public PokemonDTO(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
