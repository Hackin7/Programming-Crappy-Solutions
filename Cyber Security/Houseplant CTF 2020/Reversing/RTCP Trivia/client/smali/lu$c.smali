.class final Llu$c;
.super Llu$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic e:Llu;

.field private final f:Lkf;

.field private g:J

.field private h:Z


# direct methods
.method constructor <init>(Llu;Lkf;)V
    .locals 2

    iput-object p1, p0, Llu$c;->e:Llu;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Llu$a;-><init>(Llu;B)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Llu$c;->g:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Llu$c;->h:Z

    iput-object p2, p0, Llu$c;->f:Lkf;

    return-void
.end method


# virtual methods
.method public final a(Lnc;J)J
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-gez v2, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "byteCount < 0: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-boolean v2, p0, Llu$c;->b:Z

    if-eqz v2, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v2, p0, Llu$c;->h:Z

    const-wide/16 v3, -0x1

    if-nez v2, :cond_2

    return-wide v3

    :cond_2
    iget-wide v5, p0, Llu$c;->g:J

    cmp-long v2, v5, v0

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    iget-wide v6, p0, Llu$c;->g:J

    cmp-long v2, v6, v3

    if-nez v2, :cond_7

    :cond_3
    iget-wide v6, p0, Llu$c;->g:J

    cmp-long v2, v6, v3

    if-eqz v2, :cond_4

    iget-object v2, p0, Llu$c;->e:Llu;

    iget-object v2, v2, Llu;->c:Lne;

    invoke-interface {v2}, Lne;->o()Ljava/lang/String;

    :cond_4
    :try_start_0
    iget-object v2, p0, Llu$c;->e:Llu;

    iget-object v2, v2, Llu;->c:Lne;

    invoke-interface {v2}, Lne;->l()J

    move-result-wide v6

    iput-wide v6, p0, Llu$c;->g:J

    iget-object v2, p0, Llu$c;->e:Llu;

    iget-object v2, v2, Llu;->c:Lne;

    invoke-interface {v2}, Lne;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    iget-wide v6, p0, Llu$c;->g:J

    cmp-long v6, v6, v0

    if-ltz v6, :cond_9

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    const-string v6, ";"

    invoke-virtual {v2, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v6, :cond_5

    goto :goto_0

    :cond_5
    iget-wide v6, p0, Llu$c;->g:J

    cmp-long v0, v6, v0

    if-nez v0, :cond_6

    iput-boolean v5, p0, Llu$c;->h:Z

    iget-object v0, p0, Llu$c;->e:Llu;

    iget-object v0, v0, Llu;->a:Lki;

    iget-object v0, v0, Lki;->k:Ljz;

    iget-object v1, p0, Llu$c;->f:Lkf;

    iget-object v2, p0, Llu$c;->e:Llu;

    invoke-virtual {v2}, Llu;->d()Lke;

    move-result-object v2

    invoke-static {v0, v1, v2}, Llm;->a(Ljz;Lkf;Lke;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Llu$c;->a(ZLjava/io/IOException;)V

    :cond_6
    iget-boolean v0, p0, Llu$c;->h:Z

    if-nez v0, :cond_7

    return-wide v3

    :cond_7
    iget-wide v0, p0, Llu$c;->g:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, Llu$a;->a(Lnc;J)J

    move-result-wide p1

    cmp-long p3, p1, v3

    if-nez p3, :cond_8

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v5, p1}, Llu$c;->a(ZLjava/io/IOException;)V

    throw p1

    :cond_8
    iget-wide v0, p0, Llu$c;->g:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Llu$c;->g:J

    return-wide p1

    :cond_9
    :goto_0
    :try_start_1
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "expected chunk size and optional extensions but was \""

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v0, p0, Llu$c;->g:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/net/ProtocolException;

    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final close()V
    .locals 2

    iget-boolean v0, p0, Llu$c;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Llu$c;->h:Z

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0}, Lkv;->a(Lns;Ljava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Llu$c;->a(ZLjava/io/IOException;)V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Llu$c;->b:Z

    return-void
.end method
