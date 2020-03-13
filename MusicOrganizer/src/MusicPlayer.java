/**
 * Provide basic playing of MP3 files.
 *
 * @author Sepehr Tavakoli and Narges Salehi
 * @version 1.0
 * @since 2020.03.10
 */
class MusicPlayer {
    // The current player. It might be null.
    private boolean isPlaying;

    /**
     * Constructor for objects of class MusicFilePlayer
     */
    MusicPlayer() {
        isPlaying = false;
    }

    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     *
     * @param filename The file to be played.
     */
    void startPlaying(String filename) {
        System.out.println(filename + " is playing...");
        isPlaying = true;
    }

    void stop() {
        System.out.println("player is stopped!");
        isPlaying = false;
    }


}
