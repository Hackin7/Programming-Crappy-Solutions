```bash
nmap -vv --reason -Pn -T4 -sV -p 15672 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/tcp15672/xml/tcp_15672_http_nmap.xml" 192.168.139.68
```

[/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_nmap.txt](file:///root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_nmap.txt):

```
# Nmap 7.92 scan initiated Sun Jan 30 17:06:01 2022 as: nmap -vv --reason -Pn -T4 -sV -p 15672 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN /root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_nmap.txt -oX /root/autorecon/results/192.168.139.68/scans/tcp15672/xml/tcp_15672_http_nmap.xml 192.168.139.68
Nmap scan report for 192.168.139.68
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-30 17:06:03 +08 for 579s

Bug in http-security-headers: no string output.
PORT      STATE SERVICE REASON         VERSION
15672/tcp open  http    syn-ack ttl 63 Cowboy httpd
|_http-server-header: Cowboy
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.139.68
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 116
|     Comment: 
|         
|         //                      return new Date(Date.UTC(+a[1], +a[2] - 1, +a[3], +a[4],
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 31
|     Comment: 
|         
|         //          stringified. A toJSON method does not serialize: it returns the
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 228
|     Comment: 
|          // The member key.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 67
|     Comment: 
|         
|         //          dropped; in arrays they will be replaced with null. You can use
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1199
|     Comment: 
|          // MSIE: could not connect
|     
|     Path: http://192.168.139.68:15672/js/base64.js
|     Line number: 1
|     Comment: 
|         /*
|          * Copyright (c) 2010 Nick Galbreath
|          * http://code.google.com/p/stringencoders/source/browse/#svn/trunk/javascript
|          *
|          * Permission is hereby granted, free of charge, to any person
|          * obtaining a copy of this software and associated documentation
|          * files (the "Software"), to deal in the Software without
|          * restriction, including without limitation the rights to use,
|          * copy, modify, merge, publish, distribute, sublicense, and/or sell
|          * copies of the Software, and to permit persons to whom the
|          * Software is furnished to do so, subject to the following
|          * conditions:
|          *
|          * The above copyright notice and this permission notice shall be
|          * included in all copies or substantial portions of the Software.
|          *
|          * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
|          * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
|          * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
|          * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
|          * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
|          * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
|          * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
|          * OTHER DEALINGS IN THE SOFTWARE.
|         */
|     
|     Path: http://192.168.139.68:15672/js/formatters.js
|     Line number: 573
|     Comment: 
|          // mask password
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 597
|     Comment: 
|         
|         // Which vhost are we looking at
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 51
|     Comment: 
|         
|         //                       f(this.getUTCSeconds())   + "Z";
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1139
|     Comment: 
|          // 0x80004004 means "Operation aborted."
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 7
|     Comment: 
|         
|         // Just used below
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 361
|     Comment: 
|         
|         // If the JSON object does not yet have a stringify method, give it one.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 469
|     Comment: 
|         
|         // We split the second stage into 4 regexp operations in order to work around
|     
|     Path: http://192.168.139.68:15672/js/formatters.js
|     Line number: 513
|     Comment: 
|          // Only connections can be 'blocked' or 'blocking'
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 242
|     Comment: 
|         
|         // If we were called with a replacer function, then call the replacer to
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 464
|     Comment: 
|         
|         // In the second stage, we run the text against regular expressions that look
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 257
|     Comment: 
|         
|         // JSON numbers must be finite. Encode non-finite numbers as null.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 100
|     Comment: 
|          // behind if (Sammy.HashLocationProxy._interval != null). And of
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 897
|     Comment: 
|          // Workaround for... something. Although div.hider is
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 97
|     Comment: 
|         
|         //          It can throw a SyntaxError exception.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 80
|     Comment: 
|         
|         //          Example:
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 33
|     Comment: 
|         
|         // Both the above
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 27
|     Comment: 
|         
|         //                      it contains the characters used to indent at each level.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 43
|     Comment: 
|         
|         //                          ? "0" + n
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 626
|     Comment: 
|         
|         // whenever a UI requests a page that doesn't exist
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 39
|     Comment: 
|         
|         //              Date.prototype.toJSON = function (key) {
|     
|     Path: http://192.168.139.68:15672/js/jquery.flot-0.8.1.min.js
|     Line number: 7
|     Comment: 
|         
|         // for convenience
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 749
|     Comment: 
|          // TODO remove this hack when we get rid of "updatable"
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 103
|     Comment: 
|         
|         //          If it returns undefined then the member is deleted.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 78
|     Comment: 
|         
|         //          the indentation will be that many spaces.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1141
|     Comment: 
|          // MSIE6 appears to do this in response to HTTP 204.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 20
|     Comment: 
|          // clear a local storage value used by earlier versions
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 139
|     Comment: 
|         /*jslint
|             eval, for, this
|         */
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 288
|     Comment: 
|          // TODO This doesn't work well if you are looking at
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1202
|     Comment: 
|          // Proxy: could not connect
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 92
|     Comment: 
|         
|         //          });
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 584
|     Comment: 
|         
|         // Which top level template we're showing
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 70
|     Comment: 
|         
|         //          JSON.stringify(undefined) returns undefined.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 103
|     Comment: 
|          // work in MSIE.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 500
|     Comment: 
|         
|         // Extensions write to this, the dispatcher maker reads it
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 375
|     Comment: 
|         
|         // The stringify method takes a value and an optional replacer, and an optional
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 88
|     Comment: 
|         
|         //          text = JSON.stringify([new Date()], function (key, value) {
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1417
|     Comment: 
|         
|         // DTRT for chars > 127). So encode a unicode string as a UTF-8
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 82
|     Comment: 
|         
|         //          text = JSON.stringify(["e", {pluribus: "unum"}]);
|     
|     Path: http://192.168.139.68:15672/js/sammy-0.7.6.min.js
|     Line number: 4
|     Comment: 
|         
|         // Built: 2014-08-26 10:45:34 +0300
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1415
|     Comment: 
|         
|         // Our base64 library takes a string that is really a byte sequence,
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 3
|     Comment: 
|         
|         //
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 604
|     Comment: 
|          // If there's interaction, reset the counter.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 348
|     Comment: 
|         
|         // Join all of the member texts together, separated with commas,
|     
|     Path: http://192.168.139.68:15672/js/sammy-0.7.6.min.js
|     Line number: 2
|     Comment: 
|         
|         // http://sammyjs.org
|     
|     Path: http://192.168.139.68:15672/css/main.css
|     Line number: 188
|     Comment: 
|         /* yellow-dark and green-dark can never happen */
|     
|     Path: http://192.168.139.68:15672/js/prefs.js
|     Line number: 162
|     Comment: 
|          // Convert to 32bit integer
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 229
|     Comment: 
|          // The member value.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 469
|     Comment: 
|         /* Skip known keys we already handled and undefined parameters. */
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 72
|     Comment: 
|         
|         //          The optional space parameter produces a stringification of the
|     
|     Path: http://192.168.139.68:15672/js/prefs.js
|     Line number: 149
|     Comment: 
|         
|         // Try to economise on space since cookies have limited length.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 151
|     Comment: 
|         
|         // Create a JSON object only if one does not already exist. We create the
|     
|     Path: http://192.168.139.68:15672/js/prefs.js
|     Line number: 83
|     Comment: 
|         
|         // ---------------------------------------------------------------------------
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 284
|     Comment: 
|         
|         // Make an array to hold the partial results of stringifying this object value.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 4
|     Comment: 
|         
|         //  NO WARRANTY EXPRESSED OR IMPLIED. USE AT YOUR OWN RISK.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 105
|     Comment: 
|          //
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 493
|     Comment: 
|         
|         // In the optional fourth stage, we recursively walk the new structure, passing
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 495
|     Comment: 
|          // ...user cannot monitor
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 2
|     Comment: 
|         
|         // Formatting side
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 101
|     Comment: 
|         
|         //          and its return value is used instead of the original value.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 35
|     Comment: 
|         
|         //          bound to the value.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 136
|     Comment: 
|         
|         //  This is a reference implementation. You are free to copy, modify, or
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 25
|     Comment: 
|         
|         //                      it will specify the number of spaces to indent at each
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 485
|     Comment: 
|         
|         ///////////////////////////////////////////////////////////////////////////
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 600
|     Comment: 
|         
|         // What is our current sort order
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 2
|     Comment: 
|         
|         //  2016-10-28
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 473
|     Comment: 
|         
|         // open brackets that follow a colon or comma or that begin the text. Finally,
|     
|     Path: http://192.168.139.68:15672/js/jquery.flot-0.8.1.min.js
|     Line number: 21
|     Comment: 
|          // returns "rgba(100,50,25,0.4)"
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 99
|     Comment: 
|          // should get installed when the app is started. But it's guarded
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 466
|     Comment: 
|         
|         // because they can cause invocation, and "=" because it can cause mutation.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 453
|     Comment: 
|         
|         // incorrectly, either silently deleting them, or treating them as line endings.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 506
|     Comment: 
|         
|         // The dispatcher needs access to the Sammy app
|     
|     Path: http://192.168.139.68:15672/js/formatters.js
|     Line number: 214
|     Comment: 
|          // to avoid errors, if someone calls fmt_num_thousands(someNumber.toFixed(0))
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 225
|     Comment: 
|         
|         // Produce a string from holder[key].
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 451
|     Comment: 
|         
|         // Parsing happens in four stages. In the first stage, we replace certain
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 429
|     Comment: 
|         
|         // The walk method is used to recursively walk the resulting structure so
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 41
|     Comment: 
|         
|         //                      // Format integers to have at least two digits.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 422
|     Comment: 
|         
|         // The parse method takes a text and an optional reviver function, and returns
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 14
|     Comment: 
|         
|         //  If a project might run on IE8 or earlier, then this file should be included.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 379
|     Comment: 
|         
|         // produce text that is more easily readable.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 364
|     Comment: 
|          // table of character substitutions
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 12
|     Comment: 
|         
|         //  This file creates a global JSON object containing two methods: stringify
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 112
|     Comment: 
|         
|         //              if (typeof value === "string") {
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 399
|     Comment: 
|         
|         // If there is a replacer, it must be a function or an array.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 111
|     Comment: 
|          // just leave the history here.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 393
|     Comment: 
|         
|         // If the space parameter is a string, it will be used as the indent string.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 590
|     Comment: 
|         
|         // And which of those have yet to return (so we can cancel them when
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 106
|     Comment: 
|          // Note for when we upgrade: HashLocationProxy has become
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 97
|     Comment: 
|          // in modern browsers, and falls back to an icky polling function
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 268
|     Comment: 
|         
|         // the remote chance that this gets fixed someday.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 110
|     Comment: 
|         
|         //          myData = JSON.parse(text, function (key, value) {
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 95
|     Comment: 
|         
|         //      JSON.parse(text, reviver)
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 49
|     Comment: 
|         
|         //                       f(this.getUTCHours())     + ":" +
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 377
|     Comment: 
|         
|         // that can replace values, or an array of strings that will select the keys.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1158
|     Comment: 
|          // MSIE7 and 8 appear to do this in response to HTTP 204.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 313
|     Comment: 
|         
|         // If the replacer is an array, use it to select the members to be stringified.
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 291
|     Comment: 
|          // duplicated entries). Do we care? We should just
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 301
|     Comment: 
|         
|         // Join all of the elements together, separated with commas, and wrap them in
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 486
|     Comment: 
|         
|         // In the third stage we use the eval function to compile the text into a
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 76
|     Comment: 
|         
|         //          If the space parameter is a non-empty string, then that string will
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 143
|     Comment: 
|         /*property
|             JSON, apply, call, charCodeAt, getUTCDate, getUTCFullYear, getUTCHours,
|             getUTCMinutes, getUTCMonth, getUTCSeconds, hasOwnProperty, join,
|             lastIndex, length, parse, prototype, push, replace, slice, stringify,
|             test, toJSON, toString, valueOf
|         */
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 501
|     Comment: 
|         
|         // If the text is not JSON parseable, then a SyntaxError is thrown.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 578
|     Comment: 
|         
|         ////////////////////////////////////////////////////
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 129
|     Comment: 
|         
|         //                  if (d) {
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1402
|     Comment: 
|         
|         // Don't use the jQuery AJAX support, it seems to have trouble reporting
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 272
|     Comment: 
|         
|         // If the type is "object", we might be dealing with an object or an array or
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 114
|     Comment: 
|         
|         //   /^(\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2}):(\d{2}(?:\.\d*)?)Z$/.exec(value);
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 249
|     Comment: 
|         
|         // What happens next depends on the value's type.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 235
|     Comment: 
|         
|         // If the value has a toJSON method, call it to obtain a replacement value.
|     
|     Path: http://192.168.139.68:15672/js/base64.js
|     Line number: 54
|     Comment: 
|          //   object with properties mapping chars to value (eg. 'A': 0)
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 227
|     Comment: 
|          // The loop counter.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 208
|     Comment: 
|         
|         // Otherwise we must also replace the offending characters with safe escape
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 503
|     Comment: 
|         
|         // We need to know when all extension script files have loaded
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 166
|     Comment: 
|          // status-bar
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 206
|     Comment: 
|         
|         // If the string contains no control characters, no quote characters, and no
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 41
|     Comment: 
|          // Format integers to have at least two digits.
|     
|     Path: http://192.168.139.68:15672/js/base64.js
|     Line number: 53
|     Comment: 
|          //  Minimal or no improvement in performance by using a
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 190
|     Comment: 
|          // Prevent DoS if cookie malformed
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 293
|     Comment: 
|         
|         // The value is an array. Stringify every element. Use null as a placeholder
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 86
|     Comment: 
|          // text is '[\n\t"e",\n\t{\n\t\t"pluribus": "unum"\n\t}\n]'
|     
|     Path: http://192.168.139.68:15672/js/ejs-1.0.min.js
|     Line number: 1
|     Comment: 
|         /*"+name+"*/
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 127
|     Comment: 
|         
|         //                      value.slice(-1) === ")") {
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 38
|     Comment: 
|          // we'll end up doing that at the bottom of start_app_login after
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 29
|     Comment: 
|         
|         //          When an object value is found, if the object contains a toJSON
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 492
|     Comment: 
|          // ...there are no fine stats
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 110
|     Comment: 
|          // updated to the version  0.7.6 this _interval = null is fixed
|     
|     Path: http://192.168.139.68:15672/js/base64.js
|     Line number: 63
|     Comment: 
|          // convert to string
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 290
|     Comment: 
|          // the data we have in the DB (and thus we get
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1423
|     Comment: 
|         
|         // encodeURIComponent handles utf-8, unescape does not. Neat!
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 123
|     Comment: 
|         
|         //          myData = JSON.parse('["Date(09/09/2001)"]', function (key, value) {
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 120
|     Comment: 
|         
|         //              return value;
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 37
|     Comment: 
|          // because we change url, we don't need to hit check_login as
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 266
|     Comment: 
|         
|         // If the value is a boolean or null, convert it to a string. Note:
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 497
|     Comment: 
|          // ...there is only one vhost
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 47
|     Comment: 
|         
|         //                       f(this.getUTCMonth() + 1) + "-" +
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 409
|     Comment: 
|         
|         // Make a fake root object containing our value under the key of "".
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 289
|     Comment: 
|          // stuff in the browser that is finer granularity than
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 2
|     Comment: 
|         
|         //                   //
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 493
|     Comment: 
|          // ...user is not an admin
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 107
|     Comment: 
|         
|         //          // Parse the text. Values that look like ISO date strings will
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 899
|     Comment: 
|          // prevents the first slideToggle() from animating
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 491
|     Comment: 
|         
|         // All these are to do with hiding UI elements if
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 98
|     Comment: 
|          // in MSIE. But it looks like there's a bug. The polling function
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 19
|     Comment: 
|         
|         //          replacer    an optional parameter that determines how object
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 65
|     Comment: 
|         
|         //          Values that do not have JSON representations, such as undefined or
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 93
|     Comment: 
|          // text is '["Date(---current time---)"]'
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 90
|     Comment: 
|         
|         //                  ? "Date(" + this[key] + ")"
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 9
|     Comment: 
|         
|         //  USE YOUR OWN COPY. IT IS EXTREMELY UNWISE TO LOAD CODE FROM SERVERS YOU DO
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 104
|     Comment: 
|          // Filed as https://github.com/quirkey/sammy/issues/171
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 85
|     Comment: 
|         
|         //          text = JSON.stringify(["e", {pluribus: "unum"}], null, "\t");
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 83
|     Comment: 
|          // text is '["e",{"pluribus":"unum"}]'
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 74
|     Comment: 
|         
|         //          easier to read.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 496
|     Comment: 
|          // ...we are not in a cluster
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 99
|     Comment: 
|         
|         //          The optional reviver parameter is a function that can filter and
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 60
|     Comment: 
|         
|         //          If the replacer parameter is an array of strings, then it will be
|     
|     Path: http://192.168.139.68:15672/
|     Line number: 22
|     Comment: 
|         <!--[if lte IE 8]>
|             <script src="js/excanvas.min.js" type="text/javascript"></script>
|             <link href="css/evil.css" rel="stylesheet" type="text/css"/>
|         <![endif]-->
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 614
|     Comment: 
|         
|         // When did we last connect successfully (for the "could not connect" error)
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 56
|     Comment: 
|         
|         //          object. The value that is returned from your method will be
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 494
|     Comment: 
|          // ...user is not a policymaker
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1140
|     Comment: 
|          // http://support.microsoft.com/kb/186063
|     
|     Path: http://192.168.139.68:15672/js/jquery.flot-0.8.1.time.min.js
|     Line number: 1
|     Comment: 
|         /* Pretty handling of time axes.
|         
|         Copyright (c) 2007-2013 IOLA and Ole Laursen.
|         Licensed under the MIT license.
|         
|         Set axis.mode to "time" to enable. See the section "Time series data" in
|         API.txt for details.
|         
|         */
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 112
|     Comment: 
|          //Sammy.HashLocationProxy._interval = null;
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 54
|     Comment: 
|         
|         //          You can provide an optional replacer method. It will be passed the
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 385
|     Comment: 
|         
|         // If the space parameter is a number, make an indent string containing that
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 341
|     Comment: 
|          // We'll end up not showing it anyway
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 289
|     Comment: 
|         
|         // Is the value an array?
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 39
|     Comment: 
|          // we've changed url.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 587
|     Comment: 
|         
|         // Which JSON requests do we need to populate it
|     
|     Path: http://192.168.139.68:15672/js/base64.js
|     Line number: 52
|     Comment: 
|          // This is oddly fast, except on Chrome/V8.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1066
|     Comment: 
|          // navigate to the login form
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 488
|     Comment: 
|         
|         // in JavaScript: it can begin a block or an object literal. We wrap the text
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 33
|     Comment: 
|         
|         //          or undefined if nothing should be serialized. The toJSON method
|     
|     Path: http://192.168.139.68:15672/js/jquery-1.12.4.min.js
|     Line number: 1
|     Comment: 
|         /*! jQuery v1.12.4 | (c) jQuery Foundation | jquery.org/license */
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 125
|     Comment: 
|         
|         //              if (typeof value === "string" &&
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 622
|     Comment: 
|         
|         // Holds chart data in between writing the div in an ejs and rendering
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1196
|     Comment: 
|          // Non-MSIE: could not connect
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 62
|     Comment: 
|         
|         //          such that only members with keys listed in the replacer array are
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 292
|     Comment: 
|          // never allow that...
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 21
|     Comment: 
|         
|         //                      function or an array of strings.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 900
|     Comment: 
|          // successfully; instead the element just vanishes.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 101
|     Comment: 
|          // course that's not specific to the application; it's pretty
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 512
|     Comment: 
|         
|         // Used for access control
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 95
|     Comment: 
|          // Oh boy. Sammy uses various different methods to determine if
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 27
|     Comment: 
|         
|         // Things that are like arguments that we format the same way in listings.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 16
|     Comment: 
|         
|         // Extension arguments that we know about and present specially in the UI.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 96
|     Comment: 
|          // the URL hash has changed. Unsurprisingly this is a native event
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 417
|     Comment: 
|         
|         // If the JSON object does not yet have a parse method, give it one.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 594
|     Comment: 
|         
|         // Which tab is highlighted
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 312
|     Comment: 
|          // axis.ticks seems to include the bottom value but not the top
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 277
|     Comment: 
|         
|         // Due to a specification blunder in ECMAScript, typeof null is "object",
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 108
|     Comment: 
|          // be converted to Date objects.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 898
|     Comment: 
|          // display:block anyway, not explicitly setting this
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 467
|     Comment: 
|         /* Unknown options are used as query parameters as is. */
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 108
|     Comment: 
|          // remains.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 516
|     Comment: 
|         
|         // Set up the above vars
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 566
|     Comment: 
|          // Note deliberate fall-through
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1243
|     Comment: 
|          // Do nothing, value is handled below
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 45
|     Comment: 
|         
|         //                  }
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 475
|     Comment: 
|         
|         // "," or ":" or "{" or "}". If that is so, then the text is safe for eval.
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 58
|     Comment: 
|         
|         //          be excluded from the serialization.
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 610
|     Comment: 
|         
|         // The timer object for auto-updates, and how often it goes off
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 37
|     Comment: 
|         
|         //          For example, this would serialize Dates as ISO strings.
|     
|     Path: http://192.168.139.68:15672/js/base64.js
|     Line number: 27
|     Comment: 
|         /* base64 encode/decode compatible with window.btoa/atob
|          *
|          * window.atob/btoa is a Firefox extension to convert binary data (the "b")
|          * to base64 (ascii, the "a").
|          *
|          * It is also found in Safari and Chrome.  It is not available in IE.
|          *
|          * if (!window.btoa) window.btoa = base64.encode
|          * if (!window.atob) window.atob = base64.decode
|          *
|          * The original spec's for atob/btoa are a bit lacking
|          * https://developer.mozilla.org/en/DOM/window.atob
|          * https://developer.mozilla.org/en/DOM/window.btoa
|          *
|          * window.btoa and base64.encode takes a string where charCodeAt is [0,255]
|          * If any character is not [0,255], then an exception is thrown.
|          *
|          * window.atob and base64.decode take a base64-encoded string
|          * If the input length is not a multiple of 4, or contains invalid characters
|          *   then an exception is thrown.
|          */
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 6
|     Comment: 
|         
|         //  This code should be minified before deployment.
|     
|     Path: http://192.168.139.68:15672/js/formatters.js
|     Line number: 906
|     Comment: 
|          // max
|     
|     Path: http://192.168.139.68:15672/js/base64.js
|     Line number: 82
|     Comment: 
|          // either way, we want to ignore this last block
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 471
|     Comment: 
|         
|         // replace the JSON backslash pairs with "@" (a non-JSON character). Second, we
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 107
|     Comment: 
|          // DefaultLocationProxy in later versions, but otherwise the issue
|     
|     Path: http://192.168.139.68:15672/js/jquery.flot-0.8.1.min.js
|     Line number: 8
|     Comment: 
|         /* Plugin for jQuery for working with colors.
|          *
|          * Version 1.1.
|          *
|          * Inspiration from jQuery color animation plugin by John Resig.
|          *
|          * Released under the MIT license by Ole Laursen, October 2009.
|          *
|          * Examples:
|          *
|          *   $.color.parse("#fff").scale('rgb', 0.25).add('a', -0.5).toString()
|          *   var c = $.color.extract($("#mydiv"), 'background-color');
|          *   console.log(c.r, c.g, c.b, c.a);
|          *   $.color.make(100, 50, 25, 0.4).toString() // returns "rgba(100,50,25,0.4)"
|          *
|          * Note that .scale() and .add() return the same modified object
|          * instead of making a new one.
|          *
|          * V. 1.1: Fix error handling so e.g. parsing an empty string does
|          * produce a color rather than just crashing.
|          */
|     
|     Path: http://192.168.139.68:15672/js/formatters.js
|     Line number: 256
|     Comment: 
|         
|         // ---------------------------------------------------------------------
|     
|     Path: http://192.168.139.68:15672/js/formatters.js
|     Line number: 258
|     Comment: 
|         
|         // These are pluggable for charts etc
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 25
|     Comment: 
|          // 8 hours from now
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 135
|     Comment: 
|         
|         // All help ? popups
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 102
|     Comment: 
|          // global. So we need to manually clear that in order for links to
|     
|     Path: http://192.168.139.68:15672/js/charts.js
|     Line number: 164
|     Comment: 
|          // status-bar-main
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 617
|     Comment: 
|         
|         // Every 200 updates without user interaction we do a full refresh, to
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 23
|     Comment: 
|         
|         //                      of nested structures. If it is omitted, the text will
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 17
|     Comment: 
|         
|         //      JSON.stringify(value, replacer, space)
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 498
|     Comment: 
|          // ...all cluster nodes run the same version
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 619
|     Comment: 
|         
|         // TODO: maybe we don't need this any more?
|     
|     Path: http://192.168.139.68:15672/js/jquery.flot-0.8.1.min.js
|     Line number: 1
|     Comment: 
|         /* Javascript plotting library for jQuery, version 0.8.1.
|         
|         Copyright (c) 2007-2013 IOLA and Ole Laursen.
|         Licensed under the MIT license.
|         
|         */
|     
|     Path: http://192.168.139.68:15672/js/json2-2016.10.28.js
|     Line number: 332
|     Comment: 
|         
|         // Otherwise, iterate through all of the keys in the object.
|     
|     Path: http://192.168.139.68:15672/js/main.js
|     Line number: 1157
|     Comment: 
|          // 1223 == 204 - see http://www.enhanceie.com/ie/bugs.asp
|     
|     Path: http://192.168.139.68:15672/js/global.js
|     Line number: 509
|     Comment: 
|         
|_        // Used for the new exchange form, and to display broken exchange types
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-mobileversion-checker: No mobile version detected.
|_http-errors: Couldn't find any error pages.
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
| http-methods: 
|_  Supported Methods: HEAD GET OPTIONS
| http-useragent-tester: 
|   Status for browser useragent: 200
|   Allowed User Agents: 
|     Mozilla/5.0 (compatible; Nmap Scripting Engine; https://nmap.org/book/nse.html)
|     libwww
|     lwp-trivial
|     libcurl-agent/1.0
|     PHP/
|     Python-urllib/2.5
|     GT::WWW
|     Snoopy
|     MFC_Tear_Sample
|     HTTP::Lite
|     PHPCrawl
|     URI::Fetch
|     Zend_Http_Client
|     http client
|     PECL::HTTP
|     Wget/1.13.4 (linux-gnu)
|_    WWW-Mechanize/1.34
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
|_http-feed: Couldn't find any feeds.
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-chrono: Request times for /; avg: 625.56ms; min: 563.06ms; max: 706.91ms
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1; ico: 1
|     /css/
|       css: 2
|     /js/
|       js: 13
|   Longest directory structure:
|     Depth: 1
|     Dir: /js/
|   Total files found (by extension):
|_    Other: 1; css: 2; ico: 1; js: 13
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-fetch: Please enter the complete path of the directory to save data in.
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-date: Sun, 30 Jan 2022 09:06:22 GMT; -30m01s from local time.
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php
|_http-malware-host: Host appears to be clean
|_http-title: RabbitMQ Management
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-litespeed-sourcecode-download: Page: /index.php was not found. Try with an existing file.
|_http-config-backup: ERROR: Script execution failed (use -d to debug)
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-favicon: Unknown favicon MD5: DDC75B0899DBF4F7B15290A77FBEB8FF
| http-headers: 
|   connection: close
|   server: Cowboy
|   date: Sun, 30 Jan 2022 09:06:20 GMT
|   content-length: 1391
|   content-type: text/html
|   etag: "3678489298"
|   last-modified: Wed, 10 Mar 2021 20:43:59 GMT
|   
|_  (Request type: HEAD)
|_http-iis-webdav-vuln: WebDAV is DISABLED. Server is not currently vulnerable.
| http-vhosts: 
|_128 names had status 200

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 30 17:15:42 2022 -- 1 IP address (1 host up) scanned in 580.85 seconds

```