.class final Lde$1;
.super Ldj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde;->a()Ldj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldj<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lde;


# direct methods
.method constructor <init>(Lde;)V
    .locals 0

    iput-object p1, p0, Lde$1;->a:Lde;

    invoke-direct {p0}, Ldj;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 1

    iget-object v0, p0, Lde$1;->a:Lde;

    iget v0, v0, Lde;->h:I

    return v0
.end method

.method protected final a(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lde$1;->a:Lde;

    invoke-virtual {v0, p1}, Lde;->a(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method protected final a(II)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lde$1;->a:Lde;

    iget-object v0, v0, Lde;->g:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-object p1, v0, p1

    return-object p1
.end method

.method protected final a(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    iget-object v0, p0, Lde$1;->a:Lde;

    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    iget-object v1, v0, Ldk;->g:[Ljava/lang/Object;

    aget-object v1, v1, p1

    iget-object v0, v0, Ldk;->g:[Ljava/lang/Object;

    aput-object p2, v0, p1

    return-object v1
.end method

.method protected final a(I)V
    .locals 1

    iget-object v0, p0, Lde$1;->a:Lde;

    invoke-virtual {v0, p1}, Lde;->d(I)Ljava/lang/Object;

    return-void
.end method

.method protected final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    iget-object v0, p0, Lde$1;->a:Lde;

    invoke-virtual {v0, p1, p2}, Lde;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected final b(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lde$1;->a:Lde;

    invoke-virtual {v0, p1}, Lde;->b(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method protected final b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lde$1;->a:Lde;

    return-object v0
.end method

.method protected final c()V
    .locals 1

    iget-object v0, p0, Lde$1;->a:Lde;

    invoke-virtual {v0}, Lde;->clear()V

    return-void
.end method
