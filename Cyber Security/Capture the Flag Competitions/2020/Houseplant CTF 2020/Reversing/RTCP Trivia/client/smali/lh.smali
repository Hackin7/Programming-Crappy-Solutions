.class public final Llh;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llh$a;
    }
.end annotation


# static fields
.field public static final synthetic k:Z = true


# instance fields
.field public final a:Ljo;

.field public b:Llg$a;

.field public c:Lkp;

.field public final d:Ljw;

.field public final e:Ljs;

.field public final f:Lkc;

.field public final g:Llg;

.field public h:Lld;

.field public i:Z

.field public j:Llk;

.field private final l:Ljava/lang/Object;

.field private m:I

.field private n:Z

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljw;Ljo;Ljs;Lkc;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llh;->d:Ljw;

    iput-object p2, p0, Llh;->a:Ljo;

    iput-object p3, p0, Llh;->e:Ljs;

    iput-object p4, p0, Llh;->f:Lkc;

    new-instance p1, Llg;

    invoke-direct {p0}, Llh;->e()Lle;

    move-result-object v0

    invoke-direct {p1, p2, v0, p3, p4}, Llg;-><init>(Ljo;Lle;Ljs;Lkc;)V

    iput-object p1, p0, Llh;->g:Llg;

    iput-object p5, p0, Llh;->l:Ljava/lang/Object;

    return-void
.end method

