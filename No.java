package Spotify;

import Spotify.Artista;

public class No <Artista extends Comparable<Artista>>{
    public Artista artista;
    private No direita;
    private No esquerda;
    No pai;

    public Artista getArtista() {
        return artista;
    }
    
    public void inserirValor(Artista artista){
        this.artista = artista;
    }

    public Artista obterValor(){
        return this.artista;
    }
    
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No(Artista artista, No direita, No esquerda) {
        this.artista = artista;
        this.direita = direita;
        this.esquerda = esquerda;
    }

    public No(Artista artista) {
        this.artista = artista;
    }
    
    public void inserirEsquerda(No esquerda){
        this.esquerda = esquerda;
        if(esquerda != null){
            esquerda.pai = this;
        }
    }
    
    public void inserirDireita(No direita){
        this.direita = direita;
        if(direita != null){
            direita.pai = this;
        }
    }
    
    public No obterNoEsquerda(){
        return this.esquerda;
    }
    
    public No obterNoDireita(){
        return this.direita;
    }
    
    public No sucessor(No no){
        No sucessor = no;
        sucessor = sucessor.getDireita();
        while(sucessor.getEsquerda() != null){
            sucessor = sucessor.getEsquerda();
        }
        return sucessor;
    }
    
    public No antecessor(No no){
        No antecessor = no;
        antecessor = antecessor.getEsquerda();
        while(antecessor.getDireita() != null){
            antecessor = antecessor.getDireita();
        }
        return antecessor;
    }   
}