.class public final Lmw$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkl;

.field final synthetic b:Lmw;


# direct methods
.method public constructor <init>(Lmw;Lkl;)V
    .locals 0

    iput-object p1, p0, Lmw$2;->b:Lmw;

    iput-object p2, p0, Lmw$2;->a:Lkl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/IOException;)V
    .locals 2

    iget-object v0, p0, Lmw$2;->b:Lmw;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lmw;->a(Ljava/lang/Exception;Lkn;)V

    return-void
.end method

.method public final a(Ljs;Lkn;)V
    .locals 12

    :try_start_0
    iget-object v0, p0, Lmw$2;->b:Lmw;

    iget v1, p2, Lkn;->c:I

    const/16 v2, 0x65

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected HTTP 101 response but was \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p2, Lkn;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p2, Lkn;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const-string v1, "Connection"

    invoke-virtual {p2, v1}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Upgrade"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Expected \'Connection\' header value \'Upgrade\' but was \'"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string v1, "Upgrade"

    invoke-virtual {p2, v1}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "websocket"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Expected \'Upgrade\' header value \'websocket\' but was \'"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const-string v1, "Sec-WebSocket-Accept"

    invoke-virtual {p2, v1}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, v0, Lmw;->f:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    invoke-virtual {v0}, Lnf;->c()Lnf;

    move-result-object v0

    invoke-virtual {v0}, Lnf;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance p1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected \'Sec-WebSocket-Accept\' header value \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' but was \'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_3
    sget-object v0, Lkt;->a:Lkt;

    invoke-virtual {v0, p1}, Lkt;->a(Ljs;)Llh;

    move-result-object p1

    invoke-virtual {p1}, Llh;->d()V

    invoke-virtual {p1}, Llh;->b()Lld;

    move-result-object v0

    new-instance v1, Lld$1;

    iget-object v2, v0, Lld;->f:Lne;

    iget-object v3, v0, Lld;->g:Lnd;

    invoke-direct {v1, v0, v2, v3, p1}, Lld$1;-><init>(Lld;Lne;Lnd;Llh;)V

    :try_start_1
    iget-object v0, p0, Lmw$2;->b:Lmw;

    iget-object v0, v0, Lmw;->c:Lks;

    iget-object v2, p0, Lmw$2;->b:Lmw;

    invoke-virtual {v0, v2, p2}, Lks;->a(Lkr;Lkn;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "OkHttp WebSocket "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lmw$2;->a:Lkl;

    iget-object v0, v0, Lkl;->a:Lkf;

    invoke-virtual {v0}, Lkf;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lmw$2;->b:Lmw;

    monitor-enter v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iput-object v1, v0, Lmw;->k:Lmw$e;

    new-instance v2, Lmz;

    iget-boolean v3, v1, Lmw$e;->c:Z

    iget-object v4, v1, Lmw$e;->e:Lnd;

    iget-object v5, v0, Lmw;->d:Ljava/util/Random;

    invoke-direct {v2, v3, v4, v5}, Lmz;-><init>(ZLnd;Ljava/util/Random;)V

    iput-object v2, v0, Lmw;->i:Lmz;

    new-instance v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {p2, v4}, Lkv;->a(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object p2

    invoke-direct {v2, v3, p2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v2, v0, Lmw;->j:Ljava/util/concurrent/ScheduledExecutorService;

    iget-wide v2, v0, Lmw;->e:J

    const-wide/16 v5, 0x0

    cmp-long p2, v2, v5

    if-eqz p2, :cond_4

    iget-object v5, v0, Lmw;->j:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v6, Lmw$d;

    invoke-direct {v6, v0}, Lmw$d;-><init>(Lmw;)V

    iget-wide v7, v0, Lmw;->e:J

    iget-wide v9, v0, Lmw;->e:J

    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v5 .. v11}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_4
    iget-object p2, v0, Lmw;->l:Ljava/util/ArrayDeque;

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-virtual {v0}, Lmw;->c()V

    :cond_5
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance p2, Lmy;

    iget-boolean v2, v1, Lmw$e;->c:Z

    iget-object v1, v1, Lmw$e;->d:Lne;

    invoke-direct {p2, v2, v1, v0}, Lmy;-><init>(ZLne;Lmy$a;)V

    iput-object p2, v0, Lmw;->h:Lmy;

    invoke-virtual {p1}, Llh;->b()Lld;

    move-result-object p1

    iget-object p1, p1, Lld;->c:Ljava/net/Socket;

    invoke-virtual {p1, v4}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object p1, p0, Lmw$2;->b:Lmw;

    invoke-virtual {p1}, Lmw;->a()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lmw$2;->b:Lmw;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lmw;->a(Ljava/lang/Exception;Lkn;)V

    return-void

    :catch_1
    move-exception p1

    iget-object v0, p0, Lmw$2;->b:Lmw;

    invoke-virtual {v0, p1, p2}, Lmw;->a(Ljava/lang/Exception;Lkn;)V

    invoke-static {p2}, Lkv;->a(Ljava/io/Closeable;)V

    return-void
.end method
