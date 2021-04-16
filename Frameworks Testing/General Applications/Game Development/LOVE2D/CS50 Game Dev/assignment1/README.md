#Flappy Bird, The Reward Update
## For CS50's Introduction to Game Development Assignment 1

Goals
1. Randomize the gap between pipes (vertical space), such that they’re no longer hardcoded to 90 pixels.
2. Randomize the interval at which pairs of pipes spawn, such that they’re no longer always 2 seconds apart.
3. When a player enters the ScoreState, award them a “medal” via an image displayed along with the score; this can be any image or any type of medal you choose (e.g., ribbons, actual medals, trophies, etc.), so long as each is different and based on the points they scored that life. Choose 3 different ones, as well as the minimum score needed for each one (though make it fair and not too hard to test :)).
4. Implement a pause feature, such that the user can simply press “P” (or some other key) and pause the state of the game. This pause effect will be slightly fancier than the pause feature we showed in class, though not ultimately that much different. When they pause the game, a simple sound effect should play (I recommend testing out bfxr for this, as seen in Lecture 0!). At the same time this sound effect plays, the music should pause, and once the user presses P again, the gameplay and the music should resume just as they were! To cap it off, display a pause icon in the middle of the screen, nice and large, so as to make it clear the game is paused.

Code modifications
1. PipePair.lua, lines 27,31. Gap Randomised to be between 80 and 110 (inclusive)
2. states/PlayState.lua, in line 29 43-44. Interval at which pipes spawn from 2-4 seconds
3. states/ScoreState.lua, lines 20-22, 40-46
4. Modified PlayState, and added a variable to control background scrolling
- main.lua, lines 41, 88, 110-111. 
- states/PlayState.lua, lines 104-107. 

Medals for scores of 5, 8, and 10 respectively
[Video Demo](https://youtu.be/4-TUzKThlTM) 