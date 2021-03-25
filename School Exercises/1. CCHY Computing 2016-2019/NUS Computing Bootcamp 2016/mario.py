from runes import *
pic = heart_bb

def twin(pic): return stack(pic,pic)
def fractal(pic, n):
    list = beside(pic, twin(pic))
    for i in range(n-2): list = beside(pic,twin(list))
    return list

def twin(pic): return stack(pic,pic)
def dual_fractal(pic1, pic2, n):
    if n % 2 == 0:
        info1 = pic1
        info2 = pic2
    else:
        info1 = pic2
        info2 = pic1
    list = beside(info1, twin(info2))
    counter = 0
    for i in range((n-2)//2):
        list = beside(info2,twin(list))
        list = beside(info1,twin(list))
        counter = counter + 2
    if n % 2 == 1:list = (beside(info2,twin(list)))
    return list

def zeno(pic, n):
    list = beside(pic, pic)
    for i in range(n-2): list = (beside(pic,list))
    return list

#show(dual_fractal(rcross_bb, nova_bb, 6))

def ratio_stack(pic1, pic2, pic3, a, b, c): return stack_frac((a+b)/(a+b+c),stack_frac(a/(a+b),pic1,pic2),pic3)
def ratio_beside(pic1, pic2, pic3, a, b, c): return quarter_turn_left(stack_frac((a+b)/(a+b+c),stack_frac(a/(a+b),quarter_turn_right(pic1), quarter_turn_right(pic2)), quarter_turn_right(pic3)))
def layer(*pixels):
    list = []
    if pixels[len(pixels)-1] == 0: pixel = blank_bb#sail_bb #For Debugging 
    else : pixel = black_bb 
    list = pixel
    for i in range(len(pixels)-1):
        if pixels[len(pixels)-2-i] == 0: pixel = blank_bb#sail_bb #For Debugging  
        else : pixel = black_bb 
        variable = ratio_beside(pixel,list,blank_bb,1,i+1,0)
        list = variable
    return list
def combine(layers):
    list = layers[len(layers)-1]
    for i in range(len(layers)-1): 
        variable = ratio_stack(layers[len(layers)-2-i],list,blank_bb,1,i+1,0)
        list = variable
    return list

#####Blank 16x16 grid##############
pixed = []
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0))
#show(combine(pixed)) 
#save_image('CC-TerenceChan-Blankness')
###################################

pixed = []
pixed.append(layer(0,0,0,0,0,0,0,0))
pixed.append(layer(0,0,1,1,1,0,0,0))
pixed.append(layer(0,0,1,0,1,0,0,0)) 
pixed.append(layer(0,0,1,1,1,0,0,0))
pixed.append(layer(0,0,0,1,0,0,0,0))
pixed.append(layer(0,0,1,1,1,0,0,0))
pixed.append(layer(0,1,0,1,0,1,0,0))
pixed.append(layer(0,0,1,0,1,0,0,0))
pixed.append(layer(0,1,0,0,0,1,0,0))

#show(combine(pixed)) #Stickman
#save_image('CC-TerenceChan-CrappyStickman')

a = 1
pixed = []
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,7,7,7,0,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,0,7,0,0,0,7,0,0,0,0,7,0,0))
pixed.append(layer(0,0,0,0,7,0,0,0,7,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,0,7,0,0,0,7,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,0,0,7,7,7,0,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,0,7,0,7,0,7,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,7,0,0,7,0,0,7,0,0,0,0,0,0))
pixed.append(layer(0,0,7,0,0,0,7,0,0,0,7,0,0,0,0,0))
pixed.append(layer(0,0,0,0,0,0,7,0,0,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,0,0,0,7,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,7,0,7,0,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,0,7,0,0,0,7,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,7,0,0,0,0,0,7,0,0,0,0,0,0))
pixed.append(layer(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1))
pixed.append(layer(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1))
#show(combine(pixed))
#save_image('CC-TerenceChan-TheLessCrappyStickman......andabullet')

