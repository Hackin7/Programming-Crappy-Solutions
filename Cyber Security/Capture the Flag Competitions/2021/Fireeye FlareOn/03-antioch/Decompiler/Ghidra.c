INFO  Using log config file: jar:file:/root/ghidra/Ghidra/Framework/Generic/lib/Generic.jar!/generic.log4j.xml (LoggingInitialization)  
INFO  Using log file: /root/.ghidra/.ghidra_9.2.3_PUBLIC/application.log (LoggingInitialization)  
INFO  Loading user preferences: /root/.ghidra/.ghidra_9.2.3_PUBLIC/preferences (Preferences)  
INFO  Class search complete (1261 ms) (ClassSearcher)  
INFO  Initializing SSL Context (SSLContextInitializer)  
INFO  Initializing Random Number Generator... (SecureRandomFactory)  
INFO  Random Number Generator initialization complete: NativePRNGNonBlocking (SecureRandomFactory)  
INFO  Trust manager disabled, cacerts have not been set (ApplicationTrustManagerFactory)  
INFO  HEADLESS Script Paths:
    /root/ghidra/Ghidra/Features/Decompiler/ghidra_scripts
    /root/ghidra/Ghidra/Features/VersionTracking/ghidra_scripts
    /root/ghidra/Ghidra/Processors/PIC/ghidra_scripts
    /root/ghidra/Ghidra/Features/FunctionID/ghidra_scripts
    /root/ghidra/Ghidra/Features/Python/ghidra_scripts
    /root/ghidra/Ghidra/Processors/DATA/ghidra_scripts
    /root/ghidra/Ghidra/Features/BytePatterns/ghidra_scripts
    /root/ghidra/Ghidra/Processors/8051/ghidra_scripts
    /root/ghidra/Ghidra/Features/GnuDemangler/ghidra_scripts
    /root/ghidra/Ghidra/Features/FileFormats/ghidra_scripts
    /root/ghidra/Ghidra/Features/Base/ghidra_scripts (HeadlessAnalyzer)  
INFO  HEADLESS: execution starts (HeadlessAnalyzer)  
INFO  Creating project: /tmp/ghidra_test (HeadlessAnalyzer)  
INFO  Creating project: /tmp/ghidra_test (DefaultProject)  
INFO  REPORT: Processing input files:  (HeadlessAnalyzer)  
INFO       project: /tmp/ghidra_test (HeadlessAnalyzer)  
INFO  IMPORTING: /tmp/AntiochOS (HeadlessAnalyzer)  
INFO  REPORT: Import succeeded with language "x86:LE:64:default" and cspec "gcc" for file: /tmp/AntiochOS (HeadlessAnalyzer)  
INFO  ANALYZING all memory and code: /tmp/AntiochOS (HeadlessAnalyzer)  
INFO  Packed database cache: /tmp/root-Ghidra/packed-db-cache (PackedDatabaseCache)  
INFO  -----------------------------------------------------
    ASCII Strings                              0.491 secs
    Apply Data Archives                        0.419 secs
    Call Convention ID                         0.002 secs
    Call-Fixup Installer                       0.003 secs
    Create Address Tables                      0.011 secs
    Create Function                            0.000 secs
    DWARF                                      0.010 secs
    Data Reference                             0.011 secs
    Decompiler Switch Analysis                 0.003 secs
    Demangler GNU                              0.022 secs
    Disassemble Entry Points                   0.239 secs
    ELF Scalar Operand References              0.023 secs
    Embedded Media                             0.037 secs
    External Entry References                  0.000 secs
    Function ID                                0.053 secs
    Function Start Search                      0.036 secs
    Function Start Search After Code           0.007 secs
    Function Start Search After Data           0.002 secs
    GCC Exception Handlers                     0.106 secs
    Non-Returning Functions - Discovered       0.007 secs
    Non-Returning Functions - Known            0.002 secs
    Reference                                  0.014 secs
    Shared Return Calls                        0.007 secs
    Stack                                      0.152 secs
    Subroutine References                      0.007 secs
    x86 Constant Reference Analyzer            0.263 secs
