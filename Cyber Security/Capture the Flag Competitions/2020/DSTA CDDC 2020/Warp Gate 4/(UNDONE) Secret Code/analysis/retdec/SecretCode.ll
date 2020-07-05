source_filename = "test"
target datalayout = "e-p:32:32-f64:32:64-f80:32-n8:16:32-S128"

@global_var_380 = local_unnamed_addr global i32 103
@global_var_320 = local_unnamed_addr constant [9 x i8] c"oneTable\00"
@global_var_183 = local_unnamed_addr global i32 0
@global_var_170 = global i32 1
@global_var_a00 = constant i32* @global_var_170
@global_var_1c3 = local_unnamed_addr global i32** @global_var_a00
@global_var_203 = local_unnamed_addr global i32 0
@global_var_243 = local_unnamed_addr global i32 0
@global_var_283 = local_unnamed_addr constant [4 x i8] c"o.6\00"
@global_var_2a5 = local_unnamed_addr constant [5 x i8] c"puts\00"
@0 = external global i32

define i32 @_init() local_unnamed_addr {
dec_label_pc_420:
  %eax.0.reg2mem = alloca i32, !insn.addr !0
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__x86.get_pc_thunk.bx(i32 %0), !insn.addr !1
  %2 = add i32 %0, 7115, !insn.addr !2
  %3 = inttoptr i32 %2 to i32*, !insn.addr !2
  %4 = load i32, i32* %3, align 4, !insn.addr !2
  %5 = icmp eq i32 %4, 0, !insn.addr !3
  store i32 0, i32* %eax.0.reg2mem, !insn.addr !4
  br i1 %5, label %dec_label_pc_43e, label %dec_label_pc_439, !insn.addr !4

dec_label_pc_439:                                 ; preds = %dec_label_pc_420
  %6 = call i32 @function_4b8(), !insn.addr !5
  store i32 %6, i32* %eax.0.reg2mem, !insn.addr !5
  br label %dec_label_pc_43e, !insn.addr !5

dec_label_pc_43e:                                 ; preds = %dec_label_pc_439, %dec_label_pc_420
  %eax.0.reload = load i32, i32* %eax.0.reg2mem
  ret i32 %eax.0.reload, !insn.addr !6
}

define i32 @function_460(i32 %arg1) local_unnamed_addr {
dec_label_pc_460:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !7
}

define i32 @function_470() local_unnamed_addr {
dec_label_pc_470:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !8
}

define i32 @function_480(i32* %arg1) local_unnamed_addr {
dec_label_pc_480:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !9
}

define i32 @function_490(i32 %arg1, i32 %arg2, i32* %arg3, i32 %arg4, i32 %arg5) local_unnamed_addr {
dec_label_pc_490:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !10
}

define i32 @function_4a0(i32 %arg1, i32* %arg2) local_unnamed_addr {
dec_label_pc_4a0:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !11
}

define i32 @function_4b0(i32 %arg1) local_unnamed_addr {
dec_label_pc_4b0:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !12
}

define i32 @function_4b8() local_unnamed_addr {
dec_label_pc_4b8:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !13
}

define i32 @_start(i32 %arg1) local_unnamed_addr {
dec_label_pc_4c0:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__decompiler_undefined_function_0()
  %2 = call i32 @__decompiler_undefined_function_0()
  %stack_var_-4 = alloca i32, align 4
  %stack_var_4 = alloca i32, align 4
  %3 = call i32 @function_4f2(i32 %1, i32* nonnull %stack_var_-4, i32 %2), !insn.addr !14
  %4 = add i32 %0, 896, !insn.addr !15
  %5 = add i32 %0, 800, !insn.addr !16
  %6 = add i32 %0, 6952, !insn.addr !17
  %7 = inttoptr i32 %6 to i32*, !insn.addr !17
  %8 = load i32, i32* %7, align 4, !insn.addr !17
  %9 = call i32 @function_490(i32 %8, i32 %arg1, i32* nonnull %stack_var_4, i32 %5, i32 %4), !insn.addr !18
  %10 = call i32 @__asm_hlt(), !insn.addr !19
  unreachable, !insn.addr !19
}

