package Spotify;


import Spotify.Elemento;
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
public class ListaCircular {
    private Elemento primeiro;
    private Elemento auxiliar;
    private Elemento ponteiro;
    
    public void adicionarNoComeco(Elemento elemento){
        if(primeiro == null){
            primeiro = elemento;
            auxiliar = elemento;
            ponteiro = elemento;
        }
        else{
            elemento.setProximo(primeiro);
            primeiro.setAnterior(elemento);
            auxiliar = primeiro;
            primeiro = elemento;
            auxiliar.setProximo(primeiro);
            primeiro.setAnterior(auxiliar);
        }
    }
    
    public void adicionarNoFim(Elemento elemento){
        if(primeiro == null){
            primeiro = elemento;
            auxiliar = elemento;
            ponteiro = elemento;
        }
        
        else{
            auxiliar.setProximo(elemento);
            elemento.setAnterior(auxiliar);
            auxiliar = elemento;
            auxiliar.setProximo(primeiro);
            primeiro.setAnterior(auxiliar);
        }
    }
    
    public Elemento getPosicao(int pos){
        Elemento controle = primeiro;
        int posicaoAtual = 0;
        while(controle.getProximo() != primeiro){
            if(pos == posicaoAtual){
                return controle;
            }
            controle = controle.getProximo();
            posicaoAtual++;
        }
        if(pos == posicaoAtual){
            return controle;
        }
        return null;
    }
    
    public void irInicio(){
        ponteiro = primeiro;
    }
    
    public void irFim(){
        ponteiro = auxiliar;
    }
    
    public void listar(){
        Elemento controle = primeiro;
        while(controle.getProximo() != primeiro){
            System.out.println("Album: " + controle.getNomeAlbum());   
            controle = controle.getProximo();
        }
        System.out.println("Album: " + controle.getNomeAlbum());
    }
    
    public void proximo(){
        ponteiro = ponteiro.getProximo();
    } 
    
    public void anterior(){
        ponteiro = ponteiro.getAnterior();
    }
    
    public Elemento getPonteiro(){
        return ponteiro;
    }
}