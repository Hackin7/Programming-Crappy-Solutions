source_filename = "test"
target datalayout = "e-m:e-p:64:64-i64:64-f80:128-n8:16:32:64-S128"

@global_var_201010 = global i64 0
@global_var_200fd8 = local_unnamed_addr global i64 0
@global_var_9b8 = constant [40 x i8] c"Insufficient arguments. Gimme moarrrrrr\00"
@global_var_9e0 = constant [22 x i8] c"I am overwhelmed! @.@\00"
@global_var_9f6 = constant [27 x i8] c"33 is the magic number! ;)\00"
@global_var_a11 = constant [18 x i8] c"Your flag is: %s\0A\00"
@global_var_200d98 = global i64 1920
@global_var_200da0 = global i64 1856
@0 = external global i32

define i64 @_init() local_unnamed_addr {
dec_label_pc_5f0:
  %rax.0.reg2mem = alloca i64, !insn.addr !0
  %0 = load i64, i64* inttoptr (i64 2101224 to i64*), align 8, !insn.addr !1
  %1 = icmp eq i64 %0, 0, !insn.addr !2
  store i64 0, i64* %rax.0.reg2mem, !insn.addr !3
  br i1 %1, label %dec_label_pc_602, label %dec_label_pc_600, !insn.addr !3

dec_label_pc_600:                                 ; preds = %dec_label_pc_5f0
  call void @__gmon_start__(), !insn.addr !4
  store i64 ptrtoint (i32* @0 to i64), i64* %rax.0.reg2mem, !insn.addr !4
  br label %dec_label_pc_602, !insn.addr !4

dec_label_pc_602:                                 ; preds = %dec_label_pc_600, %dec_label_pc_5f0
  %rax.0.reload = load i64, i64* %rax.0.reg2mem
  ret i64 %rax.0.reload, !insn.addr !5
}

define i8* @function_620(i8* %dest, i8* %src) local_unnamed_addr {
dec_label_pc_620:
  %0 = call i8* @strcpy(i8* %dest, i8* %src), !insn.addr !6
  ret i8* %0, !insn.addr !6
}

define i32 @function_630(i8* %s) local_unnamed_addr {
dec_label_pc_630:
  %0 = call i32 @puts(i8* %s), !insn.addr !7
  ret i32 %0, !insn.addr !7
}

define i32 @function_640(i8* %s) local_unnamed_addr {
dec_label_pc_640:
  %0 = call i32 @strlen(i8* %s), !insn.addr !8
  ret i32 %0, !insn.addr !8
}

define void @function_650() local_unnamed_addr {
dec_label_pc_650:
  call void @__stack_chk_fail(), !insn.addr !9
  ret void, !insn.addr !9
}

define i32 @function_660(i8* %format, ...) local_unnamed_addr {
dec_label_pc_660:
  %0 = call i32 (i8*, ...) @printf(i8* %format), !insn.addr !10
  ret i32 %0, !insn.addr !10
}

define void @function_670(i64* %d) local_unnamed_addr {
dec_label_pc_670:
  call void @__cxa_finalize(i64* %d), !insn.addr !11
  ret void, !insn.addr !11
}

define i64 @_start(i64 %arg1, i64 %arg2, i64 %arg3, i64 %arg4) local_unnamed_addr {
dec_label_pc_680:
  %stack_var_8 = alloca i64, align 8
  %0 = trunc i64 %arg4 to i32, !insn.addr !12
  %1 = bitcast i64* %stack_var_8 to i8**, !insn.addr !12
  %2 = inttoptr i64 %arg3 to void ()*, !insn.addr !12
  %3 = call i32 @__libc_start_main(i64 1930, i32 %0, i8** nonnull %1, void ()* inttoptr (i64 2352 to void ()*), void ()* inttoptr (i64 2464 to void ()*), void ()* %2), !insn.addr !12
  %4 = call i64 @__asm_hlt(), !insn.addr !13
  unreachable, !insn.addr !13
}

define i64 @deregister_tm_clones() local_unnamed_addr {
dec_label_pc_6b0:
  ret i64 ptrtoint (i64* @global_var_201010 to i64), !insn.addr !14
}

define i64 @register_tm_clones() local_unnamed_addr {
dec_label_pc_6f0:
  ret i64 0, !insn.addr !15
}

