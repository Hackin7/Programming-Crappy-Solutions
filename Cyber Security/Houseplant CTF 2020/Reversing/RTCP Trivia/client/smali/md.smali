.class public final Lmd;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmd$c;,
        Lmd$a;,
        Lmd$b;
    }
.end annotation


# static fields
.field static final synthetic l:Z = true


# instance fields
.field a:J

.field b:J

.field final c:I

.field final d:Lmb;

.field e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llx;",
            ">;"
        }
    .end annotation
.end field

.field f:Z

.field final g:Lmd$b;

.field final h:Lmd$a;

.field final i:Lmd$c;

.field final j:Lmd$c;

.field k:Llw;

.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llx;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(ILmb;ZZLjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lmb;",
            "ZZ",
            "Ljava/util/List<",
            "Llx;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lmd;->a:J

    new-instance v0, Lmd$c;

    invoke-direct {v0, p0}, Lmd$c;-><init>(Lmd;)V

    iput-object v0, p0, Lmd;->i:Lmd$c;

    new-instance v0, Lmd$c;

    invoke-direct {v0, p0}, Lmd$c;-><init>(Lmd;)V

    iput-object v0, p0, Lmd;->j:Lmd$c;

    const/4 v0, 0x0

    iput-object v0, p0, Lmd;->k:Llw;

    if-nez p2, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "connection == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-nez p5, :cond_1

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "requestHeaders == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput p1, p0, Lmd;->c:I

    iput-object p2, p0, Lmd;->d:Lmb;

    iget-object p1, p2, Lmb;->n:Lmh;

    invoke-virtual {p1}, Lmh;->b()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lmd;->b:J

    new-instance p1, Lmd$b;

    iget-object p2, p2, Lmb;->m:Lmh;

    invoke-virtual {p2}, Lmh;->b()I

    move-result p2

    int-to-long v0, p2

    invoke-direct {p1, p0, v0, v1}, Lmd$b;-><init>(Lmd;J)V

    iput-object p1, p0, Lmd;->g:Lmd$b;

    new-instance p1, Lmd$a;

    invoke-direct {p1, p0}, Lmd$a;-><init>(Lmd;)V

    iput-object p1, p0, Lmd;->h:Lmd$a;

    iget-object p1, p0, Lmd;->g:Lmd$b;

    iput-boolean p4, p1, Lmd$b;->b:Z

    iget-object p1, p0, Lmd;->h:Lmd$a;

    iput-boolean p3, p1, Lmd$a;->b:Z

    iput-object p5, p0, Lmd;->m:Ljava/util/List;

    return-void
.end method

.method private d(Llw;)Z
    .locals 2

    sget-boolean v0, Lmd;->l:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lmd;->k:Llw;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    iget-object v0, p0, Lmd;->g:Lmd$b;

    iget-boolean v0, v0, Lmd$b;->b:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lmd;->h:Lmd$a;

    iget-boolean v0, v0, Lmd$a;->b:Z

    if-eqz v0, :cond_2

    monitor-exit p0

    return v1

    :cond_2
    iput-object p1, p0, Lmd;->k:Llw;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lmd;->d:Lmb;

    iget v0, p0, Lmd;->c:I

    invoke-virtual {p1, v0}, Lmb;->b(I)Lmd;

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method final a(J)V
    .locals 2

    iget-wide v0, p0, Lmd;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lmd;->b:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :cond_0
    return-void
.end method

.method public final a(Llw;)V
    .locals 2

    invoke-direct {p0, p1}, Lmd;->d(Llw;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lmd;->d:Lmb;

    iget v1, p0, Lmd;->c:I

    invoke-virtual {v0, v1, p1}, Lmb;->b(ILlw;)V

    return-void
.end method

.method public final declared-synchronized a()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lmd;->k:Llw;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lmd;->g:Lmd$b;

    iget-boolean v0, v0, Lmd$b;->b:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lmd;->g:Lmd$b;

    iget-boolean v0, v0, Lmd$b;->a:Z

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lmd;->h:Lmd$a;

    iget-boolean v0, v0, Lmd$a;->b:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lmd;->h:Lmd$a;

    iget-boolean v0, v0, Lmd$a;->a:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-boolean v0, p0, Lmd;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    const/4 v0, 0x1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b(Llw;)V
    .locals 2

    invoke-direct {p0, p1}, Lmd;->d(Llw;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lmd;->d:Lmb;

    iget v1, p0, Lmd;->c:I

    invoke-virtual {v0, v1, p1}, Lmb;->a(ILlw;)V

    return-void
.end method

.method public final b()Z
    .locals 4

    iget v0, p0, Lmd;->c:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Lmd;->d:Lmb;

    iget-boolean v3, v3, Lmb;->a:Z

    if-ne v3, v0, :cond_1

    return v1

    :cond_1
    return v2
.end method

.method public final declared-synchronized c()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llx;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lmd;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "servers cannot read response headers"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lmd;->i:Lmd$c;

    invoke-virtual {v0}, Lmd$c;->b_()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v0, p0, Lmd;->e:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v0, p0, Lmd;->k:Llw;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lmd;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_2
    iget-object v0, p0, Lmd;->i:Lmd$c;

    invoke-virtual {v0}, Lmd$c;->b()V

    iget-object v0, p0, Lmd;->e:Ljava/util/List;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    iput-object v1, p0, Lmd;->e:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-object v0

    :cond_2
    :try_start_3
    new-instance v0, Lmi;

    iget-object v1, p0, Lmd;->k:Llw;

    invoke-direct {v0, v1}, Lmi;-><init>(Llw;)V

    throw v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lmd;->i:Lmd$c;

    invoke-virtual {v1}, Lmd$c;->b()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final declared-synchronized c(Llw;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lmd;->k:Llw;

    if-nez v0, :cond_0

    iput-object p1, p0, Lmd;->k:Llw;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final d()Lnr;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lmd;->f:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lmd;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "reply before requesting the sink"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lmd;->h:Lmd$a;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method final e()V
    .locals 2

    sget-boolean v0, Lmd;->l:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lmd;->g:Lmd$b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lmd$b;->b:Z

    invoke-virtual {p0}, Lmd;->a()Z

    move-result v0

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    iget-object v0, p0, Lmd;->d:Lmb;

    iget v1, p0, Lmd;->c:I

    invoke-virtual {v0, v1}, Lmb;->b(I)Lmd;

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method final f()V
    .locals 2

    sget-boolean v0, Lmd;->l:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lmd;->g:Lmd$b;

    iget-boolean v0, v0, Lmd$b;->b:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lmd;->g:Lmd$b;

    iget-boolean v0, v0, Lmd$b;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lmd;->h:Lmd$a;

    iget-boolean v0, v0, Lmd$a;->b:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lmd;->h:Lmd$a;

    iget-boolean v0, v0, Lmd$a;->a:Z

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lmd;->a()Z

    move-result v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_3

    sget-object v0, Llw;->f:Llw;

    invoke-virtual {p0, v0}, Lmd;->a(Llw;)V

    return-void

    :cond_3
    if-nez v1, :cond_4

    iget-object v0, p0, Lmd;->d:Lmb;

    iget v1, p0, Lmd;->c:I

    invoke-virtual {v0, v1}, Lmb;->b(I)Lmd;

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method final g()V
    .locals 2

    iget-object v0, p0, Lmd;->h:Lmd$a;

    iget-boolean v0, v0, Lmd$a;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lmd;->h:Lmd$a;

    iget-boolean v0, v0, Lmd$a;->b:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lmd;->k:Llw;

    if-eqz v0, :cond_2

    new-instance v0, Lmi;

    iget-object v1, p0, Lmd;->k:Llw;

    invoke-direct {v0, v1}, Lmi;-><init>(Llw;)V

    throw v0

    :cond_2
    return-void
.end method

.method final h()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method
