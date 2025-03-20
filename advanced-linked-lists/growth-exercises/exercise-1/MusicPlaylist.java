public class MusicPlaylist {
    private class Song {
        public String title;
        public String artist;
        public Song next;
        public Song prev;
        
        public Song(String title, String artist, Song next, Song prev) {
            this.title = title;
            this.artist = artist;
            this.next = next;
            this.prev = prev;
        }
        
        @Override
        public String toString() {
            return "\"" + title + "\" by " + artist;
        }
    }
    
    private Song head;
    private Song tail;
    private Song currentSong;
    private int size;
    
    public MusicPlaylist() {
        head = null;
        tail = null;
        currentSong = null;
        size = 0;
    }
    
    // Add a song to the end of the playlist
    public void addSong(String title, String artist) {
        // TODO: Implement this method
        // Create a new Song with the given title and artist
        // Add it to the end of the doubly-linked list
        // If this is the first song, set it as the current song
    }
    
    // Navigate to the next song in the playlist
    public boolean nextSong() {
        // TODO: Implement this method
        // Move to the next song if one exists
        // Return true if successful, false otherwise
        return false;
    }
    
    // Navigate to the previous song in the playlist
    public boolean previousSong() {
        // TODO: Implement this method
        // Move to the previous song if one exists
        // Return true if successful, false otherwise
        return false;
    }
    
    // Remove the current song from the playlist
    public boolean removeCurrent() {
        // TODO: Implement this method
        // Remove the current song from the playlist
        // Update currentSong to the next song or previous if at end
        // Return true if successful, false if playlist was empty
        return false;
    }
    
    // Get the current song information
    public String getCurrentSong() {
        if (currentSong == null) {
            return "No songs in playlist";
        }
        return currentSong.toString();
    }
    
    // Get the size of the playlist
    public int getSize() {
        return size;
    }
    
    // Display the entire playlist
    @Override
    public String toString() {
        if (head == null) {
            return "Playlist is empty";
        }
        
        String result = "Playlist (current song marked with →):\n";
        Song temp = head;
        int count = 1;
        
        while (temp != null) {
            if (temp == currentSong) {
                result += count + ". → " + temp + "\n";
            } else {
                result += count + ". " + temp + "\n";
            }
            temp = temp.next;
            count++;
        }
        
        return result;
    }
} 