.class final Lmd$a;
.super Ljava/lang/Object;

# interfaces
.implements Lnr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# static fields
.field static final synthetic c:Z = true


# instance fields
.field a:Z

.field b:Z

.field final synthetic d:Lmd;

.field private final e:Lnc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lmd;

    return-void
.end method

.method constructor <init>(Lmd;)V
    .locals 0

    iput-object p1, p0, Lmd$a;->d:Lmd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lnc;

    invoke-direct {p1}, Lnc;-><init>()V

    iput-object p1, p0, Lmd$a;->e:Lnc;

    return-void
.end method

.method private a(Z)V
    .locals 11

    iget-object v0, p0, Lmd$a;->d:Lmd;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lmd$a;->d:Lmd;

    iget-object v1, v1, Lmd;->j:Lmd$c;

    invoke-virtual {v1}, Lmd$c;->b_()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_0
    :try_start_1
    iget-object v1, p0, Lmd$a;->d:Lmd;

    iget-wide v1, v1, Lmd;->b:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    iget-boolean v1, p0, Lmd$a;->b:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lmd$a;->a:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lmd$a;->d:Lmd;

    iget-object v1, v1, Lmd;->k:Llw;

    if-nez v1, :cond_0

    iget-object v1, p0, Lmd$a;->d:Lmd;

    invoke-virtual {v1}, Lmd;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v1, p0, Lmd$a;->d:Lmd;

    iget-object v1, v1, Lmd;->j:Lmd$c;

    invoke-virtual {v1}, Lmd$c;->b()V

    iget-object v1, p0, Lmd$a;->d:Lmd;

    invoke-virtual {v1}, Lmd;->g()V

    iget-object v1, p0, Lmd$a;->d:Lmd;

    iget-wide v1, v1, Lmd;->b:J

    iget-object v3, p0, Lmd$a;->e:Lnc;

    iget-wide v3, v3, Lnc;->b:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    iget-object v1, p0, Lmd$a;->d:Lmd;

    iget-wide v2, v1, Lmd;->b:J

    sub-long/2addr v2, v9

    iput-wide v2, v1, Lmd;->b:J

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget-object v0, v0, Lmd;->j:Lmd$c;

    invoke-virtual {v0}, Lmd$c;->b_()V

    :try_start_3
    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget-object v5, v0, Lmd;->d:Lmb;

    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget v6, v0, Lmd;->c:I

    if-eqz p1, :cond_1

    iget-object p1, p0, Lmd$a;->e:Lnc;

    iget-wide v0, p1, Lnc;->b:J

    cmp-long p1, v9, v0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    move v7, p1

    iget-object v8, p0, Lmd$a;->e:Lnc;

    invoke-virtual/range {v5 .. v10}, Lmb;->a(IZLnc;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object p1, p0, Lmd$a;->d:Lmd;

    iget-object p1, p1, Lmd;->j:Lmd$c;

    invoke-virtual {p1}, Lmd$c;->b()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget-object v0, v0, Lmd;->j:Lmd$c;

    invoke-virtual {v0}, Lmd$c;->b()V

    throw p1

    :catchall_1
    move-exception p1

    :try_start_4
    iget-object v1, p0, Lmd$a;->d:Lmd;

    iget-object v1, v1, Lmd;->j:Lmd$c;

    invoke-virtual {v1}, Lmd$c;->b()V

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method


# virtual methods
.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget-object v0, v0, Lmd;->j:Lmd$c;

    return-object v0
.end method

.method public final a_(Lnc;J)V
    .locals 2

    sget-boolean v0, Lmd$a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lmd$a;->d:Lmd;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_0
    iget-object v0, p0, Lmd$a;->e:Lnc;

    invoke-virtual {v0, p1, p2, p3}, Lnc;->a_(Lnc;J)V

    :goto_0
    iget-object p1, p0, Lmd$a;->e:Lnc;

    iget-wide p1, p1, Lnc;->b:J

    const-wide/16 v0, 0x4000

    cmp-long p1, p1, v0

    if-ltz p1, :cond_1

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lmd$a;->a(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final close()V
    .locals 8

    sget-boolean v0, Lmd$a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lmd$a;->d:Lmd;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lmd$a;->d:Lmd;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lmd$a;->a:Z

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget-object v0, v0, Lmd;->h:Lmd$a;

    iget-boolean v0, v0, Lmd$a;->b:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lmd$a;->e:Lnc;

    iget-wide v2, v0, Lnc;->b:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    :goto_0
    iget-object v0, p0, Lmd$a;->e:Lnc;

    iget-wide v2, v0, Lnc;->b:J

    cmp-long v0, v2, v4

    if-lez v0, :cond_3

    invoke-direct {p0, v1}, Lmd$a;->a(Z)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget-object v2, v0, Lmd;->d:Lmb;

    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget v3, v0, Lmd;->c:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Lmb;->a(IZLnc;J)V

    :cond_3
    iget-object v2, p0, Lmd$a;->d:Lmd;

    monitor-enter v2

    :try_start_1
    iput-boolean v1, p0, Lmd$a;->a:Z

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget-object v0, v0, Lmd;->d:Lmb;

    iget-object v0, v0, Lmb;->q:Lme;

    invoke-virtual {v0}, Lme;->b()V

    iget-object v0, p0, Lmd$a;->d:Lmd;

    invoke-virtual {v0}, Lmd;->f()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final flush()V
    .locals 4

    sget-boolean v0, Lmd$a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lmd$a;->d:Lmd;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lmd$a;->d:Lmd;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lmd$a;->d:Lmd;

    invoke-virtual {v1}, Lmd;->g()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v0, p0, Lmd$a;->e:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lmd$a;->a(Z)V

    iget-object v0, p0, Lmd$a;->d:Lmd;

    iget-object v0, v0, Lmd;->d:Lmb;

    iget-object v0, v0, Lmb;->q:Lme;

    invoke-virtual {v0}, Lme;->b()V

    goto :goto_0

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
