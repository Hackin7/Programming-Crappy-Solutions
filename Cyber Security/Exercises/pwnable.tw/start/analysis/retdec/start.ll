source_filename = "test"
target datalayout = "e-p:32:32-f64:32:64-f80:32-n8:16:32-S128"

define i32 @_start() local_unnamed_addr {
dec_label_pc_8048060:
  call void @__asm_int(i32 128), !insn.addr !0
  call void @__asm_int(i32 128), !insn.addr !1
  ret i32 3, !insn.addr !2
}

declare void @__asm_int(i32) local_unnamed_addr

!0 = !{i64 134512783}
!1 = !{i64 134512791}
!2 = !{i64 134512796}
