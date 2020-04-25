.class public final Ldz;
.super Lei;


# instance fields
.field public a:Z

.field al:I

.field am:I

.field an:I

.field ao:I

.field ap:I

.field aq:I

.field ar:[Ldw;

.field as:[Ldw;

.field public at:I

.field public au:Z

.field public av:Z

.field aw:I

.field private ay:Leh;

.field protected b:Ldq;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lei;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldz;->a:Z

    new-instance v1, Ldq;

    invoke-direct {v1}, Ldq;-><init>()V

    iput-object v1, p0, Ldz;->b:Ldq;

    iput v0, p0, Ldz;->ap:I

    iput v0, p0, Ldz;->aq:I

    const/4 v1, 0x4

    new-array v2, v1, [Ldw;

    iput-object v2, p0, Ldz;->ar:[Ldw;

    new-array v1, v1, [Ldw;

    iput-object v1, p0, Ldz;->as:[Ldw;

    const/4 v1, 0x3

    iput v1, p0, Ldz;->at:I

    iput-boolean v0, p0, Ldz;->au:Z

    iput-boolean v0, p0, Ldz;->av:Z

    iput v0, p0, Ldz;->aw:I

    return-void
.end method

.method private F()V
    .locals 3

    iget-object v0, p0, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0}, Ldz;->b()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldy;

    invoke-virtual {v2}, Ldy;->b()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a([Z)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x2

    aput-boolean v0, p1, v1

    invoke-virtual {p0}, Ldz;->z()V

    iget-object v2, p0, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_2

    iget-object v4, p0, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldy;

    invoke-virtual {v4}, Ldy;->z()V

    iget-object v5, v4, Ldy;->F:[I

    aget v5, v5, v0

    sget v6, Ldy$a;->c:I

    const/4 v7, 0x1

    if-ne v5, v6, :cond_0

    invoke-virtual {v4}, Ldy;->l()I

    move-result v5

    iget v6, v4, Ldy;->S:I

    if-ge v5, v6, :cond_0

    aput-boolean v7, p1, v1

    :cond_0
    iget-object v5, v4, Ldy;->F:[I

    aget v5, v5, v7

    sget v6, Ldy$a;->c:I

    if-ne v5, v6, :cond_1

    invoke-virtual {v4}, Ldy;->m()I

    move-result v5

    iget v4, v4, Ldy;->T:I

    if-ge v5, v4, :cond_1

    aput-boolean v7, p1, v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 23

    move-object/from16 v1, p0

    iget v2, v1, Ldz;->L:I

    iget v3, v1, Ldz;->M:I

    invoke-virtual/range {p0 .. p0}, Ldz;->l()I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Ldz;->m()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput-boolean v5, v1, Ldz;->au:Z

    iput-boolean v5, v1, Ldz;->av:Z

    iget-object v7, v1, Ldz;->G:Ldy;

    if-eqz v7, :cond_3

    iget-object v7, v1, Ldz;->ay:Leh;

    if-nez v7, :cond_0

    new-instance v7, Leh;

    invoke-direct {v7, v1}, Leh;-><init>(Ldy;)V

    iput-object v7, v1, Ldz;->ay:Leh;

    :cond_0
    iget-object v7, v1, Ldz;->ay:Leh;

    invoke-virtual/range {p0 .. p0}, Ldy;->j()I

    move-result v8

    iput v8, v7, Leh;->a:I

    invoke-virtual/range {p0 .. p0}, Ldy;->k()I

    move-result v8

    iput v8, v7, Leh;->b:I

    invoke-virtual/range {p0 .. p0}, Ldy;->l()I

    move-result v8

    iput v8, v7, Leh;->c:I

    invoke-virtual/range {p0 .. p0}, Ldy;->m()I

    move-result v8

    iput v8, v7, Leh;->d:I

    iget-object v8, v7, Leh;->e:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    move v9, v5

    :goto_0
    if-ge v9, v8, :cond_2

    iget-object v10, v7, Leh;->e:Ljava/util/ArrayList;

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Leh$a;

    iget-object v11, v10, Leh$a;->a:Ldx;

    iget-object v11, v11, Ldx;->c:Ldx$c;

    invoke-virtual {v1, v11}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v11

    iput-object v11, v10, Leh$a;->a:Ldx;

    iget-object v11, v10, Leh$a;->a:Ldx;

    if-eqz v11, :cond_1

    iget-object v11, v10, Leh$a;->a:Ldx;

    iget-object v11, v11, Ldx;->d:Ldx;

    iput-object v11, v10, Leh$a;->b:Ldx;

    iget-object v11, v10, Leh$a;->a:Ldx;

    invoke-virtual {v11}, Ldx;->b()I

    move-result v11

    iput v11, v10, Leh$a;->c:I

    iget-object v11, v10, Leh$a;->a:Ldx;

    iget v11, v11, Ldx;->g:I

    iput v11, v10, Leh$a;->d:I

    iget-object v11, v10, Leh$a;->a:Ldx;

    iget v11, v11, Ldx;->h:I

    iput v11, v10, Leh$a;->e:I

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    iput-object v11, v10, Leh$a;->b:Ldx;

    iput v5, v10, Leh$a;->c:I

    sget v11, Ldx$b;->b:I

    iput v11, v10, Leh$a;->d:I

    iput v5, v10, Leh$a;->e:I

    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    iget v7, v1, Ldz;->al:I

    invoke-virtual {v1, v7}, Ldz;->b(I)V

    iget v7, v1, Ldz;->am:I

    invoke-virtual {v1, v7}, Ldz;->c(I)V

    invoke-virtual/range {p0 .. p0}, Ldz;->w()V

    iget-object v7, v1, Ldz;->b:Ldq;

    iget-object v7, v7, Ldq;->g:Ldo;

    invoke-virtual {v1, v7}, Ldz;->a(Ldo;)V

    goto :goto_2

    :cond_3
    iput v5, v1, Ldz;->L:I

    iput v5, v1, Ldz;->M:I

    :goto_2
    iget v7, v1, Ldz;->at:I

    const/16 v8, 0x8

    const/4 v9, 0x1

    if-eqz v7, :cond_6

    invoke-virtual {v1, v8}, Ldz;->j(I)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-direct/range {p0 .. p0}, Ldz;->F()V

    :cond_4
    invoke-virtual {v1, v8}, Ldz;->j(I)Z

    move-result v7

    if-nez v7, :cond_5

    iget v7, v1, Ldz;->at:I

    invoke-virtual {v1, v7}, Ldz;->a(I)V

    :cond_5
    invoke-virtual/range {p0 .. p0}, Ldz;->C()V

    iget-object v7, v1, Ldz;->b:Ldq;

    iput-boolean v9, v7, Ldq;->d:Z

    goto :goto_3

    :cond_6
    iget-object v7, v1, Ldz;->b:Ldq;

    iput-boolean v5, v7, Ldq;->d:Z

    :goto_3
    iget-object v7, v1, Ldz;->F:[I

    aget v7, v7, v9

    iget-object v10, v1, Ldz;->F:[I

    aget v10, v10, v5

    iput v5, v1, Ldz;->ap:I

    iput v5, v1, Ldz;->aq:I

    iget-object v11, v1, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    move v12, v5

    :goto_4
    if-ge v12, v11, :cond_8

    iget-object v13, v1, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ldy;

    instance-of v14, v13, Lei;

    if-eqz v14, :cond_7

    check-cast v13, Lei;

    invoke-virtual {v13}, Lei;->A()V

    :cond_7
    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    :cond_8
    move v13, v5

    move v14, v13

    move v12, v9

    :goto_5
    if-eqz v12, :cond_25

    add-int/2addr v13, v9

    :try_start_0
    iget-object v15, v1, Ldz;->b:Ldq;

    invoke-virtual {v15}, Ldq;->b()V

    iget-object v15, v1, Ldz;->b:Ldq;

    invoke-virtual {v1, v15}, Ldz;->b(Ldq;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    move v15, v5

    :goto_6
    if-ge v15, v11, :cond_9

    :try_start_1
    iget-object v8, v1, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ldy;

    iget-object v9, v1, Ldz;->b:Ldq;

    invoke-virtual {v8, v9}, Ldy;->b(Ldq;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v15, v15, 0x1

    const/16 v8, 0x8

    const/4 v9, 0x1

    goto :goto_6

    :catch_0
    move-exception v0

    move/from16 v21, v2

    move/from16 v22, v3

    move v9, v12

    move/from16 v20, v14

    :goto_7
    move-object v2, v0

    goto/16 :goto_14

    :cond_9
    :try_start_2
    iget-object v8, v1, Ldz;->b:Ldq;

    invoke-virtual {v1, v8}, Ldz;->a(Ldq;)V

    iget-object v9, v1, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7

    move v15, v5

    :goto_8
    if-ge v15, v9, :cond_f

    :try_start_3
    iget-object v5, v1, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ldy;

    move/from16 v18, v9

    instance-of v9, v5, Ldz;

    if-eqz v9, :cond_d

    iget-object v9, v5, Ldy;->F:[I

    const/16 v17, 0x0

    aget v9, v9, v17
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move/from16 v19, v12

    :try_start_4
    iget-object v12, v5, Ldy;->F:[I

    const/16 v16, 0x1

    aget v12, v12, v16
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    move/from16 v20, v14

    :try_start_5
    sget v14, Ldy$a;->b:I

    if-ne v9, v14, :cond_a

    sget v14, Ldy$a;->a:I

    invoke-virtual {v5, v14}, Ldy;->h(I)V

    :cond_a
    sget v14, Ldy$a;->b:I

    if-ne v12, v14, :cond_b

    sget v14, Ldy$a;->a:I

    invoke-virtual {v5, v14}, Ldy;->i(I)V

    :cond_b
    invoke-virtual {v5, v8}, Ldy;->a(Ldq;)V

    sget v14, Ldy$a;->b:I

    if-ne v9, v14, :cond_c

    invoke-virtual {v5, v9}, Ldy;->h(I)V

    :cond_c
    sget v9, Ldy$a;->b:I

    if-ne v12, v9, :cond_e

    invoke-virtual {v5, v12}, Ldy;->i(I)V

    goto :goto_9

    :catch_1
    move-exception v0

    goto :goto_a

    :cond_d
    move/from16 v19, v12

    move/from16 v20, v14

    invoke-static {v1, v8, v5}, Lec;->a(Ldz;Ldq;Ldy;)V

    invoke-virtual {v5, v8}, Ldy;->a(Ldq;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :cond_e
    :goto_9
    add-int/lit8 v15, v15, 0x1

    move/from16 v9, v18

    move/from16 v12, v19

    move/from16 v14, v20

    const/4 v5, 0x0

    goto :goto_8

    :catch_2
    move-exception v0

    move/from16 v19, v12

    :goto_a
    move/from16 v20, v14

    :goto_b
    move/from16 v21, v2

    move/from16 v22, v3

    move/from16 v9, v19

    goto :goto_7

    :cond_f
    move/from16 v19, v12

    move/from16 v20, v14

    :try_start_6
    iget v5, v1, Ldz;->ap:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    if-lez v5, :cond_10

    const/4 v5, 0x0

    :try_start_7
    invoke-static {v1, v8, v5}, Ldv;->a(Ldz;Ldq;I)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_c

    :catch_3
    move-exception v0

    goto :goto_b

    :cond_10
    :goto_c
    :try_start_8
    iget v5, v1, Ldz;->aq:I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    if-lez v5, :cond_11

    const/4 v5, 0x1

    :try_start_9
    invoke-static {v1, v8, v5}, Ldv;->a(Ldz;Ldq;I)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    :cond_11
    :try_start_a
    iget-object v5, v1, Ldz;->b:Ldq;

    sget-object v8, Ldq;->h:Ldr;

    const-wide/16 v14, 0x1

    if-eqz v8, :cond_12

    sget-object v8, Ldq;->h:Ldr;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    move/from16 v21, v2

    move/from16 v22, v3

    :try_start_b
    iget-wide v2, v8, Ldr;->e:J

    add-long/2addr v2, v14

    iput-wide v2, v8, Ldr;->e:J

    goto :goto_d

    :cond_12
    move/from16 v21, v2

    move/from16 v22, v3

    :goto_d
    iget-boolean v2, v5, Ldq;->d:Z

    if-eqz v2, :cond_18

    sget-object v2, Ldq;->h:Ldr;

    if-eqz v2, :cond_13

    sget-object v2, Ldq;->h:Ldr;

    iget-wide v8, v2, Ldr;->r:J

    add-long/2addr v8, v14

    iput-wide v8, v2, Ldr;->r:J

    :cond_13
    const/4 v2, 0x0

    :goto_e
    iget v3, v5, Ldq;->f:I

    if-ge v2, v3, :cond_15

    iget-object v3, v5, Ldq;->c:[Ldn;

    aget-object v3, v3, v2

    iget-boolean v3, v3, Ldn;->e:Z

    if-nez v3, :cond_14

    const/4 v2, 0x0

    goto :goto_f

    :cond_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_15
    const/4 v2, 0x1

    :goto_f
    if-nez v2, :cond_16

    iget-object v2, v5, Ldq;->b:Ldq$a;

    :goto_10
    invoke-virtual {v5, v2}, Ldq;->a(Ldq$a;)V

    goto :goto_11

    :cond_16
    sget-object v2, Ldq;->h:Ldr;

    if-eqz v2, :cond_17

    sget-object v2, Ldq;->h:Ldr;

    iget-wide v8, v2, Ldr;->q:J

    add-long/2addr v8, v14

    iput-wide v8, v2, Ldr;->q:J

    :cond_17
    invoke-virtual {v5}, Ldq;->e()V

    goto :goto_11

    :cond_18
    iget-object v2, v5, Ldq;->b:Ldq$a;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    goto :goto_10

    :goto_11
    const/4 v9, 0x1

    goto :goto_15

    :catch_4
    move-exception v0

    goto :goto_12

    :catch_5
    move-exception v0

    move/from16 v21, v2

    move/from16 v22, v3

    :goto_12
    move-object v2, v0

    const/4 v9, 0x1

    goto :goto_14

    :catch_6
    move-exception v0

    move/from16 v21, v2

    move/from16 v22, v3

    goto :goto_13

    :catch_7
    move-exception v0

    move/from16 v21, v2

    move/from16 v22, v3

    move/from16 v19, v12

    move/from16 v20, v14

    :goto_13
    move-object v2, v0

    move/from16 v9, v19

    :goto_14
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "EXCEPTION : "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_15
    const/4 v2, 0x2

    if-eqz v9, :cond_1a

    sget-object v3, Lec;->a:[Z

    invoke-direct {v1, v3}, Ldz;->a([Z)V

    :cond_19
    :goto_16
    const/16 v3, 0x8

    goto :goto_18

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Ldz;->z()V

    const/4 v3, 0x0

    :goto_17
    if-ge v3, v11, :cond_19

    iget-object v5, v1, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ldy;

    iget-object v8, v5, Ldy;->F:[I

    const/4 v9, 0x0

    aget v8, v8, v9

    sget v9, Ldy$a;->c:I

    if-ne v8, v9, :cond_1b

    invoke-virtual {v5}, Ldy;->l()I

    move-result v8

    iget v9, v5, Ldy;->S:I

    if-ge v8, v9, :cond_1b

    sget-object v3, Lec;->a:[Z

    const/4 v8, 0x1

    aput-boolean v8, v3, v2

    goto :goto_16

    :cond_1b
    const/4 v8, 0x1

    iget-object v9, v5, Ldy;->F:[I

    aget v9, v9, v8

    sget v12, Ldy$a;->c:I

    if-ne v9, v12, :cond_1c

    invoke-virtual {v5}, Ldy;->m()I

    move-result v9

    iget v5, v5, Ldy;->T:I

    if-ge v9, v5, :cond_1c

    sget-object v3, Lec;->a:[Z

    aput-boolean v8, v3, v2

    goto :goto_16

    :cond_1c
    add-int/lit8 v3, v3, 0x1

    goto :goto_17

    :goto_18
    if-ge v13, v3, :cond_1f

    sget-object v5, Lec;->a:[Z

    aget-boolean v2, v5, v2

    if-eqz v2, :cond_1f

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_19
    if-ge v2, v11, :cond_1d

    iget-object v9, v1, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ldy;

    iget v12, v9, Ldy;->L:I

    invoke-virtual {v9}, Ldy;->l()I

    move-result v14

    add-int/2addr v12, v14

    invoke-static {v5, v12}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget v12, v9, Ldy;->M:I

    invoke-virtual {v9}, Ldy;->m()I

    move-result v9

    add-int/2addr v12, v9

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v8

    add-int/lit8 v2, v2, 0x1

    goto :goto_19

    :cond_1d
    iget v2, v1, Ldz;->Q:I

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v5, v1, Ldz;->R:I

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v5

    sget v8, Ldy$a;->b:I

    if-ne v10, v8, :cond_1e

    invoke-virtual/range {p0 .. p0}, Ldz;->l()I

    move-result v8

    if-ge v8, v2, :cond_1e

    invoke-virtual {v1, v2}, Ldz;->d(I)V

    iget-object v2, v1, Ldz;->F:[I

    sget v8, Ldy$a;->b:I

    const/4 v9, 0x0

    aput v8, v2, v9

    const/4 v2, 0x1

    const/4 v9, 0x1

    goto :goto_1a

    :cond_1e
    move/from16 v9, v20

    const/4 v2, 0x0

    :goto_1a
    sget v8, Ldy$a;->b:I

    if-ne v7, v8, :cond_20

    invoke-virtual/range {p0 .. p0}, Ldz;->m()I

    move-result v8

    if-ge v8, v5, :cond_20

    invoke-virtual {v1, v5}, Ldz;->e(I)V

    iget-object v2, v1, Ldz;->F:[I

    sget v5, Ldy$a;->b:I

    const/4 v8, 0x1

    aput v5, v2, v8

    const/4 v2, 0x1

    const/4 v9, 0x1

    goto :goto_1b

    :cond_1f
    move/from16 v9, v20

    const/4 v2, 0x0

    :cond_20
    :goto_1b
    iget v5, v1, Ldz;->Q:I

    invoke-virtual/range {p0 .. p0}, Ldz;->l()I

    move-result v8

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Ldz;->l()I

    move-result v8

    if-le v5, v8, :cond_21

    invoke-virtual {v1, v5}, Ldz;->d(I)V

    iget-object v2, v1, Ldz;->F:[I

    sget v5, Ldy$a;->a:I

    const/4 v8, 0x0

    aput v5, v2, v8

    const/4 v2, 0x1

    const/4 v9, 0x1

    :cond_21
    iget v5, v1, Ldz;->R:I

    invoke-virtual/range {p0 .. p0}, Ldz;->m()I

    move-result v8

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Ldz;->m()I

    move-result v8

    if-le v5, v8, :cond_22

    invoke-virtual {v1, v5}, Ldz;->e(I)V

    iget-object v2, v1, Ldz;->F:[I

    sget v5, Ldy$a;->a:I

    const/4 v8, 0x1

    aput v5, v2, v8

    move v2, v8

    move v9, v2

    goto :goto_1c

    :cond_22
    const/4 v8, 0x1

    :goto_1c
    if-nez v9, :cond_24

    iget-object v5, v1, Ldz;->F:[I

    const/4 v12, 0x0

    aget v5, v5, v12

    sget v14, Ldy$a;->b:I

    if-ne v5, v14, :cond_23

    if-lez v4, :cond_23

    invoke-virtual/range {p0 .. p0}, Ldz;->l()I

    move-result v5

    if-le v5, v4, :cond_23

    iput-boolean v8, v1, Ldz;->au:Z

    iget-object v2, v1, Ldz;->F:[I

    sget v5, Ldy$a;->a:I

    aput v5, v2, v12

    invoke-virtual {v1, v4}, Ldz;->d(I)V

    move v2, v8

    move v9, v2

    :cond_23
    iget-object v5, v1, Ldz;->F:[I

    aget v5, v5, v8

    sget v12, Ldy$a;->b:I

    if-ne v5, v12, :cond_24

    if-lez v6, :cond_24

    invoke-virtual/range {p0 .. p0}, Ldz;->m()I

    move-result v5

    if-le v5, v6, :cond_24

    iput-boolean v8, v1, Ldz;->av:Z

    iget-object v2, v1, Ldz;->F:[I

    sget v5, Ldy$a;->a:I

    aput v5, v2, v8

    invoke-virtual {v1, v6}, Ldz;->e(I)V

    const/4 v12, 0x1

    const/4 v14, 0x1

    goto :goto_1d

    :cond_24
    move v12, v2

    move v14, v9

    :goto_1d
    move v8, v3

    move/from16 v2, v21

    move/from16 v3, v22

    const/4 v5, 0x0

    const/4 v9, 0x1

    goto/16 :goto_5

    :cond_25
    move/from16 v21, v2

    move/from16 v22, v3

    move/from16 v20, v14

    iget-object v2, v1, Ldz;->G:Ldy;

    if-eqz v2, :cond_26

    iget v2, v1, Ldz;->Q:I

    invoke-virtual/range {p0 .. p0}, Ldz;->l()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, v1, Ldz;->R:I

    invoke-virtual/range {p0 .. p0}, Ldz;->m()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget-object v4, v1, Ldz;->ay:Leh;

    invoke-virtual {v4, v1}, Leh;->a(Ldy;)V

    iget v4, v1, Ldz;->al:I

    add-int/2addr v2, v4

    iget v4, v1, Ldz;->an:I

    add-int/2addr v2, v4

    invoke-virtual {v1, v2}, Ldz;->d(I)V

    iget v2, v1, Ldz;->am:I

    add-int/2addr v3, v2

    iget v2, v1, Ldz;->ao:I

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Ldz;->e(I)V

    goto :goto_1e

    :cond_26
    move/from16 v2, v21

    iput v2, v1, Ldz;->L:I

    move/from16 v2, v22

    iput v2, v1, Ldz;->M:I

    :goto_1e
    if-eqz v20, :cond_27

    iget-object v2, v1, Ldz;->F:[I

    const/4 v3, 0x0

    aput v10, v2, v3

    iget-object v2, v1, Ldz;->F:[I

    const/4 v3, 0x1

    aput v7, v2, v3

    :cond_27
    iget-object v2, v1, Ldz;->b:Ldq;

    iget-object v2, v2, Ldq;->g:Ldo;

    invoke-virtual {v1, v2}, Ldz;->a(Ldo;)V

    invoke-virtual/range {p0 .. p0}, Ldz;->D()Ldz;

    move-result-object v2

    if-ne v1, v2, :cond_28

    invoke-virtual/range {p0 .. p0}, Ldz;->v()V

    :cond_28
    return-void
.end method

.method public final B()V
    .locals 1

    invoke-direct {p0}, Ldz;->F()V

    iget v0, p0, Ldz;->at:I

    invoke-virtual {p0, v0}, Ldz;->a(I)V

    return-void
.end method

.method public final C()V
    .locals 4

    sget-object v0, Ldx$c;->b:Ldx$c;

    invoke-virtual {p0, v0}, Ldz;->a(Ldx$c;)Ldx;

    move-result-object v0

    iget-object v0, v0, Ldx;->a:Lee;

    sget-object v1, Ldx$c;->c:Ldx$c;

    invoke-virtual {p0, v1}, Ldz;->a(Ldx$c;)Ldx;

    move-result-object v1

    iget-object v1, v1, Ldx;->a:Lee;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Lee;->a(Lee;F)V

    invoke-virtual {v1, v3, v2}, Lee;->a(Lee;F)V

    return-void
.end method

.method public final a(I)V
    .locals 3

    invoke-super {p0, p1}, Lei;->a(I)V

    iget-object v0, p0, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Ldz;->ax:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldy;

    invoke-virtual {v2, p1}, Ldy;->a(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method final a(Ldy;I)V
    .locals 5

    const/4 v0, 0x1

    if-nez p2, :cond_1

    iget p2, p0, Ldz;->ap:I

    add-int/2addr p2, v0

    iget-object v1, p0, Ldz;->as:[Ldw;

    array-length v1, v1

    if-lt p2, v1, :cond_0

    iget-object p2, p0, Ldz;->as:[Ldw;

    iget-object v1, p0, Ldz;->as:[Ldw;

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ldw;

    iput-object p2, p0, Ldz;->as:[Ldw;

    :cond_0
    iget-object p2, p0, Ldz;->as:[Ldw;

    iget v1, p0, Ldz;->ap:I

    new-instance v2, Ldw;

    const/4 v3, 0x0

    iget-boolean v4, p0, Ldz;->a:Z

    invoke-direct {v2, p1, v3, v4}, Ldw;-><init>(Ldy;IZ)V

    aput-object v2, p2, v1

    iget p1, p0, Ldz;->ap:I

    add-int/2addr p1, v0

    iput p1, p0, Ldz;->ap:I

    return-void

    :cond_1
    if-ne p2, v0, :cond_3

    iget p2, p0, Ldz;->aq:I

    add-int/2addr p2, v0

    iget-object v1, p0, Ldz;->ar:[Ldw;

    array-length v1, v1

    if-lt p2, v1, :cond_2

    iget-object p2, p0, Ldz;->ar:[Ldw;

    iget-object v1, p0, Ldz;->ar:[Ldw;

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ldw;

    iput-object p2, p0, Ldz;->ar:[Ldw;

    :cond_2
    iget-object p2, p0, Ldz;->ar:[Ldw;

    iget v1, p0, Ldz;->aq:I

    new-instance v2, Ldw;

    iget-boolean v3, p0, Ldz;->a:Z

    invoke-direct {v2, p1, v0, v3}, Ldw;-><init>(Ldy;IZ)V

    aput-object v2, p2, v1

    iget p1, p0, Ldz;->aq:I

    add-int/2addr p1, v0

    iput p1, p0, Ldz;->aq:I

    :cond_3
    return-void
.end method

.method public final e(II)V
    .locals 2

    iget-object v0, p0, Ldz;->F:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    sget v1, Ldy$a;->b:I

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Ldz;->e:Lef;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldz;->e:Lef;

    invoke-virtual {v0, p1}, Lef;->a(I)V

    :cond_0
    iget-object p1, p0, Ldz;->F:[I

    const/4 v0, 0x1

    aget p1, p1, v0

    sget v0, Ldy$a;->b:I

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Ldz;->f:Lef;

    if-eqz p1, :cond_1

    iget-object p1, p0, Ldz;->f:Lef;

    invoke-virtual {p1, p2}, Lef;->a(I)V

    :cond_1
    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Ldz;->b:Ldq;

    invoke-virtual {v0}, Ldq;->b()V

    const/4 v0, 0x0

    iput v0, p0, Ldz;->al:I

    iput v0, p0, Ldz;->an:I

    iput v0, p0, Ldz;->am:I

    iput v0, p0, Ldz;->ao:I

    invoke-super {p0}, Lei;->f()V

    return-void
.end method

.method public final j(I)Z
    .locals 1

    iget v0, p0, Ldz;->at:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
