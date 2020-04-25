.class public final Lec;
.super Ljava/lang/Object;


# static fields
.field static a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, Lec;->a:[Z

    return-void
.end method

.method static a(ILdy;)V
    .locals 17

    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, Ldy;->g()V

    iget-object v1, v0, Ldy;->v:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget-object v2, v0, Ldy;->w:Ldx;

    iget-object v2, v2, Ldx;->a:Lee;

    iget-object v3, v0, Ldy;->x:Ldx;

    iget-object v3, v3, Ldx;->a:Lee;

    iget-object v4, v0, Ldy;->y:Ldx;

    iget-object v4, v4, Ldx;->a:Lee;

    const/16 v5, 0x8

    and-int/lit8 v6, p0, 0x8

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ne v6, v5, :cond_0

    move v6, v8

    goto :goto_0

    :cond_0
    move v6, v7

    :goto_0
    iget-object v9, v0, Ldy;->F:[I

    aget v9, v9, v7

    sget v10, Ldy$a;->c:I

    if-ne v9, v10, :cond_1

    invoke-static {v0, v7}, Lec;->a(Ldy;I)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v8

    goto :goto_1

    :cond_1
    move v9, v7

    :goto_1
    iget v10, v1, Lee;->g:I

    const/4 v11, 0x3

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v14, -0x1

    const/4 v15, 0x2

    if-eq v10, v12, :cond_11

    iget v10, v3, Lee;->g:I

    if-eq v10, v12, :cond_11

    iget-object v10, v0, Ldy;->F:[I

    aget v10, v10, v7

    sget v7, Ldy$a;->a:I

    if-eq v10, v7, :cond_8

    if-eqz v9, :cond_2

    iget v7, v0, Ldy;->Y:I

    if-ne v7, v5, :cond_2

    goto/16 :goto_2

    :cond_2
    if-eqz v9, :cond_11

    invoke-virtual/range {p1 .. p1}, Ldy;->l()I

    move-result v7

    iput v8, v1, Lee;->g:I

    iput v8, v3, Lee;->g:I

    iget-object v9, v0, Ldy;->v:Ldx;

    iget-object v9, v9, Ldx;->d:Ldx;

    if-nez v9, :cond_3

    iget-object v9, v0, Ldy;->x:Ldx;

    iget-object v9, v9, Ldx;->d:Ldx;

    if-nez v9, :cond_3

    if-eqz v6, :cond_a

    goto/16 :goto_3

    :cond_3
    iget-object v9, v0, Ldy;->v:Ldx;

    iget-object v9, v9, Ldx;->d:Ldx;

    if-eqz v9, :cond_4

    iget-object v9, v0, Ldy;->x:Ldx;

    iget-object v9, v9, Ldx;->d:Ldx;

    if-nez v9, :cond_4

    if-eqz v6, :cond_a

    goto :goto_3

    :cond_4
    iget-object v9, v0, Ldy;->v:Ldx;

    iget-object v9, v9, Ldx;->d:Ldx;

    if-nez v9, :cond_5

    iget-object v9, v0, Ldy;->x:Ldx;

    iget-object v9, v9, Ldx;->d:Ldx;

    if-eqz v9, :cond_5

    if-eqz v6, :cond_e

    goto/16 :goto_4

    :cond_5
    iget-object v9, v0, Ldy;->v:Ldx;

    iget-object v9, v9, Ldx;->d:Ldx;

    if-eqz v9, :cond_11

    iget-object v9, v0, Ldy;->x:Ldx;

    iget-object v9, v9, Ldx;->d:Ldx;

    if-eqz v9, :cond_11

    if-eqz v6, :cond_6

    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v9

    invoke-virtual {v9, v1}, Lef;->a(Leg;)V

    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v9

    invoke-virtual {v9, v3}, Lef;->a(Leg;)V

    :cond_6
    iget v9, v0, Ldy;->J:F

    cmpl-float v9, v9, v13

    if-nez v9, :cond_7

    iput v11, v1, Lee;->g:I

    iput v11, v3, Lee;->g:I

    invoke-virtual {v1, v3, v13}, Lee;->b(Lee;F)V

    invoke-virtual {v3, v1, v13}, Lee;->b(Lee;F)V

    goto/16 :goto_5

    :cond_7
    iput v15, v1, Lee;->g:I

    iput v15, v3, Lee;->g:I

    neg-int v9, v7

    int-to-float v9, v9

    invoke-virtual {v1, v3, v9}, Lee;->b(Lee;F)V

    int-to-float v9, v7

    invoke-virtual {v3, v1, v9}, Lee;->b(Lee;F)V

    invoke-virtual {v0, v7}, Ldy;->d(I)V

    goto/16 :goto_5

    :cond_8
    :goto_2
    iget-object v7, v0, Ldy;->v:Ldx;

    iget-object v7, v7, Ldx;->d:Ldx;

    if-nez v7, :cond_b

    iget-object v7, v0, Ldy;->x:Ldx;

    iget-object v7, v7, Ldx;->d:Ldx;

    if-nez v7, :cond_b

    iput v8, v1, Lee;->g:I

    iput v8, v3, Lee;->g:I

    if-eqz v6, :cond_9

    :goto_3
    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v7

    invoke-virtual {v3, v1, v8, v7}, Lee;->a(Lee;ILef;)V

    goto/16 :goto_5

    :cond_9
    invoke-virtual/range {p1 .. p1}, Ldy;->l()I

    move-result v7

    :cond_a
    invoke-virtual {v3, v1, v7}, Lee;->b(Lee;I)V

    goto/16 :goto_5

    :cond_b
    iget-object v7, v0, Ldy;->v:Ldx;

    iget-object v7, v7, Ldx;->d:Ldx;

    if-eqz v7, :cond_c

    iget-object v7, v0, Ldy;->x:Ldx;

    iget-object v7, v7, Ldx;->d:Ldx;

    if-nez v7, :cond_c

    iput v8, v1, Lee;->g:I

    iput v8, v3, Lee;->g:I

    if-eqz v6, :cond_9

    goto :goto_3

    :cond_c
    iget-object v7, v0, Ldy;->v:Ldx;

    iget-object v7, v7, Ldx;->d:Ldx;

    if-nez v7, :cond_f

    iget-object v7, v0, Ldy;->x:Ldx;

    iget-object v7, v7, Ldx;->d:Ldx;

    if-eqz v7, :cond_f

    iput v8, v1, Lee;->g:I

    iput v8, v3, Lee;->g:I

    invoke-virtual/range {p1 .. p1}, Ldy;->l()I

    move-result v7

    neg-int v7, v7

    invoke-virtual {v1, v3, v7}, Lee;->b(Lee;I)V

    if-eqz v6, :cond_d

    :goto_4
    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v7

    invoke-virtual {v1, v3, v14, v7}, Lee;->a(Lee;ILef;)V

    goto :goto_5

    :cond_d
    invoke-virtual/range {p1 .. p1}, Ldy;->l()I

    move-result v7

    :cond_e
    neg-int v7, v7

    invoke-virtual {v1, v3, v7}, Lee;->b(Lee;I)V

    goto :goto_5

    :cond_f
    iget-object v7, v0, Ldy;->v:Ldx;

    iget-object v7, v7, Ldx;->d:Ldx;

    if-eqz v7, :cond_11

    iget-object v7, v0, Ldy;->x:Ldx;

    iget-object v7, v7, Ldx;->d:Ldx;

    if-eqz v7, :cond_11

    iput v15, v1, Lee;->g:I

    iput v15, v3, Lee;->g:I

    if-eqz v6, :cond_10

    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v7

    invoke-virtual {v7, v1}, Lef;->a(Leg;)V

    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v7

    invoke-virtual {v7, v3}, Lef;->a(Leg;)V

    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v7

    invoke-virtual {v1, v3, v14, v7}, Lee;->b(Lee;ILef;)V

    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v7

    invoke-virtual {v3, v1, v8, v7}, Lee;->b(Lee;ILef;)V

    goto :goto_5

    :cond_10
    invoke-virtual/range {p1 .. p1}, Ldy;->l()I

    move-result v7

    neg-int v7, v7

    int-to-float v7, v7

    invoke-virtual {v1, v3, v7}, Lee;->b(Lee;F)V

    invoke-virtual/range {p1 .. p1}, Ldy;->l()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v3, v1, v7}, Lee;->b(Lee;F)V

    :cond_11
    :goto_5
    iget-object v1, v0, Ldy;->F:[I

    aget v1, v1, v8

    sget v3, Ldy$a;->c:I

    if-ne v1, v3, :cond_12

    invoke-static {v0, v8}, Lec;->a(Ldy;I)Z

    move-result v1

    if-eqz v1, :cond_12

    move/from16 v16, v8

    goto :goto_6

    :cond_12
    const/16 v16, 0x0

    :goto_6
    iget v1, v2, Lee;->g:I

    if-eq v1, v12, :cond_24

    iget v1, v4, Lee;->g:I

    if-eq v1, v12, :cond_24

    iget-object v1, v0, Ldy;->F:[I

    aget v1, v1, v8

    sget v3, Ldy$a;->a:I

    if-eq v1, v3, :cond_1c

    if-eqz v16, :cond_13

    iget v1, v0, Ldy;->Y:I

    if-ne v1, v5, :cond_13

    goto/16 :goto_7

    :cond_13
    if-eqz v16, :cond_24

    invoke-virtual/range {p1 .. p1}, Ldy;->m()I

    move-result v1

    iput v8, v2, Lee;->g:I

    iput v8, v4, Lee;->g:I

    iget-object v3, v0, Ldy;->w:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-nez v3, :cond_15

    iget-object v3, v0, Ldy;->y:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-nez v3, :cond_15

    if-eqz v6, :cond_14

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v0

    invoke-virtual {v4, v2, v8, v0}, Lee;->a(Lee;ILef;)V

    return-void

    :cond_14
    invoke-virtual {v4, v2, v1}, Lee;->b(Lee;I)V

    return-void

    :cond_15
    iget-object v3, v0, Ldy;->w:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-eqz v3, :cond_17

    iget-object v3, v0, Ldy;->y:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-nez v3, :cond_17

    if-eqz v6, :cond_16

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v0

    invoke-virtual {v4, v2, v8, v0}, Lee;->a(Lee;ILef;)V

    return-void

    :cond_16
    invoke-virtual {v4, v2, v1}, Lee;->b(Lee;I)V

    return-void

    :cond_17
    iget-object v3, v0, Ldy;->w:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-nez v3, :cond_19

    iget-object v3, v0, Ldy;->y:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-eqz v3, :cond_19

    if-eqz v6, :cond_18

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v0

    invoke-virtual {v2, v4, v14, v0}, Lee;->a(Lee;ILef;)V

    return-void

    :cond_18
    neg-int v0, v1

    invoke-virtual {v2, v4, v0}, Lee;->b(Lee;I)V

    return-void

    :cond_19
    iget-object v3, v0, Ldy;->w:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-eqz v3, :cond_24

    iget-object v3, v0, Ldy;->y:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-eqz v3, :cond_24

    if-eqz v6, :cond_1a

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v3

    invoke-virtual {v3, v2}, Lef;->a(Leg;)V

    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v3

    invoke-virtual {v3, v4}, Lef;->a(Leg;)V

    :cond_1a
    iget v3, v0, Ldy;->J:F

    cmpl-float v3, v3, v13

    if-nez v3, :cond_1b

    iput v11, v2, Lee;->g:I

    iput v11, v4, Lee;->g:I

    invoke-virtual {v2, v4, v13}, Lee;->b(Lee;F)V

    invoke-virtual {v4, v2, v13}, Lee;->b(Lee;F)V

    return-void

    :cond_1b
    iput v15, v2, Lee;->g:I

    iput v15, v4, Lee;->g:I

    neg-int v3, v1

    int-to-float v3, v3

    invoke-virtual {v2, v4, v3}, Lee;->b(Lee;F)V

    int-to-float v3, v1

    invoke-virtual {v4, v2, v3}, Lee;->b(Lee;F)V

    invoke-virtual {v0, v1}, Ldy;->e(I)V

    iget v1, v0, Ldy;->P:I

    if-lez v1, :cond_24

    iget-object v1, v0, Ldy;->z:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget v0, v0, Ldy;->P:I

    invoke-virtual {v1, v2, v0}, Lee;->a(Lee;I)V

    return-void

    :cond_1c
    :goto_7
    iget-object v1, v0, Ldy;->w:Ldx;

    iget-object v1, v1, Ldx;->d:Ldx;

    if-nez v1, :cond_1e

    iget-object v1, v0, Ldy;->y:Ldx;

    iget-object v1, v1, Ldx;->d:Ldx;

    if-nez v1, :cond_1e

    iput v8, v2, Lee;->g:I

    iput v8, v4, Lee;->g:I

    if-eqz v6, :cond_1d

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v1

    invoke-virtual {v4, v2, v8, v1}, Lee;->a(Lee;ILef;)V

    goto :goto_8

    :cond_1d
    invoke-virtual/range {p1 .. p1}, Ldy;->m()I

    move-result v1

    invoke-virtual {v4, v2, v1}, Lee;->b(Lee;I)V

    :goto_8
    iget-object v1, v0, Ldy;->z:Ldx;

    iget-object v1, v1, Ldx;->d:Ldx;

    if-eqz v1, :cond_24

    iget-object v1, v0, Ldy;->z:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iput v8, v1, Lee;->g:I

    iget-object v1, v0, Ldy;->z:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget v0, v0, Ldy;->P:I

    neg-int v0, v0

    invoke-virtual {v2, v1, v0}, Lee;->a(Lee;I)V

    return-void

    :cond_1e
    iget-object v1, v0, Ldy;->w:Ldx;

    iget-object v1, v1, Ldx;->d:Ldx;

    if-eqz v1, :cond_20

    iget-object v1, v0, Ldy;->y:Ldx;

    iget-object v1, v1, Ldx;->d:Ldx;

    if-nez v1, :cond_20

    iput v8, v2, Lee;->g:I

    iput v8, v4, Lee;->g:I

    if-eqz v6, :cond_1f

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v1

    invoke-virtual {v4, v2, v8, v1}, Lee;->a(Lee;ILef;)V

    goto :goto_9

    :cond_1f
    invoke-virtual/range {p1 .. p1}, Ldy;->m()I

    move-result v1

    invoke-virtual {v4, v2, v1}, Lee;->b(Lee;I)V

    :goto_9
    iget v1, v0, Ldy;->P:I

    if-lez v1, :cond_24

    iget-object v1, v0, Ldy;->z:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget v0, v0, Ldy;->P:I

    invoke-virtual {v1, v2, v0}, Lee;->a(Lee;I)V

    return-void

    :cond_20
    iget-object v1, v0, Ldy;->w:Ldx;

    iget-object v1, v1, Ldx;->d:Ldx;

    if-nez v1, :cond_22

    iget-object v1, v0, Ldy;->y:Ldx;

    iget-object v1, v1, Ldx;->d:Ldx;

    if-eqz v1, :cond_22

    iput v8, v2, Lee;->g:I

    iput v8, v4, Lee;->g:I

    if-eqz v6, :cond_21

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v1

    invoke-virtual {v2, v4, v14, v1}, Lee;->a(Lee;ILef;)V

    goto :goto_a

    :cond_21
    invoke-virtual/range {p1 .. p1}, Ldy;->m()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v2, v4, v1}, Lee;->b(Lee;I)V

    :goto_a
    iget v1, v0, Ldy;->P:I

    if-lez v1, :cond_24

    iget-object v1, v0, Ldy;->z:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget v0, v0, Ldy;->P:I

    invoke-virtual {v1, v2, v0}, Lee;->a(Lee;I)V

    return-void

    :cond_22
    iget-object v1, v0, Ldy;->w:Ldx;

    iget-object v1, v1, Ldx;->d:Ldx;

    if-eqz v1, :cond_24

    iget-object v1, v0, Ldy;->y:Ldx;

    iget-object v1, v1, Ldx;->d:Ldx;

    if-eqz v1, :cond_24

    iput v15, v2, Lee;->g:I

    iput v15, v4, Lee;->g:I

    if-eqz v6, :cond_23

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v1

    invoke-virtual {v2, v4, v14, v1}, Lee;->b(Lee;ILef;)V

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v1

    invoke-virtual {v4, v2, v8, v1}, Lee;->b(Lee;ILef;)V

    invoke-virtual/range {p1 .. p1}, Ldy;->i()Lef;

    move-result-object v1

    invoke-virtual {v1, v2}, Lef;->a(Leg;)V

    invoke-virtual/range {p1 .. p1}, Ldy;->h()Lef;

    move-result-object v1

    invoke-virtual {v1, v4}, Lef;->a(Leg;)V

    goto :goto_b

    :cond_23
    invoke-virtual/range {p1 .. p1}, Ldy;->m()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {v2, v4, v1}, Lee;->b(Lee;F)V

    invoke-virtual/range {p1 .. p1}, Ldy;->m()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v4, v2, v1}, Lee;->b(Lee;F)V

    :goto_b
    iget v1, v0, Ldy;->P:I

    if-lez v1, :cond_24

    iget-object v1, v0, Ldy;->z:Ldx;

    iget-object v1, v1, Ldx;->a:Lee;

    iget v0, v0, Ldy;->P:I

    invoke-virtual {v1, v2, v0}, Lee;->a(Lee;I)V

    :cond_24
    return-void
.end method

.method static a(Ldz;Ldq;Ldy;)V
    .locals 5

    iget-object v0, p0, Ldz;->F:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    sget v2, Ldy$a;->b:I

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, Ldy;->F:[I

    aget v0, v0, v1

    sget v1, Ldy$a;->d:I

    if-ne v0, v1, :cond_0

    iget-object v0, p2, Ldy;->v:Ldx;

    iget v0, v0, Ldx;->e:I

    invoke-virtual {p0}, Ldz;->l()I

    move-result v1

    iget-object v2, p2, Ldy;->x:Ldx;

    iget v2, v2, Ldx;->e:I

    sub-int/2addr v1, v2

    iget-object v2, p2, Ldy;->v:Ldx;

    iget-object v4, p2, Ldy;->v:Ldx;

    invoke-virtual {p1, v4}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v4

    iput-object v4, v2, Ldx;->i:Ldt;

    iget-object v2, p2, Ldy;->x:Ldx;

    iget-object v4, p2, Ldy;->x:Ldx;

    invoke-virtual {p1, v4}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v4

    iput-object v4, v2, Ldx;->i:Ldt;

    iget-object v2, p2, Ldy;->v:Ldx;

    iget-object v2, v2, Ldx;->i:Ldt;

    invoke-virtual {p1, v2, v0}, Ldq;->a(Ldt;I)V

    iget-object v2, p2, Ldy;->x:Ldx;

    iget-object v2, v2, Ldx;->i:Ldt;

    invoke-virtual {p1, v2, v1}, Ldq;->a(Ldt;I)V

    iput v3, p2, Ldy;->c:I

    invoke-virtual {p2, v0, v1}, Ldy;->c(II)V

    :cond_0
    iget-object v0, p0, Ldz;->F:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    sget v2, Ldy$a;->b:I

    if-eq v0, v2, :cond_3

    iget-object v0, p2, Ldy;->F:[I

    aget v0, v0, v1

    sget v1, Ldy$a;->d:I

    if-ne v0, v1, :cond_3

    iget-object v0, p2, Ldy;->w:Ldx;

    iget v0, v0, Ldx;->e:I

    invoke-virtual {p0}, Ldz;->m()I

    move-result p0

    iget-object v1, p2, Ldy;->y:Ldx;

    iget v1, v1, Ldx;->e:I

    sub-int/2addr p0, v1

    iget-object v1, p2, Ldy;->w:Ldx;

    iget-object v2, p2, Ldy;->w:Ldx;

    invoke-virtual {p1, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v2

    iput-object v2, v1, Ldx;->i:Ldt;

    iget-object v1, p2, Ldy;->y:Ldx;

    iget-object v2, p2, Ldy;->y:Ldx;

    invoke-virtual {p1, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v2

    iput-object v2, v1, Ldx;->i:Ldt;

    iget-object v1, p2, Ldy;->w:Ldx;

    iget-object v1, v1, Ldx;->i:Ldt;

    invoke-virtual {p1, v1, v0}, Ldq;->a(Ldt;I)V

    iget-object v1, p2, Ldy;->y:Ldx;

    iget-object v1, v1, Ldx;->i:Ldt;

    invoke-virtual {p1, v1, p0}, Ldq;->a(Ldt;I)V

    iget v1, p2, Ldy;->P:I

    if-gtz v1, :cond_1

    iget v1, p2, Ldy;->Y:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p2, Ldy;->z:Ldx;

    iget-object v2, p2, Ldy;->z:Ldx;

    invoke-virtual {p1, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v2

    iput-object v2, v1, Ldx;->i:Ldt;

    iget-object v1, p2, Ldy;->z:Ldx;

    iget-object v1, v1, Ldx;->i:Ldt;

    iget v2, p2, Ldy;->P:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, Ldq;->a(Ldt;I)V

    :cond_2
    iput v3, p2, Ldy;->d:I

    invoke-virtual {p2, v0, p0}, Ldy;->d(II)V

    :cond_3
    return-void
.end method

.method static a(Ldq;IILdw;)Z
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    iget-object v2, v1, Ldw;->a:Ldy;

    iget-object v3, v1, Ldw;->c:Ldy;

    iget-object v4, v1, Ldw;->b:Ldy;

    iget-object v5, v1, Ldw;->d:Ldy;

    iget-object v6, v1, Ldw;->e:Ldy;

    iget v1, v1, Ldw;->k:F

    sget v7, Ldy$a;->b:I

    const/4 v7, 0x2

    const/4 v9, 0x1

    if-nez p1, :cond_3

    iget v10, v6, Ldy;->ac:I

    if-nez v10, :cond_0

    move v10, v9

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    iget v11, v6, Ldy;->ac:I

    if-ne v11, v9, :cond_1

    move v11, v9

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    :goto_1
    iget v6, v6, Ldy;->ac:I

    if-ne v6, v7, :cond_2

    :goto_2
    move v6, v9

    goto :goto_5

    :cond_2
    const/4 v6, 0x0

    goto :goto_5

    :cond_3
    iget v10, v6, Ldy;->ad:I

    if-nez v10, :cond_4

    move v10, v9

    goto :goto_3

    :cond_4
    const/4 v10, 0x0

    :goto_3
    iget v11, v6, Ldy;->ad:I

    if-ne v11, v9, :cond_5

    move v11, v9

    goto :goto_4

    :cond_5
    const/4 v11, 0x0

    :goto_4
    iget v6, v6, Ldy;->ad:I

    if-ne v6, v7, :cond_2

    goto :goto_2

    :goto_5
    move-object v13, v2

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_6
    if-nez v12, :cond_12

    iget v8, v13, Ldy;->Y:I

    move/from16 v16, v12

    const/16 v12, 0x8

    if-eq v8, v12, :cond_8

    add-int/lit8 v7, v7, 0x1

    if-nez p1, :cond_6

    invoke-virtual {v13}, Ldy;->l()I

    move-result v8

    :goto_7
    int-to-float v8, v8

    add-float/2addr v14, v8

    goto :goto_8

    :cond_6
    invoke-virtual {v13}, Ldy;->m()I

    move-result v8

    goto :goto_7

    :goto_8
    if-eq v13, v4, :cond_7

    iget-object v8, v13, Ldy;->D:[Ldx;

    aget-object v8, v8, p2

    invoke-virtual {v8}, Ldx;->b()I

    move-result v8

    int-to-float v8, v8

    add-float/2addr v14, v8

    :cond_7
    iget-object v8, v13, Ldy;->D:[Ldx;

    aget-object v8, v8, p2

    invoke-virtual {v8}, Ldx;->b()I

    move-result v8

    int-to-float v8, v8

    add-float/2addr v15, v8

    iget-object v8, v13, Ldy;->D:[Ldx;

    add-int/lit8 v17, p2, 0x1

    aget-object v8, v8, v17

    invoke-virtual {v8}, Ldx;->b()I

    move-result v8

    int-to-float v8, v8

    add-float/2addr v15, v8

    :cond_8
    iget v8, v13, Ldy;->Y:I

    if-eq v8, v12, :cond_e

    iget-object v8, v13, Ldy;->F:[I

    aget v8, v8, p1

    sget v12, Ldy$a;->c:I

    if-ne v8, v12, :cond_e

    add-int/lit8 v9, v9, 0x1

    if-nez p1, :cond_b

    iget v8, v13, Ldy;->g:I

    if-eqz v8, :cond_9

    const/4 v8, 0x0

    return v8

    :cond_9
    const/4 v8, 0x0

    iget v12, v13, Ldy;->j:I

    if-nez v12, :cond_a

    iget v12, v13, Ldy;->k:I

    if-eqz v12, :cond_e

    :cond_a
    return v8

    :cond_b
    const/4 v8, 0x0

    iget v12, v13, Ldy;->h:I

    if-eqz v12, :cond_c

    return v8

    :cond_c
    iget v12, v13, Ldy;->m:I

    if-nez v12, :cond_d

    iget v12, v13, Ldy;->n:I

    if-eqz v12, :cond_e

    :cond_d
    return v8

    :cond_e
    iget-object v8, v13, Ldy;->D:[Ldx;

    add-int/lit8 v12, p2, 0x1

    aget-object v8, v8, v12

    iget-object v8, v8, Ldx;->d:Ldx;

    if-eqz v8, :cond_10

    iget-object v8, v8, Ldx;->b:Ldy;

    iget-object v12, v8, Ldy;->D:[Ldx;

    aget-object v12, v12, p2

    iget-object v12, v12, Ldx;->d:Ldx;

    if-eqz v12, :cond_10

    iget-object v12, v8, Ldy;->D:[Ldx;

    aget-object v12, v12, p2

    iget-object v12, v12, Ldx;->d:Ldx;

    iget-object v12, v12, Ldx;->b:Ldy;

    if-eq v12, v13, :cond_f

    goto :goto_9

    :cond_f
    move-object/from16 v18, v8

    goto :goto_a

    :cond_10
    :goto_9
    const/16 v18, 0x0

    :goto_a
    if-eqz v18, :cond_11

    move/from16 v12, v16

    move-object/from16 v13, v18

    goto/16 :goto_6

    :cond_11
    const/4 v12, 0x1

    goto/16 :goto_6

    :cond_12
    iget-object v8, v2, Ldy;->D:[Ldx;

    aget-object v8, v8, p2

    iget-object v8, v8, Ldx;->a:Lee;

    iget-object v3, v3, Ldy;->D:[Ldx;

    add-int/lit8 v12, p2, 0x1

    aget-object v3, v3, v12

    iget-object v3, v3, Ldx;->a:Lee;

    move-object/from16 v19, v2

    iget-object v2, v8, Lee;->c:Lee;

    if-eqz v2, :cond_36

    iget-object v2, v3, Lee;->c:Lee;

    if-nez v2, :cond_13

    goto/16 :goto_1d

    :cond_13
    iget-object v2, v8, Lee;->c:Lee;

    iget v2, v2, Lee;->i:I

    const/4 v0, 0x1

    if-eq v2, v0, :cond_14

    iget-object v2, v3, Lee;->c:Lee;

    iget v2, v2, Lee;->i:I

    if-eq v2, v0, :cond_14

    const/4 v0, 0x0

    return v0

    :cond_14
    const/4 v0, 0x0

    if-lez v9, :cond_15

    if-eq v9, v7, :cond_15

    return v0

    :cond_15
    if-nez v6, :cond_17

    if-nez v10, :cond_17

    if-eqz v11, :cond_16

    goto :goto_b

    :cond_16
    const/4 v0, 0x0

    goto :goto_d

    :cond_17
    :goto_b
    if-eqz v4, :cond_18

    iget-object v0, v4, Ldy;->D:[Ldx;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Ldx;->b()I

    move-result v0

    int-to-float v0, v0

    goto :goto_c

    :cond_18
    const/4 v0, 0x0

    :goto_c
    if-eqz v5, :cond_19

    iget-object v2, v5, Ldy;->D:[Ldx;

    aget-object v2, v2, v12

    invoke-virtual {v2}, Ldx;->b()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    :cond_19
    :goto_d
    iget-object v2, v8, Lee;->c:Lee;

    iget v2, v2, Lee;->f:F

    iget-object v3, v3, Lee;->c:Lee;

    iget v3, v3, Lee;->f:F

    cmpg-float v16, v2, v3

    if-gez v16, :cond_1a

    sub-float/2addr v3, v2

    :goto_e
    sub-float/2addr v3, v14

    goto :goto_f

    :cond_1a
    sub-float v3, v2, v3

    goto :goto_e

    :goto_f
    const-wide/16 v16, 0x1

    if-lez v9, :cond_23

    if-ne v9, v7, :cond_23

    iget-object v6, v13, Ldy;->G:Ldy;

    if-eqz v6, :cond_1b

    iget-object v6, v13, Ldy;->G:Ldy;

    iget-object v6, v6, Ldy;->F:[I

    aget v6, v6, p1

    sget v7, Ldy$a;->b:I

    if-ne v6, v7, :cond_1b

    const/4 v6, 0x0

    return v6

    :cond_1b
    add-float/2addr v3, v14

    sub-float/2addr v3, v15

    if-eqz v10, :cond_1c

    sub-float/2addr v15, v0

    sub-float/2addr v3, v15

    :cond_1c
    if-eqz v10, :cond_1d

    iget-object v0, v4, Ldy;->D:[Ldx;

    aget-object v0, v0, v12

    invoke-virtual {v0}, Ldx;->b()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v2, v0

    iget-object v0, v4, Ldy;->ai:[Ldy;

    aget-object v0, v0, p1

    if-eqz v0, :cond_1d

    iget-object v0, v0, Ldy;->D:[Ldx;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Ldx;->b()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v2, v0

    :cond_1d
    :goto_10
    if-eqz v4, :cond_22

    sget-object v0, Ldq;->h:Ldr;

    if-eqz v0, :cond_1e

    sget-object v0, Ldq;->h:Ldr;

    iget-wide v6, v0, Ldr;->B:J

    sub-long v6, v6, v16

    iput-wide v6, v0, Ldr;->B:J

    sget-object v0, Ldq;->h:Ldr;

    iget-wide v6, v0, Ldr;->s:J

    add-long v6, v6, v16

    iput-wide v6, v0, Ldr;->s:J

    sget-object v0, Ldq;->h:Ldr;

    iget-wide v6, v0, Ldr;->y:J

    add-long v6, v6, v16

    iput-wide v6, v0, Ldr;->y:J

    :cond_1e
    iget-object v0, v4, Ldy;->ai:[Ldy;

    aget-object v0, v0, p1

    if-nez v0, :cond_20

    if-ne v4, v5, :cond_1f

    goto :goto_11

    :cond_1f
    const/4 v7, 0x0

    move-object/from16 v13, p0

    goto :goto_12

    :cond_20
    :goto_11
    int-to-float v6, v9

    div-float v6, v3, v6

    const/4 v7, 0x0

    cmpl-float v10, v1, v7

    if-lez v10, :cond_21

    iget-object v6, v4, Ldy;->ag:[F

    aget v6, v6, p1

    mul-float/2addr v6, v3

    div-float/2addr v6, v1

    :cond_21
    iget-object v10, v4, Ldy;->D:[Ldx;

    aget-object v10, v10, p2

    invoke-virtual {v10}, Ldx;->b()I

    move-result v10

    int-to-float v10, v10

    add-float/2addr v2, v10

    iget-object v10, v4, Ldy;->D:[Ldx;

    aget-object v10, v10, p2

    iget-object v10, v10, Ldx;->a:Lee;

    iget-object v11, v8, Lee;->e:Lee;

    invoke-virtual {v10, v11, v2}, Lee;->a(Lee;F)V

    iget-object v10, v4, Ldy;->D:[Ldx;

    aget-object v10, v10, v12

    iget-object v10, v10, Ldx;->a:Lee;

    iget-object v11, v8, Lee;->e:Lee;

    add-float/2addr v2, v6

    invoke-virtual {v10, v11, v2}, Lee;->a(Lee;F)V

    iget-object v6, v4, Ldy;->D:[Ldx;

    aget-object v6, v6, p2

    iget-object v6, v6, Ldx;->a:Lee;

    move-object/from16 v13, p0

    invoke-virtual {v6, v13}, Lee;->a(Ldq;)V

    iget-object v6, v4, Ldy;->D:[Ldx;

    aget-object v6, v6, v12

    iget-object v6, v6, Ldx;->a:Lee;

    invoke-virtual {v6, v13}, Lee;->a(Ldq;)V

    iget-object v4, v4, Ldy;->D:[Ldx;

    aget-object v4, v4, v12

    invoke-virtual {v4}, Ldx;->b()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v2, v4

    :goto_12
    move-object v4, v0

    goto :goto_10

    :cond_22
    const/4 v0, 0x1

    return v0

    :cond_23
    move-object/from16 v13, p0

    cmpg-float v1, v3, v14

    if-gez v1, :cond_24

    const/4 v1, 0x0

    return v1

    :cond_24
    if-eqz v6, :cond_2a

    sub-float/2addr v3, v0

    move-object/from16 v0, v19

    iget v0, v0, Ldy;->V:F

    mul-float/2addr v3, v0

    add-float/2addr v2, v3

    :goto_13
    if-eqz v4, :cond_29

    sget-object v0, Ldq;->h:Ldr;

    if-eqz v0, :cond_25

    sget-object v0, Ldq;->h:Ldr;

    iget-wide v6, v0, Ldr;->B:J

    sub-long v6, v6, v16

    iput-wide v6, v0, Ldr;->B:J

    sget-object v0, Ldq;->h:Ldr;

    iget-wide v6, v0, Ldr;->s:J

    add-long v6, v6, v16

    iput-wide v6, v0, Ldr;->s:J

    sget-object v0, Ldq;->h:Ldr;

    iget-wide v6, v0, Ldr;->y:J

    add-long v6, v6, v16

    iput-wide v6, v0, Ldr;->y:J

    :cond_25
    iget-object v0, v4, Ldy;->ai:[Ldy;

    aget-object v0, v0, p1

    if-nez v0, :cond_26

    if-ne v4, v5, :cond_28

    :cond_26
    if-nez p1, :cond_27

    invoke-virtual {v4}, Ldy;->l()I

    move-result v1

    :goto_14
    int-to-float v1, v1

    goto :goto_15

    :cond_27
    invoke-virtual {v4}, Ldy;->m()I

    move-result v1

    goto :goto_14

    :goto_15
    iget-object v3, v4, Ldy;->D:[Ldx;

    aget-object v3, v3, p2

    invoke-virtual {v3}, Ldx;->b()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    iget-object v3, v4, Ldy;->D:[Ldx;

    aget-object v3, v3, p2

    iget-object v3, v3, Ldx;->a:Lee;

    iget-object v6, v8, Lee;->e:Lee;

    invoke-virtual {v3, v6, v2}, Lee;->a(Lee;F)V

    iget-object v3, v4, Ldy;->D:[Ldx;

    aget-object v3, v3, v12

    iget-object v3, v3, Ldx;->a:Lee;

    iget-object v6, v8, Lee;->e:Lee;

    add-float/2addr v2, v1

    invoke-virtual {v3, v6, v2}, Lee;->a(Lee;F)V

    iget-object v1, v4, Ldy;->D:[Ldx;

    aget-object v1, v1, p2

    iget-object v1, v1, Ldx;->a:Lee;

    invoke-virtual {v1, v13}, Lee;->a(Ldq;)V

    iget-object v1, v4, Ldy;->D:[Ldx;

    aget-object v1, v1, v12

    iget-object v1, v1, Ldx;->a:Lee;

    invoke-virtual {v1, v13}, Lee;->a(Ldq;)V

    iget-object v1, v4, Ldy;->D:[Ldx;

    aget-object v1, v1, v12

    invoke-virtual {v1}, Ldx;->b()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v2, v1

    :cond_28
    move-object v4, v0

    goto :goto_13

    :cond_29
    const/4 v0, 0x1

    return v0

    :cond_2a
    if-nez v10, :cond_2b

    if-eqz v11, :cond_29

    :cond_2b
    if-eqz v10, :cond_2c

    :goto_16
    sub-float/2addr v3, v0

    goto :goto_17

    :cond_2c
    if-eqz v11, :cond_2d

    goto :goto_16

    :cond_2d
    :goto_17
    add-int/lit8 v0, v7, 0x1

    int-to-float v0, v0

    div-float v0, v3, v0

    if-eqz v11, :cond_2f

    const/4 v1, 0x1

    if-le v7, v1, :cond_2e

    add-int/lit8 v0, v7, -0x1

    int-to-float v0, v0

    :goto_18
    div-float v0, v3, v0

    goto :goto_19

    :cond_2e
    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_18

    :cond_2f
    :goto_19
    add-float v1, v2, v0

    if-eqz v11, :cond_30

    const/4 v3, 0x1

    if-le v7, v3, :cond_30

    iget-object v1, v4, Ldy;->D:[Ldx;

    aget-object v1, v1, p2

    invoke-virtual {v1}, Ldx;->b()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v1, v2

    :cond_30
    if-eqz v10, :cond_31

    if-eqz v4, :cond_31

    iget-object v2, v4, Ldy;->D:[Ldx;

    aget-object v2, v2, p2

    invoke-virtual {v2}, Ldx;->b()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    :cond_31
    :goto_1a
    if-eqz v4, :cond_29

    sget-object v2, Ldq;->h:Ldr;

    if-eqz v2, :cond_32

    sget-object v2, Ldq;->h:Ldr;

    iget-wide v6, v2, Ldr;->B:J

    sub-long v6, v6, v16

    iput-wide v6, v2, Ldr;->B:J

    sget-object v2, Ldq;->h:Ldr;

    iget-wide v6, v2, Ldr;->s:J

    add-long v6, v6, v16

    iput-wide v6, v2, Ldr;->s:J

    sget-object v2, Ldq;->h:Ldr;

    iget-wide v6, v2, Ldr;->y:J

    add-long v6, v6, v16

    iput-wide v6, v2, Ldr;->y:J

    :cond_32
    iget-object v2, v4, Ldy;->ai:[Ldy;

    aget-object v2, v2, p1

    if-nez v2, :cond_33

    if-ne v4, v5, :cond_35

    :cond_33
    if-nez p1, :cond_34

    invoke-virtual {v4}, Ldy;->l()I

    move-result v3

    :goto_1b
    int-to-float v3, v3

    goto :goto_1c

    :cond_34
    invoke-virtual {v4}, Ldy;->m()I

    move-result v3

    goto :goto_1b

    :goto_1c
    iget-object v6, v4, Ldy;->D:[Ldx;

    aget-object v6, v6, p2

    iget-object v6, v6, Ldx;->a:Lee;

    iget-object v7, v8, Lee;->e:Lee;

    invoke-virtual {v6, v7, v1}, Lee;->a(Lee;F)V

    iget-object v6, v4, Ldy;->D:[Ldx;

    aget-object v6, v6, v12

    iget-object v6, v6, Ldx;->a:Lee;

    iget-object v7, v8, Lee;->e:Lee;

    add-float v9, v1, v3

    invoke-virtual {v6, v7, v9}, Lee;->a(Lee;F)V

    iget-object v6, v4, Ldy;->D:[Ldx;

    aget-object v6, v6, p2

    iget-object v6, v6, Ldx;->a:Lee;

    invoke-virtual {v6, v13}, Lee;->a(Ldq;)V

    iget-object v4, v4, Ldy;->D:[Ldx;

    aget-object v4, v4, v12

    iget-object v4, v4, Ldx;->a:Lee;

    invoke-virtual {v4, v13}, Lee;->a(Ldq;)V

    add-float/2addr v3, v0

    add-float/2addr v1, v3

    :cond_35
    move-object v4, v2

    goto :goto_1a

    return v0

    :cond_36
    :goto_1d
    const/4 v0, 0x0

    return v0
.end method

.method private static a(Ldy;I)Z
    .locals 3

    iget-object v0, p0, Ldy;->F:[I

    aget v0, v0, p1

    sget v1, Ldy$a;->c:I

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    iget v0, p0, Ldy;->J:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-object p0, p0, Ldy;->F:[I

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    aget p0, p0, v1

    sget p1, Ldy$a;->c:I

    if-ne p0, p1, :cond_2

    :cond_2
    return v2

    :cond_3
    if-nez p1, :cond_6

    iget p1, p0, Ldy;->g:I

    if-eqz p1, :cond_4

    return v2

    :cond_4
    iget p1, p0, Ldy;->j:I

    if-nez p1, :cond_5

    iget p0, p0, Ldy;->k:I

    if-eqz p0, :cond_8

    :cond_5
    return v2

    :cond_6
    iget p1, p0, Ldy;->h:I

    if-eqz p1, :cond_7

    return v2

    :cond_7
    iget p1, p0, Ldy;->m:I

    if-nez p1, :cond_9

    iget p0, p0, Ldy;->n:I

    if-eqz p0, :cond_8

    return v2

    :cond_8
    return v1

    :cond_9
    return v2
.end method
