package Spotify;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NoLista <Musica extends Comparable<Musica>>{
    private Musica nomeMusica;
    private NoLista proximo;
    
    public NoLista(Musica nomeMusica){
        this.nomeMusica = nomeMusica;
        proximo = null;
    }
    
    public NoLista<Musica> obterProximo(){
        return this.proximo;
    }
    
    public void inserirProximo(NoLista proximo){
        this.proximo = proximo;
    } 
    
    public void inserirMusica(Musica nomeMusica){
        this.nomeMusica = nomeMusica;
    }
    
    public Musica obterMusica(){
        return this.nomeMusica;
    }
    
    public String toString(){
        return this.nomeMusica.toString();
    }
}