a = 1
pixed = []
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,7,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,7,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,7,0,0,0)) 
pixed.append(layer(0,0,7,7,7,0,0,0,0,7,0,0,7,7,7,0)) 
pixed.append(layer(0,0,7,0,7,7,0,0,7,7,7,0,7,0,7,0)) 
pixed.append(layer(0,0,7,7,7,0,7,0,0,7,0,0,7,7,7,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,7,7,7,0,0,0,7,7,7,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,7,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,7,7,7,0,0,0,7,7,7,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
#show(combine(pixed))
#save_image('CC-TerenceChan-a+b=c')

a = 1
pixed = []
pixed.append(layer(0,0,0,7,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(0,7,0,0,0,0,0,0,0,0,0,0,0,0,0,7,0)) 
pixed.append(layer(0,7,0,0,7,0,0,0,0,0,0,0,0,0,0,7,0)) 
pixed.append(layer(0,7,0,7,7,7,0,0,0,0,0,7,0,7,0,7,0)) 
pixed.append(layer(0,7,0,0,7,0,0,7,0,7,0,0,0,0,0,7,0)) 
pixed.append(layer(0,7,0,0,0,0,0,0,0,0,0,0,0,0,0,7,0)) 
pixed.append(layer(0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,7,0,0,7,0,7,7,7,0,7,7,7,0,0,0)) 
pixed.append(layer(0,0,7,7,0,7,0,7,0,0,0,7,0,0,0,0,0)) 
pixed.append(layer(0,0,7,0,7,7,0,7,7,7,0,7,7,7,0,0,0)) 
pixed.append(layer(0,0,7,0,0,7,0,7,0,0,0,0,0,7,0,0,0)) 
pixed.append(layer(0,0,7,0,0,7,0,7,7,7,0,7,7,7,0,0,0))
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0))
top = combine(pixed)
pixed = []
pixed.append(layer(0,0,0,7,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(0,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0))
background = combine(pixed)
#show(overlay(top,background))
#save_image('CC-TerenceChan-Gamepad')

a = 1
pixed = []
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,7,7,7,7,7,7,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,7,7,7,7,7,7,7,7,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0))
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,0,0,0,7,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,7,7,7,7,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,7,0,7,7,0,7,7,0,7,7,0,0,0,0)) 
pixed.append(layer(0,0,7,7,7,7,7,7,7,7,7,7,0,0,0,0)) 
pixed.append(layer(0,0,7,7,7,7,7,7,7,7,7,7,0,0,0,0)) 
pixed.append(layer(0,0,7,7,7,7,7,7,7,7,7,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,7,7,7,7,7,7,7,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,7,7,7,7,0,0,0,0)) 
capandvest = combine(pixed)
pixed = []
pixed.append(layer(7,7,7,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(7,7,7,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(7,7,7,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,7,0,7,7,7,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,7,0,7,7,7,7,0,7,0,0,0,0)) 
pixed.append(layer(0,7,7,7,0,7,7,7,7,0,0,7,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,7,7,7,7,7,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,7,7,7,7,7,7,7,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,7,0,0,7,0,0,0,0,0,0,0,7,7)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,7,7,7)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,7,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0))
skinandflesh = combine(pixed)
pixed = []
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(7,7,7,0,0,7,0,0,0,7,7,7,0,0,0,0)) 
pixed.append(layer(7,7,7,0,0,7,0,0,0,0,7,0,7,0,0,0)) 
pixed.append(layer(0,0,0,0,7,0,0,0,0,7,7,0,7,0,0,0)) 
pixed.append(layer(0,0,7,7,7,7,0,0,0,0,0,7,7,0,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)) 
pixed.append(layer(0,0,0,0,7,7,7,0,7,7,7,7,7,7,0,0)) 
pixed.append(layer(7,0,0,0,0,0,0,7,7,7,7,7,7,7,7,0)) 
pixed.append(layer(7,0,0,0,0,0,0,7,7,7,7,7,7,7,0,0)) 
pixed.append(layer(7,7,0,0,0,0,0,0,0,7,0,0,0,0,0,0)) 
pixed.append(layer(7,7,0,0,0,0,0,0,0,0,0,0,7,0,0,0)) 
pixed.append(layer(7,7,0,0,0,0,0,0,0,0,0,7,7,7,0,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,7,7,7,0)) 
pixed.append(layer(0,0,0,0,0,0,0,0,0,0,0,0,0,0,7,0))
mario = overlay(combine(pixed),overlay(capandvest,skinandflesh))
show(mario)
#save_image('CC-TerenceChan-Jumpman')

