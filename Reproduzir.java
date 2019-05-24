package Spotify;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
/**
 *
 * @author Usuario
 */
public class Reproduzir {
    private File reproduzir;
    private Player player;
    
    public File getReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(File reproduzir) {
        this.reproduzir = reproduzir;
    }

    public Reproduzir(File reproduzir) {
        this.reproduzir = reproduzir;
    }
    
    public void play() {
      try {
                FileInputStream fis     = new FileInputStream(reproduzir);
                BufferedInputStream bis = new BufferedInputStream(fis);
                this.player = new Player(bis);
                System.out.println("Tocando!");
                this.player.play();
                System.out.println("Terminado!");
            }
            catch (Exception e) {
                System.out.println("Problema ao tocar " + reproduzir);
                e.printStackTrace();
            }
    }
}