-----------------------------------------------------
     Total Time   1 secs
-----------------------------------------------------
 (AutoAnalysisManager)  
INFO  REPORT: Analysis succeeded for file: /tmp/AntiochOS (HeadlessAnalyzer)  
INFO  SCRIPT: /root/ghidra_post_script.py (HeadlessAnalyzer)  
get_str_symbols

void get_str_symbols(undefined *param_1)

{ // V',`)(//\\\||||||||||||_______________
  *param_1 = 0x56;
  param_1[1] = 0x27;
  param_1[2] = 0x2c;
  param_1[3] = 0x60;
  param_1[4] = 0x29;
  param_1[5] = 0x28;
  param_1[6] = 0x2f;
  param_1[7] = 0x2f;
  param_1[8] = 0x5c;
  param_1[9] = 0x5c;
  param_1[10] = 0x5c;
  param_1[0xb] = 0x7c;
  param_1[0xc] = 0x7c;
  param_1[0xd] = 0x7c;
  param_1[0xe] = 0x7c;
  param_1[0xf] = 0x7c;
  param_1[0x10] = 0x7c;
  param_1[0x11] = 0x7c;
  param_1[0x12] = 0x7c;
  param_1[0x13] = 0x7c;
  param_1[0x14] = 0x7c;
  param_1[0x15] = 0x7c;
  param_1[0x16] = 0x7c;
  param_1[0x17] = 0x5f;
  param_1[0x18] = 0x5f;
  param_1[0x19] = 0x5f;
  param_1[0x1a] = 0x5f;
  param_1[0x1b] = 0x5f;
  param_1[0x1c] = 0x5f;
  param_1[0x1d] = 0x5f;
  param_1[0x1e] = 0x5f;
  param_1[0x1f] = 0x5f;
  param_1[0x20] = 0x5f;
  param_1[0x21] = 0x5f;
  param_1[0x22] = 0x5f;
  param_1[0x23] = 0x5f;
  param_1[0x24] = 0x5f;
  param_1[0x25] = 0x5f;
  return;
}


str_algo_1

undefined1 * str_algo_1(void)

{
  byte *pbVar1;
  byte *pbVar2;
  byte bVar3;
  
  if (DAT_00404080 == 0) {
    pbVar1 = &DAT_00404080;
    bVar3 = DAT_00404080;
    while( true ) {
      pbVar2 = pbVar1 + 1;
      *pbVar1 = bVar3 ^ 0x95;
      if (pbVar2 == &DAT_004040ab) break;
      bVar3 = *pbVar2;
      pbVar1 = pbVar2;
    }
  }
  return &DAT_00404081;
}


str_algo_2_consult_the_book_of_armaments

undefined1 * str_algo_2_consult_the_book_of_armaments(void)

{
  byte *pbVar1;
  byte *pbVar2;
  byte bVar3;
  
  if (DAT_00404060 == 0) {
    pbVar1 = &DAT_00404060;
    bVar3 = DAT_00404060;
    while( true ) {
      pbVar2 = pbVar1 + 1;
      *pbVar1 = bVar3 ^ 0xb2;
      if (pbVar2 == &DAT_00404080) break;
      bVar3 = *pbVar2;
      pbVar1 = pbVar2;
    }
  }
  return &DAT_00404061;
}


get_str_what_is_your_name

void get_str_what_is_your_name(undefined *param_1)

{
  *param_1 = 0x57;
  param_1[1] = 0x68;
  param_1[2] = 0x61;
  param_1[3] = 0x74;
  param_1[4] = 0x20;
  param_1[5] = 0x69;
  param_1[6] = 0x73;
  param_1[7] = 0x20;
  param_1[8] = 0x79;
  param_1[9] = 0x6f;
  param_1[10] = 0x75;
  param_1[0xb] = 0x72;
  param_1[0xc] = 0x20;
  param_1[0xd] = 0x6e;
  param_1[0xe] = 0x61;
  param_1[0xf] = 0x6d;
  param_1[0x10] = 0x65;
  param_1[0x11] = 0x3f;
  param_1[0x12] = 0x20;
  param_1[0x13] = 0;
  return;
}


