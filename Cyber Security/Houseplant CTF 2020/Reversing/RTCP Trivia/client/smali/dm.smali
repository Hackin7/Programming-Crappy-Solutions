.class public final Ldm;
.super Ljava/lang/Object;


# instance fields
.field a:I

.field final b:Ldn;

.field final c:Ldo;

.field d:[I

.field e:[I

.field f:[F

.field g:I

.field private h:I

.field private i:Ldt;

.field private j:I

.field private k:Z


# direct methods
.method constructor <init>(Ldn;Ldo;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ldm;->a:I

    const/16 v1, 0x8

    iput v1, p0, Ldm;->h:I

    const/4 v1, 0x0

    iput-object v1, p0, Ldm;->i:Ldt;

    iget v1, p0, Ldm;->h:I

    new-array v1, v1, [I

    iput-object v1, p0, Ldm;->d:[I

    iget v1, p0, Ldm;->h:I

    new-array v1, v1, [I

    iput-object v1, p0, Ldm;->e:[I

    iget v1, p0, Ldm;->h:I

    new-array v1, v1, [F

    iput-object v1, p0, Ldm;->f:[F

    const/4 v1, -0x1

    iput v1, p0, Ldm;->g:I

    iput v1, p0, Ldm;->j:I

    iput-boolean v0, p0, Ldm;->k:Z

    iput-object p1, p0, Ldm;->b:Ldn;

    iput-object p2, p0, Ldm;->c:Ldo;

    return-void
.end method

.method static a(Ldt;)Z
    .locals 1

    iget p0, p0, Ldt;->i:I

    const/4 v0, 0x1

    if-gt p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Ldt;Z)F
    .locals 8

    iget-object v0, p0, Ldm;->i:Ldt;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Ldm;->i:Ldt;

    :cond_0
    iget v0, p0, Ldm;->g:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    iget v0, p0, Ldm;->g:I

    const/4 v3, 0x0

    move v4, v2

    :goto_0
    if-eq v0, v2, :cond_6

    iget v5, p0, Ldm;->a:I

    if-ge v3, v5, :cond_6

    iget-object v5, p0, Ldm;->d:[I

    aget v5, v5, v0

    iget v6, p1, Ldt;->a:I

    if-ne v5, v6, :cond_5

    iget v1, p0, Ldm;->g:I

    if-ne v0, v1, :cond_2

    iget-object v1, p0, Ldm;->e:[I

    aget v1, v1, v0

    iput v1, p0, Ldm;->g:I

    goto :goto_1

    :cond_2
    iget-object v1, p0, Ldm;->e:[I

    iget-object v3, p0, Ldm;->e:[I

    aget v3, v3, v0

    aput v3, v1, v4

    :goto_1
    if-eqz p2, :cond_3

    iget-object p2, p0, Ldm;->b:Ldn;

    invoke-virtual {p1, p2}, Ldt;->b(Ldn;)V

    :cond_3
    iget p2, p1, Ldt;->i:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Ldt;->i:I

    iget p1, p0, Ldm;->a:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ldm;->a:I

    iget-object p1, p0, Ldm;->d:[I

    aput v2, p1, v0

    iget-boolean p1, p0, Ldm;->k:Z

    if-eqz p1, :cond_4

    iput v0, p0, Ldm;->j:I

    :cond_4
    iget-object p1, p0, Ldm;->f:[F

    aget p1, p1, v0

    return p1

    :cond_5
    iget-object v4, p0, Ldm;->e:[I

    aget v4, v4, v0

    add-int/lit8 v3, v3, 0x1

    move v7, v4

    move v4, v0

    move v0, v7

    goto :goto_0

    :cond_6
    return v1
.end method

.method final a(I)Ldt;
    .locals 3

    iget v0, p0, Ldm;->g:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v2, p0, Ldm;->a:I

    if-ge v1, v2, :cond_1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Ldm;->c:Ldo;

    iget-object p1, p1, Ldo;->c:[Ldt;

    iget-object v1, p0, Ldm;->d:[I

    aget v0, v1, v0

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    iget-object v2, p0, Ldm;->e:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method final a([ZLdt;)Ldt;
    .locals 8

    iget v0, p0, Ldm;->g:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v1

    :goto_0
    const/4 v5, -0x1

    if-eq v0, v5, :cond_3

    iget v5, p0, Ldm;->a:I

    if-ge v2, v5, :cond_3

    iget-object v5, p0, Ldm;->f:[F

    aget v5, v5, v0

    cmpg-float v5, v5, v1

    if-gez v5, :cond_2

    iget-object v5, p0, Ldm;->c:Ldo;

    iget-object v5, v5, Ldo;->c:[Ldt;

    iget-object v6, p0, Ldm;->d:[I

    aget v6, v6, v0

    aget-object v5, v5, v6

    if-eqz p1, :cond_0

    iget v6, v5, Ldt;->a:I

    aget-boolean v6, p1, v6

    if-nez v6, :cond_2

    :cond_0
    if-eq v5, p2, :cond_2

    iget v6, v5, Ldt;->f:I

    sget v7, Ldt$a;->c:I

    if-eq v6, v7, :cond_1

    iget v6, v5, Ldt;->f:I

    sget v7, Ldt$a;->d:I

    if-ne v6, v7, :cond_2

    :cond_1
    iget-object v6, p0, Ldm;->f:[F

    aget v6, v6, v0

    cmpg-float v7, v6, v4

    if-gez v7, :cond_2

    move-object v3, v5

    move v4, v6

    :cond_2
    iget-object v5, p0, Ldm;->e:[I

    aget v0, v5, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v3
.end method

.method public final a()V
    .locals 5

    iget v0, p0, Ldm;->g:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, -0x1

    if-eq v0, v3, :cond_1

    iget v4, p0, Ldm;->a:I

    if-ge v2, v4, :cond_1

    iget-object v3, p0, Ldm;->c:Ldo;

    iget-object v3, v3, Ldo;->c:[Ldt;

    iget-object v4, p0, Ldm;->d:[I

    aget v4, v4, v0

    aget-object v3, v3, v4

    if-eqz v3, :cond_0

    iget-object v4, p0, Ldm;->b:Ldn;

    invoke-virtual {v3, v4}, Ldt;->b(Ldn;)V

    :cond_0
    iget-object v3, p0, Ldm;->e:[I

    aget v0, v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput v3, p0, Ldm;->g:I

    iput v3, p0, Ldm;->j:I

    iput-boolean v1, p0, Ldm;->k:Z

    iput v1, p0, Ldm;->a:I

    return-void
.end method

.method public final a(Ldt;F)V
    .locals 8

    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, v1}, Ldm;->a(Ldt;Z)F

    return-void

    :cond_0
    iget v0, p0, Ldm;->g:I

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_2

    iput v2, p0, Ldm;->g:I

    iget-object v0, p0, Ldm;->f:[F

    iget v2, p0, Ldm;->g:I

    aput p2, v0, v2

    iget-object p2, p0, Ldm;->d:[I

    iget v0, p0, Ldm;->g:I

    iget v2, p1, Ldt;->a:I

    aput v2, p2, v0

    iget-object p2, p0, Ldm;->e:[I

    iget v0, p0, Ldm;->g:I

    aput v3, p2, v0

    iget p2, p1, Ldt;->i:I

    add-int/2addr p2, v1

    iput p2, p1, Ldt;->i:I

    iget-object p2, p0, Ldm;->b:Ldn;

    invoke-virtual {p1, p2}, Ldt;->a(Ldn;)V

    iget p1, p0, Ldm;->a:I

    add-int/2addr p1, v1

    iput p1, p0, Ldm;->a:I

    iget-boolean p1, p0, Ldm;->k:Z

    if-nez p1, :cond_1

    iget p1, p0, Ldm;->j:I

    add-int/2addr p1, v1

    iput p1, p0, Ldm;->j:I

    iget p1, p0, Ldm;->j:I

    iget-object p2, p0, Ldm;->d:[I

    array-length p2, p2

    if-lt p1, p2, :cond_1

    iput-boolean v1, p0, Ldm;->k:Z

    iget-object p1, p0, Ldm;->d:[I

    array-length p1, p1

    sub-int/2addr p1, v1

    iput p1, p0, Ldm;->j:I

    :cond_1
    return-void

    :cond_2
    iget v0, p0, Ldm;->g:I

    move v4, v2

    move v5, v3

    :goto_0
    if-eq v0, v3, :cond_5

    iget v6, p0, Ldm;->a:I

    if-ge v4, v6, :cond_5

    iget-object v6, p0, Ldm;->d:[I

    aget v6, v6, v0

    iget v7, p1, Ldt;->a:I

    if-ne v6, v7, :cond_3

    iget-object p1, p0, Ldm;->f:[F

    aput p2, p1, v0

    return-void

    :cond_3
    iget-object v6, p0, Ldm;->d:[I

    aget v6, v6, v0

    iget v7, p1, Ldt;->a:I

    if-ge v6, v7, :cond_4

    move v5, v0

    :cond_4
    iget-object v6, p0, Ldm;->e:[I

    aget v0, v6, v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    iget v0, p0, Ldm;->j:I

    add-int/2addr v0, v1

    iget-boolean v4, p0, Ldm;->k:Z

    if-eqz v4, :cond_7

    iget-object v0, p0, Ldm;->d:[I

    iget v4, p0, Ldm;->j:I

    aget v0, v0, v4

    if-ne v0, v3, :cond_6

    iget v0, p0, Ldm;->j:I

    goto :goto_1

    :cond_6
    iget-object v0, p0, Ldm;->d:[I

    array-length v0, v0

    :cond_7
    :goto_1
    iget-object v4, p0, Ldm;->d:[I

    array-length v4, v4

    if-lt v0, v4, :cond_9

    iget v4, p0, Ldm;->a:I

    iget-object v6, p0, Ldm;->d:[I

    array-length v6, v6

    if-ge v4, v6, :cond_9

    move v4, v2

    :goto_2
    iget-object v6, p0, Ldm;->d:[I

    array-length v6, v6

    if-ge v4, v6, :cond_9

    iget-object v6, p0, Ldm;->d:[I

    aget v6, v6, v4

    if-ne v6, v3, :cond_8

    move v0, v4

    goto :goto_3

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_9
    :goto_3
    iget-object v4, p0, Ldm;->d:[I

    array-length v4, v4

    if-lt v0, v4, :cond_a

    iget-object v0, p0, Ldm;->d:[I

    array-length v0, v0

    iget v4, p0, Ldm;->h:I

    mul-int/lit8 v4, v4, 0x2

    iput v4, p0, Ldm;->h:I

    iput-boolean v2, p0, Ldm;->k:Z

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Ldm;->j:I

    iget-object v2, p0, Ldm;->f:[F

    iget v4, p0, Ldm;->h:I

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v2

    iput-object v2, p0, Ldm;->f:[F

    iget-object v2, p0, Ldm;->d:[I

    iget v4, p0, Ldm;->h:I

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Ldm;->d:[I

    iget-object v2, p0, Ldm;->e:[I

    iget v4, p0, Ldm;->h:I

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Ldm;->e:[I

    :cond_a
    iget-object v2, p0, Ldm;->d:[I

    iget v4, p1, Ldt;->a:I

    aput v4, v2, v0

    iget-object v2, p0, Ldm;->f:[F

    aput p2, v2, v0

    if-eq v5, v3, :cond_b

    iget-object p2, p0, Ldm;->e:[I

    iget-object v2, p0, Ldm;->e:[I

    aget v2, v2, v5

    aput v2, p2, v0

    iget-object p2, p0, Ldm;->e:[I

    aput v0, p2, v5

    goto :goto_4

    :cond_b
    iget-object p2, p0, Ldm;->e:[I

    iget v2, p0, Ldm;->g:I

    aput v2, p2, v0

    iput v0, p0, Ldm;->g:I

    :goto_4
    iget p2, p1, Ldt;->i:I

    add-int/2addr p2, v1

    iput p2, p1, Ldt;->i:I

    iget-object p2, p0, Ldm;->b:Ldn;

    invoke-virtual {p1, p2}, Ldt;->a(Ldn;)V

    iget p1, p0, Ldm;->a:I

    add-int/2addr p1, v1

    iput p1, p0, Ldm;->a:I

    iget-boolean p1, p0, Ldm;->k:Z

    if-nez p1, :cond_c

    iget p1, p0, Ldm;->j:I

    add-int/2addr p1, v1

    iput p1, p0, Ldm;->j:I

    :cond_c
    iget p1, p0, Ldm;->a:I

    iget-object p2, p0, Ldm;->d:[I

    array-length p2, p2

    if-lt p1, p2, :cond_d

    iput-boolean v1, p0, Ldm;->k:Z

    :cond_d
    iget p1, p0, Ldm;->j:I

    iget-object p2, p0, Ldm;->d:[I

    array-length p2, p2

    if-lt p1, p2, :cond_e

    iput-boolean v1, p0, Ldm;->k:Z

    iget-object p1, p0, Ldm;->d:[I

    array-length p1, p1

    sub-int/2addr p1, v1

    iput p1, p0, Ldm;->j:I

    :cond_e
    return-void
.end method

.method final a(Ldt;FZ)V
    .locals 9

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget v1, p0, Ldm;->g:I

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-ne v1, v3, :cond_2

    iput v2, p0, Ldm;->g:I

    iget-object p3, p0, Ldm;->f:[F

    iget v0, p0, Ldm;->g:I

    aput p2, p3, v0

    iget-object p2, p0, Ldm;->d:[I

    iget p3, p0, Ldm;->g:I

    iget v0, p1, Ldt;->a:I

    aput v0, p2, p3

    iget-object p2, p0, Ldm;->e:[I

    iget p3, p0, Ldm;->g:I

    aput v3, p2, p3

    iget p2, p1, Ldt;->i:I

    add-int/2addr p2, v4

    iput p2, p1, Ldt;->i:I

    iget-object p2, p0, Ldm;->b:Ldn;

    invoke-virtual {p1, p2}, Ldt;->a(Ldn;)V

    iget p1, p0, Ldm;->a:I

    add-int/2addr p1, v4

    iput p1, p0, Ldm;->a:I

    iget-boolean p1, p0, Ldm;->k:Z

    if-nez p1, :cond_1

    iget p1, p0, Ldm;->j:I

    add-int/2addr p1, v4

    iput p1, p0, Ldm;->j:I

    iget p1, p0, Ldm;->j:I

    iget-object p2, p0, Ldm;->d:[I

    array-length p2, p2

    if-lt p1, p2, :cond_1

    iput-boolean v4, p0, Ldm;->k:Z

    iget-object p1, p0, Ldm;->d:[I

    array-length p1, p1

    sub-int/2addr p1, v4

    iput p1, p0, Ldm;->j:I

    :cond_1
    return-void

    :cond_2
    iget v1, p0, Ldm;->g:I

    move v5, v2

    move v6, v3

    :goto_0
    if-eq v1, v3, :cond_9

    iget v7, p0, Ldm;->a:I

    if-ge v5, v7, :cond_9

    iget-object v7, p0, Ldm;->d:[I

    aget v7, v7, v1

    iget v8, p1, Ldt;->a:I

    if-ne v7, v8, :cond_7

    iget-object v2, p0, Ldm;->f:[F

    aget v3, v2, v1

    add-float/2addr v3, p2

    aput v3, v2, v1

    iget-object p2, p0, Ldm;->f:[F

    aget p2, p2, v1

    cmpl-float p2, p2, v0

    if-nez p2, :cond_6

    iget p2, p0, Ldm;->g:I

    if-ne v1, p2, :cond_3

    iget-object p2, p0, Ldm;->e:[I

    aget p2, p2, v1

    iput p2, p0, Ldm;->g:I

    goto :goto_1

    :cond_3
    iget-object p2, p0, Ldm;->e:[I

    iget-object v0, p0, Ldm;->e:[I

    aget v0, v0, v1

    aput v0, p2, v6

    :goto_1
    if-eqz p3, :cond_4

    iget-object p2, p0, Ldm;->b:Ldn;

    invoke-virtual {p1, p2}, Ldt;->b(Ldn;)V

    :cond_4
    iget-boolean p2, p0, Ldm;->k:Z

    if-eqz p2, :cond_5

    iput v1, p0, Ldm;->j:I

    :cond_5
    iget p2, p1, Ldt;->i:I

    sub-int/2addr p2, v4

    iput p2, p1, Ldt;->i:I

    iget p1, p0, Ldm;->a:I

    sub-int/2addr p1, v4

    iput p1, p0, Ldm;->a:I

    :cond_6
    return-void

    :cond_7
    iget-object v7, p0, Ldm;->d:[I

    aget v7, v7, v1

    iget v8, p1, Ldt;->a:I

    if-ge v7, v8, :cond_8

    move v6, v1

    :cond_8
    iget-object v7, p0, Ldm;->e:[I

    aget v1, v7, v1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_9
    iget p3, p0, Ldm;->j:I

    add-int/2addr p3, v4

    iget-boolean v0, p0, Ldm;->k:Z

    if-eqz v0, :cond_b

    iget-object p3, p0, Ldm;->d:[I

    iget v0, p0, Ldm;->j:I

    aget p3, p3, v0

    if-ne p3, v3, :cond_a

    iget p3, p0, Ldm;->j:I

    goto :goto_2

    :cond_a
    iget-object p3, p0, Ldm;->d:[I

    array-length p3, p3

    :cond_b
    :goto_2
    iget-object v0, p0, Ldm;->d:[I

    array-length v0, v0

    if-lt p3, v0, :cond_d

    iget v0, p0, Ldm;->a:I

    iget-object v1, p0, Ldm;->d:[I

    array-length v1, v1

    if-ge v0, v1, :cond_d

    move v0, v2

    :goto_3
    iget-object v1, p0, Ldm;->d:[I

    array-length v1, v1

    if-ge v0, v1, :cond_d

    iget-object v1, p0, Ldm;->d:[I

    aget v1, v1, v0

    if-ne v1, v3, :cond_c

    move p3, v0

    goto :goto_4

    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_d
    :goto_4
    iget-object v0, p0, Ldm;->d:[I

    array-length v0, v0

    if-lt p3, v0, :cond_e

    iget-object p3, p0, Ldm;->d:[I

    array-length p3, p3

    iget v0, p0, Ldm;->h:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Ldm;->h:I

    iput-boolean v2, p0, Ldm;->k:Z

    add-int/lit8 v0, p3, -0x1

    iput v0, p0, Ldm;->j:I

    iget-object v0, p0, Ldm;->f:[F

    iget v1, p0, Ldm;->h:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iput-object v0, p0, Ldm;->f:[F

    iget-object v0, p0, Ldm;->d:[I

    iget v1, p0, Ldm;->h:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ldm;->d:[I

    iget-object v0, p0, Ldm;->e:[I

    iget v1, p0, Ldm;->h:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ldm;->e:[I

    :cond_e
    iget-object v0, p0, Ldm;->d:[I

    iget v1, p1, Ldt;->a:I

    aput v1, v0, p3

    iget-object v0, p0, Ldm;->f:[F

    aput p2, v0, p3

    if-eq v6, v3, :cond_f

    iget-object p2, p0, Ldm;->e:[I

    iget-object v0, p0, Ldm;->e:[I

    aget v0, v0, v6

    aput v0, p2, p3

    iget-object p2, p0, Ldm;->e:[I

    aput p3, p2, v6

    goto :goto_5

    :cond_f
    iget-object p2, p0, Ldm;->e:[I

    iget v0, p0, Ldm;->g:I

    aput v0, p2, p3

    iput p3, p0, Ldm;->g:I

    :goto_5
    iget p2, p1, Ldt;->i:I

    add-int/2addr p2, v4

    iput p2, p1, Ldt;->i:I

    iget-object p2, p0, Ldm;->b:Ldn;

    invoke-virtual {p1, p2}, Ldt;->a(Ldn;)V

    iget p1, p0, Ldm;->a:I

    add-int/2addr p1, v4

    iput p1, p0, Ldm;->a:I

    iget-boolean p1, p0, Ldm;->k:Z

    if-nez p1, :cond_10

    iget p1, p0, Ldm;->j:I

    add-int/2addr p1, v4

    iput p1, p0, Ldm;->j:I

    :cond_10
    iget p1, p0, Ldm;->j:I

    iget-object p2, p0, Ldm;->d:[I

    array-length p2, p2

    if-lt p1, p2, :cond_11

    iput-boolean v4, p0, Ldm;->k:Z

    iget-object p1, p0, Ldm;->d:[I

    array-length p1, p1

    sub-int/2addr p1, v4

    iput p1, p0, Ldm;->j:I

    :cond_11
    return-void
.end method

.method final b(I)F
    .locals 3

    iget v0, p0, Ldm;->g:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v2, p0, Ldm;->a:I

    if-ge v1, v2, :cond_1

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Ldm;->f:[F

    aget p1, p1, v0

    return p1

    :cond_0
    iget-object v2, p0, Ldm;->e:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Ldt;)F
    .locals 4

    iget v0, p0, Ldm;->g:I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget v2, p0, Ldm;->a:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ldm;->d:[I

    aget v2, v2, v0

    iget v3, p1, Ldt;->a:I

    if-ne v2, v3, :cond_0

    iget-object p1, p0, Ldm;->f:[F

    aget p1, p1, v0

    return p1

    :cond_0
    iget-object v2, p0, Ldm;->e:[I

    aget v0, v2, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ""

    iget v1, p0, Ldm;->g:I

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    iget v3, p0, Ldm;->a:I

    if-ge v2, v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ldm;->f:[F

    aget v0, v0, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " : "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ldm;->c:Ldo;

    iget-object v0, v0, Ldo;->c:[Ldt;

    iget-object v4, p0, Ldm;->d:[I

    aget v4, v4, v1

    aget-object v0, v0, v4

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Ldm;->e:[I

    aget v1, v3, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
