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
public class PilhaMusica<T> {
    private T[] pilhaMusica;
    private int topo;

    public PilhaMusica(T[] pilhaMusica, int topo, int i) {
        this.pilhaMusica = (T[]) new Object[i];
        this.topo = -1;
    }
    
    public void inserir(T nomeMusica){
        if(!estaCheia()){
            this.pilhaMusica[++topo] = nomeMusica;
        }
    }
    
    public T remover(){
        if(estaVazia()){
            return (T) "A playlist esta Vazia!";
        }
        T t = pilhaMusica[topo];
        pilhaMusica[topo] = null;
        topo--;
        System.out.println("Musica" + t + "Deletada");
        return t;
    }
    
    public boolean estaVazia(){
        return topo == -1;
    }
    
    public boolean estaCheia(){
        if(topo == this.pilhaMusica.length -1){
            System.out.println("Playlist Cheia!");
            return true;
        }
        return false;
    }
    
    public void imprimirVetor(){
        for(int i = 0; i < pilhaMusica.length; i++){
            System.out.println(pilhaMusica[i]);
        }
    }
    
    public void imprimirPilhaMusica(){
        for(int i = 0; i <= topo; i++){
            System.out.println(pilhaMusica[i]);
        }
    }
    
    public T[] getPilhaMusica(){
        return pilhaMusica;
    }
    
    public int getTopo(){
        return topo;
    }
}
