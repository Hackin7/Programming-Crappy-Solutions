.class final Lnp;
.super Ljava/lang/Object;


# static fields
.field static a:Lno;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field static b:J


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Lno;
    .locals 6

    const-class v0, Lnp;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lnp;->a:Lno;

    if-eqz v1, :cond_0

    sget-object v1, Lnp;->a:Lno;

    iget-object v2, v1, Lno;->f:Lno;

    sput-object v2, Lnp;->a:Lno;

    const/4 v2, 0x0

    iput-object v2, v1, Lno;->f:Lno;

    sget-wide v2, Lnp;->b:J

    const-wide/16 v4, 0x2000

    sub-long/2addr v2, v4

    sput-wide v2, Lnp;->b:J

    monitor-exit v0

    return-object v1

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lno;

    invoke-direct {v0}, Lno;-><init>()V

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method static a(Lno;)V
    .locals 7

    iget-object v0, p0, Lno;->f:Lno;

    if-nez v0, :cond_3

    iget-object v0, p0, Lno;->g:Lno;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lno;->d:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const-class v0, Lnp;

    monitor-enter v0

    :try_start_0
    sget-wide v1, Lnp;->b:J

    const-wide/16 v3, 0x2000

    add-long/2addr v1, v3

    const-wide/32 v5, 0x10000

    cmp-long v1, v1, v5

    if-lez v1, :cond_2

    monitor-exit v0

    return-void

    :cond_2
    sget-wide v1, Lnp;->b:J

    add-long/2addr v1, v3

    sput-wide v1, Lnp;->b:J

    sget-object v1, Lnp;->a:Lno;

    iput-object v1, p0, Lno;->f:Lno;

    const/4 v1, 0x0

    iput v1, p0, Lno;->c:I

    iput v1, p0, Lno;->b:I

    sput-object p0, Lnp;->a:Lno;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    :goto_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method
