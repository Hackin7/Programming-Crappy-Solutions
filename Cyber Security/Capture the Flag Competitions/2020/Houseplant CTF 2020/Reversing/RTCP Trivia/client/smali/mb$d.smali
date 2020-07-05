.class final Lmb$d;
.super Lku;

# interfaces
.implements Lmc$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final a:Lmc;

.field final synthetic c:Lmb;


# direct methods
.method constructor <init>(Lmb;Lmc;)V
    .locals 3

    iput-object p1, p0, Lmb$d;->c:Lmb;

    const-string v0, "OkHttp %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object p1, p1, Lmb;->d:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-direct {p0, v0, v1}, Lku;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p2, p0, Lmb$d;->a:Lmc;

    return-void
.end method


# virtual methods
.method public final a(IJ)V
    .locals 3

    if-nez p1, :cond_0

    iget-object v0, p0, Lmb$d;->c:Lmb;

    monitor-enter v0

    :try_start_0
    iget-object p1, p0, Lmb$d;->c:Lmb;

    iget-wide v1, p1, Lmb;->l:J

    add-long/2addr v1, p2

    iput-wide v1, p1, Lmb;->l:J

    iget-object p1, p0, Lmb$d;->c:Lmb;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    iget-object v0, p0, Lmb$d;->c:Lmb;

    invoke-virtual {v0, p1}, Lmb;->a(I)Lmd;

    move-result-object p1

    if-eqz p1, :cond_1

    monitor-enter p1

    :try_start_1
    invoke-virtual {p1, p2, p3}, Lmd;->a(J)V

    monitor-exit p1

    return-void

    :catchall_1
    move-exception p2

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p2

    :cond_1
    return-void
.end method

