.class public final Ljw;
.super Ljava/lang/Object;


# static fields
.field static final a:Ljava/util/concurrent/Executor;

.field static final synthetic g:Z = true


# instance fields
.field final b:I

.field final c:Ljava/lang/Runnable;

.field final d:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lld;",
            ">;"
        }
    .end annotation
.end field

.field final e:Lle;

.field f:Z

.field private final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-wide/16 v3, 0x3c

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const-string v0, "OkHttp ConnectionPool"

    const/4 v7, 0x1

    invoke-static {v0, v7}, Lkv;->a(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v8, Ljw;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-direct {p0, v0}, Ljw;-><init>(Ljava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/TimeUnit;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljw$1;

    invoke-direct {v0, p0}, Ljw$1;-><init>(Ljw;)V

    iput-object v0, p0, Ljw;->c:Ljava/lang/Runnable;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ljw;->d:Ljava/util/Deque;

    new-instance v0, Lle;

    invoke-direct {v0}, Lle;-><init>()V

    iput-object v0, p0, Ljw;->e:Lle;

    const/4 v0, 0x5

    iput v0, p0, Ljw;->b:I

    const-wide/16 v0, 0x5

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Ljw;->h:J

    return-void
.end method


# virtual methods
.method final a(J)J
    .locals 13

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljw;->d:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/high16 v3, -0x8000000000000000L

    move v6, v1

    move-object v5, v2

    move v2, v6

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lld;

    iget-object v8, v7, Lld;->k:Ljava/util/List;

    move v9, v1

    :cond_1
    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v10

    if-ge v9, v10, :cond_3

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/ref/Reference;

    invoke-virtual {v10}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_2

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    check-cast v10, Llh$a;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "A connection to "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v12, v7, Lld;->a:Lkp;

    iget-object v12, v12, Lkp;->a:Ljo;

    iget-object v12, v12, Ljo;->a:Lkf;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, " was leaked. Did you forget to close a response body?"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lmp;->c()Lmp;

    move-result-object v12

    iget-object v10, v10, Llh$a;->a:Ljava/lang/Object;

    invoke-virtual {v12, v11, v10}, Lmp;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v8, v9}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v10, 0x1

    iput-boolean v10, v7, Lld;->h:Z

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    iget-wide v8, p0, Ljw;->h:J

    sub-long v8, p1, v8

    iput-wide v8, v7, Lld;->l:J

    move v8, v1

    goto :goto_2

    :cond_3
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    :goto_2
    if-lez v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    iget-wide v8, v7, Lld;->l:J

    sub-long v8, p1, v8

    cmp-long v10, v8, v3

    if-lez v10, :cond_0

    move-object v5, v7

    move-wide v3, v8

    goto :goto_0

    :cond_5
    iget-wide p1, p0, Ljw;->h:J

    cmp-long p1, v3, p1

    if-gez p1, :cond_9

    iget p1, p0, Ljw;->b:I

    if-le v2, p1, :cond_6

    goto :goto_3

    :cond_6
    if-lez v2, :cond_7

    iget-wide p1, p0, Ljw;->h:J

    sub-long/2addr p1, v3

    monitor-exit p0

    return-wide p1

    :cond_7
    if-lez v6, :cond_8

    iget-wide p1, p0, Ljw;->h:J

    monitor-exit p0

    return-wide p1

    :cond_8
    iput-boolean v1, p0, Ljw;->f:Z

    const-wide/16 p1, -0x1

    monitor-exit p0

    return-wide p1

    :cond_9
    :goto_3
    iget-object p1, p0, Ljw;->d:Ljava/util/Deque;

    invoke-interface {p1, v5}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, v5, Lld;->c:Ljava/net/Socket;

    invoke-static {p1}, Lkv;->a(Ljava/net/Socket;)V

    const-wide/16 p1, 0x0

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
