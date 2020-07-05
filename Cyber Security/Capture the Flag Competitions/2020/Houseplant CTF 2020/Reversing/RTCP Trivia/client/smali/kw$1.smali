.class final Lkw$1;
.super Ljava/lang/Object;

# interfaces
.implements Lns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lne;

.field final synthetic c:Lkx;

.field final synthetic d:Lnd;

.field final synthetic e:Lkw;


# direct methods
.method constructor <init>(Lkw;Lne;Lkx;Lnd;)V
    .locals 0

    iput-object p1, p0, Lkw$1;->e:Lkw;

    iput-object p2, p0, Lkw$1;->b:Lne;

    iput-object p3, p0, Lkw$1;->c:Lkx;

    iput-object p4, p0, Lkw$1;->d:Lnd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnc;J)J
    .locals 8

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lkw$1;->b:Lne;

    invoke-interface {v1, p1, p2, p3}, Lne;->a(Lnc;J)J

    move-result-wide p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v1, -0x1

    cmp-long v3, p2, v1

    if-nez v3, :cond_1

    iget-boolean p1, p0, Lkw$1;->a:Z

    if-nez p1, :cond_0

    iput-boolean v0, p0, Lkw$1;->a:Z

    iget-object p1, p0, Lkw$1;->d:Lnd;

    invoke-interface {p1}, Lnd;->close()V

    :cond_0
    return-wide v1

    :cond_1
    iget-object v0, p0, Lkw$1;->d:Lnd;

    invoke-interface {v0}, Lnd;->b()Lnc;

    move-result-object v3

    iget-wide v0, p1, Lnc;->b:J

    sub-long v4, v0, p2

    move-object v2, p1

    move-wide v6, p2

    invoke-virtual/range {v2 .. v7}, Lnc;->a(Lnc;JJ)Lnc;

    iget-object p1, p0, Lkw$1;->d:Lnd;

    invoke-interface {p1}, Lnd;->s()Lnd;

    return-wide p2

    :catch_0
    move-exception p1

    iget-boolean p2, p0, Lkw$1;->a:Z

    if-nez p2, :cond_2

    iput-boolean v0, p0, Lkw$1;->a:Z

    :cond_2
    throw p1
.end method

.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Lkw$1;->b:Lne;

    invoke-interface {v0}, Lne;->a()Lnt;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lkw$1;->a:Z

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0}, Lkv;->a(Lns;Ljava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkw$1;->a:Z

    :cond_0
    iget-object v0, p0, Lkw$1;->b:Lne;

    invoke-interface {v0}, Lne;->close()V

    return-void
.end method