define i32 @function_4f2(i32 %arg1, i32* %arg2, i32 %arg3) local_unnamed_addr {
dec_label_pc_4f2:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !20
}

define i32 @__x86.get_pc_thunk.bx(i32 %arg1) local_unnamed_addr {
dec_label_pc_500:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !21
}

define i32 @deregister_tm_clones() local_unnamed_addr {
dec_label_pc_510:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__x86.get_pc_thunk.dx(i32 ptrtoint (i32* @0 to i32)), !insn.addr !22
  %2 = add i32 %0, 6899, !insn.addr !23
  ret i32 %2, !insn.addr !24
}

define i32 @register_tm_clones() local_unnamed_addr {
dec_label_pc_550:
  %0 = call i32 @__x86.get_pc_thunk.dx(i32 ptrtoint (i32* @0 to i32)), !insn.addr !25
  ret i32 0, !insn.addr !26
}

define i32 @__do_global_dtors_aux() local_unnamed_addr {
dec_label_pc_5a0:
  %eax.0.reg2mem = alloca i32, !insn.addr !27
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__x86.get_pc_thunk.bx(i32 %0), !insn.addr !28
  %2 = add i32 %0, 6751, !insn.addr !29
  %3 = inttoptr i32 %2 to i8*, !insn.addr !29
  %4 = load i8, i8* %3, align 1, !insn.addr !29
  %5 = icmp eq i8 %4, 0, !insn.addr !29
  %6 = icmp eq i1 %5, false, !insn.addr !30
  store i32 %1, i32* %eax.0.reg2mem, !insn.addr !30
  br i1 %6, label %dec_label_pc_5e2, label %dec_label_pc_5bb, !insn.addr !30

dec_label_pc_5bb:                                 ; preds = %dec_label_pc_5a0
  %7 = add i32 %0, 6727, !insn.addr !31
  %8 = inttoptr i32 %7 to i32*, !insn.addr !31
  %9 = load i32, i32* %8, align 4, !insn.addr !31
  %10 = icmp eq i32 %9, 0, !insn.addr !32
  br i1 %10, label %dec_label_pc_5d6, label %dec_label_pc_5c5, !insn.addr !33

dec_label_pc_5c5:                                 ; preds = %dec_label_pc_5bb
  %11 = add i32 %0, 6747, !insn.addr !34
  %12 = inttoptr i32 %11 to i32*, !insn.addr !34
  %13 = load i32, i32* %12, align 4, !insn.addr !34
  %14 = call i32 @function_4b0(i32 %13), !insn.addr !35
  br label %dec_label_pc_5d6, !insn.addr !36

dec_label_pc_5d6:                                 ; preds = %dec_label_pc_5c5, %dec_label_pc_5bb
  %15 = call i32 @deregister_tm_clones(), !insn.addr !37
  store i8 1, i8* %3, align 1, !insn.addr !38
  store i32 %15, i32* %eax.0.reg2mem, !insn.addr !38
  br label %dec_label_pc_5e2, !insn.addr !38

dec_label_pc_5e2:                                 ; preds = %dec_label_pc_5d6, %dec_label_pc_5a0
  %eax.0.reload = load i32, i32* %eax.0.reg2mem
  ret i32 %eax.0.reload, !insn.addr !39
}

define i32 @frame_dummy() local_unnamed_addr {
dec_label_pc_5f0:
  %0 = call i32 @register_tm_clones(), !insn.addr !40
  ret i32 %0, !insn.addr !40
}

define i32 @__x86.get_pc_thunk.dx(i32 %arg1) local_unnamed_addr {
dec_label_pc_5f9:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !41
}