define i64 @__do_global_dtors_aux() local_unnamed_addr {
dec_label_pc_740:
  %0 = call i64 @__decompiler_undefined_function_0()
  %1 = load i8, i8* bitcast (i64* @global_var_201010 to i8*), align 8, !insn.addr !16
  %2 = icmp eq i8 %1, 0, !insn.addr !16
  %3 = icmp eq i1 %2, false, !insn.addr !17
  br i1 %3, label %dec_label_pc_778, label %dec_label_pc_749, !insn.addr !17

dec_label_pc_749:                                 ; preds = %dec_label_pc_740
  %4 = load i64, i64* inttoptr (i64 2101240 to i64*), align 8, !insn.addr !18
  %5 = icmp eq i64 %4, 0, !insn.addr !18
  br i1 %5, label %dec_label_pc_763, label %dec_label_pc_757, !insn.addr !19

dec_label_pc_757:                                 ; preds = %dec_label_pc_749
  %6 = load i64, i64* inttoptr (i64 2101256 to i64*), align 8, !insn.addr !20
  %7 = inttoptr i64 %6 to i64*, !insn.addr !21
  call void @__cxa_finalize(i64* %7), !insn.addr !21
  br label %dec_label_pc_763, !insn.addr !21

dec_label_pc_763:                                 ; preds = %dec_label_pc_757, %dec_label_pc_749
  %8 = call i64 @deregister_tm_clones(), !insn.addr !22
  store i8 1, i8* bitcast (i64* @global_var_201010 to i8*), align 8, !insn.addr !23
  ret i64 %8, !insn.addr !24

dec_label_pc_778:                                 ; preds = %dec_label_pc_740
  ret i64 %0, !insn.addr !25
}

define i64 @frame_dummy() local_unnamed_addr {
dec_label_pc_780:
  %0 = call i64 @register_tm_clones(), !insn.addr !26
  ret i64 %0, !insn.addr !26
}

