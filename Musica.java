package Spotify;

public class Musica {
    private String nomeMusica;
    private String localMusica = "../Musicas";

    public Musica(String nomeMusica,  String localMusica) {
        this.nomeMusica = nomeMusica;
        this.localMusica = localMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getLocalMusica() {
        return localMusica;
    }

    public void setLocalMusica(String localMusica) {
        this.localMusica = localMusica;
    }
}