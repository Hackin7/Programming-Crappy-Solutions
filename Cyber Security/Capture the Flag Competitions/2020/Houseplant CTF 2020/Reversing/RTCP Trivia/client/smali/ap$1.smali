.class final Lap$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lap;


# direct methods
.method constructor <init>(Lap;)V
    .locals 0

    iput-object p1, p0, Lap$1;->a:Lap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget-object v0, p0, Lap$1;->a:Lap;

    invoke-virtual {v0}, Lap;->d()V

    return-void
.end method