.method private a(IIIIZ)Lld;
    .locals 17

    move-object/from16 v1, p0

    iget-object v2, v1, Llh;->d:Ljw;

    monitor-enter v2

    :try_start_0
    iget-boolean v3, v1, Llh;->o:Z

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "released"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_0
    iget-object v3, v1, Llh;->j:Llk;

    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "codec != null"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    iget-boolean v3, v1, Llh;->i:Z

    if-eqz v3, :cond_2

    new-instance v3, Ljava/io/IOException;

    const-string v4, "Canceled"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_2
    iget-object v3, v1, Llh;->h:Lld;

    sget-boolean v4, Llh;->k:Z

    if-nez v4, :cond_3

    iget-object v4, v1, Llh;->d:Ljw;

    invoke-static {v4}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3

    :cond_3
    iget-object v4, v1, Llh;->h:Lld;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v4, :cond_4

    iget-boolean v4, v4, Lld;->h:Z

    if-eqz v4, :cond_4

    invoke-virtual {v1, v7, v7, v5}, Llh;->a(ZZZ)Ljava/net/Socket;

    move-result-object v4

    goto :goto_0

    :cond_4
    move-object v4, v6

    :goto_0
    iget-object v8, v1, Llh;->h:Lld;

    if-eqz v8, :cond_5

    iget-object v3, v1, Llh;->h:Lld;

    move-object v8, v6

    goto :goto_1

    :cond_5
    move-object v8, v3

    move-object v3, v6

    :goto_1
    iget-boolean v9, v1, Llh;->n:Z

    if-nez v9, :cond_6

    move-object v8, v6

    :cond_6
    if-nez v3, :cond_8

    sget-object v9, Lkt;->a:Lkt;

    iget-object v10, v1, Llh;->d:Ljw;

    iget-object v11, v1, Llh;->a:Ljo;

    invoke-virtual {v9, v10, v11, v1, v6}, Lkt;->a(Ljw;Ljo;Llh;Lkp;)Lld;

    iget-object v9, v1, Llh;->h:Lld;

    if-eqz v9, :cond_7

    iget-object v3, v1, Llh;->h:Lld;

    move-object v9, v3

    move v3, v5

    move-object v10, v6

    goto :goto_3

    :cond_7
    iget-object v9, v1, Llh;->c:Lkp;

    move-object v10, v9

    move-object v9, v3

    goto :goto_2

    :cond_8
    move-object v9, v3

    move-object v10, v6

    :goto_2
    move v3, v7

    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    invoke-static {v4}, Lkv;->a(Ljava/net/Socket;)V

    if-eqz v8, :cond_9

    invoke-static {}, Lkc;->j()V

    :cond_9
    if-eqz v3, :cond_a

    invoke-static {}, Lkc;->i()V

    :cond_a
    if-eqz v9, :cond_b

    return-object v9

    :cond_b
    if-nez v10, :cond_d

    iget-object v2, v1, Llh;->b:Llg$a;

    if-eqz v2, :cond_c

    iget-object v2, v1, Llh;->b:Llg$a;

    invoke-virtual {v2}, Llg$a;->a()Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    iget-object v2, v1, Llh;->g:Llg;

    invoke-virtual {v2}, Llg;->b()Llg$a;

    move-result-object v2

    iput-object v2, v1, Llh;->b:Llg$a;

    move v2, v5

    goto :goto_4

    :cond_d
    move v2, v7

    :goto_4
    iget-object v4, v1, Llh;->d:Ljw;

    monitor-enter v4

    :try_start_1
    iget-boolean v8, v1, Llh;->i:Z

    if-eqz v8, :cond_e

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_e
    if-eqz v2, :cond_10

    iget-object v2, v1, Llh;->b:Llg$a;

    new-instance v8, Ljava/util/ArrayList;

    iget-object v2, v2, Llg$a;->a:Ljava/util/List;

    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    move v11, v7

    :goto_5
    if-ge v11, v2, :cond_10

    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lkp;

    sget-object v13, Lkt;->a:Lkt;

    iget-object v14, v1, Llh;->d:Ljw;

    iget-object v15, v1, Llh;->a:Ljo;

    invoke-virtual {v13, v14, v15, v1, v12}, Lkt;->a(Ljw;Ljo;Llh;Lkp;)Lld;

    iget-object v13, v1, Llh;->h:Lld;

    if-eqz v13, :cond_f

    iget-object v9, v1, Llh;->h:Lld;

    iput-object v12, v1, Llh;->c:Lkp;

    move v3, v5

    goto :goto_6

    :cond_f
    add-int/lit8 v11, v11, 0x1

    goto :goto_5

    :cond_10
    :goto_6
    if-nez v3, :cond_13

    if-nez v10, :cond_12

    iget-object v2, v1, Llh;->b:Llg$a;

    invoke-virtual {v2}, Llg$a;->a()Z

    move-result v8

    if-nez v8, :cond_11

    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2}, Ljava/util/NoSuchElementException;-><init>()V

    throw v2

    :cond_11
    iget-object v8, v2, Llg$a;->a:Ljava/util/List;

    iget v9, v2, Llg$a;->b:I

    add-int/lit8 v10, v9, 0x1

    iput v10, v2, Llg$a;->b:I

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lkp;

    :cond_12
    iput-object v10, v1, Llh;->c:Lkp;

    iput v7, v1, Llh;->m:I

    new-instance v9, Lld;

    iget-object v2, v1, Llh;->d:Ljw;

    invoke-direct {v9, v2, v10}, Lld;-><init>(Ljw;Lkp;)V

    invoke-virtual {v1, v9, v7}, Llh;->a(Lld;Z)V

    :cond_13
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_14

    invoke-static {}, Lkc;->i()V

    return-object v9

    :cond_14
    move-object v11, v9

    move/from16 v12, p1

    move/from16 v13, p2

    move/from16 v14, p3

    move/from16 v15, p4

    move/from16 v16, p5

    invoke-virtual/range {v11 .. v16}, Lld;->a(IIIIZ)V

    invoke-direct/range {p0 .. p0}, Llh;->e()Lle;

    move-result-object v2

    iget-object v3, v9, Lld;->a:Lkp;

    invoke-virtual {v2, v3}, Lle;->b(Lkp;)V

    iget-object v2, v1, Llh;->d:Ljw;

    monitor-enter v2

    :try_start_2
    iput-boolean v5, v1, Llh;->n:Z

    sget-object v3, Lkt;->a:Lkt;

    iget-object v4, v1, Llh;->d:Ljw;

    invoke-virtual {v3, v4, v9}, Lkt;->b(Ljw;Lld;)V

    invoke-virtual {v9}, Lld;->a()Z

    move-result v3

    if-eqz v3, :cond_15

    sget-object v3, Lkt;->a:Lkt;

    iget-object v4, v1, Llh;->d:Ljw;

    iget-object v5, v1, Llh;->a:Ljo;

    invoke-virtual {v3, v4, v5, v1}, Lkt;->a(Ljw;Ljo;Llh;)Ljava/net/Socket;

    move-result-object v6

    iget-object v9, v1, Llh;->h:Lld;

    :cond_15
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v6}, Lkv;->a(Ljava/net/Socket;)V

    invoke-static {}, Lkc;->i()V

    return-object v9

    :catchall_0
    move-exception v0

    move-object v3, v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v3

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v2

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v3
.end method