get_str_what_is_your_quest

void get_str_what_is_your_quest(undefined *param_1)

{
  *param_1 = 0x57;
  param_1[1] = 0x68;
  param_1[2] = 0x61;
  param_1[3] = 0x74;
  param_1[4] = 0x20;
  param_1[5] = 0x69;
  param_1[6] = 0x73;
  param_1[7] = 0x20;
  param_1[8] = 0x79;
  param_1[9] = 0x6f;
  param_1[10] = 0x75;
  param_1[0xb] = 0x72;
  param_1[0xc] = 0x20;
  param_1[0xd] = 0x71;
  param_1[0xe] = 0x75;
  param_1[0xf] = 0x65;
  param_1[0x10] = 0x73;
  param_1[0x11] = 0x74;
  param_1[0x12] = 0x3f;
  param_1[0x13] = 0x20;
  param_1[0x14] = 0;
  return;
}


get_str_what_is_your__color

void get_str_what_is_your__color(undefined *param_1)

{
  *param_1 = 0x57;
  param_1[1] = 0x68;
  param_1[2] = 0x61;
  param_1[3] = 0x74;
  param_1[4] = 0x20;
  param_1[5] = 0x69;
  param_1[6] = 0x73;
  param_1[7] = 0x20;
  param_1[8] = 0x79;
  param_1[9] = 0x6f;
  param_1[10] = 0x75;
  param_1[0xb] = 0x72;
  param_1[0xc] = 0x20;
  param_1[0xd] = 0x66;
  param_1[0xe] = 0x61;
  param_1[0xf] = 0x76;
  param_1[0x10] = 0x6f;
  param_1[0x11] = 0x72;
  param_1[0x12] = 0x69;
  param_1[0x13] = 0x74;
  param_1[0x14] = 0x65;
  param_1[0x15] = 0x20;
  param_1[0x16] = 99;
  param_1[0x17] = 0x6f;
  param_1[0x18] = 0x6c;
  param_1[0x19] = 0x6f;
  param_1[0x1a] = 0x72;
  param_1[0x1b] = 0x3f;
  param_1[0x1c] = 0x20;
  param_1[0x1d] = 0;
  return;
}


str_algo_3

undefined1 * str_algo_3(void)

{
  byte *pbVar1;
  byte *pbVar2;
  byte bVar3;
  
  if (DAT_00404020 == 0) {
    pbVar1 = &DAT_00404020;
    bVar3 = DAT_00404020;
    while( true ) {
      pbVar2 = pbVar1 + 1;
      *pbVar1 = bVar3 ^ 0x9d;
      if (pbVar2 == &DAT_00404046) break;
      bVar3 = *pbVar2;
      pbVar1 = pbVar2;
    }
  }
  return &DAT_00404021;
}


str_algo_4

undefined1 * str_algo_4(void)

{
  byte *pbVar1;
  byte *pbVar2;
  byte bVar3;
  
  if (DAT_00404000 == 0) {
    pbVar1 = &DAT_00404000;
    bVar3 = DAT_00404000;
    while( true ) {
      pbVar2 = pbVar1 + 1;
      *pbVar1 = bVar3 ^ 0xbe;
      if (pbVar2 == &DAT_00404015) break;
      byteVar = *pbVar2;
      pbVar1 = pbVar2;
    }
  }
  return &DAT_00404001;
}


get_str_type_help_for_help

void get_str_type_help_for_help(undefined *param_1)

