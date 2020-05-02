
void _exit();

void _start() {
    __asm__("int 0x80");
    __asm__("int 0x80");
    goto _exit;
}

void _exit() {
    __asm__("int 0x80");
}