define i64 @main(i64 %argc, i8** %argv) local_unnamed_addr {
dec_label_pc_78a:
  %rax.1.reg2mem = alloca i64, !insn.addr !27
  %rax.0.reg2mem = alloca i64, !insn.addr !27
  %storemerge3.reg2mem = alloca i32, !insn.addr !27
  %stack_var_-168 = alloca i64, align 8
  %stack_var_-72 = alloca i64, align 8
  %stack_var_-120 = alloca i64, align 8
  %stack_var_-8 = alloca i64, align 8
  %0 = trunc i64 %argc to i32, !insn.addr !28
  %1 = call i64 @__readfsqword(i64 40), !insn.addr !29
  %2 = icmp sgt i32 %0, 1, !insn.addr !30
  br i1 %2, label %dec_label_pc_7d1, label %dec_label_pc_7bb, !insn.addr !30

dec_label_pc_7bb:                                 ; preds = %dec_label_pc_78a
  %3 = call i32 @puts(i8* getelementptr inbounds ([40 x i8], [40 x i8]* @global_var_9b8, i64 0, i64 0)), !insn.addr !31
  store i64 1, i64* %rax.0.reg2mem, !insn.addr !32
  br label %dec_label_pc_90b, !insn.addr !32

dec_label_pc_7d1:                                 ; preds = %dec_label_pc_78a
  %4 = icmp eq i32 %0, 2, !insn.addr !33
  br i1 %4, label %dec_label_pc_7f0, label %dec_label_pc_7da, !insn.addr !33

dec_label_pc_7da:                                 ; preds = %dec_label_pc_7d1
  %5 = call i32 @puts(i8* getelementptr inbounds ([22 x i8], [22 x i8]* @global_var_9e0, i64 0, i64 0)), !insn.addr !34
  store i64 1, i64* %rax.0.reg2mem, !insn.addr !35
  br label %dec_label_pc_90b, !insn.addr !35

dec_label_pc_7f0:                                 ; preds = %dec_label_pc_7d1
  %6 = ptrtoint i8** %argv to i64, !insn.addr !36
  %7 = add i64 %6, 8, !insn.addr !37
  %8 = inttoptr i64 %7 to i64*, !insn.addr !38
  %9 = load i64, i64* %8, align 8, !insn.addr !38
  %10 = inttoptr i64 %9 to i8*, !insn.addr !39
  %11 = call i32 @strlen(i8* %10), !insn.addr !39
  %12 = icmp eq i32 %11, 33, !insn.addr !40
  br i1 %12, label %dec_label_pc_82b, label %dec_label_pc_815, !insn.addr !41

dec_label_pc_815:                                 ; preds = %dec_label_pc_7f0
  %13 = call i32 @puts(i8* getelementptr inbounds ([27 x i8], [27 x i8]* @global_var_9f6, i64 0, i64 0)), !insn.addr !42
  store i64 1, i64* %rax.0.reg2mem, !insn.addr !43
  br label %dec_label_pc_90b, !insn.addr !43

dec_label_pc_82b:                                 ; preds = %dec_label_pc_7f0
  %14 = ptrtoint i64* %stack_var_-8 to i64, !insn.addr !44
  %15 = load i64, i64* %8, align 8, !insn.addr !45
  %16 = bitcast i64* %stack_var_-120 to i8*, !insn.addr !46
  %17 = inttoptr i64 %15 to i8*, !insn.addr !46
  %18 = call i8* @strcpy(i8* nonnull %16, i8* %17), !insn.addr !46
  store i64 92440796471893508, i64* %stack_var_-72, align 8, !insn.addr !47
  %19 = bitcast i64* %stack_var_-72 to i8*, !insn.addr !48
  %20 = call i32 @strlen(i8* nonnull %19), !insn.addr !48
  %21 = icmp eq i32 %20, 0, !insn.addr !49
  store i32 0, i32* %storemerge3.reg2mem, !insn.addr !50
  br i1 %21, label %dec_label_pc_8eb, label %dec_label_pc_892, !insn.addr !50

dec_label_pc_892:                                 ; preds = %dec_label_pc_82b, %dec_label_pc_892
  %storemerge3.reload = load i32, i32* %storemerge3.reg2mem
  %22 = sext i32 %storemerge3.reload to i64, !insn.addr !51
  %23 = add i64 %22, %14
  %24 = add i64 %23, -64, !insn.addr !52
  %25 = inttoptr i64 %24 to i8*, !insn.addr !52
  %26 = load i8, i8* %25, align 1, !insn.addr !52
  %27 = add i64 %23, -112, !insn.addr !53
  %28 = inttoptr i64 %27 to i8*, !insn.addr !53
  %29 = load i8, i8* %28, align 1, !insn.addr !53
  %30 = xor i8 %29, %26
  %31 = add i64 %23, -160, !insn.addr !54
  %32 = inttoptr i64 %31 to i8*, !insn.addr !54
  store i8 %30, i8* %32, align 1, !insn.addr !54
  %33 = add nuw i32 %storemerge3.reload, 1, !insn.addr !55
  %34 = call i32 @strlen(i8* nonnull %19), !insn.addr !48
  %35 = icmp ult i32 %33, %34, !insn.addr !49
  store i32 %33, i32* %storemerge3.reg2mem, !insn.addr !50
  br i1 %35, label %dec_label_pc_892, label %dec_label_pc_8eb, !insn.addr !50

dec_label_pc_8eb:                                 ; preds = %dec_label_pc_892, %dec_label_pc_82b
  %36 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([18 x i8], [18 x i8]* @global_var_a11, i64 0, i64 0), i64* nonnull %stack_var_-168), !insn.addr !56
  store i64 0, i64* %rax.0.reg2mem, !insn.addr !57
  br label %dec_label_pc_90b, !insn.addr !57

dec_label_pc_90b:                                 ; preds = %dec_label_pc_8eb, %dec_label_pc_815, %dec_label_pc_7da, %dec_label_pc_7bb
  %rax.0.reload = load i64, i64* %rax.0.reg2mem
  %37 = call i64 @__readfsqword(i64 40), !insn.addr !58
  %38 = icmp eq i64 %1, %37, !insn.addr !58
  store i64 %rax.0.reload, i64* %rax.1.reg2mem, !insn.addr !59
  br i1 %38, label %dec_label_pc_91f, label %dec_label_pc_91a, !insn.addr !59

dec_label_pc_91a:                                 ; preds = %dec_label_pc_90b
  call void @__stack_chk_fail(), !insn.addr !60
  store i64 ptrtoint (i32* @0 to i64), i64* %rax.1.reg2mem, !insn.addr !60
  br label %dec_label_pc_91f, !insn.addr !60

dec_label_pc_91f:                                 ; preds = %dec_label_pc_91a, %dec_label_pc_90b
  %rax.1.reload = load i64, i64* %rax.1.reg2mem
  ret i64 %rax.1.reload, !insn.addr !61
}

