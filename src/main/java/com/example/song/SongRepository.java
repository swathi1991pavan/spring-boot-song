// Write your code here

package com.example.song;
import java.util.*;
import com.example.song.Song;

public interface SongRepository{
    ArrayList<Song> getSongs();

    Song addSong(Song song);

    Song getSongById(int songId);

    Song updateSong(Song song , int songId);

    void deleteSong(int songId);
}