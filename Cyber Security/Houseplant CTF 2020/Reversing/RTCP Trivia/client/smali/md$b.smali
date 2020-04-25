.class final Lmd$b;
.super Ljava/lang/Object;

# interfaces
.implements Lns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# static fields
.field static final synthetic c:Z = true


# instance fields
.field a:Z

.field b:Z

.field final synthetic d:Lmd;

.field private final e:Lnc;

.field private final f:Lnc;

.field private final g:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lmd;

    return-void
.end method

.method constructor <init>(Lmd;J)V
    .locals 0

    iput-object p1, p0, Lmd$b;->d:Lmd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lnc;

    invoke-direct {p1}, Lnc;-><init>()V

    iput-object p1, p0, Lmd$b;->e:Lnc;

    new-instance p1, Lnc;

    invoke-direct {p1}, Lnc;-><init>()V

    iput-object p1, p0, Lmd$b;->f:Lnc;

    iput-wide p2, p0, Lmd$b;->g:J

    return-void
.end method

.method private b()V
    .locals 4

    iget-object v0, p0, Lmd$b;->d:Lmd;

    iget-object v0, v0, Lmd;->i:Lmd$c;

    invoke-virtual {v0}, Lmd$c;->b_()V

    :goto_0
    :try_start_0
    iget-object v0, p0, Lmd$b;->f:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lmd$b;->b:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lmd$b;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lmd$b;->d:Lmd;

    iget-object v0, v0, Lmd;->k:Llw;

    if-nez v0, :cond_0

    iget-object v0, p0, Lmd$b;->d:Lmd;

    invoke-virtual {v0}, Lmd;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lmd$b;->d:Lmd;

    iget-object v0, v0, Lmd;->i:Lmd$c;

    invoke-virtual {v0}, Lmd$c;->b()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lmd$b;->d:Lmd;

    iget-object v1, v1, Lmd;->i:Lmd$c;

    invoke-virtual {v1}, Lmd$c;->b()V

    throw v0
.end method


# virtual methods
.method public final a(Lnc;J)J
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-gez v2, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "byteCount < 0: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v2, p0, Lmd$b;->d:Lmd;

    monitor-enter v2

    :try_start_0
    invoke-direct {p0}, Lmd$b;->b()V

    iget-boolean v3, p0, Lmd$b;->a:Z

    if-eqz v3, :cond_1

    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v3, p0, Lmd$b;->d:Lmd;

    iget-object v3, v3, Lmd;->k:Llw;

    if-eqz v3, :cond_2

    new-instance p1, Lmi;

    iget-object p2, p0, Lmd$b;->d:Lmd;

    iget-object p2, p2, Lmd;->k:Llw;

    invoke-direct {p1, p2}, Lmi;-><init>(Llw;)V

    throw p1

    :cond_2
    iget-object v3, p0, Lmd$b;->f:Lnc;

    iget-wide v3, v3, Lnc;->b:J

    cmp-long v3, v3, v0

    if-nez v3, :cond_3

    const-wide/16 p1, -0x1

    monitor-exit v2

    return-wide p1

    :cond_3
    iget-object v3, p0, Lmd$b;->f:Lnc;

    iget-object v4, p0, Lmd$b;->f:Lnc;

    iget-wide v4, v4, Lnc;->b:J

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-virtual {v3, p1, p2, p3}, Lnc;->a(Lnc;J)J

    move-result-wide p1

    iget-object p3, p0, Lmd$b;->d:Lmd;

    iget-wide v3, p3, Lmd;->a:J

    add-long/2addr v3, p1

    iput-wide v3, p3, Lmd;->a:J

    iget-object p3, p0, Lmd$b;->d:Lmd;

    iget-wide v3, p3, Lmd;->a:J

    iget-object p3, p0, Lmd$b;->d:Lmd;

    iget-object p3, p3, Lmd;->d:Lmb;

    iget-object p3, p3, Lmb;->m:Lmh;

    invoke-virtual {p3}, Lmh;->b()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    int-to-long v5, p3

    cmp-long p3, v3, v5

    if-ltz p3, :cond_4

    iget-object p3, p0, Lmd$b;->d:Lmd;

    iget-object p3, p3, Lmd;->d:Lmb;

    iget-object v3, p0, Lmd$b;->d:Lmd;

    iget v3, v3, Lmd;->c:I

    iget-object v4, p0, Lmd$b;->d:Lmd;

    iget-wide v4, v4, Lmd;->a:J

    invoke-virtual {p3, v3, v4, v5}, Lmb;->a(IJ)V

    iget-object p3, p0, Lmd$b;->d:Lmd;

    iput-wide v0, p3, Lmd;->a:J

    :cond_4
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object p3, p0, Lmd$b;->d:Lmd;

    iget-object p3, p3, Lmd;->d:Lmb;

    monitor-enter p3

    :try_start_1
    iget-object v2, p0, Lmd$b;->d:Lmd;

    iget-object v2, v2, Lmd;->d:Lmb;

    iget-wide v3, v2, Lmb;->k:J

    add-long/2addr v3, p1

    iput-wide v3, v2, Lmb;->k:J

    iget-object v2, p0, Lmd$b;->d:Lmd;

    iget-object v2, v2, Lmd;->d:Lmb;

    iget-wide v2, v2, Lmb;->k:J

    iget-object v4, p0, Lmd$b;->d:Lmd;

    iget-object v4, v4, Lmd;->d:Lmb;

    iget-object v4, v4, Lmb;->m:Lmh;

    invoke-virtual {v4}, Lmh;->b()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-long v4, v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_5

    iget-object v2, p0, Lmd$b;->d:Lmd;

    iget-object v2, v2, Lmd;->d:Lmb;

    const/4 v3, 0x0

    iget-object v4, p0, Lmd$b;->d:Lmd;

    iget-object v4, v4, Lmd;->d:Lmb;

    iget-wide v4, v4, Lmb;->k:J

    invoke-virtual {v2, v3, v4, v5}, Lmb;->a(IJ)V

    iget-object v2, p0, Lmd$b;->d:Lmd;

    iget-object v2, v2, Lmd;->d:Lmb;

    iput-wide v0, v2, Lmb;->k:J

    :cond_5
    monitor-exit p3

    return-wide p1

    :catchall_0
    move-exception p1

    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Lmd$b;->d:Lmd;

    iget-object v0, v0, Lmd;->i:Lmd$c;

    return-object v0
