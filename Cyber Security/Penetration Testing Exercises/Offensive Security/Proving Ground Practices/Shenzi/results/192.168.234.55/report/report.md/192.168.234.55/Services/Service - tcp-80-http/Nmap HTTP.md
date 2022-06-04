```bash
nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.234.55
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_nmap.txt):

```
# Nmap 7.91 scan initiated Mon Jan 24 09:38:24 2022 as: nmap -vv --reason -Pn -T4 -sV -p 80 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.234.55
Nmap scan report for 192.168.234.55
Host is up, received user-set (0.31s latency).
Scanned at 2022-01-24 09:38:27 EST for 135s

PORT   STATE SERVICE REASON          VERSION
80/tcp open  http    syn-ack ttl 127 Apache httpd 2.4.43 ((Win64) OpenSSL/1.1.1g PHP/7.4.6)
|_http-chrono: Request times for /dashboard/; avg: 1386.37ms; min: 596.49ms; max: 3337.18ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.234.55
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 983
|     Comment: 
|          // if we were to allow it, we'd do this:
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3866
|     Comment: 
|          // Go up a level on Click
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3297
|     Comment: 
|         /* line 86, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4976
|     Comment: 
|         /* line 62, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_progress-bars.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1008
|     Comment: 
|         /**
|              * @preserve HTML5 Shiv prev3.7.1 | @afarkas @jdalton @jon_neal @rem | MIT/GPL2 Licensed
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4161
|     Comment: 
|         /* line 429, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1378
|     Comment: 
|          //       'WebkitTransition' : 'webkitTransitionEnd',
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3324
|     Comment: 
|         /* line 113, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1293
|     Comment: 
|          //creates a shived element
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3706
|     Comment: 
|         /* line 84, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4906
|     Comment: 
|         /* line 64, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pricing-tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 594
|     Comment: 
|          // Browsers that actually have CSS Opacity implemented have done so
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 66
|     Comment: 
|          // and the following would be incorrect:
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1013
|     Comment: 
|         /** version */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 308
|     Comment: 
|         /**
|              * contains returns a boolean for if substr is found within str.
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 418
|     Comment: 
|          // github.com/Modernizr/Modernizr/issues/issue/97/
|     
|     Path: http://192.168.234.55:80/dashboard/docs/send-mail.html
|     Line number: 50
|     Comment: 
|         <!-- Right Nav Section -->
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3339
|     Comment: 
|         /* line 128, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1058
|     Comment: 
|          // assign a false positive if detection fails => unable to shiv
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 915
|     Comment: 
|          // Interestingly, opera fails the earlier test, so it doesn't
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6094
|     Comment: 
|         /* line 77, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 70
|     Comment: 
|         /* top bar */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4966
|     Comment: 
|         /* line 60, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_progress-bars.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1381
|     Comment: 
|          //       'msTransition'     : 'MSTransitionEnd',
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1658
|     Comment: 
|          // array of indexes where to pause the tour after
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2355
|     Comment: 
|         /* line 39, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_accordion.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 468
|     Comment: 
|          // Turns out, it's quite tricky to get right:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 492
|     Comment: 
|         /* Retina Overrides */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 858
|     Comment: 
|          // set the image to the selected thumbnail
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 854
|     Comment: 
|          // Mike Taylr has created a comprehensive resource for testing these attributes
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 93
|     Comment: 
|          // used in testing loop
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7292
|     Comment: 
|         /** Define consistent border, margin, and padding. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 147
|     Comment: 
|          // polyfill
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4971
|     Comment: 
|         /* line 61, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_progress-bars.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 226
|     Comment: 
|          // TODO :: Add flag for hasownprop ? didn't last time
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4534
|     Comment: 
|         /* Orbit Graceful Loading */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 608
|     Comment: 
|          //   a single property at a time
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7290
|     Comment: 
|         /** Address margin not present in IE 8/9 and Safari 5. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3417
|     Comment: 
|         /* line 205, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1673
|     Comment: 
|          // A method to call after each step
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1023
|     Comment: 
|          // image caption
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6558
|     Comment: 
|         /* line 271, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 607
|     Comment: 
|          // Note, Android < 4 will pass this test, but can only animate
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7284
|     Comment: 
|         /** Address inconsistent and variable font size in all browsers. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 661
|     Comment: 
|          //   will sometimes throw a false positive, thus we must do a more thorough check:
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 785
|     Comment: 
|          // Just FWIW: IE8 Compat mode supports these features completely:
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 359
|     Comment: 
|          // let's bind a function
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 772
|     Comment: 
|          // In FF4, if disabled, window.localStorage should === null.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 879
|     Comment: 
|          //   containing each input type with its corresponding true/false value
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 333
|     Comment: 
|         /* downloads list */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 184
|     Comment: 
|          //   Modernizr.hasEvent("textInput") // in Webkit. github.com/Modernizr/Modernizr/issues/333
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 679
|     Comment: 
|         /*>>fontface*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4255
|     Comment: 
|         /* line 44, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 199
|     Comment: 
|          // When using `setAttribute`, IE skips "unload", WebKit skips "unload" and "resize", whereas `in` "catches" those
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 721
|     Comment: 
|          // Codec values from : github.com/NielsLeenheer/html5test/blob/9106a8/index.html#L845
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3616
|     Comment: 
|         /* line 28, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_flex-video.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 287
|     Comment: 
|         /**
|              * setCss applies given styles to the Modernizr DOM node.
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 759
|     Comment: 
|          // Mimetypes accepted:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7273
|     Comment: 
|         /** Improve readability when focused and also mouse hovered in all browsers. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6698
|     Comment: 
|         /* line 337, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 602
|     Comment: 
|          // github.com/Modernizr/Modernizr/issues/#issue/59/comment/516632
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2341
|     Comment: 
|         /* line 28, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_accordion.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4254
|     Comment: 
|         /* Foundation Joyride */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5628
|     Comment: 
|         /* Tooltips */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1034
|     Comment: 
|         /** Cached data for each document */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1382
|     Comment: 
|          //       'transition'       : 'transitionend'
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 986
|     Comment: 
|          // but, no rly, stuff 'em.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 685
|     Comment: 
|          //   WP7   github.com/Modernizr/Modernizr/issues/538
|     
|     Path: http://192.168.234.55:80/dashboard/docs/send-mail.html
|     Line number: 197
|     Comment: 
|         
|         //send the message, check for errors
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 369
|     Comment: 
|         /*
|          * Remove most spacing between table cells.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6302
|     Comment: 
|         /* line 331, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 932
|     Comment: 
|          // visual adjustments
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7378
|     Comment: 
|         /* line 55, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 345
|     Comment: 
|         /*
|          * Removes inner padding and border in Firefox 4+.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 103
|     Comment: 
|         /*
|          * Addresses `h1` font sizes within `section` and `article` in Firefox 4+,
|          * Safari 5, and Chrome.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6292
|     Comment: 
|         /* line 314, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 459
|     Comment: 
|          // #FFF or #FFFFFF
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 325
|     Comment: 
|          // on our modernizr element, but instead just testing undefined vs
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6597
|     Comment: 
|         /* line 276, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6515
|     Comment: 
|         /* line 567, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1380
|     Comment: 
|          //       'OTransition'      : 'oTransitionEnd',
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8498
|     Comment: 
|         /* line 514, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 46
|     Comment: 
|         /*
|          * Addresses styling for `hidden` attribute not present in IE 8/9.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6171
|     Comment: 
|         /* line 162, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 488
|     Comment: 
|         /* line 667, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 38
|     Comment: 
|          // Enable FastClick
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2337
|     Comment: 
|         /* line 25, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_accordion.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5468
|     Comment: 
|         /* line 89, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tables.scss */
|     
|     Path: http://192.168.234.55:80/phpmyadmin/
|     Line number: 8
|     Comment: 
|         /*--><![CDATA[/*><!--*/
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 361
|     Comment: 
|          // default to autobind unless override
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 65
|     Comment: 
|         /* 1 */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8676
|     Comment: 
|         /* line 591, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 454
|     Comment: 
|         /* line 621, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 217
|     Comment: 
|         /*
|          * Corrects overflow displayed oddly in IE 9.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5198
|     Comment: 
|         /* line 178, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4160
|     Comment: 
|         /* We add basic fieldset styling */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1371
|     Comment: 
|          // ex. trigger(), trigger([a, b, c]), or trigger(a, b, c)
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 205
|     Comment: 
|         /* ==========================================================================
|            Embedded content
|            ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 46
|     Comment: 
|         /**
|              * Create the input element for various Web Forms feature tests.
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 177
|     Comment: 
|         /*
|          * Addresses inconsistent and variable font size in all browsers.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6408
|     Comment: 
|         /* line 432, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1786
|     Comment: 
|          // show first tip
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8152
|     Comment: 
|         /* line 374, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8775
|     Comment: 
|         /* line 657, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7275
|     Comment: 
|         /** Address variable `h1` font-size and margin within `section` and `article` contexts in Firefox 4+, Safari 5, and Chrome. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3563
|     Comment: 
|         /* line 93, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4002
|     Comment: 
|         /* line 359, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5930
|     Comment: 
|         /* line 318, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1653
|     Comment: 
|          // 0 = no timer , all other numbers = timer in milliseconds
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3671
|     Comment: 
|          // jump to top when sticky nav menu toggle is clicked
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8091
|     Comment: 
|         /* line 354, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6587
|     Comment: 
|         /* line 145, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8999
|     Comment: 
|         /* line 719, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3703
|     Comment: 
|         /* line 81, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 335
|     Comment: 
|         /*
|          * Removes inner padding and search cancel button in Safari 5 and Chrome
|          * on OS X.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 636
|     Comment: 
|          // standard syntax             // trailing 'background-image:'
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1327
|     Comment: 
|          //   * A max-width or orientation query will be evaluated against the current state, which may change later.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 99
|     Comment: 
|         /* ==========================================================================
|            Typography
|            ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8682
|     Comment: 
|         /* line 595, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2352
|     Comment: 
|         /* line 36, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_accordion.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 82
|     Comment: 
|         /*
|          * Addresses `outline` inconsistency between Chrome and other browsers.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8381
|     Comment: 
|         /* line 445, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7280
|     Comment: 
|         /** Address styling not present in IE 8/9. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1656
|     Comment: 
|          // true or false to control whether a next button is used
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 115
|     Comment: 
|         /* download bar */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2891
|     Comment: 
|         /* line 98, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8822
|     Comment: 
|         /* line 668, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5920
|     Comment: 
|         /* Abbreviations */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 36
|     Comment: 
|         /*
|          * Prevents modern browsers from displaying `audio` without controls.
|          * Remove excess height in iOS 5 devices.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9002
|     Comment: 
|         /* line 720, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5110
|     Comment: 
|         /* line 169, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 775
|     Comment: 
|          //   `('localStorage' in window) && ` test first because otherwise Firefox will
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 3
|     Comment: 
|         /* ==========================================================================
|            HTML5 display definitions
|            ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 1
|     Comment: 
|         /*! normalize.css v2.0.1 | MIT License | git.io/normalize */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9145
|     Comment: 
|         /* line 873, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9141
|     Comment: 
|         /* line 869, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9138
|     Comment: 
|         /* line 865, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9134
|     Comment: 
|         /* line 861, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9133
|     Comment: 
|         /* PHP 7 banner */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9126
|     Comment: 
|         /* line 853, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9123
|     Comment: 
|         /* 560px 2x20px padding */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2326
|     Comment: 
|         /* line 23, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_accordion.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9120
|     Comment: 
|         /* line 848, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 582
|     Comment: 
|          // WebOS unfortunately false positives on this test.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9115
|     Comment: 
|         /* line 843, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9111
|     Comment: 
|         /* line 837, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9108
|     Comment: 
|         /* line 832, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 760
|     Comment: 
|          //   developer.mozilla.org/En/Media_formats_supported_by_the_audio_and_video_elements
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9104
|     Comment: 
|         /* line 829, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9100
|     Comment: 
|         /* line 824, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9094
|     Comment: 
|         /* line 815, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9084
|     Comment: 
|         /* line 805, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9080
|     Comment: 
|         /* line 801, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9075
|     Comment: 
|         /* line 795, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9072
|     Comment: 
|         /* line 792, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9069
|     Comment: 
|         /* line 788, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9066
|     Comment: 
|         /* line 786, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 183
|     Comment: 
|          //   Modernizr.hasEvent("webkitTransitionEnd", elem) // false negative
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9062
|     Comment: 
|         /* line 781, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9058
|     Comment: 
|         /* line 778, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9054
|     Comment: 
|         /* line 775, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9050
|     Comment: 
|         /* line 769, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9046
|     Comment: 
|         /* line 766, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9040
|     Comment: 
|         /* line 763, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9036
|     Comment: 
|         /* line 755, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1249
|     Comment: 
|         /**
|                    * An array or space separated string of node names of the elements to shiv.
|                    * @memberOf html5
|                    * @type Array|String
|                    */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9032
|     Comment: 
|         /* line 751, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9029
|     Comment: 
|         /* line 748, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9024
|     Comment: 
|         /* line 741, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9019
|     Comment: 
|         /* line 735, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5659
|     Comment: 
|         /* line 63, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9016
|     Comment: 
|         /* line 730, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9011
|     Comment: 
|         /* line 724, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9008
|     Comment: 
|         /* line 722, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 9005
|     Comment: 
|         /* line 721, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 26
|     Comment: 
|         /*
|          * Corrects `inline-block` display not defined in IE 8/9.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 112
|     Comment: 
|         /*
|          * Addresses styling not present in IE 8/9, Safari 5, and Chrome.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 148
|     Comment: 
|         /* overriden by @media query */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8996
|     Comment: 
|         /* line 718, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 203
|     Comment: 
|          // If it has no `setAttribute` (i.e. doesn't implement Node interface), try generic element
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8993
|     Comment: 
|         /* line 717, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8989
|     Comment: 
|         /* line 711, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8984
|     Comment: 
|         /* line 704, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8981
|     Comment: 
|         /* line 702, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8978
|     Comment: 
|         /* line 723, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8975
|     Comment: 
|         /* line 722, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 943
|     Comment: 
|          // todo: hypothetically we could be doing an array of tests and use a basic loop here.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 713
|     Comment: 
|          // add 'div.clearing-blackout, div.visible-img' to close on background click
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 680
|     Comment: 
|          // @font-face detection routine by Diego Perini
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8972
|     Comment: 
|         /* line 721, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8969
|     Comment: 
|         /* line 720, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4989
|     Comment: 
|         /* line 68, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_progress-bars.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1071
|     Comment: 
|          // the target image is not adjacent to the current image, so
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6755
|     Comment: 
|         /* line 27, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8965
|     Comment: 
|         /* line 719, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 397
|     Comment: 
|         /**
|              * Tests
|              * -----
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8961
|     Comment: 
|         /* line 718, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8958
|     Comment: 
|         /* line 717, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6581
|     Comment: 
|         /* line 139, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8955
|     Comment: 
|         /* line 716, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8949
|     Comment: 
|         /* line 715, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6930
|     Comment: 
|         /* Specific visilbity for tables */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8946
|     Comment: 
|         /* line 714, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5669
|     Comment: 
|         /* line 74, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8943
|     Comment: 
|         /* line 713, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 180
|     Comment: 
|          // kangax.github.com/iseventsupported/
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 937
|     Comment: 
|          // End of test definitions
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8940
|     Comment: 
|         /* line 712, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 447
|     Comment: 
|          // abc.de
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8935
|     Comment: 
|         /* line 711, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8931
|     Comment: 
|         /* line 710, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8928
|     Comment: 
|         /* line 709, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8925
|     Comment: 
|         /* line 708, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4843
|     Comment: 
|         /* Panels */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 477
|     Comment: 
|         /* Sendgrid form */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 67
|     Comment: 
|          //   elem.style.webkitBorderRadius
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8922
|     Comment: 
|         /* line 707, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8919
|     Comment: 
|         /* line 706, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8915
|     Comment: 
|         /* line 705, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8912
|     Comment: 
|         /* line 704, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8909
|     Comment: 
|         /* line 703, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8904
|     Comment: 
|         /* line 702, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4993
|     Comment: 
|         /* line 69, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_progress-bars.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8901
|     Comment: 
|         /* line 701, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8898
|     Comment: 
|         /* line 700, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8895
|     Comment: 
|         /* line 699, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8892
|     Comment: 
|         /* line 698, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8886
|     Comment: 
|         /* line 697, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 938
|     Comment: 
|          // -----------------------
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6603
|     Comment: 
|         /* line 278, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8883
|     Comment: 
|         /* line 696, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8879
|     Comment: 
|         /* line 695, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8874
|     Comment: 
|         /* line 694, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8865
|     Comment: 
|         /* line 691, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1687
|     Comment: 
|          // One or more space-separated class names to be added to exposed element
|     
|     Path: http://192.168.234.55:80/phpmyadmin/
|     Line number: 13
|     Comment: 
|         /*]]>*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5674
|     Comment: 
|         /* line 80, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8859
|     Comment: 
|         /* line 689, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2359
|     Comment: 
|         /* line 42, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_accordion.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8856
|     Comment: 
|         /* line 687, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8853
|     Comment: 
|         /* line 685, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8850
|     Comment: 
|         /* line 683, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 665
|     Comment: 
|          // `@media (transform-3d),(-webkit-transform-3d){ ... }`
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8847
|     Comment: 
|         /* line 681, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8844
|     Comment: 
|         /* line 680, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8841
|     Comment: 
|         /* line 678, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5874
|     Comment: 
|         /* Unordered Lists */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8838
|     Comment: 
|         /* line 676, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8835
|     Comment: 
|         /* line 674, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8832
|     Comment: 
|         /* line 672, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8828
|     Comment: 
|         /* line 670, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8825
|     Comment: 
|         /* line 669, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 54
|     Comment: 
|         /* ==========================================================================
|            Base
|            ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8819
|     Comment: 
|         /* line 667, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8804
|     Comment: 
|         /* line 666, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8800
|     Comment: 
|         /* line 664, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8796
|     Comment: 
|         /* line 663, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8792
|     Comment: 
|         /* line 662, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8787
|     Comment: 
|         /* line 661, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8783
|     Comment: 
|         /* line 660, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5966
|     Comment: 
|         /* line 355, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 43
|     Comment: 
|          // private Fast Selector wrapper,
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8778
|     Comment: 
|         /* line 659, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 147
|     Comment: 
|         /*
|          * Corrects font family set oddly in Safari 5 and Chrome.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8772
|     Comment: 
|         /* line 655, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8769
|     Comment: 
|         /* line 653, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1342
|     Comment: 
|          // Modernizr.testProp() investigates whether a given style property is recognized
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8766
|     Comment: 
|         /* line 651, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8763
|     Comment: 
|         /* line 649, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 237
|     Comment: 
|         /* yes, this can give false positives/negatives, but most of the time we don't care about those */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7283
|     Comment: 
|         /** Set consistent quote types. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8760
|     Comment: 
|         /* line 647, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8757
|     Comment: 
|         /* line 645, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8754
|     Comment: 
|         /* line 643, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8751
|     Comment: 
|         /* line 641, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8748
|     Comment: 
|         /* line 639, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8745
|     Comment: 
|         /* line 637, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 916
|     Comment: 
|          //  even make it here.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1676
|     Comment: 
|          // A method to call after an element has been exposed
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4985
|     Comment: 
|         /* line 65, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_progress-bars.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8742
|     Comment: 
|         /* line 635, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8739
|     Comment: 
|         /* line 633, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8736
|     Comment: 
|         /* line 631, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8733
|     Comment: 
|         /* line 629, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1379
|     Comment: 
|          //       'MozTransition'    : 'transitionend',
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8730
|     Comment: 
|         /* line 627, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8727
|     Comment: 
|         /* line 625, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6964
|     Comment: 
|         /* X-Large Displays: 1441 and up */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8724
|     Comment: 
|         /* line 623, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 365
|     Comment: 
|          // return the unbound function or obj or value
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8721
|     Comment: 
|         /* line 621, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8718
|     Comment: 
|         /* line 619, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8715
|     Comment: 
|         /* line 617, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8712
|     Comment: 
|         /* line 615, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8709
|     Comment: 
|         /* line 613, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8706
|     Comment: 
|         /* line 611, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8703
|     Comment: 
|         /* line 609, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8700
|     Comment: 
|         /* line 607, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8697
|     Comment: 
|         /* line 605, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 781
|     Comment: 
|          // Peculiarly, getItem and removeItem calls do not throw.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8694
|     Comment: 
|         /* line 603, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8691
|     Comment: 
|         /* line 601, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8688
|     Comment: 
|         /* line 599, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8685
|     Comment: 
|         /* line 597, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 81
|     Comment: 
|         /*>>ns*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 90
|     Comment: 
|         /*
|          * Improves readability when focused and also mouse hovered in all browsers.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8679
|     Comment: 
|         /* line 593, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 229
|     Comment: 
|         /*
|          * Addresses margin not present in IE 8/9 and Safari 5.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 109
|     Comment: 
|         /* hero unit */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8673
|     Comment: 
|         /* line 589, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8670
|     Comment: 
|         /* line 587, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8667
|     Comment: 
|         /* line 585, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8664
|     Comment: 
|         /* line 583, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8661
|     Comment: 
|         /* line 581, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1244
|     Comment: 
|          // options can be changed before the script is included
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8658
|     Comment: 
|         /* line 579, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8652
|     Comment: 
|         /* line 578, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8647
|     Comment: 
|         /* line 576, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8644
|     Comment: 
|         /* line 574, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8640
|     Comment: 
|         /* line 573, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 129
|     Comment: 
|          //avoid crashing IE8, if background image is used
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8632
|     Comment: 
|         /* line 572, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8626
|     Comment: 
|         /* line 571, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8621
|     Comment: 
|         /* line 570, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1326
|     Comment: 
|          //   * If a browser does not support media queries at all (eg. oldIE) the mq() will always return false
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8618
|     Comment: 
|         /* line 568, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8615
|     Comment: 
|         /* line 567, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1325
|     Comment: 
|          // A few important notes:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8611
|     Comment: 
|         /* line 566, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8608
|     Comment: 
|         /* line 564, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8605
|     Comment: 
|         /* line 562, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 106
|     Comment: 
|          // requestAnimationFrame polyfill adapted from Erik M\xC3\xB6ller
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8602
|     Comment: 
|         /* line 561, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 842
|     Comment: 
|          //   github.com/Modernizr/Modernizr/issues/213#issuecomment-1149491
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1654
|     Comment: 
|          // true or false - true requires clicking the first button start the timer
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8596
|     Comment: 
|         /* line 560, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 59
|     Comment: 
|          // List of property values to set for css tests. See ticket #21
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 947
|     Comment: 
|          //   then based on that boolean, define an appropriate className
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8593
|     Comment: 
|         /* line 558, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 563
|     Comment: 
|          // this will false positive in Opera Mini
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8590
|     Comment: 
|         /* line 557, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4954
|     Comment: 
|         /* line 53, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_progress-bars.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8587
|     Comment: 
|         /* line 556, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8584
|     Comment: 
|         /* line 555, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 242
|     Comment: 
|          // Adapted from ES5-shim https://github.com/kriskowal/es5-shim/blob/master/es5-shim.js
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8581
|     Comment: 
|         /* line 554, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 108
|     Comment: 
|          // In order not to give false positives we create a node for each test
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8574
|     Comment: 
|         /* line 552, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8571
|     Comment: 
|         /* line 550, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8567
|     Comment: 
|         /* line 549, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8564
|     Comment: 
|         /* line 547, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8561
|     Comment: 
|         /* line 545, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8557
|     Comment: 
|         /* line 543, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8554
|     Comment: 
|         /* line 541, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8550
|     Comment: 
|         /* line 540, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8547
|     Comment: 
|         /* line 538, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8544
|     Comment: 
|         /* line 536, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8541
|     Comment: 
|         /* line 534, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1677
|     Comment: 
|          // HTML segments for tip layout
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8538
|     Comment: 
|         /* line 532, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8535
|     Comment: 
|         /* line 530, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8532
|     Comment: 
|         /* line 528, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 495
|     Comment: 
|          // - Firefox shipped moz_indexedDB before FF4b9, but since then has been mozIndexedDB
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8529
|     Comment: 
|         /* line 526, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8525
|     Comment: 
|         /* line 524, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8522
|     Comment: 
|         /* line 522, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8516
|     Comment: 
|         /* line 521, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8508
|     Comment: 
|         /* line 520, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8504
|     Comment: 
|         /* line 518, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8501
|     Comment: 
|         /* line 516, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 276
|     Comment: 
|         /*
|          * Addresses Firefox 4+ setting `line-height` on `input` using `!important` in
|          * the UA stylesheet.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8495
|     Comment: 
|         /* line 512, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8492
|     Comment: 
|         /* line 510, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8489
|     Comment: 
|         /* line 508, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4981
|     Comment: 
|         /* line 64, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_progress-bars.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 2053
|     Comment: 
|          // tip must not be "display: none" to calculate position
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8486
|     Comment: 
|         /* line 506, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1311
|     Comment: 
|          // Assign private properties to the return object with prefix
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8483
|     Comment: 
|         /* line 504, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8480
|     Comment: 
|         /* line 502, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 876
|     Comment: 
|          // Run through HTML5's new input types to see if the UA understands any.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 195
|     Comment: 
|          // check RTL
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8477
|     Comment: 
|         /* line 500, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8474
|     Comment: 
|         /* line 498, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8470
|     Comment: 
|         /* line 496, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1044
|     Comment: 
|          //if the hidden property is implemented we can assume, that the browser supports basic HTML5 Styles
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8466
|     Comment: 
|         /* line 494, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8461
|     Comment: 
|         /* line 492, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8458
|     Comment: 
|         /* line 490, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8455
|     Comment: 
|         /* line 488, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8452
|     Comment: 
|         /* line 486, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8449
|     Comment: 
|         /* line 484, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 328
|     Comment: 
|          // Because the testing of the CSS property names (with "-", as
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8446
|     Comment: 
|         /* line 482, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8443
|     Comment: 
|         /* line 480, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 26
|     Comment: 
|         /* line 46, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 664
|     Comment: 
|          // Webkit allows this media query to succeed only if the feature is enabled.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8440
|     Comment: 
|         /* line 478, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 388
|     Comment: 
|          // otherwise, they called .prefixed('requestAnimationFrame', window[, elem])
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8437
|     Comment: 
|         /* line 476, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8434
|     Comment: 
|         /* line 474, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1663
|     Comment: 
|          // Will this cookie be attached to a domain, ie. '.notableapp.com'
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8431
|     Comment: 
|         /* line 472, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8428
|     Comment: 
|         /* line 470, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8425
|     Comment: 
|         /* line 468, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8422
|     Comment: 
|         /* line 466, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 5455
|     Comment: 
|          // substitute @2x images where available
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8419
|     Comment: 
|         /* line 464, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8416
|     Comment: 
|         /* line 462, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8413
|     Comment: 
|         /* line 460, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 439
|     Comment: 
|          // amex, visa, diners
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1650
|     Comment: 
|          // override on a per tooltip bases
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8410
|     Comment: 
|         /* line 458, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8407
|     Comment: 
|         /* line 456, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8404
|     Comment: 
|         /* line 454, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8401
|     Comment: 
|         /* line 452, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8397
|     Comment: 
|         /* line 451, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1672
|     Comment: 
|          // A method to call once the tour closes (canceled or complete)
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 725
|     Comment: 
|          //   It was live in FF3.5.0 and 3.5.1, but fixed in 3.5.2
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8394
|     Comment: 
|         /* line 449, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8390
|     Comment: 
|         /* line 448, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8386
|     Comment: 
|         /* line 447, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 78
|     Comment: 
|         /* ==========================================================================
|            Links
|            ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7298
|     Comment: 
|         /** Re-set default cursor for disabled elements. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8378
|     Comment: 
|         /* line 444, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8373
|     Comment: 
|         /* line 443, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 120
|     Comment: 
|          // msdn.microsoft.com/en-us/library/ms533897%28VS.85%29.aspx
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8369
|     Comment: 
|         /* line 441, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 16
|     Comment: 
|         /* line 31, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8366
|     Comment: 
|         /* line 440, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 417
|     Comment: 
|          // so we actually have to call getContext() to verify
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7269
|     Comment: 
|         /** Remove default margin. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8359
|     Comment: 
|         /* line 439, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 243
|     Comment: 
|          // es5.github.com/#x15.3.4.5
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8356
|     Comment: 
|         /* line 438, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8353
|     Comment: 
|         /* line 436, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8350
|     Comment: 
|         /* line 435, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8344
|     Comment: 
|         /* line 434, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8339
|     Comment: 
|         /* line 433, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1668
|     Comment: 
|          // bottom should not need to be repositioned
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8336
|     Comment: 
|         /* line 432, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8326
|     Comment: 
|         /* line 431, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8321
|     Comment: 
|         /* line 430, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8312
|     Comment: 
|         /* line 429, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8308
|     Comment: 
|         /* line 428, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8304
|     Comment: 
|         /* line 427, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8300
|     Comment: 
|         /* line 425, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8296
|     Comment: 
|         /* line 423, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8290
|     Comment: 
|         /* line 421, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8286
|     Comment: 
|         /* line 419, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8281
|     Comment: 
|         /* line 417, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 273
|     Comment: 
|         /* 3 */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1003
|     Comment: 
|          // Reset modElem.cssText to nothing to reduce memory footprint.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8275
|     Comment: 
|         /* line 415, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8272
|     Comment: 
|         /* line 413, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 550
|     Comment: 
|          //  and then querying the style.background property value for the number of
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8267
|     Comment: 
|         /* line 411, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 41
|     Comment: 
|         /* line 65, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8264
|     Comment: 
|         /* line 409, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 5491
|     Comment: 
|          // Show section if anchor provided
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1331
|     Comment: 
|          // Modernizr.mq('only screen and (max-width:768)')
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8253
|     Comment: 
|         /* line 407, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8250
|     Comment: 
|         /* line 405, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8247
|     Comment: 
|         /* line 403, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8242
|     Comment: 
|         /* line 401, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1170
|     Comment: 
|         /**
|                  * Shivs the `createElement` and `createDocumentFragment` methods of the document.
|                  * @private
|                  * @param {Document|DocumentFragment} ownerDocument The document.
|                  * @param {Object} data of the document.
|                  */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4855
|     Comment: 
|         /* line 49, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_panels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8235
|     Comment: 
|         /* line 398, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8232
|     Comment: 
|         /* line 396, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8228
|     Comment: 
|         /* line 395, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 503
|     Comment: 
|         /* import foundation last */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8222
|     Comment: 
|         /* line 394, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 69
|     Comment: 
|          // fakeBody required for <FF4 when executed in <head>
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8215
|     Comment: 
|         /* line 393, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 104
|     Comment: 
|          // IE6 and 7 won't return offsetWidth or offsetHeight unless it's in the body element, so we fake it.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8212
|     Comment: 
|         /* line 391, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8209
|     Comment: 
|         /* line 390, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 600
|     Comment: 
|          // The non-literal . in this regex is intentional:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8206
|     Comment: 
|         /* line 388, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8201
|     Comment: 
|         /* line 386, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8198
|     Comment: 
|         /* line 385, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8195
|     Comment: 
|         /* line 384, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8185
|     Comment: 
|         /* line 383, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8182
|     Comment: 
|         /* line 381, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8179
|     Comment: 
|         /* line 380, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8169
|     Comment: 
|         /* line 379, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8166
|     Comment: 
|         /* line 377, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8160
|     Comment: 
|         /* line 376, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3155
|     Comment: 
|         /* line 88, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8155
|     Comment: 
|         /* line 375, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 31
|     Comment: 
|         /* line 53, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 159
|     Comment: 
|         /*
|          * Improves readability of pre-formatted text in all browsers.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8148
|     Comment: 
|         /* line 373, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8142
|     Comment: 
|         /* line 372, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8139
|     Comment: 
|         /* line 370, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8136
|     Comment: 
|         /* line 368, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8131
|     Comment: 
|         /* line 366, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8124
|     Comment: 
|         /* line 364, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8121
|     Comment: 
|         /* line 362, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8118
|     Comment: 
|         /* line 360, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8114
|     Comment: 
|         /* line 359, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 551
|     Comment: 
|          //  occurrences of "url(" is a reliable method for detecting ACTUAL support for this!
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8111
|     Comment: 
|         /* line 358, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8105
|     Comment: 
|         /* line 357, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8094
|     Comment: 
|         /* line 356, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 120
|     Comment: 
|         /*
|          * Addresses style set to `bolder` in Firefox 4+, Safari 5, and Chrome.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1226
|     Comment: 
|          // hides non-rendered elements
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8088
|     Comment: 
|         /* line 353, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/phpmyadmin/
|     Line number: 8
|     Comment: 
|         <!--/*-->
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8084
|     Comment: 
|         /* line 351, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8080
|     Comment: 
|         /* line 349, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8075
|     Comment: 
|         /* line 347, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8072
|     Comment: 
|         /* line 345, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1283
|     Comment: 
|         /**
|                    * A string to describe the type of `html5` object ("default" or "default print").
|                    * @memberOf html5
|                    * @type String
|                    */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8069
|     Comment: 
|         /* line 344, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 384
|     Comment: 
|          // did they call .prefixed('boxSizing') or are we just testing a prop?
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8059
|     Comment: 
|         /* line 343, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8055
|     Comment: 
|         /* line 342, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8052
|     Comment: 
|         /* line 341, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 861
|     Comment: 
|          // Both tests are available in feature-detects/forms-placeholder.js
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8049
|     Comment: 
|         /* line 340, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8046
|     Comment: 
|         /* line 339, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 58
|     Comment: 
|         /* line 88, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8043
|     Comment: 
|         /* line 338, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 71
|     Comment: 
|          //   erik.eae.net/archives/2008/03/10/21.48.10/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5901
|     Comment: 
|         /* Ordered Lists */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8039
|     Comment: 
|         /* line 337, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8032
|     Comment: 
|         /* line 336, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8028
|     Comment: 
|         /* line 335, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8023
|     Comment: 
|         /* line 334, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8019
|     Comment: 
|         /* line 333, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8015
|     Comment: 
|         /* line 332, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 522
|     Comment: 
|          // will be supported until FF19 (2/12/13), at which time, ESR becomes FF17.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8011
|     Comment: 
|         /* line 331, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7996
|     Comment: 
|         /* line 330, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1398
|     Comment: 
|          // Remove "no-js" class from <html> element, if it exists:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7992
|     Comment: 
|         /* line 329, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7989
|     Comment: 
|         /* line 328, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7984
|     Comment: 
|         /* line 326, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1647
|     Comment: 
|          // turn on or off the expose feature
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7981
|     Comment: 
|         /* line 324, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7978
|     Comment: 
|         /* line 323, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 776
|     Comment: 
|          //   throw bugzil.la/365772 if cookies are disabled
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7974
|     Comment: 
|         /* line 322, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3104
|     Comment: 
|         /* line 82, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 2384
|     Comment: 
|          //using this to calculate since scroll may not have finished yet.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7971
|     Comment: 
|         /* line 321, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 660
|     Comment: 
|          //   some conditions. As a result, Webkit typically recognizes the syntax but
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1649
|     Comment: 
|          // 'top' or 'bottom' in relation to parent
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7968
|     Comment: 
|         /* line 320, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5911
|     Comment: 
|         /* Definition Lists */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7965
|     Comment: 
|         /* line 319, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7961
|     Comment: 
|         /* line 318, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 493
|     Comment: 
|          // Vendors had inconsistent prefixing with the experimental Indexed DB:
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1661
|     Comment: 
|          // true or false to control whether cookies are used
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 280
|     Comment: 
|         /* XAMPP stamps table */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7953
|     Comment: 
|         /* line 316, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 575
|     Comment: 
|          // Super comprehensive table about all the unique implementations of
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7950
|     Comment: 
|         /* line 314, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 255
|     Comment: 
|         /* sub page layout */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7947
|     Comment: 
|         /* line 313, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7944
|     Comment: 
|         /* line 312, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7940
|     Comment: 
|         /* line 311, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7937
|     Comment: 
|         /* line 310, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5604
|     Comment: 
|         /* line 62, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_thumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7934
|     Comment: 
|         /* line 309, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5774
|     Comment: 
|         /* Default header styles */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7931
|     Comment: 
|         /* line 308, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7928
|     Comment: 
|         /* line 307, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7914
|     Comment: 
|         /* line 306, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1861
|     Comment: 
|          // don't go to the next li if the tour was paused
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7910
|     Comment: 
|         /* line 305, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4552
|     Comment: 
|         /* line 82, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7906
|     Comment: 
|         /* line 304, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7901
|     Comment: 
|         /* line 303, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 330
|     Comment: 
|          // non-standard but works in WebKit and IE (but not Gecko or Opera),
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3311
|     Comment: 
|         /* line 100, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1025
|     Comment: 
|         /** Detect whether the browser supports default html5 styles */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7895
|     Comment: 
|         /* line 299, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 139
|     Comment: 
|          // If this is done after page load we don't want to remove the body so check if body exists
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7892
|     Comment: 
|         /* line 297, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7888
|     Comment: 
|         /* line 296, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7876
|     Comment: 
|         /* line 295, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 587
|     Comment: 
|          // FF3.0 will false positive on this test
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7873
|     Comment: 
|         /* line 293, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7869
|     Comment: 
|         /* line 291, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 69
|     Comment: 
|          // Webkit ghosts their properties in lowercase but Opera & Moz do not.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7865
|     Comment: 
|         /* line 289, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7860
|     Comment: 
|         /* line 287, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3638
|     Comment: 
|          // deprecate reload
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 684
|     Comment: 
|          //   WebOS github.com/Modernizr/Modernizr/issues/342
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7857
|     Comment: 
|         /* line 285, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7854
|     Comment: 
|         /* line 283, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7851
|     Comment: 
|         /* line 281, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7835
|     Comment: 
|         /* line 279, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7832
|     Comment: 
|         /* line 277, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 502
|     Comment: 
|          //   which false positives.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7825
|     Comment: 
|         /* line 275, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7813
|     Comment: 
|         /* line 273, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 841
|     Comment: 
|          // However read the comments to dig into applying SVG clippaths to HTML content here:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7810
|     Comment: 
|         /* line 271, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4499
|     Comment: 
|         /* line 45, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7806
|     Comment: 
|         /* line 270, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7803
|     Comment: 
|         /* line 268, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7799
|     Comment: 
|         /* line 267, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7795
|     Comment: 
|         /* line 265, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7792
|     Comment: 
|         /* line 264, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7787
|     Comment: 
|         /* line 263, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7781
|     Comment: 
|         /* line 262, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7777
|     Comment: 
|         /* line 261, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7772
|     Comment: 
|         /* line 260, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7769
|     Comment: 
|         /* line 258, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7766
|     Comment: 
|         /* line 257, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7763
|     Comment: 
|         /* line 256, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 780
|     Comment: 
|          //   QUOTA_EXCEEDED_ERRROR DOM Exception 22.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7760
|     Comment: 
|         /* line 255, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7757
|     Comment: 
|         /* line 254, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1092
|     Comment: 
|         /**
|                  * Returns the data associated to the given document
|                  * @private
|                  * @param {Document} ownerDocument The document.
|                  * @returns {Object} An object of data.
|                  */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7749
|     Comment: 
|         /* line 252, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 63
|     Comment: 
|         /* line 93, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7746
|     Comment: 
|         /* line 251, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5639
|     Comment: 
|         /* line 45, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7742
|     Comment: 
|         /* line 249, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7738
|     Comment: 
|         /* line 248, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7732
|     Comment: 
|         /* line 247, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 889
|     Comment: 
|          // We first check to see if the type we give it sticks..
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7728
|     Comment: 
|         /* line 244, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7725
|     Comment: 
|         /* line 242, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7722
|     Comment: 
|         /* line 241, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7717
|     Comment: 
|         /* line 240, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7712
|     Comment: 
|         /* line 239, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3841
|     Comment: 
|         /* Label Styles */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7709
|     Comment: 
|         /* line 236, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7702
|     Comment: 
|         /* line 234, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7699
|     Comment: 
|         /* line 231, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7695
|     Comment: 
|         /* line 230, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7691
|     Comment: 
|         /* line 227, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7688
|     Comment: 
|         /* line 224, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2841
|     Comment: 
|         /* line 114, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7685
|     Comment: 
|         /* line 223, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7682
|     Comment: 
|         /* line 222, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7679
|     Comment: 
|         /* line 221, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 57
|     Comment: 
|          // TODO :: make the prefixes more granular
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7676
|     Comment: 
|         /* line 220, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7670
|     Comment: 
|         /* line 219, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1343
|     Comment: 
|          // Note that the property names must be provided in the camelCase variant.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7667
|     Comment: 
|         /* line 216, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7664
|     Comment: 
|         /* line 215, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3638
|     Comment: 
|         /* Using forms within rows, we need to set some defaults */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7657
|     Comment: 
|         /* line 213, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7652
|     Comment: 
|         /* line 210, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 488
|     Comment: 
|          // It doesn't anymore.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7648
|     Comment: 
|         /* line 208, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 124
|     Comment: 
|          // IE6 will false positive on some tests due to the style element inside the test div somehow interfering offsetHeight, so insert it into body or fakebody.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 5519
|     Comment: 
|         
|         // Linux x64 detection
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7644
|     Comment: 
|         /* line 206, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7640
|     Comment: 
|         /* line 204, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7633
|     Comment: 
|         /* line 201, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7630
|     Comment: 
|         /* line 199, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 108
|     Comment: 
|          // http://paulirish.com/2011/requestanimationframe-for-smart-animating/
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 923
|     Comment: 
|          // If the upgraded input compontent rejects the :) text, we got a winner
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 228
|     Comment: 
|          // hasOwnProperty shim by kangax needed for Safari 2.0 support
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7627
|     Comment: 
|         /* line 197, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7624
|     Comment: 
|         /* line 195, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7621
|     Comment: 
|         /* line 193, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7618
|     Comment: 
|         /* line 191, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7615
|     Comment: 
|         /* line 189, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7610
|     Comment: 
|         /* line 187, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7600
|     Comment: 
|         /* line 186, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7595
|     Comment: 
|         /* line 183, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1121
|     Comment: 
|          // lock management
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7587
|     Comment: 
|         /* line 182, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7584
|     Comment: 
|         /* line 179, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1238
|     Comment: 
|         /**
|                  * The `html5` object is exposed so that more elements can be shived and
|                  * existing shiving can be detected on iframes.
|                  * @type Object
|                  * @example
|                  *
|                  * // options can be changed before the script is included
|                  * html5 = { 'elements': 'mark section', 'shivCSS': false, 'shivMethods': false };
|                  */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5823
|     Comment: 
|         /* Helpful Typography Defaults */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7581
|     Comment: 
|         /* line 178, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 298
|     Comment: 
|          // parse options
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7576
|     Comment: 
|         /* line 177, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 73
|     Comment: 
|          // More here: github.com/Modernizr/Modernizr/issues/issue/21
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7571
|     Comment: 
|         /* line 174, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7564
|     Comment: 
|         /* line 171, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7560
|     Comment: 
|         /* line 169, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7557
|     Comment: 
|         /* line 167, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 57
|     Comment: 
|         /* latest news headling */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7553
|     Comment: 
|         /* line 165, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7549
|     Comment: 
|         /* line 163, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7546
|     Comment: 
|         /* line 161, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7543
|     Comment: 
|         /* line 159, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7540
|     Comment: 
|         /* line 157, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7537
|     Comment: 
|         /* line 155, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7534
|     Comment: 
|         /* line 153, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7531
|     Comment: 
|         /* line 151, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7528
|     Comment: 
|         /* line 149, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7525
|     Comment: 
|         /* line 147, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7522
|     Comment: 
|         /* line 145, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7519
|     Comment: 
|         /* line 143, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 701
|     Comment: 
|          // CSS generated content detection
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7516
|     Comment: 
|         /* line 141, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7512
|     Comment: 
|         /* line 139, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7509
|     Comment: 
|         /* line 137, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7497
|     Comment: 
|         /* line 135, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7494
|     Comment: 
|         /* line 133, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 501
|     Comment: 
|          // documentMode logic from YUI to filter out IE8 Compat Mode
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7489
|     Comment: 
|         /* line 131, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7485
|     Comment: 
|         /* line 129, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 152
|     Comment: 
|         /*>>mq*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7481
|     Comment: 
|         /* line 127, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1367
|     Comment: 
|          // Modernizr.prefixed() returns the prefixed or nonprefixed property name variant of your input
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7477
|     Comment: 
|         /* line 125, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7473
|     Comment: 
|         /* line 123, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7467
|     Comment: 
|         /* line 119, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 838
|     Comment: 
|          // This test is only for clip paths in SVG proper, not clip paths on HTML content
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3633
|     Comment: 
|         /* Standard Forms */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7463
|     Comment: 
|         /* line 116, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7460
|     Comment: 
|         /* line 113, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7452
|     Comment: 
|         /* line 110, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7446
|     Comment: 
|         /* line 107, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7443
|     Comment: 
|         /* line 104, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7437
|     Comment: 
|         /* line 101, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7434
|     Comment: 
|         /* line 98, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7431
|     Comment: 
|         /* line 95, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7423
|     Comment: 
|         /* line 92, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7417
|     Comment: 
|         /* line 89, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7412
|     Comment: 
|         /* line 86, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7409
|     Comment: 
|         /* line 82, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7406
|     Comment: 
|         /* line 78, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1652
|     Comment: 
|          // supports 'swing' and 'linear', extend with jQuery UI.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7403
|     Comment: 
|         /* line 75, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7400
|     Comment: 
|         /* line 71, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 507
|     Comment: 
|          // Per 1.6:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7397
|     Comment: 
|         /* line 69, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 855
|     Comment: 
|          //   when applied to all input types:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7391
|     Comment: 
|         /* line 67, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7388
|     Comment: 
|         /* line 64, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3092
|     Comment: 
|         /* line 80, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7385
|     Comment: 
|         /* line 61, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1773
|     Comment: 
|          // generate the tips and insert into dom.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7382
|     Comment: 
|         /* line 58, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 355
|     Comment: 
|         /*
|          * 1. Removes default vertical scrollbar in IE 8/9.
|          * 2. Improves readability and alignment in all browsers.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7374
|     Comment: 
|         /* line 52, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7369
|     Comment: 
|         /* line 49, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7366
|     Comment: 
|         /* line 46, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7363
|     Comment: 
|         /* line 43, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7360
|     Comment: 
|         /* line 40, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7356
|     Comment: 
|         /* line 37, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7353
|     Comment: 
|         /* line 33, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7350
|     Comment: 
|         /* line 30, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1065
|     Comment: 
|         /*--------------------------------------------------------------------------*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7347
|     Comment: 
|         /* line 27, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7344
|     Comment: 
|         /* line 23, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1037
|     Comment: 
|         /** Detect whether the browser supports unknown elements */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6466
|     Comment: 
|         /* line 495, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 237
|     Comment: 
|         /* ==========================================================================
|            Forms
|            ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6754
|     Comment: 
|         /* Foundation Visibility HTML Classes */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7336
|     Comment: 
|         /* line 20, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1401
|     Comment: 
|          // Add the new classes to the <html> element.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1290
|     Comment: 
|          // shivs the document according to the specified `html5` object options
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7333
|     Comment: 
|         /* line 16, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7330
|     Comment: 
|         /* line 14, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7326
|     Comment: 
|         /* line 11, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 347
|     Comment: 
|         /**
|              * testDOMProps is a generic DOM property test; if a browser supports
|              *   a certain property, it won't return undefined for it.
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7323
|     Comment: 
|         /* line 8, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1648
|     Comment: 
|          // Whether to cover page with modal during the tour
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7166
|     Comment: 
|         /* line 620, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6342
|     Comment: 
|         /* line 375, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6199
|     Comment: 
|         /* line 195, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3245
|     Comment: 
|         /* line 40, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 145
|     Comment: 
|         /* line 203, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 774
|     Comment: 
|          // Normally, we could not test that directly and need to do a
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7304
|     Comment: 
|         /* ========================================================================== Tables ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 657
|     Comment: 
|         /* line 195, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/docs/send-mail.html
|     Line number: 6
|     Comment: 
|         <!-- Always force latest IE rendering engine or request Chrome Frame -->
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 65
|     Comment: 
|          //   elem.style.WebkitBorderRadius
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 37
|     Comment: 
|         /* line 60, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1256
|     Comment: 
|         /**
|                    * current version of html5shiv
|                    */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7301
|     Comment: 
|         /** Remove inner padding and search cancel button in Safari 5 and Chrome on OS X. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7300
|     Comment: 
|         /** 1. Address `appearance` set to `searchfield` in Safari 5 and Chrome. 2. Address `box-sizing` set to `border-box` in Safari 5 and Chrome (include `-moz` to future-proof). */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7299
|     Comment: 
|         /** 1. Address box sizing set to `content-box` in IE 8/9. 2. Remove excess padding in IE 8/9. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7297
|     Comment: 
|         /** 1. Avoid the WebKit bug in Android 4.0.* where (2) destroys native `audio` and `video` controls. 2. Correct inability to style clickable `input` types in iOS. 3. Improve usability and consistency of cursor style between image-type `input` and others. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 912
|     Comment: 
|          // Spec doesn't define any special parsing or detectable UI
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7295
|     Comment: 
|         /** Address Firefox 4+ setting `line-height` on `input` using `!important` in the UA stylesheet. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2868
|     Comment: 
|         /* line 71, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7293
|     Comment: 
|         /** 1. Correct `color` not being inherited in IE 8/9. 2. Remove padding so people aren't caught out if they zero out fieldsets. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7291
|     Comment: 
|         /* ========================================================================== Forms ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7289
|     Comment: 
|         /* ========================================================================== Figures ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5945
|     Comment: 
|         /* line 332, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5643
|     Comment: 
|         /* line 48, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7286
|     Comment: 
|         /* ========================================================================== Embedded content ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 867
|     Comment: 
|          // safari false positive's on datalist: webk.it/74252
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3956
|     Comment: 
|         /* line 351, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/docs/send-mail.html
|     Line number: 262
|     Comment: 
|         <!-- JS Libraries -->
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 985
|     Comment: 
|          //   docElement.className = docElement.className.replace( re, '' );
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 70
|     Comment: 
|         /*
|          * Removes default margin.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 852
|     Comment: 
|          // Run through HTML5's new input attributes to see if the UA understands any.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1384
|     Comment: 
|          //     transEndEventName = transEndEventNames[ Modernizr.prefixed('transition') ];
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4919
|     Comment: 
|         /* line 139, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pricing-tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4287
|     Comment: 
|         /* Add a little css triangle pip, older browser just miss out on the fanciness of it */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3978
|     Comment: 
|          // check for sticky
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 540
|     Comment: 
|          // Same as rgba(), in fact, browsers re-map hsla() to rgba() internally,
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3258
|     Comment: 
|         /* line 46, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7276
|     Comment: 
|         /** Address styling not present in IE 8/9, Safari 5, and Chrome. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 461
|     Comment: 
|         /* line 631, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6055
|     Comment: 
|         /* line 423, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5916
|     Comment: 
|         /* line 306, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7270
|     Comment: 
|         /* ========================================================================== Links ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5847
|     Comment: 
|         /* Lists */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5041
|     Comment: 
|         /* line 144, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7267
|     Comment: 
|         /* ========================================================================== Base ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7266
|     Comment: 
|         /** Address `[hidden]` styling not present in IE 8/9. Hide the `template` element in IE, Safari, and Firefox < 22. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7265
|     Comment: 
|         /** Prevent modern browsers from displaying `audio` without controls. Remove excess height in iOS 5 devices. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5460
|     Comment: 
|         /* line 312, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5065
|     Comment: 
|         /* line 154, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7262
|     Comment: 
|         /* ========================================================================== HTML5 display definitions ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6773
|     Comment: 
|         /* line 43, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1
|     Comment: 
|         /*
|          * Foundation Responsive Library
|          * http://foundation.zurb.com
|          * Copyright 2013, ZURB
|          * Free to use under the MIT license.
|          * http://www.opensource.org/licenses/mit-license.php
|         */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7258
|     Comment: 
|         /* line 697, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6277
|     Comment: 
|         /* line 298, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 778
|     Comment: 
|          // Also in iOS5 Private Browsing mode, attempting to use localStorage.setItem
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7253
|     Comment: 
|         /* line 693, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7249
|     Comment: 
|         /* line 659, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7245
|     Comment: 
|         /* line 658, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7241
|     Comment: 
|         /* line 657, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7237
|     Comment: 
|         /* line 656, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3975
|     Comment: 
|          // Put element back in the DOM
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7233
|     Comment: 
|         /* line 655, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7229
|     Comment: 
|         /* line 654, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7087
|     Comment: 
|         /* Orientation targeting */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7225
|     Comment: 
|         /* line 653, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7221
|     Comment: 
|         /* line 652, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 475
|     Comment: 
|          // a false positive that would throw an exception: bugzil.la/688158
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7217
|     Comment: 
|         /* line 651, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7213
|     Comment: 
|         /* line 650, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3272
|     Comment: 
|         /* line 61, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/phpmyadmin/
|     Line number: 8
|     Comment: 
|         
|         
|         
|         
|         
|         /*]]>*/-->
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7209
|     Comment: 
|         /* line 649, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 496
|     Comment: 
|          // For speed, we don't test the legacy (and beta-only) indexedDB
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 681
|     Comment: 
|          // javascript.nwbox.com/CSSSupport/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7205
|     Comment: 
|         /* line 648, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7200
|     Comment: 
|         /* line 645, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7196
|     Comment: 
|         /* line 644, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7192
|     Comment: 
|         /* line 643, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7188
|     Comment: 
|         /* line 642, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4223
|     Comment: 
|         /* line 461, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1337
|     Comment: 
|          // Modernizr.hasEvent('gesturestart', elem)
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 438
|     Comment: 
|         /*
|              * The Modernizr.touch test only indicates if the browser supports
|              *    touch events, which does not necessarily reflect a touchscreen
|              *    device, as evidenced by tablets running Windows 7 or, alas,
|              *    the Palm Pre / WebOS (touch) phones.
|              *
|              * Additionally, Chrome (desktop) used to lie about its support on this,
|              *    but that has since been rectified: crbug.com/36415
|              *
|              * We also test for Firefox 4 Multitouch Support.
|              *
|              * For more info, see: modernizr.github.com/Modernizr/touch.html
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7182
|     Comment: 
|         /* line 637, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7178
|     Comment: 
|         /* line 632, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7174
|     Comment: 
|         /* line 628, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7170
|     Comment: 
|         /* line 624, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7320
|     Comment: 
|         /* line 5, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7160
|     Comment: 
|         /* line 615, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7155
|     Comment: 
|         /* line 613, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1329
|     Comment: 
|          //       Modernizr.mq('(min-width:0)')
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7149
|     Comment: 
|         /* line 607, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7145
|     Comment: 
|         /* line 602, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4900
|     Comment: 
|         /* Pricing Tables */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7141
|     Comment: 
|         /* line 598, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7137
|     Comment: 
|         /* line 594, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1674
|     Comment: 
|          // A method to call before each step
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7133
|     Comment: 
|         /* line 590, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7127
|     Comment: 
|         /* line 585, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7122
|     Comment: 
|         /* line 583, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7115
|     Comment: 
|         /* line 578, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3284
|     Comment: 
|         /* line 72, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7111
|     Comment: 
|         /* line 573, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 717
|     Comment: 
|          // We're using the Boolean constructor here, so that we can extend the value
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7107
|     Comment: 
|         /* line 569, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7103
|     Comment: 
|         /* line 565, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7099
|     Comment: 
|         /* line 561, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 32
|     Comment: 
|         /*>>cssclasses*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7093
|     Comment: 
|         /* line 556, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7088
|     Comment: 
|         /* line 554, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7074
|     Comment: 
|         /* line 547, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7070
|     Comment: 
|         /* line 534, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 102
|     Comment: 
|          // After page load injecting a fake body doesn't work so check if body exists
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 576
|     Comment: 
|          // border-radius: muddledramblings.com/table-of-css3-border-radius-compliance
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7066
|     Comment: 
|         /* line 522, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7062
|     Comment: 
|         /* line 510, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 373
|     Comment: 
|         /**
|              * testPropsAll tests a list of DOM properties we want to check against.
|              *   We specify literally ALL possible (known and/or likely) properties on
|              *   the element including the non-vendor prefixed one, for forward-
|              *   compatibility.
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 848
|     Comment: 
|          // input features and input types go directly onto the ret object, bypassing the tests loop.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 177
|     Comment: 
|         /*>>hasevent*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7058
|     Comment: 
|         /* line 498, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7043
|     Comment: 
|         /* line 485, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7030
|     Comment: 
|         /* line 473, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7028
|     Comment: 
|         /* XX-Large Displays: 1920 and up */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7013
|     Comment: 
|         /* line 458, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7009
|     Comment: 
|         /* line 443, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7005
|     Comment: 
|         /* line 429, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 318
|     Comment: 
|          // test for empty object or array
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7001
|     Comment: 
|         /* line 415, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6997
|     Comment: 
|         /* line 401, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1376
|     Comment: 
|          // });
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1665
|     Comment: 
|          // Where will the tip be attached
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6981
|     Comment: 
|         /* line 386, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 34
|     Comment: 
|          // Embed FastClick (this should be removed later)
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 49
|     Comment: 
|         /*>>inputelem*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4047
|     Comment: 
|         /* We use this to get basic styling on all basic form elements */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6966
|     Comment: 
|         /* line 373, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6947
|     Comment: 
|         /* line 356, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6943
|     Comment: 
|         /* line 339, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 324
|     Comment: 
|          // We'll take advantage of this quick test and skip setting a style
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6939
|     Comment: 
|         /* line 323, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6935
|     Comment: 
|         /* line 307, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6931
|     Comment: 
|         /* line 291, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1664
|     Comment: 
|          // set when you would like the cookie to expire.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1383
|     Comment: 
|          //     },
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6915
|     Comment: 
|         /* line 274, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 556
|     Comment: 
|          //   of the string "url(" in the return value for elemStyle.background
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6898
|     Comment: 
|         /* line 261, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6280
|     Comment: 
|         /* line 302, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6006
|     Comment: 
|         /*
|          * Print styles.
|          *
|          * Inlined to avoid required HTTP connection: www.phpied.com/delay-loading-your-print-css/
|          * Credit to Paul Irish and HTML5 Boilerplate (html5boilerplate.com)
|         */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 301
|     Comment: 
|         /**
|              * is returns a boolean for if typeof obj is exactly type.
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6879
|     Comment: 
|         /* line 242, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3568
|     Comment: 
|         /* line 112, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6875
|     Comment: 
|         /* line 225, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6871
|     Comment: 
|         /* line 209, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6867
|     Comment: 
|         /* line 193, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6863
|     Comment: 
|         /* line 177, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6844
|     Comment: 
|         /* line 160, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6827
|     Comment: 
|         /* line 144, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7
|     Comment: 
|         /* line 22, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6808
|     Comment: 
|         /* line 126, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6804
|     Comment: 
|         /* line 112, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 109
|     Comment: 
|          // This also allows the method to scale for unspecified uses
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 233
|     Comment: 
|         /* footer */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6800
|     Comment: 
|         /* line 95, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6796
|     Comment: 
|         /* line 78, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6792
|     Comment: 
|         /* line 61, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_visibility.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 262
|     Comment: 
|          // methods that can be inherited in libraries
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6791
|     Comment: 
|         /* Specific visibility for tables */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7261
|     Comment: 
|         /*! normalize.css v2.1.2 | MIT License | git.io/normalize */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6750
|     Comment: 
|         /* line 358, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6747
|     Comment: 
|         /* line 357, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6744
|     Comment: 
|         /* line 354, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6741
|     Comment: 
|         /* line 353, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6723
|     Comment: 
|         /* line 345, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6716
|     Comment: 
|         /* line 341, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6712
|     Comment: 
|         /* line 244, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6691
|     Comment: 
|         /* line 334, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6684
|     Comment: 
|         /* line 214, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6674
|     Comment: 
|         /* line 204, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6669
|     Comment: 
|         /* line 328, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6660
|     Comment: 
|         /* line 326, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6652
|     Comment: 
|         /* line 325, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6647
|     Comment: 
|         /* line 313, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6637
|     Comment: 
|         /* line 293, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 732
|     Comment: 
|          // IE9 Running on Windows Server SKU can cause an exception to be thrown, bug #224
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6627
|     Comment: 
|         /* line 282, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 962
|     Comment: 
|         /**
|              * addTest allows the user to define their own feature tests
|              * the result will be added onto the Modernizr object,
|              * as well as an appropriate className set on the html element
|              *
|              * @param feature - String naming the feature
|              * @param test - Function returning true if feature is supported, false if not
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 133
|     Comment: 
|          // use rAF
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6622
|     Comment: 
|         /* line 190, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6618
|     Comment: 
|         /* line 186, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6614
|     Comment: 
|         /* line 182, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6591
|     Comment: 
|         /* line 275, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6574
|     Comment: 
|         /* line 273, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 857
|     Comment: 
|          // spec: www.whatwg.org/specs/web-apps/current-work/multipage/the-input-element.html#input-type-attr-summary
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6554
|     Comment: 
|         /* line 270, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5135
|     Comment: 
|         /* line 99, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 440
|     Comment: 
|         /* line 605, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4858
|     Comment: 
|         /* line 54, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_panels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6021
|     Comment: 
|         /* Black prints faster: h5bp.com/s */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6530
|     Comment: 
|         /* line 73, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1655
|     Comment: 
|          // the index of the tooltip you want to start on (index of the li)
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 117
|     Comment: 
|          // <style> elements in IE6-9 are considered 'NoScope' elements and therefore will be removed
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4998
|     Comment: 
|         /* line 138, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 155
|     Comment: 
|          // gist.github.com/786768
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 833
|     Comment: 
|          // SVG SMIL animation
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 178
|     Comment: 
|          //
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3639
|     Comment: 
|         /* line 75, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6523
|     Comment: 
|         /* line 581, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6519
|     Comment: 
|         /* line 573, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 302
|     Comment: 
|         /*
|          * Re-set default cursor for disabled elements.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5081
|     Comment: 
|         /* line 81, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_side-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 765
|     Comment: 
|          // set current and target to the clicked li if not otherwise defined.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6511
|     Comment: 
|         /* line 557, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6507
|     Comment: 
|         /* line 553, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6502
|     Comment: 
|         /* line 545, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6494
|     Comment: 
|         /* line 536, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1519
|     Comment: 
|          // this.nodes_loaded = false;
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6490
|     Comment: 
|         /* line 528, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6486
|     Comment: 
|         /* line 522, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6479
|     Comment: 
|         /* line 514, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1354
|     Comment: 
|          // Modernizr.testAllProps('boxSizing')
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 426
|     Comment: 
|         /* line 577, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 66
|     Comment: 
|         /* 2 */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6463
|     Comment: 
|         /* line 488, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6460
|     Comment: 
|         /* line 484, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3395
|     Comment: 
|         /* line 177, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6457
|     Comment: 
|         /* line 483, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6446
|     Comment: 
|         /* line 474, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6443
|     Comment: 
|         /* line 472, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6440
|     Comment: 
|         /* line 464, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6435
|     Comment: 
|         /* line 460, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6431
|     Comment: 
|         /* line 455, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 541
|     Comment: 
|          //   except IE9 who retains it as hsla
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1779
|     Comment: 
|          // Make sure that settings parsed from data_options are integers where necessary
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4259
|     Comment: 
|         /* Default styles for the container */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6428
|     Comment: 
|         /* line 449, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6425
|     Comment: 
|         /* line 447, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6420
|     Comment: 
|         /* line 442, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6414
|     Comment: 
|         /* line 438, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 555
|     Comment: 
|          // If the UA supports multiple backgrounds, there should be three occurrences
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 169
|     Comment: 
|         /*
|          * Sets consistent quote types.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6404
|     Comment: 
|         /* line 429, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5746
|     Comment: 
|         /* Default Link Styles */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 277
|     Comment: 
|          // parses data-options attribute
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6396
|     Comment: 
|         /* line 423, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6393
|     Comment: 
|         /* line 420, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2937
|     Comment: 
|         /* line 205, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6390
|     Comment: 
|         /* line 419, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6387
|     Comment: 
|         /* line 417, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6375
|     Comment: 
|         /* line 412, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 891
|     Comment: 
|          // If the value doesn't stick, we know there's input sanitization which infers a custom UI
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3553
|     Comment: 
|         /* line 58, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6361
|     Comment: 
|         /* line 396, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6356
|     Comment: 
|         /* line 388, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6353
|     Comment: 
|         /* line 387, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6350
|     Comment: 
|         /* line 382, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6346
|     Comment: 
|         /* line 379, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7319
|     Comment: 
|         /* use foundation sizes */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3382
|     Comment: 
|         /* line 164, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6335
|     Comment: 
|         /* line 368, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5881
|     Comment: 
|         /* Override nested font-size change */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 51
|     Comment: 
|         /*>>smile*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6332
|     Comment: 
|         /* line 361, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 906
|     Comment: 
|          // check the height to see if the widget is actually there.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6329
|     Comment: 
|         /* line 360, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4512
|     Comment: 
|         /* line 50, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6315
|     Comment: 
|         /* line 348, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 331
|     Comment: 
|          // we explicitly reject properties with dashes so that authors
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6312
|     Comment: 
|         /* line 344, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5189
|     Comment: 
|         /* line 150, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1275
|     Comment: 
|         /**
|                    * A flag to indicate that the document's `createElement` and `createDocumentFragment`
|                    * methods should be overwritten.
|                    * @memberOf html5
|                    * @type Boolean
|                    */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6309
|     Comment: 
|         /* line 341, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4714
|     Comment: 
|         /* line 270, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 726
|     Comment: 
|          //   It was also live in Safari 4.0.0 - 4.0.4, but fixed in 4.0.5
|     
|     Path: http://192.168.234.55:80/dashboard/docs/send-mail.html
|     Line number: 10
|     Comment: 
|         <!-- Use title if it's in the page YAML frontmatter -->
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6306
|     Comment: 
|         /* line 334, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 2570
|     Comment: 
|          // In large screens we may hit the bottom of the page and dont reach the top of the last magellan-destination, so lets force it
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 365
|     Comment: 
|         /* ==========================================================================
|            Tables
|            ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6298
|     Comment: 
|         /* line 324, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6295
|     Comment: 
|         /* line 316, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 322
|     Comment: 
|         /*
|          * 1. Addresses `appearance` set to `searchfield` in Safari 5 and Chrome.
|          * 2. Addresses `box-sizing` set to `border-box` in Safari 5 and Chrome
|          *    (include `-moz` to future-proof).
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6289
|     Comment: 
|         /* line 310, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6286
|     Comment: 
|         /* line 308, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3539
|     Comment: 
|         /* line 153, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6283
|     Comment: 
|         /* line 304, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6896
|     Comment: 
|         /* Large Displays: 1024px and up */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7256
|     Comment: 
|         /* reduce padding to allow more nav items */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3369
|     Comment: 
|         /* line 151, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6271
|     Comment: 
|         /* line 293, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 726
|     Comment: 
|         /* line 151, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6260
|     Comment: 
|         /* line 282, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6253
|     Comment: 
|         /* line 274, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6245
|     Comment: 
|         /* line 264, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6237
|     Comment: 
|         /* line 258, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 211
|     Comment: 
|          // If property was created, "remove it" (by setting value to `undefined`)
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6232
|     Comment: 
|         /* line 238, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1367
|     Comment: 
|          // The trigger argument, if called within the directive, fires
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6229
|     Comment: 
|         /* line 237, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6226
|     Comment: 
|         /* line 234, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6222
|     Comment: 
|         /* line 230, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6213
|     Comment: 
|         /* line 209, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 13
|     Comment: 
|          // Used to retrieve Foundation media queries from CSS.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7318
|     Comment: 
|         /* Tables */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6188
|     Comment: 
|         /* line 182, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6183
|     Comment: 
|         /* line 177, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1659
|     Comment: 
|          // array of expose elements
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6176
|     Comment: 
|         /* line 166, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 261
|     Comment: 
|         /*
|          * 1. Corrects font family not being inherited in all browsers.
|          * 2. Corrects font size not being inherited in all browsers.
|          * 3. Addresses margins set differently in Firefox 4+, Safari 5, and Chrome
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 2638
|     Comment: 
|          // Don't reinitialize plugin
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6166
|     Comment: 
|         /* line 157, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6162
|     Comment: 
|         /* line 152, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6156
|     Comment: 
|         /* line 141, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6150
|     Comment: 
|         /* line 139, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6146
|     Comment: 
|         /* line 137, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6143
|     Comment: 
|         /* line 134, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6139
|     Comment: 
|         /* line 129, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4138
|     Comment: 
|         /* Adjust margin for form elements below */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6131
|     Comment: 
|         /* line 120, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3446
|     Comment: 
|         /* line 142, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6126
|     Comment: 
|         /* line 113, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3360
|     Comment: 
|         /* line 143, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6121
|     Comment: 
|         /* line 107, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 863
|     Comment: 
|         /* line 161, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 234
|     Comment: 
|         /* line 323, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6108
|     Comment: 
|         /* line 94, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6104
|     Comment: 
|         /* line 90, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6100
|     Comment: 
|         /* line 86, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3051
|     Comment: 
|         /* line 222, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6091
|     Comment: 
|         /* line 442, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6087
|     Comment: 
|         /* line 441, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6083
|     Comment: 
|         /* line 440, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6079
|     Comment: 
|         /* line 439, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6074
|     Comment: 
|         /* line 437, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6067
|     Comment: 
|         /* line 431, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6060
|     Comment: 
|         /* line 425, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7272
|     Comment: 
|         /** Address `outline` inconsistency between Chrome and other browsers. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1368
|     Comment: 
|          // Modernizr.prefixed('boxSizing') // 'MozBoxSizing'
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1137
|     Comment: 
|          // * Attributes like `name` or `type` cannot be set/changed once an element
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6053
|     Comment: 
|         /* h5bp.com/t */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6050
|     Comment: 
|         /* line 420, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 320
|     Comment: 
|          //    `elem.style[styleName] !== undefined`
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 946
|     Comment: 
|          // run the test, throw the return value into the Modernizr,
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6044
|     Comment: 
|         /* line 415, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6038
|     Comment: 
|         /* line 412, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6034
|     Comment: 
|         /* line 407, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 221
|     Comment: 
|         /* line 307, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1305
|     Comment: 
|          // shiv the document
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 5461
|     Comment: 
|          // only replace once the replacement is loaded
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 95
|     Comment: 
|         /*
|            * jquery.requestAnimationFrame
|            * https://github.com/gnarf37/jquery-requestAnimationFrame
|            * Requires jQuery 1.8+
|            *
|            * Copyright (c) 2012 Corey Frang
|            * Licensed under the MIT license.
|            */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3441
|     Comment: 
|         /* line 135, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5603
|     Comment: 
|         /* Image Thumbnails */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5114
|     Comment: 
|         /* line 72, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6030
|     Comment: 
|         /* line 405, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6025
|     Comment: 
|         /* line 404, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6017
|     Comment: 
|         /* line 396, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1060
|     Comment: 
|          // we use jQuery animate instead of CSS transitions because we
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6012
|     Comment: 
|         /* line 394, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6003
|     Comment: 
|         /* line 383, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 508
|     Comment: 
|          // This used to be Modernizr.historymanagement but the longer
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5999
|     Comment: 
|         /* line 382, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5995
|     Comment: 
|         /* line 381, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5991
|     Comment: 
|         /* line 380, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1254
|     Comment: 
|          // No dropdown found, not continuing
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5987
|     Comment: 
|         /* line 379, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5978
|     Comment: 
|         /* line 368, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5975
|     Comment: 
|         /* line 366, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5970
|     Comment: 
|         /* line 359, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4645
|     Comment: 
|         /* line 191, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4244
|     Comment: 
|         /* line 37, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_inline-lists.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5192
|     Comment: 
|         /* line 151, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8781
|     Comment: 
|         /*text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5960
|     Comment: 
|         /* line 349, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3011
|     Comment: 
|         /* line 218, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4250
|     Comment: 
|         /* line 42, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_inline-lists.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3445
|     Comment: 
|         /* Foundation Dropdowns */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5953
|     Comment: 
|         /* line 343, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1136
|     Comment: 
|          // Avoid adding some elements to fragments in IE < 9 because
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5948
|     Comment: 
|         /* line 337, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7288
|     Comment: 
|         /** Correct overflow displayed oddly in IE 9. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1946
|     Comment: 
|          // skip non-existant targets
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5940
|     Comment: 
|         /* line 328, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5935
|     Comment: 
|         /* line 323, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1019
|     Comment: 
|         /** Used to skip problem elements */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 129
|     Comment: 
|         /*
|          * Addresses styling not present in Safari 5 and Chrome.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4555
|     Comment: 
|         /* line 84, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 524
|     Comment: 
|          // for more ESR info, see: mozilla.org/en-US/firefox/organizations/faq/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5921
|     Comment: 
|         /* line 311, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1296
|     Comment: 
|          //creates a shived documentFragment
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 58
|     Comment: 
|         /*
|             https://github.com/paulirish/matchMedia.js
|           */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 402
|     Comment: 
|          // The *new* flexbox
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3112
|     Comment: 
|         /* line 45, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7271
|     Comment: 
|         /** Remove the gray background color from active links in IE 10. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5912
|     Comment: 
|         /* line 302, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5905
|     Comment: 
|         /* line 293, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5902
|     Comment: 
|         /* line 289, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5897
|     Comment: 
|         /* line 285, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5893
|     Comment: 
|         /* line 284, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 456
|     Comment: 
|          // MM/DD/YYYY
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4446
|     Comment: 
|         /* line 87, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_labels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5889
|     Comment: 
|         /* line 283, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 372
|     Comment: 
|         /*>>testallprops*/
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1040
|     Comment: 
|          // directional methods
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5885
|     Comment: 
|         /* line 282, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5882
|     Comment: 
|         /* line 279, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5875
|     Comment: 
|         /* line 270, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 621
|     Comment: 
|         /**
|                  * For CSS Gradients syntax, please see:
|                  * webkit.org/blog/175/introducing-css-gradients/
|                  * developer.mozilla.org/en/CSS/-moz-linear-gradient
|                  * developer.mozilla.org/en/CSS/-moz-radial-gradient
|                  * dev.w3.org/csswg/css3-images/#gradients-
|                  */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5864
|     Comment: 
|         /* line 257, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5861
|     Comment: 
|         /* line 253, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5858
|     Comment: 
|         /* line 251, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5848
|     Comment: 
|         /* line 243, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5841
|     Comment: 
|         /* line 234, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 715
|     Comment: 
|          // testing what types of content they support.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 596
|     Comment: 
|          //  range of [0.0,1.0] - including the leading zero.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5836
|     Comment: 
|         /* line 229, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5830
|     Comment: 
|         /* line 224, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5824
|     Comment: 
|         /* line 218, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 286
|     Comment: 
|         /* social icons */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5815
|     Comment: 
|         /* line 208, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5811
|     Comment: 
|         /* line 204, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5807
|     Comment: 
|         /* line 203, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3411
|     Comment: 
|         /* line 196, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5803
|     Comment: 
|         /* line 202, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 487
|     Comment: 
|          // Chrome incognito mode used to throw an exception when using openDatabase
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5799
|     Comment: 
|         /* line 201, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5795
|     Comment: 
|         /* line 200, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5791
|     Comment: 
|         /* line 199, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4315
|     Comment: 
|         /* line 102, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 387
|     Comment: 
|         /* line 529, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5775
|     Comment: 
|         /* line 182, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4391
|     Comment: 
|         /* line 178, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1352
|     Comment: 
|          //   or any of its vendor-prefixed variants, is recognized
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5760
|     Comment: 
|         /* line 164, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5759
|     Comment: 
|         /* Default paragraph styles */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4781
|     Comment: 
|         /* line 341, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5752
|     Comment: 
|         /* line 158, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5747
|     Comment: 
|         /* line 152, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/applications.html
|     Line number: 46
|     Comment: 
|         <!-- @@BITNAMI_MODULE_PLACEHOLDER@@ -->
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4491
|     Comment: 
|         /* line 22, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_magellan.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3604
|     Comment: 
|         /* line 122, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5691
|     Comment: 
|         /* line 100, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5713
|     Comment: 
|         /* line 116, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5708
|     Comment: 
|         /* line 111, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5701
|     Comment: 
|         /* line 109, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5694
|     Comment: 
|         /* line 102, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5686
|     Comment: 
|         /* line 93, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5682
|     Comment: 
|         /* line 89, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7287
|     Comment: 
|         /** Remove border when inside `a` element in IE 8/9. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5635
|     Comment: 
|         /* line 39, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5629
|     Comment: 
|         /* line 32, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tooltips.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5623
|     Comment: 
|         /* line 68, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_thumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5618
|     Comment: 
|         /* line 66, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_thumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5614
|     Comment: 
|         /* line 49, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_thumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5598
|     Comment: 
|         /* line 87, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4503
|     Comment: 
|         /* line 46, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4048
|     Comment: 
|         /* line 396, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5587
|     Comment: 
|         /* line 75, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 131
|     Comment: 
|          //Safari 5.13/5.1.4 OSX stops loading if ::-webkit-scrollbar is used and scrollbars are visible
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5584
|     Comment: 
|         /* line 73, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5581
|     Comment: 
|         /* line 71, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3596
|     Comment: 
|         /* line 103, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5573
|     Comment: 
|         /* line 66, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 529
|     Comment: 
|         /* line 317, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 521
|     Comment: 
|          // FF3.6 was EOL'ed on 4/24/12, but the ESR version of FF10
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5555
|     Comment: 
|         /* line 54, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 356
|     Comment: 
|          // return the property name as a string
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 849
|     Comment: 
|          // Hold this guy to execute in a moment.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 738
|     Comment: 
|          // Without QuickTime, this value will be `undefined`. github.com/Modernizr/Modernizr/issues/546
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3154
|     Comment: 
|          // .off('.reveal')
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5539
|     Comment: 
|         /* line 47, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 988
|     Comment: 
|          // image loading and preloading
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 756
|     Comment: 
|          // if clearing is open and the current image is
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5536
|     Comment: 
|         /* line 43, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2438
|     Comment: 
|         /* line 35, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_block-grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7303
|     Comment: 
|         /** 1. Remove default vertical scrollbar in IE 8/9. 2. Improve readability and alignment in all browsers. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5516
|     Comment: 
|         /* line 26, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 48
|     Comment: 
|         /* line 73, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1369
|     Comment: 
|          // any parameters along to the event that you pass to trigger.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5496
|     Comment: 
|         /* line 83, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5493
|     Comment: 
|         /* line 76, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5487
|     Comment: 
|         /* line 68, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5478
|     Comment: 
|         /* line 57, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3923
|     Comment: 
|          // Remove the fixed to allow for correct calculation of the offset.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5473
|     Comment: 
|         /* line 51, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 902
|     Comment: 
|          // Safari 2-4 allows the smiley as a value, despite making a slider
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4508
|     Comment: 
|         /* line 49, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 241
|     Comment: 
|         /*
|          * Define consistent border, margin, and padding.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7264
|     Comment: 
|         /** Correct `inline-block` display not defined in IE 8/9. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5455
|     Comment: 
|         /* line 307, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5451
|     Comment: 
|         /* line 306, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5447
|     Comment: 
|         /* line 305, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5443
|     Comment: 
|         /* line 301, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5439
|     Comment: 
|         /* line 300, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5423
|     Comment: 
|         /* line 297, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5407
|     Comment: 
|         /* line 294, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 153
|     Comment: 
|          // adapted from matchMedia polyfill
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5391
|     Comment: 
|         /* line 291, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5388
|     Comment: 
|         /* line 242, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5382
|     Comment: 
|         /* line 232, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5373
|     Comment: 
|         /* line 208, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5369
|     Comment: 
|         /* line 183, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5365
|     Comment: 
|         /* line 177, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5360
|     Comment: 
|         /* line 169, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4155
|     Comment: 
|         /* Normalize file input width */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 453
|     Comment: 
|          // HH:MM:SS
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5355
|     Comment: 
|         /* line 150, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5352
|     Comment: 
|         /* line 138, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5347
|     Comment: 
|         /* line 135, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 722
|     Comment: 
|          //                     thx to NielsLeenheer and zcorpan
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5341
|     Comment: 
|         /* line 133, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 410
|     Comment: 
|          // www.w3.org/TR/2009/WD-css3-flexbox-20090723/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5337
|     Comment: 
|         /* line 129, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5333
|     Comment: 
|         /* line 127, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5329
|     Comment: 
|         /* line 123, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5326
|     Comment: 
|         /* line 122, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3891
|     Comment: 
|         /* line 339, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4526
|     Comment: 
|         /* line 58, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5323
|     Comment: 
|         /* line 119, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5310
|     Comment: 
|         /* line 104, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5230
|     Comment: 
|         /* line 63, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_sub-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5307
|     Comment: 
|         /* line 98, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3320
|     Comment: 
|         /* line 110, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3549
|     Comment: 
|         /* line 118, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4596
|     Comment: 
|         /* line 128, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5299
|     Comment: 
|         /* line 88, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3822
|     Comment: 
|         /* line 97, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5285
|     Comment: 
|         /* line 71, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5273
|     Comment: 
|         /* line 287, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_switch.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5267
|     Comment: 
|         /* line 94, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_sub-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5256
|     Comment: 
|         /* line 87, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_sub-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5097
|     Comment: 
|         /* line 63, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_side-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5251
|     Comment: 
|         /* line 82, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_sub-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5245
|     Comment: 
|         /* line 79, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_sub-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 712
|     Comment: 
|          // comma delimited list of selectors that, on click, will close clearing,
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1222
|     Comment: 
|          // corrects block display not defined in IE6/7/8/9
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 332
|     Comment: 
|          // developing in WebKit or IE first don't end up with
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5233
|     Comment: 
|         /* line 69, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_sub-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 137
|     Comment: 
|         /*
|          * Addresses styling not present in IE 8/9.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1072
|     Comment: 
|          // do we scroll right or not
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5221
|     Comment: 
|         /* line 116, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_sub-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5212
|     Comment: 
|         /* line 183, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5204
|     Comment: 
|         /* line 182, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 209
|     Comment: 
|         /*
|          * Removes border when inside `a` element in IE 8/9.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 443
|     Comment: 
|          // http://www.whatwg.org/specs/web-apps/current-work/multipage/states-of-the-type-attribute.html#valid-e-mail-address
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4633
|     Comment: 
|         /* line 178, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 878
|     Comment: 
|          //   true/false like all the other tests; instead, it returns an object
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5186
|     Comment: 
|         /* line 177, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 226
|     Comment: 
|         /* line 313, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3334
|     Comment: 
|         /* line 120, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5177
|     Comment: 
|         /* line 122, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5174
|     Comment: 
|         /* line 176, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2919
|     Comment: 
|         /*     @else                            { font-size: $padding - rem-calc(2); } */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 329
|     Comment: 
|          // opposed to the camelCase DOM properties) is non-portable and
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5168
|     Comment: 
|         /* line 109, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4680
|     Comment: 
|         /* line 239, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5165
|     Comment: 
|         /* line 108, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3642
|     Comment: 
|         /* line 78, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 601
|     Comment: 
|          //   German Chrome returns this value as 0,55
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 74
|     Comment: 
|         /* line 116, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 290
|     Comment: 
|         /* line 392, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 346
|     Comment: 
|         /* line 464, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 1
|     Comment: 
|         /* global */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1146
|     Comment: 
|         /**
|                  * returns a shived DocumentFragment for the given document
|                  * @memberOf html5
|                  * @param {Document} ownerDocument The context document.
|                  * @returns {Object} The shived DocumentFragment.
|                  */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5089
|     Comment: 
|         /* line 54, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_side-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5132
|     Comment: 
|         /* line 93, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 1316
|     Comment: 
|         /* line 219, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 999
|     Comment: 
|          // allow chaining.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1651
|     Comment: 
|          // Page scrolling speed in milliseconds, 0 = no scroll animation
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 7
|     Comment: 
|         /*
|          * Corrects `block` display not defined in IE 8/9.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5102
|     Comment: 
|         /* line 69, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_side-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4422
|     Comment: 
|         /* line 207, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 757
|     Comment: 
|          // clicked, go to the next image in sequence
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3934
|     Comment: 
|         /* line 349, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5093
|     Comment: 
|         /* line 58, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_side-nav.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6526
|     Comment: 
|         /* line 67, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 125
|     Comment: 
|          // Opera will act all quirky when injecting elements in documentElement when page is served as xml, needs fakebody too. #270
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3622
|     Comment: 
|         /* line 34, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_flex-video.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5078
|     Comment: 
|         /* line 162, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 530
|     Comment: 
|          // css-tricks.com/rgba-browser-support/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2344
|     Comment: 
|         /* line 29, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_accordion.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 185
|     Comment: 
|         /*
|          * Prevents `sub` and `sup` affecting `line-height` in all browsers.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3119
|     Comment: 
|         /* line 63, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5073
|     Comment: 
|         /* line 156, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 881
|     Comment: 
|          // Big thanks to @miketaylr for the html5 forms expertise. miketaylr.com/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5069
|     Comment: 
|         /* line 155, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7263
|     Comment: 
|         /** Correct `block` display not defined in IE 8/9. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1
|     Comment: 
|         /*!
|          * Modernizr v2.7.1
|          * www.modernizr.com
|          *
|          * Copyright (c) Faruk Ates, Paul Irish, Alex Sexton
|          * Available under the BSD and MIT licenses: www.modernizr.com/license/
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1314
|     Comment: 
|          // expose these for the plugin API. Look in the source for how to join() them against your input
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 96
|     Comment: 
|         /*>>teststyles*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3388
|     Comment: 
|         /* line 170, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5061
|     Comment: 
|         /* line 153, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5057
|     Comment: 
|         /* line 152, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5053
|     Comment: 
|         /* line 149, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 431
|     Comment: 
|          // We do a soft detect which may false positive in order to avoid
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7268
|     Comment: 
|         /** 1. Set default font family to sans-serif. 2. Prevent iOS text size adjust after orientation change, without disabling user zoom. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5038
|     Comment: 
|         /* line 75, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4901
|     Comment: 
|         /* line 135, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pricing-tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 5509
|     Comment: 
|         
|         // Retina detection
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5035
|     Comment: 
|         /* line 74, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5026
|     Comment: 
|         /* line 71, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5010
|     Comment: 
|         /* line 140, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_reveal.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 11
|     Comment: 
|         /* line 26, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 333
|     Comment: 
|          // browser-specific content by accident.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 5449
|     Comment: 
|          // tweet it form
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7898
|     Comment: 
|         /* line 301, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 107
|     Comment: 
|          // fixes from Paul Irish and Tino Zijdel
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 549
|     Comment: 
|          // Setting multiple images AND a color on the background shorthand property
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3887
|     Comment: 
|         /* line 338, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 44
|     Comment: 
|          // returns jQuery object. Only use where
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 786
|     Comment: 
|          //   www.quirksmode.org/dom/html5.html
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4961
|     Comment: 
|         /* line 57, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_progress-bars.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1196
|     Comment: 
|          // unroll the `createElement` calls
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3236
|     Comment: 
|         /* line 94, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3467
|     Comment: 
|         /* line 80, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4319
|     Comment: 
|         /* Typography */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4953
|     Comment: 
|         /* Progress Bar */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4947
|     Comment: 
|         /* line 142, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pricing-tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4938
|     Comment: 
|         /* line 141, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pricing-tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3377
|     Comment: 
|         /* line 160, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4928
|     Comment: 
|         /* line 140, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pricing-tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7278
|     Comment: 
|         /** Address styling not present in Safari 5 and Chrome. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3952
|     Comment: 
|          // Pull element out of the DOM for manipulation
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 957
|     Comment: 
|          // input tests need to run.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4910
|     Comment: 
|         /* line 138, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pricing-tables.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4692
|     Comment: 
|         /* line 250, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4895
|     Comment: 
|         /* line 79, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_panels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4892
|     Comment: 
|         /* line 74, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_panels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 851
|     Comment: 
|         /*>>input*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4868
|     Comment: 
|         /* line 72, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_panels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4865
|     Comment: 
|         /* line 60, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_panels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3536
|     Comment: 
|         /* line 152, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4861
|     Comment: 
|         /* line 58, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_panels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2
|     Comment: 
|         /* line 14, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6535
|     Comment: 
|         /* line 79, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1360
|     Comment: 
|          // Modernizr.testStyles() allows you to add custom styles to the document and test an element afterwards
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1768
|     Comment: 
|          // can we create cookies?
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 839
|     Comment: 
|          // demo: srufaculty.sru.edu/david.dailey/svg/newstuff/clipPath4.svg
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 8239
|     Comment: 
|         /* line 400, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/asciidoctor.css */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4852
|     Comment: 
|         /* line 48, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_panels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4844
|     Comment: 
|         /* line 70, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_panels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4273
|     Comment: 
|         /* line 60, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1082
|     Comment: 
|         /**
|                  * Returns the value of `html5.elements` as an array.
|                  * @private
|                  * @returns {Array} An array of shived element node names.
|                  */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4835
|     Comment: 
|         /* line 137, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 856
|     Comment: 
|          //   miketaylr.com/code/input-type-attr.html
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 804
|     Comment: 
|          // Ignore pinch/zoom events
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3461
|     Comment: 
|         /* line 54, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 334
|     Comment: 
|         /* line 451, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3608
|     Comment: 
|         /* line 45, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_flex-video.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4602
|     Comment: 
|         /* line 134, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1061
|     Comment: 
|          // need a callback to unlock the next animation
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4829
|     Comment: 
|         /* line 119, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4826
|     Comment: 
|         /* line 67, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4820
|     Comment: 
|         /* line 60, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4817
|     Comment: 
|         /* line 52, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4813
|     Comment: 
|         /* line 47, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 609
|     Comment: 
|          //   daneden.me/2011/12/putting-up-with-androids-bullshit/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4809
|     Comment: 
|         /* line 109, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4802
|     Comment: 
|         /* line 101, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4796
|     Comment: 
|         /* line 95, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4791
|     Comment: 
|         /* line 132, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_pagination.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4785
|     Comment: 
|         /* line 348, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 294
|     Comment: 
|         /**
|              * setCssAll extrapolates all vendor-specific css strings.
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 116
|     Comment: 
|         /* line 165, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1375
|     Comment: 
|          // If you're trying to ascertain which transition end event to bind to, you might do something like...
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5755
|     Comment: 
|         /* line 160, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 564
|     Comment: 
|          //   github.com/Modernizr/Modernizr/issues/396
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3355
|     Comment: 
|         /* line 140, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4778
|     Comment: 
|         /* line 340, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 595
|     Comment: 
|          //  according to spec, which means their return values are within the
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4774
|     Comment: 
|         /* line 333, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1336
|     Comment: 
|          // Modernizr.hasEvent() detects support for a given event, with an optional element to test on
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4770
|     Comment: 
|         /* line 330, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4765
|     Comment: 
|         /* line 321, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4761
|     Comment: 
|         /* line 318, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4757
|     Comment: 
|         /* line 311, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4754
|     Comment: 
|         /* line 307, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4744
|     Comment: 
|         /* line 298, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4735
|     Comment: 
|         /* line 289, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4731
|     Comment: 
|         /* line 288, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 919
|     Comment: 
|          // Real url and email support comes with prebaked validation.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4727
|     Comment: 
|         /* line 282, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1028
|     Comment: 
|         /** Name of the expando, to work with multiple documents or to re-shiv one document */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4720
|     Comment: 
|         /* line 275, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4717
|     Comment: 
|         /* line 274, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1366
|     Comment: 
|         /*>>prefixed*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7305
|     Comment: 
|         /** Remove most spacing between table cells. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 724
|     Comment: 
|          // Note: in some older browsers, "no" was a return value instead of empty string.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4709
|     Comment: 
|         /* line 265, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4706
|     Comment: 
|         /* line 264, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4696
|     Comment: 
|         /* line 254, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 865
|     Comment: 
|          // toggle the gallery
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3372
|     Comment: 
|         /* line 153, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4677
|     Comment: 
|         /* line 235, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 127
|     Comment: 
|         /* line 177, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4674
|     Comment: 
|         /* line 226, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4665
|     Comment: 
|         /* line 218, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4654
|     Comment: 
|         /* line 204, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4637
|     Comment: 
|         /* line 184, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6370
|     Comment: 
|         /* line 407, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5785
|     Comment: 
|         /* line 192, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4236
|     Comment: 
|         /* line 48, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_inline-lists.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4615
|     Comment: 
|         /* line 156, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2399
|     Comment: 
|         /* line 110, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7294
|     Comment: 
|         /** 1. Correct font family not being inherited in all browsers. 2. Correct font size not being inherited in all browsers. 3. Address margins set differently in Firefox 4+, Safari 5, and Chrome. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1224
|     Comment: 
|          // adds styling not present in IE6/7/8/9
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4521
|     Comment: 
|         /* line 54, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 45
|     Comment: 
|          // getElementById is not available.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 826
|     Comment: 
|          // test page: paulirish.com/demo/inline-svg
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3108
|     Comment: 
|         /* line 35, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3978
|     Comment: 
|         /* Separate prefix and postfix styles when on span or label so buttons keep their own */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 409
|     Comment: 
|          // The *old* flexbox
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 198
|     Comment: 
|          // set foundation global scope
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 511
|     Comment: 
|          // and in the first release thereafter disappear entirely.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4606
|     Comment: 
|         /* line 136, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4559
|     Comment: 
|         /* line 90, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1373
|     Comment: 
|          //     str.replace(/([A-Z])/g, function(str,m1){ return '-' + m1.toLowerCase(); }).replace(/^ms-/,'-ms-');
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 494
|     Comment: 
|         /* line 680, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 905
|     Comment: 
|          // Mobile android web browser has false positive, so must
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4549
|     Comment: 
|         /* line 79, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4546
|     Comment: 
|         /* line 76, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4542
|     Comment: 
|         /* line 73, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4538
|     Comment: 
|         /* line 66, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4535
|     Comment: 
|         /* line 63, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4530
|     Comment: 
|         /* line 59, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4022
|     Comment: 
|         /* line 368, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4517
|     Comment: 
|         /* line 53, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1375
|     Comment: 
|          //   console.log($(this).html(), a, b, c);
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4232
|     Comment: 
|         /* line 470, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3407
|     Comment: 
|         /* line 190, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4347
|     Comment: 
|         /* line 132, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 154
|     Comment: 
|          // by Scott Jehl and Paul Irish
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6473
|     Comment: 
|         /* line 507, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1660
|     Comment: 
|          // when tipAnimation = 'fade' this is speed in milliseconds for the transition
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4494
|     Comment: 
|         /* line 23, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_magellan.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1109
|     Comment: 
|         /**
|                  * returns a shived element for the given nodeName and document
|                  * @memberOf html5
|                  * @param {String} nodeName name of the element
|                  * @param {Document} ownerDocument The context document.
|                  * @returns {Object} The shived element.
|                  */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5722
|     Comment: 
|         /* line 145, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 942
|     Comment: 
|          // Run through all tests and detect their support in the current UA.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4312
|     Comment: 
|         /* line 101, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 852
|     Comment: 
|         /* line 157, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 5480
|     Comment: 
|          // FAQ accordions
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2414
|     Comment: 
|         /* line 113, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4482
|     Comment: 
|         /* line 14, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_magellan.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4477
|     Comment: 
|         /* line 97, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_labels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4473
|     Comment: 
|         /* line 96, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_labels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4612
|     Comment: 
|         /* line 147, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3966
|     Comment: 
|          // Copy link to subnav
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1662
|     Comment: 
|          // Name the cookie you'll use
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 997
|     Comment: 
|         /* line 175, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1657
|     Comment: 
|          // 'pop' or 'fade' in each tip
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4469
|     Comment: 
|         /* line 95, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_labels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4465
|     Comment: 
|         /* line 93, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_labels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4461
|     Comment: 
|         /* line 92, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_labels.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 150
|     Comment: 
|         /* line 208, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5934
|     Comment: 
|         /* Blockquotes */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 890
|     Comment: 
|          // If the type does, we feed it a textual value, which shouldn't be valid.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4413
|     Comment: 
|         /* line 199, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4406
|     Comment: 
|         /* line 192, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 70
|     Comment: 
|          // Microsoft uses a lowercase `ms` instead of the correct `Ms` in IE8+
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4402
|     Comment: 
|         /* line 190, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 184
|     Comment: 
|         /* line 258, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4400
|     Comment: 
|         /* Styles for screens that are atleast 768px; */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5768
|     Comment: 
|         /* line 174, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_type.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4381
|     Comment: 
|         /* line 166, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4368
|     Comment: 
|         /* line 153, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 761
|     Comment: 
|          //   bit.ly/iphoneoscodecs
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1031
|     Comment: 
|         /** The id for the the documents expando */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 315
|     Comment: 
|         /*>>testprop*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4364
|     Comment: 
|         /* line 150, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4354
|     Comment: 
|         /* line 139, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 322
|     Comment: 
|          // if unsupported it will return undefined.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4338
|     Comment: 
|         /* line 124, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 532
|     Comment: 
|          // Set an rgba() color and check the returned value
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4488
|     Comment: 
|         /* line 20, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_magellan.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 326
|     Comment: 
|          // empty string.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4332
|     Comment: 
|         /* line 118, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4320
|     Comment: 
|         /* line 112, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3493
|     Comment: 
|         /* line 95, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 25
|     Comment: 
|         /* Locale selector */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 416
|     Comment: 
|          // On the S60 and BB Storm, getContext exists, but always returns undefined
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3427
|     Comment: 
|         /* line 216, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4304
|     Comment: 
|         /* line 92, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4296
|     Comment: 
|         /* line 84, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 875
|     Comment: 
|         /*>>inputtypes*/
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 470
|     Comment: 
|          // Using !!navigator.geolocation does two things we don't want. It:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4288
|     Comment: 
|         /* line 76, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1377
|     Comment: 
|          //     var transEndEventNames = {
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4283
|     Comment: 
|         /* line 71, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4279
|     Comment: 
|         /* line 66, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1518
|     Comment: 
|          // Set nodes_loaded to true if there are no nodes
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 984
|     Comment: 
|          //   var re = new RegExp("\\b(no-)?" + feature + "\\b");
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4260
|     Comment: 
|         /* line 47, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_joyride.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4227
|     Comment: 
|         /* line 467, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7187
|     Comment: 
|         /* Touch-enabled device targeting */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2425
|     Comment: 
|         /* line 69, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_block-grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4211
|     Comment: 
|         /* line 457, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4207
|     Comment: 
|         /* line 452, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4202
|     Comment: 
|         /* line 447, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3175
|     Comment: 
|          // 27 is the keycode for the Escape key
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4190
|     Comment: 
|         /* line 441, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4186
|     Comment: 
|         /* line 439, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4175
|     Comment: 
|         /* line 436, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4174
|     Comment: 
|         /* Error Handling */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 64
|     Comment: 
|          // Following spec is to expose vendor-specific style properties as:
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 9
|     Comment: 
|         /*
|          * Modernizr tests which native CSS3 and HTML5 features are available in
|          * the current UA and makes the results available to you in two ways:
|          * as properties on a global Modernizr object, and as classes on the
|          * <html> element. This information allows you to progressively enhance
|          * your pages with a granular level of control over the experience.
|          *
|          * Modernizr has an optional (not included) conditional resource loader
|          * called Modernizr.load(), based on Yepnope.js (yepnopejs.com).
|          * To get a build that includes Modernizr.load(), as well as choosing
|          * which tests to include, go to www.modernizr.com/download/
|          *
|          * Authors        Faruk Ates, Paul Irish, Alex Sexton
|          * Contributors   Ryan Seddon, Ben Alman
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4166
|     Comment: 
|         /* line 247, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 683
|     Comment: 
|          // false positives:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4146
|     Comment: 
|         /* line 415, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4139
|     Comment: 
|         /* line 410, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4121
|     Comment: 
|         /* line 130, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 109
|     Comment: 
|          // http://my.opera.com/emoller/blog/2011/12/20/requestanimationframe-for-smart-er-animating
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4103
|     Comment: 
|         /* line 123, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4084
|     Comment: 
|         /* line 182, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5592
|     Comment: 
|         /* line 80, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4038
|     Comment: 
|         /* line 376, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4030
|     Comment: 
|         /* line 373, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4014
|     Comment: 
|         /* line 365, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3996
|     Comment: 
|         /* line 358, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3985
|     Comment: 
|         /* line 356, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 198
|     Comment: 
|         /* line 277, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7285
|     Comment: 
|         /** Prevent `sub` and `sup` affecting `line-height` in all browsers. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 121
|     Comment: 
|          // Documents served as xml will throw if using &shy; so use xml friendly encoded version. See issue #277
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3945
|     Comment: 
|         /* line 350, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3924
|     Comment: 
|         /* line 347, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3914
|     Comment: 
|         /* line 346, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2364
|     Comment: 
|         /* line 102, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3913
|     Comment: 
|         /* Adjust padding, alignment and radius if pre/post element is a button */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 641
|     Comment: 
|         /* line 190, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3895
|     Comment: 
|         /* Attach elements to the beginning or end of an input */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3879
|     Comment: 
|         /* line 328, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3875
|     Comment: 
|         /* line 327, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 185
|     Comment: 
|          //   ...
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3864
|     Comment: 
|         /* line 316, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3859
|     Comment: 
|         /* line 310, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3851
|     Comment: 
|         /* line 307, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1067
|     Comment: 
|         /**
|                  * Creates a style sheet with the given CSS text and adds it to the document.
|                  * @private
|                  * @param {Document} ownerDocument The document.
|                  * @param {String} cssText The CSS text.
|                  * @returns {StyleSheet} The style element.
|                  */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3850
|     Comment: 
|         /* Styles for required inputs */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 471
|     Comment: 
|          //   1. Leaks memory in IE9: github.com/Modernizr/Modernizr/issues/513
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3816
|     Comment: 
|         /* line 85, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 304
|     Comment: 
|         /* line 406, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 343
|     Comment: 
|         /* line 461, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 982
|     Comment: 
|          // we're going to quit if you're trying to overwrite an existing test
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 311
|     Comment: 
|         /*
|          * 1. Addresses box sizing set to `content-box` in IE 8/9.
|          * 2. Removes excess padding in IE 8/9.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4590
|     Comment: 
|         /* line 122, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3619
|     Comment: 
|         /* line 29, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_flex-video.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5721
|     Comment: 
|         /* Typography resets */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5578
|     Comment: 
|         /* line 70, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1328
|     Comment: 
|          //   * You must specify values. Eg. If you are testing support for the min-width media query use:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3593
|     Comment: 
|         /* line 121, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3585
|     Comment: 
|         /* line 83, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3582
|     Comment: 
|         /* line 120, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1261
|     Comment: 
|         /**
|                    * A flag to indicate that the HTML5 style sheet should be inserted.
|                    * @memberOf html5
|                    * @type Boolean
|                    */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3244
|     Comment: 
|         /* Clearing Styles */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3574
|     Comment: 
|         /* line 73, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3571
|     Comment: 
|         /* line 119, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 403
|     Comment: 
|          // dev.w3.org/csswg/css3-flexbox
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 286
|     Comment: 
|         /*
|          * 1. Avoid the WebKit bug in Android 4.0.* where (2) destroys native `audio`
|          *    and `video` controls.
|          * 2. Corrects inability to style clickable `input` types in iOS.
|          * 3. Improves usability and consistency of cursor style between image-type
|          *    `input` and others.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3545
|     Comment: 
|         /* line 155, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3542
|     Comment: 
|         /* line 154, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3515
|     Comment: 
|         /* line 149, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3510
|     Comment: 
|         /* line 124, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 451
|     Comment: 
|          // YYYY-MM-DD
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 436
|     Comment: 
|          // generic password: upper-case, lower-case, number/special character, and min 8 characters
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 97
|     Comment: 
|          // Inject element with style element and some CSS rules
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 386
|     Comment: 
|         /* team images */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3501
|     Comment: 
|         /* line 146, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3497
|     Comment: 
|         /* line 99, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3480
|     Comment: 
|         /* line 87, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6825
|     Comment: 
|         /* Medium Displays: 641px and up */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3464
|     Comment: 
|         /* line 55, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3263
|     Comment: 
|         /* line 52, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1373
|     Comment: 
|          // This allows you to bind a callback like so:
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 58
|     Comment: 
|         /*>>prefixes*/
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3273
|     Comment: 
|          // is modal
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3433
|     Comment: 
|         /* line 223, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 118
|     Comment: 
|          // when injected with innerHTML. To get around this you need to prepend the 'NoScope' element
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4624
|     Comment: 
|         /* line 173, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_orbit.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 672
|     Comment: 
|          // fade out speed
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3424
|     Comment: 
|         /* line 211, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3507
|     Comment: 
|         /* line 122, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_dropdown.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3421
|     Comment: 
|         /* line 210, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1344
|     Comment: 
|          // Modernizr.testProp('pointerEvents')
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3363
|     Comment: 
|         /* line 145, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 136
|     Comment: 
|         /* line 192, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3346
|     Comment: 
|         /* line 133, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3331
|     Comment: 
|         /* line 118, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3327
|     Comment: 
|         /* line 114, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3288
|     Comment: 
|         /* line 76, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3276
|     Comment: 
|         /* line 64, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_clearing.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 627
|     Comment: 
|         /* line 374, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7277
|     Comment: 
|         /** Address style set to `bolder` in Firefox 4+, Safari 5, and Chrome. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 225
|     Comment: 
|         /* ==========================================================================
|            Figures
|            ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1208
|     Comment: 
|         /**
|                  * Shivs the given document.
|                  * @memberOf html5
|                  * @param {Document} ownerDocument The document to shiv.
|                  * @returns {Document} The shived document.
|                  */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3320
|     Comment: 
|          // should we animate the background?
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3240
|     Comment: 
|         /* line 28, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3634
|     Comment: 
|         /* line 300, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3226
|     Comment: 
|         /* line 92, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4834
|     Comment: 
|         /* Pagination centred wrapper */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 720
|     Comment: 
|         /* line 148, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 718
|     Comment: 
|          // e.g.  Modernizr.video     // true
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3162
|     Comment: 
|         /* line 73, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2388
|     Comment: 
|         /* line 87, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1142
|     Comment: 
|          //   or `text` property is set
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3127
|     Comment: 
|         /* line 67, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_button-groups.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 317
|     Comment: 
|          // testProps is a generic CSS / DOM property test.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 110
|     Comment: 
|         /* line 160, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 588
|     Comment: 
|         /* line 359, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1186
|     Comment: 
|          //abort shiv
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3089
|     Comment: 
|         /* line 228, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 510
|     Comment: 
|          // The old API is still available in 1.6, but as of 2.0 will throw a warning,
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3069
|     Comment: 
|         /* line 223, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6099
|     Comment: 
|         /* Wrapped around .top-bar to contain to grid width */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3033
|     Comment: 
|         /* line 221, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3030
|     Comment: 
|         /* line 166, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3015
|     Comment: 
|         /* line 220, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5959
|     Comment: 
|         /* Microformats */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5147
|     Comment: 
|         /* line 162, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3007
|     Comment: 
|         /* line 217, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 877
|     Comment: 
|          //   This is put behind the tests runloop because it doesn't return a
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3003
|     Comment: 
|         /* line 215, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2999
|     Comment: 
|         /* line 214, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2994
|     Comment: 
|         /* line 212, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2986
|     Comment: 
|         /* line 211, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2978
|     Comment: 
|         /* line 210, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 20
|     Comment: 
|         /* line 37, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2970
|     Comment: 
|         /* line 209, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2959
|     Comment: 
|         /* line 207, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2948
|     Comment: 
|         /* line 206, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 825
|     Comment: 
|          // specifically for SVG inline in HTML, not within XHTML
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 523
|     Comment: 
|          // FF10 still uses prefixes, so check for it until then.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2945
|     Comment: 
|         /* line 148, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2934
|     Comment: 
|         /* line 153, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2931
|     Comment: 
|         /* line 142, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2903
|     Comment: 
|         /* line 197, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2898
|     Comment: 
|         /* line 106, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 58
|     Comment: 
|         /*
|          * 1. Sets default font family to sans-serif.
|          * 2. Prevents iOS text size adjust after orientation change, without disabling
|          *    user zoom.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 1310
|     Comment: 
|         /* line 216, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2885
|     Comment: 
|         /* line 91, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2882
|     Comment: 
|         /* line 86, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2879
|     Comment: 
|         /* line 84, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2876
|     Comment: 
|         /* line 80, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2872
|     Comment: 
|         /* line 74, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 783
|     Comment: 
|          // Because we are forced to try/catch this, we'll go aggressive.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2863
|     Comment: 
|         /* line 65, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 474
|     Comment: 
|          // Meanwhile, in Firefox < 8, an about:config setting could expose
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5180
|     Comment: 
|         /* line 123, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 719
|     Comment: 
|          //       Modernizr.video.ogg // 'probably'
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 634
|     Comment: 
|          // legacy webkit syntax (FIXME: remove when syntax not in use anymore)
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 122
|     Comment: 
|         /* line 172, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2854
|     Comment: 
|         /* line 118, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 913
|     Comment: 
|          //   behaviors so we pass these through as true
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7302
|     Comment: 
|         /** Remove inner padding and border in Firefox 4+. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1302
|     Comment: 
|          // expose html5
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2453
|     Comment: 
|         /* line 49, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_block-grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2450
|     Comment: 
|         /* line 48, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_block-grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 33
|     Comment: 
|          // option for enabling the HTML classes to be added
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2446
|     Comment: 
|         /* line 44, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_block-grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3967
|     Comment: 
|         /* line 352, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5533
|     Comment: 
|         /* line 41, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 623
|     Comment: 
|         /* line 371, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2419
|     Comment: 
|         /* line 114, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 716
|     Comment: 
|          // event initializers and locks
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2409
|     Comment: 
|         /* line 112, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2404
|     Comment: 
|         /* line 111, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7281
|     Comment: 
|         /** Correct font family set oddly in Safari 5 and Chrome. */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 986
|     Comment: 
|         /* line 172, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2395
|     Comment: 
|         /* line 108, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2391
|     Comment: 
|         /* line 107, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2377
|     Comment: 
|         /* line 105, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_alert-boxes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 537
|     Comment: 
|         /* line 322, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 102
|     Comment: 
|         /* line 152, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5122
|     Comment: 
|         /* line 81, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 853
|     Comment: 
|          // We're using f which is the <input> element created early on
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 820
|     Comment: 
|          // Thanks to Erik Dahlstrom
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 241
|     Comment: 
|         /* line 332, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 1007
|     Comment: 
|         /* line 182, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 982
|     Comment: 
|         /* line 169, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4431
|     Comment: 
|         /* line 52, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_keystrokes.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 978
|     Comment: 
|         /* line 168, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 714
|     Comment: 
|          // These tests evaluate support of the video/audio elements, as well as
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 923
|     Comment: 
|         /* line 165, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 321
|     Comment: 
|          // If the property is supported it will return an empty string,
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 329
|     Comment: 
|         /* line 438, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 847
|     Comment: 
|         /*>>webforms*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 707
|     Comment: 
|         /* line 206, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 693
|     Comment: 
|         /* line 201, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 44
|     Comment: 
|         /* line 68, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 673
|     Comment: 
|         /* line 197, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 2860
|     Comment: 
|         /* line 62, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_breadcrumbs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5522
|     Comment: 
|         /* line 31, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3896
|     Comment: 
|         /* line 343, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 637
|     Comment: 
|         /* line 387, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 99
|     Comment: 
|         /* line 148, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 119
|     Comment: 
|          // with a 'scoped' element, in our case the soft-hyphen entity as it won't mess with our measurements.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 632
|     Comment: 
|         /* line 384, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1138
|     Comment: 
|          //   is inserted into a document/fragment
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 619
|     Comment: 
|         /* line 365, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 659
|     Comment: 
|          //   It works fine in Safari on Leopard and Snow Leopard, but not in Chrome in
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 615
|     Comment: 
|         /* line 364, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 611
|     Comment: 
|         /* line 363, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 607
|     Comment: 
|         /* line 362, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 472
|     Comment: 
|          //   2. Disables page caching in WebKit: webk.it/43956
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 603
|     Comment: 
|         /* line 361, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1978
|     Comment: 
|          // Prevent scroll bouncing...wait to remove from layout
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1371
|     Comment: 
|          // Return values will also be the camelCase variant, if you need to translate that to hypenated style use:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 599
|     Comment: 
|         /* line 166, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 787
|     Comment: 
|          // But IE8 doesn't support either with local files
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1140
|     Comment: 
|          //   a 403 response, will cause the tab/window to crash
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 595
|     Comment: 
|         /* line 165, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1268
|     Comment: 
|         /**
|                    * Is equal to true if a browser supports creating unknown/HTML5 elements
|                    * @memberOf html5
|                    * @type boolean
|                    */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1324
|     Comment: 
|          // Modernizr.mq tests a given media query, live against the current state of the window
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 592
|     Comment: 
|         /* line 360, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4156
|     Comment: 
|         /* line 424, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 584
|     Comment: 
|         /* line 358, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 575
|     Comment: 
|         /* line 353, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 571
|     Comment: 
|         /* line 347, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5162
|     Comment: 
|         /* line 175, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 566
|     Comment: 
|         /* line 346, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7296
|     Comment: 
|         /** Address inconsistent `text-transform` inheritance for `button` and `select`. All other form control elements do not inherit `text-transform` values. Correct `button` style inheritance in Chrome, Safari 5+, and IE 8+. Correct `select` style inheritance in Firefox 4+ and Opera. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3708
|     Comment: 
|          // Pad body when sticky (scrolled) or fixed.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 559
|     Comment: 
|         /* line 343, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 555
|     Comment: 
|         /* line 338, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 542
|     Comment: 
|         /* line 325, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 63
|     Comment: 
|         /*>>domprefixes*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5562
|     Comment: 
|         /* line 63, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 4013
|     Comment: 
|         /* Input groups will automatically style first and last elements of the group */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1012
|     Comment: 
|         /*jshint evil:true */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 524
|     Comment: 
|         /* line 307, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 519
|     Comment: 
|         /* line 302, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 677
|     Comment: 
|         /* line 200, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_grid.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1330
|     Comment: 
|          // usage:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 514
|     Comment: 
|         /* line 297, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 509
|     Comment: 
|         /* line 292, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 504
|     Comment: 
|         /* line 287, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_global.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 499
|     Comment: 
|         /* line 684, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1370
|     Comment: 
|          // Properties must be passed as dom-style camelcase, rather than `box-sizing` hypentated style.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 948
|     Comment: 
|          //   and push it into an array of classes we'll join later.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 319
|     Comment: 
|          // In testing support for a given CSS property, it's legit to test:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/normalize.css
|     Line number: 251
|     Comment: 
|         /*
|          * 1. Corrects color not being inherited in IE 8/9.
|          * 2. Remove padding so people aren't caught out if they zero out fieldsets.
|          */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 484
|     Comment: 
|         /* line 662, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 481
|     Comment: 
|         /* line 658, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 478
|     Comment: 
|         /* line 654, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1675
|     Comment: 
|          // A method to call before the tour starts (passed index, tip, and cloned exposed element)
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3979
|     Comment: 
|         /* line 355, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 473
|     Comment: 
|         /* line 646, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 467
|     Comment: 
|         /* line 640, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7274
|     Comment: 
|         /* ========================================================================== Typography ========================================================================== */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5138
|     Comment: 
|         /* line 136, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 860
|     Comment: 
|          // Currently Safari 4 and Opera 11 have support only for the input placeholder
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 449
|     Comment: 
|         /* line 616, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 444
|     Comment: 
|         /* line 610, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6547
|     Comment: 
|         /* line 150, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_offcanvas.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 436
|     Comment: 
|         /* line 599, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 433
|     Comment: 
|         /* line 596, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 80
|     Comment: 
|         /* line 122, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5547
|     Comment: 
|         /* line 50, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 429
|     Comment: 
|         /* line 581, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 422
|     Comment: 
|         /* line 573, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 417
|     Comment: 
|         /* line 564, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 414
|     Comment: 
|         /* line 561, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 409
|     Comment: 
|         /* line 556, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 404
|     Comment: 
|         /* line 550, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 400
|     Comment: 
|         /* line 545, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1351
|     Comment: 
|          // Modernizr.testAllProps() investigates whether a given style property,
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 396
|     Comment: 
|         /* line 540, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 393
|     Comment: 
|         /* line 537, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 179
|     Comment: 
|          // isEventSupported determines if a given element supports the given event
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 380
|     Comment: 
|         /* line 518, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1390
|     Comment: 
|          // Testing DOM property e.g. Modernizr.prefixed('requestAnimationFrame', window) // 'mozRequestAnimationFrame'
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 374
|     Comment: 
|         /* line 508, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 369
|     Comment: 
|         /* line 500, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 366
|     Comment: 
|         /* line 496, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 363
|     Comment: 
|         /* line 491, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 360
|     Comment: 
|         /* line 488, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3842
|     Comment: 
|         /* line 306, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 357
|     Comment: 
|         /* line 481, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 352
|     Comment: 
|         /* line 476, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 349
|     Comment: 
|         /* line 470, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5141
|     Comment: 
|         /* line 137, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_split-buttons.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 340
|     Comment: 
|         /* line 456, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 328
|     Comment: 
|         /* tweet it form */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 868
|     Comment: 
|          // see also github.com/Modernizr/Modernizr/issues/146
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 324
|     Comment: 
|         /* line 429, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 321
|     Comment: 
|         /* line 426, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 429
|     Comment: 
|          // webk.it/70117 is tracking a legit WebGL feature detect proposal
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 318
|     Comment: 
|         /* line 423, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 313
|     Comment: 
|         /* line 418, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 346
|     Comment: 
|          // TODO :: add testDOMProps
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 310
|     Comment: 
|         /* line 414, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 307
|     Comment: 
|         /* line 409, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 301
|     Comment: 
|         /* line 403, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1760
|     Comment: 
|          // non configureable settings
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 294
|     Comment: 
|         /* line 396, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 287
|     Comment: 
|         /* line 388, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 281
|     Comment: 
|         /* line 379, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 276
|     Comment: 
|         /* line 369, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 273
|     Comment: 
|         /* line 367, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 269
|     Comment: 
|         /* line 364, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 266
|     Comment: 
|         /* line 361, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 494
|     Comment: 
|          // - Webkit's implementation is accessible through webkitIndexedDB
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 263
|     Comment: 
|         /* line 358, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1139
|     Comment: 
|          // * Link elements with `src` attributes that are inaccessible, as with
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 260
|     Comment: 
|         /* line 354, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1374
|     Comment: 
|          // $('#interchangeContainer').on('replace', function (e, a, b, c) {
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 256
|     Comment: 
|         /* line 349, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1016
|     Comment: 
|         /** Preset options */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 3415
|     Comment: 
|         /*jslint unparam: true, browser: true, indent: 2 */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 251
|     Comment: 
|         /* line 343, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1022
|     Comment: 
|         /** Not all elements can be cloned in IE **/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 132
|     Comment: 
|         /* line 188, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 859
|     Comment: 
|          // Only input placeholder is tested while textarea's placeholder is not.
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 509
|     Comment: 
|          // name has been deprecated in favor of a shorter and property-matching one.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 247
|     Comment: 
|         /* line 339, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 244
|     Comment: 
|         /* line 335, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1871
|     Comment: 
|          //run when we first start
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1368
|     Comment: 
|          // an event named after the directive on the element, passing
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 238
|     Comment: 
|         /* line 328, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6115
|     Comment: 
|         /* line 101, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1007
|     Comment: 
|         /*>>shiv*/
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 229
|     Comment: 
|         /* line 317, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 213
|     Comment: 
|         /* line 296, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 212
|     Comment: 
|         /* about, documentation & discussions */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1857
|     Comment: 
|          // are we paused?
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 658
|     Comment: 
|          // Webkit's 3D transforms are passed off to the browser's own graphics renderer.
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 208
|     Comment: 
|         /* line 289, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 201
|     Comment: 
|         /* line 280, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 194
|     Comment: 
|         /* line 269, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 190
|     Comment: 
|         /* line 265, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 169
|     Comment: 
|         /* line 236, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 162
|     Comment: 
|         /* line 224, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 39
|     Comment: 
|         /**
|              * Create our "modernizr" element that we do most feature tests on.
|              */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 157
|     Comment: 
|         /* line 216, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 154
|     Comment: 
|         /* line 212, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 139
|     Comment: 
|         /* line 196, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 1890
|     Comment: 
|          // scroll if not modal
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 96
|     Comment: 
|         /* line 144, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 432
|     Comment: 
|          // an expensive context creation: bugzil.la/732441
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 3855
|     Comment: 
|         /* line 308, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_forms.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 467
|     Comment: 
|          // geolocation is often considered a trivial feature detect...
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 87
|     Comment: 
|         /* line 133, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 779
|     Comment: 
|          // will throw the exception:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 83
|     Comment: 
|         /* line 128, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 77
|     Comment: 
|         /* line 119, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7282
|     Comment: 
|         /** Improve readability of pre-formatted text in all browsers. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/all.js
|     Line number: 2717
|     Comment: 
|          // if (locked) {return false;}
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 5505
|     Comment: 
|         /* line 23, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_tabs.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 7279
|     Comment: 
|         /** Address differences between Firefox and other browsers. */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1361
|     Comment: 
|          // Modernizr.testStyles('#modernizr { position:absolute }', function(elem, rule){ ... })
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1141
|     Comment: 
|          // * Script elements appended to fragments will execute when their `src`
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 71
|     Comment: 
|         /* line 113, /home/bitnami/projects/apachefriends-web/source-xampp-windows/stylesheets/all.scss */
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 1048
|     Comment: 
|          // assign a false positive if unable to shiv
|     
|     Path: http://192.168.234.55:80/dashboard/javascripts/modernizr.js
|     Line number: 182
|     Comment: 
|          // The following results are known incorrects:
|     
|     Path: http://192.168.234.55:80/dashboard/stylesheets/all.css
|     Line number: 6205
|     Comment: 
|_        /* line 201, /home/bitnami/projects/apachefriends-web/bower_components/foundation/scss/foundation/components/_top-bar.scss */
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-date: Mon, 24 Jan 2022 14:38:37 GMT; -1s from local time.
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|   /icons/: Potentially interesting folder w/ directory listing
|_  /img/: Potentially interesting directory w/ listing on 'apache/2.4.43 (win64) openssl/1.1.1g php/7.4.6'
| http-errors: 
| Spidering limited to: maxpagecount=40; withinhost=192.168.234.55
|   Found the following error pages: 
|   
|   Error Code: 403
|_  	http://192.168.234.55:80/phpmyadmin/
|_http-favicon: Unknown favicon MD5: 56F7C04657931F2D0B79371B2D6E9820
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-grep: 
|   (1) http://192.168.234.55:80/dashboard/: 
|     (1) email: 
|       + fastly-logo@2x.png
|   (1) http://192.168.234.55:80/phpmyadmin/: 
|     (1) ip: 
|       + 192.168.234.55
|   (2) http://192.168.234.55:80/dashboard/stylesheets/all.css: 
|     (2) email: 
|       + social-icons@2x.png
|       + social-icons-large@2x.png
|   (2) http://192.168.234.55:80/dashboard/phpinfo.php: 
|     (1) ip: 
|       + 192.168.49.234
|     (1) email: 
|       + license@php.net
|   (3) http://192.168.234.55:80/dashboard/docs/send-mail.html: 
|     (3) email: 
|       + your-gmail-username@gmail.com
|       + recipients@email-address.com
|_      + your@email-address.com
| http-headers: 
|   Date: Mon, 24 Jan 2022 14:38:48 GMT
|   Server: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
|   Last-Modified: Mon, 18 May 2020 06:55:42 GMT
|   ETag: "1d98-5a5e6a6bcb780"
|   Accept-Ranges: bytes
|   Content-Length: 7576
|   Connection: close
|   Content-Type: text/html
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-mobileversion-checker: No mobile version detected.
| http-php-version: Logo query returned unknown hash 468aa6f6356253cc88b73c33cfb48b5b
|_Credits query returned unknown hash 468aa6f6356253cc88b73c33cfb48b5b
| http-referer-checker: 
| Spidering limited to: maxpagecount=30
|_  http://code.jquery.com:80/jquery-1.10.2.min.js
|_http-security-headers: 
|_http-server-header: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
| http-sitemap-generator: 
|   Directory structure:
|     /
|       html: 1
|     /dashboard/
|       Other: 1; html: 3; php: 1
|     /dashboard/docs/
|       html: 4
|     /dashboard/images/
|       png: 3; svg: 1
|     /dashboard/javascripts/
|       js: 2
|     /dashboard/stylesheets/
|       css: 2
|   Longest directory structure:
|     Depth: 2
|     Dir: /dashboard/javascripts/
|   Total files found (by extension):
|_    Other: 1; css: 2; html: 8; js: 2; php: 1; png: 3; svg: 1
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
| http-title: Welcome to XAMPP
|_Requested resource was http://192.168.234.55/dashboard/
| http-trace: TRACE is enabled
| Headers:
| Date: Mon, 24 Jan 2022 14:38:44 GMT
| Server: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
| Connection: close
| Transfer-Encoding: chunked
|_Content-Type: message/http
| http-useragent-tester: 
|   Status for browser useragent: 200
|   Redirected To: http://192.168.234.55/dashboard/
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
| http-vhosts: 
|_128 names had status 302
|_http-vuln-cve2017-1001000: ERROR: Script execution failed (use -d to debug)
| http-waf-detect: IDS/IPS/WAF detected:
|_192.168.234.55:80/?p4yl04d3=<script>alert(document.cookie)</script>
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Jan 24 09:40:42 2022 -- 1 IP address (1 host up) scanned in 138.02 seconds

```