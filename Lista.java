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
public class Lista<Musica extends Comparable<Musica>> {
    public NoLista<Musica> primeiro;
    
    public void inserir(Musica nomeMusica){
        NoLista<Musica> novo_no = new NoLista<Musica>(nomeMusica);
        NoLista<Musica> auxiliar = primeiro;
        NoLista<Musica> auxiliar2 = null;
        
        while((auxiliar != null) && (auxiliar.obterMusica().compareTo(novo_no.obterMusica())) == -1){
            auxiliar2 = auxiliar;
            auxiliar = auxiliar.obterProximo();
        }
        
        if(this.primeiro == null){
            this.primeiro = novo_no;
        }
        
        else if(auxiliar == this.primeiro){
            novo_no.inserirProximo(this.primeiro);
            this.primeiro = novo_no;
        }
        
        else{
            novo_no.inserirProximo(auxiliar);
            auxiliar2.inserirProximo(novo_no);
        }
    }
    
    public NoLista<Musica> remover(Musica nomeMusica){
        NoLista<Musica> auxiliar = primeiro;
        NoLista<Musica> auxiliar2 = null;
        
        while((auxiliar != null) && (auxiliar.obterMusica().compareTo(nomeMusica)) != 0){
            auxiliar2 = auxiliar;
            auxiliar = auxiliar.obterProximo();
        }
        
        if(auxiliar == this.primeiro){
            NoLista retorno = this.primeiro;
            this.primeiro = this.primeiro.obterProximo();
            return retorno;
        }
        
        else if(auxiliar != null){
            auxiliar2.inserirProximo(auxiliar.obterProximo());
        }
        
        return auxiliar;    
    }
    
    public NoLista<Musica> buscar(Musica nomeMusica){
        NoLista<Musica> auxiliar = primeiro;
        
        while((auxiliar != null) && (auxiliar.obterMusica().compareTo(nomeMusica)) != 0){
            auxiliar = auxiliar.obterProximo();
        }
        
        return auxiliar;
    }
    
    public String toString(){
        String s = "";
        NoLista<Musica> auxiliar = primeiro;
        
        while(auxiliar != null){
            s += auxiliar.obterMusica().toString() + " - ";
            auxiliar = auxiliar.obterProximo();
        }
        
        return s;
    }
}