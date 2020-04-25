.class final Lkk;
.super Ljava/lang/Object;

# interfaces
.implements Ljs;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkk$a;
    }
.end annotation


# instance fields
.field final a:Lki;

.field final b:Llr;

.field c:Lkc;

.field final d:Lkl;

.field final e:Z

.field private f:Z


# direct methods
.method private constructor <init>(Lki;Lkl;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkk;->a:Lki;

    iput-object p2, p0, Lkk;->d:Lkl;

    iput-boolean p3, p0, Lkk;->e:Z

    new-instance p2, Llr;

    invoke-direct {p2, p1, p3}, Llr;-><init>(Lki;Z)V

    iput-object p2, p0, Lkk;->b:Llr;

    return-void
.end method

.method static a(Lki;Lkl;Z)Lkk;
    .locals 1

    new-instance v0, Lkk;

    invoke-direct {v0, p0, p1, p2}, Lkk;-><init>(Lki;Lkl;Z)V

    iget-object p0, p0, Lki;->i:Lkc$a;

    invoke-interface {p0}, Lkc$a;->a()Lkc;

    move-result-object p0

    iput-object p0, v0, Lkk;->c:Lkc;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lkk;->b:Llr;

    const/4 v1, 0x1

    iput-boolean v1, v0, Llr;->c:Z

    iget-object v0, v0, Llr;->a:Llh;

    if-eqz v0, :cond_1

    iget-object v2, v0, Llh;->d:Ljw;

    monitor-enter v2

    :try_start_0
    iput-boolean v1, v0, Llh;->i:Z

    iget-object v1, v0, Llh;->j:Llk;

    iget-object v0, v0, Llh;->h:Lld;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Llk;->c()V

    return-void

    :cond_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lld;->b:Ljava/net/Socket;

    invoke-static {v0}, Lkv;->a(Ljava/net/Socket;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    return-void
.end method

.method public final a(Ljt;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lkk;->f:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already Executed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkk;->f:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lmp;->c()Lmp;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, Lmp;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lkk;->b:Llr;

    iput-object v0, v1, Llr;->b:Ljava/lang/Object;

    invoke-static {}, Lkc;->a()V

    iget-object v0, p0, Lkk;->a:Lki;

    iget-object v0, v0, Lki;->c:Lka;

    new-instance v1, Lkk$a;

    invoke-direct {v1, p0, p1}, Lkk$a;-><init>(Lkk;Ljt;)V

    invoke-virtual {v0, v1}, Lka;->a(Lkk$a;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkk;->d:Lkl;

    iget-object v0, v0, Lkl;->a:Lkf;

    invoke-virtual {v0}, Lkf;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic clone()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lkk;->a:Lki;

    iget-object v1, p0, Lkk;->d:Lkl;

    iget-boolean v2, p0, Lkk;->e:Z

    invoke-static {v0, v1, v2}, Lkk;->a(Lki;Lkl;Z)Lkk;

    move-result-object v0

    return-object v0
.end method
