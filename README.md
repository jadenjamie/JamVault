
# JamVault

JamVault is a personal music library desktop application built in Java using Swing and the JLayer audio library. It provides a clean interface where users can upload MP3 files, enter custom metadata (artist, title), and assign optional PNG cover art. Each song is stored locally and displayed as a clickable tile within a scrollable library panel, and users can play or pause tracks using an integrated audio player built on JLayer.

JamVault is designed as a lightweight personal vault for musicians and creators to store and organize their in-progress or unreleased tracks. Instead of scattering demo files across cloud drives or desktop folders, it gives users a focused space to keep rough mixes, practice recordings, or unfinished songs together with basic labels and cover placeholders. This makes it easy to revisit and manage creative ideas as they develop over time.

The application is still in active development and currently does not yet save metadata or user data between sessions. Planned future improvements include persistent metadata storage, real user authentication (with options like Google sign-in and account creation), playlist support, a refined and modernized UI, and eventual mobile compatibility. JamVault is primarily a learning project to explore GUI development, event-driven programming, and multimedia handling in Java while building toward a fully featured personal music library platform.


## Appendix



Sample MP3s and PNG cover images can be placed in a local testing folder of your choice. JamVault copies selected files into:
macOS/Linux: ~/ .myapp/library
Windows: C:\Users<you>.myapp\library
## Authors

- [@jadenjamie](https://github.com/jadenjamie)


## Deployment

JamVault is a desktop application intended to run locally from source in an IDE (NetBeans recommended). No server or cloud deployment is required. Again, it is currently in development, so this is all for the time being.


## FAQ

#### What audio formats are supported?

MP3 via JLayer.

#### Do covers have to be PNG?

Yes. JamVault expects PNG cover images for consistent sizing.

#### Does login work?

The login screen is a placeholder; authentication is not implemented yet. This screen can be bypassed by simply pressing the login button.

#### Does the metadata persist between sessions?

Not yet. Persistence is on the roadmap.
## Features

- Upload MP3 files into a local library
- Optional PNG cover art per track
- Scrollable library view of song tiles
- Play and pause using JLayer (javazoom.jl.Player)
- Simple login screen (placeholder)


## Feedback

If you have any feedback, please reach out to me at jaden192006@gmail.com


## Installation

Prerequisites: Java JDK 17+ recommended, NetBeans or any IDE with Swing support, JLayer (javazoom.jl) on the classpath.
Clone the repository, open it in your IDE, add JLayer to the project libraries, then run mainFrame.java.

    
## Run Locally

Open in NetBeans, ensure JLayer is on the classpath, and run mainFrame.java. JamVault creates ~/.myapp/library and copies uploaded MP3s there.


## Usage/Examples

Launch JamVault, choose an MP3 to upload, enter artist and title, optionally select a PNG cover, then click the new tile to play. Use the play/pause button in the footer to control playback.



## Roadmap

- Persist song metadata and library index

- Real authentication (email/password, optional Google sign-in)

- Playlists and queue

- Volume controls and progress bar

- Upgraded UI

- Cloud sync

- Mobile support

- Ability to connect with others users


## Screenshots

![Login Page](https://github.com/jadenjamie/JamVault/blob/main/demoScreenshots/loginPage.png)

![Empty Library](https://github.com/jadenjamie/JamVault/blob/main/demoScreenshots/defaultLibrary.png)

![Library With Songs](https://github.com/jadenjamie/JamVault/blob/main/demoScreenshots/libraryWithSongs.png)



## Demo
Watch a short demo of JamVault on YouTube:  
[▶️ JamVault Demo](https://youtu.be/WisdQSpVLw8?si=odK0DySTGmHWQI0b)

