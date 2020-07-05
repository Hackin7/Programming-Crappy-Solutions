.class final Lmb$6;
.super Lku;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Llw;

.field final synthetic d:Lmb;


# direct methods
.method varargs constructor <init>(Lmb;Ljava/lang/String;[Ljava/lang/Object;ILlw;)V
    .locals 0

    iput-object p1, p0, Lmb$6;->d:Lmb;

    iput p4, p0, Lmb$6;->a:I

    iput-object p5, p0, Lmb$6;->c:Llw;

    invoke-direct {p0, p2, p3}, Lku;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lmb$6;->d:Lmb;

    iget-object v0, v0, Lmb;->i:Lmg;

    invoke-interface {v0}, Lmg;->c()V

    iget-object v0, p0, Lmb$6;->d:Lmb;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lmb$6;->d:Lmb;

    iget-object v1, v1, Lmb;->s:Ljava/util/Set;

    iget v2, p0, Lmb$6;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