{
  *param_1 = 0x54;
  param_1[1] = 0x79;
  param_1[2] = 0x70;
  param_1[3] = 0x65;
  param_1[4] = 0x20;
  param_1[5] = 0x68;
  param_1[6] = 0x65;
  param_1[7] = 0x6c;
  param_1[8] = 0x70;
  param_1[9] = 0x20;
  param_1[10] = 0x66;
  param_1[0xb] = 0x6f;
  param_1[0xc] = 0x72;
  param_1[0xd] = 0x20;
  param_1[0xe] = 0x68;
  param_1[0xf] = 0x65;
  param_1[0x10] = 0x6c;
  param_1[0x11] = 0x70;
  param_1[0x12] = 10;
  param_1[0x13] = 0;
  return;
}


get_str_quit

void get_str_quit(undefined *param_1)

{
  *param_1 = 0x71;
  param_1[1] = 0x75;
  param_1[2] = 0x69;
  param_1[3] = 0x74;
  param_1[4] = 10;
  param_1[5] = 0;
  return;
}


get_str_help

void get_str_help(undefined *param_1)

{
  *param_1 = 0x68;
  param_1[1] = 0x65;
  param_1[2] = 0x6c;
  param_1[3] = 0x70;
  param_1[4] = 10;
  param_1[5] = 0;
  return;
}


get_str_consult

void get_str_consult(undefined *param_1)

{
  *param_1 = 99;
  param_1[1] = 0x6f;
  param_1[2] = 0x6e;
  param_1[3] = 0x73;
  param_1[4] = 0x75;
  param_1[5] = 0x6c;
  param_1[6] = 0x74;
  param_1[7] = 10;
  param_1[8] = 0;
  return;
}


get_str_approach

void get_str_approach(undefined *param_1)

{
  *param_1 = 0x61;
  param_1[1] = 0x70;
  param_1[2] = 0x70;
  param_1[3] = 0x72;
  param_1[4] = 0x6f;
  param_1[5] = 0x61;
  param_1[6] = 99;
  param_1[7] = 0x68;
  param_1[8] = 10;
  param_1[9] = 0;
  return;
}


getText

undefined1 * getText(void)

{
  byte *ptr;
  byte *ptr2;
  byte byteVar;
  
  if (DAT_004040c0 == 0) {
    ptr = &DAT_004040c0;
    byteVar = DAT_004040c0;
    while( true ) {
      ptr2 = ptr + 1;
      *ptr = byteVar ^ 0x8b;
      if (ptr2 == (byte *)0x4040e6) break;
      byteVar = *ptr2;
      ptr = ptr2;
    }
  }
  return &DAT_004040c1;
}


help

void help(void)

{
  undefined8 uVar1;
  
  uVar1 = str_algo_1(); // Help text
  fun_syswrite(1,uVar1,0x2a);
  fun_syswrite(1,"...AAARGH\n\n",0xb);
  return;
}


consult

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void consult(void)

