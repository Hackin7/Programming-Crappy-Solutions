.class public final Lky;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lky$a;
    }
.end annotation


# instance fields
.field public final a:Lkl;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final b:Lkn;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkl;Lkn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lky;->a:Lkl;

    iput-object p2, p0, Lky;->b:Lkn;

    return-void
.end method

.method public static a(Lkn;Lkl;)Z
    .locals 3

    iget v0, p0, Lkn;->c:I

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    return v1

    :sswitch_0
    const-string v0, "Expires"

    invoke-virtual {p0, v0}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkn;->b()Ljr;

    move-result-object v0

    iget v0, v0, Ljr;->e:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lkn;->b()Ljr;

    move-result-object v0

    iget-boolean v0, v0, Ljr;->g:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkn;->b()Ljr;

    move-result-object v0

    iget-boolean v0, v0, Ljr;->f:Z

    if-nez v0, :cond_0

    return v1

    :cond_0
    :sswitch_1
    invoke-virtual {p0}, Lkn;->b()Ljr;

    move-result-object p0

    iget-boolean p0, p0, Ljr;->d:Z

    if-nez p0, :cond_1

    invoke-virtual {p1}, Lkl;->b()Ljr;

    move-result-object p0

    iget-boolean p0, p0, Ljr;->d:Z

    if-nez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_1
        0xcb -> :sswitch_1
        0xcc -> :sswitch_1
        0x12c -> :sswitch_1
        0x12d -> :sswitch_1
        0x12e -> :sswitch_0
        0x133 -> :sswitch_0
        0x134 -> :sswitch_1
        0x194 -> :sswitch_1
        0x195 -> :sswitch_1
        0x19a -> :sswitch_1
        0x19e -> :sswitch_1
        0x1f5 -> :sswitch_1
    .end sparse-switch
.end method
