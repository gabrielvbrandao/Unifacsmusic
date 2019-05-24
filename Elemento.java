package Spotify;


import Spotify.Album;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Elemento {
    private Album nomeAlbum;
    private Elemento anterior;
    private Elemento proximo;
    
    public Elemento(){
        super();
    }

    public Elemento(Album nomeAlbum) {
        super();
        this.nomeAlbum = nomeAlbum;
    }

    public Album getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(Album nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public Elemento getAnterior() {
        return anterior;
    }

    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
    
    public int compareTo(Elemento o){
        if(o.getNomeAlbum() != nomeAlbum){
            return 1;
        }
        return 0;
    }
}
