# This is example how to replace FFmpegKit inside installed application (Steller)
Our example starter app uses FFmpegKit library [https://github.com/tanersener/ffmpeg-kit].
In this example project, you can see how you can replace FFmpegKit with your own ffmpegkit.zip file that is loaded on app start.

* FFmpegKit is added via gradle dependency, but we also use https://github.com/artyomd/Injector to load its dex file from disk
* Loading dex file from zip file allows anybody to replace FFmpegKit with own version.

## Replacing steps
* Create new **ffmpegkit.zip** with dex files of your own FFmpegKit version
* install starter application
* place your **ffmpegkit.zip** into **/dex/** folder into internal app folder (root required)
* run starter app - it will load your FFmpegKit version

## Steller
Same principe can be used to replace FFmpegKit inside **Steller** application https://play.google.com/store/search?q=steller&c=apps
Steller app loads FFmpegKit the same way as this starter app. So you can put **ffmpegkit.zip** into Steller internal storage (dex folder)
and it'll load your version of FFmpegKit. 

* Steller app uses same feature f-ffmpeg module as this example repository