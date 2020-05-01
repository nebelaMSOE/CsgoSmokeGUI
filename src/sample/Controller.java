package sample;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public class Controller {


    @FXML
    MenuItem ticketBoothFromApts;
    @FXML
    MenuItem ticketBoothFromRamp;
    @FXML
    MediaView video;

    private MediaPlayer mediaPlayer;
    private Media media;


    @FXML
    public void playTicketBoothFromRamp(){

            String path = new File("src/testVideos/Funny2secondvideo.mp4").getAbsolutePath();
            media = new Media(new File(path).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setOnEndOfMedia(() -> {
                video.setMediaPlayer(null);
            });
            video.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
    }
}