.method public final a(ILjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Llx;",
            ">;)V"
        }
    .end annotation

    iget-object v1, p0, Lmb$d;->c:Lmb;

    monitor-enter v1

    :try_start_0
    iget-object v0, v1, Lmb;->s:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Llw;->b:Llw;

    invoke-virtual {v1, p1, p2}, Lmb;->a(ILlw;)V

    monitor-exit v1

    return-void

    :cond_0
    iget-object v0, v1, Lmb;->s:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v6, v1, Lmb;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v7, Lmb$3;

    const-string v2, "OkHttp %s Push Request[%s]"

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v4, v1, Lmb;->d:Ljava/lang/String;

    aput-object v4, v3, v0

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    move-object v0, v7

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lmb$3;-><init>(Lmb;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final a(ILlw;)V
    .locals 8

    invoke-static {p1}, Lmb;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lmb$d;->c:Lmb;

    iget-object v0, v2, Lmb;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v7, Lmb$6;

    const-string v3, "OkHttp %s Push Reset[%s]"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v5, v2, Lmb;->d:Ljava/lang/String;

    aput-object v5, v4, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    move-object v1, v7

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lmb$6;-><init>(Lmb;Ljava/lang/String;[Ljava/lang/Object;ILlw;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lmb$d;->c:Lmb;

    invoke-virtual {v0, p1}, Lmb;->b(I)Lmd;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, Lmd;->c(Llw;)V

    :cond_1
    return-void
.end method

.method public final a(ILnf;)V
    .locals 4

    invoke-virtual {p2}, Lnf;->g()I

    iget-object p2, p0, Lmb$d;->c:Lmb;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lmb$d;->c:Lmb;

    iget-object v0, v0, Lmb;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lmb$d;->c:Lmb;

    iget-object v1, v1, Lmb;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Lmd;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmd;

    iget-object v1, p0, Lmb$d;->c:Lmb;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lmb;->g:Z

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    array-length p2, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v2, v0, v1

    iget v3, v2, Lmd;->c:I

    if-le v3, p1, :cond_0

    invoke-virtual {v2}, Lmd;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Llw;->e:Llw;

    invoke-virtual {v2, v3}, Lmd;->c(Llw;)V

    iget-object v3, p0, Lmb$d;->c:Lmb;

    iget v2, v2, Lmd;->c:I

    invoke-virtual {v3, v2}, Lmb;->b(I)Lmd;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Lmh;)V
    .locals 12

    iget-object v0, p0, Lmb$d;->c:Lmb;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lmb$d;->c:Lmb;

    iget-object v1, v1, Lmb;->n:Lmh;

    invoke-virtual {v1}, Lmh;->b()I

    move-result v1

    iget-object v2, p0, Lmb$d;->c:Lmb;

    iget-object v2, v2, Lmb;->n:Lmh;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/16 v5, 0xa

    if-ge v4, v5, :cond_1

    invoke-virtual {p1, v4}, Lmh;->a(I)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p1, Lmh;->b:[I

    aget v5, v5, v4

    invoke-virtual {v2, v4, v5}, Lmh;->a(II)Lmh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    :try_start_1
    iget-object v4, p0, Lmb$d;->c:Lmb;

    invoke-static {v4}, Lmb;->b(Lmb;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v4

    new-instance v5, Lmb$d$3;

    const-string v6, "OkHttp %s ACK Settings"

    new-array v7, v2, [Ljava/lang/Object;

    iget-object v8, p0, Lmb$d;->c:Lmb;

    iget-object v8, v8, Lmb;->d:Ljava/lang/String;

    aput-object v8, v7, v3

    invoke-direct {v5, p0, v6, v7, p1}, Lmb$d$3;-><init>(Lmb$d;Ljava/lang/String;[Ljava/lang/Object;Lmh;)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catch_0
    :try_start_2
    iget-object p1, p0, Lmb$d;->c:Lmb;

    iget-object p1, p1, Lmb;->n:Lmh;

    invoke-virtual {p1}, Lmh;->b()I

    move-result p1

    const/4 v4, -0x1

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    if-eq p1, v4, :cond_4

    if-eq p1, v1, :cond_4

    sub-int/2addr p1, v1

    int-to-long v8, p1

    iget-object p1, p0, Lmb$d;->c:Lmb;

    iget-boolean p1, p1, Lmb;->o:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lmb$d;->c:Lmb;

    iget-wide v10, p1, Lmb;->l:J

    add-long/2addr v10, v8

    iput-wide v10, p1, Lmb;->l:J

    cmp-long v1, v8, v5

    if-lez v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    :cond_2
    iget-object p1, p0, Lmb$d;->c:Lmb;

    iput-boolean v2, p1, Lmb;->o:Z

    :cond_3
    iget-object p1, p0, Lmb$d;->c:Lmb;

    iget-object p1, p1, Lmb;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lmb$d;->c:Lmb;

    iget-object p1, p1, Lmb;->c:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    iget-object v1, p0, Lmb$d;->c:Lmb;

    iget-object v1, v1, Lmb;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Lmd;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, [Lmd;

    goto :goto_1

    :cond_4
    move-wide v8, v5

    :cond_5
    :goto_1
    invoke-static {}, Lmb;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v1, Lmb$d$2;

    const-string v4, "OkHttp %s settings"

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v10, p0, Lmb$d;->c:Lmb;

    iget-object v10, v10, Lmb;->d:Ljava/lang/String;

    aput-object v10, v2, v3

    invoke-direct {v1, p0, v4, v2}, Lmb$d$2;-><init>(Lmb$d;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v7, :cond_6

    cmp-long p1, v8, v5

    if-eqz p1, :cond_6

    array-length p1, v7

    :goto_2
    if-ge v3, p1, :cond_6

    aget-object v0, v7, v3

    monitor-enter v0

    :try_start_3
    invoke-virtual {v0, v8, v9}, Lmd;->a(J)V

    monitor-exit v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :cond_6
    return-void

    :catchall_1
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final a(ZII)V
    .locals 3

    if-eqz p1, :cond_0

    iget-object p1, p0, Lmb$d;->c:Lmb;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Lmb$d;->c:Lmb;

    invoke-static {p2}, Lmb;->c(Lmb;)Z

    iget-object p2, p0, Lmb$d;->c:Lmb;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_0
    :try_start_1
    iget-object p1, p0, Lmb$d;->c:Lmb;

    invoke-static {p1}, Lmb;->b(Lmb;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v0, Lmb$c;

    iget-object v1, p0, Lmb$d;->c:Lmb;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p2, p3}, Lmb$c;-><init>(Lmb;ZII)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void
.end method

.method public final a(ZILjava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/util/List<",
            "Llx;",
            ">;)V"
        }
    .end annotation

    invoke-static {p2}, Lmb;->c(I)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    iget-object v5, p0, Lmb$d;->c:Lmb;

    :try_start_0
    iget-object v0, v5, Lmb;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v11, Lmb$4;

    const-string v6, "OkHttp %s Push Headers[%s]"

    new-array v7, v3, [Ljava/lang/Object;

    iget-object v3, v5, Lmb;->d:Ljava/lang/String;

    aput-object v3, v7, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v7, v2

    move-object v4, v11

    move v8, p2

    move-object v9, p3

    move v10, p1

    invoke-direct/range {v4 .. v10}, Lmb$4;-><init>(Lmb;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V

    invoke-interface {v0, v11}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :cond_0
    iget-object v0, p0, Lmb$d;->c:Lmb;

    monitor-enter v0

    :try_start_1
    iget-object v4, p0, Lmb$d;->c:Lmb;

    invoke-virtual {v4, p2}, Lmb;->a(I)Lmd;

    move-result-object v4

    if-nez v4, :cond_4

    iget-object v4, p0, Lmb$d;->c:Lmb;

    iget-boolean v4, v4, Lmb;->g:Z

    if-eqz v4, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    iget-object v4, p0, Lmb$d;->c:Lmb;

    iget v4, v4, Lmb;->e:I

    if-gt p2, v4, :cond_2

    monitor-exit v0

    return-void

    :cond_2
    rem-int/lit8 v4, p2, 0x2

    iget-object v5, p0, Lmb$d;->c:Lmb;

    iget v5, v5, Lmb;->f:I

    rem-int/2addr v5, v3

    if-ne v4, v5, :cond_3

    monitor-exit v0

    return-void

    :cond_3
    new-instance v10, Lmd;

    iget-object v6, p0, Lmb$d;->c:Lmb;

    const/4 v7, 0x0

    move-object v4, v10

    move v5, p2

    move v8, p1

    move-object v9, p3

    invoke-direct/range {v4 .. v9}, Lmd;-><init>(ILmb;ZZLjava/util/List;)V

    iget-object p1, p0, Lmb$d;->c:Lmb;

    iput p2, p1, Lmb;->e:I

    iget-object p1, p0, Lmb$d;->c:Lmb;

    iget-object p1, p1, Lmb;->c:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lmb;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance p3, Lmb$d$1;

    const-string v4, "OkHttp %s stream %d"

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lmb$d;->c:Lmb;

    iget-object v5, v5, Lmb;->d:Ljava/lang/String;

    aput-object v5, v3, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v3, v2

    invoke-direct {p3, p0, v4, v3, v10}, Lmb$d$1;-><init>(Lmb$d;Ljava/lang/String;[Ljava/lang/Object;Lmd;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :cond_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    sget-boolean p2, Lmd;->l:Z

    if-nez p2, :cond_5

    invoke-static {v4}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_5
    monitor-enter v4

    :try_start_2
    iput-boolean v2, v4, Lmd;->f:Z

    iget-object p2, v4, Lmd;->e:Ljava/util/List;

    if-nez p2, :cond_6

    iput-object p3, v4, Lmd;->e:Ljava/util/List;

    invoke-virtual {v4}, Lmd;->a()Z

    move-result v2

    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :cond_6
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v4, Lmd;->e:Ljava/util/List;

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p2, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iput-object p2, v4, Lmd;->e:Ljava/util/List;

    :goto_0
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v2, :cond_7

    iget-object p2, v4, Lmd;->d:Lmb;

    iget p3, v4, Lmd;->c:I

    invoke-virtual {p2, p3}, Lmb;->b(I)Lmd;

    :cond_7
    if-eqz p1, :cond_8

    invoke-virtual {v4}, Lmd;->e()V

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final a(ZILne;I)V
    .locals 9

    invoke-static {p2}, Lmb;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lmb$d;->c:Lmb;

    new-instance v6, Lnc;

    invoke-direct {v6}, Lnc;-><init>()V

    int-to-long v0, p4

    invoke-interface {p3, v0, v1}, Lne;->a(J)V

    invoke-interface {p3, v6, v0, v1}, Lne;->a(Lnc;J)J

    iget-wide v3, v6, Lnc;->b:J

    cmp-long p3, v3, v0

    if-eqz p3, :cond_0

    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v0, v6, Lnc;->b:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " != "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object p3, v2, Lmb;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lmb$5;

    const-string v3, "OkHttp %s Push Data[%s]"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v5, v2, Lmb;->d:Ljava/lang/String;

    aput-object v5, v4, v1

    const/4 v1, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    move-object v1, v0

    move v5, p2

    move v7, p4

    move v8, p1

    invoke-direct/range {v1 .. v8}, Lmb$5;-><init>(Lmb;Ljava/lang/String;[Ljava/lang/Object;ILnc;IZ)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    iget-object v0, p0, Lmb$d;->c:Lmb;

    invoke-virtual {v0, p2}, Lmb;->a(I)Lmd;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object p1, p0, Lmb$d;->c:Lmb;

    sget-object v0, Llw;->b:Llw;

    invoke-virtual {p1, p2, v0}, Lmb;->a(ILlw;)V

    int-to-long p1, p4

    invoke-interface {p3, p1, p2}, Lne;->g(J)V

    return-void

    :cond_2
    sget-boolean p2, Lmd;->l:Z

    if-nez p2, :cond_3

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    iget-object p2, v0, Lmd;->g:Lmd$b;

    int-to-long v1, p4

    invoke-virtual {p2, p3, v1, v2}, Lmd$b;->a(Lne;J)V

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Lmd;->e()V

    :cond_4
    return-void
.end method

.method protected final b()V
    .locals 10

    sget-object v0, Llw;->c:Llw;

    sget-object v1, Llw;->c:Llw;

    :try_start_0
    iget-object v2, p0, Lmb$d;->a:Lmc;

    iget-boolean v3, v2, Lmc;->c:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v2, v4, p0}, Lmc;->a(ZLmc$b;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "Required SETTINGS preface not received"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v2, v3}, Llz;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v2

    throw v2

    :cond_0
    iget-object v2, v2, Lmc;->b:Lne;

    sget-object v3, Llz;->a:Lnf;

    invoke-virtual {v3}, Lnf;->g()I

    move-result v3

    int-to-long v6, v3

    invoke-interface {v2, v6, v7}, Lne;->c(J)Lnf;

    move-result-object v2

    sget-object v3, Lmc;->a:Ljava/util/logging/Logger;

    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v6}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Lmc;->a:Ljava/util/logging/Logger;

    const-string v6, "<< CONNECTION %s"

    new-array v7, v4, [Ljava/lang/Object;

    invoke-virtual {v2}, Lnf;->e()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v5

    invoke-static {v6, v7}, Lkv;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_1
    sget-object v3, Llz;->a:Lnf;

    invoke-virtual {v3, v2}, Lnf;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "Expected a connection header but was %s"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v2}, Lnf;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v4, v5

    invoke-static {v3, v4}, Llz;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v2

    throw v2

    :cond_2
    iget-object v2, p0, Lmb$d;->a:Lmc;

    invoke-virtual {v2, v5, p0}, Lmc;->a(ZLmc$b;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Llw;->a:Llw;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v0, Llw;->f:Llw;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v1, p0, Lmb$d;->c:Lmb;

    :goto_0
    invoke-virtual {v1, v2, v0}, Lmb;->a(Llw;Llw;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    iget-object v0, p0, Lmb$d;->a:Lmc;

    invoke-static {v0}, Lkv;->a(Ljava/io/Closeable;)V

    return-void

    :catch_1
    move-object v0, v2

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_2
    :goto_1
    :try_start_3
    sget-object v2, Llw;->b:Llw;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    sget-object v0, Llw;->b:Llw;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-object v1, p0, Lmb$d;->c:Lmb;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v9, v2

    move-object v2, v0

    move-object v0, v9

    :goto_2
    :try_start_6
    iget-object v3, p0, Lmb$d;->c:Lmb;

    invoke-virtual {v3, v0, v1}, Lmb;->a(Llw;Llw;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    :catch_3
    iget-object v0, p0, Lmb$d;->a:Lmc;

    invoke-static {v0}, Lkv;->a(Ljava/io/Closeable;)V

    throw v2
.end method