.method private a(IIIIZZ)Lld;
    .locals 3

    :goto_0
    invoke-direct/range {p0 .. p5}, Llh;->a(IIIIZ)Lld;

    move-result-object v0

    iget-object v1, p0, Llh;->d:Ljw;

    monitor-enter v1

    :try_start_0
    iget v2, v0, Lld;->i:I

    if-nez v2, :cond_0

    monitor-exit v1

    return-object v0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, p6}, Lld;->a(Z)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Llh;->d()V

    goto :goto_0

    :cond_1
    return-object v0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private a(Lld;)V
    .locals 3

    iget-object v0, p1, Lld;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p1, Lld;->k:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/Reference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p0, :cond_0

    iget-object p1, p1, Lld;->k:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method private e()Lle;
    .locals 2

    sget-object v0, Lkt;->a:Lkt;

    iget-object v1, p0, Llh;->d:Ljw;

    invoke-virtual {v0, v1}, Lkt;->a(Ljw;)Lle;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(ZZZ)Ljava/net/Socket;
    .locals 1

    sget-boolean v0, Llh;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Llh;->d:Ljw;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iput-object v0, p0, Llh;->j:Llk;

    :cond_1
    const/4 p3, 0x1

    if-eqz p2, :cond_2

    iput-boolean p3, p0, Llh;->o:Z

    :cond_2
    iget-object p2, p0, Llh;->h:Lld;

    if-eqz p2, :cond_6

    if-eqz p1, :cond_3

    iget-object p1, p0, Llh;->h:Lld;

    iput-boolean p3, p1, Lld;->h:Z

    :cond_3
    iget-object p1, p0, Llh;->j:Llk;

    if-nez p1, :cond_6

    iget-boolean p1, p0, Llh;->o:Z

    if-nez p1, :cond_4

    iget-object p1, p0, Llh;->h:Lld;

    iget-boolean p1, p1, Lld;->h:Z

    if-eqz p1, :cond_6

    :cond_4
    iget-object p1, p0, Llh;->h:Lld;

    invoke-direct {p0, p1}, Llh;->a(Lld;)V

    iget-object p1, p0, Llh;->h:Lld;

    iget-object p1, p1, Lld;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Llh;->h:Lld;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p2

    iput-wide p2, p1, Lld;->l:J

    sget-object p1, Lkt;->a:Lkt;

    iget-object p2, p0, Llh;->d:Ljw;

    iget-object p3, p0, Llh;->h:Lld;

    invoke-virtual {p1, p2, p3}, Lkt;->a(Ljw;Lld;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Llh;->h:Lld;

    iget-object p1, p1, Lld;->c:Ljava/net/Socket;

    goto :goto_0

    :cond_5
    move-object p1, v0

    :goto_0
    iput-object v0, p0, Llh;->h:Lld;

    return-object p1

    :cond_6
    move-object p1, v0

    return-object p1
.end method

.method public final a()Llk;
    .locals 2

    iget-object v0, p0, Llh;->d:Ljw;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Llh;->j:Llk;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a(Lki;Lkg$a;Z)Llk;
    .locals 7

    invoke-interface {p2}, Lkg$a;->b()I

    move-result v1

    invoke-interface {p2}, Lkg$a;->c()I

    move-result v2

    invoke-interface {p2}, Lkg$a;->d()I

    move-result v3

    iget v4, p1, Lki;->C:I

    iget-boolean v5, p1, Lki;->y:Z

    move-object v0, p0

    move v6, p3

    :try_start_0
    invoke-direct/range {v0 .. v6}, Llh;->a(IIIIZZ)Lld;

    move-result-object p3

    iget-object v0, p3, Lld;->e:Lmb;

    if-eqz v0, :cond_0

    new-instance v0, Lma;

    iget-object p3, p3, Lld;->e:Lmb;

    invoke-direct {v0, p1, p2, p0, p3}, Lma;-><init>(Lki;Lkg$a;Llh;Lmb;)V

    goto :goto_0

    :cond_0
    iget-object v0, p3, Lld;->c:Ljava/net/Socket;

    invoke-interface {p2}, Lkg$a;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v0, p3, Lld;->f:Lne;

    invoke-interface {v0}, Lne;->a()Lnt;

    move-result-object v0

    invoke-interface {p2}, Lkg$a;->c()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lnt;->a(JLjava/util/concurrent/TimeUnit;)Lnt;

    iget-object v0, p3, Lld;->g:Lnd;

    invoke-interface {v0}, Lnd;->a()Lnt;

    move-result-object v0

    invoke-interface {p2}, Lkg$a;->d()I

    move-result p2

    int-to-long v1, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p2}, Lnt;->a(JLjava/util/concurrent/TimeUnit;)Lnt;

    new-instance v0, Llu;

    iget-object p2, p3, Lld;->f:Lne;

    iget-object p3, p3, Lld;->g:Lnd;

    invoke-direct {v0, p1, p0, p2, p3}, Llu;-><init>(Lki;Llh;Lne;Lnd;)V

    :goto_0
    iget-object p1, p0, Llh;->d:Ljw;

    monitor-enter p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iput-object v0, p0, Llh;->j:Llk;

    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    new-instance p2, Llf;

    invoke-direct {p2, p1}, Llf;-><init>(Ljava/io/IOException;)V

    throw p2
