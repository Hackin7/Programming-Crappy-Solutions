all:
	gcc -m32 -c chal.s -o chal.o -fno-stack-protector -no-pie
	gcc -m32 -c solve.c -o solve.o -fno-stack-protector -no-pie
	gcc -m32 -o a.out solve.o chal.o -fno-stack-protector -no-pie
	./a.out
clean:
	rm a.out *.o
