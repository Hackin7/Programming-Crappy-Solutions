.class public Ldy;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldy$a;
    }
.end annotation


# static fields
.field public static U:F = 0.5f


# instance fields
.field A:Ldx;

.field B:Ldx;

.field C:Ldx;

.field protected D:[Ldx;

.field protected E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldx;",
            ">;"
        }
    .end annotation
.end field

.field protected F:[I

.field G:Ldy;

.field H:I

.field I:I

.field protected J:F

.field protected K:I

.field protected L:I

.field protected M:I

.field protected N:I

.field protected O:I

.field public P:I

.field protected Q:I

.field protected R:I

.field public S:I

.field public T:I

.field public V:F

.field public W:F

.field public X:Ljava/lang/Object;

.field public Y:I

.field public Z:Ljava/lang/String;

.field private a:I

.field aa:Z

.field ab:Z

.field public ac:I

.field public ad:I

.field ae:Z

.field af:Z

.field public ag:[F

.field protected ah:[Ldy;

.field protected ai:[Ldy;

.field aj:Ldy;

.field ak:Ldy;

.field private al:I

.field private am:I

.field private an:I

.field private ao:Ljava/lang/String;

.field private b:I

.field public c:I

.field public d:I

.field e:Lef;

.field f:Lef;

.field public g:I

.field public h:I

.field i:[I

.field public j:I

.field public k:I

.field public l:F

.field public m:I

.field public n:I

.field public o:F

.field public p:Z

.field public q:Z

.field r:I

.field s:F

.field public t:[I

.field public u:F

.field v:Ldx;

.field w:Ldx;

.field x:Ldx;

.field y:Ldx;

.field z:Ldx;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ldy;->c:I

    iput v0, p0, Ldy;->d:I

    const/4 v1, 0x0

    iput v1, p0, Ldy;->g:I

    iput v1, p0, Ldy;->h:I

    const/4 v2, 0x2

    new-array v3, v2, [I

    iput-object v3, p0, Ldy;->i:[I

    iput v1, p0, Ldy;->j:I

    iput v1, p0, Ldy;->k:I

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, p0, Ldy;->l:F

    iput v1, p0, Ldy;->m:I

    iput v1, p0, Ldy;->n:I

    iput v3, p0, Ldy;->o:F

    iput v0, p0, Ldy;->r:I

    iput v3, p0, Ldy;->s:F

    new-array v3, v2, [I

    fill-array-data v3, :array_0

    iput-object v3, p0, Ldy;->t:[I

    const/4 v3, 0x0

    iput v3, p0, Ldy;->u:F

    new-instance v4, Ldx;

    sget-object v5, Ldx$c;->b:Ldx$c;

    invoke-direct {v4, p0, v5}, Ldx;-><init>(Ldy;Ldx$c;)V

    iput-object v4, p0, Ldy;->v:Ldx;

    new-instance v4, Ldx;

    sget-object v5, Ldx$c;->c:Ldx$c;

    invoke-direct {v4, p0, v5}, Ldx;-><init>(Ldy;Ldx$c;)V

    iput-object v4, p0, Ldy;->w:Ldx;

    new-instance v4, Ldx;

    sget-object v5, Ldx$c;->d:Ldx$c;

    invoke-direct {v4, p0, v5}, Ldx;-><init>(Ldy;Ldx$c;)V

    iput-object v4, p0, Ldy;->x:Ldx;

    new-instance v4, Ldx;

    sget-object v5, Ldx$c;->e:Ldx$c;

    invoke-direct {v4, p0, v5}, Ldx;-><init>(Ldy;Ldx$c;)V

    iput-object v4, p0, Ldy;->y:Ldx;

    new-instance v4, Ldx;

    sget-object v5, Ldx$c;->f:Ldx$c;

    invoke-direct {v4, p0, v5}, Ldx;-><init>(Ldy;Ldx$c;)V

    iput-object v4, p0, Ldy;->z:Ldx;

    new-instance v4, Ldx;

    sget-object v5, Ldx$c;->h:Ldx$c;

    invoke-direct {v4, p0, v5}, Ldx;-><init>(Ldy;Ldx$c;)V

    iput-object v4, p0, Ldy;->A:Ldx;

    new-instance v4, Ldx;

    sget-object v5, Ldx$c;->i:Ldx$c;

    invoke-direct {v4, p0, v5}, Ldx;-><init>(Ldy;Ldx$c;)V

    iput-object v4, p0, Ldy;->B:Ldx;

    new-instance v4, Ldx;

    sget-object v5, Ldx$c;->g:Ldx$c;

    invoke-direct {v4, p0, v5}, Ldx;-><init>(Ldy;Ldx$c;)V

    iput-object v4, p0, Ldy;->C:Ldx;

    const/4 v4, 0x6

    new-array v4, v4, [Ldx;

    iget-object v5, p0, Ldy;->v:Ldx;

    aput-object v5, v4, v1

    iget-object v5, p0, Ldy;->x:Ldx;

    const/4 v6, 0x1

    aput-object v5, v4, v6

    iget-object v5, p0, Ldy;->w:Ldx;

    aput-object v5, v4, v2

    iget-object v5, p0, Ldy;->y:Ldx;

    const/4 v7, 0x3

    aput-object v5, v4, v7

    iget-object v5, p0, Ldy;->z:Ldx;

    const/4 v7, 0x4

    aput-object v5, v4, v7

    iget-object v5, p0, Ldy;->C:Ldx;

    const/4 v7, 0x5

    aput-object v5, v4, v7

    iput-object v4, p0, Ldy;->D:[Ldx;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Ldy;->E:Ljava/util/ArrayList;

    new-array v4, v2, [I

    sget v5, Ldy$a;->a:I

    aput v5, v4, v1

    sget v5, Ldy$a;->a:I

    aput v5, v4, v6

    iput-object v4, p0, Ldy;->F:[I

    const/4 v4, 0x0

    iput-object v4, p0, Ldy;->G:Ldy;

    iput v1, p0, Ldy;->H:I

    iput v1, p0, Ldy;->I:I

    iput v3, p0, Ldy;->J:F

    iput v0, p0, Ldy;->K:I

    iput v1, p0, Ldy;->L:I

    iput v1, p0, Ldy;->M:I

    iput v1, p0, Ldy;->a:I

    iput v1, p0, Ldy;->b:I

    iput v1, p0, Ldy;->al:I

    iput v1, p0, Ldy;->am:I

    iput v1, p0, Ldy;->N:I

    iput v1, p0, Ldy;->O:I

    iput v1, p0, Ldy;->P:I

    sget v0, Ldy;->U:F

    iput v0, p0, Ldy;->V:F

    sget v0, Ldy;->U:F

    iput v0, p0, Ldy;->W:F

    iput v1, p0, Ldy;->an:I

    iput v1, p0, Ldy;->Y:I

    iput-object v4, p0, Ldy;->Z:Ljava/lang/String;

    iput-object v4, p0, Ldy;->ao:Ljava/lang/String;

    iput v1, p0, Ldy;->ac:I

    iput v1, p0, Ldy;->ad:I

    new-array v0, v2, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Ldy;->ag:[F

    new-array v0, v2, [Ldy;

    aput-object v4, v0, v1

    aput-object v4, v0, v6

    iput-object v0, p0, Ldy;->ah:[Ldy;

    new-array v0, v2, [Ldy;

    aput-object v4, v0, v1

    aput-object v4, v0, v6

    iput-object v0, p0, Ldy;->ai:[Ldy;

    iput-object v4, p0, Ldy;->aj:Ldy;

    iput-object v4, p0, Ldy;->ak:Ldy;

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    iget-object v1, p0, Ldy;->v:Ldx;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    iget-object v1, p0, Ldy;->w:Ldx;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    iget-object v1, p0, Ldy;->x:Ldx;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    iget-object v1, p0, Ldy;->y:Ldx;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    iget-object v1, p0, Ldy;->A:Ldx;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    iget-object v1, p0, Ldy;->B:Ldx;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    iget-object v1, p0, Ldy;->C:Ldx;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    iget-object v1, p0, Ldy;->z:Ldx;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    nop

    :array_0
    .array-data 4
        0x7fffffff
        0x7fffffff
    .end array-data

    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method private a(Ldq;ZLdt;Ldt;IZLdx;Ldx;IIIIFZZIIIFZ)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p7

    move-object/from16 v14, p8

    move/from16 v1, p11

    move/from16 v2, p12

    invoke-virtual {v10, v13}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v9

    invoke-virtual {v10, v14}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v8

    iget-object v6, v13, Ldx;->d:Ldx;

    invoke-virtual {v10, v6}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v7

    iget-object v6, v14, Ldx;->d:Ldx;

    invoke-virtual {v10, v6}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v6

    iget-boolean v11, v10, Ldq;->d:Z

    const-wide/16 v15, 0x1

    move-object/from16 v21, v6

    if-eqz v11, :cond_2

    iget-object v11, v13, Ldx;->a:Lee;

    iget v11, v11, Lee;->i:I

    const/4 v6, 0x1

    if-ne v11, v6, :cond_2

    iget-object v11, v14, Ldx;->a:Lee;

    iget v11, v11, Lee;->i:I

    if-ne v11, v6, :cond_2

    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v1

    iget-wide v2, v1, Ldr;->s:J

    add-long/2addr v2, v15

    iput-wide v2, v1, Ldr;->s:J

    :cond_0
    iget-object v1, v13, Ldx;->a:Lee;

    invoke-virtual {v1, v10}, Lee;->a(Ldq;)V

    iget-object v1, v14, Ldx;->a:Lee;

    invoke-virtual {v1, v10}, Lee;->a(Ldq;)V

    if-nez p15, :cond_1

    if-eqz p2, :cond_1

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-virtual {v10, v12, v8, v1, v2}, Ldq;->a(Ldt;Ldt;II)V

    :cond_1
    return-void

    :cond_2
    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v6

    iget-wide v11, v6, Ldr;->B:J

    add-long/2addr v11, v15

    iput-wide v11, v6, Ldr;->B:J

    :cond_3
    invoke-virtual/range {p7 .. p7}, Ldx;->d()Z

    move-result v6

    invoke-virtual/range {p8 .. p8}, Ldx;->d()Z

    move-result v11

    iget-object v12, v0, Ldy;->C:Ldx;

    invoke-virtual {v12}, Ldx;->d()Z

    move-result v12

    if-eqz v6, :cond_4

    const/4 v15, 0x1

    goto :goto_0

    :cond_4
    const/4 v15, 0x0

    :goto_0
    if-eqz v11, :cond_5

    add-int/lit8 v15, v15, 0x1

    :cond_5
    if-eqz v12, :cond_6

    add-int/lit8 v15, v15, 0x1

    :cond_6
    move/from16 v23, v15

    if-eqz p14, :cond_7

    const/4 v14, 0x3

    goto :goto_1

    :cond_7
    move/from16 v14, p16

    :goto_1
    sget-object v15, Ldy$1;->b:[I

    const/16 v17, 0x1

    add-int/lit8 v16, p5, -0x1

    aget v15, v15, v16

    const/4 v3, 0x4

    packed-switch v15, :pswitch_data_0

    :goto_2
    :pswitch_0
    const/4 v15, 0x0

    goto :goto_3

    :pswitch_1
    if-ne v14, v3, :cond_8

    goto :goto_2

    :cond_8
    const/4 v15, 0x1

    :goto_3
    iget v3, v0, Ldy;->Y:I

    const/16 v0, 0x8

    if-ne v3, v0, :cond_9

    const/4 v0, 0x0

    const/4 v15, 0x0

    goto :goto_4

    :cond_9
    move/from16 v0, p10

    :goto_4
    if-eqz p20, :cond_b

    if-nez v6, :cond_a

    if-nez v11, :cond_a

    if-nez v12, :cond_a

    move/from16 v3, p9

    invoke-virtual {v10, v9, v3}, Ldq;->a(Ldt;I)V

    goto :goto_5

    :cond_a
    if-eqz v6, :cond_b

    if-nez v11, :cond_b

    invoke-virtual/range {p7 .. p7}, Ldx;->b()I

    move-result v3

    move/from16 v24, v12

    const/4 v12, 0x6

    invoke-virtual {v10, v9, v7, v3, v12}, Ldq;->c(Ldt;Ldt;II)Ldn;

    goto :goto_6

    :cond_b
    :goto_5
    move/from16 v24, v12

    const/4 v12, 0x6

    :goto_6
    if-nez v15, :cond_f

    if-eqz p6, :cond_d

    const/4 v3, 0x0

    const/4 v12, 0x3

    invoke-virtual {v10, v8, v9, v3, v12}, Ldq;->c(Ldt;Ldt;II)Ldn;

    if-lez v1, :cond_c

    const/4 v3, 0x6

    invoke-virtual {v10, v8, v9, v1, v3}, Ldq;->a(Ldt;Ldt;II)V

    goto :goto_7

    :cond_c
    const/4 v3, 0x6

    :goto_7
    const v0, 0x7fffffff

    if-ge v2, v0, :cond_e

    invoke-virtual {v10, v8, v9, v2, v3}, Ldq;->b(Ldt;Ldt;II)V

    goto :goto_8

    :cond_d
    move v3, v12

    invoke-virtual {v10, v8, v9, v0, v3}, Ldq;->c(Ldt;Ldt;II)Ldn;

    :cond_e
    :goto_8
    move/from16 v3, p17

    move/from16 v12, p18

    move-object/from16 v25, v7

    move/from16 v28, v23

    move-object/from16 v7, p0

    :goto_9
    const/16 v16, 0x4

    goto/16 :goto_12

    :cond_f
    move v3, v12

    const/4 v2, -0x2

    move/from16 v12, p17

    if-ne v12, v2, :cond_10

    move/from16 v12, p18

    move v3, v0

    goto :goto_a

    :cond_10
    move v3, v12

    move/from16 v12, p18

    :goto_a
    if-ne v12, v2, :cond_11

    move v12, v0

    :cond_11
    if-lez v3, :cond_12

    const/4 v2, 0x6

    invoke-virtual {v10, v8, v9, v3, v2}, Ldq;->a(Ldt;Ldt;II)V

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_b

    :cond_12
    const/4 v2, 0x6

    :goto_b
    if-lez v12, :cond_14

    if-eqz p2, :cond_13

    const/4 v2, 0x1

    invoke-virtual {v10, v8, v9, v12, v2}, Ldq;->b(Ldt;Ldt;II)V

    const/4 v2, 0x6

    goto :goto_c

    :cond_13
    invoke-virtual {v10, v8, v9, v12, v2}, Ldq;->b(Ldt;Ldt;II)V

    :goto_c
    invoke-static {v0, v12}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_14
    const/4 v2, 0x1

    if-ne v14, v2, :cond_17

    if-eqz p2, :cond_15

    const/4 v2, 0x6

    :goto_d
    invoke-virtual {v10, v8, v9, v0, v2}, Ldq;->c(Ldt;Ldt;II)Ldn;

    goto/16 :goto_10

    :cond_15
    if-eqz p15, :cond_16

    const/4 v2, 0x4

    goto :goto_d

    :cond_16
    const/4 v2, 0x1

    goto :goto_d

    :cond_17
    const/4 v2, 0x2

    if-ne v14, v2, :cond_1a

    iget-object v2, v13, Ldx;->c:Ldx$c;

    move-object/from16 v25, v7

    sget-object v7, Ldx$c;->c:Ldx$c;

    if-eq v2, v7, :cond_19

    iget-object v2, v13, Ldx;->c:Ldx$c;

    sget-object v7, Ldx$c;->e:Ldx$c;

    if-ne v2, v7, :cond_18

    goto :goto_e

    :cond_18
    move-object/from16 v7, p0

    iget-object v2, v7, Ldy;->G:Ldy;

    sget-object v13, Ldx$c;->b:Ldx$c;

    invoke-virtual {v2, v13}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v2

    invoke-virtual {v10, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v2

    iget-object v13, v7, Ldy;->G:Ldy;

    move-object/from16 v26, v2

    sget-object v2, Ldx$c;->d:Ldx$c;

    invoke-virtual {v13, v2}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v2

    invoke-virtual {v10, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v2

    move-object/from16 v18, v2

    move-object/from16 v19, v26

    goto :goto_f

    :cond_19
    :goto_e
    move-object/from16 v7, p0

    iget-object v2, v7, Ldy;->G:Ldy;

    sget-object v13, Ldx$c;->c:Ldx$c;

    invoke-virtual {v2, v13}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v2

    invoke-virtual {v10, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v2

    iget-object v13, v7, Ldy;->G:Ldy;

    move-object/from16 v27, v2

    sget-object v2, Ldx$c;->e:Ldx$c;

    invoke-virtual {v13, v2}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v2

    invoke-virtual {v10, v2}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v2

    move-object/from16 v18, v2

    move-object/from16 v19, v27

    :goto_f
    invoke-virtual/range {p1 .. p1}, Ldq;->c()Ldn;

    move-result-object v15

    move-object/from16 v16, v8

    move-object/from16 v17, v9

    move/from16 v20, p19

    invoke-virtual/range {v15 .. v20}, Ldn;->a(Ldt;Ldt;Ldt;Ldt;F)Ldn;

    move-result-object v2

    invoke-virtual {v10, v2}, Ldq;->a(Ldn;)V

    const/4 v15, 0x0

    goto :goto_11

    :cond_1a
    :goto_10
    move-object/from16 v25, v7

    move-object/from16 v7, p0

    :goto_11
    if-eqz v15, :cond_1e

    move/from16 v2, v23

    const/4 v13, 0x2

    if-eq v2, v13, :cond_1d

    const/16 v16, 0x4

    if-nez p14, :cond_1c

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lez v12, :cond_1b

    invoke-static {v12, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_1b
    move/from16 v28, v2

    const/4 v2, 0x6

    invoke-virtual {v10, v8, v9, v0, v2}, Ldq;->c(Ldt;Ldt;II)Ldn;

    const/4 v15, 0x0

    goto :goto_12

    :cond_1c
    move/from16 v28, v2

    goto :goto_12

    :cond_1d
    move/from16 v28, v2

    goto/16 :goto_9

    :cond_1e
    move/from16 v28, v23

    goto/16 :goto_9

    :goto_12
    if-eqz p20, :cond_34

    if-eqz p15, :cond_1f

    goto/16 :goto_20

    :cond_1f
    const/4 v0, 0x5

    if-nez v6, :cond_22

    if-nez v11, :cond_22

    if-nez v24, :cond_22

    if-eqz p2, :cond_20

    const/4 v4, 0x0

    move-object/from16 v5, p4

    :goto_13
    invoke-virtual {v10, v5, v8, v4, v0}, Ldq;->a(Ldt;Ldt;II)V

    goto :goto_14

    :cond_20
    move-object v13, v8

    const/4 v1, 0x6

    :cond_21
    const/4 v2, 0x0

    goto/16 :goto_1f

    :cond_22
    const/4 v4, 0x0

    move-object/from16 v5, p4

    if-eqz v6, :cond_24

    if-nez v11, :cond_24

    if-eqz p2, :cond_23

    goto :goto_13

    :cond_23
    :goto_14
    move v2, v4

    move-object v13, v8

    const/4 v1, 0x6

    goto/16 :goto_1f

    :cond_24
    if-nez v6, :cond_25

    if-eqz v11, :cond_25

    invoke-virtual/range {p8 .. p8}, Ldx;->b()I

    move-result v1

    neg-int v1, v1

    move-object/from16 v2, v21

    const/4 v3, 0x6

    invoke-virtual {v10, v8, v2, v1, v3}, Ldq;->c(Ldt;Ldt;II)Ldn;

    if-eqz p2, :cond_23

    move-object/from16 v1, p3

    invoke-virtual {v10, v9, v1, v4, v0}, Ldq;->a(Ldt;Ldt;II)V

    goto :goto_14

    :cond_25
    move-object/from16 v2, v21

    if-eqz v6, :cond_23

    if-eqz v11, :cond_23

    if-eqz v15, :cond_2f

    if-eqz p2, :cond_26

    if-nez v1, :cond_26

    const/4 v6, 0x6

    invoke-virtual {v10, v8, v9, v4, v6}, Ldq;->a(Ldt;Ldt;II)V

    goto :goto_15

    :cond_26
    const/4 v6, 0x6

    :goto_15
    if-nez v14, :cond_2b

    if-gtz v12, :cond_28

    if-lez v3, :cond_27

    goto :goto_16

    :cond_27
    move v11, v4

    move v1, v6

    goto :goto_17

    :cond_28
    :goto_16
    move/from16 v1, v16

    const/4 v11, 0x1

    :goto_17
    invoke-virtual/range {p7 .. p7}, Ldx;->b()I

    move-result v13

    move-object/from16 v14, v25

    invoke-virtual {v10, v9, v14, v13, v1}, Ldq;->c(Ldt;Ldt;II)Ldn;

    invoke-virtual/range {p8 .. p8}, Ldx;->b()I

    move-result v13

    neg-int v13, v13

    invoke-virtual {v10, v8, v2, v13, v1}, Ldq;->c(Ldt;Ldt;II)Ldn;

    if-gtz v12, :cond_2a

    if-lez v3, :cond_29

    goto :goto_18

    :cond_29
    move/from16 v22, v4

    goto :goto_19

    :cond_2a
    :goto_18
    const/16 v22, 0x1

    :goto_19
    move v12, v11

    move-object v11, v14

    move/from16 v1, v22

    goto :goto_1c

    :cond_2b
    move-object/from16 v11, v25

    const/4 v1, 0x1

    if-ne v14, v1, :cond_2c

    move v12, v1

    move v0, v6

    goto :goto_1c

    :cond_2c
    const/4 v3, 0x3

    if-ne v14, v3, :cond_2e

    if-nez p14, :cond_2d

    iget v3, v7, Ldy;->r:I

    const/4 v13, -0x1

    if-eq v3, v13, :cond_2d

    if-gtz v12, :cond_2d

    move v3, v6

    goto :goto_1a

    :cond_2d
    move/from16 v3, v16

    :goto_1a
    invoke-virtual/range {p7 .. p7}, Ldx;->b()I

    move-result v12

    invoke-virtual {v10, v9, v11, v12, v3}, Ldq;->c(Ldt;Ldt;II)Ldn;

    invoke-virtual/range {p8 .. p8}, Ldx;->b()I

    move-result v12

    neg-int v12, v12

    invoke-virtual {v10, v8, v2, v12, v3}, Ldq;->c(Ldt;Ldt;II)Ldn;

    goto :goto_1b

    :cond_2e
    move v1, v4

    :goto_1b
    move v12, v1

    goto :goto_1c

    :cond_2f
    move-object/from16 v11, v25

    const/4 v1, 0x1

    const/4 v6, 0x6

    if-eqz p2, :cond_30

    invoke-virtual/range {p7 .. p7}, Ldx;->b()I

    move-result v3

    invoke-virtual {v10, v9, v11, v3, v0}, Ldq;->a(Ldt;Ldt;II)V

    invoke-virtual/range {p8 .. p8}, Ldx;->b()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {v10, v8, v2, v3, v0}, Ldq;->b(Ldt;Ldt;II)V

    :cond_30
    move v12, v4

    :goto_1c
    if-eqz v1, :cond_31

    invoke-virtual/range {p7 .. p7}, Ldx;->b()I

    move-result v13

    invoke-virtual/range {p8 .. p8}, Ldx;->b()I

    move-result v14

    move-object v1, v10

    move-object v15, v2

    move-object v2, v9

    move-object v3, v11

    move/from16 v16, v4

    move v4, v13

    move-object v13, v5

    move/from16 v5, p13

    move-object/from16 v30, v11

    move-object/from16 v29, v15

    move v11, v6

    move-object/from16 v6, v29

    move-object/from16 v11, v30

    move-object v7, v8

    move-object v13, v8

    move v8, v14

    move-object v14, v9

    move v9, v0

    invoke-virtual/range {v1 .. v9}, Ldq;->a(Ldt;Ldt;IFLdt;Ldt;II)V

    goto :goto_1d

    :cond_31
    move-object/from16 v29, v2

    move-object v13, v8

    move-object v14, v9

    :goto_1d
    if-eqz v12, :cond_32

    invoke-virtual/range {p7 .. p7}, Ldx;->b()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v10, v14, v11, v0, v1}, Ldq;->a(Ldt;Ldt;II)V

    invoke-virtual/range {p8 .. p8}, Ldx;->b()I

    move-result v0

    neg-int v0, v0

    move-object/from16 v2, v29

    invoke-virtual {v10, v13, v2, v0, v1}, Ldq;->b(Ldt;Ldt;II)V

    goto :goto_1e

    :cond_32
    const/4 v1, 0x6

    :goto_1e
    if-eqz p2, :cond_21

    move-object/from16 v0, p3

    const/4 v2, 0x0

    invoke-virtual {v10, v14, v0, v2, v1}, Ldq;->a(Ldt;Ldt;II)V

    :goto_1f
    if-eqz p2, :cond_33

    move-object v4, v13

    move-object/from16 v3, p4

    invoke-virtual {v10, v3, v4, v2, v1}, Ldq;->a(Ldt;Ldt;II)V

    :cond_33
    return-void

    :cond_34
    :goto_20
    move-object v4, v8

    move-object v14, v9

    move/from16 v5, v28

    move-object/from16 v0, p3

    const/4 v1, 0x6

    const/4 v2, 0x0

    move-object/from16 v3, p4

    const/4 v6, 0x2

    if-ge v5, v6, :cond_35

    if-eqz p2, :cond_35

    invoke-virtual {v10, v14, v0, v2, v1}, Ldq;->a(Ldt;Ldt;II)V

    invoke-virtual {v10, v3, v4, v2, v1}, Ldq;->a(Ldt;Ldt;II)V

    :cond_35
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a(Ldx$c;)Ldx;
    .locals 2

    sget-object v0, Ldy$1;->a:[I

    invoke-virtual {p1}, Ldx$c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ldx$c;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget-object p1, p0, Ldy;->B:Ldx;

    return-object p1

    :pswitch_2
    iget-object p1, p0, Ldy;->A:Ldx;

    return-object p1

    :pswitch_3
    iget-object p1, p0, Ldy;->C:Ldx;

    return-object p1

    :pswitch_4
    iget-object p1, p0, Ldy;->z:Ldx;

    return-object p1

    :pswitch_5
    iget-object p1, p0, Ldy;->y:Ldx;

    return-object p1

    :pswitch_6
    iget-object p1, p0, Ldy;->x:Ldx;

    return-object p1

    :pswitch_7
    iget-object p1, p0, Ldy;->w:Ldx;

    return-object p1

    :pswitch_8
    iget-object p1, p0, Ldy;->v:Ldx;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a(I)V
    .locals 0

    invoke-static {p1, p0}, Lec;->a(ILdy;)V

    return-void
.end method

.method public final a(II)V
    .locals 0

    iput p1, p0, Ldy;->L:I

    iput p2, p0, Ldy;->M:I

    return-void
.end method

.method public a(Ldo;)V
    .locals 0

    iget-object p1, p0, Ldy;->v:Ldx;

    invoke-virtual {p1}, Ldx;->a()V

    iget-object p1, p0, Ldy;->w:Ldx;

    invoke-virtual {p1}, Ldx;->a()V

    iget-object p1, p0, Ldy;->x:Ldx;

    invoke-virtual {p1}, Ldx;->a()V

    iget-object p1, p0, Ldy;->y:Ldx;

    invoke-virtual {p1}, Ldx;->a()V

    iget-object p1, p0, Ldy;->z:Ldx;

    invoke-virtual {p1}, Ldx;->a()V

    iget-object p1, p0, Ldy;->C:Ldx;

    invoke-virtual {p1}, Ldx;->a()V

    iget-object p1, p0, Ldy;->A:Ldx;

    invoke-virtual {p1}, Ldx;->a()V

    iget-object p1, p0, Ldy;->B:Ldx;

    invoke-virtual {p1}, Ldx;->a()V

    return-void
.end method

.method public a(Ldq;)V
    .locals 41

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    iget-object v0, v15, Ldy;->v:Ldx;

    invoke-virtual {v14, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v21

    iget-object v0, v15, Ldy;->x:Ldx;

    invoke-virtual {v14, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v13

    iget-object v0, v15, Ldy;->w:Ldx;

    invoke-virtual {v14, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v12

    iget-object v0, v15, Ldy;->y:Ldx;

    invoke-virtual {v14, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v11

    iget-object v0, v15, Ldy;->z:Ldx;

    invoke-virtual {v14, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v10

    iget-object v0, v15, Ldy;->G:Ldy;

    const/16 v1, 0x8

    const/4 v9, 0x1

    const/4 v8, 0x0

    if-eqz v0, :cond_c

    iget-object v0, v15, Ldy;->G:Ldy;

    if-eqz v0, :cond_0

    iget-object v0, v15, Ldy;->G:Ldy;

    iget-object v0, v0, Ldy;->F:[I

    aget v0, v0, v8

    sget v2, Ldy$a;->b:I

    if-ne v0, v2, :cond_0

    move v0, v9

    goto :goto_0

    :cond_0
    move v0, v8

    :goto_0
    iget-object v2, v15, Ldy;->G:Ldy;

    if-eqz v2, :cond_1

    iget-object v2, v15, Ldy;->G:Ldy;

    iget-object v2, v2, Ldy;->F:[I

    aget v2, v2, v9

    sget v3, Ldy$a;->b:I

    if-ne v2, v3, :cond_1

    move v2, v9

    goto :goto_1

    :cond_1
    move v2, v8

    :goto_1
    iget-object v3, v15, Ldy;->v:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-eqz v3, :cond_2

    iget-object v3, v15, Ldy;->v:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    iget-object v4, v15, Ldy;->v:Ldx;

    if-eq v3, v4, :cond_2

    iget-object v3, v15, Ldy;->x:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-eqz v3, :cond_2

    iget-object v3, v15, Ldy;->x:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    iget-object v4, v15, Ldy;->x:Ldx;

    if-ne v3, v4, :cond_2

    iget-object v3, v15, Ldy;->G:Ldy;

    check-cast v3, Ldz;

    invoke-virtual {v3, v15, v8}, Ldz;->a(Ldy;I)V

    :cond_2
    iget-object v3, v15, Ldy;->v:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-eqz v3, :cond_3

    iget-object v3, v15, Ldy;->v:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    iget-object v4, v15, Ldy;->v:Ldx;

    if-eq v3, v4, :cond_4

    :cond_3
    iget-object v3, v15, Ldy;->x:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    if-eqz v3, :cond_5

    iget-object v3, v15, Ldy;->x:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    iget-object v3, v3, Ldx;->d:Ldx;

    iget-object v4, v15, Ldy;->x:Ldx;

    if-ne v3, v4, :cond_5

    :cond_4
    move v3, v9

    goto :goto_2

    :cond_5
    move v3, v8

    :goto_2
    iget-object v4, v15, Ldy;->w:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    if-eqz v4, :cond_6

    iget-object v4, v15, Ldy;->w:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    iget-object v5, v15, Ldy;->w:Ldx;

    if-eq v4, v5, :cond_6

    iget-object v4, v15, Ldy;->y:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    if-eqz v4, :cond_6

    iget-object v4, v15, Ldy;->y:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    iget-object v5, v15, Ldy;->y:Ldx;

    if-ne v4, v5, :cond_6

    iget-object v4, v15, Ldy;->G:Ldy;

    check-cast v4, Ldz;

    invoke-virtual {v4, v15, v9}, Ldz;->a(Ldy;I)V

    :cond_6
    iget-object v4, v15, Ldy;->w:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    if-eqz v4, :cond_7

    iget-object v4, v15, Ldy;->w:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    iget-object v5, v15, Ldy;->w:Ldx;

    if-eq v4, v5, :cond_8

    :cond_7
    iget-object v4, v15, Ldy;->y:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    if-eqz v4, :cond_9

    iget-object v4, v15, Ldy;->y:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    iget-object v4, v4, Ldx;->d:Ldx;

    iget-object v5, v15, Ldy;->y:Ldx;

    if-ne v4, v5, :cond_9

    :cond_8
    move v4, v9

    goto :goto_3

    :cond_9
    move v4, v8

    :goto_3
    if-eqz v0, :cond_a

    iget v5, v15, Ldy;->Y:I

    if-eq v5, v1, :cond_a

    iget-object v5, v15, Ldy;->v:Ldx;

    iget-object v5, v5, Ldx;->d:Ldx;

    if-nez v5, :cond_a

    iget-object v5, v15, Ldy;->x:Ldx;

    iget-object v5, v5, Ldx;->d:Ldx;

    if-nez v5, :cond_a

    iget-object v5, v15, Ldy;->G:Ldy;

    iget-object v5, v5, Ldy;->x:Ldx;

    invoke-virtual {v14, v5}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v5

    invoke-virtual {v14, v5, v13, v8, v9}, Ldq;->a(Ldt;Ldt;II)V

    :cond_a
    if-eqz v2, :cond_b

    iget v5, v15, Ldy;->Y:I

    if-eq v5, v1, :cond_b

    iget-object v5, v15, Ldy;->w:Ldx;

    iget-object v5, v5, Ldx;->d:Ldx;

    if-nez v5, :cond_b

    iget-object v5, v15, Ldy;->y:Ldx;

    iget-object v5, v5, Ldx;->d:Ldx;

    if-nez v5, :cond_b

    iget-object v5, v15, Ldy;->z:Ldx;

    if-nez v5, :cond_b

    iget-object v5, v15, Ldy;->G:Ldy;

    iget-object v5, v5, Ldy;->y:Ldx;

    invoke-virtual {v14, v5}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v5

    invoke-virtual {v14, v5, v11, v8, v9}, Ldq;->a(Ldt;Ldt;II)V

    :cond_b
    move/from16 v22, v2

    move/from16 v16, v3

    move/from16 v23, v4

    move v2, v0

    goto :goto_4

    :cond_c
    move v2, v8

    move/from16 v16, v2

    move/from16 v22, v16

    move/from16 v23, v22

    :goto_4
    iget v0, v15, Ldy;->H:I

    iget v3, v15, Ldy;->Q:I

    if-ge v0, v3, :cond_d

    iget v0, v15, Ldy;->Q:I

    :cond_d
    iget v3, v15, Ldy;->I:I

    iget v4, v15, Ldy;->R:I

    if-ge v3, v4, :cond_e

    iget v3, v15, Ldy;->R:I

    :cond_e
    iget-object v4, v15, Ldy;->F:[I

    aget v4, v4, v8

    sget v5, Ldy$a;->c:I

    if-eq v4, v5, :cond_f

    move v4, v9

    goto :goto_5

    :cond_f
    move v4, v8

    :goto_5
    iget-object v5, v15, Ldy;->F:[I

    aget v5, v5, v9

    sget v6, Ldy$a;->c:I

    if-eq v5, v6, :cond_10

    move v5, v9

    goto :goto_6

    :cond_10
    move v5, v8

    :goto_6
    iget v6, v15, Ldy;->K:I

    iput v6, v15, Ldy;->r:I

    iget v6, v15, Ldy;->J:F

    iput v6, v15, Ldy;->s:F

    iget v6, v15, Ldy;->g:I

    iget v7, v15, Ldy;->h:I

    iget v9, v15, Ldy;->J:F

    const/16 v17, 0x0

    cmpl-float v9, v9, v17

    const/16 v17, 0x4

    if-lez v9, :cond_26

    iget v9, v15, Ldy;->Y:I

    if-eq v9, v1, :cond_26

    iget-object v1, v15, Ldy;->F:[I

    const/4 v9, 0x0

    aget v1, v1, v9

    sget v9, Ldy$a;->c:I

    const/4 v8, 0x3

    if-ne v1, v9, :cond_11

    if-nez v6, :cond_11

    move v6, v8

    :cond_11
    iget-object v1, v15, Ldy;->F:[I

    const/4 v9, 0x1

    aget v1, v1, v9

    sget v9, Ldy$a;->c:I

    if-ne v1, v9, :cond_12

    if-nez v7, :cond_12

    move v7, v8

    :cond_12
    iget-object v1, v15, Ldy;->F:[I

    const/4 v9, 0x0

    aget v1, v1, v9

    sget v9, Ldy$a;->c:I

    const/high16 v18, 0x3f800000    # 1.0f

    if-ne v1, v9, :cond_20

    iget-object v1, v15, Ldy;->F:[I

    const/4 v9, 0x1

    aget v1, v1, v9

    sget v9, Ldy$a;->c:I

    if-ne v1, v9, :cond_20

    if-ne v6, v8, :cond_20

    if-ne v7, v8, :cond_20

    iget v1, v15, Ldy;->r:I

    const/4 v8, -0x1

    if-ne v1, v8, :cond_14

    if-eqz v4, :cond_13

    if-nez v5, :cond_13

    const/4 v1, 0x0

    iput v1, v15, Ldy;->r:I

    goto :goto_7

    :cond_13
    if-nez v4, :cond_14

    if-eqz v5, :cond_14

    const/4 v1, 0x1

    iput v1, v15, Ldy;->r:I

    iget v1, v15, Ldy;->K:I

    if-ne v1, v8, :cond_14

    iget v1, v15, Ldy;->s:F

    div-float v1, v18, v1

    iput v1, v15, Ldy;->s:F

    :cond_14
    :goto_7
    iget v1, v15, Ldy;->r:I

    if-nez v1, :cond_16

    iget-object v1, v15, Ldy;->w:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-eqz v1, :cond_15

    iget-object v1, v15, Ldy;->y:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-nez v1, :cond_16

    :cond_15
    const/4 v1, 0x1

    :goto_8
    iput v1, v15, Ldy;->r:I

    goto :goto_9

    :cond_16
    const/4 v1, 0x1

    iget v4, v15, Ldy;->r:I

    if-ne v4, v1, :cond_18

    iget-object v1, v15, Ldy;->v:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-eqz v1, :cond_17

    iget-object v1, v15, Ldy;->x:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-nez v1, :cond_18

    :cond_17
    const/4 v1, 0x0

    goto :goto_8

    :cond_18
    :goto_9
    iget v1, v15, Ldy;->r:I

    const/4 v4, -0x1

    if-ne v1, v4, :cond_1b

    iget-object v1, v15, Ldy;->w:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-eqz v1, :cond_19

    iget-object v1, v15, Ldy;->y:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-eqz v1, :cond_19

    iget-object v1, v15, Ldy;->v:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-eqz v1, :cond_19

    iget-object v1, v15, Ldy;->x:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-nez v1, :cond_1b

    :cond_19
    iget-object v1, v15, Ldy;->w:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-eqz v1, :cond_1a

    iget-object v1, v15, Ldy;->y:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-eqz v1, :cond_1a

    const/4 v1, 0x0

    :goto_a
    iput v1, v15, Ldy;->r:I

    goto :goto_b

    :cond_1a
    iget-object v1, v15, Ldy;->v:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-eqz v1, :cond_1b

    iget-object v1, v15, Ldy;->x:Ldx;

    invoke-virtual {v1}, Ldx;->d()Z

    move-result v1

    if-eqz v1, :cond_1b

    iget v1, v15, Ldy;->s:F

    div-float v1, v18, v1

    iput v1, v15, Ldy;->s:F

    const/4 v1, 0x1

    goto :goto_a

    :cond_1b
    :goto_b
    iget v1, v15, Ldy;->r:I

    const/4 v4, -0x1

    if-ne v1, v4, :cond_1d

    if-eqz v2, :cond_1c

    if-nez v22, :cond_1c

    const/4 v1, 0x0

    :goto_c
    iput v1, v15, Ldy;->r:I

    goto :goto_d

    :cond_1c
    if-nez v2, :cond_1d

    if-eqz v22, :cond_1d

    iget v1, v15, Ldy;->s:F

    div-float v1, v18, v1

    iput v1, v15, Ldy;->s:F

    const/4 v1, 0x1

    goto :goto_c

    :cond_1d
    :goto_d
    iget v1, v15, Ldy;->r:I

    const/4 v4, -0x1

    if-ne v1, v4, :cond_1f

    iget v1, v15, Ldy;->j:I

    if-lez v1, :cond_1e

    iget v1, v15, Ldy;->m:I

    if-nez v1, :cond_1e

    const/4 v1, 0x0

    :goto_e
    iput v1, v15, Ldy;->r:I

    goto :goto_f

    :cond_1e
    iget v1, v15, Ldy;->j:I

    if-nez v1, :cond_1f

    iget v1, v15, Ldy;->m:I

    if-lez v1, :cond_1f

    iget v1, v15, Ldy;->s:F

    div-float v1, v18, v1

    iput v1, v15, Ldy;->s:F

    const/4 v1, 0x1

    goto :goto_e

    :cond_1f
    :goto_f
    iget v1, v15, Ldy;->r:I

    const/4 v4, -0x1

    if-ne v1, v4, :cond_25

    if-eqz v2, :cond_25

    if-eqz v22, :cond_25

    iget v1, v15, Ldy;->s:F

    div-float v1, v18, v1

    iput v1, v15, Ldy;->s:F

    const/4 v1, 0x1

    iput v1, v15, Ldy;->r:I

    goto/16 :goto_10

    :cond_20
    iget-object v1, v15, Ldy;->F:[I

    const/4 v4, 0x0

    aget v1, v1, v4

    sget v5, Ldy$a;->c:I

    if-ne v1, v5, :cond_22

    if-ne v6, v8, :cond_22

    iput v4, v15, Ldy;->r:I

    iget v0, v15, Ldy;->s:F

    iget v1, v15, Ldy;->I:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, v15, Ldy;->F:[I

    const/4 v4, 0x1

    aget v1, v1, v4

    sget v5, Ldy$a;->c:I

    if-eq v1, v5, :cond_21

    move/from16 v18, v0

    move/from16 v29, v3

    goto :goto_12

    :cond_21
    move/from16 v18, v0

    move/from16 v29, v3

    move/from16 v28, v4

    move/from16 v17, v6

    move/from16 v27, v7

    goto :goto_13

    :cond_22
    const/4 v4, 0x1

    iget-object v1, v15, Ldy;->F:[I

    aget v1, v1, v4

    sget v5, Ldy$a;->c:I

    if-ne v1, v5, :cond_25

    if-ne v7, v8, :cond_25

    iput v4, v15, Ldy;->r:I

    iget v1, v15, Ldy;->K:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_23

    iget v1, v15, Ldy;->s:F

    div-float v1, v18, v1

    iput v1, v15, Ldy;->s:F

    :cond_23
    iget v1, v15, Ldy;->s:F

    iget v3, v15, Ldy;->H:I

    int-to-float v3, v3

    mul-float/2addr v1, v3

    float-to-int v1, v1

    iget-object v3, v15, Ldy;->F:[I

    const/4 v4, 0x0

    aget v3, v3, v4

    sget v4, Ldy$a;->c:I

    if-eq v3, v4, :cond_24

    move/from16 v18, v0

    move/from16 v29, v1

    move/from16 v27, v17

    const/16 v28, 0x0

    move/from16 v17, v6

    goto :goto_13

    :cond_24
    move/from16 v18, v0

    move/from16 v29, v1

    goto :goto_11

    :cond_25
    :goto_10
    move/from16 v18, v0

    move/from16 v29, v3

    :goto_11
    move/from16 v17, v6

    move/from16 v27, v7

    const/16 v28, 0x1

    goto :goto_13

    :cond_26
    move/from16 v18, v0

    move/from16 v29, v3

    move/from16 v17, v6

    :goto_12
    move/from16 v27, v7

    const/16 v28, 0x0

    :goto_13
    iget-object v0, v15, Ldy;->i:[I

    const/4 v1, 0x0

    aput v17, v0, v1

    iget-object v0, v15, Ldy;->i:[I

    const/4 v1, 0x1

    aput v27, v0, v1

    if-eqz v28, :cond_28

    iget v0, v15, Ldy;->r:I

    if-eqz v0, :cond_27

    iget v0, v15, Ldy;->r:I

    const/4 v8, -0x1

    if-ne v0, v8, :cond_29

    goto :goto_14

    :cond_27
    const/4 v8, -0x1

    :goto_14
    const/16 v19, 0x1

    goto :goto_15

    :cond_28
    const/4 v8, -0x1

    :cond_29
    const/16 v19, 0x0

    :goto_15
    iget-object v0, v15, Ldy;->F:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    sget v1, Ldy$a;->b:I

    if-ne v0, v1, :cond_2a

    instance-of v0, v15, Ldz;

    if-eqz v0, :cond_2a

    const/4 v6, 0x1

    goto :goto_16

    :cond_2a
    const/4 v6, 0x0

    :goto_16
    iget-object v0, v15, Ldy;->C:Ldx;

    invoke-virtual {v0}, Ldx;->d()Z

    move-result v0

    const/4 v9, 0x1

    xor-int/lit8 v24, v0, 0x1

    iget v0, v15, Ldy;->c:I

    const/4 v7, 0x2

    const/16 v26, 0x0

    if-eq v0, v7, :cond_2d

    iget-object v0, v15, Ldy;->G:Ldy;

    if-eqz v0, :cond_2b

    iget-object v0, v15, Ldy;->G:Ldy;

    iget-object v0, v0, Ldy;->x:Ldx;

    invoke-virtual {v14, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v0

    move-object v4, v0

    goto :goto_17

    :cond_2b
    move-object/from16 v4, v26

    :goto_17
    iget-object v0, v15, Ldy;->G:Ldy;

    if-eqz v0, :cond_2c

    iget-object v0, v15, Ldy;->G:Ldy;

    iget-object v0, v0, Ldy;->v:Ldx;

    invoke-virtual {v14, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v0

    move-object v3, v0

    goto :goto_18

    :cond_2c
    move-object/from16 v3, v26

    :goto_18
    iget-object v0, v15, Ldy;->F:[I

    const/16 v20, 0x0

    aget v5, v0, v20

    iget-object v1, v15, Ldy;->v:Ldx;

    iget-object v0, v15, Ldy;->x:Ldx;

    iget v9, v15, Ldy;->L:I

    move-object/from16 v31, v11

    iget v11, v15, Ldy;->Q:I

    iget-object v7, v15, Ldy;->t:[I

    aget v25, v7, v20

    iget v7, v15, Ldy;->V:F

    move-object/from16 v33, v13

    iget v13, v15, Ldy;->j:I

    move/from16 v34, v13

    iget v13, v15, Ldy;->k:I

    move/from16 v35, v13

    iget v13, v15, Ldy;->l:F

    move-object/from16 v36, v0

    move-object v0, v15

    move-object/from16 v37, v1

    move-object v1, v14

    move/from16 v32, v7

    move-object/from16 v7, v37

    move-object/from16 v8, v36

    move-object/from16 v38, v10

    move/from16 v10, v18

    move-object/from16 v30, v31

    move-object/from16 v39, v12

    move/from16 v12, v25

    move/from16 v31, v13

    move-object/from16 v25, v33

    move/from16 v18, v34

    move/from16 v20, v35

    move/from16 v13, v32

    move/from16 v14, v19

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v20

    move/from16 v19, v31

    move/from16 v20, v24

    invoke-direct/range {v0 .. v20}, Ldy;->a(Ldq;ZLdt;Ldt;IZLdx;Ldx;IIIIFZZIIIFZ)V

    move-object/from16 v15, p0

    goto :goto_19

    :cond_2d
    move-object/from16 v38, v10

    move-object/from16 v30, v11

    move-object/from16 v39, v12

    move-object/from16 v25, v13

    :goto_19
    iget v0, v15, Ldy;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2e

    return-void

    :cond_2e
    iget-object v0, v15, Ldy;->F:[I

    const/4 v14, 0x1

    aget v0, v0, v14

    sget v1, Ldy$a;->b:I

    if-ne v0, v1, :cond_2f

    instance-of v0, v15, Ldz;

    if-eqz v0, :cond_2f

    move v6, v14

    goto :goto_1a

    :cond_2f
    const/4 v6, 0x0

    :goto_1a
    if-eqz v28, :cond_31

    iget v0, v15, Ldy;->r:I

    if-eq v0, v14, :cond_30

    iget v0, v15, Ldy;->r:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_31

    :cond_30
    move/from16 v16, v14

    goto :goto_1b

    :cond_31
    const/16 v16, 0x0

    :goto_1b
    iget v0, v15, Ldy;->P:I

    if-lez v0, :cond_33

    iget-object v0, v15, Ldy;->z:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    iget v0, v0, Lee;->i:I

    if-ne v0, v14, :cond_32

    iget-object v0, v15, Ldy;->z:Ldx;

    iget-object v0, v0, Ldx;->a:Lee;

    move-object/from16 v13, p1

    invoke-virtual {v0, v13}, Lee;->a(Ldq;)V

    move-object/from16 v12, v39

    goto :goto_1c

    :cond_32
    move-object/from16 v13, p1

    iget v0, v15, Ldy;->P:I

    const/4 v1, 0x6

    move-object/from16 v2, v38

    move-object/from16 v12, v39

    invoke-virtual {v13, v2, v12, v0, v1}, Ldq;->c(Ldt;Ldt;II)Ldn;

    iget-object v0, v15, Ldy;->z:Ldx;

    iget-object v0, v0, Ldx;->d:Ldx;

    if-eqz v0, :cond_34

    iget-object v0, v15, Ldy;->z:Ldx;

    iget-object v0, v0, Ldx;->d:Ldx;

    invoke-virtual {v13, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v13, v2, v0, v3, v1}, Ldq;->c(Ldt;Ldt;II)Ldn;

    move/from16 v20, v3

    goto :goto_1d

    :cond_33
    move-object/from16 v12, v39

    move-object/from16 v13, p1

    :cond_34
    :goto_1c
    move/from16 v20, v24

    :goto_1d
    iget-object v0, v15, Ldy;->G:Ldy;

    if-eqz v0, :cond_35

    iget-object v0, v15, Ldy;->G:Ldy;

    iget-object v0, v0, Ldy;->y:Ldx;

    invoke-virtual {v13, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v0

    move-object v4, v0

    goto :goto_1e

    :cond_35
    move-object/from16 v4, v26

    :goto_1e
    iget-object v0, v15, Ldy;->G:Ldy;

    if-eqz v0, :cond_36

    iget-object v0, v15, Ldy;->G:Ldy;

    iget-object v0, v0, Ldy;->w:Ldx;

    invoke-virtual {v13, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v0

    move-object v3, v0

    goto :goto_1f

    :cond_36
    move-object/from16 v3, v26

    :goto_1f
    iget-object v0, v15, Ldy;->F:[I

    aget v5, v0, v14

    iget-object v7, v15, Ldy;->w:Ldx;

    iget-object v8, v15, Ldy;->y:Ldx;

    iget v9, v15, Ldy;->M:I

    iget v11, v15, Ldy;->R:I

    iget-object v0, v15, Ldy;->t:[I

    aget v17, v0, v14

    iget v10, v15, Ldy;->W:F

    iget v2, v15, Ldy;->m:I

    iget v1, v15, Ldy;->n:I

    iget v0, v15, Ldy;->o:F

    move/from16 v19, v0

    move-object v0, v15

    move/from16 v18, v1

    move-object v1, v13

    move/from16 v24, v2

    move/from16 v2, v22

    move/from16 v22, v10

    move/from16 v10, v29

    move-object/from16 v26, v12

    move/from16 v12, v17

    move/from16 v13, v22

    move/from16 v14, v16

    move/from16 v15, v23

    move/from16 v16, v27

    move/from16 v17, v24

    invoke-direct/range {v0 .. v20}, Ldy;->a(Ldq;ZLdt;Ldt;IZLdx;Ldx;IIIIFZZIIIFZ)V

    if-eqz v28, :cond_38

    move-object/from16 v6, p0

    iget v0, v6, Ldy;->r:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_37

    iget v5, v6, Ldy;->s:F

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    move-object/from16 v2, v26

    move-object/from16 v3, v25

    move-object/from16 v4, v21

    :goto_20
    invoke-virtual/range {v0 .. v5}, Ldq;->a(Ldt;Ldt;Ldt;Ldt;F)V

    goto :goto_21

    :cond_37
    iget v5, v6, Ldy;->s:F

    move-object/from16 v0, p1

    move-object/from16 v1, v25

    move-object/from16 v2, v21

    move-object/from16 v3, v30

    move-object/from16 v4, v26

    goto :goto_20

    :cond_38
    move-object/from16 v6, p0

    :goto_21
    iget-object v0, v6, Ldy;->C:Ldx;

    invoke-virtual {v0}, Ldx;->d()Z

    move-result v0

    if-eqz v0, :cond_39

    iget-object v0, v6, Ldy;->C:Ldx;

    iget-object v0, v0, Ldx;->d:Ldx;

    iget-object v0, v0, Ldx;->b:Ldy;

    iget v1, v6, Ldy;->u:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v6, Ldy;->C:Ldx;

    invoke-virtual {v2}, Ldx;->b()I

    move-result v2

    sget-object v3, Ldx$c;->b:Ldx$c;

    invoke-virtual {v6, v3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v3

    move-object/from16 v4, p1

    invoke-virtual {v4, v3}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v8

    sget-object v3, Ldx$c;->c:Ldx$c;

    invoke-virtual {v6, v3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v3

    invoke-virtual {v4, v3}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v10

    sget-object v3, Ldx$c;->d:Ldx$c;

    invoke-virtual {v6, v3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v3

    invoke-virtual {v4, v3}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v3

    sget-object v5, Ldx$c;->e:Ldx$c;

    invoke-virtual {v6, v5}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v5

    invoke-virtual {v4, v5}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v11

    sget-object v5, Ldx$c;->b:Ldx$c;

    invoke-virtual {v0, v5}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v5

    invoke-virtual {v4, v5}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v5

    sget-object v7, Ldx$c;->c:Ldx$c;

    invoke-virtual {v0, v7}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v7

    invoke-virtual {v4, v7}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v12

    sget-object v7, Ldx$c;->d:Ldx$c;

    invoke-virtual {v0, v7}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v7

    invoke-virtual {v4, v7}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v15

    sget-object v7, Ldx$c;->e:Ldx$c;

    invoke-virtual {v0, v7}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v0

    invoke-virtual {v4, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Ldq;->c()Ldn;

    move-result-object v0

    float-to-double v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v16

    int-to-double v1, v2

    move-object/from16 v40, v15

    mul-double v14, v16, v1

    double-to-float v14, v14

    move-object v9, v0

    invoke-virtual/range {v9 .. v14}, Ldn;->b(Ldt;Ldt;Ldt;Ldt;F)Ldn;

    invoke-virtual {v4, v0}, Ldq;->a(Ldn;)V

    invoke-virtual/range {p1 .. p1}, Ldq;->c()Ldn;

    move-result-object v0

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double/2addr v6, v1

    double-to-float v12, v6

    move-object v7, v0

    move-object v9, v3

    move-object v10, v5

    move-object/from16 v11, v40

    invoke-virtual/range {v7 .. v12}, Ldn;->b(Ldt;Ldt;Ldt;Ldt;F)Ldn;

    invoke-virtual {v4, v0}, Ldq;->a(Ldn;)V

    :cond_39
    return-void
.end method

.method public final a(Ldx$c;Ldy;Ldx$c;II)V
    .locals 7

    invoke-virtual {p0, p1}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v0

    invoke-virtual {p2, p3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v1

    sget v4, Ldx$b;->b:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    move v2, p4

    move v3, p5

    invoke-virtual/range {v0 .. v6}, Ldx;->a(Ldx;IIIIZ)Z

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x2c

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-lez v3, :cond_3

    add-int/lit8 v6, v2, -0x1

    if-ge v3, v6, :cond_3

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "W"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    const-string v4, "H"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v1, v5

    :cond_2
    :goto_0
    add-int/lit8 v4, v3, 0x1

    :cond_3
    const/16 v3, 0x3a

    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-ltz v3, :cond_5

    sub-int/2addr v2, v5

    if-ge v3, v2, :cond_5

    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/2addr v3, v5

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    :try_start_0
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v3, v2, v0

    if-lez v3, :cond_6

    cmpl-float v3, p1, v0

    if-lez v3, :cond_6

    if-ne v1, v5, :cond_4

    div-float/2addr p1, v2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v2, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    move p1, v0

    :goto_1
    cmpl-float v0, p1, v0

    if-lez v0, :cond_7

    iput p1, p0, Ldy;->J:F

    iput v1, p0, Ldy;->K:I

    :cond_7
    return-void

    :cond_8
    :goto_2
    iput v0, p0, Ldy;->J:F

    return-void
.end method

.method public a()Z
    .locals 2

    iget v0, p0, Ldy;->Y:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x6

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Ldy;->D:[Ldx;

    aget-object v1, v1, v0

    iget-object v1, v1, Ldx;->a:Lee;

    invoke-virtual {v1}, Lee;->b()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 0

    iput p1, p0, Ldy;->L:I

    return-void
.end method

.method public b(II)V
    .locals 0

    iput p1, p0, Ldy;->N:I

    iput p2, p0, Ldy;->O:I

    return-void
.end method

.method public final b(Ldq;)V
    .locals 1

    iget-object v0, p0, Ldy;->v:Ldx;

    invoke-virtual {p1, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    iget-object v0, p0, Ldy;->w:Ldx;

    invoke-virtual {p1, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    iget-object v0, p0, Ldy;->x:Ldx;

    invoke-virtual {p1, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    iget-object v0, p0, Ldy;->y:Ldx;

    invoke-virtual {p1, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    iget v0, p0, Ldy;->P:I

    if-lez v0, :cond_0

    iget-object v0, p0, Ldy;->z:Ldx;

    invoke-virtual {p1, v0}, Ldq;->a(Ljava/lang/Object;)Ldt;

    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public final c(I)V
    .locals 0

    iput p1, p0, Ldy;->M:I

    return-void
.end method

.method public final c(II)V
    .locals 0

    iput p1, p0, Ldy;->L:I

    sub-int/2addr p2, p1

    iput p2, p0, Ldy;->H:I

    iget p1, p0, Ldy;->H:I

    iget p2, p0, Ldy;->Q:I

    if-ge p1, p2, :cond_0

    iget p1, p0, Ldy;->Q:I

    iput p1, p0, Ldy;->H:I

    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 1

    iput p1, p0, Ldy;->H:I

    iget p1, p0, Ldy;->H:I

    iget v0, p0, Ldy;->Q:I

    if-ge p1, v0, :cond_0

    iget p1, p0, Ldy;->Q:I

    iput p1, p0, Ldy;->H:I

    :cond_0
    return-void
.end method

.method public final d(II)V
    .locals 0

    iput p1, p0, Ldy;->M:I

    sub-int/2addr p2, p1

    iput p2, p0, Ldy;->I:I

    iget p1, p0, Ldy;->I:I

    iget p2, p0, Ldy;->R:I

    if-ge p1, p2, :cond_0

    iget p1, p0, Ldy;->R:I

    iput p1, p0, Ldy;->I:I

    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 3

    iget v0, p0, Ldy;->g:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget v0, p0, Ldy;->J:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Ldy;->j:I

    if-nez v0, :cond_0

    iget v0, p0, Ldy;->k:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ldy;->F:[I

    aget v0, v0, v1

    sget v2, Ldy$a;->c:I

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final e(I)V
    .locals 1

    iput p1, p0, Ldy;->I:I

    iget p1, p0, Ldy;->I:I

    iget v0, p0, Ldy;->R:I

    if-ge p1, v0, :cond_0

    iget p1, p0, Ldy;->R:I

    iput p1, p0, Ldy;->I:I

    :cond_0
    return-void
.end method

.method public final e()Z
    .locals 3

    iget v0, p0, Ldy;->h:I

    if-nez v0, :cond_0

    iget v0, p0, Ldy;->J:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ldy;->m:I

    if-nez v0, :cond_0

    iget v0, p0, Ldy;->n:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ldy;->F:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    sget v2, Ldy$a;->c:I

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f()V
    .locals 6

    iget-object v0, p0, Ldy;->v:Ldx;

    invoke-virtual {v0}, Ldx;->c()V

    iget-object v0, p0, Ldy;->w:Ldx;

    invoke-virtual {v0}, Ldx;->c()V

    iget-object v0, p0, Ldy;->x:Ldx;

    invoke-virtual {v0}, Ldx;->c()V

    iget-object v0, p0, Ldy;->y:Ldx;

    invoke-virtual {v0}, Ldx;->c()V

    iget-object v0, p0, Ldy;->z:Ldx;

    invoke-virtual {v0}, Ldx;->c()V

    iget-object v0, p0, Ldy;->A:Ldx;

    invoke-virtual {v0}, Ldx;->c()V

    iget-object v0, p0, Ldy;->B:Ldx;

    invoke-virtual {v0}, Ldx;->c()V

    iget-object v0, p0, Ldy;->C:Ldx;

    invoke-virtual {v0}, Ldx;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Ldy;->G:Ldy;

    const/4 v1, 0x0

    iput v1, p0, Ldy;->u:F

    const/4 v2, 0x0

    iput v2, p0, Ldy;->H:I

    iput v2, p0, Ldy;->I:I

    iput v1, p0, Ldy;->J:F

    const/4 v1, -0x1

    iput v1, p0, Ldy;->K:I

    iput v2, p0, Ldy;->L:I

    iput v2, p0, Ldy;->M:I

    iput v2, p0, Ldy;->a:I

    iput v2, p0, Ldy;->b:I

    iput v2, p0, Ldy;->al:I

    iput v2, p0, Ldy;->am:I

    iput v2, p0, Ldy;->N:I

    iput v2, p0, Ldy;->O:I

    iput v2, p0, Ldy;->P:I

    iput v2, p0, Ldy;->Q:I

    iput v2, p0, Ldy;->R:I

    iput v2, p0, Ldy;->S:I

    iput v2, p0, Ldy;->T:I

    sget v3, Ldy;->U:F

    iput v3, p0, Ldy;->V:F

    sget v3, Ldy;->U:F

    iput v3, p0, Ldy;->W:F

    iget-object v3, p0, Ldy;->F:[I

    sget v4, Ldy$a;->a:I

    aput v4, v3, v2

    iget-object v3, p0, Ldy;->F:[I

    sget v4, Ldy$a;->a:I

    const/4 v5, 0x1

    aput v4, v3, v5

    iput-object v0, p0, Ldy;->X:Ljava/lang/Object;

    iput v2, p0, Ldy;->an:I

    iput v2, p0, Ldy;->Y:I

    iput-object v0, p0, Ldy;->ao:Ljava/lang/String;

    iput-boolean v2, p0, Ldy;->aa:Z

    iput-boolean v2, p0, Ldy;->ab:Z

    iput v2, p0, Ldy;->ac:I

    iput v2, p0, Ldy;->ad:I

    iput-boolean v2, p0, Ldy;->ae:Z

    iput-boolean v2, p0, Ldy;->af:Z

    iget-object v0, p0, Ldy;->ag:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    iget-object v0, p0, Ldy;->ag:[F

    aput v3, v0, v5

    iput v1, p0, Ldy;->c:I

    iput v1, p0, Ldy;->d:I

    iget-object v0, p0, Ldy;->t:[I

    const v3, 0x7fffffff

    aput v3, v0, v2

    iget-object v0, p0, Ldy;->t:[I

    aput v3, v0, v5

    iput v2, p0, Ldy;->g:I

    iput v2, p0, Ldy;->h:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ldy;->l:F

    iput v0, p0, Ldy;->o:F

    iput v3, p0, Ldy;->k:I

    iput v3, p0, Ldy;->n:I

    iput v2, p0, Ldy;->j:I

    iput v2, p0, Ldy;->m:I

    iput v1, p0, Ldy;->r:I

    iput v0, p0, Ldy;->s:F

    iget-object v0, p0, Ldy;->e:Lef;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldy;->e:Lef;

    invoke-virtual {v0}, Lef;->b()V

    :cond_0
    iget-object v0, p0, Ldy;->f:Lef;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldy;->f:Lef;

    invoke-virtual {v0}, Lef;->b()V

    :cond_1
    return-void
.end method

.method public final f(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Ldy;->Q:I

    return-void

    :cond_0
    iput p1, p0, Ldy;->Q:I

    return-void
.end method

.method public final g()V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x6

    if-ge v0, v1, :cond_4

    iget-object v1, p0, Ldy;->D:[Ldx;

    aget-object v1, v1, v0

    iget-object v1, v1, Ldx;->a:Lee;

    iget-object v2, v1, Lee;->a:Ldx;

    iget-object v2, v2, Ldx;->d:Ldx;

    if-eqz v2, :cond_3

    iget-object v3, v2, Ldx;->d:Ldx;

    iget-object v4, v1, Lee;->a:Ldx;

    if-ne v3, v4, :cond_0

    const/4 v3, 0x4

    iput v3, v1, Lee;->g:I

    iget-object v4, v2, Ldx;->a:Lee;

    iput v3, v4, Lee;->g:I

    :cond_0
    iget-object v3, v1, Lee;->a:Ldx;

    invoke-virtual {v3}, Ldx;->b()I

    move-result v3

    iget-object v4, v1, Lee;->a:Ldx;

    iget-object v4, v4, Ldx;->c:Ldx$c;

    sget-object v5, Ldx$c;->d:Ldx$c;

    if-eq v4, v5, :cond_1

    iget-object v4, v1, Lee;->a:Ldx;

    iget-object v4, v4, Ldx;->c:Ldx$c;

    sget-object v5, Ldx$c;->e:Ldx$c;

    if-ne v4, v5, :cond_2

    :cond_1
    neg-int v3, v3

    :cond_2
    iget-object v2, v2, Ldx;->a:Lee;

    invoke-virtual {v1, v2, v3}, Lee;->b(Lee;I)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final g(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Ldy;->R:I

    return-void

    :cond_0
    iput p1, p0, Ldy;->R:I

    return-void
.end method

.method public final h()Lef;
    .locals 1

    iget-object v0, p0, Ldy;->e:Lef;

    if-nez v0, :cond_0

    new-instance v0, Lef;

    invoke-direct {v0}, Lef;-><init>()V

    iput-object v0, p0, Ldy;->e:Lef;

    :cond_0
    iget-object v0, p0, Ldy;->e:Lef;

    return-object v0
.end method

.method public final h(I)V
    .locals 2

    iget-object v0, p0, Ldy;->F:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    sget v0, Ldy$a;->b:I

    if-ne p1, v0, :cond_0

    iget p1, p0, Ldy;->S:I

    invoke-virtual {p0, p1}, Ldy;->d(I)V

    :cond_0
    return-void
.end method

.method public final i()Lef;
    .locals 1

    iget-object v0, p0, Ldy;->f:Lef;

    if-nez v0, :cond_0

    new-instance v0, Lef;

    invoke-direct {v0}, Lef;-><init>()V

    iput-object v0, p0, Ldy;->f:Lef;

    :cond_0
    iget-object v0, p0, Ldy;->f:Lef;

    return-object v0
.end method

.method public final i(I)V
    .locals 2

    iget-object v0, p0, Ldy;->F:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    sget v0, Ldy$a;->b:I

    if-ne p1, v0, :cond_0

    iget p1, p0, Ldy;->T:I

    invoke-virtual {p0, p1}, Ldy;->e(I)V

    :cond_0
    return-void
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Ldy;->L:I

    return v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Ldy;->M:I

    return v0
.end method

.method public final l()I
    .locals 2

    iget v0, p0, Ldy;->Y:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Ldy;->H:I

    return v0
.end method

.method public final m()I
    .locals 2

    iget v0, p0, Ldy;->Y:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Ldy;->I:I

    return v0
.end method

.method public final n()I
    .locals 2

    iget v0, p0, Ldy;->a:I

    iget v1, p0, Ldy;->N:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final o()I
    .locals 2

    iget v0, p0, Ldy;->b:I

    iget v1, p0, Ldy;->O:I

    add-int/2addr v0, v1

    return v0
.end method

.method protected final p()I
    .locals 2

    iget v0, p0, Ldy;->L:I

    iget v1, p0, Ldy;->N:I

    add-int/2addr v0, v1

    return v0
.end method

.method protected final q()I
    .locals 2

    iget v0, p0, Ldy;->M:I

    iget v1, p0, Ldy;->O:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final r()I
    .locals 2

    iget v0, p0, Ldy;->L:I

    iget v1, p0, Ldy;->H:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final s()I
    .locals 2

    iget v0, p0, Ldy;->M:I

    iget v1, p0, Ldy;->I:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final t()Z
    .locals 1

    iget v0, p0, Ldy;->P:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ldy;->ao:Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ldy;->ao:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldy;->Z:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "id: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ldy;->Z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const-string v1, ""

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldy;->L:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldy;->M:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") - ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldy;->H:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldy;->I:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") wrap: ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldy;->S:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldy;->T:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ldx;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    return-object v0
.end method

.method public v()V
    .locals 5

    iget v0, p0, Ldy;->L:I

    iget v1, p0, Ldy;->M:I

    iget v2, p0, Ldy;->L:I

    iget v3, p0, Ldy;->H:I

    add-int/2addr v2, v3

    iget v3, p0, Ldy;->M:I

    iget v4, p0, Ldy;->I:I

    add-int/2addr v3, v4

    iput v0, p0, Ldy;->a:I

    iput v1, p0, Ldy;->b:I

    sub-int/2addr v2, v0

    iput v2, p0, Ldy;->al:I

    sub-int/2addr v3, v1

    iput v3, p0, Ldy;->am:I

    return-void
.end method

.method public final w()V
    .locals 3

    iget-object v0, p0, Ldy;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Ldy;->E:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldx;

    invoke-virtual {v2}, Ldx;->c()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final x()I
    .locals 2

    iget-object v0, p0, Ldy;->F:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public final y()I
    .locals 2

    iget-object v0, p0, Ldy;->F:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public z()V
    .locals 7

    iget-object v0, p0, Ldy;->v:Ldx;

    invoke-static {v0}, Ldq;->b(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Ldy;->w:Ldx;

    invoke-static {v1}, Ldq;->b(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Ldy;->x:Ldx;

    invoke-static {v2}, Ldq;->b(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, p0, Ldy;->y:Ldx;

    invoke-static {v3}, Ldq;->b(Ljava/lang/Object;)I

    move-result v3

    sub-int v4, v2, v0

    sub-int v5, v3, v1

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v0, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v0, v5, :cond_0

    if-eq v1, v4, :cond_0

    if-eq v1, v5, :cond_0

    if-eq v2, v4, :cond_0

    if-eq v2, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-ne v3, v5, :cond_1

    :cond_0
    move v0, v6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    sub-int/2addr v2, v0

    sub-int/2addr v3, v1

    iput v0, p0, Ldy;->L:I

    iput v1, p0, Ldy;->M:I

    iget v0, p0, Ldy;->Y:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    iput v6, p0, Ldy;->H:I

    iput v6, p0, Ldy;->I:I

    return-void

    :cond_2
    iget-object v0, p0, Ldy;->F:[I

    aget v0, v0, v6

    sget v1, Ldy$a;->a:I

    if-ne v0, v1, :cond_3

    iget v0, p0, Ldy;->H:I

    if-ge v2, v0, :cond_3

    iget v2, p0, Ldy;->H:I

    :cond_3
    iget-object v0, p0, Ldy;->F:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    sget v1, Ldy$a;->a:I

    if-ne v0, v1, :cond_4

    iget v0, p0, Ldy;->I:I

    if-ge v3, v0, :cond_4

    iget v3, p0, Ldy;->I:I

    :cond_4
    iput v2, p0, Ldy;->H:I

    iput v3, p0, Ldy;->I:I

    iget v0, p0, Ldy;->I:I

    iget v1, p0, Ldy;->R:I

    if-ge v0, v1, :cond_5

    iget v0, p0, Ldy;->R:I

    iput v0, p0, Ldy;->I:I

    :cond_5
    iget v0, p0, Ldy;->H:I

    iget v1, p0, Ldy;->Q:I

    if-ge v0, v1, :cond_6

    iget v0, p0, Ldy;->Q:I

    iput v0, p0, Ldy;->H:I

    :cond_6
    return-void
.end method
