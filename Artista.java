package Spotify;

import java.util.ArrayList;

public class Artista {
    private String artista;
    private String estilo;
    private ArrayList<Album> albuns;

    public Artista(String artista) {
        this.artista = artista;
        this.albuns= new ArrayList<Album>();
    }

    public String getNome() {
        return artista;
    }

    public void setNome(String nomeArtista) {
        this.artista = artista;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }   

    public ArrayList<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(ArrayList<Album> albuns) {
        this.albuns = albuns;
    }
    
    public void addAlbum(Album album){
        this.albuns.add(album);
    }
}