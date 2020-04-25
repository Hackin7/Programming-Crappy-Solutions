.class final Lkz$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:[J

.field final c:[Ljava/io/File;

.field final d:[Ljava/io/File;

.field e:Z

.field f:Lkz$a;


# virtual methods
.method final a(Lnd;)V
    .locals 6

    iget-object v0, p0, Lkz$b;->b:[J

    const/4 v1, 0x0

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-wide v3, v0, v1

    const/16 v5, 0x20

    invoke-interface {p1, v5}, Lnd;->h(I)Lnd;

    move-result-object v5

    invoke-interface {v5, v3, v4}, Lnd;->k(J)Lnd;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
