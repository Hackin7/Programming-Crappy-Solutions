.class public final Lnl;
.super Ljava/lang/Object;


# static fields
.field static final a:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lnl;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lnl;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lnr;)Lnd;
    .locals 1

    new-instance v0, Lnm;

    invoke-direct {v0, p0}, Lnm;-><init>(Lnr;)V

    return-object v0
.end method

.method public static a(Lns;)Lne;
    .locals 1

    new-instance v0, Lnn;

    invoke-direct {v0, p0}, Lnn;-><init>(Lns;)V

    return-object v0
.end method

.method public static a(Ljava/net/Socket;)Lnr;
    .locals 2

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "socket == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance p0, Ljava/io/IOException;

    const-string v0, "socket\'s output stream == null"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0}, Lnl;->c(Ljava/net/Socket;)Lna;

    move-result-object v0

    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    if-nez p0, :cond_2

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "out == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance v1, Lnl$1;

    invoke-direct {v1, v0, p0}, Lnl$1;-><init>(Lnt;Ljava/io/OutputStream;)V

    new-instance p0, Lna$1;

    invoke-direct {p0, v0, v1}, Lna$1;-><init>(Lna;Lnr;)V

    return-object p0
.end method

.method public static a(Ljava/io/InputStream;)Lns;
    .locals 1

    new-instance v0, Lnt;

    invoke-direct {v0}, Lnt;-><init>()V

    invoke-static {p0, v0}, Lnl;->a(Ljava/io/InputStream;Lnt;)Lns;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/io/InputStream;Lnt;)Lns;
    .locals 1

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "in == null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    if-nez p1, :cond_1

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "timeout == null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Lnl$2;

    invoke-direct {v0, p1, p0}, Lnl$2;-><init>(Lnt;Ljava/io/InputStream;)V

    return-object v0
.end method

.method static a(Ljava/lang/AssertionError;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getsockname failed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Ljava/net/Socket;)Lns;
    .locals 2

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "socket == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance p0, Ljava/io/IOException;

    const-string v0, "socket\'s input stream == null"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0}, Lnl;->c(Ljava/net/Socket;)Lna;

    move-result-object v0

    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0, v0}, Lnl;->a(Ljava/io/InputStream;Lnt;)Lns;

    move-result-object p0

    new-instance v1, Lna$2;

    invoke-direct {v1, v0, p0}, Lna$2;-><init>(Lna;Lns;)V

    return-object v1
.end method

.method private static c(Ljava/net/Socket;)Lna;
    .locals 1

    new-instance v0, Lnl$3;

    invoke-direct {v0, p0}, Lnl$3;-><init>(Ljava/net/Socket;)V

    return-object v0
.end method
