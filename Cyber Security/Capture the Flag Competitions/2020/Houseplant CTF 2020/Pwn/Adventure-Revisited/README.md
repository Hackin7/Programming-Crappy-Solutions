# Main


# Solution

## Hine
Of course I'm totally new to pwning so I need to use the `hint.7z` right?

```
$ file hint.7z 
hint.7z: ASCII text, with very long lines, with no line terminators
```

Renaming the file to `hint`
```
$ cat hint | head
iVBORw0KGgoAAAANSUhEUgAAAVgAAACaCAYAAADsO1BLAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAACfISURBVHhe7Z0HfFzVlf9/M5oqaUa9WZZkS7bl3i3jQgnVMc2UQAqJKYHks5CQXnZDlmzYkGR3E0hgk5AQIBASk8BCMN0Q4G8w2AbcbbnJVW7qdfr8z7nvPelJHjVbY6TR+dpXt777+u+de14ZS8WCc6MQBEEQBh2rHguCIAiDjAisIAhCnBCBFQRBiBMisIIgCHFCBFYQBCFOiMAKgiDECRFYQRCEOGGZPW+RPAcrCIIQB07bgo1Go12CIAiCoDFgge1LUPuqFwRBGCn0y0XQXSgz8yYjZ9RUpGeXwuEsgMWRAovFglCoBW0tx9BcU4W6o5tQd2yrPoUGtxnq5I6eh7IZn4HTnaGXDBx/ez32bPwLjh9ap5fEh+xwCDnhsIr5ShmhwHsqQtu5JsmGnXYHNxME4WOiT4E1i2v5lAswa94STJkwFuPKUuBOtuOplcdwpDaAKIunlU7xqAUWPbQ3H8XBXa/g0N439B6GvsguuPQXpyWuBiyya174hp47fQpDQYwLBjAh4MeUoB8lgQDsSk57xk/beqPTjUq7ExtcLhULgnDm6FFgzcLqSS/BRZfdgq/efDZSU+wkkjQh/
.....
```
It's obviously base64, so let's decode it
```
$ base64 -d hint > hint_decoded
$ file hint_decoded 
hint_decoded: PNG image data, 344 x 154, 8-bit/color RGBA, non-interlaced
```

![Hint](Hint/hint_decoded)

Ah yes an eval command. I have no idea what that is.