.end method

.method final a(Lne;J)V
    .locals 9

    sget-boolean v0, Lmd$b;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lmd$b;->d:Lmd;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_7

    iget-object v2, p0, Lmd$b;->d:Lmd;

    monitor-enter v2

    :try_start_0
    iget-boolean v3, p0, Lmd$b;->b:Z

    iget-object v4, p0, Lmd$b;->f:Lnc;

    iget-wide v4, v4, Lnc;->b:J

    add-long/2addr v4, p2

    iget-wide v6, p0, Lmd$b;->g:J

    cmp-long v4, v4, v6

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lez v4, :cond_1

    move v4, v6

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v4, :cond_2

    invoke-interface {p1, p2, p3}, Lne;->g(J)V

    iget-object p1, p0, Lmd$b;->d:Lmd;

    sget-object p2, Llw;->d:Llw;

    invoke-virtual {p1, p2}, Lmd;->b(Llw;)V

    return-void

    :cond_2
    if-eqz v3, :cond_3

    invoke-interface {p1, p2, p3}, Lne;->g(J)V

    return-void

    :cond_3
    iget-object v2, p0, Lmd$b;->e:Lnc;

    invoke-interface {p1, v2, p2, p3}, Lne;->a(Lnc;J)J

    move-result-wide v2

    const-wide/16 v7, -0x1

    cmp-long v4, v2, v7

    if-nez v4, :cond_4

    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_4
    sub-long/2addr p2, v2

    iget-object v3, p0, Lmd$b;->d:Lmd;

    monitor-enter v3

    :try_start_1
    iget-object v2, p0, Lmd$b;->f:Lnc;

    iget-wide v7, v2, Lnc;->b:J

    cmp-long v0, v7, v0

    if-nez v0, :cond_5

    move v5, v6

    :cond_5
    iget-object v0, p0, Lmd$b;->f:Lnc;

    iget-object v1, p0, Lmd$b;->e:Lnc;

    invoke-virtual {v0, v1}, Lnc;->a(Lns;)J

    if-eqz v5, :cond_6

    iget-object v0, p0, Lmd$b;->d:Lmd;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    :cond_6
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_7
    return-void
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lmd$b;->d:Lmd;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lmd$b;->a:Z

    iget-object v1, p0, Lmd$b;->f:Lnc;

    invoke-virtual {v1}, Lnc;->q()V

    iget-object v1, p0, Lmd$b;->d:Lmd;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lmd$b;->d:Lmd;

    invoke-virtual {v0}, Lmd;->f()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
