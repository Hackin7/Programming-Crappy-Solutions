.class public final Lea;
.super Ldy;


# instance fields
.field protected a:F

.field protected al:I

.field private am:Ldx;

.field private an:I

.field private ao:Z

.field private ap:I

.field private aq:Led;

.field private ar:I

.field protected b:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ldy;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lea;->a:F

    const/4 v0, -0x1

    iput v0, p0, Lea;->b:I

    iput v0, p0, Lea;->al:I

    iget-object v0, p0, Lea;->w:Ldx;

    iput-object v0, p0, Lea;->am:Ldx;

    const/4 v0, 0x0

    iput v0, p0, Lea;->an:I

    iput-boolean v0, p0, Lea;->ao:Z

    iput v0, p0, Lea;->ap:I

    new-instance v1, Led;

    invoke-direct {v1}, Led;-><init>()V

    iput-object v1, p0, Lea;->aq:Led;

    const/16 v1, 0x8

    iput v1, p0, Lea;->ar:I

    iget-object v1, p0, Lea;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lea;->E:Ljava/util/ArrayList;

    iget-object v2, p0, Lea;->am:Ldx;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lea;->D:[Ldx;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lea;->D:[Ldx;

    iget-object v3, p0, Lea;->am:Ldx;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ldx$c;)Ldx;
    .locals 2

    sget-object v0, Lea$1;->a:[I

    invoke-virtual {p1}, Ldx$c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget v0, p0, Lea;->an:I

    if-nez v0, :cond_0

    iget-object p1, p0, Lea;->am:Ldx;

    return-object p1

    :pswitch_2
    iget v0, p0, Lea;->an:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lea;->am:Ldx;

    return-object p1

    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ldx$c;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, Lea;->a:F

    const/4 p1, -0x1

    iput p1, p0, Lea;->b:I

    iput p1, p0, Lea;->al:I

    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 5

    iget-object p1, p0, Ldy;->G:Ldy;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lea;->an:I

    const/4 v1, 0x1

    const/high16 v2, -0x40800000    # -1.0f

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lea;->w:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object v1, p1, Ldy;->w:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    invoke-virtual {v0, v1, v4}, Lee;->a(Lee;I)V

    iget-object v0, p0, Lea;->y:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object v1, p1, Ldy;->w:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    invoke-virtual {v0, v1, v4}, Lee;->a(Lee;I)V

    iget v0, p0, Lea;->b:I

    if-eq v0, v3, :cond_1

    iget-object v0, p0, Lea;->v:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object v1, p1, Ldy;->v:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget v2, p0, Lea;->b:I

    invoke-virtual {v0, v1, v2}, Lee;->a(Lee;I)V

    iget-object v0, p0, Lea;->x:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object p1, p1, Ldy;->v:Ldx;

    iget-object p1, p1, Ldx;->a:Lee;

    iget v1, p0, Lea;->b:I

    invoke-virtual {v0, p1, v1}, Lee;->a(Lee;I)V

    return-void

    :cond_1
    iget v0, p0, Lea;->al:I

    if-eq v0, v3, :cond_2

    iget-object v0, p0, Lea;->v:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object v1, p1, Ldy;->x:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget v2, p0, Lea;->al:I

    neg-int v2, v2

    invoke-virtual {v0, v1, v2}, Lee;->a(Lee;I)V

    iget-object v0, p0, Lea;->x:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object p1, p1, Ldy;->x:Ldx;

    iget-object p1, p1, Ldx;->a:Lee;

    iget v1, p0, Lea;->al:I

    neg-int v1, v1

    invoke-virtual {v0, p1, v1}, Lee;->a(Lee;I)V

    return-void

    :cond_2
    iget v0, p0, Lea;->a:F

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Ldy;->x()I

    move-result v0

    sget v1, Ldy$a;->a:I

    if-ne v0, v1, :cond_6

    iget v0, p1, Ldy;->H:I

    int-to-float v0, v0

    iget v1, p0, Lea;->a:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lea;->v:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget-object v2, p1, Ldy;->v:Ldx;

    iget-object v2, v2, Ldx;->a:Lee;

    invoke-virtual {v1, v2, v0}, Lee;->a(Lee;I)V

    iget-object v1, p0, Lea;->x:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget-object p1, p1, Ldy;->v:Ldx;

    iget-object p1, p1, Ldx;->a:Lee;

    invoke-virtual {v1, p1, v0}, Lee;->a(Lee;I)V

    return-void

    :cond_3
    iget-object v0, p0, Lea;->v:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object v1, p1, Ldy;->v:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    invoke-virtual {v0, v1, v4}, Lee;->a(Lee;I)V

    iget-object v0, p0, Lea;->x:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object v1, p1, Ldy;->v:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    invoke-virtual {v0, v1, v4}, Lee;->a(Lee;I)V

    iget v0, p0, Lea;->b:I

    if-eq v0, v3, :cond_4

    iget-object v0, p0, Lea;->w:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object v1, p1, Ldy;->w:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget v2, p0, Lea;->b:I

    invoke-virtual {v0, v1, v2}, Lee;->a(Lee;I)V

    iget-object v0, p0, Lea;->y:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object p1, p1, Ldy;->w:Ldx;

    iget-object p1, p1, Ldx;->a:Lee;

    iget v1, p0, Lea;->b:I

    invoke-virtual {v0, p1, v1}, Lee;->a(Lee;I)V

    return-void

    :cond_4
    iget v0, p0, Lea;->al:I

    if-eq v0, v3, :cond_5

    iget-object v0, p0, Lea;->w:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object v1, p1, Ldy;->y:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget v2, p0, Lea;->al:I

    neg-int v2, v2

    invoke-virtual {v0, v1, v2}, Lee;->a(Lee;I)V

    iget-object v0, p0, Lea;->y:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget-object p1, p1, Ldy;->y:Ldx;

    iget-object p1, p1, Ldx;->a:Lee;

    iget v1, p0, Lea;->al:I

    neg-int v1, v1

    invoke-virtual {v0, p1, v1}, Lee;->a(Lee;I)V

    return-void

    :cond_5
    iget v0, p0, Lea;->a:F

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Ldy;->y()I

    move-result v0

    sget v1, Ldy$a;->a:I

    if-ne v0, v1, :cond_6

    iget v0, p1, Ldy;->I:I

    int-to-float v0, v0

    iget v1, p0, Lea;->a:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lea;->w:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget-object v2, p1, Ldy;->w:Ldx;

    iget-object v2, v2, Ldx;->a:Lee;

    invoke-virtual {v1, v2, v0}, Lee;->a(Lee;I)V

    iget-object v1, p0, Lea;->y:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget-object p1, p1, Ldy;->w:Ldx;

    iget-object p1, p1, Ldx;->a:Lee;

    invoke-virtual {v1, p1, v0}, Lee;->a(Lee;I)V

    :cond_6
    return-void
.end method

.method public final a(Ldq;)V
    .locals 9

    iget-object v0, p0, Ldy;->G:Ldy;

    check-cast v0, Ldz;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Ldx$c;->b:Ldx$c;

    invoke-virtual {v0, v1}, Ldz;->a(Ldx$c;)Ldx;

    move-result-object v1

    sget-object v2, Ldx$c;->d:Ldx$c;

    invoke-virtual {v0, v2}, Ldz;->a(Ldx$c;)Ldx;

    move-result-object v2

    iget-object v3, p0, Lea;->G:Ldy;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    iget-object v3, p0, Lea;->G:Ldy;

    iget-object v3, v3, Ldy;->F:[I

    aget v3, v3, v5

    sget v6, Ldy$a;->b:I

    if-ne v3, v6, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_0
    iget v6, p0, Lea;->an:I

    if-nez v6, :cond_3

    sget-object v1, Ldx$c;->c:Ldx$c;

    invoke-virtual {v0, v1}, Ldz;->a(Ldx$c;)Ldx;

    move-result-object v1

    sget-object v2, Ldx$c;->e:Ldx$c;

    invoke-virtual {v0, v2}, Ldz;->a(Ldx$c;)Ldx;

    move-result-object v2

    iget-object v0, p0, Lea;->G:Ldy;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lea;->G:Ldy;

    iget-object v0, v0, Ldy;->F:[I

    aget v0, v0, v4

    sget v3, Ldy$a;->b:I

    if-ne v0, v3, :cond_2

    move v3, v4

    goto :goto_1

    :cond_2
    move v3, v5

    :cond_3
    :goto_1
    iget v0, p0, Lea;->b:I

    const/4 v4, 0x6

    const/4 v6, -0x1

    const/4 v7, 0x5

    if-eq v0, v6, :cond_5

    iget-object v0, p0, Lea;->am:Ldx;

    invoke-virtual {p1, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v0

    invoke-virtual {p1, v1}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v1

    iget v6, p0, Lea;->b:I

    invoke-virtual {p1, v0, v1, v6, v4}, Ldq;->c(Ldt;Ldt;II)Ldn;

    if-eqz v3, :cond_4

    invoke-virtual {p1, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v5, v7}, Ldq;->a(Ldt;Ldt;II)V

    :cond_4
    return-void

    :cond_5
    iget v0, p0, Lea;->al:I

    if-eq v0, v6, :cond_7

    iget-object v0, p0, Lea;->am:Ldx;

    invoke-virtual {p1, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v0

    invoke-virtual {p1, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v2

    iget v6, p0, Lea;->al:I

    neg-int v6, v6

    invoke-virtual {p1, v0, v2, v6, v4}, Ldq;->c(Ldt;Ldt;II)Ldn;

    if-eqz v3, :cond_6

    invoke-virtual {p1, v1}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v5, v7}, Ldq;->a(Ldt;Ldt;II)V

    invoke-virtual {p1, v2, v0, v5, v7}, Ldq;->a(Ldt;Ldt;II)V

    :cond_6
    return-void

    :cond_7
    iget v0, p0, Lea;->a:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_8

    iget-object v0, p0, Lea;->am:Ldx;

    invoke-virtual {p1, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v4

    invoke-virtual {p1, v1}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v5

    invoke-virtual {p1, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v6

    iget v7, p0, Lea;->a:F

    iget-boolean v8, p0, Lea;->ao:Z

    move-object v3, p1

    invoke-static/range {v3 .. v8}, Ldq;->a(Ldq;Ldt;Ldt;Ldt;FZ)Ldn;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldq;->a(Ldn;)V

    :cond_8
    return-void
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j(I)V
    .locals 3

    iget v0, p0, Lea;->an:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lea;->an:I

    iget-object p1, p0, Lea;->E:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, Lea;->an:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lea;->v:Ldx;

    :goto_0
    iput-object p1, p0, Lea;->am:Ldx;

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lea;->w:Ldx;

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lea;->E:Ljava/util/ArrayList;

    iget-object v0, p0, Lea;->am:Ldx;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lea;->D:[Ldx;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p1, :cond_2

    iget-object v1, p0, Lea;->D:[Ldx;

    iget-object v2, p0, Lea;->am:Ldx;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final k(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lea;->a:F

    iput p1, p0, Lea;->b:I

    const/4 p1, -0x1

    iput p1, p0, Lea;->al:I

    :cond_0
    return-void
.end method

.method public final l(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lea;->a:F

    const/4 v0, -0x1

    iput v0, p0, Lea;->b:I

    iput p1, p0, Lea;->al:I

    :cond_0
    return-void
.end method

.method public final u()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldx;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lea;->E:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final z()V
    .locals 4

    iget-object v0, p0, Ldy;->G:Ldy;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lea;->am:Ldx;

    invoke-static {v0}, Ldq;->b(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lea;->an:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    invoke-virtual {p0, v0}, Lea;->b(I)V

    invoke-virtual {p0, v3}, Lea;->c(I)V

    iget-object v0, p0, Ldy;->G:Ldy;

    invoke-virtual {v0}, Ldy;->m()I

    move-result v0

    invoke-virtual {p0, v0}, Lea;->e(I)V

    invoke-virtual {p0, v3}, Lea;->d(I)V

    return-void

    :cond_1
    invoke-virtual {p0, v3}, Lea;->b(I)V

    invoke-virtual {p0, v0}, Lea;->c(I)V

    iget-object v0, p0, Ldy;->G:Ldy;

    invoke-virtual {v0}, Ldy;->l()I

    move-result v0

    invoke-virtual {p0, v0}, Lea;->d(I)V

    invoke-virtual {p0, v3}, Lea;->e(I)V

    return-void
.end method
