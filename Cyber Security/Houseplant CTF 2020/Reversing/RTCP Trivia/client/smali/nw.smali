.class public final Lnw;
.super Ljava/lang/Object;


# static fields
.field private static a:Lkr;

.field private static b:Lnv;


# direct methods
.method public static declared-synchronized a()Lkr;
    .locals 2

    const-class v0, Lnw;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lnw;->a:Lkr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized a(Lkr;)V
    .locals 1

    const-class v0, Lnw;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lnw;->a:Lkr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized a(Lnv;)V
    .locals 1

    const-class v0, Lnw;

    monitor-enter v0

    :try_start_0
    sput-object p0, Lnw;->b:Lnv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b()Lnv;
    .locals 2

    const-class v0, Lnw;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lnw;->b:Lnv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
