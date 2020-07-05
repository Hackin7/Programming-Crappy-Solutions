.class final Lmb$c;
.super Lku;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation


# instance fields
.field final a:Z

.field final c:I

.field final d:I

.field final synthetic e:Lmb;


# direct methods
.method constructor <init>(Lmb;ZII)V
    .locals 3

    iput-object p1, p0, Lmb$c;->e:Lmb;

    const-string v0, "OkHttp %s ping %08x%08x"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object p1, p1, Lmb;->d:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x2

    aput-object p1, v1, v2

    invoke-direct {p0, v0, v1}, Lku;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean p2, p0, Lmb$c;->a:Z

    iput p3, p0, Lmb$c;->c:I

    iput p4, p0, Lmb$c;->d:I

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    iget-object v0, p0, Lmb$c;->e:Lmb;

    iget-boolean v1, p0, Lmb$c;->a:Z

    iget v2, p0, Lmb$c;->c:I

    iget v3, p0, Lmb$c;->d:I

    if-nez v1, :cond_0

    monitor-enter v0

    :try_start_0
    iget-boolean v4, v0, Lmb;->j:Z

    const/4 v5, 0x1

    iput-boolean v5, v0, Lmb;->j:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Lmb;->b()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_0
    :try_start_2
    iget-object v4, v0, Lmb;->q:Lme;

    invoke-virtual {v4, v1, v2, v3}, Lme;->a(ZII)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    invoke-virtual {v0}, Lmb;->b()V

    return-void
.end method
