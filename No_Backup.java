package Spotify;

import Spotify.Artista;

public class No_Backup <Artista extends Comparable<Artista>>{
    No_Backup esquerda;
    No_Backup direita;
    Artista artista;
    No_Backup pai;

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public No_Backup getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No_Backup esquerda) {
        this.esquerda = esquerda;
    }

    public No_Backup getDireita() {
        return direita;
    }

    public void setDireita(No_Backup direita) {
        this.direita = direita;
    }
    
    public No_Backup(Artista artista){
        this.artista = artista;
    }
    
    public No_Backup(Artista artista, No_Backup pai){
        this.artista = artista;
        this.pai = pai;
    }
    
    public void inserirArtista(Artista artista){
        this.artista = artista;
    }
    
    public Artista obterArtista(){
        return this.artista;
    }
    
    public void inserirEsquerda(No_Backup esquerda){
        this.esquerda = esquerda;
        if(esquerda != null){
            esquerda.pai = this;
        }
    }
    
    public void inserirDireita(No_Backup direita){
        this.direita = direita;
        if(direita != null){
            direita.pai = this;
        }
    }
    
    public No_Backup obterNoEsquerda(){
        return this.esquerda;
    }
    
    public No_Backup obterNoDireita(){
        return this.direita;
    }
    
    public String toString(){
        return this.artista.toString();
    }
    
    public void inserirPai(No_Backup pai){
        this.pai = pai;
    }
            
    public No_Backup obterPai(){
        return this.pai;
    }
}