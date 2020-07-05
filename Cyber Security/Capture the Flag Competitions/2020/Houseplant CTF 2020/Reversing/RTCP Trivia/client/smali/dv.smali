.class final Ldv;
.super Ljava/lang/Object;


# direct methods
.method static a(Ldz;Ldq;I)V
    .locals 47

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v11, p2

    if-nez v11, :cond_0

    iget v1, v0, Ldz;->ap:I

    iget-object v2, v0, Ldz;->as:[Ldw;

    move v9, v1

    move-object v14, v2

    const/4 v15, 0x0

    goto :goto_0

    :cond_0
    iget v1, v0, Ldz;->aq:I

    iget-object v2, v0, Ldz;->ar:[Ldw;

    move v9, v1

    move-object v14, v2

    const/4 v15, 0x2

    :goto_0
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v9, :cond_52

    aget-object v1, v14, v8

    iget-boolean v2, v1, Ldw;->o:Z

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ldw;->a()V

    :cond_1
    const/4 v2, 0x1

    iput-boolean v2, v1, Ldw;->o:Z

    const/4 v7, 0x4

    invoke-virtual {v0, v7}, Ldz;->j(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v10, v11, v15, v1}, Lec;->a(Ldq;IILdw;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v40, v8

    move/from16 v17, v9

    move-object/from16 v31, v14

    const/16 v16, 0x0

    goto/16 :goto_39

    :cond_3
    :goto_2
    iget-object v6, v1, Ldw;->a:Ldy;

    iget-object v5, v1, Ldw;->c:Ldy;

    iget-object v4, v1, Ldw;->b:Ldy;

    iget-object v3, v1, Ldw;->d:Ldy;

    iget-object v7, v1, Ldw;->e:Ldy;

    iget v13, v1, Ldw;->k:F

    iget-object v12, v0, Ldz;->F:[I

    aget v12, v12, v11

    sget v2, Ldy$a;->b:I

    if-ne v12, v2, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    if-nez v11, :cond_8

    iget v12, v7, Ldy;->ac:I

    if-nez v12, :cond_5

    move/from16 v20, v8

    const/4 v12, 0x1

    goto :goto_4

    :cond_5
    move/from16 v20, v8

    const/4 v12, 0x0

    :goto_4
    iget v8, v7, Ldy;->ac:I

    move/from16 v21, v9

    const/4 v9, 0x1

    if-ne v8, v9, :cond_6

    const/4 v8, 0x1

    goto :goto_5

    :cond_6
    const/4 v8, 0x0

    :goto_5
    iget v9, v7, Ldy;->ac:I

    move/from16 v22, v8

    const/4 v8, 0x2

    if-ne v9, v8, :cond_7

    const/4 v8, 0x1

    goto :goto_6

    :cond_7
    const/4 v8, 0x0

    :goto_6
    move-object v9, v6

    move/from16 v18, v8

    move/from16 v23, v12

    const/4 v8, 0x0

    goto :goto_a

    :cond_8
    move/from16 v20, v8

    move/from16 v21, v9

    iget v8, v7, Ldy;->ad:I

    if-nez v8, :cond_9

    const/4 v12, 0x1

    goto :goto_7

    :cond_9
    const/4 v12, 0x0

    :goto_7
    iget v8, v7, Ldy;->ad:I

    const/4 v9, 0x1

    if-ne v8, v9, :cond_a

    const/4 v8, 0x1

    goto :goto_8

    :cond_a
    const/4 v8, 0x0

    :goto_8
    iget v9, v7, Ldy;->ad:I

    move/from16 v23, v12

    const/4 v12, 0x2

    if-ne v9, v12, :cond_b

    const/4 v9, 0x1

    goto :goto_9

    :cond_b
    const/4 v9, 0x0

    :goto_9
    move/from16 v22, v8

    move/from16 v18, v9

    const/4 v8, 0x0

    move-object v9, v6

    :goto_a
    const/16 v25, 0x0

    if-nez v8, :cond_18

    iget-object v12, v9, Ldy;->D:[Ldx;

    aget-object v12, v12, v15

    if-nez v2, :cond_d

    if-eqz v18, :cond_c

    goto :goto_b

    :cond_c
    const/16 v27, 0x4

    goto :goto_c

    :cond_d
    :goto_b
    const/16 v27, 0x1

    :goto_c
    invoke-virtual {v12}, Ldx;->b()I

    move-result v28

    move/from16 v29, v8

    iget-object v8, v12, Ldx;->d:Ldx;

    if-eqz v8, :cond_e

    if-eq v9, v6, :cond_e

    iget-object v8, v12, Ldx;->d:Ldx;

    invoke-virtual {v8}, Ldx;->b()I

    move-result v8

    add-int v28, v28, v8

    :cond_e
    move/from16 v8, v28

    if-eqz v18, :cond_f

    if-eq v9, v6, :cond_f

    if-eq v9, v4, :cond_f

    move/from16 v30, v13

    move-object/from16 v31, v14

    const/4 v13, 0x6

    goto :goto_d

    :cond_f
    if-eqz v23, :cond_10

    if-eqz v2, :cond_10

    move/from16 v30, v13

    move-object/from16 v31, v14

    const/4 v13, 0x4

    goto :goto_d

    :cond_10
    move/from16 v30, v13

    move-object/from16 v31, v14

    move/from16 v13, v27

    :goto_d
    iget-object v14, v12, Ldx;->d:Ldx;

    if-eqz v14, :cond_12

    if-ne v9, v4, :cond_11

    iget-object v14, v12, Ldx;->i:Ldt;

    move-object/from16 v32, v7

    iget-object v7, v12, Ldx;->d:Ldx;

    iget-object v7, v7, Ldx;->i:Ldt;

    move-object/from16 v33, v6

    const/4 v6, 0x5

    invoke-virtual {v10, v14, v7, v8, v6}, Ldq;->a(Ldt;Ldt;II)V

    goto :goto_e

    :cond_11
    move-object/from16 v33, v6

    move-object/from16 v32, v7

    iget-object v6, v12, Ldx;->i:Ldt;

    iget-object v7, v12, Ldx;->d:Ldx;

    iget-object v7, v7, Ldx;->i:Ldt;

    const/4 v14, 0x6

    invoke-virtual {v10, v6, v7, v8, v14}, Ldq;->a(Ldt;Ldt;II)V

    :goto_e
    iget-object v6, v12, Ldx;->i:Ldt;

    iget-object v7, v12, Ldx;->d:Ldx;

    iget-object v7, v7, Ldx;->i:Ldt;

    invoke-virtual {v10, v6, v7, v8, v13}, Ldq;->c(Ldt;Ldt;II)Ldn;

    goto :goto_f

    :cond_12
    move-object/from16 v33, v6

    move-object/from16 v32, v7

    :goto_f
    if-eqz v2, :cond_14

    iget v6, v9, Ldy;->Y:I

    const/16 v7, 0x8

    if-eq v6, v7, :cond_13

    iget-object v6, v9, Ldy;->F:[I

    aget v6, v6, v11

    sget v7, Ldy$a;->c:I

    if-ne v6, v7, :cond_13

    iget-object v6, v9, Ldy;->D:[Ldx;

    add-int/lit8 v7, v15, 0x1

    aget-object v6, v6, v7

    iget-object v6, v6, Ldx;->i:Ldt;

    iget-object v7, v9, Ldy;->D:[Ldx;

    aget-object v7, v7, v15

    iget-object v7, v7, Ldx;->i:Ldt;

    const/4 v8, 0x0

    const/4 v12, 0x5

    invoke-virtual {v10, v6, v7, v8, v12}, Ldq;->a(Ldt;Ldt;II)V

    goto :goto_10

    :cond_13
    const/4 v8, 0x0

    :goto_10
    iget-object v6, v9, Ldy;->D:[Ldx;

    aget-object v6, v6, v15

    iget-object v6, v6, Ldx;->i:Ldt;

    iget-object v7, v0, Ldz;->D:[Ldx;

    aget-object v7, v7, v15

    iget-object v7, v7, Ldx;->i:Ldt;

    const/4 v12, 0x6

    invoke-virtual {v10, v6, v7, v8, v12}, Ldq;->a(Ldt;Ldt;II)V

    :cond_14
    iget-object v6, v9, Ldy;->D:[Ldx;

    add-int/lit8 v7, v15, 0x1

    aget-object v6, v6, v7

    iget-object v6, v6, Ldx;->d:Ldx;

    if-eqz v6, :cond_16

    iget-object v6, v6, Ldx;->b:Ldy;

    iget-object v7, v6, Ldy;->D:[Ldx;

    aget-object v7, v7, v15

    iget-object v7, v7, Ldx;->d:Ldx;

    if-eqz v7, :cond_16

    iget-object v7, v6, Ldy;->D:[Ldx;

    aget-object v7, v7, v15

    iget-object v7, v7, Ldx;->d:Ldx;

    iget-object v7, v7, Ldx;->b:Ldy;

    if-eq v7, v9, :cond_15

    goto :goto_11

    :cond_15
    move-object/from16 v25, v6

    :cond_16
    :goto_11
    if-eqz v25, :cond_17

    move-object/from16 v9, v25

    move/from16 v8, v29

    move/from16 v13, v30

    move-object/from16 v14, v31

    move-object/from16 v7, v32

    move-object/from16 v6, v33

    goto/16 :goto_a

    :cond_17
    move/from16 v13, v30

    move-object/from16 v14, v31

    move-object/from16 v7, v32

    move-object/from16 v6, v33

    const/4 v8, 0x1

    goto/16 :goto_a

    :cond_18
    move-object/from16 v33, v6

    move-object/from16 v32, v7

    move/from16 v30, v13

    move-object/from16 v31, v14

    if-eqz v3, :cond_19

    iget-object v6, v5, Ldy;->D:[Ldx;

    add-int/lit8 v7, v15, 0x1

    aget-object v6, v6, v7

    iget-object v6, v6, Ldx;->d:Ldx;

    if-eqz v6, :cond_19

    iget-object v6, v3, Ldy;->D:[Ldx;

    aget-object v6, v6, v7

    iget-object v8, v6, Ldx;->i:Ldt;

    iget-object v9, v5, Ldy;->D:[Ldx;

    aget-object v7, v9, v7

    iget-object v7, v7, Ldx;->d:Ldx;

    iget-object v7, v7, Ldx;->i:Ldt;

    invoke-virtual {v6}, Ldx;->b()I

    move-result v6

    neg-int v6, v6

    const/4 v9, 0x5

    invoke-virtual {v10, v8, v7, v6, v9}, Ldq;->b(Ldt;Ldt;II)V

    :cond_19
    if-eqz v2, :cond_1a

    iget-object v2, v0, Ldz;->D:[Ldx;

    add-int/lit8 v6, v15, 0x1

    aget-object v2, v2, v6

    iget-object v2, v2, Ldx;->i:Ldt;

    iget-object v7, v5, Ldy;->D:[Ldx;

    aget-object v7, v7, v6

    iget-object v7, v7, Ldx;->i:Ldt;

    iget-object v8, v5, Ldy;->D:[Ldx;

    aget-object v6, v8, v6

    invoke-virtual {v6}, Ldx;->b()I

    move-result v6

    const/4 v8, 0x6

    invoke-virtual {v10, v2, v7, v6, v8}, Ldq;->a(Ldt;Ldt;II)V

    :cond_1a
    iget-object v2, v1, Ldw;->h:Ljava/util/ArrayList;

    if-eqz v2, :cond_24

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v9, 0x1

    if-le v6, v9, :cond_24

    iget-boolean v7, v1, Ldw;->l:Z

    if-eqz v7, :cond_1b

    iget-boolean v7, v1, Ldw;->n:Z

    if-nez v7, :cond_1b

    iget v7, v1, Ldw;->j:I

    int-to-float v13, v7

    goto :goto_12

    :cond_1b
    move/from16 v13, v30

    :goto_12
    const/4 v7, 0x0

    move v14, v7

    move-object/from16 v12, v25

    const/4 v8, 0x0

    :goto_13
    if-ge v8, v6, :cond_24

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v9, v19

    check-cast v9, Ldy;

    iget-object v0, v9, Ldy;->ag:[F

    aget v0, v0, v11

    cmpg-float v19, v0, v7

    if-gez v19, :cond_1d

    iget-boolean v0, v1, Ldw;->n:Z

    if-eqz v0, :cond_1c

    iget-object v0, v9, Ldy;->D:[Ldx;

    add-int/lit8 v7, v15, 0x1

    aget-object v0, v0, v7

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v7, v9, Ldy;->D:[Ldx;

    aget-object v7, v7, v15

    iget-object v7, v7, Ldx;->i:Ldt;

    move/from16 v35, v6

    const/4 v6, 0x4

    const/4 v9, 0x0

    invoke-virtual {v10, v0, v7, v9, v6}, Ldq;->c(Ldt;Ldt;II)Ldn;

    const/4 v6, 0x6

    goto :goto_15

    :cond_1c
    move/from16 v35, v6

    const/4 v6, 0x4

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_14

    :cond_1d
    move/from16 v35, v6

    const/4 v6, 0x4

    :goto_14
    const/16 v16, 0x0

    cmpl-float v19, v0, v16

    if-nez v19, :cond_1e

    iget-object v0, v9, Ldy;->D:[Ldx;

    add-int/lit8 v7, v15, 0x1

    aget-object v0, v0, v7

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v7, v9, Ldy;->D:[Ldx;

    aget-object v7, v7, v15

    iget-object v7, v7, Ldx;->i:Ldt;

    const/4 v6, 0x6

    const/4 v9, 0x0

    invoke-virtual {v10, v0, v7, v9, v6}, Ldq;->c(Ldt;Ldt;II)Ldn;

    :goto_15
    move-object/from16 v38, v1

    move-object/from16 v36, v2

    move/from16 v16, v9

    const/16 v17, 0x0

    goto/16 :goto_1a

    :cond_1e
    const/4 v6, 0x6

    const/16 v16, 0x0

    if-eqz v12, :cond_23

    iget-object v6, v12, Ldy;->D:[Ldx;

    aget-object v6, v6, v15

    iget-object v6, v6, Ldx;->i:Ldt;

    iget-object v12, v12, Ldy;->D:[Ldx;

    add-int/lit8 v17, v15, 0x1

    aget-object v12, v12, v17

    iget-object v12, v12, Ldx;->i:Ldt;

    iget-object v7, v9, Ldy;->D:[Ldx;

    aget-object v7, v7, v15

    iget-object v7, v7, Ldx;->i:Ldt;

    move-object/from16 v36, v2

    iget-object v2, v9, Ldy;->D:[Ldx;

    aget-object v2, v2, v17

    iget-object v2, v2, Ldx;->i:Ldt;

    move-object/from16 v37, v9

    invoke-virtual/range {p1 .. p1}, Ldq;->c()Ldn;

    move-result-object v9

    move-object/from16 v38, v1

    const/4 v1, 0x0

    iput v1, v9, Ldn;->b:F

    cmpl-float v17, v13, v1

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v17, :cond_22

    cmpl-float v17, v14, v0

    if-nez v17, :cond_1f

    goto :goto_17

    :cond_1f
    const/16 v17, 0x0

    cmpl-float v26, v14, v17

    if-nez v26, :cond_20

    iget-object v2, v9, Ldn;->d:Ldm;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v2, v6, v7}, Ldm;->a(Ldt;F)V

    iget-object v2, v9, Ldn;->d:Ldm;

    invoke-virtual {v2, v12, v1}, Ldm;->a(Ldt;F)V

    :goto_16
    move/from16 v39, v0

    goto :goto_18

    :cond_20
    const/high16 v1, 0x3f800000    # 1.0f

    if-nez v19, :cond_21

    iget-object v6, v9, Ldn;->d:Ldm;

    invoke-virtual {v6, v7, v1}, Ldm;->a(Ldt;F)V

    iget-object v1, v9, Ldn;->d:Ldm;

    const/high16 v6, -0x40800000    # -1.0f

    invoke-virtual {v1, v2, v6}, Ldm;->a(Ldt;F)V

    goto :goto_16

    :cond_21
    div-float/2addr v14, v13

    div-float v19, v0, v13

    div-float v14, v14, v19

    move/from16 v39, v0

    iget-object v0, v9, Ldn;->d:Ldm;

    invoke-virtual {v0, v6, v1}, Ldm;->a(Ldt;F)V

    iget-object v0, v9, Ldn;->d:Ldm;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v0, v12, v1}, Ldm;->a(Ldt;F)V

    iget-object v0, v9, Ldn;->d:Ldm;

    invoke-virtual {v0, v2, v14}, Ldm;->a(Ldt;F)V

    iget-object v0, v9, Ldn;->d:Ldm;

    neg-float v1, v14

    invoke-virtual {v0, v7, v1}, Ldm;->a(Ldt;F)V

    goto :goto_18

    :cond_22
    :goto_17
    move/from16 v39, v0

    move v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    iget-object v14, v9, Ldn;->d:Ldm;

    invoke-virtual {v14, v6, v1}, Ldm;->a(Ldt;F)V

    iget-object v6, v9, Ldn;->d:Ldm;

    invoke-virtual {v6, v12, v0}, Ldm;->a(Ldt;F)V

    iget-object v6, v9, Ldn;->d:Ldm;

    invoke-virtual {v6, v2, v1}, Ldm;->a(Ldt;F)V

    iget-object v1, v9, Ldn;->d:Ldm;

    invoke-virtual {v1, v7, v0}, Ldm;->a(Ldt;F)V

    :goto_18
    invoke-virtual {v10, v9}, Ldq;->a(Ldn;)V

    goto :goto_19

    :cond_23
    move/from16 v39, v0

    move-object/from16 v38, v1

    move-object/from16 v36, v2

    move-object/from16 v37, v9

    const/16 v17, 0x0

    :goto_19
    move-object/from16 v12, v37

    move/from16 v14, v39

    :goto_1a
    add-int/lit8 v8, v8, 0x1

    move/from16 v7, v17

    move/from16 v6, v35

    move-object/from16 v2, v36

    move-object/from16 v1, v38

    move-object/from16 v0, p0

    const/4 v9, 0x1

    goto/16 :goto_13

    :cond_24
    move-object/from16 v38, v1

    const/16 v16, 0x0

    if-eqz v4, :cond_2b

    if-eq v4, v3, :cond_25

    if-eqz v18, :cond_2b

    :cond_25
    move-object/from16 v0, v33

    iget-object v1, v0, Ldy;->D:[Ldx;

    aget-object v1, v1, v15

    iget-object v2, v5, Ldy;->D:[Ldx;

    add-int/lit8 v6, v15, 0x1

    aget-object v2, v2, v6

    iget-object v7, v0, Ldy;->D:[Ldx;

    aget-object v7, v7, v15

    iget-object v7, v7, Ldx;->d:Ldx;

    if-eqz v7, :cond_26

    iget-object v0, v0, Ldy;->D:[Ldx;

    aget-object v0, v0, v15

    iget-object v0, v0, Ldx;->d:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    goto :goto_1b

    :cond_26
    move-object/from16 v0, v25

    :goto_1b
    iget-object v7, v5, Ldy;->D:[Ldx;

    aget-object v7, v7, v6

    iget-object v7, v7, Ldx;->d:Ldx;

    if-eqz v7, :cond_27

    iget-object v7, v5, Ldy;->D:[Ldx;

    aget-object v7, v7, v6

    iget-object v7, v7, Ldx;->d:Ldx;

    iget-object v7, v7, Ldx;->i:Ldt;

    goto :goto_1c

    :cond_27
    move-object/from16 v7, v25

    :goto_1c
    if-ne v4, v3, :cond_28

    iget-object v1, v4, Ldy;->D:[Ldx;

    aget-object v1, v1, v15

    iget-object v2, v4, Ldy;->D:[Ldx;

    aget-object v2, v2, v6

    :cond_28
    if-eqz v0, :cond_2a

    if-eqz v7, :cond_2a

    if-nez v11, :cond_29

    move-object/from16 v6, v32

    iget v6, v6, Ldy;->V:F

    goto :goto_1d

    :cond_29
    move-object/from16 v6, v32

    iget v6, v6, Ldy;->W:F

    :goto_1d
    invoke-virtual {v1}, Ldx;->b()I

    move-result v8

    invoke-virtual {v2}, Ldx;->b()I

    move-result v9

    iget-object v12, v1, Ldx;->i:Ldt;

    iget-object v13, v2, Ldx;->i:Ldt;

    const/4 v14, 0x5

    move-object v1, v10

    move-object v2, v12

    move-object v12, v3

    move-object v3, v0

    move-object v0, v4

    move v4, v8

    move-object v8, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v13

    move-object v13, v8

    move/from16 v40, v20

    move v8, v9

    move/from16 v17, v21

    move v9, v14

    invoke-virtual/range {v1 .. v9}, Ldq;->a(Ldt;Ldt;IFLdt;Ldt;II)V

    goto :goto_1e

    :cond_2a
    move-object v12, v3

    move-object v0, v4

    move-object v13, v5

    move/from16 v40, v20

    move/from16 v17, v21

    :goto_1e
    move-object v14, v0

    goto/16 :goto_35

    :cond_2b
    move-object v12, v3

    move-object v14, v4

    move-object v13, v5

    move/from16 v40, v20

    move/from16 v17, v21

    move-object/from16 v0, v33

    if-eqz v23, :cond_3b

    if-eqz v14, :cond_3b

    move-object/from16 v1, v38

    iget v2, v1, Ldw;->j:I

    if-lez v2, :cond_2c

    iget v2, v1, Ldw;->i:I

    iget v1, v1, Ldw;->j:I

    if-ne v2, v1, :cond_2c

    const/16 v34, 0x1

    goto :goto_1f

    :cond_2c
    move/from16 v34, v16

    :goto_1f
    move-object v1, v14

    move-object v9, v1

    :goto_20
    if-eqz v9, :cond_49

    iget-object v2, v9, Ldy;->ai:[Ldy;

    aget-object v8, v2, v11

    if-nez v8, :cond_2e

    if-ne v9, v12, :cond_2d

    goto :goto_22

    :cond_2d
    move-object/from16 v24, v8

    move-object/from16 v18, v9

    :goto_21
    const/16 v20, 0x6

    const/16 v21, 0x4

    goto/16 :goto_2b

    :cond_2e
    :goto_22
    iget-object v2, v9, Ldy;->D:[Ldx;

    aget-object v2, v2, v15

    iget-object v3, v2, Ldx;->i:Ldt;

    iget-object v4, v2, Ldx;->d:Ldx;

    if-eqz v4, :cond_2f

    iget-object v4, v2, Ldx;->d:Ldx;

    iget-object v4, v4, Ldx;->i:Ldt;

    goto :goto_23

    :cond_2f
    move-object/from16 v4, v25

    :goto_23
    if-eq v1, v9, :cond_30

    iget-object v4, v1, Ldy;->D:[Ldx;

    add-int/lit8 v5, v15, 0x1

    aget-object v4, v4, v5

    :goto_24
    iget-object v4, v4, Ldx;->i:Ldt;

    goto :goto_25

    :cond_30
    if-ne v9, v14, :cond_32

    if-ne v1, v9, :cond_32

    iget-object v4, v0, Ldy;->D:[Ldx;

    aget-object v4, v4, v15

    iget-object v4, v4, Ldx;->d:Ldx;

    if-eqz v4, :cond_31

    iget-object v4, v0, Ldy;->D:[Ldx;

    aget-object v4, v4, v15

    iget-object v4, v4, Ldx;->d:Ldx;

    goto :goto_24

    :cond_31
    move-object/from16 v4, v25

    :cond_32
    :goto_25
    invoke-virtual {v2}, Ldx;->b()I

    move-result v2

    iget-object v5, v9, Ldy;->D:[Ldx;

    add-int/lit8 v6, v15, 0x1

    aget-object v5, v5, v6

    invoke-virtual {v5}, Ldx;->b()I

    move-result v5

    if-eqz v8, :cond_33

    iget-object v7, v8, Ldy;->D:[Ldx;

    aget-object v7, v7, v15

    move-object/from16 v41, v0

    :goto_26
    iget-object v0, v7, Ldx;->i:Ldt;

    move-object/from16 v42, v8

    goto :goto_27

    :cond_33
    move-object/from16 v41, v0

    iget-object v0, v13, Ldy;->D:[Ldx;

    aget-object v0, v0, v6

    iget-object v7, v0, Ldx;->d:Ldx;

    if-eqz v7, :cond_34

    goto :goto_26

    :cond_34
    move-object/from16 v42, v8

    move-object/from16 v0, v25

    :goto_27
    iget-object v8, v9, Ldy;->D:[Ldx;

    aget-object v8, v8, v6

    iget-object v8, v8, Ldx;->i:Ldt;

    if-eqz v7, :cond_35

    invoke-virtual {v7}, Ldx;->b()I

    move-result v7

    add-int/2addr v5, v7

    :cond_35
    if-eqz v1, :cond_36

    iget-object v1, v1, Ldy;->D:[Ldx;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Ldx;->b()I

    move-result v1

    add-int/2addr v2, v1

    :cond_36
    if-eqz v3, :cond_3a

    if-eqz v4, :cond_3a

    if-eqz v0, :cond_3a

    if-eqz v8, :cond_3a

    if-ne v9, v14, :cond_37

    iget-object v1, v14, Ldy;->D:[Ldx;

    aget-object v1, v1, v15

    invoke-virtual {v1}, Ldx;->b()I

    move-result v1

    move v7, v1

    goto :goto_28

    :cond_37
    move v7, v2

    :goto_28
    if-ne v9, v12, :cond_38

    iget-object v1, v12, Ldy;->D:[Ldx;

    aget-object v1, v1, v6

    invoke-virtual {v1}, Ldx;->b()I

    move-result v1

    move/from16 v18, v1

    goto :goto_29

    :cond_38
    move/from16 v18, v5

    :goto_29
    if-eqz v34, :cond_39

    const/16 v19, 0x6

    goto :goto_2a

    :cond_39
    const/16 v19, 0x4

    :goto_2a
    const/high16 v5, 0x3f000000    # 0.5f

    move-object v1, v10

    move-object v2, v3

    move-object v3, v4

    move v4, v7

    move-object/from16 v7, v41

    const/16 v20, 0x6

    const/16 v21, 0x4

    move-object v6, v0

    move-object v0, v7

    move-object v7, v8

    move-object/from16 v24, v42

    move/from16 v8, v18

    move-object/from16 v18, v9

    move/from16 v9, v19

    invoke-virtual/range {v1 .. v9}, Ldq;->a(Ldt;Ldt;IFLdt;Ldt;II)V

    goto :goto_2b

    :cond_3a
    move-object/from16 v18, v9

    move-object/from16 v0, v41

    move-object/from16 v24, v42

    goto/16 :goto_21

    :goto_2b
    move-object/from16 v1, v18

    move-object/from16 v9, v24

    goto/16 :goto_20

    :cond_3b
    move-object/from16 v1, v38

    const/16 v20, 0x6

    const/16 v21, 0x4

    if-eqz v22, :cond_49

    if-eqz v14, :cond_49

    iget v2, v1, Ldw;->j:I

    if-lez v2, :cond_3c

    iget v2, v1, Ldw;->i:I

    iget v1, v1, Ldw;->j:I

    if-ne v2, v1, :cond_3c

    const/16 v34, 0x1

    goto :goto_2c

    :cond_3c
    move/from16 v34, v16

    :goto_2c
    move-object v1, v14

    move-object v9, v1

    :goto_2d
    if-eqz v9, :cond_46

    iget-object v2, v9, Ldy;->ai:[Ldy;

    aget-object v2, v2, v11

    if-eq v9, v14, :cond_45

    if-eq v9, v12, :cond_45

    if-eqz v2, :cond_45

    if-ne v2, v12, :cond_3d

    move-object/from16 v8, v25

    goto :goto_2e

    :cond_3d
    move-object v8, v2

    :goto_2e
    iget-object v2, v9, Ldy;->D:[Ldx;

    aget-object v2, v2, v15

    iget-object v3, v2, Ldx;->i:Ldt;

    iget-object v4, v1, Ldy;->D:[Ldx;

    add-int/lit8 v5, v15, 0x1

    aget-object v4, v4, v5

    iget-object v4, v4, Ldx;->i:Ldt;

    invoke-virtual {v2}, Ldx;->b()I

    move-result v2

    iget-object v6, v9, Ldy;->D:[Ldx;

    aget-object v6, v6, v5

    invoke-virtual {v6}, Ldx;->b()I

    move-result v6

    if-eqz v8, :cond_3f

    iget-object v7, v8, Ldy;->D:[Ldx;

    aget-object v7, v7, v15

    move-object/from16 v43, v8

    iget-object v8, v7, Ldx;->i:Ldt;

    move-object/from16 v44, v8

    iget-object v8, v7, Ldx;->d:Ldx;

    if-eqz v8, :cond_3e

    iget-object v8, v7, Ldx;->d:Ldx;

    iget-object v8, v8, Ldx;->i:Ldt;

    goto :goto_30

    :cond_3e
    move-object/from16 v8, v25

    goto :goto_30

    :cond_3f
    move-object/from16 v43, v8

    iget-object v7, v9, Ldy;->D:[Ldx;

    aget-object v7, v7, v5

    iget-object v7, v7, Ldx;->d:Ldx;

    if-eqz v7, :cond_40

    iget-object v8, v7, Ldx;->i:Ldt;

    move-object/from16 v45, v7

    goto :goto_2f

    :cond_40
    move-object/from16 v45, v7

    move-object/from16 v8, v25

    :goto_2f
    iget-object v7, v9, Ldy;->D:[Ldx;

    aget-object v7, v7, v5

    iget-object v7, v7, Ldx;->i:Ldt;

    move-object/from16 v44, v8

    move-object v8, v7

    move-object/from16 v7, v45

    :goto_30
    if-eqz v7, :cond_41

    invoke-virtual {v7}, Ldx;->b()I

    move-result v7

    add-int/2addr v6, v7

    :cond_41
    move/from16 v18, v6

    if-eqz v1, :cond_42

    iget-object v1, v1, Ldy;->D:[Ldx;

    aget-object v1, v1, v5

    invoke-virtual {v1}, Ldx;->b()I

    move-result v1

    add-int/2addr v2, v1

    :cond_42
    move v5, v2

    if-eqz v34, :cond_43

    move/from16 v19, v20

    goto :goto_31

    :cond_43
    move/from16 v19, v21

    :goto_31
    if-eqz v3, :cond_44

    if-eqz v4, :cond_44

    if-eqz v44, :cond_44

    if-eqz v8, :cond_44

    const/high16 v6, 0x3f000000    # 0.5f

    move-object v1, v10

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    move-object/from16 v6, v44

    move-object v7, v8

    move-object/from16 v26, v43

    move/from16 v8, v18

    move-object/from16 v18, v9

    move/from16 v9, v19

    invoke-virtual/range {v1 .. v9}, Ldq;->a(Ldt;Ldt;IFLdt;Ldt;II)V

    goto :goto_32

    :cond_44
    move-object/from16 v18, v9

    move-object/from16 v26, v43

    :goto_32
    move-object/from16 v9, v26

    goto :goto_33

    :cond_45
    move-object/from16 v18, v9

    move-object v9, v2

    :goto_33
    move-object/from16 v1, v18

    goto/16 :goto_2d

    :cond_46
    iget-object v1, v14, Ldy;->D:[Ldx;

    aget-object v1, v1, v15

    iget-object v0, v0, Ldy;->D:[Ldx;

    aget-object v0, v0, v15

    iget-object v0, v0, Ldx;->d:Ldx;

    iget-object v2, v12, Ldy;->D:[Ldx;

    add-int/lit8 v3, v15, 0x1

    aget-object v9, v2, v3

    iget-object v2, v13, Ldy;->D:[Ldx;

    aget-object v2, v2, v3

    iget-object v8, v2, Ldx;->d:Ldx;

    if-eqz v0, :cond_48

    if-eq v14, v12, :cond_47

    iget-object v2, v1, Ldx;->i:Ldt;

    iget-object v0, v0, Ldx;->i:Ldt;

    invoke-virtual {v1}, Ldx;->b()I

    move-result v1

    const/4 v3, 0x5

    invoke-virtual {v10, v2, v0, v1, v3}, Ldq;->c(Ldt;Ldt;II)Ldn;

    move-object v1, v8

    move-object v0, v9

    goto :goto_34

    :cond_47
    if-eqz v8, :cond_48

    iget-object v2, v1, Ldx;->i:Ldt;

    iget-object v3, v0, Ldx;->i:Ldt;

    invoke-virtual {v1}, Ldx;->b()I

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    iget-object v6, v9, Ldx;->i:Ldt;

    iget-object v7, v8, Ldx;->i:Ldt;

    invoke-virtual {v9}, Ldx;->b()I

    move-result v0

    const/16 v18, 0x5

    move-object v1, v10

    move-object/from16 v46, v8

    move v8, v0

    move-object v0, v9

    move/from16 v9, v18

    invoke-virtual/range {v1 .. v9}, Ldq;->a(Ldt;Ldt;IFLdt;Ldt;II)V

    move-object/from16 v1, v46

    goto :goto_34

    :cond_48
    move-object v0, v9

    move-object v1, v8

    :goto_34
    if-eqz v1, :cond_49

    if-eq v14, v12, :cond_49

    iget-object v2, v0, Ldx;->i:Ldt;

    iget-object v1, v1, Ldx;->i:Ldt;

    invoke-virtual {v0}, Ldx;->b()I

    move-result v0

    neg-int v0, v0

    const/4 v3, 0x5

    invoke-virtual {v10, v2, v1, v0, v3}, Ldq;->c(Ldt;Ldt;II)Ldn;

    :cond_49
    :goto_35
    if-nez v23, :cond_4a

    if-eqz v22, :cond_51

    :cond_4a
    if-eqz v14, :cond_51

    iget-object v0, v14, Ldy;->D:[Ldx;

    aget-object v0, v0, v15

    iget-object v1, v12, Ldy;->D:[Ldx;

    add-int/lit8 v2, v15, 0x1

    aget-object v1, v1, v2

    iget-object v3, v0, Ldx;->d:Ldx;

    if-eqz v3, :cond_4b

    iget-object v3, v0, Ldx;->d:Ldx;

    iget-object v3, v3, Ldx;->i:Ldt;

    goto :goto_36

    :cond_4b
    move-object/from16 v3, v25

    :goto_36
    iget-object v4, v1, Ldx;->d:Ldx;

    if-eqz v4, :cond_4c

    iget-object v4, v1, Ldx;->d:Ldx;

    iget-object v4, v4, Ldx;->i:Ldt;

    goto :goto_37

    :cond_4c
    move-object/from16 v4, v25

    :goto_37
    if-eq v13, v12, :cond_4e

    iget-object v4, v13, Ldy;->D:[Ldx;

    aget-object v4, v4, v2

    iget-object v5, v4, Ldx;->d:Ldx;

    if-eqz v5, :cond_4d

    iget-object v4, v4, Ldx;->d:Ldx;

    iget-object v4, v4, Ldx;->i:Ldt;

    goto :goto_38

    :cond_4d
    move-object/from16 v4, v25

    :cond_4e
    :goto_38
    move-object v6, v4

    if-ne v14, v12, :cond_4f

    iget-object v0, v14, Ldy;->D:[Ldx;

    aget-object v0, v0, v15

    iget-object v1, v14, Ldy;->D:[Ldx;

    aget-object v1, v1, v2

    :cond_4f
    if-eqz v3, :cond_51

    if-eqz v6, :cond_51

    invoke-virtual {v0}, Ldx;->b()I

    move-result v4

    if-nez v12, :cond_50

    move-object v12, v13

    :cond_50
    iget-object v5, v12, Ldy;->D:[Ldx;

    aget-object v2, v5, v2

    invoke-virtual {v2}, Ldx;->b()I

    move-result v8

    iget-object v2, v0, Ldx;->i:Ldt;

    const/high16 v5, 0x3f000000    # 0.5f

    iget-object v7, v1, Ldx;->i:Ldt;

    const/4 v9, 0x5

    move-object v1, v10

    invoke-virtual/range {v1 .. v9}, Ldq;->a(Ldt;Ldt;IFLdt;Ldt;II)V

    :cond_51
    :goto_39
    add-int/lit8 v8, v40, 0x1

    move/from16 v9, v17

    move-object/from16 v14, v31

    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_52
    return-void
.end method