{
  int file;
  undefined8 uVar2;
  undefined8 *str1;
  long lVar4;
  undefined uVar5;
  byte *pbVar6;
  byte charVar;
  ulong local_str___dat;
  byte local_2028 [4096];
  undefined8 local_1028 [512];
  
  lVar4 = 0x200;
  charVar = 0x61; //'a'
  local_str___dat = 0x7461642e2e;
  str1 = local_1028;
  while (lVar4 != 0) {
    lVar4 = lVar4 + -1;
    *str1 = 0;
    str1 = str1 + 1;
  }
  uVar2 = str_algo_2_consult_the_book_of_armaments(); //consukt message
  fun_syswrite(1,uVar2,0x1f);
  fun_sysselect(2);
  do {
    while( true ) {
      local_str___dat = local_str___dat & 0xffffffffffffff00 | (ulong)charVar;
      file = fun_sysopen(&local_str___dat);
      if (file < 0) break;
      fun_sysread(file,local_2028,0x1000);
      fun_sysclose(file);
      str1 = local_1028;
      pbVar6 = local_2028;
      do {
        *(byte *)str1 = *(byte *)str1 ^ *pbVar6;
        str1 = (undefined8 *)((long)str1 + 1);
        pbVar6 = pbVar6 + 1;
      } while (str1 != (undefined8 *)&stack0xffffffffffffffd8);
      charVar = charVar + 1;
      if (charVar == '{') goto assignment;
    }
    charVar = charVar + 1;
  } while (charVar != '{'); // Loop from a to z
assignment:
  if (DAT_00404100 == '\0') {
    _DAT_00404100 = s__________________00402240._0_8_;
    uRam0000000000404108 = s__________________00402240._8_8_;
    _DAT_00404110 = s__________________00402240._0_8_;
    uRam0000000000404118 = s__________________00402240._8_8_;
    _DAT_00404120 = s__________________00402240._0_8_;
    uRam0000000000404128 = s__________________00402240._8_8_;
    _DAT_00404130 = s__________________00402240._0_8_;
    uRam0000000000404138 = s__________________00402240._8_8_;
    _DAT_00404140 = s__________________00402240._0_8_;
    uRam0000000000404148 = s__________________00402240._8_8_;
    _DAT_00404150 = s__________________00402240._0_8_;
    uRam0000000000404158 = s__________________00402240._8_8_;
    _DAT_00404160 = s__________________00402240._0_8_;
    uRam0000000000404168 = s__________________00402240._8_8_;
    _DAT_00404170 = s__________________00402240._0_8_;
    uRam0000000000404178 = s__________________00402240._8_8_;
    _DAT_00404180 = s__________________00402240._0_8_;
    uRam0000000000404188 = s__________________00402240._8_8_;
    _DAT_00404190 = s__________________00402240._0_8_;
    uRam0000000000404198 = s__________________00402240._8_8_;
    _DAT_004041a0 = s__________________00402240._0_8_;
    uRam00000000004041a8 = s__________________00402240._8_8_;
    _DAT_004041b0 = s__________________00402240._0_8_;
    uRam00000000004041b8 = s__________________00402240._8_8_;
    _DAT_004041c0 = s__________________00402240._0_8_;
    uRam00000000004041c8 = s__________________00402240._8_8_;
    _DAT_004041d0 = s__________________00402240._0_8_;
    uRam00000000004041d8 = s__________________00402240._8_8_;
    _DAT_004041e0 = s__________________00402240._0_8_;
    uRam00000000004041e8 = s__________________00402240._8_8_;
    _DAT_004041f0 = s__________________00402240._0_8_;
    uRam00000000004041f8 = s__________________00402240._8_8_;
    get_str_symbols(s__________________00402240._0_8_,&DAT_00404100);
  }
  lVar4 = 0;
  do {
    uVar5 = 10;
    if (((uint)lVar4 & 0xf) != 0xf) {
      uVar5 = (&DAT_00404100)[*(byte *)((long)local_1028 + lVar4)];
    }
    *(undefined *)((long)local_1028 + lVar4) = uVar5;
    lVar4 = lVar4 + 1;
  } while (lVar4 != 0x1000);
  fun_syswrite(1,local_1028,0x1000);
  return;
}


approach

