package models;


import DTOs.PokemonDTO;
import io.smallrye.common.constraint.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "tb_pokemon")
public class Pokemon {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pokemon")
    private Long id;

@Column
@NotNull
    private String nome;

@Column
    private int ataque;

@Column
private int defesa;

@Column
    private String tipo;

@Column
    private String fraqueza;

@Column
@Lob
    private String image;

    public Pokemon(PokemonDTO pokemon) {
        this.id = pokemon.getId();
        this.nome = pokemon.getNome();
        this.ataque = pokemon.getAtaque();
        this.defesa = pokemon.getDefesa();
        this.tipo = pokemon.getTipo();
        this.fraqueza = pokemon.getFraqueza();
        this.image = pokemon.getImage();
    }

    public Pokemon() {

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

