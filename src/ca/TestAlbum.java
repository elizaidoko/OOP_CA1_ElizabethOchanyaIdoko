package ca;
import javax.swing.*;
import java.awt.*;

public class TestAlbum {
    public static void main(String[] args){

        Song s1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);

        Song[] allSongs = new Song[5];
        allSongs[0] = s1;
        allSongs[1] = s2;
        allSongs[2] = s3;
        allSongs[3] = s4;
        allSongs[4] = s5;

        Album album = new Album("Now that’s what I call music 98", allSongs, "Universal Music", 2016);

        JTextArea textArea = new JTextArea(14,30);
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        String output="";

        output += album.toString() + "\n\n\t\t\tAlbum Tracks\n\n";

        textArea.setText(output);
        textArea.append(String.format("%-25s%-25s%-20s","Track Number","Title","Artist") + "\n\n");
        for(int i=0;i<album.getTracks().length;i++){
            textArea.append(String.format("%-25d%-25s%-20s",album.getTracks()[i].getTrackNumber(), album.getTracks()[i].getTitle(), album.getTracks()[i].getArtist()) + "\n\n");
        }


        JOptionPane.showMessageDialog(null,textArea,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        int trackno = Integer.parseInt(JOptionPane.showInputDialog("which track number would you like to play?"));

        album.playTrack(trackno);

        album.shuffle();

        System.exit(0);
    }
}
