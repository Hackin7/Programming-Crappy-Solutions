.class public final Llu;
.super Ljava/lang/Object;

# interfaces
.implements Llk;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llu$f;,
        Llu$c;,
        Llu$e;,
        Llu$a;,
        Llu$b;,
        Llu$d;
    }
.end annotation


# instance fields
.field final a:Lki;

.field final b:Llh;

.field final c:Lne;

.field final d:Lnd;

.field e:I

.field private f:J


# direct methods
.method public constructor <init>(Lki;Llh;Lne;Lnd;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Llu;->e:I

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, Llu;->f:J

    iput-object p1, p0, Llu;->a:Lki;

    iput-object p2, p0, Llu;->b:Llh;

    iput-object p3, p0, Llu;->c:Lne;

    iput-object p4, p0, Llu;->d:Lnd;

    return-void
.end method

.method static a(Lni;)V
    .locals 2

    iget-object v0, p0, Lni;->a:Lnt;

    sget-object v1, Lnt;->c:Lnt;

    if-nez v1, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    iput-object v1, p0, Lni;->a:Lnt;

    invoke-virtual {v0}, Lnt;->f_()Lnt;

    invoke-virtual {v0}, Lnt;->d()Lnt;

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Llu;->c:Lne;

    iget-wide v1, p0, Llu;->f:J

    invoke-interface {v0, v1, v2}, Lne;->d(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Llu;->f:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Llu;->f:J

    return-object v0
.end method


# virtual methods
.method public final a(Z)Lkn$a;
    .locals 4

    iget v0, p0, Llu;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    iget v0, p0, Llu;->e:I

    if-eq v0, v1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "state: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llu;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    :try_start_0
    invoke-direct {p0}, Llu;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lls;->a(Ljava/lang/String;)Lls;

    move-result-object v0

    new-instance v2, Lkn$a;

    invoke-direct {v2}, Lkn$a;-><init>()V

    iget-object v3, v0, Lls;->a:Lkj;

    iput-object v3, v2, Lkn$a;->b:Lkj;

    iget v3, v0, Lls;->b:I

    iput v3, v2, Lkn$a;->c:I

    iget-object v3, v0, Lls;->c:Ljava/lang/String;

    iput-object v3, v2, Lkn$a;->d:Ljava/lang/String;

    invoke-virtual {p0}, Llu;->d()Lke;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkn$a;->a(Lke;)Lkn$a;

    move-result-object v2

    const/16 v3, 0x64

    if-eqz p1, :cond_1

    iget p1, v0, Lls;->b:I

    if-ne p1, v3, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    iget p1, v0, Lls;->b:I

    if-ne p1, v3, :cond_2

    iput v1, p0, Llu;->e:I

    return-object v2

    :cond_2
    const/4 p1, 0x4

    iput p1, p0, Llu;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpected end of stream on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llu;->b:Llh;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0
.end method

.method public final a(Lkn;)Lko;
    .locals 8

    iget-object v0, p0, Llu;->b:Llh;

    iget-object v0, v0, Llh;->f:Lkc;

    iget-object v0, p0, Llu;->b:Llh;

    iget-object v0, v0, Llh;->e:Ljs;

    invoke-static {}, Lkc;->q()V

    const-string v0, "Content-Type"

    invoke-virtual {p1, v0}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Llm;->b(Lkn;)Z

    move-result v1

    if-nez v1, :cond_0

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v1, v2}, Llu;->a(J)Lns;

    move-result-object p1

    new-instance v3, Llp;

    invoke-static {p1}, Lnl;->a(Lns;)Lne;

    move-result-object p1

    invoke-direct {v3, v0, v1, v2, p1}, Llp;-><init>(Ljava/lang/String;JLne;)V

    return-object v3

    :cond_0
    const-string v1, "chunked"

    const-string v2, "Transfer-Encoding"

    invoke-virtual {p1, v2}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x5

    const/4 v3, 0x4

    const-wide/16 v4, -0x1

    if-eqz v1, :cond_2

    iget-object p1, p1, Lkn;->a:Lkl;

    iget-object p1, p1, Lkl;->a:Lkf;

    iget v1, p0, Llu;->e:I

    if-eq v1, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "state: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llu;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, Llu;->e:I

    new-instance v1, Llu$c;

    invoke-direct {v1, p0, p1}, Llu$c;-><init>(Llu;Lkf;)V

    new-instance p1, Llp;

    invoke-static {v1}, Lnl;->a(Lns;)Lne;

    move-result-object v1

    invoke-direct {p1, v0, v4, v5, v1}, Llp;-><init>(Ljava/lang/String;JLne;)V

    return-object p1

    :cond_2
    invoke-static {p1}, Llm;->a(Lkn;)J

    move-result-wide v6

    cmp-long p1, v6, v4

    if-eqz p1, :cond_3

    invoke-virtual {p0, v6, v7}, Llu;->a(J)Lns;

    move-result-object p1

    new-instance v1, Llp;

    invoke-static {p1}, Lnl;->a(Lns;)Lne;

    move-result-object p1

    invoke-direct {v1, v0, v6, v7, p1}, Llp;-><init>(Ljava/lang/String;JLne;)V

    return-object v1

    :cond_3
    new-instance p1, Llp;

    iget v1, p0, Llu;->e:I

    if-eq v1, v3, :cond_4

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "state: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llu;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object v1, p0, Llu;->b:Llh;

    if-nez v1, :cond_5

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "streamAllocation == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iput v2, p0, Llu;->e:I

    iget-object v1, p0, Llu;->b:Llh;

    invoke-virtual {v1}, Llh;->d()V

    new-instance v1, Llu$f;

    invoke-direct {v1, p0}, Llu$f;-><init>(Llu;)V

    invoke-static {v1}, Lnl;->a(Lns;)Lne;

    move-result-object v1

    invoke-direct {p1, v0, v4, v5, v1}, Llp;-><init>(Ljava/lang/String;JLne;)V

    return-object p1
.end method

.method public final a(Lkl;J)Lnr;
    .locals 4

    const-string v0, "chunked"

    const-string v1, "Transfer-Encoding"

    invoke-virtual {p1, v1}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget p1, p0, Llu;->e:I

    if-eq p1, v1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "state: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Llu;->e:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput v0, p0, Llu;->e:I

    new-instance p1, Llu$b;

    invoke-direct {p1, p0}, Llu$b;-><init>(Llu;)V

    return-object p1

    :cond_1
    const-wide/16 v2, -0x1

    cmp-long p1, p2, v2

    if-eqz p1, :cond_3

    iget p1, p0, Llu;->e:I

    if-eq p1, v1, :cond_2

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "state: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Llu;->e:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iput v0, p0, Llu;->e:I

    new-instance p1, Llu$d;

    invoke-direct {p1, p0, p2, p3}, Llu$d;-><init>(Llu;J)V

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(J)Lns;
    .locals 2

    iget v0, p0, Llu;->e:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "state: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Llu;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/4 v0, 0x5

    iput v0, p0, Llu;->e:I

    new-instance v0, Llu$e;

    invoke-direct {v0, p0, p1, p2}, Llu$e;-><init>(Llu;J)V

    return-object v0
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Llu;->d:Lnd;

    invoke-interface {v0}, Lnd;->flush()V

    return-void
.end method

.method public final a(Lke;Ljava/lang/String;)V
    .locals 3

    iget v0, p0, Llu;->e:I

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "state: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Llu;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Llu;->d:Lnd;

    invoke-interface {v0, p2}, Lnd;->b(Ljava/lang/String;)Lnd;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Lnd;->b(Ljava/lang/String;)Lnd;

    const/4 p2, 0x0

    iget-object v0, p1, Lke;->a:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    :goto_0
    if-ge p2, v0, :cond_1

    iget-object v1, p0, Llu;->d:Lnd;

    invoke-virtual {p1, p2}, Lke;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lnd;->b(Ljava/lang/String;)Lnd;

    move-result-object v1

    const-string v2, ": "

    invoke-interface {v1, v2}, Lnd;->b(Ljava/lang/String;)Lnd;

    move-result-object v1

    invoke-virtual {p1, p2}, Lke;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lnd;->b(Ljava/lang/String;)Lnd;

    move-result-object v1

    const-string v2, "\r\n"

    invoke-interface {v1, v2}, Lnd;->b(Ljava/lang/String;)Lnd;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Llu;->d:Lnd;

    const-string p2, "\r\n"

    invoke-interface {p1, p2}, Lnd;->b(Ljava/lang/String;)Lnd;

    const/4 p1, 0x1

    iput p1, p0, Llu;->e:I

    return-void
.end method

.method public final a(Lkl;)V
    .locals 3

    iget-object v0, p0, Llu;->b:Llh;

    invoke-virtual {v0}, Llh;->b()Lld;

    move-result-object v0

    iget-object v0, v0, Lld;->a:Lkp;

    iget-object v0, v0, Lkp;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Lkl;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lkl;->a:Lkf;

    invoke-virtual {v2}, Lkf;->b()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p1, Lkl;->a:Lkf;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lkl;->a:Lkf;

    invoke-static {v0}, Llq;->a(Lkf;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v0, " HTTP/1.1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Lkl;->c:Lke;

    invoke-virtual {p0, p1, v0}, Llu;->a(Lke;Ljava/lang/String;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Llu;->d:Lnd;

    invoke-interface {v0}, Lnd;->flush()V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Llu;->b:Llh;

    invoke-virtual {v0}, Llh;->b()Lld;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lld;->b:Ljava/net/Socket;

    invoke-static {v0}, Lkv;->a(Ljava/net/Socket;)V

    :cond_0
    return-void
.end method

.method public final d()Lke;
    .locals 3

    new-instance v0, Lke$a;

    invoke-direct {v0}, Lke$a;-><init>()V

    :goto_0
    invoke-direct {p0}, Llu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lkt;->a:Lkt;

    invoke-virtual {v2, v0, v1}, Lkt;->a(Lke$a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lke$a;->a()Lke;

    move-result-object v0

    return-object v0
.end method
