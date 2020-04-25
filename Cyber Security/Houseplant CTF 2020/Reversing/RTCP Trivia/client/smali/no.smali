.class public final Lno;
.super Ljava/lang/Object;


# instance fields
.field public final a:[B

.field b:I

.field public c:I

.field d:Z

.field e:Z

.field f:Lno;

.field g:Lno;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lno;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lno;->d:Z

    return-void
.end method

.method constructor <init>([BIIZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lno;->a:[B

    iput p2, p0, Lno;->b:I

    iput p3, p0, Lno;->c:I

    iput-boolean p4, p0, Lno;->d:Z

    iput-boolean p5, p0, Lno;->e:Z

    return-void
.end method


# virtual methods
.method final a()Lno;
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lno;->d:Z

    new-instance v0, Lno;

    iget-object v2, p0, Lno;->a:[B

    iget v3, p0, Lno;->b:I

    iget v4, p0, Lno;->c:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lno;-><init>([BIIZZ)V

    return-object v0
.end method

.method public final a(Lno;)Lno;
    .locals 1

    iput-object p0, p1, Lno;->g:Lno;

    iget-object v0, p0, Lno;->f:Lno;

    iput-object v0, p1, Lno;->f:Lno;

    iget-object v0, p0, Lno;->f:Lno;

    iput-object p1, v0, Lno;->g:Lno;

    iput-object p1, p0, Lno;->f:Lno;

    return-object p1
.end method

.method public final a(Lno;I)V
    .locals 5

    iget-boolean v0, p1, Lno;->e:Z

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_0
    iget v0, p1, Lno;->c:I

    add-int/2addr v0, p2

    const/16 v1, 0x2000

    if-le v0, v1, :cond_3

    iget-boolean v0, p1, Lno;->d:Z

    if-eqz v0, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    iget v0, p1, Lno;->c:I

    add-int/2addr v0, p2

    iget v2, p1, Lno;->b:I

    sub-int/2addr v0, v2

    if-le v0, v1, :cond_2

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    iget-object v0, p1, Lno;->a:[B

    iget v1, p1, Lno;->b:I

    iget-object v2, p1, Lno;->a:[B

    iget v3, p1, Lno;->c:I

    iget v4, p1, Lno;->b:I

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lno;->c:I

    iget v1, p1, Lno;->b:I

    sub-int/2addr v0, v1

    iput v0, p1, Lno;->c:I

    iput v4, p1, Lno;->b:I

    :cond_3
    iget-object v0, p0, Lno;->a:[B

    iget v1, p0, Lno;->b:I

    iget-object v2, p1, Lno;->a:[B

    iget v3, p1, Lno;->c:I

    invoke-static {v0, v1, v2, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p1, Lno;->c:I

    add-int/2addr v0, p2

    iput v0, p1, Lno;->c:I

    iget p1, p0, Lno;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lno;->b:I

    return-void
.end method

.method final b()Lno;
    .locals 7

    new-instance v6, Lno;

    iget-object v0, p0, Lno;->a:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, [B

    iget v2, p0, Lno;->b:I

    iget v3, p0, Lno;->c:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lno;-><init>([BIIZZ)V

    return-object v6
.end method

.method public final c()Lno;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lno;->f:Lno;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    iget-object v0, p0, Lno;->f:Lno;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lno;->g:Lno;

    iget-object v3, p0, Lno;->f:Lno;

    iput-object v3, v2, Lno;->f:Lno;

    iget-object v2, p0, Lno;->f:Lno;

    iget-object v3, p0, Lno;->g:Lno;

    iput-object v3, v2, Lno;->g:Lno;

    iput-object v1, p0, Lno;->f:Lno;

    iput-object v1, p0, Lno;->g:Lno;

    return-object v0
.end method
