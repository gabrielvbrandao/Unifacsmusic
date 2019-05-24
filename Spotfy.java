/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spotify;

import java.util.ArrayList;
import Spotify.ArvoreBusca;
import java.io.File;

/**
 *
 * @author Usuario
 */
public class Spotfy {
    public static void main(String args[]){
        /*
        String path = "C:/Users/Usuario/Desktop/Spotify/Spotify/src/Musicas/Sertanejo/Luan Santana/Live movel/03 - Vingança (Part. MC Kekel).mp3";
        File mp3File = new File(path);
        Reproduzir musica = new Reproduzir(mp3File);
        musica.play();
        musica.pause();
        */
        
        Artista artista1 = new Artista("Luan Santana");

        Album a1 = new Album("live movel", "Sertanejo");
        Musica m1 = new Musica("Sofazinho", "../musicas");
        Musica m2 = new Musica("Vingança", "../musicas");
        Musica m3 = new Musica("Menina", "../musicas");

        a1.addMusica(m1);
        a1.addMusica(m2);
        a1.addMusica(m3);

        artista1.addAlbum(a1);
        
        Artista artista2 = new Artista("Ed Sheeran");

        Album a2 = new Album("X", "Internacional");
        Musica m4 = new Musica("Sing", "../Musicas/Internacional/Ed Sheeran/X/Don.mp3");
        Musica m5 = new Musica("One", "../Musicas/Internacional/Ed Sheeran/X");
        Musica m6 = new Musica("Don", "../Musicas/Internacional/Ed Sheeran/X");

        a2.addMusica(m4);
        a2.addMusica(m5);
        a2.addMusica(m6);

        artista2.addAlbum(a2);
        
        Artista artista3 = new Artista("Flavio Jose");
        Album a3 = new Album("Flavio Jose - 20 Sucessos", "Forro");
        Musica m7 = new Musica("1-A vida é você", "../Musicas/Forro/Flavio Jose/Flavio Jose - 20 Sucessos");
        Musica m8 = new Musica("2-A dor da separação", "../Musicas/Forro/Flavio Jose/Flavio Jose - 20 Sucessos");
        Musica m9 = new Musica("3-Filho do dono", "../Musicas/Forro/Flavio Jose/Flavio Jose - 20 Sucessos");

        a2.addMusica(m7);
        a2.addMusica(m8);
        a2.addMusica(m9);
        
        artista3.addAlbum(a3);
        
        ArvoreBusca arvore = new ArvoreBusca();
        //ArvoreBusca busca = new ArvoreBusca();
  
        //busca.getRaiz();
        arvore.inserir(artista1);
        arvore.inserir(artista2);
        arvore.inserir(artista3);
        
        No t = arvore.busca(artista1);
        No s = arvore.busca(artista2);
        No p = arvore.busca(artista3); 

        
        System.out.println("" + t.getArtista().getNome() + "" + t.getArtista().getAlbuns());
        System.out.println("" + s.getArtista().getNome() + "" + t.getArtista().getAlbuns());
        System.out.println("" + p.getArtista().getNome() + "" + t.getArtista().getAlbuns());
    }   
}