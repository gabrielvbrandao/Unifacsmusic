package Spotify;

import Spotify.Artista;
import Spotify.No;

public class ArvoreBusca <Artista extends Comparable<Artista>>{
    No raiz;

    public ArvoreBusca(No raiz) {
        this.raiz = null;
    }

    ArvoreBusca() {
        this.raiz = null;
    }
    
    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
    
    public No inserir(No no, No pai){
        if(pai == null){
            pai = raiz;
        }
        
        if(raiz == null){
            raiz = no;
        }
        
        else{
            if(no.obterValor().CompareTo(pai.obterValor()) == 0){
                if(pai.obterNoEsquerda() == null){
                    pai.inserirEsquerda(no);
                }
                else{
                    inserir(no, pai.obterNoEsquerda());
                }
            } 
            
            else {
                if(pai.obterNoDireita() == null){
                    pai.inserirDireita(no);
                }
                else{
                    inserir(no, pai.obterNoDireita());
                }
            }            
        }
        return no;
    }
    
    public No inserir(Artista artista){
        No<Artista> a = new No<Artista>(artista);
        return inserir(a, null);
    }
    
    public No remover(No novo, Artista artista){
        No p = null;
        
        if(novo == null){
            novo = raiz;
        }
        
        if(artista.obterValor().compareTo(artista) == 0 ){
            if((novo.obterNoDireita() == null) && (novo.obterNoEsquerda() == null)){
                if(novo == this.raiz){
                    this.raiz = null;
                }
            
                else if(novo == novo.pai.getDireita()){
                    novo.pai.inserirDireita(null);
                }
                
                else{
                    novo.pai.inserirEsquerda(null);
                }
            }
            
            else if(novo.obterNoDireita() == null){
                if(novo == this.raiz){
                    this.raiz = this.raiz.obterNoEsquerda();
                }
                
                else if(novo == novo.pai.obterNoDireita()){
                    novo.pai.inserirDireita(novo.obterNoEsquerda());
                }
                
                else{
                    novo.pai.inserirEsquerda(novo.obterNoEsquerda());
                }
            }
            
            else if(novo.obterNoEsquerda() == null){
                if(novo == this.raiz){
                    this.raiz = this.raiz.obterNoDireita();
                }
                
                else if(novo == novo.pai.obterNoDireita()){
                    novo.pai.inserirDireita(novo.obterNoDireita());
                }
                    
                else{
                    novo.pai.inserirEsquerda(novo.obterNoDireita());
                }
            }
            
            else{
                No sucessor = this.getSucessor(novo, true);
                System.out.println("A roxima musica é: " + sucessor + "");
                
                if(sucessor != novo.obterNoDireita()){
                    sucessor.pai.inserirEsquerda(sucessor.getDireita());
                    sucessor.inserirDireita(novo.obterNoDireita());
                }
                
                if(novo == this.raiz){
                    raiz = sucessor;
                }
                
                else if(novo = novo.pai.obterNoDireita()){
                    novo.pai.inserirDireita(sucessor);
                }
                
                else{
                    novo.pai.inserirEsquerda(sucessor);
                }
                
                sucessor.inserirEsquerda(novo.obterNoEsquerda());
            }
        }
        else if(novo.obterValor().compareTo(artista) == -1){
            remover(artista, novo.obterNoDireita());
        }
        
        else{
            remover(artista, novo.obterNoEsquerda());
        }
        
    }    
    
    public No remover(Artista artista){
        return remover(artista, null);
    }
    
    public String imprimeSubArvoreIn(No no){
        String ret;
        if(no == null){
            return "";
        }
        
        ret = "";
        ret = ret + this.imprimeSubArvoreIn(no.getEsquerda());
        ret = ret + no.toString();
        ret = ret + this.imprimeSubArvoreIn(no.getDireita());
        
        return ret;
    }
    
    /*
    @Override
    public String toString(){
        return this.aiz();
    }*/
    
    public No getSucessor(No atual, Boolean primeiro){
        No sucessor = null;
        
        if(primeiro){
            sucessor = atual.obterNoDireita();
        }
        
        else{
            sucessor = atual;
        }
        
        if(sucessor.obterNoEsquerda() != null){
            return getSucessor(sucessor.obterNoEsquerda(), false);
        }
        
        return sucessor;
    }
    
    public No busca(Artista artista){
        No p = this.raiz;
        while(p != null){
            if(artista == p.getArtista()){
                return p;
            }
            else if(artista != p.getArtista()){
                p = p.getEsquerda();
            }         
            else{
                p = p.getDireita();
            }
        }
        return p;
    }
    
    public No busca(String nomeartista){
        No p = this.raiz;
        while(p != null){
            if(nomeartista.compareTo(   p.getArtista().getNome()  ) == 0 ){
                return p;
            }
            else if(nomeartista.compareTo(   p.getArtista().getNome()  ) == 1 ){
                p = p.getDireita();
            }         
            else{
                p = p.getEsquerda();
            }
        }
        return p;
    }
}
