import functools, tarfile, tempfile, os
UPLOAD_FOLDER = "/tmp"
def extract_firmware(path):
    tmp  = tempfile.gettempdir()
    print("### tmp:", tmp, "#"*30)
    if tarfile.is_tarfile(path):
        tar = tarfile.open(path, 'r:gz')
        tar.extractall(tmp)

        rand_dir = "rand_dir"
        extractdir = f"{UPLOAD_FOLDER}/{rand_dir}"
        os.makedirs(extractdir, exist_ok=True)
        for tarinfo in tar:
            name = tarinfo.name
            if tarinfo.isreg():
                try:
                    filename = f'{extractdir}/{name}'
                    print("### filename:", filename, "#"*30)
                    os.rename(os.path.join(tmp, name), filename)
                    continue
                except:
                    pass
            os.makedirs(f'{extractdir}/{name}', exist_ok=True)
        tar.close()
        return True
        
extract_firmware('/tmp/test.tar.gz')
