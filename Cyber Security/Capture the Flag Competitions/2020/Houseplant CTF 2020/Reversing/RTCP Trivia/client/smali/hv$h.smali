.class final Lhv$h;
.super Ljava/lang/Object;

# interfaces
.implements Lhp$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field final a:Z

.field final b:Lhn;

.field c:I


# direct methods
.method constructor <init>(Lhn;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lhv$h;->a:Z

    iput-object p1, p0, Lhv$h;->b:Lhn;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget v0, p0, Lhv$h;->c:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lhv$h;->c:I

    iget v0, p0, Lhv$h;->c:I

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lhv$h;->b:Lhn;

    iget-object v0, v0, Lhn;->a:Lhv;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lhv;->C:Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v0, Lhv;->C:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    iget-object v4, v0, Lhv;->b:Ljava/util/ArrayList;

    if-eqz v4, :cond_2

    iget-object v4, v0, Lhv;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    if-nez v2, :cond_3

    if-eqz v1, :cond_4

    :cond_3
    iget-object v1, v0, Lhv;->m:Lht;

    iget-object v1, v1, Lht;->d:Landroid/os/Handler;

    iget-object v2, v0, Lhv;->E:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, v0, Lhv;->m:Lht;

    iget-object v1, v1, Lht;->d:Landroid/os/Handler;

    iget-object v2, v0, Lhv;->E:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b()V
    .locals 1

    iget v0, p0, Lhv$h;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lhv$h;->c:I

    return-void
.end method

.method public final c()V
    .locals 9

    iget v0, p0, Lhv$h;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, Lhv$h;->b:Lhn;

    iget-object v3, v3, Lhn;->a:Lhv;

    iget-object v4, v3, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_5

    iget-object v6, v3, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhp;

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Lhp;->a(Lhp$c;)V

    if-eqz v0, :cond_4

    invoke-virtual {v6}, Lhp;->J()Z

    move-result v7

    if-eqz v7, :cond_4

    iget-object v7, v6, Lhp;->s:Lhv;

    if-eqz v7, :cond_3

    iget-object v7, v6, Lhp;->s:Lhv;

    iget-object v7, v7, Lhv;->m:Lht;

    if-nez v7, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v7

    iget-object v8, v6, Lhp;->s:Lhv;

    iget-object v8, v8, Lhv;->m:Lht;

    iget-object v8, v8, Lht;->d:Landroid/os/Handler;

    invoke-virtual {v8}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v8

    if-eq v7, v8, :cond_2

    iget-object v7, v6, Lhp;->s:Lhv;

    iget-object v7, v7, Lhv;->m:Lht;

    iget-object v7, v7, Lht;->d:Landroid/os/Handler;

    new-instance v8, Lhp$1;

    invoke-direct {v8, v6}, Lhp$1;-><init>(Lhp;)V

    invoke-virtual {v7, v8}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    goto :goto_3

    :cond_2
    invoke-virtual {v6}, Lhp;->v()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual {v6}, Lhp;->A()Lhp$a;

    move-result-object v6

    iput-boolean v1, v6, Lhp$a;->q:Z

    :cond_4
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lhv$h;->b:Lhn;

    iget-object v1, v1, Lhn;->a:Lhv;

    iget-object v3, p0, Lhv$h;->b:Lhn;

    iget-boolean v4, p0, Lhv$h;->a:Z

    xor-int/2addr v0, v2

    invoke-virtual {v1, v3, v4, v0, v2}, Lhv;->a(Lhn;ZZZ)V

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lhv$h;->b:Lhn;

    iget-object v0, v0, Lhn;->a:Lhv;

    iget-object v1, p0, Lhv$h;->b:Lhn;

    iget-boolean v2, p0, Lhv$h;->a:Z

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v3}, Lhv;->a(Lhn;ZZZ)V

    return-void
.end method
