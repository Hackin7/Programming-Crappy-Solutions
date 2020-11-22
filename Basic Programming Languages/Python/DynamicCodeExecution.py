### eval #####################################################################
#https://www.programiz.com/python-programming/methods/built-in/eval
# Only for 1 expression which must return a value
# eval(expression, globals=None, locals=None)
print('\n### eval() ############################################')

print('## 1. Normal ###')
print(eval("1 + 1"))

#############################
print('## 2. global and locals dictionary as parameters ###')

x = 0; print(eval("x == 1")) # Use current namespace

print(eval("x==1", {'x':1})) # With globals, reads from globals

print(eval("print(x==1)",{},{'x':2})) # With locals, reads from globals and locals

## Clearing globals in eval ##
import random
try: print(eval('random.randint(0,10)',{'__builtins__':None}, {}))
except Exception as e: print("If you set globals to {'__builtins__':None}, you block all access to global variables\n\t", e)

#############################

### exec ######################################################################
# Same concept as eval but can run code blocks
# Also doesn't return an expression this time
print('\n### exec() ############################################')

print('### 1. Normal ###')
exec("def test():print('test in exec()')\ntest()")

print('## 2. global and locals dictionary as parameters ###') ## It modifies the value of the global/ local dictionary if there is any var assignment

######## The global dictionary is modified ###############
g = {}; exec("test = lambda : print('test() made in exec')", g)
g['test']()
#print(g) # To show all global variables

######## The local dictionary only is modified ###########
g = {}
l = {}
exec("test = lambda : print('test() made in exec but stored in local')", g, l)
print('globals.get{"test"}:',g.get('test'))
print(l)

######### Can block access to global variables ############
exec("try:print()\nexcept: output('Cannot print()')",
       {'__builtins__':None, 'output':print}, 
       {'x':2}
     )
###########################################################

### compile ######################################################################
# https://www.programiz.com/python-programming/methods/built-in/compile
print('\n### compile() ############################################')

print('### 1. eval ###')
codeInString = '5==5'
codeObejct = compile(codeInString, 'a_random_name', 'eval')
print(eval(codeObejct))

print('### 2. exec ###')
codeInString = 'a = 5\nb=6\nsum=a+b\nprint("sum =",sum)'
codeObejct = compile(codeInString, 'a_random_name', 'exec')
exec(codeObejct)
