.class public Lei;
.super Ldy;


# instance fields
.field protected ax:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ldy;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 4

    invoke-virtual {p0}, Lei;->v()V

    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldy;

    instance-of v3, v2, Lei;

    if-eqz v3, :cond_1

    check-cast v2, Lei;

    invoke-virtual {v2}, Lei;->A()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final D()Ldz;
    .locals 4

    iget-object v0, p0, Ldy;->G:Ldy;

    instance-of v1, p0, Ldz;

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Ldz;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v2, v0, Ldy;->G:Ldy;

    instance-of v3, v0, Ldz;

    if-eqz v3, :cond_1

    move-object v1, v0

    check-cast v1, Ldz;

    :cond_1
    move-object v0, v2

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final E()V
    .locals 1

    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final a(Ldo;)V
    .locals 3

    invoke-super {p0, p1}, Ldy;->a(Ldo;)V

    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldy;

    invoke-virtual {v2, p1}, Ldy;->a(Ldo;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Ldy;)V
    .locals 1

    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Ldy;->G:Ldy;

    if-eqz v0, :cond_0

    iget-object v0, p1, Ldy;->G:Ldy;

    check-cast v0, Lei;

    invoke-virtual {v0, p1}, Lei;->b(Ldy;)V

    :cond_0
    iput-object p0, p1, Ldy;->G:Ldy;

    return-void
.end method

.method public final b(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Ldy;->b(II)V

    iget-object p1, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldy;

    invoke-virtual {p0}, Lei;->p()I

    move-result v1

    invoke-virtual {p0}, Lei;->q()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ldy;->b(II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Ldy;)V
    .locals 1

    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p1, Ldy;->G:Ldy;

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, Ldy;->f()V

    return-void
.end method

.method public final v()V
    .locals 5

    invoke-super {p0}, Ldy;->v()V

    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lei;->ax:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldy;

    invoke-virtual {p0}, Lei;->n()I

    move-result v3

    invoke-virtual {p0}, Lei;->o()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Ldy;->b(II)V

    instance-of v3, v2, Ldz;

    if-nez v3, :cond_1

    invoke-virtual {v2}, Ldy;->v()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
