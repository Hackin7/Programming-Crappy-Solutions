source_filename = "test"
target datalayout = "e-p:32:32-f64:32:64-f80:32-n8:16:32-S128"

@global_var_22c = local_unnamed_addr global i32 12
@global_var_1bc = local_unnamed_addr constant [11 x i8] c"linux.so.2\00"
@0 = external global i32

define i32 @_init(i32 %arg1, i32 %arg2, i32 %arg3) local_unnamed_addr {
dec_label_pc_1000:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_1002() local_unnamed_addr {
dec_label_pc_1002:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i16 @__decompiler_undefined_function_1()
  %2 = call i32 @__asm_sti(i16 %1), !insn.addr !0
  %3 = call i32 @__x86.get_pc_thunk.bx(i32 %0), !insn.addr !1
  %4 = add i32 %0, 12255, !insn.addr !2
  %5 = inttoptr i32 %4 to i32*, !insn.addr !2
  %6 = load i32, i32* %5, align 4, !insn.addr !2
  ret i32 %6, !insn.addr !3
}

define i32 @function_1080(i32 %arg1) local_unnamed_addr {
dec_label_pc_1080:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_1082() local_unnamed_addr {
dec_label_pc_1082:
  %0 = call i16 @__decompiler_undefined_function_1()
  %1 = call i32 @__asm_sti(i16 %0), !insn.addr !4
  ret i32 %1, !insn.addr !5
}

define i32 @function_1090(i32 %arg1, i32 %arg2) local_unnamed_addr {
dec_label_pc_1090:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_1092() local_unnamed_addr {
dec_label_pc_1092:
  %0 = call i16 @__decompiler_undefined_function_1()
  %1 = call i32 @__asm_sti(i16 %0), !insn.addr !6
  ret i32 %1, !insn.addr !7
}

define i32 @function_10a0(i32* %arg1) local_unnamed_addr {
dec_label_pc_10a0:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_10a2() local_unnamed_addr {
dec_label_pc_10a2:
  %0 = call i16 @__decompiler_undefined_function_1()
  %1 = call i32 @__asm_sti(i16 %0), !insn.addr !8
  ret i32 %1, !insn.addr !9
}

define i32 @function_10b0(i32 %arg1) local_unnamed_addr {
dec_label_pc_10b0:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_10b2() local_unnamed_addr {
dec_label_pc_10b2:
  %0 = call i16 @__decompiler_undefined_function_1()
  %1 = call i32 @__asm_sti(i16 %0), !insn.addr !10
  ret i32 %1, !insn.addr !11
}

define i32 @function_10c0(i32 %arg1, i32 %arg2, i32* %arg3, i32 %arg4, i32 %arg5) local_unnamed_addr {
dec_label_pc_10c0:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_10c2() local_unnamed_addr {
dec_label_pc_10c2:
  %0 = call i16 @__decompiler_undefined_function_1()
  %1 = call i32 @__asm_sti(i16 %0), !insn.addr !12
  ret i32 %1, !insn.addr !13
}

define i32 @_start() local_unnamed_addr {
dec_label_pc_10d0:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_10d2() local_unnamed_addr {
dec_label_pc_10d2:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__decompiler_undefined_function_0()
  %2 = call i16 @__decompiler_undefined_function_1()
  %stack_var_-4 = alloca i32, align 4
  %stack_var_2 = alloca i32, align 4
  %3 = call i32 @__asm_sti(i16 %2), !insn.addr !14
  %4 = sext i16 %2 to i32, !insn.addr !15
  store i32 %3, i32* %stack_var_-4, align 4, !insn.addr !16
  %5 = call i32 @function_1106(i32 %1, i32* nonnull %stack_var_-4, i32 %3), !insn.addr !17
  %6 = add i32 %0, 556, !insn.addr !18
  %7 = add i32 %0, 444, !insn.addr !19
  %8 = add i32 %0, 12052, !insn.addr !20
  %9 = inttoptr i32 %8 to i32*, !insn.addr !20
  %10 = load i32, i32* %9, align 4, !insn.addr !20
  %11 = call i32 @function_10c0(i32 %10, i32 %4, i32* nonnull %stack_var_2, i32 %7, i32 %6), !insn.addr !21
  %12 = call i32 @__asm_hlt(), !insn.addr !22
  ret i32 %12, !insn.addr !22
}

define i32 @function_1106(i32 %arg1, i32* %arg2, i32 %arg3) local_unnamed_addr {
dec_label_pc_1106:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !23
}

define i32 @__x86.get_pc_thunk.bx(i32 %arg1) local_unnamed_addr {
dec_label_pc_1110:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !24
}

define i32 @deregister_tm_clones() local_unnamed_addr {
dec_label_pc_1120:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__x86.get_pc_thunk.dx(i32 ptrtoint (i32* @0 to i32)), !insn.addr !25
  %2 = add i32 %0, 12003, !insn.addr !26
  ret i32 %2, !insn.addr !27
}

define i32 @register_tm_clones() local_unnamed_addr {
dec_label_pc_1160:
  %0 = call i32 @__x86.get_pc_thunk.dx(i32 ptrtoint (i32* @0 to i32)), !insn.addr !28
  ret i32 0, !insn.addr !29
}

define i32 @__do_global_dtors_aux() local_unnamed_addr {
dec_label_pc_11b0:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_11b2() local_unnamed_addr {
dec_label_pc_11b2:
  %eax.0.reg2mem = alloca i32, !insn.addr !30
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i16 @__decompiler_undefined_function_1()
  %2 = call i32 @__asm_sti(i16 %1), !insn.addr !31
  %3 = call i32 @__x86.get_pc_thunk.bx(i32 %0), !insn.addr !32
  %4 = add i32 %0, 11851, !insn.addr !33
  %5 = inttoptr i32 %4 to i8*, !insn.addr !33
  %6 = load i8, i8* %5, align 1, !insn.addr !33
  %7 = icmp eq i8 %6, 0, !insn.addr !33
  %8 = icmp eq i1 %7, false, !insn.addr !34
  store i32 %3, i32* %eax.0.reg2mem, !insn.addr !34
  br i1 %8, label %dec_label_pc_11f6, label %dec_label_pc_11cf, !insn.addr !34

dec_label_pc_11cf:                                ; preds = %dec_label_pc_11b2
  %9 = add i32 %0, 11819, !insn.addr !35
  %10 = inttoptr i32 %9 to i32*, !insn.addr !35
  %11 = load i32, i32* %10, align 4, !insn.addr !35
  %12 = icmp eq i32 %11, 0, !insn.addr !36
  br i1 %12, label %dec_label_pc_11ea, label %dec_label_pc_11d9, !insn.addr !37

dec_label_pc_11d9:                                ; preds = %dec_label_pc_11cf
  %13 = add i32 %0, 11847, !insn.addr !38
  %14 = inttoptr i32 %13 to i32*, !insn.addr !38
  %15 = load i32, i32* %14, align 4, !insn.addr !38
  %16 = call i32 @function_1080(i32 %15), !insn.addr !39
  br label %dec_label_pc_11ea, !insn.addr !40

dec_label_pc_11ea:                                ; preds = %dec_label_pc_11d9, %dec_label_pc_11cf
  %17 = call i32 @deregister_tm_clones(), !insn.addr !41
  store i8 1, i8* %5, align 1, !insn.addr !42
  store i32 %17, i32* %eax.0.reg2mem, !insn.addr !42
  br label %dec_label_pc_11f6, !insn.addr !42

dec_label_pc_11f6:                                ; preds = %dec_label_pc_11ea, %dec_label_pc_11b2
  %eax.0.reload = load i32, i32* %eax.0.reg2mem
  ret i32 %eax.0.reload, !insn.addr !43
}

define i32 @frame_dummy() local_unnamed_addr {
dec_label_pc_1200:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_1202() local_unnamed_addr {
dec_label_pc_1202:
  %0 = call i16 @__decompiler_undefined_function_1()
  %1 = call i32 @__asm_sti(i16 %0), !insn.addr !44
  %2 = call i32 @register_tm_clones(), !insn.addr !45
  ret i32 %2, !insn.addr !45
}

define i32 @__x86.get_pc_thunk.dx(i32 %arg1) local_unnamed_addr {
dec_label_pc_1209:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !46
}

define i32 @main(i32 %argc, i8** %argv) local_unnamed_addr {
dec_label_pc_120d:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_120f() local_unnamed_addr {
dec_label_pc_120f:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i16 @__decompiler_undefined_function_1()
  %stack_var_-270 = alloca i32, align 4
  %2 = call i32 @__asm_sti(i16 %1), !insn.addr !47
  %3 = call i32 @__x86.get_pc_thunk.bx(i32 %0), !insn.addr !48
  %4 = add i32 %0, 11728, !insn.addr !49
  %5 = inttoptr i32 %4 to i32*, !insn.addr !49
  %6 = load i32, i32* %5, align 4, !insn.addr !49
  %7 = inttoptr i32 %6 to i32*, !insn.addr !50
  %8 = load i32, i32* %7, align 4, !insn.addr !50
  %9 = call i32 @function_1090(i32 %8, i32 0), !insn.addr !51
  %10 = add i32 %0, 11732, !insn.addr !52
  %11 = inttoptr i32 %10 to i32*, !insn.addr !52
  %12 = load i32, i32* %11, align 4, !insn.addr !52
  %13 = inttoptr i32 %12 to i32*, !insn.addr !53
  %14 = load i32, i32* %13, align 4, !insn.addr !53
  %15 = call i32 @function_1090(i32 %14, i32 0), !insn.addr !54
  %16 = add i32 %0, 11716, !insn.addr !55
  %17 = inttoptr i32 %16 to i32*, !insn.addr !55
  %18 = load i32, i32* %17, align 4, !insn.addr !55
  %19 = inttoptr i32 %18 to i32*, !insn.addr !56
  %20 = load i32, i32* %19, align 4, !insn.addr !56
  %21 = call i32 @function_1090(i32 %20, i32 0), !insn.addr !57
  %22 = call i32 @function_10a0(i32* nonnull %stack_var_-270), !insn.addr !58
  ret i32 0, !insn.addr !59
}

define i32 @__libc_csu_init() local_unnamed_addr {
dec_label_pc_12a0:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_12a2(i32 %arg1) local_unnamed_addr {
dec_label_pc_12fd:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i32 @__decompiler_undefined_function_0()
  %2 = call i32 @__decompiler_undefined_function_0()
  %3 = call i32 @__decompiler_undefined_function_0()
  %4 = call i16 @__decompiler_undefined_function_1()
  %stack_var_-30 = alloca i32, align 4
  %5 = call i32 @__asm_sti(i16 %4), !insn.addr !60
  %6 = call i32 @__x86.get_pc_thunk.bp(i32 %2), !insn.addr !61
  %7 = ptrtoint i32* %stack_var_-30 to i32, !insn.addr !62
  %8 = call i32 @_init(i32 %3, i32 %1, i32 %0), !insn.addr !63
  %9 = add i32 %7, -8, !insn.addr !64
  %10 = inttoptr i32 %9 to i32*, !insn.addr !64
  %11 = add i32 %7, 36, !insn.addr !65
  %12 = inttoptr i32 %11 to i32*, !insn.addr !65
  %13 = add i32 %7, -12, !insn.addr !65
  %14 = inttoptr i32 %13 to i32*, !insn.addr !65
  %15 = add i32 %7, 32, !insn.addr !66
  %16 = inttoptr i32 %15 to i32*, !insn.addr !66
  %17 = add i32 %7, -16, !insn.addr !66
  %18 = inttoptr i32 %17 to i32*, !insn.addr !66
  store i32 %arg1, i32* %10, align 4, !insn.addr !64
  %19 = load i32, i32* %12, align 4, !insn.addr !65
  store i32 %19, i32* %14, align 4, !insn.addr !65
  %20 = load i32, i32* %16, align 4, !insn.addr !66
  store i32 %20, i32* %18, align 4, !insn.addr !66
  %21 = add i32 %2, 11290, !insn.addr !67
  ret i32 %21, !insn.addr !68
}

define i32 @__libc_csu_fini() local_unnamed_addr {
dec_label_pc_1310:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_1312() local_unnamed_addr {
dec_label_pc_1312:
  %0 = call i16 @__decompiler_undefined_function_1()
  %1 = call i32 @__asm_sti(i16 %0), !insn.addr !69
  ret i32 %1, !insn.addr !70
}

define i32 @__x86.get_pc_thunk.bp(i32 %arg1) local_unnamed_addr {
dec_label_pc_1315:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0, !insn.addr !71
}

define i32 @_fini() local_unnamed_addr {
dec_label_pc_131c:
  %0 = call i32 @__decompiler_undefined_function_0()
  ret i32 %0
}

define i32 @function_131e() local_unnamed_addr {
dec_label_pc_131e:
  %0 = call i32 @__decompiler_undefined_function_0()
  %1 = call i16 @__decompiler_undefined_function_1()
  %2 = call i32 @__asm_sti(i16 %1), !insn.addr !72
  %3 = call i32 @__x86.get_pc_thunk.bx(i32 %0), !insn.addr !73
  ret i32 %3, !insn.addr !74
}

declare i32 @__asm_sti(i16) local_unnamed_addr

declare i32 @__asm_hlt() local_unnamed_addr

declare i32 @__decompiler_undefined_function_0() local_unnamed_addr

declare i16 @__decompiler_undefined_function_1() local_unnamed_addr

!0 = !{i64 4099}
!1 = !{i64 4104}
!2 = !{i64 4115}
!3 = !{i64 4131}
!4 = !{i64 4227}
!5 = !{i64 4228}
!6 = !{i64 4243}
!7 = !{i64 4244}
!8 = !{i64 4259}
!9 = !{i64 4260}
!10 = !{i64 4275}
!11 = !{i64 4276}
!12 = !{i64 4291}
!13 = !{i64 4292}
!14 = !{i64 4307}
!15 = !{i64 4310}
!16 = !{i64 4316}
!17 = !{i64 4319}
!18 = !{i64 4330}
!19 = !{i64 4337}
!20 = !{i64 4346}
!21 = !{i64 4352}
!22 = !{i64 4357}
!23 = !{i64 4361}
!24 = !{i64 4371}
!25 = !{i64 4384}
!26 = !{i64 4401}
!27 = !{i64 4440}
!28 = !{i64 4448}
!29 = !{i64 4518}
!30 = !{i64 4530}
!31 = !{i64 4531}
!32 = !{i64 4536}
!33 = !{i64 4550}
!34 = !{i64 4557}
!35 = !{i64 4559}
!36 = !{i64 4565}
!37 = !{i64 4567}
!38 = !{i64 4572}
!39 = !{i64 4578}
!40 = !{i64 4583}
!41 = !{i64 4586}
!42 = !{i64 4591}
!43 = !{i64 4602}
!44 = !{i64 4611}
!45 = !{i64 4612}
!46 = !{i64 4620}
!47 = !{i64 4624}
!48 = !{i64 4635}
!49 = !{i64 4646}
!50 = !{i64 4652}
!51 = !{i64 4657}
!52 = !{i64 4665}
!53 = !{i64 4671}
!54 = !{i64 4676}
!55 = !{i64 4684}
!56 = !{i64 4690}
!57 = !{i64 4695}
!58 = !{i64 4717}
!59 = !{i64 4758}
!60 = !{i64 4771}
!61 = !{i64 4773}
!62 = !{i64 4787}
!63 = !{i64 4796}
!64 = !{i64 4835}
!65 = !{i64 4836}
!66 = !{i64 4840}
!67 = !{i64 4807}
!68 = !{i64 4868}
!69 = !{i64 4883}
!70 = !{i64 4884}
!71 = !{i64 4888}
!72 = !{i64 4895}
!73 = !{i64 4900}
!74 = !{i64 4915}
