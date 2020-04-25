.class final Llu$b;
.super Ljava/lang/Object;

# interfaces
.implements Lnr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Llu;

.field private final b:Lni;

.field private c:Z


# direct methods
.method constructor <init>(Llu;)V
    .locals 1

    iput-object p1, p0, Llu$b;->a:Llu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lni;

    iget-object v0, p0, Llu$b;->a:Llu;

    iget-object v0, v0, Llu;->d:Lnd;

    invoke-interface {v0}, Lnd;->a()Lnt;

    move-result-object v0

    invoke-direct {p1, v0}, Lni;-><init>(Lnt;)V

    iput-object p1, p0, Llu$b;->b:Lni;

    return-void
.end method


# virtual methods
.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Llu$b;->b:Lni;

    return-object v0
.end method

.method public final a_(Lnc;J)V
    .locals 2

    iget-boolean v0, p0, Llu$b;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Llu$b;->a:Llu;

    iget-object v0, v0, Llu;->d:Lnd;

    invoke-interface {v0, p2, p3}, Lnd;->j(J)Lnd;

    iget-object v0, p0, Llu$b;->a:Llu;

    iget-object v0, v0, Llu;->d:Lnd;

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lnd;->b(Ljava/lang/String;)Lnd;

    iget-object v0, p0, Llu$b;->a:Llu;

    iget-object v0, v0, Llu;->d:Lnd;

    invoke-interface {v0, p1, p2, p3}, Lnd;->a_(Lnc;J)V

    iget-object p1, p0, Llu$b;->a:Llu;

    iget-object p1, p1, Llu;->d:Lnd;

    const-string p2, "\r\n"

    invoke-interface {p1, p2}, Lnd;->b(Ljava/lang/String;)Lnd;

    return-void
.end method

.method public final declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Llu$b;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Llu$b;->c:Z

    iget-object v0, p0, Llu$b;->a:Llu;

    iget-object v0, v0, Llu;->d:Lnd;

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lnd;->b(Ljava/lang/String;)Lnd;

    iget-object v0, p0, Llu$b;->b:Lni;

    invoke-static {v0}, Llu;->a(Lni;)V

    iget-object v0, p0, Llu$b;->a:Llu;

    const/4 v1, 0x3

    iput v1, v0, Llu;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Llu$b;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Llu$b;->a:Llu;

    iget-object v0, v0, Llu;->d:Lnd;

    invoke-interface {v0}, Lnd;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
