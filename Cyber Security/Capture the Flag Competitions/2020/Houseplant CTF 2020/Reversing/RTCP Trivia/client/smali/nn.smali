.class final Lnn;
.super Ljava/lang/Object;

# interfaces
.implements Lne;


# instance fields
.field public final a:Lnc;

.field public final b:Lns;

.field c:Z


# direct methods
.method constructor <init>(Lns;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnc;

    invoke-direct {v0}, Lnc;-><init>()V

    iput-object v0, p0, Lnn;->a:Lnc;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lnn;->b:Lns;

    return-void
.end method

.method private a(BJJ)J
    .locals 8

    iget-boolean v0, p0, Lnn;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-gez v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    cmp-long v0, p2, p4

    const-wide/16 v6, -0x1

    if-gez v0, :cond_4

    iget-object v0, p0, Lnn;->a:Lnc;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lnc;->a(BJJ)J

    move-result-wide v0

    cmp-long v2, v0, v6

    if-eqz v2, :cond_2

    return-wide v0

    :cond_2
    iget-object v0, p0, Lnn;->a:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    cmp-long v2, v0, p4

    if-gez v2, :cond_4

    iget-object v2, p0, Lnn;->b:Lns;

    iget-object v3, p0, Lnn;->a:Lnc;

    const-wide/16 v4, 0x2000

    invoke-interface {v2, v3, v4, v5}, Lns;->a(Lnc;J)J

    move-result-wide v2

    cmp-long v2, v2, v6

    if-nez v2, :cond_3

    return-wide v6

    :cond_3
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    :cond_4
    return-wide v6

    :goto_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "fromIndex=%s toIndex=%s"

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, p3, v2

    const/4 v0, 0x1

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p4

    aput-object p4, p3, v0

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private b(J)Z
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "byteCount < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v0, p0, Lnn;->c:Z

    if-eqz v0, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lnn;->a:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    cmp-long v0, v0, p1

    if-gez v0, :cond_2

    iget-object v0, p0, Lnn;->b:Lns;

    iget-object v1, p0, Lnn;->a:Lnc;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lns;->a(Lnc;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final a(Lnc;J)J
    .locals 4

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "sink == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-gez v2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "byteCount < 0: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v2, p0, Lnn;->c:Z

    if-eqz v2, :cond_2

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, p0, Lnn;->a:Lnc;

    iget-wide v2, v2, Lnc;->b:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lnn;->b:Lns;

    iget-object v1, p0, Lnn;->a:Lnc;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lns;->a(Lnc;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    return-wide v2

    :cond_3
    iget-object v0, p0, Lnn;->a:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0, p1, p2, p3}, Lnc;->a(Lnc;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Lnn;->b:Lns;

    invoke-interface {v0}, Lns;->a()Lnt;

    move-result-object v0

    return-object v0
.end method

.method public final a(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnn;->b(J)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_0
    return-void
.end method

.method public final a([B)V
    .locals 6

    :try_start_0
    array-length v0, p1

    int-to-long v0, v0

    invoke-virtual {p0, v0, v1}, Lnn;->a(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0, p1}, Lnc;->a([B)V

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lnn;->a:Lnc;

    iget-wide v2, v2, Lnc;->b:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    iget-object v2, p0, Lnn;->a:Lnc;

    iget-object v3, p0, Lnn;->a:Lnc;

    iget-wide v3, v3, Lnc;->b:J

    long-to-int v3, v3

    invoke-virtual {v2, p1, v1, v3}, Lnc;->a([BII)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_0
    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    throw v0
.end method

.method public final b()Lnc;
    .locals 1

    iget-object v0, p0, Lnn;->a:Lnc;

    return-object v0
.end method

.method public final b(Lnc;J)V
    .locals 1

    :try_start_0
    invoke-virtual {p0, p2, p3}, Lnn;->a(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0, p1, p2, p3}, Lnc;->b(Lnc;J)V

    return-void

    :catch_0
    move-exception p2

    iget-object p3, p0, Lnn;->a:Lnc;

    invoke-virtual {p1, p3}, Lnc;->a(Lns;)J

    throw p2
.end method

.method public final c(J)Lnf;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lnn;->a(J)V

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0, p1, p2}, Lnc;->c(J)Lnf;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lnn;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnn;->c:Z

    iget-object v0, p0, Lnn;->b:Lns;

    invoke-interface {v0}, Lns;->close()V

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0}, Lnc;->q()V

    return-void
.end method

.method public final d(J)Ljava/lang/String;
    .locals 13

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "limit < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    const-wide/16 v3, 0x1

    if-nez v2, :cond_1

    move-wide v5, v0

    goto :goto_0

    :cond_1
    add-long v5, p1, v3

    :goto_0
    const/16 v8, 0xa

    const-wide/16 v9, 0x0

    move-object v7, p0

    move-wide v11, v5

    invoke-direct/range {v7 .. v12}, Lnn;->a(BJJ)J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v2, v7, v9

    if-eqz v2, :cond_2

    iget-object p1, p0, Lnn;->a:Lnc;

    invoke-virtual {p1, v7, v8}, Lnc;->e(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    cmp-long v0, v5, v0

    if-gez v0, :cond_3

    invoke-direct {p0, v5, v6}, Lnn;->b(J)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnn;->a:Lnc;

    sub-long v1, v5, v3

    invoke-virtual {v0, v1, v2}, Lnc;->b(J)B

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    add-long/2addr v3, v5

    invoke-direct {p0, v3, v4}, Lnn;->b(J)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0, v5, v6}, Lnc;->b(J)B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    iget-object p1, p0, Lnn;->a:Lnc;

    invoke-virtual {p1, v5, v6}, Lnc;->e(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v6, Lnc;

    invoke-direct {v6}, Lnc;-><init>()V

    iget-object v0, p0, Lnn;->a:Lnc;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x20

    iget-object v1, p0, Lnn;->a:Lnc;

    iget-wide v7, v1, Lnc;->b:J

    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lnc;->a(Lnc;JJ)Lnc;

    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\\n not found: limit="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lnn;->a:Lnc;

    iget-wide v2, v2, Lnc;->b:J

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " content="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lnc;->m()Lnf;

    move-result-object p1

    invoke-virtual {p1}, Lnf;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2026

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Z
    .locals 4

    iget-boolean v0, p0, Lnn;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0}, Lnc;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnn;->b:Lns;

    iget-object v1, p0, Lnn;->a:Lnc;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lns;->a(Lnc;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final f()B
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lnn;->a(J)V

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0}, Lnc;->f()B

    move-result v0

    return v0
.end method

.method public final f(J)[B
    .locals 1

    invoke-virtual {p0, p1, p2}, Lnn;->a(J)V

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0, p1, p2}, Lnc;->f(J)[B

    move-result-object p1

    return-object p1
.end method

.method public final g()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lnn;->a(J)V

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0}, Lnc;->g()S

    move-result v0

    return v0
.end method

.method public final g(J)V
    .locals 4

    iget-boolean v0, p0, Lnn;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    iget-object v2, p0, Lnn;->a:Lnc;

    iget-wide v2, v2, Lnc;->b:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnn;->b:Lns;

    iget-object v1, p0, Lnn;->a:Lnc;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lns;->a(Lnc;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    iget-object v0, p0, Lnn;->a:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lnn;->a:Lnc;

    invoke-virtual {v2, v0, v1}, Lnc;->g(J)V

    sub-long/2addr p1, v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final h()I
    .locals 2

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lnn;->a(J)V

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0}, Lnc;->h()I

    move-result v0

    return v0
.end method

.method public final i()J
    .locals 2

    const-wide/16 v0, 0x8

    invoke-virtual {p0, v0, v1}, Lnn;->a(J)V

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0}, Lnc;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public final isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lnn;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lnn;->a(J)V

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0}, Lnc;->g()S

    move-result v0

    invoke-static {v0}, Lnu;->a(S)S

    move-result v0

    return v0
.end method

.method public final k()I
    .locals 2

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lnn;->a(J)V

    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0}, Lnc;->h()I

    move-result v0

    invoke-static {v0}, Lnu;->a(I)I

    move-result v0

    return v0
.end method

.method public final l()J
    .locals 6

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lnn;->a(J)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    int-to-long v3, v2

    invoke-direct {p0, v3, v4}, Lnn;->b(J)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lnn;->a:Lnc;

    int-to-long v4, v1

    invoke-virtual {v3, v4, v5}, Lnc;->b(J)B

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_0

    const/16 v4, 0x39

    if-le v3, v4, :cond_2

    :cond_0
    const/16 v4, 0x61

    if-lt v3, v4, :cond_1

    const/16 v4, 0x66

    if-le v3, v4, :cond_2

    :cond_1
    const/16 v4, 0x41

    if-lt v3, v4, :cond_3

    const/16 v4, 0x46

    if-le v3, v4, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/NumberFormatException;

    const-string v2, "Expected leading [0-9a-fA-F] character but was %#x"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    aput-object v3, v4, v0

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0}, Lnc;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method public final o()Ljava/lang/String;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lnn;->d(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final r()J
    .locals 6

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lnn;->a(BJJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 4

    iget-object v0, p0, Lnn;->a:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lnn;->b:Lns;

    iget-object v1, p0, Lnn;->a:Lnc;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lns;->a(Lnc;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lnn;->a:Lnc;

    invoke-virtual {v0, p1}, Lnc;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lnn;->b:Lns;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
