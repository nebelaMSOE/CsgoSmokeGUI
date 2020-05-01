package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public class Controller {

    @FXML
    TextArea helpMenu;
    @FXML
    Button helpMenuButton;

    @FXML
    MenuButton ticketBooth;

    @FXML
    MenuItem ticketBoothFromApts;
    @FXML
    MenuItem ticketBoothFromRamp;

    @FXML
    MediaView video;

    private MediaPlayer mediaPlayer;
    private Media media;


    @FXML
    private void playTicketBoothFromRamp(){
            String path = new File("src/smokeVideos/mirage/CTARamp.mp4").getAbsolutePath();
            media = new Media(new File(path).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setOnEndOfMedia(() -> {
                video.setMediaPlayer(null);
                showAllMenuButtons();
            });
            video.setMediaPlayer(mediaPlayer);
            hideAllMenuButtons();
            mediaPlayer.play();
    }

    private void hideAllMenuButtons(){
        ticketBooth.setVisible(false);
        helpMenuButton.setVisible(false);
    }

    private void showAllMenuButtons(){
        ticketBooth.setVisible(true);
        helpMenuButton.setVisible(true);
    }

    @FXML
    private void stopMediaPlayer(){
        video.setMediaPlayer(null);
        showAllMenuButtons();
    }

    @FXML
    private void showHelpMenu(){
        helpMenu.setVisible(true);
        helpMenuButton.setVisible(false);
    }

    @FXML
    private void hideHelpMenu(){
        helpMenu.setVisible(false);
        helpMenuButton.setVisible(true);
    }
}





