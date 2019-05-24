package Spotify;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Album {
 
    private String nome;
    private Artista artista;
    private String genero;
    private ArrayList<Musica> musicas;


    public Album(String nome,  String genero) {
        this.nome = nome;
        this.genero = genero;
        this.musicas= new ArrayList<Musica>();  
    }


    public String getNomeAlbum() {
        return nome ;
    }

    public void setNomeAlbum(String nome ) {
        this.nome  = nome;
    }

    public Artista getNomeArtista() {
        return artista;
    }

    public void setNomeArtista(Artista artista) {
        this.artista = artista;
    }

    public ArrayList<Musica> getTipoMusica() {
        return musicas;
    }
    
    public  void setTipoMusica(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public void setGenero(String genero) {
        this.genero=genero;
    } 
    
    public void addMusica(Musica musica){
        this.musicas.add(musica);
    }
}