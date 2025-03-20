public class PlaylistDemo {
    public static void main(String[] args) {
        System.out.println("Creating a new music playlist...\n");
        
        MusicPlaylist playlist = new MusicPlaylist();
        
        System.out.println("Adding songs to the playlist...\n");
        
        playlist.addSong("Bohemian Rhapsody", "Queen");
        playlist.addSong("Hotel California", "Eagles");
        playlist.addSong("Imagine", "John Lennon");
        playlist.addSong("Shape of You", "Ed Sheeran");
        playlist.addSong("Billie Jean", "Michael Jackson");
        
        System.out.println(playlist);
        System.out.println("Current song: " + playlist.getCurrentSong() + "\n");
        
        System.out.println("Moving to the next song...");
        playlist.nextSong();
        System.out.println("Current song: " + playlist.getCurrentSong() + "\n");
        
        System.out.println("Moving to the next song...");
        playlist.nextSong();
        System.out.println("Current song: " + playlist.getCurrentSong() + "\n");
        
        System.out.println("Moving back to the previous song...");
        playlist.previousSong();
        System.out.println("Current song: " + playlist.getCurrentSong() + "\n");
        
        System.out.println("Removing the current song...");
        playlist.removeCurrent();
        System.out.println(playlist);
        System.out.println("Current song: " + playlist.getCurrentSong() + "\n");
        
        System.out.println("Testing edge cases:");
        
        // Create a new playlist to test edge cases
        MusicPlaylist emptyPlaylist = new MusicPlaylist();
        
        System.out.println("Empty playlist - Current song: " + emptyPlaylist.getCurrentSong());
        System.out.println("Empty playlist - Next song result: " + emptyPlaylist.nextSong());
        System.out.println("Empty playlist - Previous song result: " + emptyPlaylist.previousSong());
        System.out.println("Empty playlist - Remove current result: " + emptyPlaylist.removeCurrent() + "\n");
        
        System.out.println("Program completed.");
    }
} 