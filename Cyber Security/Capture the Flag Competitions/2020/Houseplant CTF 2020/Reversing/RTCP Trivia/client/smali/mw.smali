.class public final Lmw;
.super Ljava/lang/Object;

# interfaces
.implements Lkr;
.implements Lmy$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmw$a;,
        Lmw$e;,
        Lmw$b;,
        Lmw$c;,
        Lmw$d;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkj;",
            ">;"
        }
    .end annotation
.end field

.field static final synthetic p:Z = true


# instance fields
.field public final b:Lkl;

.field final c:Lks;

.field final d:Ljava/util/Random;

.field final e:J

.field public final f:Ljava/lang/String;

.field public g:Ljs;

.field h:Lmy;

.field i:Lmz;

.field j:Ljava/util/concurrent/ScheduledExecutorService;

.field k:Lmw$e;

.field final l:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field m:Z

.field n:I

.field o:Z

.field private final q:Ljava/lang/Runnable;

.field private final r:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lnf;",
            ">;"
        }
    .end annotation
.end field

.field private s:J

.field private t:Z

.field private u:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private v:I

.field private w:Ljava/lang/String;

.field private x:I

.field private y:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkj;->b:Lkj;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lmw;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lkl;Lks;Ljava/util/Random;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lmw;->r:Ljava/util/ArrayDeque;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lmw;->l:Ljava/util/ArrayDeque;

    const/4 v0, -0x1

    iput v0, p0, Lmw;->v:I

    const-string v0, "GET"

    iget-object v1, p1, Lkl;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Request must be GET: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lkl;->b:Ljava/lang/String;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    iput-object p1, p0, Lmw;->b:Lkl;

    iput-object p2, p0, Lmw;->c:Lks;

    iput-object p3, p0, Lmw;->d:Ljava/util/Random;

    iput-wide p4, p0, Lmw;->e:J

    const/16 p1, 0x10

    new-array p1, p1, [B

    invoke-virtual {p3, p1}, Ljava/util/Random;->nextBytes([B)V

    invoke-static {p1}, Lnf;->a([B)Lnf;

    move-result-object p1

    invoke-virtual {p1}, Lnf;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lmw;->f:Ljava/lang/String;

    new-instance p1, Lmw$1;

    invoke-direct {p1, p0}, Lmw$1;-><init>(Lmw;)V

    iput-object p1, p0, Lmw;->q:Ljava/lang/Runnable;

    return-void
.end method

.method private declared-synchronized b(Lnf;)Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lmw;->m:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lmw;->t:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lmw;->s:J

    invoke-virtual {p1}, Lnf;->g()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    const-wide/32 v4, 0x1000000

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lmw;->d(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :cond_1
    :try_start_1
    iget-wide v0, p0, Lmw;->s:J

    invoke-virtual {p1}, Lnf;->g()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lmw;->s:J

    iget-object v0, p0, Lmw;->l:Ljava/util/ArrayDeque;

    new-instance v1, Lmw$c;

    invoke-direct {v1, p1}, Lmw$c;-><init>(Lnf;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lmw;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p1, 0x1

    monitor-exit p0

    return p1

    :cond_2
    :goto_0
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized d(Ljava/lang/String;)Z
    .locals 5

    monitor-enter p0

    const/16 v0, 0x3e9

    :try_start_0
    invoke-static {v0}, Lmx;->b(I)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    invoke-virtual {v0}, Lnf;->g()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x7b

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "reason.size() > 123: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean p1, p0, Lmw;->m:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lmw;->t:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lmw;->t:Z

    iget-object v1, p0, Lmw;->l:Ljava/util/ArrayDeque;

    new-instance v2, Lmw$b;

    invoke-direct {v2, v0}, Lmw$b;-><init>(Lnf;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lmw;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 4

    :goto_0
    iget v0, p0, Lmw;->v:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lmw;->h:Lmy;

    invoke-virtual {v0}, Lmy;->a()V

    iget-boolean v1, v0, Lmy;->h:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lmy;->b()V

    goto :goto_0

    :cond_0
    iget v1, v0, Lmy;->e:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown opcode: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v0}, Lmy;->c()V

    if-ne v1, v2, :cond_2

    iget-object v1, v0, Lmy;->c:Lmy$a;

    iget-object v0, v0, Lmy;->i:Lnc;

    invoke-virtual {v0}, Lnc;->n()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lmy$a;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, v0, Lmy;->i:Lnc;

    invoke-virtual {v0}, Lnc;->m()Lnf;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 3

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_0
    monitor-enter p0

    :try_start_0
    iget v1, p0, Lmw;->v:I

    if-eq v1, v0, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "already closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput p1, p0, Lmw;->v:I

    iput-object p2, p0, Lmw;->w:Ljava/lang/String;

    iget-boolean v0, p0, Lmw;->t:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lmw;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lmw;->k:Lmw$e;

    iput-object v1, p0, Lmw;->k:Lmw$e;

    iget-object v1, p0, Lmw;->u:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lmw;->u:Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_2
    iget-object v1, p0, Lmw;->j:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lmw;->c:Lks;

    invoke-virtual {v1, p1, p2}, Lks;->a(ILjava/lang/String;)V

    if-eqz v0, :cond_4

    iget-object v1, p0, Lmw;->c:Lks;

    invoke-virtual {v1, p1, p2}, Lks;->b(ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    invoke-static {v0}, Lkv;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0}, Lkv;->a(Ljava/io/Closeable;)V

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final a(Ljava/lang/Exception;Lkn;)V
    .locals 3
    .param p2    # Lkn;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lmw;->m:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lmw;->m:Z

    iget-object v0, p0, Lmw;->k:Lmw$e;

    const/4 v1, 0x0

    iput-object v1, p0, Lmw;->k:Lmw$e;

    iget-object v1, p0, Lmw;->u:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lmw;->u:Ljava/util/concurrent/ScheduledFuture;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_1
    iget-object v1, p0, Lmw;->j:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lmw;->j:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lmw;->c:Lks;

    invoke-virtual {v1, p1, p2}, Lks;->a(Ljava/lang/Throwable;Lkn;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v0}, Lkv;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {v0}, Lkv;->a(Ljava/io/Closeable;)V

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final declared-synchronized a(Lnf;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lmw;->m:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lmw;->t:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lmw;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lmw;->r:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lmw;->c()V

    iget p1, p0, Lmw;->x:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lmw;->x:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "text == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object p1

    invoke-direct {p0, p1}, Lmw;->b(Lnf;)Z

    move-result p1

    return p1
.end method

.method public final declared-synchronized b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lmw;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lmw;->y:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lmw;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lmw;->d(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method final c()V
    .locals 2

    sget-boolean v0, Lmw;->p:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lmw;->j:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmw;->j:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lmw;->q:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lmw;->c:Lks;

    invoke-virtual {v0, p0, p1}, Lks;->a(Lkr;Ljava/lang/String;)V

    return-void
.end method

.method final d()Z
    .locals 12

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lmw;->m:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    iget-object v0, p0, Lmw;->i:Lmz;

    iget-object v2, p0, Lmw;->r:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnf;

    const/4 v3, 0x0

    if-nez v2, :cond_4

    iget-object v4, p0, Lmw;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lmw$b;

    if-eqz v5, :cond_2

    iget v5, p0, Lmw;->v:I

    iget-object v6, p0, Lmw;->w:Ljava/lang/String;

    const/4 v7, -0x1

    if-eq v5, v7, :cond_1

    iget-object v7, p0, Lmw;->k:Lmw$e;

    iput-object v3, p0, Lmw;->k:Lmw$e;

    iget-object v3, p0, Lmw;->j:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v3}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    :goto_0
    move-object v3, v6

    goto :goto_1

    :cond_1
    iget-object v7, p0, Lmw;->j:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v8, Lmw$a;

    invoke-direct {v8, p0}, Lmw$a;-><init>(Lmw;)V

    move-object v9, v4

    check-cast v9, Lmw$b;

    iget-wide v9, v9, Lmw$b;->c:J

    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v7, v8, v9, v10, v11}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v7

    iput-object v7, p0, Lmw;->u:Ljava/util/concurrent/ScheduledFuture;

    move-object v7, v3

    goto :goto_0

    :cond_2
    if-nez v4, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    move v5, v1

    move-object v7, v3

    goto :goto_1

    :cond_4
    move v5, v1

    move-object v4, v3

    move-object v7, v4

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v6, 0x1

    if-eqz v2, :cond_5

    const/16 v1, 0xa

    :try_start_1
    invoke-virtual {v0, v1, v2}, Lmz;->a(ILnf;)V

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_5
    instance-of v2, v4, Lmw$c;

    if-eqz v2, :cond_7

    move-object v2, v4

    check-cast v2, Lmw$c;

    iget-object v2, v2, Lmw$c;->b:Lnf;

    check-cast v4, Lmw$c;

    iget v3, v4, Lmw$c;->a:I

    invoke-virtual {v2}, Lnf;->g()I

    move-result v4

    int-to-long v4, v4

    iget-boolean v8, v0, Lmz;->h:Z

    if-eqz v8, :cond_6

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Another message writer is active. Did you call close()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    iput-boolean v6, v0, Lmz;->h:Z

    iget-object v8, v0, Lmz;->g:Lmz$a;

    iput v3, v8, Lmz$a;->a:I

    iget-object v3, v0, Lmz;->g:Lmz$a;

    iput-wide v4, v3, Lmz$a;->b:J

    iget-object v3, v0, Lmz;->g:Lmz$a;

    iput-boolean v6, v3, Lmz$a;->c:Z

    iget-object v3, v0, Lmz;->g:Lmz$a;

    iput-boolean v1, v3, Lmz$a;->d:Z

    iget-object v0, v0, Lmz;->g:Lmz$a;

    invoke-static {v0}, Lnl;->a(Lnr;)Lnd;

    move-result-object v0

    invoke-interface {v0, v2}, Lnd;->b(Lnf;)Lnd;

    invoke-interface {v0}, Lnd;->close()V

    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-wide v0, p0, Lmw;->s:J

    invoke-virtual {v2}, Lnf;->g()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lmw;->s:J

    monitor-exit p0

    goto :goto_2

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    throw v0

    :cond_7
    instance-of v1, v4, Lmw$b;

    if-eqz v1, :cond_d

    check-cast v4, Lmw$b;

    iget v1, v4, Lmw$b;->a:I

    iget-object v2, v4, Lmw$b;->b:Lnf;

    sget-object v4, Lnf;->b:Lnf;

    if-nez v1, :cond_8

    if-eqz v2, :cond_b

    :cond_8
    if-eqz v1, :cond_9

    invoke-static {v1}, Lmx;->b(I)V

    :cond_9
    new-instance v4, Lnc;

    invoke-direct {v4}, Lnc;-><init>()V

    invoke-virtual {v4, v1}, Lnc;->c(I)Lnc;

    if-eqz v2, :cond_a

    invoke-virtual {v4, v2}, Lnc;->a(Lnf;)Lnc;

    :cond_a
    invoke-virtual {v4}, Lnc;->m()Lnf;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_b
    const/16 v1, 0x8

    :try_start_4
    invoke-virtual {v0, v1, v4}, Lmz;->a(ILnf;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    iput-boolean v6, v0, Lmz;->e:Z

    if-eqz v7, :cond_c

    iget-object v0, p0, Lmw;->c:Lks;

    invoke-virtual {v0, v5, v3}, Lks;->b(ILjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_c
    :goto_2
    invoke-static {v7}, Lkv;->a(Ljava/io/Closeable;)V

    return v6

    :catchall_2
    move-exception v1

    :try_start_6
    iput-boolean v6, v0, Lmz;->e:Z

    throw v1

    :cond_d
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_3
    invoke-static {v7}, Lkv;->a(Ljava/io/Closeable;)V

    throw v0

    :catchall_3
    move-exception v0

    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0
.end method
