.class final Lmd$c;
.super Lna;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lmd;


# direct methods
.method constructor <init>(Lmd;)V
    .locals 0

    iput-object p1, p0, Lmd$c;->a:Lmd;

    invoke-direct {p0}, Lna;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/net/SocketTimeoutException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method protected final a()V
    .locals 2

    iget-object v0, p0, Lmd$c;->a:Lmd;

    sget-object v1, Llw;->f:Llw;

    invoke-virtual {v0, v1}, Lmd;->b(Llw;)V

    return-void
.end method

.method public final b()V
    .locals 1

    invoke-virtual {p0}, Lmd$c;->c_()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lmd$c;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_0
    return-void
.end method
