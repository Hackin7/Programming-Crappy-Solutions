.class public final Ldw;
.super Ljava/lang/Object;


# instance fields
.field protected a:Ldy;

.field protected b:Ldy;

.field protected c:Ldy;

.field protected d:Ldy;

.field protected e:Ldy;

.field protected f:Ldy;

.field protected g:Ldy;

.field protected h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldy;",
            ">;"
        }
    .end annotation
.end field

.field protected i:I

.field protected j:I

.field protected k:F

.field protected l:Z

.field protected m:Z

.field protected n:Z

.field o:Z

.field private p:I

.field private q:Z


# direct methods
.method public constructor <init>(Ldy;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ldw;->k:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldw;->q:Z

    iput-object p1, p0, Ldw;->a:Ldy;

    iput p2, p0, Ldw;->p:I

    iput-boolean p3, p0, Ldw;->q:Z

    return-void
.end method


# virtual methods
.method final a()V
    .locals 14

    iget v0, p0, Ldw;->p:I

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ldw;->a:Ldy;

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v5, v2

    move v2, v3

    :goto_0
    if-nez v2, :cond_f

    iget v6, p0, Ldw;->i:I

    add-int/2addr v6, v4

    iput v6, p0, Ldw;->i:I

    iget-object v6, v5, Ldy;->ai:[Ldy;

    iget v7, p0, Ldw;->p:I

    const/4 v8, 0x0

    aput-object v8, v6, v7

    iget-object v6, v5, Ldy;->ah:[Ldy;

    iget v7, p0, Ldw;->p:I

    aput-object v8, v6, v7

    iget v6, v5, Ldy;->Y:I

    const/16 v7, 0x8

    if-eq v6, v7, :cond_b

    iget-object v6, p0, Ldw;->b:Ldy;

    if-nez v6, :cond_0

    iput-object v5, p0, Ldw;->b:Ldy;

    :cond_0
    iget-object v6, p0, Ldw;->d:Ldy;

    if-eqz v6, :cond_1

    iget-object v6, p0, Ldw;->d:Ldy;

    iget-object v6, v6, Ldy;->ai:[Ldy;

    iget v9, p0, Ldw;->p:I

    aput-object v5, v6, v9

    :cond_1
    iput-object v5, p0, Ldw;->d:Ldy;

    iget-object v6, v5, Ldy;->F:[I

    iget v9, p0, Ldw;->p:I

    aget v6, v6, v9

    sget v9, Ldy$a;->c:I

    if-ne v6, v9, :cond_b

    iget-object v6, v5, Ldy;->i:[I

    iget v9, p0, Ldw;->p:I

    aget v6, v6, v9

    const/4 v9, 0x3

    if-eqz v6, :cond_2

    iget-object v6, v5, Ldy;->i:[I

    iget v10, p0, Ldw;->p:I

    aget v6, v6, v10

    if-eq v6, v9, :cond_2

    iget-object v6, v5, Ldy;->i:[I

    iget v10, p0, Ldw;->p:I

    aget v6, v6, v10

    if-ne v6, v1, :cond_b

    :cond_2
    iget v6, p0, Ldw;->j:I

    add-int/2addr v6, v4

    iput v6, p0, Ldw;->j:I

    iget-object v6, v5, Ldy;->ag:[F

    iget v10, p0, Ldw;->p:I

    aget v6, v6, v10

    const/4 v10, 0x0

    cmpl-float v11, v6, v10

    if-lez v11, :cond_3

    iget v11, p0, Ldw;->k:F

    iget-object v12, v5, Ldy;->ag:[F

    iget v13, p0, Ldw;->p:I

    aget v12, v12, v13

    add-float/2addr v11, v12

    iput v11, p0, Ldw;->k:F

    :cond_3
    iget v11, p0, Ldw;->p:I

    iget v12, v5, Ldy;->Y:I

    if-eq v12, v7, :cond_5

    iget-object v7, v5, Ldy;->F:[I

    aget v7, v7, v11

    sget v12, Ldy$a;->c:I

    if-ne v7, v12, :cond_5

    iget-object v7, v5, Ldy;->i:[I

    aget v7, v7, v11

    if-eqz v7, :cond_4

    iget-object v7, v5, Ldy;->i:[I

    aget v7, v7, v11

    if-ne v7, v9, :cond_5

    :cond_4
    move v7, v4

    goto :goto_1

    :cond_5
    move v7, v3

    :goto_1
    if-eqz v7, :cond_8

    cmpg-float v6, v6, v10

    if-gez v6, :cond_6

    iput-boolean v4, p0, Ldw;->l:Z

    goto :goto_2

    :cond_6
    iput-boolean v4, p0, Ldw;->m:Z

    :goto_2
    iget-object v6, p0, Ldw;->h:Ljava/util/ArrayList;

    if-nez v6, :cond_7

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Ldw;->h:Ljava/util/ArrayList;

    :cond_7
    iget-object v6, p0, Ldw;->h:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v6, p0, Ldw;->f:Ldy;

    if-nez v6, :cond_9

    iput-object v5, p0, Ldw;->f:Ldy;

    :cond_9
    iget-object v6, p0, Ldw;->g:Ldy;

    if-eqz v6, :cond_a

    iget-object v6, p0, Ldw;->g:Ldy;

    iget-object v6, v6, Ldy;->ah:[Ldy;

    iget v7, p0, Ldw;->p:I

    aput-object v5, v6, v7

    :cond_a
    iput-object v5, p0, Ldw;->g:Ldy;

    :cond_b
    iget-object v6, v5, Ldy;->D:[Ldx;

    add-int/lit8 v7, v0, 0x1

    aget-object v6, v6, v7

    iget-object v6, v6, Ldx;->d:Ldx;

    if-eqz v6, :cond_d

    iget-object v6, v6, Ldx;->b:Ldy;

    iget-object v7, v6, Ldy;->D:[Ldx;

    aget-object v7, v7, v0

    iget-object v7, v7, Ldx;->d:Ldx;

    if-eqz v7, :cond_d

    iget-object v7, v6, Ldy;->D:[Ldx;

    aget-object v7, v7, v0

    iget-object v7, v7, Ldx;->d:Ldx;

    iget-object v7, v7, Ldx;->b:Ldy;

    if-eq v7, v5, :cond_c

    goto :goto_3

    :cond_c
    move-object v8, v6

    :cond_d
    :goto_3
    if-eqz v8, :cond_e

    move-object v5, v8

    goto/16 :goto_0

    :cond_e
    move v2, v4

    goto/16 :goto_0

    :cond_f
    iput-object v5, p0, Ldw;->c:Ldy;

    iget v0, p0, Ldw;->p:I

    if-nez v0, :cond_10

    iget-boolean v0, p0, Ldw;->q:Z

    if-eqz v0, :cond_10

    iget-object v0, p0, Ldw;->c:Ldy;

    goto :goto_4

    :cond_10
    iget-object v0, p0, Ldw;->a:Ldy;

    :goto_4
    iput-object v0, p0, Ldw;->e:Ldy;

    iget-boolean v0, p0, Ldw;->m:Z

    if-eqz v0, :cond_11

    iget-boolean v0, p0, Ldw;->l:Z

    if-eqz v0, :cond_11

    move v3, v4

    :cond_11
    iput-boolean v3, p0, Ldw;->n:Z

    return-void
.end method
