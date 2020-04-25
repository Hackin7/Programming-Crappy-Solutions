.class final Lna$1;
.super Ljava/lang/Object;

# interfaces
.implements Lnr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lna;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnr;

.field final synthetic b:Lna;


# direct methods
.method constructor <init>(Lna;Lnr;)V
    .locals 0

    iput-object p1, p0, Lna$1;->b:Lna;

    iput-object p2, p0, Lna$1;->a:Lnr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Lna$1;->b:Lna;

    return-object v0
.end method

.method public final a_(Lnc;J)V
    .locals 6

    iget-wide v0, p1, Lnc;->b:J

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Lnu;->a(JJJ)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_2

    iget-object v2, p1, Lnc;->a:Lno;

    :goto_1
    const-wide/32 v3, 0x10000

    cmp-long v3, v0, v3

    if-gez v3, :cond_1

    iget v3, v2, Lno;->c:I

    iget v4, v2, Lno;->b:I

    sub-int/2addr v3, v4

    int-to-long v3, v3

    add-long/2addr v0, v3

    cmp-long v3, v0, p2

    if-ltz v3, :cond_0

    move-wide v0, p2

    goto :goto_2

    :cond_0
    iget-object v2, v2, Lno;->f:Lno;

    goto :goto_1

    :cond_1
    :goto_2
    iget-object v2, p0, Lna$1;->b:Lna;

    invoke-virtual {v2}, Lna;->b_()V

    :try_start_0
    iget-object v2, p0, Lna$1;->a:Lnr;

    invoke-interface {v2, p1, v0, v1}, Lnr;->a_(Lnc;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr p2, v0

    iget-object v0, p0, Lna$1;->b:Lna;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lna;->a(Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p0, Lna$1;->b:Lna;

    invoke-virtual {p2, p1}, Lna;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    iget-object p2, p0, Lna$1;->b:Lna;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lna;->a(Z)V

    throw p1

    :cond_2
    return-void
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lna$1;->b:Lna;

    invoke-virtual {v0}, Lna;->b_()V

    :try_start_0
    iget-object v0, p0, Lna$1;->a:Lnr;

    invoke-interface {v0}, Lnr;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lna$1;->b:Lna;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lna;->a(Z)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    iget-object v1, p0, Lna$1;->b:Lna;

    invoke-virtual {v1, v0}, Lna;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iget-object v1, p0, Lna$1;->b:Lna;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lna;->a(Z)V

    throw v0
.end method

.method public final flush()V
    .locals 3

    iget-object v0, p0, Lna$1;->b:Lna;

    invoke-virtual {v0}, Lna;->b_()V

    :try_start_0
    iget-object v0, p0, Lna$1;->a:Lnr;

    invoke-interface {v0}, Lnr;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lna$1;->b:Lna;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lna;->a(Z)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    iget-object v1, p0, Lna$1;->b:Lna;

    invoke-virtual {v1, v0}, Lna;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iget-object v1, p0, Lna$1;->b:Lna;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lna;->a(Z)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AsyncTimeout.sink("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lna$1;->a:Lnr;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
