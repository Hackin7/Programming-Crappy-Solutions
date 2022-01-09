```bash
nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/xml/tcp_80_http_nmap.xml" 10.10.11.125
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_nmap.txt):

```
# Nmap 7.91 scan initiated Thu Jan  6 03:49:10 2022 as: nmap -vv --reason -Pn -T4 -sV -p 80 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/xml/tcp_80_http_nmap.xml" 10.10.11.125
Nmap scan report for 10.10.11.125
Host is up, received user-set (0.19s latency).
Scanned at 2022-01-06 03:49:12 EST for 104s

PORT   STATE SERVICE REASON  VERSION
80/tcp open  http    syn-ack Apache httpd 2.4.41 ((Ubuntu))
|_http-backup-finder: ERROR: Script execution failed (use -d to debug)
|_http-chrono: Request times for /; avg: 1676.88ms; min: 931.01ms; max: 2804.49ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=10.10.11.125
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1302
|     Comment: 
|         /*--------------------------------------------------------------
|         11.0 Featured Image Hover
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2041
|     Comment: 
|         /* Blog landing, search, archives */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2922
|     Comment: 
|         /* Audio Player */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2931
|     Comment: 
|         /* Playlist Color Overrides: Light */
|     
|     Path: http://10.10.11.125:80/wp-includes/js/jquery/jquery.min.js?ver=3.6.0
|     Line number: 1
|     Comment: 
|         /*! jQuery v3.6.0 | (c) OpenJS Foundation and other contributors | jquery.org/license */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2743
|     Comment: 
|         /* Search */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1785
|     Comment: 
|         /*--------------------------------------------------------------
|         13.2 Front Page
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 145
|     Comment: 
|         <!-- .site-info -->
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 77
|     Comment: 
|         <!-- .site-branding -->
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 76
|     Comment: 
|         <!-- .wrap -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 694
|     Comment: 
|         /* Typography for Cyrillic Font */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4050
|     Comment: 
|         /* Widgets */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2370
|     Comment: 
|         /* Site info */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3990
|     Comment: 
|         /* Pages */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 412
|     Comment: 
|         /*--------------------------------------------------------------
|         5.0 Typography
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1501
|     Comment: 
|         /* IE 9 */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1604
|     Comment: 
|         /* Prevent opacity from changing during selective refreshes in the customize preview */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 835
|     Comment: 
|         /* Typography for Japanese Font */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2721
|     Comment: 
|         /* Gravatar */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 19
|     Comment: 
|         /*--------------------------------------------------------------
|         >>> TABLE OF CONTENTS:
|         ----------------------------------------------------------------
|         1.0 Normalize
|         2.0 Accessibility
|         3.0 Alignments
|         4.0 Clearings
|         5.0 Typography
|         6.0 Forms
|         7.0 Formatting
|         8.0 Lists
|         9.0 Tables
|         10.0 Links
|         11.0 Featured Image Hover
|         12.0 Navigation
|         13.0 Layout
|            13.1 Header
|            13.2 Front Page
|            13.3 Regular Content
|            13.4 Posts
|            13.5 Pages
|            13.6 Footer
|         14.0 Comments
|         15.0 Widgets
|         16.0 Media
|            16.1 Galleries
|         17.0 Customizer
|         18.0 SVGs Fallbacks
|         19.0 Media Queries
|         20.0 Print
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1846
|     Comment: 
|         /* Front Page - Recent Posts */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3937
|     Comment: 
|         /* without sidebar */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1874
|     Comment: 
|         /*--------------------------------------------------------------
|         13.3 Regular Content
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/index.php/blog/
|     Line number: 137
|     Comment: 
|         <!-- #secondary -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2856
|     Comment: 
|         /* Adhere to container width. */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 79
|     Comment: 
|         <!-- .custom-header -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2729
|     Comment: 
|         /* Recent Comments */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1364
|     Comment: 
|         /* Hide the menu on small screens when JavaScript is available.
|          * It only works with JavaScript.
|          */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 313
|     Comment: 
|         /* Many screen reader and browser combinations announce broken words as they would appear visually. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1887
|     Comment: 
|         /*--------------------------------------------------------------
|         13.4 Posts
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2200
|     Comment: 
|         /* Post Formats */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1706
|     Comment: 
|         /* vw prevents 1px gap on left that 100% has */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1076
|     Comment: 
|         /* Since FF19 lowers the opacity of the placeholder by default */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2525
|     Comment: 
|         /*--------------------------------------------------------------
|         15.0 Widgets
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 149
|     Comment: 
|         <!-- #page -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1506
|     Comment: 
|         /* Scroll down arrow */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3949
|     Comment: 
|         /* with sidebar */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2888
|     Comment: 
|         /* Remove bottom on embeds that wrapped in paragraphs via wpautop. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2551
|     Comment: 
|         /* widget forms */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1512
|     Comment: 
|         /*--------------------------------------------------------------
|         13.0 Layout
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 51
|     Comment: 
|         /*--------------------------------------------------------------
|         1.0 Normalize
|         Styles based on Normalize v5.0.0 @link https://github.com/necolas/normalize.css
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4239
|     Comment: 
|         /* Font sizes */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2715
|     Comment: 
|         /* Contact Info Widget */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 126
|     Comment: 
|         <!-- #primary -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2839
|     Comment: 
|         /* Gallery widget */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1716
|     Comment: 
|         /* Specificity prevents .color-dark button overrides */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3361
|     Comment: 
|         /* Gallery Columns */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3306
|     Comment: 
|         /* Fix image alignment */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4197
|     Comment: 
|         /*--------------------------------------------------------------
|         20.0 Print
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2807
|     Comment: 
|         /* Calendar widget */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 816
|     Comment: 
|         /* Typography for Hebrew Font */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3790
|     Comment: 
|         /* With panel images 100% of the screen height, we're going to fix the background image where supported to create a parallax-like effect. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2737
|     Comment: 
|         /* Recent Posts widget */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 94
|     Comment: 
|         <!-- .navigation-top -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3175
|     Comment: 
|         /* Ensure that placeholder icons are visible. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2230
|     Comment: 
|         /* Post Navigation */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 894
|     Comment: 
|         /* Remove letter-spacing for all non-latin alphabets */
|     
|     Path: http://10.10.11.125:80/index.php/about/
|     Line number: 117
|     Comment: 
|         <!-- #post-12 -->
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 124
|     Comment: 
|         <!-- .error-404 -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 777
|     Comment: 
|         /* Typography for Greek Font */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3160
|     Comment: 
|         /* Show borders on the custom page panels only when the front page sections are being edited */
|     
|     Path: http://10.10.11.125:80/wp-includes/js/jquery/jquery-migrate.min.js?ver=3.3.2
|     Line number: 1
|     Comment: 
|         /*! jQuery Migrate v3.3.2 | (c) OpenJS Foundation and other contributors | jquery.org/license */
|     
|     Path: http://10.10.11.125:80/index.php/contact/
|     Line number: 117
|     Comment: 
|         <!-- #post-13 -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1061
|     Comment: 
|         /* Placeholder text color -- selectors need to be separate to work. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 361
|     Comment: 
|         /*--------------------------------------------------------------
|         4.0 Clearings
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4149
|     Comment: 
|         /* Pagination */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 41
|     Comment: 
|         <!--[if lt IE 9]>
|         <link rel='stylesheet' id='twentyseventeen-ie8-css'  href='http://10.10.11.125/wp-content/themes/twentyseventeen/assets/css/ie8.css?ver=20161202' media='all' />
|         <![endif]-->
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 123
|     Comment: 
|         <!-- .page-content -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3867
|     Comment: 
|         /* Blog, archive, search */
|     
|     Path: http://10.10.11.125:80/index.php/blog/
|     Line number: 113
|     Comment: 
|         <!-- .entry-meta -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4339
|     Comment: 
|         /* Make sure color schemes don't affect to print */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3059
|     Comment: 
|         /* SVG Icons base styles */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1684
|     Comment: 
|         /* Chrome10-25,Safari5.1-6 */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1568
|     Comment: 
|         /* Site branding */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4325
|     Comment: 
|         /* Colors */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2297
|     Comment: 
|         /* 404 page */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4303
|     Comment: 
|         /* override styles added by JavaScript */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4203
|     Comment: 
|         /* Hide elements */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3219
|     Comment: 
|         /* Social Menu fallbacks */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2092
|     Comment: 
|         /* Single Post */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2855
|     Comment: 
|         /* Make sure images are scaled correctly. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3935
|     Comment: 
|         /* Entry content */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2621
|     Comment: 
|         /* Text widget */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3323
|     Comment: 
|         /* Front Page */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4042
|     Comment: 
|         /* Secondary */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1419
|     Comment: 
|         /* Menu toggle */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3243
|     Comment: 
|         /*--------------------------------------------------------------
|         19.0 Media Queries
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4008
|     Comment: 
|         /* Comments */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1770
|     Comment: 
|         /* Hides div in Customizer preview when header images or videos change. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3169
|     Comment: 
|         /* Add some space around the visual edit shortcut buttons. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1709
|     Comment: 
|         /* Prevent header from extending beyond the footer */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3966
|     Comment: 
|         /* blog and archive */
|     
|     Path: http://10.10.11.125:80/index.php/blog/
|     Line number: 122
|     Comment: 
|         <!-- #post-1 -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3834
|     Comment: 
|         /* Posts */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3502
|     Comment: 
|         /* Navigation */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1752
|     Comment: 
|         /* For browsers that support 'object-fit' */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1321
|     Comment: 
|         /*--------------------------------------------------------------
|         12.0 Navigation
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 338
|     Comment: 
|         /*--------------------------------------------------------------
|         3.0 Alignments
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3180
|     Comment: 
|         /*--------------------------------------------------------------
|         18.0 SVGs Fallbacks
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3539
|     Comment: 
|         /* Main Navigation */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3247
|     Comment: 
|         /* Adjust positioning of edit shortcuts, override style in customize-preview.css */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1834
|     Comment: 
|         /* Panel edit link */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3517
|     Comment: 
|         /* The font size is 14px here and we need 50px padding in ems */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3404
|     Comment: 
|         /* Layout */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 147
|     Comment: 
|         <!-- #colophon -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3354
|     Comment: 
|         /* Site Footer */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3148
|     Comment: 
|         /* Used for placeholder text */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1533
|     Comment: 
|         /* Fallback for when there is no custom background color defined. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3342
|     Comment: 
|         /* Blog Index, Archive, Search */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 96
|     Comment: 
|         <!-- #masthead -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4058
|     Comment: 
|         /* Footer */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 305
|     Comment: 
|         /* Text meant only for screen readers. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3317
|     Comment: 
|         /* Site Branding */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1095
|     Comment: 
|         /*--------------------------------------------------------------
|         8.0 Lists
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2588
|     Comment: 
|         /* Widget lists of links */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3257
|     Comment: 
|         /* Typography */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3239
|     Comment: 
|         /* overrides previous !important styles */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 125
|     Comment: 
|         <!-- #main -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4138
|     Comment: 
|         /* Sticky posts */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3145
|     Comment: 
|         /* Prevent :after from preventing interactions within the section */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3133
|     Comment: 
|         /* Matches visible edit shortcuts. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3128
|     Comment: 
|         /*--------------------------------------------------------------
|         17.0 Customizer
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3071
|     Comment: 
|         /*--------------------------------------------------------------
|         16.1 Galleries
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3065
|     Comment: 
|         /* Align more nicely with capital letters */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2321
|     Comment: 
|         /* Footer widgets */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2398
|     Comment: 
|         /*--------------------------------------------------------------
|         14.0 Comments
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/
|     Line number: 128
|     Comment: 
|         <!-- .panel-content -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2031
|     Comment: 
|         /* Aligned blockquotes */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 148
|     Comment: 
|         <!-- .site-content-contain -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1555
|     Comment: 
|         /*--------------------------------------------------------------
|         13.1 Header
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1437
|     Comment: 
|         /* Display the menu toggle when JavaScript is available. */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 44
|     Comment: 
|         <!--[if lt IE 9]>
|         <script src='http://10.10.11.125/wp-content/themes/twentyseventeen/assets/js/html5.js?ver=20161020' id='html5-js'></script>
|         <![endif]-->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4329
|     Comment: 
|         /* Brute force since user agents all print differently. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2916
|     Comment: 
|         /* Media Elements */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1807
|     Comment: 
|         /* Permalink - use to edit and share this gradient: http://colorzilla.com/gradient-editor/#000000+0,000000+100&0+0,0.3+100 */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1686
|     Comment: 
|         /* IE6-9 */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2965
|     Comment: 
|         /* Playlist Color Overrides: Dark */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 335
|     Comment: 
|         /* Above WP toolbar. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1186
|     Comment: 
|         /* Hover effects */
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 73
|     Comment: 
|         <!-- .site-branding-text -->
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 92
|     Comment: 
|         <!-- #site-navigation -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2328
|     Comment: 
|         /* Social nav */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 301
|     Comment: 
|         /*--------------------------------------------------------------
|         2.0 Accessibility
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 109
|     Comment: 
|         <!-- .page-header -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2134
|     Comment: 
|         /* Entry footer */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2763
|     Comment: 
|         /* Tag cloud widget */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2879
|     Comment: 
|         /* Make sure embeds and iframes fit their containers. */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1167
|     Comment: 
|         /*--------------------------------------------------------------
|         10.0 Links
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2663
|     Comment: 
|         /* RSS Widget */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3228
|     Comment: 
|         /* Show screen reader text in some cases */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1683
|     Comment: 
|         /* FF3.6-15 */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 667
|     Comment: 
|         /* Typography for Chinese Font */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3011
|     Comment: 
|         /* Playlist Style Overrides */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 797
|     Comment: 
|         /* Typography for Gujarati Font */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1127
|     Comment: 
|         /*--------------------------------------------------------------
|         9.0 Tables
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 736
|     Comment: 
|         /* Typography for Devanagari Font */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2558
|     Comment: 
|         /* widget lists */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2084
|     Comment: 
|         /* More tag */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 582
|     Comment: 
|         /* Typography for Arabic Font */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2849
|     Comment: 
|         /*--------------------------------------------------------------
|         16.0 Media
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 130
|     Comment: 
|         <!-- #content -->
|     
|     Path: http://10.10.11.125:80/
|     Line number: 114
|     Comment: 
|         <!-- .panel-image -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 917
|     Comment: 
|         /*--------------------------------------------------------------
|         6.0 Forms
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/
|     Line number: 130
|     Comment: 
|         <!-- #post-11 -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1084
|     Comment: 
|         /*--------------------------------------------------------------
|         7.0 Formatting
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2308
|     Comment: 
|         /*--------------------------------------------------------------
|         13.6 Footer
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2270
|     Comment: 
|         /*--------------------------------------------------------------
|         13.5 Pages
|         --------------------------------------------------------------*/
|     
|     Path: http://10.10.11.125:80/index.php/contact/
|     Line number: 116
|     Comment: 
|         <!-- .entry-content -->
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Line number: 141
|     Comment: 
|         <!-- .social-navigation -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 3984
|     Comment: 
|         /* Post formats */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 854
|     Comment: 
|         /* Typography for Korean font */
|     
|     Path: http://10.10.11.125:80/wp-includes/js/wp-embed.min.js?ver=5.8.1
|     Line number: 1
|     Comment: 
|         /*! This file is auto-generated */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1891
|     Comment: 
|         /* Post Landing Page */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1502
|     Comment: 
|         /* Chrome, Safari, Opera */
|     
|     Path: http://10.10.11.125:80/index.php/contact/
|     Line number: 112
|     Comment: 
|         <!-- .entry-header -->
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 873
|     Comment: 
|         /* Typography for Thai Font */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1685
|     Comment: 
|         /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1472
|     Comment: 
|         /* Dropdown Toggle */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 2614
|     Comment: 
|         /* Widget markup */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1682
|     Comment: 
|         /* Permalink - use to edit and share this gradient: http://colorzilla.com/gradient-editor/#000000+0,000000+100&0+0,0.3+75 */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1
|     Comment: 
|         /*
|         Theme Name: Twenty Seventeen
|         Theme URI: https://wordpress.org/themes/twentyseventeen/
|         Author: the WordPress team
|         Author URI: https://wordpress.org/
|         Description: Twenty Seventeen brings your site to life with header video and immersive featured images. With a focus on business sites, it features multiple sections on the front page as well as widgets, navigation and social menus, a logo, and more. Personalize its asymmetrical grid with a custom color scheme and showcase your multimedia content with post formats. Our default theme for 2017 works great in many languages, for any abilities, and on any device.
|         Version: 2.8
|         Requires at least: 4.7
|         Requires PHP: 5.2.4
|         License: GNU General Public License v2 or later
|         License URI: http://www.gnu.org/licenses/gpl-2.0.html
|         Text Domain: twentyseventeen
|         Tags: one-column, two-columns, right-sidebar, flexible-header, accessibility-ready, custom-colors, custom-header, custom-menu, custom-logo, editor-style, featured-images, footer-widgets, post-formats, rtl-language-support, sticky-post, theme-options, threaded-comments, translation-ready, block-patterns
|         
|         This theme, like WordPress, is licensed under the GPL.
|         Use it to make something cool, have fun, and share what you've learned with others.
|         */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1525
|     Comment: 
|         /* Inherit box-sizing to make it easier to change the property for components that leverage other behavior; see http://css-tricks.com/inheriting-box-sizing-probably-slightly-better-best-practice/ */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 4022
|     Comment: 
|         /* Posts pagination */
|     
|     Path: http://10.10.11.125:80/wp-content/themes/twentyseventeen/style.css?ver=20201208
|     Line number: 1289
|     Comment: 
|_        /* Fixes linked images */
| http-csrf: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=10.10.11.125
|   Found the following possible CSRF vulnerabilities: 
|     
|     Path: http://10.10.11.125:80/index.php/about/%5c
|     Form id: search-form-1
|     Form action: http://10.10.11.125/
|     
|     Path: http://10.10.11.125:80/index.php/blog/%5c
|     Form id: search-form-1
|     Form action: http://10.10.11.125/
|     
|     Path: http://10.10.11.125:80/index.php/comments/feed/&quot;https:/gravatar.com&quot;&gt;Gravatar&lt;/a&gt;.]]
|     Form id: search-form-1
|_    Form action: http://10.10.11.125/
|_http-date: Thu, 06 Jan 2022 08:50:54 GMT; +1m20s from local time.
|_http-devframework: Wordpress detected. Found common traces on /
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|   /wp-login.php: Possible admin folder
|   /readme.html: Wordpress version: 2 
|   /: WordPress version: 5.8.1
|   /wp-includes/images/rss.png: Wordpress version 2.2 found.
|   /wp-includes/js/jquery/suggest.js: Wordpress version 2.5 found.
|   /wp-includes/images/blank.gif: Wordpress version 2.6 found.
|   /wp-includes/js/comment-reply.js: Wordpress version 2.7 found.
|   /wp-login.php: Wordpress login page.
|   /wp-admin/upgrade.php: Wordpress login page.
|_  /readme.html: Interesting, a readme.
| http-errors: 
| Spidering limited to: maxpagecount=40; withinhost=10.10.11.125
|   Found the following error pages: 
|   
|   Error Code: 404
|   	http://10.10.11.125:80/%5c%22
|   
|   Error Code: 404
|   	http://10.10.11.125:80/index.php/wp-json/wp/v2/pages/%5c%22http:%5c/%5c/10.10.11.125%5c/%5c%22
|   
|   Error Code: 404
|   	http://10.10.11.125:80/index.php/wp-json/wp/v2/pages/%5c%22http:%5c/%5c/backdoor.htb%5c/wp-content%5c/themes%5c/twentytwenty%5c/assets%5c/images%5c/2020-square-2.png%5c%22
|   
|   Error Code: 404
|   	http://10.10.11.125:80/index.php/wp-json/wp/v2/pages/%5c%22http:%5c/%5c/backdoor.htb%5c/wp-content%5c/themes%5c/twentytwenty%5c/assets%5c/images%5c/2020-square-1.png%5c%22
|   
|   Error Code: 404
|   	http://10.10.11.125:80/index.php/wp-json/wp/v2/pages/%5c%22http:%5c/%5c/backdoor.htb%5c/wp-content%5c/themes%5c/twentytwenty%5c/assets%5c/images%5c/2020-three-quarters-4.png%5c%22
|   
|   Error Code: 404
|   	http://10.10.11.125:80/index.php/wp-json/wp/v2/pages/%5c%22https:%5c/%5c/make.wordpress.org%5c/core%5c/2019%5c/09%5c/27%5c/block-editor-theme-related-updates-in-wordpress-5-3%5c/%5c%22
|   
|   Error Code: 404
|   	http://10.10.11.125:80/index.php/wp-json/wp/v2/pages/%5c%22http:%5c/%5c/backdoor.htb%5c/wp-content%5c/themes%5c/twentytwenty%5c/assets%5c/images%5c/2020-three-quarters-1.png%5c%22
|   
|   Error Code: 404
|   	http://10.10.11.125:80/wp-includes/js/jquery/r.href,v.crossDomain=Mt.protocol+%22/%22+Mt.host!=r.protocol+%22/%22+r.host%7dcatch(e)%7bv.crossDomain=!0%7d%7dif(v.data&&v.processData&&%22string%22!=typeof
|   
|   Error Code: 404
|   	http://10.10.11.125:80/index.php/wp-json/wp/v2/pages/%5c%22http:%5c/%5c/backdoor.htb%5c/wp-content%5c/themes%5c/twentytwenty%5c/assets%5c/images%5c/2020-landscape-2.png%5c%22
|   
|   Error Code: 404
|   	http://10.10.11.125:80/index.php/about/%5c
|   
|   Error Code: 404
|   	http://10.10.11.125:80/index.php/blog/%5c
|   
|   Error Code: 404
|_  	http://10.10.11.125:80/index.php/wp-json/wp/v2/pages/%5c%22http:%5c/%5c/backdoor.htb%5c/wp-content%5c/themes%5c/twentytwenty%5c/assets%5c/images%5c/2020-three-quarters-2.png%5c%22
| http-feed: 
| Spidering limited to: maxpagecount=40; withinhost=10.10.11.125
|   Found the following feeds: 
|     RSS (version 2.0): http://10.10.11.125/index.php/comments/feed/
|     RSS (version 2.0): http://10.10.11.125:80/index.php/feed/
|     RSS (version 2.0): http://10.10.11.125/index.php/2021/07/24/hello-world/feed/
|     RSS (version 2.0): http://10.10.11.125:80/index.php/comments/feed/
|_    RSS (version 2.0): http://10.10.11.125/index.php/feed/
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-fileupload-exploiter: 
|   
|     Couldn't find a file-type field.
|   
|_    Couldn't find a file-type field.
|_http-generator: WordPress 5.8.1
| http-grep: 
|   (2) http://10.10.11.125:80/: 
|     (1) ip: 
|       + 10.10.11.125
|     (1) email: 
|_      + wordpress@example.com
| http-headers: 
|   Date: Thu, 06 Jan 2022 08:50:54 GMT
|   Server: Apache/2.4.41 (Ubuntu)
|   Link: <http://10.10.11.125/index.php/wp-json/>; rel="https://api.w.org/"
|   Link: <http://10.10.11.125/index.php/wp-json/wp/v2/pages/11>; rel="alternate"; type="application/json"
|   Link: <http://10.10.11.125/>; rel=shortlink
|   Connection: close
|   Content-Type: text/html; charset=UTF-8
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-mobileversion-checker: No mobile version detected.
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-security-headers: 
|_http-server-header: Apache/2.4.41 (Ubuntu)
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1; php: 1
|     /index.php/about/
|       Other: 1
|     /index.php/blog/
|       Other: 1
|     /index.php/comments/feed/
|       Other: 1
|     /index.php/contact/
|       Other: 1
|     /index.php/feed/
|       Other: 1
|     /index.php/wp-json/
|       Other: 1
|     /wp-content/themes/twentyseventeen/
|       css: 1
|     /wp-includes/
|       xml: 1
|     /wp-includes/js/
|       js: 1
|     /wp-includes/js/jquery/
|       Other: 1; js: 2
|   Longest directory structure:
|     Depth: 3
|     Dir: /wp-includes/js/jquery/
|   Total files found (by extension):
|_    Other: 8; css: 1; js: 3; php: 1; xml: 1
| http-sql-injection: 
|   Possible sqli for queries:
|     http://10.10.11.125:80/wp-includes/js/jquery/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://10.10.11.125:80/wp-includes/js/jquery/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://10.10.11.125:80/wp-includes/js/jquery/?C=S%3bO%3dA%27%20OR%20sqlspider
|_    http://10.10.11.125:80/wp-includes/js/jquery/?C=N%3bO%3dD%27%20OR%20sqlspider
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-title: Backdoor &#8211; Real-Life
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
| http-vhosts: 
|_128 names had status 200
| http-waf-detect: IDS/IPS/WAF detected:
|_10.10.11.125:80/?p4yl04d3=<script>alert(document.cookie)</script>
| http-wordpress-enum: 
| Search limited to top 100 themes/plugins
|   themes
|     twentyseventeen 2.8
|   plugins
|_    akismet
| http-wordpress-users: 
| Username found: admin
|_Search stopped at ID #25. Increase the upper limit if necessary with 'http-wordpress-users.limit'

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Jan  6 03:50:56 2022 -- 1 IP address (1 host up) scanned in 106.62 seconds

```
