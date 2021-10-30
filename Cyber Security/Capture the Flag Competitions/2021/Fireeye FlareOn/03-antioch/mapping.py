# antioch extracted from antioch.tar first

import os
path = os.walk(".")
for root, directories, files in path:
    print("###", root)
    for directory in directories:
        print(directory)
    for file in files:
        print(file)
        if ".tar" in file and True:
            new_folder = file.replace(".tar", "")
            os.system(f"cd {root} && mkdir {new_folder} && cp {file} {new_folder} && cd {new_folder} && tar -xvf {file} && rm {file}")
        