define i64 @__libc_csu_init(i64 %arg1, i64 %arg2, i64 %arg3) local_unnamed_addr {
dec_label_pc_930:
  %rbx.0.reg2mem = alloca i64, !insn.addr !62
  %0 = call i64 @_init(), !insn.addr !63
  store i64 0, i64* %rbx.0.reg2mem, !insn.addr !64
  br i1 icmp eq (i64 ashr (i64 sub (i64 ptrtoint (i64* @global_var_200da0 to i64), i64 ptrtoint (i64* @global_var_200d98 to i64)), i64 3), i64 0), label %dec_label_pc_986, label %dec_label_pc_970, !insn.addr !64

dec_label_pc_970:                                 ; preds = %dec_label_pc_930, %dec_label_pc_970
  %rbx.0.reload = load i64, i64* %rbx.0.reg2mem
  %1 = add i64 %rbx.0.reload, 1, !insn.addr !65
  %2 = icmp eq i64 %1, ashr (i64 sub (i64 ptrtoint (i64* @global_var_200da0 to i64), i64 ptrtoint (i64* @global_var_200d98 to i64)), i64 3), !insn.addr !66
  %3 = icmp eq i1 %2, false, !insn.addr !67
  store i64 %1, i64* %rbx.0.reg2mem, !insn.addr !67
  br i1 %3, label %dec_label_pc_970, label %dec_label_pc_986, !insn.addr !67

dec_label_pc_986:                                 ; preds = %dec_label_pc_970, %dec_label_pc_930
  ret i64 %0, !insn.addr !68
}

define i64 @__libc_csu_fini() local_unnamed_addr {
dec_label_pc_9a0:
  %0 = call i64 @__decompiler_undefined_function_0()
  ret i64 %0, !insn.addr !69
}

define i64 @_fini() local_unnamed_addr {
dec_label_pc_9a4:
  %0 = call i64 @__decompiler_undefined_function_0()
  ret i64 %0, !insn.addr !70
}

declare i8* @strcpy(i8*, i8*) local_unnamed_addr

declare i32 @puts(i8*) local_unnamed_addr

declare i32 @strlen(i8*) local_unnamed_addr

declare void @__stack_chk_fail() local_unnamed_addr

declare i32 @printf(i8*, ...) local_unnamed_addr

declare i32 @__libc_start_main(i64, i32, i8**, void ()*, void ()*, void ()*) local_unnamed_addr

declare void @__gmon_start__() local_unnamed_addr

declare void @__cxa_finalize(i64*) local_unnamed_addr

declare i64 @__asm_hlt() local_unnamed_addr

declare i64 @__readfsqword(i64) local_unnamed_addr

declare i64 @__decompiler_undefined_function_0() local_unnamed_addr

!0 = !{i64 1520}
!1 = !{i64 1524}
!2 = !{i64 1531}
!3 = !{i64 1534}
!4 = !{i64 1536}
!5 = !{i64 1542}
!6 = !{i64 1568}
!7 = !{i64 1584}
!8 = !{i64 1600}
!9 = !{i64 1616}
!10 = !{i64 1632}
!11 = !{i64 1648}
!12 = !{i64 1700}
!13 = !{i64 1706}
!14 = !{i64 1761}
!15 = !{i64 1841}
!16 = !{i64 1856}
!17 = !{i64 1863}
!18 = !{i64 1865}
!19 = !{i64 1877}
!20 = !{i64 1879}
!21 = !{i64 1886}
!22 = !{i64 1891}
!23 = !{i64 1896}
!24 = !{i64 1904}
!25 = !{i64 1912}
!26 = !{i64 1925}
!27 = !{i64 1930}
!28 = !{i64 1942}
!29 = !{i64 1955}
!30 = !{i64 1977}
!31 = !{i64 1986}
!32 = !{i64 1996}
!33 = !{i64 2008}
!34 = !{i64 2017}
!35 = !{i64 2027}
!36 = !{i64 2032}
!37 = !{i64 2039}
!38 = !{i64 2043}
!39 = !{i64 2049}
!40 = !{i64 2060}
!41 = !{i64 2067}
!42 = !{i64 2076}
!43 = !{i64 2086}
!44 = !{i64 1931}
!45 = !{i64 2102}
!46 = !{i64 2115}
!47 = !{i64 2140}
!48 = !{i64 2273}
!49 = !{i64 2278}
!50 = !{i64 2281}
!51 = !{i64 2200}
!52 = !{i64 2202}
!53 = !{i64 2215}
!54 = !{i64 2243}
!55 = !{i64 2250}
!56 = !{i64 2305}
!57 = !{i64 2310}
!58 = !{i64 2319}
!59 = !{i64 2328}
!60 = !{i64 2330}
!61 = !{i64 2344}
!62 = !{i64 2352}
!63 = !{i64 2396}
!64 = !{i64 2404}
!65 = !{i64 2429}
!66 = !{i64 2433}
!67 = !{i64 2436}
!68 = !{i64 2452}
!69 = !{i64 2464}
!70 = !{i64 2476}
