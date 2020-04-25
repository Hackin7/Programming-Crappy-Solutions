.class final Lmz$a;
.super Ljava/lang/Object;

# interfaces
.implements Lnr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:J

.field c:Z

.field d:Z

.field final synthetic e:Lmz;


# direct methods
.method constructor <init>(Lmz;)V
    .locals 0

    iput-object p1, p0, Lmz$a;->e:Lmz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Lmz$a;->e:Lmz;

    iget-object v0, v0, Lmz;->c:Lnd;

    invoke-interface {v0}, Lnd;->a()Lnt;

    move-result-object v0

    return-object v0
.end method

.method public final a_(Lnc;J)V
    .locals 6

    iget-boolean v0, p0, Lmz$a;->d:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lmz$a;->e:Lmz;

    iget-object v0, v0, Lmz;->f:Lnc;

    invoke-virtual {v0, p1, p2, p3}, Lnc;->a_(Lnc;J)V

    iget-boolean p1, p0, Lmz$a;->c:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iget-wide v0, p0, Lmz$a;->b:J

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    iget-object p1, p0, Lmz$a;->e:Lmz;

    iget-object p1, p1, Lmz;->f:Lnc;

    iget-wide v0, p1, Lnc;->b:J

    iget-wide v2, p0, Lmz$a;->b:J

    const-wide/16 v4, 0x2000

    sub-long/2addr v2, v4

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    iget-object p3, p0, Lmz$a;->e:Lmz;

    iget-object p3, p3, Lmz;->f:Lnc;

    invoke-virtual {p3}, Lnc;->e()J

    move-result-wide v2

    const-wide/16 v0, 0x0

    cmp-long p3, v2, v0

    if-lez p3, :cond_2

    if-nez p1, :cond_2

    iget-object v0, p0, Lmz$a;->e:Lmz;

    iget v1, p0, Lmz$a;->a:I

    iget-boolean v4, p0, Lmz$a;->c:Z

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lmz;->a(IJZZ)V

    iput-boolean p2, p0, Lmz$a;->c:Z

    :cond_2
    return-void
.end method

.method public final close()V
    .locals 8

    iget-boolean v0, p0, Lmz$a;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v2, p0, Lmz$a;->e:Lmz;

    iget v3, p0, Lmz$a;->a:I

    iget-object v0, p0, Lmz$a;->e:Lmz;

    iget-object v0, v0, Lmz;->f:Lnc;

    iget-wide v4, v0, Lnc;->b:J

    iget-boolean v6, p0, Lmz$a;->c:Z

    const/4 v7, 0x1

    invoke-virtual/range {v2 .. v7}, Lmz;->a(IJZZ)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmz$a;->d:Z

    iget-object v0, p0, Lmz$a;->e:Lmz;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lmz;->h:Z

    return-void
.end method

.method public final flush()V
    .locals 8

    iget-boolean v0, p0, Lmz$a;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v2, p0, Lmz$a;->e:Lmz;

    iget v3, p0, Lmz$a;->a:I

    iget-object v0, p0, Lmz$a;->e:Lmz;

    iget-object v0, v0, Lmz;->f:Lnc;

    iget-wide v4, v0, Lnc;->b:J

    iget-boolean v6, p0, Lmz$a;->c:Z

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Lmz;->a(IJZZ)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lmz$a;->c:Z

    return-void
.end method
