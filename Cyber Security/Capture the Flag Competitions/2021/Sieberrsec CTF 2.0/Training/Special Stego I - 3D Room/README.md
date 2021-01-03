# Special Stego I - 3D Room

Forensics, 30

### Description

VNI Inc. is a company specialised in innovating VR technology.
Recently, the company unveiled a method to make any screenshots taken within the VR Visor have infinite resolution.

One of the employees, Sun Hong, placed a 2D text of an exploit he found within the technology in the middle of of a 3D room before taking a [screenshot](https://drive.google.com/u/0/uc?id=1OKUjrPztvF_l8F9X4C-AxIUWN0wNy69U&export=download).
However, he realised that the colour of the text just so happens to be the same as the back wall.

Unfortunately, the room was deleted shortly after he left as a precaution.

With no proof to show this exploit, he had no choice but to approach you, an agent who happens to specialise in image forensics.

Can you help him out?

Original Challenge Author: xzy_10

## Solution

### Initial Inspection

Downloading the image you get this

![BlueRoom.svg](BlueRoom.svg)

Just in case I opened the file in notepad, since svg files are actually plain text. Then I felt lucky I solved the challenge in 5 min or less.

```
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="100%" height="100%" viewBox="0 0 1440 900" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xml:space="preserve" xmlns:serif="http://www.serif.com/" style="fill-rule:evenodd;clip-rule:evenodd;stroke-linejoin:round;stroke-miterlimit:2;">
    <g transform="matrix(2.33985e-16,3.82127,-0.8,4.89859e-17,720,-3.30856e-13)">
        <path d="M117.762,0L235.524,900L0,900L117.762,0Z" style="fill:rgb(168,223,218);"/>
    </g>
    <g transform="matrix(-2.33985e-16,3.82127,0.8,4.89859e-17,720,-4.39746e-14)">
        <path d="M117.762,0L235.524,900L0,900L117.762,0Z" style="fill:rgb(200,223,218);"/>
    </g>
    <g transform="matrix(6.11404,7.85272e-17,-2.34427e-16,-0.5,-1.51527e-13,450)">
        <path d="M117.762,0L235.524,900L0,900L117.762,0Z" style="fill:rgb(182,223,218);"/>
    </g>
    <g transform="matrix(6.11404,-7.85272e-17,-2.34427e-16,0.5,3.24537e-13,450)">
        <path d="M117.762,0L235.524,900L0,900L117.762,0Z" style="fill:rgb(69,223,218);"/>
    </g>
    <rect x="446.625" y="280.045" width="546.75" height="339.91" style="fill:rgb(169,235,235);"/>
    <g transform="matrix(0.321999,0,0,0.321999,376.231,293.321)">
        <text x="720px" y="507.272px" style="font-family:'Hind-Regular', 'Hind';font-size:79.954px;fill:rgb(169,235,235);">IRS{V3ct0r_LaY3r5}</text>
    </g>
</svg>
```

## Flag

`IRS{V3ct0r_LaY3r5}`