define i32 @check(i32 %arg1) local_unnamed_addr {
dec_label_pc_5fd:
  %eax.0.reg2mem = alloca i32, !insn.addr !42
  %indvars.iv.reg2mem = alloca i32, !insn.addr !42
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__decompiler_undefined_function_0()
  %2 = call i32 @__decompiler_undefined_function_0()
  %3 = call i32 @__decompiler_undefined_function_0()
  %stack_var_-55 = alloca i32, align 4
  %stack_var_-4 = alloca i32, align 4
  %4 = call i32 @__x86.get_pc_thunk.ax(i32 %3, i32 %1, i32 %0, i32 %2), !insn.addr !43
  %5 = call i32 @__readgsdword(i32 20), !insn.addr !44
  store i32 1128547395, i32* %stack_var_-55, align 4, !insn.addr !45
  %6 = icmp eq i32 %arg1, -267531522
  %7 = icmp eq i1 %6, false, !insn.addr !46
  br i1 %7, label %dec_label_pc_6dc, label %dec_label_pc_6c4.preheader, !insn.addr !46

dec_label_pc_6c4.preheader:                       ; preds = %dec_label_pc_5fd
  %8 = ptrtoint i32* %stack_var_-4 to i32, !insn.addr !47
  %9 = add i32 %8, -44, !insn.addr !48
  store i32 0, i32* %indvars.iv.reg2mem
  br label %dec_label_pc_69d

dec_label_pc_69d:                                 ; preds = %dec_label_pc_69d, %dec_label_pc_6c4.preheader
  %indvars.iv.reload = load i32, i32* %indvars.iv.reg2mem
  %10 = add i32 %9, %indvars.iv.reload, !insn.addr !49
  %11 = inttoptr i32 %10 to i8*, !insn.addr !49
  %12 = load i8, i8* %11, align 1, !insn.addr !49
  %13 = trunc i32 %indvars.iv.reload to i8
  %14 = xor i8 %12, %13
  store i8 %14, i8* %11, align 1, !insn.addr !50
  %indvars.iv.next = add nuw nsw i32 %indvars.iv.reload, 1
  %exitcond = icmp eq i32 %indvars.iv.next, 14
  store i32 %indvars.iv.next, i32* %indvars.iv.reg2mem, !insn.addr !51
  br i1 %exitcond, label %dec_label_pc_6ca, label %dec_label_pc_69d, !insn.addr !51

dec_label_pc_6ca:                                 ; preds = %dec_label_pc_69d
  %15 = call i32 @function_480(i32* nonnull %stack_var_-55), !insn.addr !52
  br label %dec_label_pc_6dc, !insn.addr !53

dec_label_pc_6dc:                                 ; preds = %dec_label_pc_6ca, %dec_label_pc_5fd
  %16 = call i32 @__readgsdword(i32 20), !insn.addr !54
  %17 = icmp eq i32 %5, %16, !insn.addr !54
  store i32 0, i32* %eax.0.reg2mem, !insn.addr !55
  br i1 %17, label %dec_label_pc_6ee, label %dec_label_pc_6e9, !insn.addr !55

dec_label_pc_6e9:                                 ; preds = %dec_label_pc_6dc
  %18 = call i32 @__stack_chk_fail_local(), !insn.addr !56
  store i32 %18, i32* %eax.0.reg2mem, !insn.addr !56
  br label %dec_label_pc_6ee, !insn.addr !56

dec_label_pc_6ee:                                 ; preds = %dec_label_pc_6e9, %dec_label_pc_6dc
  %eax.0.reload = load i32, i32* %eax.0.reg2mem
  ret i32 %eax.0.reload, !insn.addr !57
}