.end method

.method public final a(Ljava/io/IOException;)V
    .locals 9

    iget-object v0, p0, Llh;->d:Ljw;

    monitor-enter v0

    :try_start_0
    instance-of v1, p1, Lmi;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    check-cast p1, Lmi;

    iget-object v1, p1, Lmi;->a:Llw;

    sget-object v5, Llw;->e:Llw;

    if-ne v1, v5, :cond_0

    iget v1, p0, Llh;->m:I

    add-int/2addr v1, v4

    iput v1, p0, Llh;->m:I

    :cond_0
    iget-object p1, p1, Lmi;->a:Llw;

    sget-object v1, Llw;->e:Llw;

    if-ne p1, v1, :cond_4

    iget p1, p0, Llh;->m:I

    if-le p1, v4, :cond_6

    goto :goto_0

    :cond_1
    iget-object v1, p0, Llh;->h:Lld;

    if-eqz v1, :cond_6

    iget-object v1, p0, Llh;->h:Lld;

    invoke-virtual {v1}, Lld;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Llv;

    if-eqz v1, :cond_6

    :cond_2
    iget-object v1, p0, Llh;->h:Lld;

    iget v1, v1, Lld;->i:I

    if-nez v1, :cond_5

    iget-object v1, p0, Llh;->c:Lkp;

    if-eqz v1, :cond_4

    if-eqz p1, :cond_4

    iget-object v1, p0, Llh;->g:Llg;

    iget-object v5, p0, Llh;->c:Lkp;

    iget-object v6, v5, Lkp;->b:Ljava/net/Proxy;

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v6

    sget-object v7, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v6, v7, :cond_3

    iget-object v6, v1, Llg;->a:Ljo;

    iget-object v6, v6, Ljo;->g:Ljava/net/ProxySelector;

    if-eqz v6, :cond_3

    iget-object v6, v1, Llg;->a:Ljo;

    iget-object v6, v6, Ljo;->g:Ljava/net/ProxySelector;

    iget-object v7, v1, Llg;->a:Ljo;

    iget-object v7, v7, Ljo;->a:Lkf;

    invoke-virtual {v7}, Lkf;->a()Ljava/net/URI;

    move-result-object v7

    iget-object v8, v5, Lkp;->b:Ljava/net/Proxy;

    invoke-virtual {v8}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v8

    invoke-virtual {v6, v7, v8, p1}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_3
    iget-object p1, v1, Llg;->b:Lle;

    invoke-virtual {p1, v5}, Lle;->a(Lkp;)V

    :cond_4
    :goto_0
    iput-object v3, p0, Llh;->c:Lkp;

    :cond_5
    move p1, v4

    goto :goto_1

    :cond_6
    move p1, v2

    :goto_1
    iget-object v1, p0, Llh;->h:Lld;

    invoke-virtual {p0, p1, v2, v4}, Llh;->a(ZZZ)Ljava/net/Socket;

    move-result-object p1

    iget-object v2, p0, Llh;->h:Lld;

    if-nez v2, :cond_7

    iget-boolean v2, p0, Llh;->n:Z

    if-nez v2, :cond_8

    :cond_7
    move-object v1, v3

    :cond_8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1}, Lkv;->a(Ljava/net/Socket;)V

    if-eqz v1, :cond_9

    invoke-static {}, Lkc;->j()V

    :cond_9
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Lld;Z)V
    .locals 1

    sget-boolean v0, Llh;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Llh;->d:Ljw;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_0
    iget-object v0, p0, Llh;->h:Lld;

    if-eqz v0, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iput-object p1, p0, Llh;->h:Lld;

    iput-boolean p2, p0, Llh;->n:Z

    iget-object p1, p1, Lld;->k:Ljava/util/List;

    new-instance p2, Llh$a;

    iget-object v0, p0, Llh;->l:Ljava/lang/Object;

    invoke-direct {p2, p0, v0}, Llh$a;-><init>(Llh;Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(ZLlk;Ljava/io/IOException;)V
    .locals 3

    invoke-static {}, Lkc;->r()V

    iget-object v0, p0, Llh;->d:Ljw;

    monitor-enter v0

    if-eqz p2, :cond_6

    :try_start_0
    iget-object v1, p0, Llh;->j:Llk;

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    if-nez p1, :cond_1

    iget-object v1, p0, Llh;->h:Lld;

    iget v2, v1, Lld;->i:I

    add-int/2addr v2, p2

    iput v2, v1, Lld;->i:I

    :cond_1
    iget-object v1, p0, Llh;->h:Lld;

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, p2}, Llh;->a(ZZZ)Ljava/net/Socket;

    move-result-object p1

    iget-object p2, p0, Llh;->h:Lld;

    if-eqz p2, :cond_2

    const/4 v1, 0x0

    :cond_2
    iget-boolean p2, p0, Llh;->o:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1}, Lkv;->a(Ljava/net/Socket;)V

    if-eqz v1, :cond_3

    invoke-static {}, Lkc;->j()V

    :cond_3
    if-eqz p3, :cond_4

    invoke-static {}, Lkc;->t()V

    return-void

    :cond_4
    if-eqz p2, :cond_5

    invoke-static {}, Lkc;->s()V

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_6
    :goto_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "expected "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llh;->j:Llk;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized b()Lld;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Llh;->h:Lld;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Llh;->d:Ljw;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Llh;->h:Lld;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Llh;->a(ZZZ)Ljava/net/Socket;

    move-result-object v2

    iget-object v3, p0, Llh;->h:Lld;

    if-eqz v3, :cond_0

    const/4 v1, 0x0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2}, Lkv;->a(Ljava/net/Socket;)V

    if-eqz v1, :cond_1

    invoke-static {}, Lkc;->j()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Llh;->d:Ljw;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Llh;->h:Lld;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, v3}, Llh;->a(ZZZ)Ljava/net/Socket;

    move-result-object v2

    iget-object v3, p0, Llh;->h:Lld;

    if-eqz v3, :cond_0

    const/4 v1, 0x0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2}, Lkv;->a(Ljava/net/Socket;)V

    if-eqz v1, :cond_1

    invoke-static {}, Lkc;->j()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Llh;->b()Lld;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lld;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Llh;->a:Ljo;

    invoke-virtual {v0}, Ljo;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
