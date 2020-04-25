.class public final Ljq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field final a:Lla;

.field final b:Lkz;


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Ljq;->b:Lkz;

    invoke-virtual {v0}, Lkz;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Ljq;->b:Lkz;

    invoke-virtual {v0}, Lkz;->flush()V

    return-void
.end method