define i32 @main(i32 %argc, i8** %argv) local_unnamed_addr {
dec_label_pc_6f6:
  %eax.0.reg2mem = alloca i32, !insn.addr !58
  %0 = call i32 @__decompiler_undefined_function_0()
  %stack_var_-24 = alloca i32, align 4
  %stack_var_4 = alloca i32, align 4
  %1 = ptrtoint i32* %stack_var_4 to i32, !insn.addr !59
  %2 = call i32 @__x86.get_pc_thunk.bx(i32 %1), !insn.addr !60
  %3 = call i32 @__readgsdword(i32 20), !insn.addr !61
  store i32 0, i32* %stack_var_-24, align 4, !insn.addr !62
  %4 = add i32 %0, 387, !insn.addr !63
  %5 = inttoptr i32 %4 to i32*, !insn.addr !64
  %6 = call i32 @function_480(i32* %5), !insn.addr !64
  %7 = add i32 %0, 451, !insn.addr !65
  %8 = inttoptr i32 %7 to i32*, !insn.addr !66
  %9 = call i32 @function_480(i32* %8), !insn.addr !66
  %10 = add i32 %0, 515, !insn.addr !67
  %11 = inttoptr i32 %10 to i32*, !insn.addr !68
  %12 = call i32 @function_480(i32* %11), !insn.addr !68
  %13 = add i32 %0, 579, !insn.addr !69
  %14 = inttoptr i32 %13 to i32*, !insn.addr !70
  %15 = call i32 @function_480(i32* %14), !insn.addr !70
  %16 = add i32 %0, 643, !insn.addr !71
  %17 = call i32 @function_460(i32 %16), !insn.addr !72
  %18 = add i32 %0, 677, !insn.addr !73
  %19 = call i32 @function_4a0(i32 %18, i32* nonnull %stack_var_-24), !insn.addr !74
  %20 = load i32, i32* %stack_var_-24, align 4
  %21 = call i32 @check(i32 %20)
  %22 = call i32 @__readgsdword(i32 20), !insn.addr !75
  %23 = icmp eq i32 %3, %22, !insn.addr !75
  store i32 0, i32* %eax.0.reg2mem, !insn.addr !76
  br i1 %23, label %dec_label_pc_7d5, label %dec_label_pc_7d0, !insn.addr !76

dec_label_pc_7d0:                                 ; preds = %dec_label_pc_6f6
  %24 = call i32 @__stack_chk_fail_local(), !insn.addr !77
  store i32 %24, i32* %eax.0.reg2mem, !insn.addr !77
  br label %dec_label_pc_7d5, !insn.addr !77

dec_label_pc_7d5:                                 ; preds = %dec_label_pc_7d0, %dec_label_pc_6f6
  %eax.0.reload = load i32, i32* %eax.0.reg2mem
  ret i32 %eax.0.reload, !insn.addr !78
}

define i32 @__x86.get_pc_thunk.ax(i32 %arg1, i32 %arg2, i32 %arg3, i32 %arg4) local_unnamed_addr {
dec_label_pc_7df:
  ret i32 %arg1, !insn.addr !79
}

define i32 @__libc_csu_init(i32 %arg1) local_unnamed_addr {
dec_label_pc_845:
  %0 = call i32 @__decompiler_undefined_function_0()
  %stack_var_-28 = alloca i32, align 4
  %1 = call i32 @__x86.get_pc_thunk.bx(i32 %0), !insn.addr !80
  %2 = ptrtoint i32* %stack_var_-28 to i32, !insn.addr !81
  %3 = call i32 @_init(), !insn.addr !82
  %4 = add i32 %2, -8, !insn.addr !83
  %5 = inttoptr i32 %4 to i32*, !insn.addr !83
  %6 = add i32 %2, 36, !insn.addr !84
  %7 = inttoptr i32 %6 to i32*, !insn.addr !84
  %8 = add i32 %2, -12, !insn.addr !84
  %9 = inttoptr i32 %8 to i32*, !insn.addr !84
  %10 = add i32 %2, 32, !insn.addr !85
  %11 = inttoptr i32 %10 to i32*, !insn.addr !85
  %12 = add i32 %2, -16, !insn.addr !85
  %13 = inttoptr i32 %12 to i32*, !insn.addr !85
  store i32 %arg1, i32* %5, align 4, !insn.addr !83
  %14 = load i32, i32* %7, align 4, !insn.addr !84
  store i32 %14, i32* %9, align 4, !insn.addr !84
  %15 = load i32, i32* %11, align 4, !insn.addr !85
  store i32 %15, i32* %13, align 4, !insn.addr !85
  %16 = add i32 %0, 5843, !insn.addr !86
  ret i32 %16, !insn.addr !87
}