void approach(void)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  undefined8 no_bytes_read;
  long lVar6;
  int *piVar7;
  uint *puVar8;
  uint *str_in;
  ulong uVar10;
  bool bVar11;
  undefined local_b9;
  undefined local_buf_out [32];
  uint local_buf_in [32];
  
  uVar10 = 0;
  local_b9 = 10;
  no_bytes_read = str_algo_3();
  fun_syswrite(1,no_bytes_read,0x25);
  fun_sysselect(1);
  get_str_what_is_your_name(local_buf_out);
  fun_syswrite(1,local_buf_out,0x13);
  no_bytes_read = fun_sysread(0,local_buf_in,0x80); // no. bytes read
  iVar1 = encoding_input(local_buf_in,no_bytes_read); //
  piVar7 = &DAT_0040200c; //Reference String
  // 43dd282 02000000 149254d8  e52e4700 1d000000, 
  iVar2 = -0x4a6c6a57; // -124861909, b59395a9 -> 3046348201
  while (iVar2 != iVar1) {
    /* count till 30 */
    uVar4 = (int)uVar10 + 1;
    uVar10 = (ulong)uVar4;
    if (uVar4 == 30) goto argh_fail;
    /* get curr byte   */
    iVar2 = *piVar7;
    piVar7 = piVar7 + 3;
  }
  get_str_what_is_your_quest(local_buf_out);
  fun_syswrite(1,local_buf_out,0x14);
  lVar6 = fun_sysread(0,local_buf_in,0x80);
  if (1 < lVar6) {
    get_str_what_is_your__color(local_buf_out);
    fun_syswrite(1,local_buf_out,0x1d);
    no_bytes_read = fun_sysread(0,local_buf_in,0x80);
    iVar2 = encoding_input(local_buf_in,no_bytes_read);
    
    // DAT_00402004
    // 29 ab b5 1b 0e 00 00 00 4b d0 fd 5e c8 68 84 3f 12 00 00 00 d0 85 ed ec 82 48 3d d2
    if (((&DAT_00402004)[uVar10 * 3] == iVar2) && ('\0' < (char)(&DAT_00402008)[uVar10 * 0xc])) {
      num_to_string((int)(char)(&DAT_00402008)[uVar10 * 0xc],local_buf_in);
      no_bytes_read = str_algo_4();
      fun_syswrite(1,no_bytes_read,0x14);
      str_in = local_buf_in;
      do {
        puVar8 = str_in;
        uVar3 = *puVar8 + 0xfefefeff & ~*puVar8;
        uVar4 = uVar3 & 0x80808080;
        str_in = puVar8 + 1;
      } while (uVar4 == 0);
      bVar11 = (uVar3 & 0x8080) == 0;
      if (bVar11) {
        uVar4 = uVar4 >> 0x10;
      }
      if (bVar11) {
        str_in = (uint *)((long)puVar8 + 6);
      }
      fun_syswrite(1,local_buf_in,
                   (long)str_in + ((-3 - (ulong)CARRY1((byte)uVar4,(byte)uVar4)) - (long)local_buf_in),
                   (uint *)((long)puVar8 + 6));
      fun_syswrite(1,&local_b9,1);
      return;
    }
  }
argh_fail:
  fun_syswrite(1,"...AAARGH\n\n",0xb);
  return;
}


entry

void entry(void)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  undefined auStack184 [32];
  undefined2 local_buf [68];
  
  uVar2 = getText();
  fun_syswrite(1,uVar2,0x25);
  get_str_type_help_for_help(local_buf);
  fun_syswrite(1,local_buf,0x13);
  while( true ) {
    local_buf[0] = 0x203e;
    fun_syswrite(1,local_buf,2);
    lVar3 = fun_sysread(0,local_buf,0x80);
    if (lVar3 == 0) break;
    get_str_quit(auStack184);
    iVar1 = local_strncmp(local_buf,auStack184,5);
    if (iVar1 == 0) break;
    get_str_help(auStack184);
    iVar1 = local_strncmp(local_buf,auStack184,5);
    if (iVar1 == 0) {
      help();
    }
    else {
      get_str_consult(auStack184);
      iVar1 = local_strncmp(local_buf,auStack184,8);
      if (iVar1 == 0) {
        consult();
      }
      else {
        get_str_approach(auStack184);
        iVar1 = local_strncmp(local_buf,auStack184,9);
        if (iVar1 == 0) {
          approach();
        }
      }
    }
  }
  fun_sysexit(0);
  return;
}


fun_syscall_concat88

undefined  [16]
fun_syscall_concat88(undefined8 param_1,undefined8 offset,undefined8 param_3,undefined8 param_4)

{
  syscall();
  return CONCAT88(param_4,param_1);
}


fun_sysstat

void fun_sysstat(undefined8 param_1)

{
  undefined auStack152 [152];
  
  fun_syscall_concat88(4,param_1,auStack152);
  return;
}


fun_sysopen

void fun_sysopen(undefined8 param_1)

{
  fun_syscall_concat88(2,param_1,0,0);
  return;
}


