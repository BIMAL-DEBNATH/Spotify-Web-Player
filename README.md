# Spotify-Web-Player
A OOPs based Java Spotify backend project is a software application that uses object-oriented programming principles and Java language features to create a backend service for a music streaming platform like Spotify. It can be used to provide RESTful APIs for various functionalities such as user authentication, music playback, playlist management, music recommendation, and social interaction. Here is a possible description for a OOPs based Java Spotify backend project:

This project is a backend service for a music streaming platform that mimics the features and functionalities of Spotify. It uses object-oriented programming principles and Java language features to create a modular, scalable, and maintainable application. It also uses Spring Boot framework and MongoDB database to provide RESTful APIs for the frontend and mobile clients.

## Features

- **Music Playback:** The system allows users to stream music from a large collection of songs stored in MongoDB GridFS. The system also supports basic playback controls such as play, pause, skip, shuffle, repeat, and volume.
- **Album creation:** I created a class called Album that represents a collection of songs by an artist. The Album class has fields such as title, artist, genre, release date, and tracks. The tracks field is an array of Song objects that store information about each song in the album. The Album class also has methods such as addSong, removeSong, playAlbum, and shuffleAlbum that allow the user to manipulate and play the album.
- **Playlist creation**: I created a class called Playlist that represents a custom list of songs by the user. The Playlist class has fields such as name, owner, songs, and duration. The songs field is an ArrayList of Song objects that store information about each song in the playlist. The Playlist class also has methods such as addSong, removeSong, playPlaylist, and shufflePlaylist that allow the user to manipulate and play the playlist.
- **Music creation by object**: I created a class called Music that represents a musical composition that can be played by the user. The Music class has fields such as title, composer, tempo, key, and notes. The notes field is an array of Note objects that store information about each note in the music. The Note class has fields such as pitch, duration, and volume. The Music class also has methods such as playMusic, pauseMusic, and stopMusic that allow the user to control the playback of the music.
- **Music playback**: I created a class called Player that represents a music player that can play any type of music object (Album, Playlist, or Music). The Player class has fields such as currentMusic, currentTime, and state. The currentMusic field is a Music object that stores the current music being played by the player. The currentTime field is an int that stores the current time position of the playback in seconds. The state field is an enum that stores the current state of the player (PLAYING, PAUSED, or STOPPED). The Player class also has methods such as play, pause, stop, skipForward, and skipBackward that allow the user to control the playback of the music.
## Technologies

![image](https://github.com/BIMAL-DEBNATH/Spotify-Web-Player/assets/131388946/b77371f4-ca14-4635-8251-b98d26a3afb4)

- **Java:** The programming language used to develop the backend service.


## Installation
https://github.com/BIMAL-DEBNATH/Spotify-Web-Player/new/main?readme=1
1. Clone this repository using `git clone https://github.com/BIMAL-DEBNATH/Spotify-Web-Player.git`.
2. Navigate to the project directory using `Spotify-Web-Player`.

## License
