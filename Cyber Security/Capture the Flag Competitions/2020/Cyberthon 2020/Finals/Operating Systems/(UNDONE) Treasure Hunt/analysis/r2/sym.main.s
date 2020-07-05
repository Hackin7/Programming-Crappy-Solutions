/ (fcn) main 21
|   int main (int argc, char **argv, char **envp);
|           ; DATA XREF from entry0 @ 0x79d
|           0x0000088a      55             push rbp
|           0x0000088b      4889e5         mov rbp, rsp
|           0x0000088e      b800000000     mov eax, 0
|           0x00000893      e88d020000     call sym.menu
|           0x00000898      b800000000     mov eax, 0
|           0x0000089d      5d             pop rbp
\           0x0000089e      c3             ret
