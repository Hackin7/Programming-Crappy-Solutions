# Special Stego II - Picturesque Mountains

Forensics, 50

### Description

Due to the exploit discovered, VNI Inc.'s development team has patched the issue with a simple but confidential solution.
Sun Hong happens to be a digital artist, so he created a bunch of mountains.
That's where he realised that he had found a workaround to the original exploit.
Instead of reporting to the higher ups, he decided to send this [screenshot](https://drive.google.com/u/0/uc?id=1td8jelC0WDQ3AqkfPoUPPwyy_-BxQAiP&export=download) to you as a toy example of how this workaround works.
Find a way to extract the hidden data.

Original Challenge Author: xzy_10

## Solution

### Inspection and extracting out Base64 Data?

I downloaded and looked at the screenshot
![NiceMountains.svg](NiceMountains.svg)

Opening up in notepad and looking through the code reveals some base64 data
```
<defs>
        <linearGradient id="_Linear1" x1="0" y1="0" x2="1" y2="0" gradientUnits="userSpaceOnUse" gradientTransform="matrix(2000.78,0,0,1187,-144.101,569.187)"><stop offset="0" style="stop-color:rgb(156,255,255);stop-opacity:1"/><stop offset="0" style="stop-color:rgb(184,255,255);stop-opacity:1"/><stop offset="1" style="stop-color:white;stop-opacity:1"/></linearGradient>
        <image id="_Image2" width="281px" height="272px" xlink:href="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAARkAAAEQCAYAAACEHwDfAAAACXBIWXMAAA7EAAAOxAGVKw4bAAAgAElEQVR4nO2d55rrynG1V4Nh0t57djjBko7sI1nBsn13ug5dnf1ZsoIVjsIJO6dJJPr7QTRYKFZ1V4NgnF7PgwHRAEkAA7xYVdUAHYqOQt7/ygFwu16PgeSd
```
...
```
        OXgPUIdOJgKOI5Mh3ogFiV0oKApgDlC/X+PevPcqkkf3AAAAABJRU5ErkJggg=="/>
    </defs>
```

I used Cyberchef to convert it into raw data and store it in a png file. I get this
![extracted.png](extracted.png)

Running `strings` on the png appears to do nothing. Right now this png appears to be just the sun.

### Finding out more about Stegnography Methods

I tried googling more about stegnography methods for svg and png files

For svg files
1. https://github.com/japplebaum/svgsteg (Doesn't seem applicable since the data we have is only up to 3 decimal places not 5)

General?
1. https://stylesuxx.github.io/steganography/ (Tried it on the svg, gave me garbage data)

## Flag
``