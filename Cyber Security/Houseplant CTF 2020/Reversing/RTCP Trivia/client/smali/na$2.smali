.class final Lna$2;
.super Ljava/lang/Object;

# interfaces
.implements Lns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lna;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lns;

.field final synthetic b:Lna;


# direct methods
.method constructor <init>(Lna;Lns;)V
    .locals 0

    iput-object p1, p0, Lna$2;->b:Lna;

    iput-object p2, p0, Lna$2;->a:Lns;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnc;J)J
    .locals 1

    iget-object v0, p0, Lna$2;->b:Lna;

    invoke-virtual {v0}, Lna;->b_()V

    :try_start_0
    iget-object v0, p0, Lna$2;->a:Lns;

    invoke-interface {v0, p1, p2, p3}, Lns;->a(Lnc;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p3, p0, Lna$2;->b:Lna;

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lna;->a(Z)V

    return-wide p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p0, Lna$2;->b:Lna;

    invoke-virtual {p2, p1}, Lna;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iget-object p2, p0, Lna$2;->b:Lna;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lna;->a(Z)V

    throw p1
.end method

.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Lna$2;->b:Lna;

    return-object v0
.end method

.method public final close()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lna$2;->a:Lns;

    invoke-interface {v0}, Lns;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lna$2;->b:Lna;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lna;->a(Z)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    iget-object v1, p0, Lna$2;->b:Lna;

    invoke-virtual {v1, v0}, Lna;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iget-object v1, p0, Lna$2;->b:Lna;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lna;->a(Z)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AsyncTimeout.source("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lna$2;->a:Lns;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
