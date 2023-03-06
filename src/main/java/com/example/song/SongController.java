/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.song;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;
import com.example.song.Song;

@RestController
public class SongController{
     SongService songService = new SongService();
    
    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return songService.getSongs();
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId){
        return songService.getSongById(songId);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@RequestBody Song song,@PathVariable("songId") int songId){
        return songService.updateSong(song,songId);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
        songService.deleteSong(songId);
    }
}