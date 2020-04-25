.class public Lcz;
.super Ldb;


# static fields
.field private static volatile b:Lcz;

.field private static final d:Ljava/util/concurrent/Executor;

.field private static final e:Ljava/util/concurrent/Executor;


# instance fields
.field public a:Ldb;

.field private c:Ldb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcz$1;

    invoke-direct {v0}, Lcz$1;-><init>()V

    sput-object v0, Lcz;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Lcz$2;

    invoke-direct {v0}, Lcz$2;-><init>()V

    sput-object v0, Lcz;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ldb;-><init>()V

    new-instance v0, Lda;

    invoke-direct {v0}, Lda;-><init>()V

    iput-object v0, p0, Lcz;->c:Ldb;

    iget-object v0, p0, Lcz;->c:Ldb;

    iput-object v0, p0, Lcz;->a:Ldb;

    return-void
.end method

.method public static a()Lcz;
    .locals 2

    sget-object v0, Lcz;->b:Lcz;

    if-eqz v0, :cond_0

    sget-object v0, Lcz;->b:Lcz;

    return-object v0

    :cond_0
    const-class v0, Lcz;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcz;->b:Lcz;

    if-nez v1, :cond_1

    new-instance v1, Lcz;

    invoke-direct {v1}, Lcz;-><init>()V

    sput-object v1, Lcz;->b:Lcz;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcz;->b:Lcz;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcz;->a:Ldb;

    invoke-virtual {v0, p1}, Ldb;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcz;->a:Ldb;

    invoke-virtual {v0, p1}, Ldb;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lcz;->a:Ldb;

    invoke-virtual {v0}, Ldb;->b()Z

    move-result v0

    return v0
.end method
