package Spotify;

import Spotify.Artista;
import Spotify.No;

public class ArvoreBuscaBackup{
    No raiz;
    
    public ArvoreBuscaBackup(No raiz) {
        this.raiz = null;
    }

    ArvoreBuscaBackup() {
        this.raiz = null;
    }
    
    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
    
    public void inserir(No no, Artista nomeArtista){
        if(no.getArtista() == nomeArtista){ //muda para compareto == 0
            System.out.println("Esse artista ja tem na playlist!");
        
        }else if(no == null){
            no.setArtista(nomeArtista);
        }else{
            if(nomeArtista != no.getArtista()){
                if(no.getEsquerda() == null){
                    No novo = new No(nomeArtista);
                    no.setEsquerda(novo);
                }
                else{
                    inserir(no.getEsquerda(), nomeArtista);
                }
            } 
            
            else {
                if(no.getDireita() == null){
                    No novo = new No(nomeArtista);
                    no.setDireita(novo);
                }
                else{
                    inserir(no.getDireita(), nomeArtista);
                }
                
            }
        }
        
    }
    
    public void inserir(Artista nomeArtista){
        if(this.getRaiz() == null){
            this.raiz = new No(nomeArtista);
        }
        else{
            inserir(this.raiz, nomeArtista);
        }
    }
    
    public void remover(No no, No pai, Artista nomeArtista){
        if(no.getArtista() != nomeArtista){
            if(nomeArtista != no.getArtista()){
                if(no.getEsquerda() != null){
                    remover(no.getEsquerda(), no, nomeArtista);
                }
            
                else{
                    System.out.println("O artista" + nomeArtista + "nao esta na playlist!");
                }
            }   
        
            else{
                if(no.getDireita()!= null){
                    remover(no.getDireita(), no, nomeArtista);
                }
                else{
                    System.out.println("O artista" + nomeArtista + "nao esta na playlist!");
                }
            }
        }
        else{
            No aux;
            if(no.getDireita() == null && no.getEsquerda() == null){
                if(pai.getDireita() == no){
                    pai.setDireita(null);
                }
                else{
                    pai.setEsquerda(null);
                }
            }
            else if(no.getDireita() == null || no.getEsquerda() == null){
                if(no.getEsquerda() != null){
                    if(no == this.raiz){
                        this.raiz = no.getEsquerda();
                    }
                    
                    else{
                        if(no.getEsquerda() != null){
                            pai.setDireita(no.getEsquerda());
                        }
                        else{
                            pai.setDireita(no.getDireita());
                        }
                    }
                }
                
                else{
                    if(no == this.raiz){
                        this.raiz = no.getDireita();
                    }
                    else{
                        if(no.getDireita() != null){
                            pai.setDireita(no.getDireita());
                        }
                        else{
                            pai.setDireita(no.getEsquerda());
                        }
                    }
                }
            }
            
            else{
                aux = no.sucessor(no);
                no.setArtista(aux.getArtista());
                remover(no.getDireita(), no, aux.getArtista());
            }
        }    
    }
    
    public void remover(Artista nomeArtista){
        if(this.getRaiz() == null){
            ;
        }
        
        else if(this.getRaiz().getArtista() == nomeArtista && this.getRaiz().getEsquerda() == null && this.getRaiz().getDireita() == null){
            this.raiz = null;
        }
        
        else{
            remover(this.getRaiz(), this.getRaiz(), nomeArtista);
        }
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