define i32 @__libc_csu_fini() local_unnamed_addr {
dec_label_pc_850:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !88
}

define i32 @__stack_chk_fail_local() local_unnamed_addr {
dec_label_pc_860:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__x86.get_pc_thunk.bx(i32 %0), !insn.addr !89
  %2 = call i32 @function_470(), !insn.addr !90
  ret i32 %2, !insn.addr !90
}

define i32 @_fini() local_unnamed_addr {
dec_label_pc_874:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__x86.get_pc_thunk.bx(i32 %0), !insn.addr !91
  ret i32 %1, !insn.addr !92
}

declare i32 @__asm_hlt() local_unnamed_addr

declare i32 @__readgsdword(i32) local_unnamed_addr

declare i32 @__decompiler_undefined_function_0() local_unnamed_addr

!0 = !{i64 1056}
!1 = !{i64 1060}
!2 = !{i64 1071}
!3 = !{i64 1077}
!4 = !{i64 1079}
!5 = !{i64 1081}
!6 = !{i64 1090}
!7 = !{i64 1120}
!8 = !{i64 1136}
!9 = !{i64 1152}
!10 = !{i64 1168}
!11 = !{i64 1184}
!12 = !{i64 1200}
!13 = !{i64 1208}
!14 = !{i64 1227}
!15 = !{i64 1238}
!16 = !{i64 1245}
!17 = !{i64 1254}
!18 = !{i64 1260}
!19 = !{i64 1265}
!20 = !{i64 1269}
!21 = !{i64 1283}
!22 = !{i64 1296}
!23 = !{i64 1313}
!24 = !{i64 1352}
!25 = !{i64 1360}
!26 = !{i64 1430}
!27 = !{i64 1440}
!28 = !{i64 1444}
!29 = !{i64 1458}
!30 = !{i64 1465}
!31 = !{i64 1467}
!32 = !{i64 1473}
!33 = !{i64 1475}
!34 = !{i64 1480}
!35 = !{i64 1486}
!36 = !{i64 1491}
!37 = !{i64 1494}
!38 = !{i64 1499}
!39 = !{i64 1510}
!40 = !{i64 1524}
!41 = !{i64 1532}
!42 = !{i64 1533}
!43 = !{i64 1542}
!44 = !{i64 1555}
!45 = !{i64 1570}
!46 = !{i64 1685}
!47 = !{i64 1534}
!48 = !{i64 1697}
!49 = !{i64 1700}
!50 = !{i64 1718}
!51 = !{i64 1736}
!52 = !{i64 1748}
!53 = !{i64 1753}
!54 = !{i64 1760}
!55 = !{i64 1767}
!56 = !{i64 1769}
!57 = !{i64 1781}
!58 = !{i64 1782}
!59 = !{i64 1796}
!60 = !{i64 1800}
!61 = !{i64 1811}
!62 = !{i64 1822}
!63 = !{i64 1832}
!64 = !{i64 1839}
!65 = !{i64 1850}
!66 = !{i64 1857}
!67 = !{i64 1868}
!68 = !{i64 1875}
!69 = !{i64 1886}
!70 = !{i64 1893}
!71 = !{i64 1904}
!72 = !{i64 1911}
!73 = !{i64 1926}
!74 = !{i64 1933}
!75 = !{i64 1991}
!76 = !{i64 1998}
!77 = !{i64 2000}
!78 = !{i64 2014}
!79 = !{i64 2018}
!80 = !{i64 2036}
!81 = !{i64 2047}
!82 = !{i64 2060}
!83 = !{i64 2091}
!84 = !{i64 2092}
!85 = !{i64 2096}
!86 = !{i64 2065}
!87 = !{i64 2124}
!88 = !{i64 2128}
!89 = !{i64 2145}
!90 = !{i64 2159}
!91 = !{i64 2168}
!92 = !{i64 2183}
