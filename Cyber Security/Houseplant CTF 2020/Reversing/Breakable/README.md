# Breakable 

50 Points

Okay...this one's better, but still be careful!

Dev: Sri

 breakable.java 825676b8c563a3b6f6b394ce338bfae3

# Solution

Basically, the encryption is to add the int values of specific parts of the flag and the input string, 
1. flag [i] + input[i+2] for the first part of the check string
2. flag[i] + input[i-2] for the second part 

```
	for(i = 0; i < flag.length()-2; i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i+2)));
        }
        for(i = 2; i < flag.length(); i++){
            theflag += (char)((int)(flag.charAt(i)) + (int)(input.charAt(i-2)));
        }
```

Just write a solution (mine's in `Main.java`), and running on repl.it, you get
```
OpenJDK Runtime Environment (build 11.0.6+10-post-Ubuntu-1ubuntu118.04.1)
 javac -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -d . Main.java
 java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* Main
Flag: rtcp{0mg_1m_s0_pr0ud_} 
```

# Flag
`rtcp{0mg_1m_s0_pr0ud_}`