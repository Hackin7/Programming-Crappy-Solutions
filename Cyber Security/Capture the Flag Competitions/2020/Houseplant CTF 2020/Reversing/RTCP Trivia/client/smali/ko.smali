.class public abstract Lko;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Lko;
    .locals 3

    new-instance v0, Lnc;

    invoke-direct {v0}, Lnc;-><init>()V

    invoke-virtual {v0, p0}, Lnc;->b([B)Lnc;

    move-result-object v0

    array-length p0, p0

    int-to-long v1, p0

    if-nez v0, :cond_0

    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "source == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance p0, Lko$1;

    invoke-direct {p0, v1, v2, v0}, Lko$1;-><init>(JLne;)V

    return-object p0
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()Lne;
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, Lko;->b()Lne;

    move-result-object v0

    invoke-static {v0}, Lkv;->a(Ljava/io/Closeable;)V

    return-void
.end method