fun_syswrite

long fun_syswrite(undefined4 param_1,undefined8 offset,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = fun_syscall_concat88(1,param_1,offset,param_3);
  return (long)iVar1;
}


fun_sysread

long fun_sysread(undefined4 param_1,undefined8 offset,undefined8 param_3)

{
  int iVar1;
  
  iVar1 = fun_syscall_concat88(0,param_1,offset,param_3);
  return (long)iVar1;
}


fun_sysclose

void fun_sysclose(undefined4 param_1)

{
  fun_syscall_concat88(3,param_1);
  return;
}


fun_sysselect

void fun_sysselect(int param_1)

{ //syscall 23
  long local_18;
  undefined8 local_10;
  
  local_18 = (long)param_1;
  local_10 = 0;
  fun_syscall_concat88(0x17,0,0,0,0,&local_18);
  return;
}


fun_sysexit

void fun_sysexit(undefined4 param_1)

{// syscall 60
  fun_syscall_concat88(0x3c,param_1);
  return;
}


local_strncmp

undefined8 local_strncmp(long param_1,long offset,long param_3)

{
  long lVar1;
  
  if (param_3 != 0) {
    lVar1 = 0;
    do {
      if (*(char *)(param_1 + lVar1) != *(char *)(offset + lVar1)) {
        return 1;
      }
    } while ((*(char *)(param_1 + lVar1) != '\0') && (lVar1 = lVar1 + 1, param_3 != lVar1));
  }
  return 0;
}


num_to_string
//int to string
char * num_to_string(ulong param_1,char *offset)

{
  param_1 = param_1 & 0xffffffff;
  if (9 < (uint)param_1) {
    offset = (char *)num_to_string(param_1 / 10);
  }
  offset[1] = '\0';
  *offset = (char)param_1 + (char)(param_1 / 10) * -10 + '0';
  return offset + 1; //Character
}


encoding_input

uint encoding_input(byte *input,int size)

{
  byte *end;
  byte character;
  uint result;
  
  if (0 < size) {
    end = input + (ulong)(size - 1) + 1;
    result = 0xffffffff; //32
    do {
      character = *input;
      input = input + 1;
      // DAT_00402260
      // (00 00 00 00) 96 30 07 77  2c 61 0e ee ba 51 09 99
      // (19 c4 6d 07) 8f f4 6a 70  35 a5 63 e9 a3 95 64 9e
      // 32 88 db 0e a4 b8 dc 79  1e e9 d5 e0 88 d9 d2 97 
      // 2b 4c b6 09 bd 7c b1 7e  07 2d b8 e7 91 1d bf 90
      // 64 10 b7 1d f2 20 b0 6a  48 71 b9 f3 de 41 be 84
      // 7d d4 da 1a eb e4 dd 6d  51 b5 d4 f4 c7 85 d3 83
      // 56 98 6c 13 c0 a8 6b 64  7a f9 62 fd ec c9 65 8a
      // 4f 5c 01 14 d9 6c 06 63  63 3d 0f fa f5 0d 08 8d
      // c8 20 6e 3b 5e 10 69 4c  e4 41 60 d5 72 71 67 a2
      // d1 e4 03 3c 47 d4 04 4b  fd 85 0d d2 6b b5 0a a5
      // fa a8 b5 35 6c 98 b2 42  d6 c9 bb db 40 f9 bc ac
      ulong index = (ulong)((character ^ result) & 0xff) * 4;
      a = result >> 8; 
      result = a ^ *(uint *)(&DAT_00402260 + index);
    } while (end != input);
    return ~result;
  }
  return 0;
}

/*

*/ 

INFO  ANALYZING changes made by post scripts: /tmp/AntiochOS (HeadlessAnalyzer)  
INFO  REPORT: Post-analysis succeeded for file: /tmp/AntiochOS (HeadlessAnalyzer)  
INFO  REPORT: Save succeeded for file: /AntiochOS (HeadlessAnalyzer)  
