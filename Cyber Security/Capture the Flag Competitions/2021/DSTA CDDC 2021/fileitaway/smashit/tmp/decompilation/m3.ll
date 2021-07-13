source_filename = "test"
target datalayout = "e-p:32:32-f64:32:64-f80:32-n8:16:32-S128"

%_IO_FILE = type { i32 }

@global_var_8049f10 = local_unnamed_addr global i32 0
@global_var_8048600 = local_unnamed_addr constant [13 x i8] c"cat flag.txt\00"
@global_var_804860d = local_unnamed_addr constant [26 x i8] c"echo 'not flag' > notflag\00"
@global_var_8048627 = constant [17 x i8] c"Enter password: \00"
@global_var_804a040 = local_unnamed_addr global i32 0
@global_var_804a044 = local_unnamed_addr global i8 0

define i32 @main(i32 %argc, i8** %argv) local_unnamed_addr {
dec_label_pc_804852f:
  %stack_var_-80 = alloca i32, align 4
  %0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([17 x i8], [17 x i8]* @global_var_8048627, i32 0, i32 0)), !insn.addr !0
  %1 = load i32, i32* @global_var_804a040, align 4, !insn.addr !1
  %2 = inttoptr i32 %1 to %_IO_FILE*, !insn.addr !2
  %3 = call i32 @fflush(%_IO_FILE* %2), !insn.addr !3
  %4 = call i32 @read(i32 0, i32* nonnull %stack_var_-80, i32 100), !insn.addr !4
  ret i32 %4, !insn.addr !5
}

declare i32 @read(i32, i32*, i32) local_unnamed_addr

declare i32 @printf(i8*, ...) local_unnamed_addr

declare i32 @fflush(%_IO_FILE*) local_unnamed_addr

!0 = !{i64 134513983}
!1 = !{i64 134513988}
!2 = !{i64 134513993}
!3 = !{i64 134513996}
!4 = !{i64 134514024}
!5 = !{i64 134514030}
