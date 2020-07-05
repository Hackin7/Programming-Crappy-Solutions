.class final Lly$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lly;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:[Llx;

.field d:I

.field e:I

.field f:I

.field private final g:Lnc;

.field private final h:Z

.field private i:I

.field private j:Z


# direct methods
.method constructor <init>(Lnc;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lly$b;-><init>(Lnc;B)V

    return-void
.end method

.method private constructor <init>(Lnc;B)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const p2, 0x7fffffff

    iput p2, p0, Lly$b;->i:I

    const/16 p2, 0x8

    new-array p2, p2, [Llx;

    iput-object p2, p0, Lly$b;->c:[Llx;

    iget-object p2, p0, Lly$b;->c:[Llx;

    const/16 v0, 0x1000

    const/4 v1, 0x0

    const/4 v2, 0x1

    array-length p2, p2

    sub-int/2addr p2, v2

    iput p2, p0, Lly$b;->d:I

    iput v1, p0, Lly$b;->e:I

    iput v1, p0, Lly$b;->f:I

    iput v0, p0, Lly$b;->a:I

    iput v0, p0, Lly$b;->b:I

    iput-boolean v2, p0, Lly$b;->h:Z

    iput-object p1, p0, Lly$b;->g:Lnc;

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lly$b;->c:[Llx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lly$b;->c:[Llx;

    const/4 v1, 0x0

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lly$b;->d:I

    iput v1, p0, Lly$b;->e:I

    iput v1, p0, Lly$b;->f:I

    return-void
.end method

.method private a(III)V
    .locals 1

    if-ge p1, p2, :cond_0

    iget-object p2, p0, Lly$b;->g:Lnc;

    or-int/2addr p1, p3

    :goto_0
    invoke-virtual {p2, p1}, Lnc;->b(I)Lnc;

    return-void

    :cond_0
    iget-object v0, p0, Lly$b;->g:Lnc;

    or-int/2addr p3, p2

    invoke-virtual {v0, p3}, Lnc;->b(I)Lnc;

    sub-int/2addr p1, p2

    :goto_1
    const/16 p2, 0x80

    if-lt p1, p2, :cond_1

    and-int/lit8 p3, p1, 0x7f

    iget-object v0, p0, Lly$b;->g:Lnc;

    or-int/2addr p2, p3

    invoke-virtual {v0, p2}, Lnc;->b(I)Lnc;

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lly$b;->g:Lnc;

    goto :goto_0
.end method

.method private a(Llx;)V
    .locals 6

    iget v0, p1, Llx;->i:I

    iget v1, p0, Lly$b;->b:I

    if-le v0, v1, :cond_0

    invoke-direct {p0}, Lly$b;->a()V

    return-void

    :cond_0
    iget v1, p0, Lly$b;->f:I

    add-int/2addr v1, v0

    iget v2, p0, Lly$b;->b:I

    sub-int/2addr v1, v2

    invoke-direct {p0, v1}, Lly$b;->b(I)I

    iget v1, p0, Lly$b;->e:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lly$b;->c:[Llx;

    array-length v2, v2

    if-le v1, v2, :cond_1

    iget-object v1, p0, Lly$b;->c:[Llx;

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [Llx;

    iget-object v2, p0, Lly$b;->c:[Llx;

    const/4 v3, 0x0

    iget-object v4, p0, Lly$b;->c:[Llx;

    array-length v4, v4

    iget-object v5, p0, Lly$b;->c:[Llx;

    array-length v5, v5

    invoke-static {v2, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lly$b;->c:[Llx;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lly$b;->d:I

    iput-object v1, p0, Lly$b;->c:[Llx;

    :cond_1
    iget v1, p0, Lly$b;->d:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lly$b;->d:I

    iget-object v2, p0, Lly$b;->c:[Llx;

    aput-object p1, v2, v1

    iget p1, p0, Lly$b;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lly$b;->e:I

    iget p1, p0, Lly$b;->f:I

    add-int/2addr p1, v0

    iput p1, p0, Lly$b;->f:I

    return-void
.end method

.method private a(Lnf;)V
    .locals 3

    iget-boolean v0, p0, Lly$b;->h:Z

    const/16 v1, 0x7f

    if-eqz v0, :cond_0

    invoke-static {}, Lmf;->a()Lmf;

    invoke-static {p1}, Lmf;->a(Lnf;)I

    move-result v0

    invoke-virtual {p1}, Lnf;->g()I

    move-result v2

    if-ge v0, v2, :cond_0

    new-instance v0, Lnc;

    invoke-direct {v0}, Lnc;-><init>()V

    invoke-static {}, Lmf;->a()Lmf;

    invoke-static {p1, v0}, Lmf;->a(Lnf;Lnd;)V

    invoke-virtual {v0}, Lnc;->m()Lnf;

    move-result-object p1

    invoke-virtual {p1}, Lnf;->g()I

    move-result v0

    const/16 v2, 0x80

    :goto_0
    invoke-direct {p0, v0, v1, v2}, Lly$b;->a(III)V

    iget-object v0, p0, Lly$b;->g:Lnc;

    invoke-virtual {v0, p1}, Lnc;->a(Lnf;)Lnc;

    return-void

    :cond_0
    invoke-virtual {p1}, Lnf;->g()I

    move-result v0

    const/4 v2, 0x0

    goto :goto_0
.end method

.method private b(I)I
    .locals 5

    const/4 v0, 0x0

    if-lez p1, :cond_1

    iget-object v1, p0, Lly$b;->c:[Llx;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    iget v2, p0, Lly$b;->d:I

    if-lt v1, v2, :cond_0

    if-lez p1, :cond_0

    iget-object v2, p0, Lly$b;->c:[Llx;

    aget-object v2, v2, v1

    iget v2, v2, Llx;->i:I

    sub-int/2addr p1, v2

    iget v2, p0, Lly$b;->f:I

    iget-object v3, p0, Lly$b;->c:[Llx;

    aget-object v3, v3, v1

    iget v3, v3, Llx;->i:I

    sub-int/2addr v2, v3

    iput v2, p0, Lly$b;->f:I

    iget v2, p0, Lly$b;->e:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lly$b;->e:I

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lly$b;->c:[Llx;

    iget v1, p0, Lly$b;->d:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lly$b;->c:[Llx;

    iget v3, p0, Lly$b;->d:I

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v0

    iget v4, p0, Lly$b;->e:I

    invoke-static {p1, v1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lly$b;->c:[Llx;

    iget v1, p0, Lly$b;->d:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Lly$b;->d:I

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget p1, p0, Lly$b;->d:I

    add-int/2addr p1, v0

    iput p1, p0, Lly$b;->d:I

    :cond_1
    return v0
.end method


# virtual methods
.method final a(I)V
    .locals 1

    iput p1, p0, Lly$b;->a:I

    const/16 v0, 0x4000

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v0, p0, Lly$b;->b:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lly$b;->b:I

    if-ge p1, v0, :cond_1

    iget v0, p0, Lly$b;->i:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lly$b;->i:I

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lly$b;->j:Z

    iput p1, p0, Lly$b;->b:I

    iget p1, p0, Lly$b;->b:I

    iget v0, p0, Lly$b;->f:I

    if-ge p1, v0, :cond_3

    iget p1, p0, Lly$b;->b:I

    if-nez p1, :cond_2

    invoke-direct {p0}, Lly$b;->a()V

    return-void

    :cond_2
    iget p1, p0, Lly$b;->f:I

    iget v0, p0, Lly$b;->b:I

    sub-int/2addr p1, v0

    invoke-direct {p0, p1}, Lly$b;->b(I)I

    :cond_3
    return-void
.end method

.method final a(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llx;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lly$b;->j:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, p0, Lly$b;->i:I

    iget v2, p0, Lly$b;->b:I

    const/16 v3, 0x20

    const/16 v4, 0x1f

    if-ge v0, v2, :cond_0

    iget v0, p0, Lly$b;->i:I

    invoke-direct {p0, v0, v4, v3}, Lly$b;->a(III)V

    :cond_0
    iput-boolean v1, p0, Lly$b;->j:Z

    const v0, 0x7fffffff

    iput v0, p0, Lly$b;->i:I

    iget v0, p0, Lly$b;->b:I

    invoke-direct {p0, v0, v4, v3}, Lly$b;->a(III)V

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_b

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llx;

    iget-object v4, v3, Llx;->g:Lnf;

    invoke-virtual {v4}, Lnf;->f()Lnf;

    move-result-object v4

    iget-object v5, v3, Llx;->h:Lnf;

    sget-object v6, Lly;->b:Ljava/util/Map;

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    const/4 v7, -0x1

    const/4 v8, 0x1

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    add-int/2addr v6, v8

    if-le v6, v8, :cond_3

    const/16 v9, 0x8

    if-ge v6, v9, :cond_3

    sget-object v9, Lly;->a:[Llx;

    add-int/lit8 v10, v6, -0x1

    aget-object v9, v9, v10

    iget-object v9, v9, Llx;->h:Lnf;

    invoke-static {v9, v5}, Lkv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_1

    :cond_2
    sget-object v9, Lly;->a:[Llx;

    aget-object v9, v9, v6

    iget-object v9, v9, Llx;->h:Lnf;

    invoke-static {v9, v5}, Lkv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    add-int/lit8 v9, v6, 0x1

    move v12, v9

    move v9, v6

    move v6, v12

    goto :goto_2

    :cond_3
    move v9, v6

    move v6, v7

    goto :goto_2

    :cond_4
    move v6, v7

    :goto_1
    move v9, v6

    :goto_2
    if-ne v6, v7, :cond_7

    iget v10, p0, Lly$b;->d:I

    add-int/2addr v10, v8

    iget-object v8, p0, Lly$b;->c:[Llx;

    array-length v8, v8

    :goto_3
    if-ge v10, v8, :cond_7

    iget-object v11, p0, Lly$b;->c:[Llx;

    aget-object v11, v11, v10

    iget-object v11, v11, Llx;->g:Lnf;

    invoke-static {v11, v4}, Lkv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    iget-object v11, p0, Lly$b;->c:[Llx;

    aget-object v11, v11, v10

    iget-object v11, v11, Llx;->h:Lnf;

    invoke-static {v11, v5}, Lkv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    iget v6, p0, Lly$b;->d:I

    sub-int/2addr v10, v6

    sget-object v6, Lly;->a:[Llx;

    array-length v6, v6

    add-int/2addr v6, v10

    goto :goto_4

    :cond_5
    if-ne v9, v7, :cond_6

    iget v9, p0, Lly$b;->d:I

    sub-int v9, v10, v9

    sget-object v11, Lly;->a:[Llx;

    array-length v11, v11

    add-int/2addr v9, v11

    :cond_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    if-eq v6, v7, :cond_8

    const/16 v3, 0x7f

    const/16 v4, 0x80

    invoke-direct {p0, v6, v3, v4}, Lly$b;->a(III)V

    goto :goto_6

    :cond_8
    const/16 v6, 0x40

    if-ne v9, v7, :cond_9

    iget-object v7, p0, Lly$b;->g:Lnc;

    invoke-virtual {v7, v6}, Lnc;->b(I)Lnc;

    invoke-direct {p0, v4}, Lly$b;->a(Lnf;)V

    :goto_5
    invoke-direct {p0, v5}, Lly$b;->a(Lnf;)V

    invoke-direct {p0, v3}, Lly$b;->a(Llx;)V

    goto :goto_6

    :cond_9
    sget-object v7, Llx;->a:Lnf;

    invoke-virtual {v7}, Lnf;->g()I

    move-result v8

    invoke-virtual {v4, v1, v7, v1, v8}, Lnf;->a(ILnf;II)Z

    move-result v7

    if-eqz v7, :cond_a

    sget-object v7, Llx;->f:Lnf;

    invoke-virtual {v7, v4}, Lnf;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    const/16 v3, 0xf

    invoke-direct {p0, v9, v3, v1}, Lly$b;->a(III)V

    invoke-direct {p0, v5}, Lly$b;->a(Lnf;)V

    goto :goto_6

    :cond_a
    const/16 v4, 0x3f

    invoke-direct {p0, v9, v4, v6}, Lly$b;->a(III)V

    goto :goto_5

    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_b
    return-void
.end method
