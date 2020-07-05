.class public final Ldu;
.super Leb;


# instance fields
.field public a:I

.field private an:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lee;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Leb;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ldu;->a:I

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ldu;->an:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldu;->b:Z

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    iget-object p1, p0, Ldu;->G:Ldy;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Ldu;->G:Ldy;

    check-cast p1, Ldz;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ldz;->j(I)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget p1, p0, Ldu;->a:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, p0, Ldu;->y:Ldx;

    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Ldu;->w:Ldx;

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Ldu;->x:Ldx;

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, Ldu;->v:Ldx;

    :goto_0
    iget-object p1, p1, Ldx;->a:Lee;

    const/4 v0, 0x5

    iput v0, p1, Lee;->g:I

    iget v0, p0, Ldu;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget v0, p0, Ldu;->a:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ldu;->v:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    invoke-virtual {v0, v2, v1}, Lee;->a(Lee;F)V

    iget-object v0, p0, Ldu;->x:Ldx;

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, p0, Ldu;->w:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    invoke-virtual {v0, v2, v1}, Lee;->a(Lee;F)V

    iget-object v0, p0, Ldu;->y:Ldx;

    :goto_2
    iget-object v0, v0, Ldx;->a:Lee;

    invoke-virtual {v0, v2, v1}, Lee;->a(Lee;F)V

    iget-object v0, p0, Ldu;->an:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    :goto_3
    iget v1, p0, Ldu;->am:I

    if-ge v0, v1, :cond_6

    iget-object v1, p0, Ldu;->al:[Ldy;

    aget-object v1, v1, v0

    iget-boolean v3, p0, Ldu;->b:Z

    if-nez v3, :cond_4

    invoke-virtual {v1}, Ldy;->a()Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_4
    iget v3, p0, Ldu;->a:I

    packed-switch v3, :pswitch_data_1

    move-object v1, v2

    goto :goto_5

    :pswitch_4
    iget-object v1, v1, Ldy;->y:Ldx;

    goto :goto_4

    :pswitch_5
    iget-object v1, v1, Ldy;->w:Ldx;

    goto :goto_4

    :pswitch_6
    iget-object v1, v1, Ldy;->x:Ldx;

    goto :goto_4

    :pswitch_7
    iget-object v1, v1, Ldy;->v:Ldx;

    :goto_4
    iget-object v1, v1, Ldx;->a:Lee;

    :goto_5
    if-eqz v1, :cond_5

    iget-object v3, p0, Ldu;->an:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, p1}, Lee;->a(Leg;)V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public final a(Ldq;)V
    .locals 12

    iget-object v0, p0, Ldu;->D:[Ldx;

    iget-object v1, p0, Ldu;->v:Ldx;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v0, p0, Ldu;->D:[Ldx;

    iget-object v1, p0, Ldu;->w:Ldx;

    const/4 v3, 0x2

    aput-object v1, v0, v3

    iget-object v0, p0, Ldu;->D:[Ldx;

    iget-object v1, p0, Ldu;->x:Ldx;

    const/4 v4, 0x1

    aput-object v1, v0, v4

    iget-object v0, p0, Ldu;->D:[Ldx;

    iget-object v1, p0, Ldu;->y:Ldx;

    const/4 v5, 0x3

    aput-object v1, v0, v5

    move v0, v2

    :goto_0
    iget-object v1, p0, Ldu;->D:[Ldx;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Ldu;->D:[Ldx;

    aget-object v1, v1, v0

    iget-object v6, p0, Ldu;->D:[Ldx;

    aget-object v6, v6, v0

    invoke-virtual {p1, v6}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v6

    iput-object v6, v1, Ldx;->i:Ldt;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Ldu;->a:I

    if-ltz v0, :cond_13

    iget v0, p0, Ldu;->a:I

    const/4 v1, 0x4

    if-ge v0, v1, :cond_13

    iget-object v0, p0, Ldu;->D:[Ldx;

    iget v1, p0, Ldu;->a:I

    aget-object v0, v0, v1

    move v1, v2

    :goto_1
    iget v6, p0, Ldu;->am:I

    if-ge v1, v6, :cond_6

    iget-object v6, p0, Ldu;->al:[Ldy;

    aget-object v6, v6, v1

    iget-boolean v7, p0, Ldu;->b:Z

    if-nez v7, :cond_1

    invoke-virtual {v6}, Ldy;->a()Z

    move-result v7

    if-eqz v7, :cond_5

    :cond_1
    iget v7, p0, Ldu;->a:I

    if-eqz v7, :cond_2

    iget v7, p0, Ldu;->a:I

    if-ne v7, v4, :cond_3

    :cond_2
    invoke-virtual {v6}, Ldy;->x()I

    move-result v7

    sget v8, Ldy$a;->c:I

    if-ne v7, v8, :cond_3

    :goto_2
    move v1, v4

    goto :goto_3

    :cond_3
    iget v7, p0, Ldu;->a:I

    if-eq v7, v3, :cond_4

    iget v7, p0, Ldu;->a:I

    if-ne v7, v5, :cond_5

    :cond_4
    invoke-virtual {v6}, Ldy;->y()I

    move-result v6

    sget v7, Ldy$a;->c:I

    if-ne v6, v7, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    move v1, v2

    :goto_3
    iget v6, p0, Ldu;->a:I

    if-eqz v6, :cond_8

    iget v6, p0, Ldu;->a:I

    if-ne v6, v4, :cond_7

    goto :goto_4

    :cond_7
    iget-object v6, p0, Ldy;->G:Ldy;

    invoke-virtual {v6}, Ldy;->y()I

    move-result v6

    sget v7, Ldy$a;->b:I

    if-ne v6, v7, :cond_9

    goto :goto_5

    :cond_8
    :goto_4
    iget-object v6, p0, Ldy;->G:Ldy;

    invoke-virtual {v6}, Ldy;->x()I

    move-result v6

    sget v7, Ldy$a;->b:I

    if-ne v6, v7, :cond_9

    :goto_5
    move v1, v2

    :cond_9
    move v6, v2

    :goto_6
    iget v7, p0, Ldu;->am:I

    if-ge v6, v7, :cond_f

    iget-object v7, p0, Ldu;->al:[Ldy;

    aget-object v7, v7, v6

    iget-boolean v8, p0, Ldu;->b:Z

    if-nez v8, :cond_a

    invoke-virtual {v7}, Ldy;->a()Z

    move-result v8

    if-eqz v8, :cond_e

    :cond_a
    iget-object v8, v7, Ldy;->D:[Ldx;

    iget v9, p0, Ldu;->a:I

    aget-object v8, v8, v9

    invoke-virtual {p1, v8}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v8

    iget-object v7, v7, Ldy;->D:[Ldx;

    iget v9, p0, Ldu;->a:I

    aget-object v7, v7, v9

    iput-object v8, v7, Ldx;->i:Ldt;

    iget v7, p0, Ldu;->a:I

    const/high16 v9, -0x40800000    # -1.0f

    if-eqz v7, :cond_c

    iget v7, p0, Ldu;->a:I

    if-ne v7, v3, :cond_b

    goto :goto_7

    :cond_b
    iget-object v7, v0, Ldx;->i:Ldt;

    invoke-virtual {p1}, Ldq;->c()Ldn;

    move-result-object v10

    invoke-virtual {p1}, Ldq;->d()Ldt;

    move-result-object v11

    iput v2, v11, Ldt;->c:I

    invoke-virtual {v10, v7, v8, v11, v2}, Ldn;->a(Ldt;Ldt;Ldt;I)Ldn;

    if-eqz v1, :cond_d

    goto :goto_8

    :cond_c
    :goto_7
    iget-object v7, v0, Ldx;->i:Ldt;

    invoke-virtual {p1}, Ldq;->c()Ldn;

    move-result-object v10

    invoke-virtual {p1}, Ldq;->d()Ldt;

    move-result-object v11

    iput v2, v11, Ldt;->c:I

    invoke-virtual {v10, v7, v8, v11, v2}, Ldn;->b(Ldt;Ldt;Ldt;I)Ldn;

    if-eqz v1, :cond_d

    :goto_8
    iget-object v7, v10, Ldn;->d:Ldm;

    invoke-virtual {v7, v11}, Ldm;->b(Ldt;)F

    move-result v7

    mul-float/2addr v9, v7

    float-to-int v7, v9

    invoke-virtual {p1, v10, v7, v4}, Ldq;->a(Ldn;II)V

    :cond_d
    invoke-virtual {p1, v10}, Ldq;->a(Ldn;)V

    :cond_e
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_f
    iget v0, p0, Ldu;->a:I

    const/4 v6, 0x5

    const/4 v7, 0x6

    if-nez v0, :cond_10

    iget-object v0, p0, Ldu;->x:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v3, p0, Ldu;->v:Ldx;

    iget-object v3, v3, Ldx;->i:Ldt;

    invoke-virtual {p1, v0, v3, v2, v7}, Ldq;->c(Ldt;Ldt;II)Ldn;

    if-nez v1, :cond_13

    iget-object v0, p0, Ldu;->v:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v1, p0, Ldu;->G:Ldy;

    iget-object v1, v1, Ldy;->x:Ldx;

    :goto_9
    iget-object v1, v1, Ldx;->i:Ldt;

    invoke-virtual {p1, v0, v1, v2, v6}, Ldq;->c(Ldt;Ldt;II)Ldn;

    return-void

    :cond_10
    iget v0, p0, Ldu;->a:I

    if-ne v0, v4, :cond_11

    iget-object v0, p0, Ldu;->v:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v3, p0, Ldu;->x:Ldx;

    iget-object v3, v3, Ldx;->i:Ldt;

    invoke-virtual {p1, v0, v3, v2, v7}, Ldq;->c(Ldt;Ldt;II)Ldn;

    if-nez v1, :cond_13

    iget-object v0, p0, Ldu;->v:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v1, p0, Ldu;->G:Ldy;

    iget-object v1, v1, Ldy;->v:Ldx;

    goto :goto_9

    :cond_11
    iget v0, p0, Ldu;->a:I

    if-ne v0, v3, :cond_12

    iget-object v0, p0, Ldu;->y:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v3, p0, Ldu;->w:Ldx;

    iget-object v3, v3, Ldx;->i:Ldt;

    invoke-virtual {p1, v0, v3, v2, v7}, Ldq;->c(Ldt;Ldt;II)Ldn;

    if-nez v1, :cond_13

    iget-object v0, p0, Ldu;->w:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v1, p0, Ldu;->G:Ldy;

    iget-object v1, v1, Ldy;->y:Ldx;

    goto :goto_9

    :cond_12
    iget v0, p0, Ldu;->a:I

    if-ne v0, v5, :cond_13

    iget-object v0, p0, Ldu;->w:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v3, p0, Ldu;->y:Ldx;

    iget-object v3, v3, Ldx;->i:Ldt;

    invoke-virtual {p1, v0, v3, v2, v7}, Ldq;->c(Ldt;Ldt;II)Ldn;

    if-nez v1, :cond_13

    iget-object v0, p0, Ldu;->w:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v1, p0, Ldu;->G:Ldy;

    iget-object v1, v1, Ldy;->w:Ldx;

    iget-object v1, v1, Ldx;->i:Ldt;

    invoke-virtual {p1, v0, v1, v2, v6}, Ldq;->c(Ldt;Ldt;II)Ldn;

    :cond_13
    return-void
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b()V
    .locals 1

    invoke-super {p0}, Leb;->b()V

    iget-object v0, p0, Ldu;->an:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final c()V
    .locals 8

    iget v0, p0, Ldu;->a:I

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Ldu;->y:Ldx;

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Ldu;->w:Ldx;

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, Ldu;->x:Ldx;

    :goto_0
    iget-object v0, v0, Ldx;->a:Lee;

    move v1, v2

    goto :goto_2

    :pswitch_3
    iget-object v0, p0, Ldu;->v:Ldx;

    :goto_1
    iget-object v0, v0, Ldx;->a:Lee;

    :goto_2
    iget-object v2, p0, Ldu;->an:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v2, :cond_4

    iget-object v5, p0, Ldu;->an:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lee;

    iget v6, v5, Lee;->i:I

    const/4 v7, 0x1

    if-eq v6, v7, :cond_0

    return-void

    :cond_0
    iget v6, p0, Ldu;->a:I

    if-eqz v6, :cond_2

    iget v6, p0, Ldu;->a:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    goto :goto_4

    :cond_1
    iget v6, v5, Lee;->f:F

    cmpl-float v6, v6, v1

    if-lez v6, :cond_3

    goto :goto_5

    :cond_2
    :goto_4
    iget v6, v5, Lee;->f:F

    cmpg-float v6, v6, v1

    if-gez v6, :cond_3

    :goto_5
    iget v1, v5, Lee;->f:F

    iget-object v3, v5, Lee;->e:Lee;

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_4
    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v2

    iget-wide v4, v2, Ldr;->z:J

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    iput-wide v4, v2, Ldr;->z:J

    :cond_5
    iput-object v3, v0, Lee;->e:Lee;

    iput v1, v0, Lee;->f:F

    invoke-virtual {v0}, Lee;->d()V

    iget v0, p0, Ldu;->a:I

    packed-switch v0, :pswitch_data_1

    return-void

    :pswitch_4
    iget-object v0, p0, Ldu;->w:Ldx;

    :goto_6
    iget-object v0, v0, Ldx;->a:Lee;

    invoke-virtual {v0, v3, v1}, Lee;->a(Lee;F)V

    return-void

    :pswitch_5
    iget-object v0, p0, Ldu;->y:Ldx;

    goto :goto_6

    :pswitch_6
    iget-object v0, p0, Ldu;->v:Ldx;

    goto :goto_6

    :pswitch_7
    iget-object v0, p0, Ldu;->x:Ldx;

    goto :goto_6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method
