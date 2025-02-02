package my.javastudy.album;

public class Song {
    // 필수값
    String SongNm;
    String time;

    // 선택값
    String musicVideo;

    public Song(String songNm, String time) {
        SongNm = songNm;
        this.time = time;
    }

    public String getMusicVideo() {
        return musicVideo;
    }

    public void setMusicVideo(String musicVideo) {
        this.musicVideo = musicVideo;
    }
}
