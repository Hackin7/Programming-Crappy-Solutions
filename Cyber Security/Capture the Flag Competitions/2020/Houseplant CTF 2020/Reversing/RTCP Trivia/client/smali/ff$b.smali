.class public final Lff$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lff;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:C

.field public b:[F


# direct methods
.method constructor <init>(C[F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Lff$b;->a:C

    iput-object p2, p0, Lff$b;->b:[F

    return-void
.end method

.method constructor <init>(Lff$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-char v0, p1, Lff$b;->a:C

    iput-char v0, p0, Lff$b;->a:C

    iget-object v0, p1, Lff$b;->b:[F

    iget-object p1, p1, Lff$b;->b:[F

    array-length p1, p1

    invoke-static {v0, p1}, Lff;->a([FI)[F

    move-result-object p1

    iput-object p1, p0, Lff$b;->b:[F

    return-void
.end method

.method private static a(Landroid/graphics/Path;DDDDDDDDD)V
    .locals 60

    move-wide/from16 v0, p5

    const-wide/high16 v6, 0x4010000000000000L    # 4.0

    mul-double v8, p17, v6

    const-wide v10, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v8, v8

    invoke-static/range {p13 .. p14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    invoke-static/range {p13 .. p14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    invoke-static/range {p15 .. p16}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    invoke-static/range {p15 .. p16}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    neg-double v6, v0

    mul-double v18, v6, v9

    mul-double v20, v18, v15

    mul-double v22, p7, v11

    mul-double v24, v22, v13

    sub-double v20, v20, v24

    mul-double/2addr v6, v11

    mul-double/2addr v15, v6

    mul-double v2, p7, v9

    mul-double/2addr v13, v2

    add-double/2addr v15, v13

    int-to-double v13, v8

    div-double v4, p17, v13

    const/4 v13, 0x0

    move-wide/from16 v26, p11

    move-wide/from16 v28, v15

    move-wide/from16 v24, v20

    move-wide/from16 v20, p9

    move-wide/from16 v14, p15

    :goto_0
    if-ge v13, v8, :cond_0

    move-wide/from16 v30, v6

    add-double v6, v14, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v32

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v34

    mul-double v36, v0, v9

    mul-double v36, v36, v34

    add-double v36, p1, v36

    mul-double v38, v22, v32

    move-wide/from16 v40, v4

    sub-double v4, v36, v38

    mul-double v36, v0, v11

    mul-double v36, v36, v34

    add-double v36, p3, v36

    mul-double v42, v2, v32

    add-double v0, v36, v42

    mul-double v36, v18, v32

    mul-double v42, v22, v34

    sub-double v36, v36, v42

    mul-double v32, v32, v30

    mul-double v34, v34, v2

    add-double v32, v32, v34

    sub-double v14, v6, v14

    const-wide/high16 v34, 0x4000000000000000L    # 2.0

    move-wide/from16 v44, v2

    div-double v2, v14, v34

    invoke-static {v2, v3}, Ljava/lang/Math;->tan(D)D

    move-result-wide v2

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    const-wide/high16 v34, 0x4008000000000000L    # 3.0

    mul-double v42, v34, v2

    mul-double v42, v42, v2

    move-wide/from16 v46, v6

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    add-double v6, v2, v42

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    sub-double v6, v6, v16

    mul-double/2addr v14, v6

    div-double v14, v14, v34

    mul-double v24, v24, v14

    add-double v6, v20, v24

    mul-double v28, v28, v14

    add-double v2, v26, v28

    mul-double v16, v14, v36

    move/from16 v48, v8

    move-wide/from16 v49, v9

    sub-double v8, v4, v16

    mul-double v14, v14, v32

    sub-double v14, v0, v14

    const/4 v10, 0x0

    move-wide/from16 v58, v11

    move-object/from16 v11, p0

    invoke-virtual {v11, v10, v10}, Landroid/graphics/Path;->rLineTo(FF)V

    double-to-float v6, v6

    double-to-float v2, v2

    double-to-float v3, v8

    double-to-float v7, v14

    double-to-float v8, v4

    double-to-float v9, v0

    move-object/from16 v51, v11

    move/from16 v52, v6

    move/from16 v53, v2

    move/from16 v54, v3

    move/from16 v55, v7

    move/from16 v56, v8

    move/from16 v57, v9

    invoke-virtual/range {v51 .. v57}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-int/lit8 v13, v13, 0x1

    move-wide/from16 v26, v0

    move-wide/from16 v20, v4

    move-wide/from16 v6, v30

    move-wide/from16 v28, v32

    move-wide/from16 v24, v36

    move-wide/from16 v4, v40

    move-wide/from16 v2, v44

    move-wide/from16 v14, v46

    move/from16 v8, v48

    move-wide/from16 v9, v49

    move-wide/from16 v11, v58

    move-wide/from16 v0, p5

    goto/16 :goto_0

    :cond_0
    return-void
.end method

.method private static a(Landroid/graphics/Path;FFFFFFFZZ)V
    .locals 43

    move/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p9

    move/from16 v4, p5

    move/from16 v5, p6

    move/from16 v3, p7

    :goto_0
    float-to-double v6, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    float-to-double v13, v0

    mul-double v15, v13, v8

    move/from16 v12, p2

    move-wide/from16 v27, v6

    float-to-double v6, v12

    mul-double v17, v6, v10

    add-double v15, v15, v17

    move-wide/from16 v29, v13

    float-to-double v13, v4

    div-double/2addr v15, v13

    neg-float v3, v0

    float-to-double v2, v3

    mul-double/2addr v2, v10

    mul-double v17, v6, v8

    add-double v2, v2, v17

    move-wide/from16 v31, v6

    float-to-double v6, v5

    div-double/2addr v2, v6

    move/from16 v33, v4

    move/from16 v34, v5

    float-to-double v4, v1

    mul-double/2addr v4, v8

    move/from16 v0, p4

    move-wide/from16 v35, v2

    float-to-double v2, v0

    mul-double v17, v2, v10

    add-double v4, v4, v17

    div-double/2addr v4, v13

    neg-float v0, v1

    float-to-double v0, v0

    mul-double/2addr v0, v10

    mul-double/2addr v2, v8

    add-double/2addr v0, v2

    div-double/2addr v0, v6

    sub-double v2, v15, v4

    sub-double v17, v35, v0

    add-double v19, v15, v4

    const-wide/high16 v21, 0x4000000000000000L    # 2.0

    div-double v19, v19, v21

    add-double v23, v35, v0

    div-double v23, v23, v21

    mul-double v21, v2, v2

    mul-double v25, v17, v17

    move-wide/from16 v37, v10

    add-double v10, v21, v25

    const-wide/16 v21, 0x0

    cmpl-double v25, v10, v21

    if-nez v25, :cond_0

    const-string v0, "PathParser"

    const-string v1, " Points are coincident"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-wide/high16 v25, 0x3ff0000000000000L    # 1.0

    div-double v25, v25, v10

    const-wide/high16 v39, 0x3fd0000000000000L    # 0.25

    move-wide/from16 v41, v8

    sub-double v8, v25, v39

    cmpg-double v25, v8, v21

    if-gez v25, :cond_1

    const-string v0, "PathParser"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Points are too far apart "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide v2, 0x3ffffff583a53b8eL    # 1.99999

    div-double/2addr v0, v2

    double-to-float v0, v0

    mul-float v4, v33, v0

    mul-float v5, v34, v0

    move/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p9

    move/from16 v3, p7

    goto/16 :goto_0

    :cond_1
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    mul-double/2addr v2, v8

    mul-double v8, v8, v17

    move/from16 v10, p8

    move/from16 v11, p9

    if-ne v10, v11, :cond_2

    sub-double v19, v19, v8

    add-double v23, v23, v2

    goto :goto_1

    :cond_2
    add-double v19, v19, v8

    sub-double v23, v23, v2

    :goto_1
    sub-double v2, v35, v23

    sub-double v8, v15, v19

    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    sub-double v0, v0, v23

    sub-double v4, v4, v19

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    sub-double/2addr v0, v2

    cmpl-double v4, v0, v21

    if-ltz v4, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-eq v11, v5, :cond_5

    const-wide v8, 0x401921fb54442d18L    # 6.283185307179586

    if-lez v4, :cond_4

    sub-double/2addr v0, v8

    goto :goto_3

    :cond_4
    add-double/2addr v0, v8

    :cond_5
    :goto_3
    move-wide/from16 v25, v0

    mul-double v19, v19, v13

    mul-double v23, v23, v6

    mul-double v8, v19, v41

    mul-double v10, v23, v37

    sub-double v9, v8, v10

    mul-double v19, v19, v37

    mul-double v23, v23, v41

    add-double v11, v19, v23

    move-object/from16 v8, p0

    move-wide/from16 v0, v29

    move-wide v15, v6

    move-wide/from16 v17, v0

    move-wide/from16 v19, v31

    move-wide/from16 v21, v27

    move-wide/from16 v23, v2

    invoke-static/range {v8 .. v26}, Lff$b;->a(Landroid/graphics/Path;DDDDDDDDD)V

    return-void
.end method

.method public static a([Lff$b;Landroid/graphics/Path;)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    const/4 v12, 0x6

    new-array v13, v12, [F

    const/4 v14, 0x0

    const/16 v1, 0x6d

    move v15, v14

    :goto_0
    array-length v2, v0

    if-ge v15, v2, :cond_f

    aget-object v2, v0, v15

    iget-char v10, v2, Lff$b;->a:C

    aget-object v2, v0, v15

    iget-object v9, v2, Lff$b;->b:[F

    aget v2, v13, v14

    const/16 v16, 0x1

    aget v3, v13, v16

    const/16 v17, 0x2

    aget v4, v13, v17

    const/16 v18, 0x3

    aget v5, v13, v18

    const/16 v19, 0x4

    aget v6, v13, v19

    const/16 v20, 0x5

    aget v7, v13, v20

    sparse-switch v10, :sswitch_data_0

    :goto_1
    :sswitch_0
    move/from16 v21, v17

    goto :goto_2

    :sswitch_1
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Path;->close()V

    invoke-virtual {v11, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    move v2, v6

    move v4, v2

    move v3, v7

    move v5, v3

    goto :goto_1

    :sswitch_2
    move/from16 v21, v19

    goto :goto_2

    :sswitch_3
    move/from16 v21, v16

    goto :goto_2

    :sswitch_4
    move/from16 v21, v12

    goto :goto_2

    :sswitch_5
    const/4 v8, 0x7

    move/from16 v21, v8

    :goto_2
    move/from16 v22, v6

    move/from16 v23, v7

    move v8, v14

    move v7, v2

    move v6, v3

    :goto_3
    array-length v2, v9

    if-ge v8, v2, :cond_e

    const/16 v14, 0x51

    const/16 v2, 0x74

    const/16 v3, 0x71

    const/high16 v26, 0x40000000    # 2.0f

    const/4 v12, 0x0

    sparse-switch v10, :sswitch_data_1

    move v0, v6

    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    move v15, v7

    goto/16 :goto_13

    :sswitch_6
    add-int/lit8 v1, v8, 0x0

    aget v2, v9, v1

    invoke-virtual {v11, v12, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    aget v1, v9, v1

    add-float/2addr v6, v1

    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    :goto_4
    move/from16 v28, v15

    goto/16 :goto_13

    :sswitch_7
    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_1

    if-eq v1, v14, :cond_1

    const/16 v2, 0x54

    if-ne v1, v2, :cond_0

    goto :goto_5

    :cond_0
    move v1, v12

    goto :goto_6

    :cond_1
    :goto_5
    sub-float v12, v7, v4

    sub-float v1, v6, v5

    :goto_6
    add-int/lit8 v2, v8, 0x0

    aget v3, v9, v2

    add-int/lit8 v4, v8, 0x1

    aget v5, v9, v4

    invoke-virtual {v11, v12, v1, v3, v5}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    add-float/2addr v12, v7

    add-float/2addr v1, v6

    aget v2, v9, v2

    add-float/2addr v7, v2

    aget v2, v9, v4

    add-float/2addr v6, v2

    move v5, v1

    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move v4, v12

    goto :goto_4

    :sswitch_8
    const/16 v2, 0x63

    if-eq v1, v2, :cond_3

    const/16 v2, 0x73

    if-eq v1, v2, :cond_3

    const/16 v2, 0x43

    if-eq v1, v2, :cond_3

    const/16 v2, 0x53

    if-ne v1, v2, :cond_2

    goto :goto_7

    :cond_2
    move v2, v12

    move v3, v2

    goto :goto_8

    :cond_3
    :goto_7
    sub-float v1, v7, v4

    sub-float v2, v6, v5

    move v3, v2

    move v2, v1

    :goto_8
    add-int/lit8 v12, v8, 0x0

    aget v4, v9, v12

    add-int/lit8 v14, v8, 0x1

    aget v5, v9, v14

    add-int/lit8 v24, v8, 0x2

    aget v25, v9, v24

    add-int/lit8 v26, v8, 0x3

    aget v27, v9, v26

    move-object v1, v11

    move v0, v6

    move/from16 v6, v25

    move/from16 v28, v15

    move v15, v7

    move/from16 v7, v27

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    aget v1, v9, v12

    add-float v7, v15, v1

    aget v1, v9, v14

    add-float v6, v0, v1

    aget v1, v9, v24

    add-float/2addr v1, v15

    aget v2, v9, v26

    goto/16 :goto_a

    :sswitch_9
    move v0, v6

    move/from16 v28, v15

    move v15, v7

    add-int/lit8 v1, v8, 0x0

    aget v2, v9, v1

    add-int/lit8 v3, v8, 0x1

    aget v4, v9, v3

    add-int/lit8 v5, v8, 0x2

    aget v6, v9, v5

    add-int/lit8 v7, v8, 0x3

    aget v12, v9, v7

    invoke-virtual {v11, v2, v4, v6, v12}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    aget v1, v9, v1

    add-float/2addr v1, v15

    aget v2, v9, v3

    add-float v6, v0, v2

    aget v2, v9, v5

    add-float/2addr v2, v15

    aget v3, v9, v7

    add-float/2addr v0, v3

    move v4, v1

    move v7, v2

    move v5, v6

    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move v6, v0

    goto/16 :goto_13

    :sswitch_a
    move v0, v6

    move/from16 v28, v15

    move v15, v7

    add-int/lit8 v1, v8, 0x0

    aget v2, v9, v1

    add-float v7, v15, v2

    add-int/lit8 v2, v8, 0x1

    aget v3, v9, v2

    add-float v6, v0, v3

    if-lez v8, :cond_4

    aget v0, v9, v1

    aget v1, v9, v2

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    goto :goto_9

    :cond_4
    aget v0, v9, v1

    aget v1, v9, v2

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Path;->rMoveTo(FF)V

    move/from16 v23, v6

    move/from16 v22, v7

    goto :goto_9

    :sswitch_b
    move v0, v6

    move/from16 v28, v15

    move v15, v7

    add-int/lit8 v1, v8, 0x0

    aget v2, v9, v1

    add-int/lit8 v3, v8, 0x1

    aget v6, v9, v3

    invoke-virtual {v11, v2, v6}, Landroid/graphics/Path;->rLineTo(FF)V

    aget v1, v9, v1

    add-float v7, v15, v1

    aget v1, v9, v3

    add-float v6, v0, v1

    goto :goto_9

    :sswitch_c
    move v0, v6

    move/from16 v28, v15

    move v15, v7

    add-int/lit8 v1, v8, 0x0

    aget v2, v9, v1

    invoke-virtual {v11, v2, v12}, Landroid/graphics/Path;->rLineTo(FF)V

    aget v1, v9, v1

    add-float v7, v15, v1

    :goto_9
    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    goto/16 :goto_13

    :sswitch_d
    move v0, v6

    move/from16 v28, v15

    move v15, v7

    add-int/lit8 v1, v8, 0x0

    aget v2, v9, v1

    add-int/lit8 v1, v8, 0x1

    aget v3, v9, v1

    add-int/lit8 v12, v8, 0x2

    aget v4, v9, v12

    add-int/lit8 v14, v8, 0x3

    aget v5, v9, v14

    add-int/lit8 v24, v8, 0x4

    aget v6, v9, v24

    add-int/lit8 v25, v8, 0x5

    aget v7, v9, v25

    move-object v1, v11

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    aget v1, v9, v12

    add-float v7, v15, v1

    aget v1, v9, v14

    add-float v6, v0, v1

    aget v1, v9, v24

    add-float/2addr v1, v15

    aget v2, v9, v25

    :goto_a
    add-float/2addr v0, v2

    move v5, v6

    move v4, v7

    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move v6, v0

    move v7, v1

    goto/16 :goto_13

    :sswitch_e
    move v0, v6

    move/from16 v28, v15

    move v15, v7

    add-int/lit8 v14, v8, 0x5

    aget v1, v9, v14

    add-float v4, v1, v15

    add-int/lit8 v24, v8, 0x6

    aget v1, v9, v24

    add-float v5, v1, v0

    add-int/lit8 v1, v8, 0x0

    aget v6, v9, v1

    add-int/lit8 v1, v8, 0x1

    aget v7, v9, v1

    add-int/lit8 v1, v8, 0x2

    aget v25, v9, v1

    add-int/lit8 v1, v8, 0x3

    aget v1, v9, v1

    cmpl-float v1, v1, v12

    if-eqz v1, :cond_5

    move/from16 v26, v16

    goto :goto_b

    :cond_5
    const/16 v26, 0x0

    :goto_b
    add-int/lit8 v1, v8, 0x4

    aget v1, v9, v1

    cmpl-float v1, v1, v12

    if-eqz v1, :cond_6

    move/from16 v12, v16

    goto :goto_c

    :cond_6
    const/4 v12, 0x0

    :goto_c
    move-object v1, v11

    move v2, v15

    move v3, v0

    move/from16 v29, v8

    move/from16 v8, v25

    move-object/from16 v25, v9

    move/from16 v9, v26

    move/from16 v30, v10

    move v10, v12

    invoke-static/range {v1 .. v10}, Lff$b;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    aget v1, v25, v14

    add-float v7, v15, v1

    aget v1, v25, v24

    add-float v6, v0, v1

    goto/16 :goto_12

    :sswitch_f
    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    move v15, v7

    add-int/lit8 v8, v29, 0x0

    aget v0, v25, v8

    invoke-virtual {v11, v15, v0}, Landroid/graphics/Path;->lineTo(FF)V

    aget v6, v25, v8

    goto/16 :goto_13

    :sswitch_10
    move v0, v6

    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    move v15, v7

    if-eq v1, v3, :cond_7

    if-eq v1, v2, :cond_7

    if-eq v1, v14, :cond_7

    const/16 v2, 0x54

    if-ne v1, v2, :cond_8

    :cond_7
    mul-float v7, v26, v15

    sub-float/2addr v7, v4

    mul-float v26, v26, v0

    sub-float v6, v26, v5

    move v0, v6

    move v15, v7

    :cond_8
    add-int/lit8 v8, v29, 0x0

    aget v1, v25, v8

    add-int/lit8 v2, v29, 0x1

    aget v3, v25, v2

    invoke-virtual {v11, v15, v0, v1, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    aget v7, v25, v8

    aget v6, v25, v2

    move v5, v0

    move v4, v15

    goto/16 :goto_13

    :sswitch_11
    move v0, v6

    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    const/16 v2, 0x63

    move v15, v7

    if-eq v1, v2, :cond_a

    const/16 v2, 0x73

    if-eq v1, v2, :cond_a

    const/16 v2, 0x43

    if-eq v1, v2, :cond_a

    const/16 v2, 0x53

    if-ne v1, v2, :cond_9

    goto :goto_d

    :cond_9
    move v3, v0

    move v2, v15

    goto :goto_e

    :cond_a
    :goto_d
    mul-float v7, v26, v15

    sub-float/2addr v7, v4

    mul-float v26, v26, v0

    sub-float v26, v26, v5

    move v2, v7

    move/from16 v3, v26

    :goto_e
    add-int/lit8 v8, v29, 0x0

    aget v4, v25, v8

    add-int/lit8 v0, v29, 0x1

    aget v5, v25, v0

    add-int/lit8 v9, v29, 0x2

    aget v6, v25, v9

    add-int/lit8 v10, v29, 0x3

    aget v7, v25, v10

    move-object v1, v11

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    aget v1, v25, v8

    aget v0, v25, v0

    aget v7, v25, v9

    aget v6, v25, v10

    goto/16 :goto_f

    :sswitch_12
    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    add-int/lit8 v8, v29, 0x0

    aget v0, v25, v8

    add-int/lit8 v1, v29, 0x1

    aget v2, v25, v1

    add-int/lit8 v3, v29, 0x2

    aget v4, v25, v3

    add-int/lit8 v5, v29, 0x3

    aget v6, v25, v5

    invoke-virtual {v11, v0, v2, v4, v6}, Landroid/graphics/Path;->quadTo(FFFF)V

    aget v0, v25, v8

    aget v1, v25, v1

    aget v7, v25, v3

    aget v6, v25, v5

    move v4, v0

    move v5, v1

    goto/16 :goto_13

    :sswitch_13
    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    add-int/lit8 v8, v29, 0x0

    aget v7, v25, v8

    add-int/lit8 v0, v29, 0x1

    aget v6, v25, v0

    if-lez v29, :cond_b

    aget v1, v25, v8

    aget v0, v25, v0

    invoke-virtual {v11, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    goto/16 :goto_13

    :cond_b
    aget v1, v25, v8

    aget v0, v25, v0

    invoke-virtual {v11, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    move/from16 v23, v6

    move/from16 v22, v7

    goto/16 :goto_13

    :sswitch_14
    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    add-int/lit8 v8, v29, 0x0

    aget v0, v25, v8

    add-int/lit8 v1, v29, 0x1

    aget v2, v25, v1

    invoke-virtual {v11, v0, v2}, Landroid/graphics/Path;->lineTo(FF)V

    aget v7, v25, v8

    aget v6, v25, v1

    goto/16 :goto_13

    :sswitch_15
    move v0, v6

    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    add-int/lit8 v8, v29, 0x0

    aget v1, v25, v8

    invoke-virtual {v11, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    aget v7, v25, v8

    goto/16 :goto_13

    :sswitch_16
    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    add-int/lit8 v8, v29, 0x0

    aget v2, v25, v8

    add-int/lit8 v8, v29, 0x1

    aget v3, v25, v8

    add-int/lit8 v8, v29, 0x2

    aget v4, v25, v8

    add-int/lit8 v0, v29, 0x3

    aget v5, v25, v0

    add-int/lit8 v9, v29, 0x4

    aget v6, v25, v9

    add-int/lit8 v10, v29, 0x5

    aget v7, v25, v10

    move-object v1, v11

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    aget v7, v25, v9

    aget v6, v25, v10

    aget v1, v25, v8

    aget v0, v25, v0

    :goto_f
    move v5, v0

    move v4, v1

    goto :goto_13

    :sswitch_17
    move v0, v6

    move/from16 v29, v8

    move-object/from16 v25, v9

    move/from16 v30, v10

    move/from16 v28, v15

    move v15, v7

    add-int/lit8 v14, v29, 0x5

    aget v4, v25, v14

    add-int/lit8 v24, v29, 0x6

    aget v5, v25, v24

    add-int/lit8 v8, v29, 0x0

    aget v6, v25, v8

    add-int/lit8 v8, v29, 0x1

    aget v7, v25, v8

    add-int/lit8 v8, v29, 0x2

    aget v8, v25, v8

    add-int/lit8 v1, v29, 0x3

    aget v1, v25, v1

    cmpl-float v1, v1, v12

    if-eqz v1, :cond_c

    move/from16 v9, v16

    goto :goto_10

    :cond_c
    const/4 v9, 0x0

    :goto_10
    add-int/lit8 v1, v29, 0x4

    aget v1, v25, v1

    cmpl-float v1, v1, v12

    if-eqz v1, :cond_d

    move/from16 v10, v16

    goto :goto_11

    :cond_d
    const/4 v10, 0x0

    :goto_11
    move-object v1, v11

    move v2, v15

    move v3, v0

    invoke-static/range {v1 .. v10}, Lff$b;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    aget v7, v25, v14

    aget v6, v25, v24

    :goto_12
    move v5, v6

    move v4, v7

    :goto_13
    add-int v8, v29, v21

    move-object/from16 v9, v25

    move/from16 v15, v28

    move/from16 v1, v30

    move v10, v1

    move-object/from16 v0, p0

    const/4 v12, 0x6

    const/4 v14, 0x0

    goto/16 :goto_3

    :cond_e
    move v0, v6

    move v1, v14

    move/from16 v28, v15

    move v15, v7

    aput v15, v13, v1

    aput v0, v13, v16

    aput v4, v13, v17

    aput v5, v13, v18

    aput v22, v13, v19

    aput v23, v13, v20

    move-object/from16 v0, p0

    aget-object v2, v0, v28

    iget-char v2, v2, Lff$b;->a:C

    add-int/lit8 v15, v28, 0x1

    move v1, v2

    const/4 v12, 0x6

    goto/16 :goto_0

    :cond_f
    return-void

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_5
        0x43 -> :sswitch_4
        0x48 -> :sswitch_3
        0x4c -> :sswitch_0
        0x4d -> :sswitch_0
        0x51 -> :sswitch_2
        0x53 -> :sswitch_2
        0x54 -> :sswitch_0
        0x56 -> :sswitch_3
        0x5a -> :sswitch_1
        0x61 -> :sswitch_5
        0x63 -> :sswitch_4
        0x68 -> :sswitch_3
        0x6c -> :sswitch_0
        0x6d -> :sswitch_0
        0x71 -> :sswitch_2
        0x73 -> :sswitch_2
        0x74 -> :sswitch_0
        0x76 -> :sswitch_3
        0x7a -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x41 -> :sswitch_17
        0x43 -> :sswitch_16
        0x48 -> :sswitch_15
        0x4c -> :sswitch_14
        0x4d -> :sswitch_13
        0x51 -> :sswitch_12
        0x53 -> :sswitch_11
        0x54 -> :sswitch_10
        0x56 -> :sswitch_f
        0x61 -> :sswitch_e
        0x63 -> :sswitch_d
        0x68 -> :sswitch_c
        0x6c -> :sswitch_b
        0x6d -> :sswitch_a
        0x71 -> :sswitch_9
        0x73 -> :sswitch_8
        0x74 -> :sswitch_7
        0x76 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lff$b;Lff$b;F)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Lff$b;->b:[F

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lff$b;->b:[F

    iget-object v2, p1, Lff$b;->b:[F

    aget v2, v2, v0

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v3, p3

    mul-float/2addr v2, v3

    iget-object v3, p2, Lff$b;->b:[F

    aget v3, v3, v0

    mul-float/2addr v3, p3

    add-float/2addr v2, v3

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
