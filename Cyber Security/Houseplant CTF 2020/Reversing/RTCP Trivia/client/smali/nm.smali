.class final Lnm;
.super Ljava/lang/Object;

# interfaces
.implements Lnd;


# instance fields
.field public final a:Lnc;

.field public final b:Lnr;

.field c:Z


# direct methods
.method constructor <init>(Lnr;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnc;

    invoke-direct {v0}, Lnc;-><init>()V

    iput-object v0, p0, Lnm;->a:Lnc;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "sink == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lnm;->b:Lnr;

    return-void
.end method


# virtual methods
.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Lnm;->b:Lnr;

    invoke-interface {v0}, Lnr;->a()Lnt;

    move-result-object v0

    return-object v0
.end method

.method public final a_(Lnc;J)V
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1, p2, p3}, Lnc;->a_(Lnc;J)V

    invoke-virtual {p0}, Lnm;->s()Lnd;

    return-void
.end method

.method public final b()Lnc;
    .locals 1

    iget-object v0, p0, Lnm;->a:Lnc;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lnd;
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1}, Lnc;->a(Ljava/lang/String;)Lnc;

    invoke-virtual {p0}, Lnm;->s()Lnd;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lnf;)Lnd;
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1}, Lnc;->a(Lnf;)Lnc;

    invoke-virtual {p0}, Lnm;->s()Lnd;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lnd;
    .locals 4

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    iget-object v2, p0, Lnm;->b:Lnr;

    iget-object v3, p0, Lnm;->a:Lnc;

    invoke-interface {v2, v3, v0, v1}, Lnr;->a_(Lnc;J)V

    :cond_1
    return-object p0
.end method

.method public final c([B)Lnd;
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1}, Lnc;->b([B)Lnc;

    invoke-virtual {p0}, Lnm;->s()Lnd;

    move-result-object p1

    return-object p1
.end method

.method public final c([BII)Lnd;
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1, p2, p3}, Lnc;->b([BII)Lnc;

    invoke-virtual {p0}, Lnm;->s()Lnd;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 5

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnm;->a:Lnc;

    iget-wide v1, v1, Lnc;->b:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    iget-object v1, p0, Lnm;->b:Lnr;

    iget-object v2, p0, Lnm;->a:Lnc;

    iget-object v3, p0, Lnm;->a:Lnc;

    iget-wide v3, v3, Lnc;->b:J

    invoke-interface {v1, v2, v3, v4}, Lnr;->a_(Lnc;J)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :cond_1
    :goto_0
    :try_start_1
    iget-object v1, p0, Lnm;->b:Lnr;

    invoke-interface {v1}, Lnr;->close()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    :goto_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lnm;->c:Z

    if-eqz v0, :cond_3

    invoke-static {v0}, Lnu;->a(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public final f(I)Lnd;
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1}, Lnc;->d(I)Lnc;

    invoke-virtual {p0}, Lnm;->s()Lnd;

    move-result-object p1

    return-object p1
.end method

.method public final flush()V
    .locals 4

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    iget-object v0, p0, Lnm;->b:Lnr;

    iget-object v1, p0, Lnm;->a:Lnc;

    iget-object v2, p0, Lnm;->a:Lnc;

    iget-wide v2, v2, Lnc;->b:J

    invoke-interface {v0, v1, v2, v3}, Lnr;->a_(Lnc;J)V

    :cond_1
    iget-object v0, p0, Lnm;->b:Lnr;

    invoke-interface {v0}, Lnr;->flush()V

    return-void
.end method

.method public final g(I)Lnd;
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1}, Lnc;->c(I)Lnc;

    invoke-virtual {p0}, Lnm;->s()Lnd;

    move-result-object p1

    return-object p1
.end method

.method public final h(I)Lnd;
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1}, Lnc;->b(I)Lnc;

    invoke-virtual {p0}, Lnm;->s()Lnd;

    move-result-object p1

    return-object p1
.end method

.method public final isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j(J)Lnd;
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1, p2}, Lnc;->i(J)Lnc;

    invoke-virtual {p0}, Lnm;->s()Lnd;

    move-result-object p1

    return-object p1
.end method

.method public final k(J)Lnd;
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1, p2}, Lnc;->h(J)Lnc;

    invoke-virtual {p0}, Lnm;->s()Lnd;

    move-result-object p1

    return-object p1
.end method

.method public final s()Lnd;
    .locals 4

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0}, Lnc;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    iget-object v2, p0, Lnm;->b:Lnr;

    iget-object v3, p0, Lnm;->a:Lnc;

    invoke-interface {v2, v3, v0, v1}, Lnr;->a_(Lnc;J)V

    :cond_1
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lnm;->b:Lnr;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    iget-boolean v0, p0, Lnm;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lnm;->a:Lnc;

    invoke-virtual {v0, p1}, Lnc;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Lnm;->s()Lnd;

    return p1
.end method
