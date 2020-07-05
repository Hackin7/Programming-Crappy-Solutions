.class public Lcf;
.super Landroid/view/ViewGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:F

.field private h:Z

.field private i:[I

.field private j:[I

.field private k:Landroid/graphics/drawable/Drawable;

.field private l:I

.field private m:I

.field private n:I

.field private o:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcf;->a:Z

    const/4 v1, -0x1

    iput v1, p0, Lcf;->b:I

    const/4 v2, 0x0

    iput v2, p0, Lcf;->c:I

    const v3, 0x800033

    iput v3, p0, Lcf;->e:I

    sget-object v3, Lb$j;->LinearLayoutCompat:[I

    invoke-static {p1, p2, v3, p3, v2}, Lcr;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lcr;

    move-result-object p1

    sget p2, Lb$j;->LinearLayoutCompat_android_orientation:I

    invoke-virtual {p1, p2, v1}, Lcr;->a(II)I

    move-result p2

    if-ltz p2, :cond_0

    invoke-virtual {p0, p2}, Lcf;->setOrientation(I)V

    :cond_0
    sget p2, Lb$j;->LinearLayoutCompat_android_gravity:I

    invoke-virtual {p1, p2, v1}, Lcr;->a(II)I

    move-result p2

    if-ltz p2, :cond_1

    invoke-virtual {p0, p2}, Lcf;->setGravity(I)V

    :cond_1
    sget p2, Lb$j;->LinearLayoutCompat_android_baselineAligned:I

    invoke-virtual {p1, p2, v0}, Lcr;->a(IZ)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p0, p2}, Lcf;->setBaselineAligned(Z)V

    :cond_2
    sget p2, Lb$j;->LinearLayoutCompat_android_weightSum:I

    iget-object p3, p1, Lcr;->b:Landroid/content/res/TypedArray;

    const/high16 v0, -0x40800000    # -1.0f

    invoke-virtual {p3, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcf;->g:F

    sget p2, Lb$j;->LinearLayoutCompat_android_baselineAlignedChildIndex:I

    invoke-virtual {p1, p2, v1}, Lcr;->a(II)I

    move-result p2

    iput p2, p0, Lcf;->b:I

    sget p2, Lb$j;->LinearLayoutCompat_measureWithLargestChild:I

    invoke-virtual {p1, p2, v2}, Lcr;->a(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcf;->h:Z

    sget p2, Lb$j;->LinearLayoutCompat_divider:I

    invoke-virtual {p1, p2}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcf;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    sget p2, Lb$j;->LinearLayoutCompat_showDividers:I

    invoke-virtual {p1, p2, v2}, Lcr;->a(II)I

    move-result p2

    iput p2, p0, Lcf;->n:I

    sget p2, Lb$j;->LinearLayoutCompat_dividerPadding:I

    invoke-virtual {p1, p2, v2}, Lcr;->e(II)I

    move-result p2

    iput p2, p0, Lcf;->o:I

    iget-object p1, p1, Lcr;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(II)V
    .locals 10

    invoke-virtual {p0}, Lcf;->getMeasuredWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    invoke-virtual {p0, v1}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v4, 0x8

    if-eq v2, v4, :cond_0

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcf$a;

    iget v2, v8, Lcf$a;->width:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    iget v9, v8, Lcf$a;->height:I

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iput v2, v8, Lcf$a;->height:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move v4, v0

    move v6, p2

    invoke-virtual/range {v2 .. v7}, Lcf;->measureChildWithMargins(Landroid/view/View;IIII)V

    iput v9, v8, Lcf$a;->height:I

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Landroid/graphics/Canvas;I)V
    .locals 4

    iget-object v0, p0, Lcf;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcf;->getPaddingLeft()I

    move-result v1

    iget v2, p0, Lcf;->o:I

    add-int/2addr v1, v2

    invoke-virtual {p0}, Lcf;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcf;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Lcf;->o:I

    sub-int/2addr v2, v3

    iget v3, p0, Lcf;->m:I

    add-int/2addr v3, p2

    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object p2, p0, Lcf;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method private a(Landroid/view/View;IIII)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcf;->measureChildWithMargins(Landroid/view/View;IIII)V

    return-void
.end method

.method private b(II)V
    .locals 39

    move-object/from16 v6, p0

    move/from16 v7, p2

    const/4 v8, 0x0

    iput v8, v6, Lcf;->f:I

    invoke-virtual/range {p0 .. p0}, Lcf;->getVirtualChildCount()I

    move-result v9

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v10

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v11

    iget-object v0, v6, Lcf;->i:[I

    const/4 v12, 0x4

    if-eqz v0, :cond_0

    iget-object v0, v6, Lcf;->j:[I

    if-nez v0, :cond_1

    :cond_0
    new-array v0, v12, [I

    iput-object v0, v6, Lcf;->i:[I

    new-array v0, v12, [I

    iput-object v0, v6, Lcf;->j:[I

    :cond_1
    iget-object v13, v6, Lcf;->i:[I

    iget-object v14, v6, Lcf;->j:[I

    const/4 v15, 0x3

    const/4 v5, -0x1

    aput v5, v13, v15

    const/16 v16, 0x2

    aput v5, v13, v16

    const/16 v17, 0x1

    aput v5, v13, v17

    aput v5, v13, v8

    aput v5, v14, v15

    aput v5, v14, v16

    aput v5, v14, v17

    aput v5, v14, v8

    iget-boolean v4, v6, Lcf;->a:Z

    iget-boolean v3, v6, Lcf;->h:Z

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v10, v2, :cond_2

    move/from16 v18, v17

    goto :goto_0

    :cond_2
    move/from16 v18, v8

    :goto_0
    const/16 v19, 0x0

    move v1, v8

    move v12, v1

    move v15, v12

    move/from16 v20, v15

    move/from16 v21, v20

    move/from16 v22, v21

    move/from16 v23, v22

    move/from16 v25, v23

    move/from16 v24, v17

    move/from16 v0, v19

    :goto_1
    const/16 v5, 0x8

    if-ge v1, v9, :cond_15

    invoke-virtual {v6, v1}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_3

    iget v2, v6, Lcf;->f:I

    add-int/2addr v2, v8

    iput v2, v6, Lcf;->f:I

    move/from16 v29, v0

    move v0, v1

    move/from16 v30, v3

    move/from16 v27, v4

    const/high16 v1, 0x40000000    # 2.0f

    goto/16 :goto_12

    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eq v8, v5, :cond_14

    invoke-virtual {v6, v1}, Lcf;->a(I)Z

    move-result v5

    if-eqz v5, :cond_4

    iget v5, v6, Lcf;->f:I

    iget v8, v6, Lcf;->l:I

    add-int/2addr v5, v8

    iput v5, v6, Lcf;->f:I

    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Lcf$a;

    iget v5, v8, Lcf$a;->g:F

    add-float v29, v0, v5

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v10, v5, :cond_7

    iget v0, v8, Lcf$a;->width:I

    if-nez v0, :cond_7

    iget v0, v8, Lcf$a;->g:F

    cmpl-float v0, v0, v19

    if-lez v0, :cond_7

    if-eqz v18, :cond_5

    iget v0, v6, Lcf;->f:I

    iget v5, v8, Lcf$a;->leftMargin:I

    move/from16 v31, v1

    iget v1, v8, Lcf$a;->rightMargin:I

    add-int/2addr v5, v1

    add-int/2addr v0, v5

    :goto_2
    iput v0, v6, Lcf;->f:I

    goto :goto_3

    :cond_5
    move/from16 v31, v1

    iget v0, v6, Lcf;->f:I

    iget v1, v8, Lcf$a;->leftMargin:I

    add-int/2addr v1, v0

    iget v5, v8, Lcf$a;->rightMargin:I

    add-int/2addr v1, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_2

    :goto_3
    if-eqz v4, :cond_6

    const/4 v0, 0x0

    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v2, v1, v1}, Landroid/view/View;->measure(II)V

    move-object v0, v2

    move/from16 v30, v3

    move/from16 v27, v4

    const/16 v26, -0x2

    goto/16 :goto_8

    :cond_6
    move-object v0, v2

    move/from16 v30, v3

    move/from16 v27, v4

    move/from16 v20, v17

    const/high16 v1, 0x40000000    # 2.0f

    const/16 v26, -0x2

    goto/16 :goto_9

    :cond_7
    move/from16 v31, v1

    iget v0, v8, Lcf$a;->width:I

    if-nez v0, :cond_8

    iget v0, v8, Lcf$a;->g:F

    cmpl-float v0, v0, v19

    if-lez v0, :cond_8

    const/4 v5, -0x2

    iput v5, v8, Lcf$a;->width:I

    const/4 v1, 0x0

    goto :goto_4

    :cond_8
    const/4 v5, -0x2

    const/high16 v1, -0x80000000

    :goto_4
    cmpl-float v0, v29, v19

    if-nez v0, :cond_9

    iget v0, v6, Lcf;->f:I

    move/from16 v27, v0

    goto :goto_5

    :cond_9
    const/16 v27, 0x0

    :goto_5
    const/16 v28, 0x0

    move-object v0, v6

    move/from16 v32, v1

    move-object v1, v2

    move-object/from16 v33, v2

    move/from16 v2, p1

    move/from16 v30, v3

    move/from16 v3, v27

    move/from16 v27, v4

    move v4, v7

    move/from16 v26, v5

    const/high16 v7, -0x80000000

    move/from16 v5, v28

    invoke-direct/range {v0 .. v5}, Lcf;->a(Landroid/view/View;IIII)V

    move/from16 v0, v32

    if-eq v0, v7, :cond_a

    iput v0, v8, Lcf$a;->width:I

    :cond_a
    move-object/from16 v0, v33

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    if-eqz v18, :cond_b

    iget v2, v6, Lcf;->f:I

    iget v3, v8, Lcf$a;->leftMargin:I

    add-int/2addr v3, v1

    iget v4, v8, Lcf$a;->rightMargin:I

    add-int/2addr v3, v4

    const/4 v4, 0x0

    add-int/2addr v3, v4

    add-int/2addr v2, v3

    :goto_6
    iput v2, v6, Lcf;->f:I

    goto :goto_7

    :cond_b
    const/4 v4, 0x0

    iget v2, v6, Lcf;->f:I

    add-int v3, v2, v1

    iget v5, v8, Lcf$a;->leftMargin:I

    add-int/2addr v3, v5

    iget v5, v8, Lcf$a;->rightMargin:I

    add-int/2addr v3, v5

    add-int/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_6

    :goto_7
    if-eqz v30, :cond_c

    invoke-static {v1, v12}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v12, v1

    :cond_c
    :goto_8
    const/high16 v1, 0x40000000    # 2.0f

    :goto_9
    if-eq v11, v1, :cond_d

    iget v2, v8, Lcf$a;->height:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_d

    move/from16 v2, v17

    move/from16 v25, v2

    goto :goto_a

    :cond_d
    const/4 v2, 0x0

    :goto_a
    iget v3, v8, Lcf$a;->topMargin:I

    iget v4, v8, Lcf$a;->bottomMargin:I

    add-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredState()I

    move-result v5

    move/from16 v7, v23

    invoke-static {v7, v5}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v23

    if-eqz v27, :cond_f

    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    move-result v0

    const/4 v5, -0x1

    if-eq v0, v5, :cond_f

    iget v5, v8, Lcf$a;->h:I

    if-gez v5, :cond_e

    iget v5, v6, Lcf;->e:I

    goto :goto_b

    :cond_e
    iget v5, v8, Lcf$a;->h:I

    :goto_b
    and-int/lit8 v5, v5, 0x70

    const/4 v7, 0x4

    shr-int/2addr v5, v7

    and-int/lit8 v5, v5, -0x2

    shr-int/lit8 v5, v5, 0x1

    aget v7, v13, v5

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v7

    aput v7, v13, v5

    aget v7, v14, v5

    sub-int v0, v4, v0

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    aput v0, v14, v5

    :cond_f
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    move-result v15

    if-eqz v24, :cond_10

    iget v0, v8, Lcf$a;->height:I

    const/4 v5, -0x1

    if-ne v0, v5, :cond_10

    move/from16 v24, v17

    goto :goto_c

    :cond_10
    const/16 v24, 0x0

    :goto_c
    iget v0, v8, Lcf$a;->g:F

    cmpl-float v0, v0, v19

    if-lez v0, :cond_12

    if-eqz v2, :cond_11

    :goto_d
    move/from16 v8, v22

    goto :goto_e

    :cond_11
    move v3, v4

    goto :goto_d

    :goto_e
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    move-result v22

    move/from16 v8, v22

    goto :goto_11

    :cond_12
    move/from16 v8, v22

    if-eqz v2, :cond_13

    :goto_f
    move/from16 v2, v21

    goto :goto_10

    :cond_13
    move v3, v4

    goto :goto_f

    :goto_10
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v21

    goto :goto_11

    :cond_14
    move/from16 v31, v1

    move/from16 v30, v3

    move/from16 v27, v4

    move/from16 v2, v21

    move/from16 v8, v22

    move/from16 v7, v23

    const/high16 v1, 0x40000000    # 2.0f

    move/from16 v29, v0

    :goto_11
    add-int/lit8 v0, v31, 0x0

    move/from16 v22, v8

    :goto_12
    add-int/lit8 v0, v0, 0x1

    move v2, v1

    move/from16 v4, v27

    move/from16 v3, v30

    const/4 v5, -0x1

    move/from16 v7, p2

    const/4 v8, 0x0

    move v1, v0

    move/from16 v0, v29

    goto/16 :goto_1

    :cond_15
    move v1, v2

    move/from16 v30, v3

    move/from16 v27, v4

    move/from16 v2, v21

    move/from16 v8, v22

    const/high16 v7, -0x80000000

    const/16 v26, -0x2

    iget v3, v6, Lcf;->f:I

    if-lez v3, :cond_16

    invoke-virtual {v6, v9}, Lcf;->a(I)Z

    move-result v3

    if-eqz v3, :cond_16

    iget v3, v6, Lcf;->f:I

    iget v4, v6, Lcf;->l:I

    add-int/2addr v3, v4

    iput v3, v6, Lcf;->f:I

    :cond_16
    aget v3, v13, v17

    const/4 v4, -0x1

    if-ne v3, v4, :cond_17

    const/4 v3, 0x0

    aget v1, v13, v3

    if-ne v1, v4, :cond_17

    aget v1, v13, v16

    if-ne v1, v4, :cond_17

    const/4 v1, 0x3

    aget v3, v13, v1

    if-eq v3, v4, :cond_18

    goto :goto_13

    :cond_17
    const/4 v1, 0x3

    :goto_13
    aget v3, v13, v1

    const/4 v4, 0x0

    aget v5, v13, v4

    aget v7, v13, v17

    aget v4, v13, v16

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    aget v4, v14, v1

    const/4 v1, 0x0

    aget v5, v14, v1

    aget v1, v14, v17

    aget v7, v14, v16

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v3, v1

    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    move-result v15

    :cond_18
    if-eqz v30, :cond_1d

    const/high16 v1, -0x80000000

    if-eq v10, v1, :cond_19

    if-nez v10, :cond_1d

    :cond_19
    const/4 v1, 0x0

    iput v1, v6, Lcf;->f:I

    move v3, v1

    :goto_14
    if-ge v3, v9, :cond_1d

    invoke-virtual {v6, v3}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_1a

    iget v4, v6, Lcf;->f:I

    add-int/2addr v4, v1

    :goto_15
    iput v4, v6, Lcf;->f:I

    goto :goto_16

    :cond_1a
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v5, 0x8

    if-ne v1, v5, :cond_1b

    add-int/lit8 v3, v3, 0x0

    goto :goto_16

    :cond_1b
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lcf$a;

    if-eqz v18, :cond_1c

    iget v4, v6, Lcf;->f:I

    iget v5, v1, Lcf$a;->leftMargin:I

    add-int/2addr v5, v12

    iget v1, v1, Lcf$a;->rightMargin:I

    add-int/2addr v5, v1

    const/4 v7, 0x0

    add-int/2addr v5, v7

    add-int/2addr v4, v5

    goto :goto_15

    :cond_1c
    const/4 v7, 0x0

    iget v4, v6, Lcf;->f:I

    add-int v5, v4, v12

    iget v7, v1, Lcf$a;->leftMargin:I

    add-int/2addr v5, v7

    iget v1, v1, Lcf$a;->rightMargin:I

    add-int/2addr v5, v1

    const/4 v1, 0x0

    add-int/2addr v5, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v6, Lcf;->f:I

    :goto_16
    add-int/lit8 v3, v3, 0x1

    const/4 v1, 0x0

    goto :goto_14

    :cond_1d
    iget v1, v6, Lcf;->f:I

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingLeft()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v1, v3

    iput v1, v6, Lcf;->f:I

    iget v1, v6, Lcf;->f:I

    invoke-virtual/range {p0 .. p0}, Lcf;->getSuggestedMinimumWidth()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    move/from16 v7, p1

    const/4 v3, 0x0

    invoke-static {v1, v7, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    const v3, 0xffffff

    and-int/2addr v3, v1

    iget v4, v6, Lcf;->f:I

    sub-int/2addr v3, v4

    if-nez v20, :cond_21

    if-eqz v3, :cond_1e

    cmpl-float v5, v0, v19

    if-lez v5, :cond_1e

    goto :goto_18

    :cond_1e
    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz v30, :cond_20

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v10, v2, :cond_20

    const/4 v2, 0x0

    :goto_17
    if-ge v2, v9, :cond_20

    invoke-virtual {v6, v2}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1f

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v8, 0x8

    if-eq v5, v8, :cond_1f

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Lcf$a;

    iget v5, v5, Lcf$a;->g:F

    cmpl-float v5, v5, v19

    if-lez v5, :cond_1f

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v12, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    invoke-static {v10, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    invoke-virtual {v3, v8, v10}, Landroid/view/View;->measure(II)V

    :cond_1f
    add-int/lit8 v2, v2, 0x1

    goto :goto_17

    :cond_20
    move v12, v0

    move/from16 v37, v1

    move/from16 v34, v9

    move/from16 v8, v23

    const/4 v2, 0x0

    move/from16 v3, p2

    goto/16 :goto_27

    :cond_21
    :goto_18
    iget v5, v6, Lcf;->g:F

    cmpl-float v5, v5, v19

    if-lez v5, :cond_22

    iget v0, v6, Lcf;->g:F

    :cond_22
    const/4 v5, -0x1

    const/4 v8, 0x3

    aput v5, v13, v8

    aput v5, v13, v16

    aput v5, v13, v17

    const/4 v12, 0x0

    aput v5, v13, v12

    aput v5, v14, v8

    aput v5, v14, v16

    aput v5, v14, v17

    aput v5, v14, v12

    iput v12, v6, Lcf;->f:I

    move v12, v2

    move v15, v5

    move/from16 v8, v23

    move v2, v0

    const/4 v0, 0x0

    :goto_19
    if-ge v0, v9, :cond_30

    invoke-virtual {v6, v0}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_2f

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v7, 0x8

    if-eq v4, v7, :cond_2f

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Lcf$a;

    iget v7, v4, Lcf$a;->g:F

    cmpl-float v20, v7, v19

    if-lez v20, :cond_27

    move/from16 v34, v9

    int-to-float v9, v3

    mul-float/2addr v9, v7

    div-float/2addr v9, v2

    float-to-int v9, v9

    sub-float/2addr v2, v7

    sub-int/2addr v3, v9

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingTop()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingBottom()I

    move-result v20

    add-int v7, v7, v20

    move/from16 v35, v2

    iget v2, v4, Lcf$a;->topMargin:I

    add-int/2addr v7, v2

    iget v2, v4, Lcf$a;->bottomMargin:I

    add-int/2addr v7, v2

    iget v2, v4, Lcf$a;->height:I

    move/from16 v37, v1

    move/from16 v36, v3

    const/4 v1, -0x1

    move/from16 v3, p2

    invoke-static {v3, v7, v2}, Lcf;->getChildMeasureSpec(III)I

    move-result v2

    iget v7, v4, Lcf$a;->width:I

    if-nez v7, :cond_25

    const/high16 v7, 0x40000000    # 2.0f

    if-eq v10, v7, :cond_23

    goto :goto_1b

    :cond_23
    if-lez v9, :cond_24

    move v7, v9

    goto :goto_1c

    :cond_24
    :goto_1a
    const/4 v7, 0x0

    goto :goto_1c

    :cond_25
    :goto_1b
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v9

    if-gez v7, :cond_26

    goto :goto_1a

    :cond_26
    :goto_1c
    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    invoke-virtual {v5, v7, v2}, Landroid/view/View;->measure(II)V

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    const/high16 v7, -0x1000000

    and-int/2addr v2, v7

    invoke-static {v8, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v8

    move/from16 v2, v35

    goto :goto_1d

    :cond_27
    move/from16 v37, v1

    move v7, v3

    move/from16 v34, v9

    const/4 v1, -0x1

    move/from16 v3, p2

    move/from16 v36, v7

    :goto_1d
    if-eqz v18, :cond_28

    iget v7, v6, Lcf;->f:I

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    iget v1, v4, Lcf$a;->leftMargin:I

    add-int/2addr v9, v1

    iget v1, v4, Lcf$a;->rightMargin:I

    add-int/2addr v9, v1

    const/4 v1, 0x0

    add-int/2addr v9, v1

    add-int/2addr v7, v9

    iput v7, v6, Lcf;->f:I

    :goto_1e
    const/high16 v1, 0x40000000    # 2.0f

    goto :goto_1f

    :cond_28
    const/4 v1, 0x0

    iget v7, v6, Lcf;->f:I

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v9, v7

    iget v1, v4, Lcf$a;->leftMargin:I

    add-int/2addr v9, v1

    iget v1, v4, Lcf$a;->rightMargin:I

    add-int/2addr v9, v1

    const/4 v1, 0x0

    add-int/2addr v9, v1

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v6, Lcf;->f:I

    goto :goto_1e

    :goto_1f
    if-eq v11, v1, :cond_29

    iget v1, v4, Lcf$a;->height:I

    const/4 v7, -0x1

    if-ne v1, v7, :cond_29

    move/from16 v1, v17

    goto :goto_20

    :cond_29
    const/4 v1, 0x0

    :goto_20
    iget v7, v4, Lcf$a;->topMargin:I

    iget v9, v4, Lcf$a;->bottomMargin:I

    add-int/2addr v7, v9

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    add-int/2addr v9, v7

    invoke-static {v15, v9}, Ljava/lang/Math;->max(II)I

    move-result v15

    if-eqz v1, :cond_2a

    goto :goto_21

    :cond_2a
    move v7, v9

    :goto_21
    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-eqz v24, :cond_2b

    iget v7, v4, Lcf$a;->height:I

    const/4 v12, -0x1

    if-ne v7, v12, :cond_2c

    move/from16 v7, v17

    goto :goto_22

    :cond_2b
    const/4 v12, -0x1

    :cond_2c
    const/4 v7, 0x0

    :goto_22
    if-eqz v27, :cond_2e

    invoke-virtual {v5}, Landroid/view/View;->getBaseline()I

    move-result v5

    if-eq v5, v12, :cond_2e

    iget v12, v4, Lcf$a;->h:I

    if-gez v12, :cond_2d

    iget v4, v6, Lcf;->e:I

    goto :goto_23

    :cond_2d
    iget v4, v4, Lcf$a;->h:I

    :goto_23
    and-int/lit8 v4, v4, 0x70

    const/16 v20, 0x4

    shr-int/lit8 v4, v4, 0x4

    and-int/lit8 v4, v4, -0x2

    shr-int/lit8 v4, v4, 0x1

    aget v12, v13, v4

    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    move-result v12

    aput v12, v13, v4

    aget v12, v14, v4

    sub-int/2addr v9, v5

    invoke-static {v12, v9}, Ljava/lang/Math;->max(II)I

    move-result v5

    aput v5, v14, v4

    goto :goto_24

    :cond_2e
    const/16 v20, 0x4

    :goto_24
    move v12, v1

    move/from16 v24, v7

    goto :goto_25

    :cond_2f
    move/from16 v37, v1

    move v7, v3

    move/from16 v34, v9

    move/from16 v3, p2

    const/16 v20, 0x4

    move/from16 v36, v7

    :goto_25
    add-int/lit8 v0, v0, 0x1

    move/from16 v9, v34

    move/from16 v3, v36

    move/from16 v1, v37

    const/4 v5, -0x1

    move/from16 v7, p1

    goto/16 :goto_19

    :cond_30
    move/from16 v37, v1

    move/from16 v34, v9

    move/from16 v3, p2

    iget v0, v6, Lcf;->f:I

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingLeft()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    iput v0, v6, Lcf;->f:I

    aget v0, v13, v17

    const/4 v1, -0x1

    if-ne v0, v1, :cond_32

    const/4 v0, 0x0

    aget v2, v13, v0

    if-ne v2, v1, :cond_32

    aget v0, v13, v16

    if-ne v0, v1, :cond_32

    const/4 v0, 0x3

    aget v2, v13, v0

    if-eq v2, v1, :cond_31

    goto :goto_26

    :cond_31
    const/4 v2, 0x0

    goto :goto_27

    :cond_32
    const/4 v0, 0x3

    :goto_26
    aget v1, v13, v0

    const/4 v2, 0x0

    aget v4, v13, v2

    aget v5, v13, v17

    aget v7, v13, v16

    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    aget v0, v14, v0

    aget v4, v14, v2

    aget v5, v14, v17

    aget v7, v14, v16

    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v1, v0

    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v15, v0

    :goto_27
    if-nez v24, :cond_33

    const/high16 v0, 0x40000000    # 2.0f

    if-eq v11, v0, :cond_33

    goto :goto_28

    :cond_33
    move v12, v15

    :goto_28
    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingTop()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v12, v0

    invoke-virtual/range {p0 .. p0}, Lcf;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/high16 v1, -0x1000000

    and-int/2addr v1, v8

    or-int v1, v37, v1

    shl-int/lit8 v4, v8, 0x10

    invoke-static {v0, v3, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    invoke-virtual {v6, v1, v0}, Lcf;->setMeasuredDimension(II)V

    if-eqz v25, :cond_36

    invoke-virtual/range {p0 .. p0}, Lcf;->getMeasuredHeight()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    move v9, v2

    move/from16 v8, v34

    :goto_29
    if-ge v9, v8, :cond_36

    invoke-virtual {v6, v9}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v5, 0x8

    if-eq v0, v5, :cond_35

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcf$a;

    iget v0, v10, Lcf$a;->height:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_34

    iget v11, v10, Lcf$a;->width:I

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iput v0, v10, Lcf$a;->width:I

    const/4 v3, 0x0

    const/4 v12, 0x0

    move-object v0, v6

    move v13, v2

    move/from16 v2, p1

    move v4, v7

    move v14, v5

    move v5, v12

    invoke-virtual/range {v0 .. v5}, Lcf;->measureChildWithMargins(Landroid/view/View;IIII)V

    iput v11, v10, Lcf$a;->width:I

    goto :goto_2a

    :cond_34
    move v13, v2

    move v14, v5

    goto :goto_2a

    :cond_35
    move v14, v5

    const/4 v13, -0x1

    :goto_2a
    add-int/lit8 v9, v9, 0x1

    goto :goto_29

    :cond_36
    return-void
.end method

.method private b(Landroid/graphics/Canvas;I)V
    .locals 5

    iget-object v0, p0, Lcf;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcf;->getPaddingTop()I

    move-result v1

    iget v2, p0, Lcf;->o:I

    add-int/2addr v1, v2

    iget v2, p0, Lcf;->l:I

    add-int/2addr v2, p2

    invoke-virtual {p0}, Lcf;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Lcf;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Lcf;->o:I

    sub-int/2addr v3, v4

    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object p2, p0, Lcf;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method private static b(Landroid/view/View;IIII)V
    .locals 0

    add-int/2addr p3, p1

    add-int/2addr p4, p2

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private static getChildrenSkipCount$5359dca7()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private static getLocationOffset$3c7ec8d0()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private static getNextLocationOffset$3c7ec8d0()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Landroid/util/AttributeSet;)Lcf$a;
    .locals 2

    new-instance v0, Lcf$a;

    invoke-virtual {p0}, Lcf;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcf$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected final a(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget p1, p0, Lcf;->n:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcf;->getChildCount()I

    move-result v2

    if-ne p1, v2, :cond_3

    iget p1, p0, Lcf;->n:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    iget v2, p0, Lcf;->n:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_5

    sub-int/2addr p1, v1

    :goto_0
    if-ltz p1, :cond_5

    invoke-virtual {p0, p1}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_4

    move v0, v1

    return v0

    :cond_4
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_5
    return v0
.end method

.method public b(Landroid/view/ViewGroup$LayoutParams;)Lcf$a;
    .locals 1

    new-instance v0, Lcf$a;

    invoke-direct {v0, p1}, Lcf$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public c()Lcf$a;
    .locals 3

    iget v0, p0, Lcf;->d:I

    const/4 v1, -0x2

    if-nez v0, :cond_0

    new-instance v0, Lcf$a;

    invoke-direct {v0, v1, v1}, Lcf$a;-><init>(II)V

    return-object v0

    :cond_0
    iget v0, p0, Lcf;->d:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    new-instance v0, Lcf$a;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Lcf$a;-><init>(II)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Lcf$a;

    return p1
.end method

.method public synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0}, Lcf;->c()Lcf$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0, p1}, Lcf;->a(Landroid/util/AttributeSet;)Lcf$a;

    move-result-object p1

    return-object p1
.end method

.method public synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0, p1}, Lcf;->b(Landroid/view/ViewGroup$LayoutParams;)Lcf$a;

    move-result-object p1

    return-object p1
.end method

.method public getBaseline()I
    .locals 5

    iget v0, p0, Lcf;->b:I

    if-gez v0, :cond_0

    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcf;->getChildCount()I

    move-result v0

    iget v1, p0, Lcf;->b:I

    if-gt v0, v1, :cond_1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lcf;->b:I

    invoke-virtual {p0, v0}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_3

    iget v0, p0, Lcf;->b:I

    if-nez v0, :cond_2

    return v2

    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget v2, p0, Lcf;->c:I

    iget v3, p0, Lcf;->d:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    iget v3, p0, Lcf;->e:I

    and-int/lit8 v3, v3, 0x70

    const/16 v4, 0x30

    if-eq v3, v4, :cond_6

    const/16 v4, 0x10

    if-eq v3, v4, :cond_5

    const/16 v4, 0x50

    if-eq v3, v4, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcf;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Lcf;->getTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Lcf;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Lcf;->f:I

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcf;->getBottom()I

    move-result v3

    invoke-virtual {p0}, Lcf;->getTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Lcf;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Lcf;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Lcf;->f:I

    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    :cond_6
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcf$a;

    iget v0, v0, Lcf$a;->topMargin:I

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2
.end method

.method public getBaselineAlignedChildIndex()I
    .locals 1

    iget v0, p0, Lcf;->b:I

    return v0
.end method

.method public getDividerDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcf;->k:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getDividerPadding()I
    .locals 1

    iget v0, p0, Lcf;->o:I

    return v0
.end method

.method public getDividerWidth()I
    .locals 1

    iget v0, p0, Lcf;->l:I

    return v0
.end method

.method public getGravity()I
    .locals 1

    iget v0, p0, Lcf;->e:I

    return v0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Lcf;->d:I

    return v0
.end method

.method public getShowDividers()I
    .locals 1

    iget v0, p0, Lcf;->n:I

    return v0
.end method

.method getVirtualChildCount()I
    .locals 1

    invoke-virtual {p0}, Lcf;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getWeightSum()F
    .locals 1

    iget v0, p0, Lcf;->g:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    iget-object v0, p0, Lcf;->k:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcf;->d:I

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_5

    invoke-virtual {p0}, Lcf;->getVirtualChildCount()I

    move-result v0

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p0, v2}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-eq v5, v1, :cond_1

    invoke-virtual {p0, v2}, Lcf;->a(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Lcf$a;

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v4

    iget v5, v5, Lcf$a;->topMargin:I

    sub-int/2addr v4, v5

    iget v5, p0, Lcf;->m:I

    sub-int/2addr v4, v5

    invoke-direct {p0, p1, v4}, Lcf;->a(Landroid/graphics/Canvas;I)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Lcf;->a(I)Z

    move-result v1

    if-eqz v1, :cond_4

    sub-int/2addr v0, v3

    invoke-virtual {p0, v0}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcf;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcf;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcf;->m:I

    sub-int/2addr v0, v1

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lcf$a;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Lcf$a;->bottomMargin:I

    add-int/2addr v0, v1

    :goto_1
    invoke-direct {p0, p1, v0}, Lcf;->a(Landroid/graphics/Canvas;I)V

    :cond_4
    return-void

    :cond_5
    invoke-virtual {p0}, Lcf;->getVirtualChildCount()I

    move-result v0

    invoke-static {p0}, Lcx;->a(Landroid/view/View;)Z

    move-result v4

    :goto_2
    if-ge v2, v0, :cond_8

    invoke-virtual {p0, v2}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-eq v6, v1, :cond_7

    invoke-virtual {p0, v2}, Lcf;->a(I)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Lcf$a;

    if-eqz v4, :cond_6

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v5

    iget v6, v6, Lcf$a;->rightMargin:I

    add-int/2addr v5, v6

    goto :goto_3

    :cond_6
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v5

    iget v6, v6, Lcf$a;->leftMargin:I

    sub-int/2addr v5, v6

    iget v6, p0, Lcf;->l:I

    sub-int/2addr v5, v6

    :goto_3
    invoke-direct {p0, p1, v5}, Lcf;->b(Landroid/graphics/Canvas;I)V

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    invoke-virtual {p0, v0}, Lcf;->a(I)Z

    move-result v1

    if-eqz v1, :cond_c

    sub-int/2addr v0, v3

    invoke-virtual {p0, v0}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_a

    if-eqz v4, :cond_9

    invoke-virtual {p0}, Lcf;->getPaddingLeft()I

    move-result v0

    goto :goto_5

    :cond_9
    invoke-virtual {p0}, Lcf;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcf;->getPaddingRight()I

    move-result v1

    :goto_4
    sub-int/2addr v0, v1

    iget v1, p0, Lcf;->l:I

    sub-int/2addr v0, v1

    goto :goto_5

    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lcf$a;

    if-eqz v4, :cond_b

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v1, v1, Lcf$a;->leftMargin:I

    goto :goto_4

    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    iget v1, v1, Lcf$a;->rightMargin:I

    add-int/2addr v0, v1

    :goto_5
    invoke-direct {p0, p1, v0}, Lcf;->b(Landroid/graphics/Canvas;I)V

    :cond_c
    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Lcf;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-class v0, Lcf;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 24

    move-object/from16 v0, p0

    iget v5, v0, Lcf;->d:I

    const/4 v6, 0x5

    const/16 v7, 0x8

    const/16 v8, 0x50

    const/16 v9, 0x10

    const v10, 0x800007

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-ne v5, v12, :cond_9

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingLeft()I

    move-result v5

    sub-int v1, p4, p2

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingRight()I

    move-result v3

    sub-int v3, v1, v3

    sub-int/2addr v1, v5

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingRight()I

    move-result v14

    sub-int/2addr v1, v14

    invoke-virtual/range {p0 .. p0}, Lcf;->getVirtualChildCount()I

    move-result v14

    iget v15, v0, Lcf;->e:I

    and-int/lit8 v15, v15, 0x70

    iget v13, v0, Lcf;->e:I

    and-int/2addr v10, v13

    if-eq v15, v9, :cond_1

    if-eq v15, v8, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingTop()I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingTop()I

    move-result v8

    add-int v8, v8, p5

    sub-int v8, v8, p3

    iget v2, v0, Lcf;->f:I

    sub-int v2, v8, v2

    goto :goto_0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingTop()I

    move-result v8

    sub-int v2, p5, p3

    iget v4, v0, Lcf;->f:I

    sub-int/2addr v2, v4

    div-int/2addr v2, v11

    add-int/2addr v2, v8

    :goto_0
    move v4, v2

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v14, :cond_8

    invoke-virtual {v0, v2}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    if-nez v8, :cond_2

    add-int/lit8 v4, v4, 0x0

    goto :goto_4

    :cond_2
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-eq v9, v7, :cond_7

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    check-cast v15, Lcf$a;

    iget v7, v15, Lcf$a;->h:I

    if-gez v7, :cond_3

    move v7, v10

    :cond_3
    invoke-static/range {p0 .. p0}, Lgq;->b(Landroid/view/View;)I

    move-result v11

    invoke-static {v7, v11}, Lgf;->a(II)I

    move-result v7

    and-int/lit8 v7, v7, 0x7

    if-eq v7, v12, :cond_5

    if-eq v7, v6, :cond_4

    iget v7, v15, Lcf$a;->leftMargin:I

    add-int/2addr v7, v5

    goto :goto_3

    :cond_4
    sub-int v7, v3, v9

    goto :goto_2

    :cond_5
    sub-int v7, v1, v9

    const/4 v11, 0x2

    div-int/2addr v7, v11

    add-int/2addr v7, v5

    iget v11, v15, Lcf$a;->leftMargin:I

    add-int/2addr v7, v11

    :goto_2
    iget v11, v15, Lcf$a;->rightMargin:I

    sub-int/2addr v7, v11

    :goto_3
    invoke-virtual {v0, v2}, Lcf;->a(I)Z

    move-result v11

    if-eqz v11, :cond_6

    iget v11, v0, Lcf;->m:I

    add-int/2addr v4, v11

    :cond_6
    iget v11, v15, Lcf$a;->topMargin:I

    add-int/2addr v4, v11

    add-int/lit8 v11, v4, 0x0

    invoke-static {v8, v7, v11, v9, v13}, Lcf;->b(Landroid/view/View;IIII)V

    iget v7, v15, Lcf$a;->bottomMargin:I

    add-int/2addr v13, v7

    const/4 v7, 0x0

    add-int/2addr v13, v7

    add-int/2addr v4, v13

    add-int/lit8 v2, v2, 0x0

    :cond_7
    :goto_4
    add-int/2addr v2, v12

    const/16 v7, 0x8

    const/4 v11, 0x2

    goto :goto_1

    :cond_8
    return-void

    :cond_9
    invoke-static/range {p0 .. p0}, Lcx;->a(Landroid/view/View;)Z

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingTop()I

    move-result v7

    sub-int v2, p5, p3

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingBottom()I

    move-result v4

    sub-int v4, v2, v4

    sub-int/2addr v2, v7

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingBottom()I

    move-result v11

    sub-int/2addr v2, v11

    invoke-virtual/range {p0 .. p0}, Lcf;->getVirtualChildCount()I

    move-result v11

    iget v13, v0, Lcf;->e:I

    and-int/2addr v10, v13

    iget v13, v0, Lcf;->e:I

    and-int/lit8 v13, v13, 0x70

    iget-boolean v14, v0, Lcf;->a:Z

    iget-object v15, v0, Lcf;->i:[I

    iget-object v8, v0, Lcf;->j:[I

    invoke-static/range {p0 .. p0}, Lgq;->b(Landroid/view/View;)I

    move-result v9

    invoke-static {v10, v9}, Lgf;->a(II)I

    move-result v9

    if-eq v9, v12, :cond_b

    if-eq v9, v6, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingLeft()I

    move-result v1

    goto :goto_5

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingLeft()I

    move-result v6

    add-int v6, v6, p4

    sub-int v6, v6, p2

    iget v1, v0, Lcf;->f:I

    sub-int v1, v6, v1

    goto :goto_5

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingLeft()I

    move-result v6

    sub-int v1, p4, p2

    iget v3, v0, Lcf;->f:I

    sub-int/2addr v1, v3

    const/4 v3, 0x2

    div-int/2addr v1, v3

    add-int/2addr v1, v6

    :goto_5
    if-eqz v5, :cond_c

    add-int/lit8 v5, v11, -0x1

    const/4 v6, -0x1

    goto :goto_6

    :cond_c
    move v6, v12

    const/4 v5, 0x0

    :goto_6
    move v9, v1

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v11, :cond_17

    mul-int v10, v6, v1

    add-int/2addr v10, v5

    invoke-virtual {v0, v10}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    if-nez v12, :cond_d

    add-int/lit8 v9, v9, 0x0

    move/from16 v18, v5

    move/from16 v19, v6

    move/from16 v20, v11

    move/from16 v21, v13

    move/from16 v22, v14

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v14, -0x1

    goto/16 :goto_b

    :cond_d
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v3

    move/from16 v18, v5

    const/16 v5, 0x8

    if-eq v3, v5, :cond_16

    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v16

    move/from16 v19, v6

    move-object/from16 v6, v16

    check-cast v6, Lcf$a;

    if-eqz v14, :cond_e

    move/from16 v20, v11

    iget v11, v6, Lcf$a;->height:I

    move/from16 v21, v13

    const/4 v13, -0x1

    if-eq v11, v13, :cond_f

    invoke-virtual {v12}, Landroid/view/View;->getBaseline()I

    move-result v11

    goto :goto_8

    :cond_e
    move/from16 v20, v11

    move/from16 v21, v13

    :cond_f
    const/4 v11, -0x1

    :goto_8
    iget v13, v6, Lcf$a;->h:I

    if-gez v13, :cond_10

    move/from16 v13, v21

    :cond_10
    and-int/lit8 v13, v13, 0x70

    move/from16 v22, v14

    const/16 v14, 0x10

    if-eq v13, v14, :cond_14

    const/16 v14, 0x30

    if-eq v13, v14, :cond_12

    const/16 v14, 0x50

    if-eq v13, v14, :cond_11

    move v11, v7

    const/4 v14, -0x1

    goto :goto_9

    :cond_11
    sub-int v13, v4, v5

    iget v14, v6, Lcf$a;->bottomMargin:I

    sub-int/2addr v13, v14

    const/4 v14, -0x1

    if-eq v11, v14, :cond_13

    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v16

    sub-int v16, v16, v11

    const/4 v11, 0x2

    aget v17, v8, v11

    sub-int v17, v17, v16

    sub-int v11, v13, v17

    goto :goto_9

    :cond_12
    const/4 v14, -0x1

    iget v13, v6, Lcf$a;->topMargin:I

    add-int/2addr v13, v7

    if-eq v11, v14, :cond_13

    const/16 v16, 0x1

    aget v17, v15, v16

    sub-int v17, v17, v11

    add-int v11, v13, v17

    goto :goto_9

    :cond_13
    move v11, v13

    goto :goto_9

    :cond_14
    const/4 v14, -0x1

    sub-int v11, v2, v5

    const/4 v13, 0x2

    div-int/2addr v11, v13

    add-int/2addr v11, v7

    iget v13, v6, Lcf$a;->topMargin:I

    add-int/2addr v11, v13

    iget v13, v6, Lcf$a;->bottomMargin:I

    sub-int/2addr v11, v13

    :goto_9
    invoke-virtual {v0, v10}, Lcf;->a(I)Z

    move-result v10

    if-eqz v10, :cond_15

    iget v10, v0, Lcf;->l:I

    add-int/2addr v9, v10

    :cond_15
    iget v10, v6, Lcf$a;->leftMargin:I

    add-int/2addr v9, v10

    add-int/lit8 v10, v9, 0x0

    invoke-static {v12, v10, v11, v3, v5}, Lcf;->b(Landroid/view/View;IIII)V

    iget v5, v6, Lcf$a;->rightMargin:I

    add-int/2addr v3, v5

    const/4 v5, 0x0

    add-int/2addr v3, v5

    add-int/2addr v9, v3

    add-int/lit8 v1, v1, 0x0

    goto :goto_a

    :cond_16
    move/from16 v19, v6

    move/from16 v20, v11

    move/from16 v21, v13

    move/from16 v22, v14

    const/4 v5, 0x0

    const/4 v14, -0x1

    :goto_a
    const/4 v3, 0x1

    :goto_b
    add-int/2addr v1, v3

    move v12, v3

    move/from16 v5, v18

    move/from16 v6, v19

    move/from16 v11, v20

    move/from16 v13, v21

    move/from16 v14, v22

    goto/16 :goto_7

    :cond_17
    return-void
.end method

.method public onMeasure(II)V
    .locals 38

    move-object/from16 v6, p0

    move/from16 v7, p1

    move/from16 v8, p2

    iget v0, v6, Lcf;->d:I

    const/4 v9, 0x1

    if-ne v0, v9, :cond_2b

    const/4 v10, 0x0

    iput v10, v6, Lcf;->f:I

    invoke-virtual/range {p0 .. p0}, Lcf;->getVirtualChildCount()I

    move-result v11

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v12

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v13

    iget v14, v6, Lcf;->b:I

    iget-boolean v15, v6, Lcf;->h:Z

    const/16 v16, 0x0

    move/from16 v18, v9

    move v1, v10

    move v2, v1

    move v4, v2

    move v5, v4

    move v9, v5

    move/from16 v17, v9

    move/from16 v19, v17

    move/from16 v20, v19

    move/from16 v0, v16

    :goto_0
    if-ge v5, v11, :cond_11

    invoke-virtual {v6, v5}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_0

    iget v3, v6, Lcf;->f:I

    add-int/2addr v3, v10

    iput v3, v6, Lcf;->f:I

    move/from16 v27, v11

    move/from16 v26, v13

    const/4 v3, 0x1

    goto/16 :goto_a

    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v10

    move/from16 v23, v1

    const/16 v1, 0x8

    if-eq v10, v1, :cond_10

    invoke-virtual {v6, v5}, Lcf;->a(I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, v6, Lcf;->f:I

    iget v10, v6, Lcf;->m:I

    add-int/2addr v1, v10

    iput v1, v6, Lcf;->f:I

    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcf$a;

    iget v1, v10, Lcf$a;->g:F

    add-float v21, v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v13, v1, :cond_2

    iget v0, v10, Lcf$a;->height:I

    if-nez v0, :cond_2

    iget v0, v10, Lcf$a;->g:F

    cmpl-float v0, v0, v16

    if-lez v0, :cond_2

    iget v0, v6, Lcf;->f:I

    iget v1, v10, Lcf$a;->topMargin:I

    add-int/2addr v1, v0

    move/from16 v24, v2

    iget v2, v10, Lcf$a;->bottomMargin:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v6, Lcf;->f:I

    move-object v7, v3

    move/from16 v31, v4

    move/from16 v32, v5

    move/from16 v28, v9

    move/from16 v27, v11

    move/from16 v26, v13

    move/from16 v29, v20

    move/from16 v30, v23

    move/from16 v2, v24

    const/16 v17, 0x1

    goto/16 :goto_3

    :cond_2
    move/from16 v24, v2

    iget v0, v10, Lcf$a;->height:I

    if-nez v0, :cond_3

    iget v0, v10, Lcf$a;->g:F

    cmpl-float v0, v0, v16

    if-lez v0, :cond_3

    const/4 v0, -0x2

    iput v0, v10, Lcf$a;->height:I

    const/4 v2, 0x0

    goto :goto_1

    :cond_3
    const/high16 v2, -0x80000000

    :goto_1
    const/16 v22, 0x0

    cmpl-float v0, v21, v16

    if-nez v0, :cond_4

    iget v0, v6, Lcf;->f:I

    move/from16 v25, v0

    goto :goto_2

    :cond_4
    const/16 v25, 0x0

    :goto_2
    move-object v0, v6

    move/from16 v26, v13

    move/from16 v13, v23

    const/high16 v23, 0x40000000    # 2.0f

    move-object v1, v3

    move/from16 v28, v9

    move/from16 v27, v11

    move/from16 v9, v24

    move v11, v2

    move v2, v7

    move-object v7, v3

    move/from16 v30, v13

    move/from16 v29, v20

    const/high16 v13, -0x80000000

    move/from16 v3, v22

    move/from16 v31, v4

    move v4, v8

    move/from16 v32, v5

    move/from16 v5, v25

    invoke-direct/range {v0 .. v5}, Lcf;->a(Landroid/view/View;IIII)V

    if-eq v11, v13, :cond_5

    iput v11, v10, Lcf$a;->height:I

    :cond_5
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget v1, v6, Lcf;->f:I

    add-int v2, v1, v0

    iget v3, v10, Lcf$a;->topMargin:I

    add-int/2addr v2, v3

    iget v3, v10, Lcf$a;->bottomMargin:I

    add-int/2addr v2, v3

    const/4 v3, 0x0

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v6, Lcf;->f:I

    if-eqz v15, :cond_6

    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v2, v0

    goto :goto_3

    :cond_6
    move v2, v9

    :goto_3
    if-ltz v14, :cond_7

    move/from16 v1, v32

    add-int/lit8 v5, v1, 0x1

    if-ne v14, v5, :cond_8

    iget v0, v6, Lcf;->f:I

    iput v0, v6, Lcf;->c:I

    goto :goto_4

    :cond_7
    move/from16 v1, v32

    :cond_8
    :goto_4
    if-ge v1, v14, :cond_9

    iget v0, v10, Lcf$a;->g:F

    cmpl-float v0, v0, v16

    if-lez v0, :cond_9

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    const/high16 v0, 0x40000000    # 2.0f

    if-eq v12, v0, :cond_a

    iget v0, v10, Lcf$a;->width:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_b

    const/4 v0, 0x1

    const/16 v19, 0x1

    goto :goto_5

    :cond_a
    const/4 v3, -0x1

    :cond_b
    const/4 v0, 0x0

    :goto_5
    iget v4, v10, Lcf$a;->leftMargin:I

    iget v5, v10, Lcf$a;->rightMargin:I

    add-int/2addr v4, v5

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    add-int/2addr v5, v4

    move/from16 v11, v30

    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredState()I

    move-result v7

    move/from16 v13, v28

    invoke-static {v13, v7}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v7

    if-eqz v18, :cond_c

    iget v11, v10, Lcf$a;->width:I

    if-ne v11, v3, :cond_c

    const/16 v18, 0x1

    goto :goto_6

    :cond_c
    const/16 v18, 0x0

    :goto_6
    iget v3, v10, Lcf$a;->g:F

    cmpl-float v3, v3, v16

    if-lez v3, :cond_e

    if-eqz v0, :cond_d

    :goto_7
    move/from16 v10, v29

    goto :goto_8

    :cond_d
    move v4, v5

    goto :goto_7

    :goto_8
    invoke-static {v10, v4}, Ljava/lang/Math;->max(II)I

    move-result v20

    move/from16 v10, v20

    move/from16 v4, v31

    goto :goto_9

    :cond_e
    move/from16 v10, v29

    if-eqz v0, :cond_f

    move v5, v4

    :cond_f
    move/from16 v4, v31

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    goto :goto_9

    :cond_10
    move v1, v5

    move/from16 v27, v11

    move/from16 v26, v13

    move/from16 v10, v20

    move/from16 v11, v23

    move v13, v9

    move v9, v2

    move/from16 v21, v0

    move v9, v11

    move v7, v13

    :goto_9
    add-int/lit8 v5, v1, 0x0

    move v1, v9

    move/from16 v20, v10

    move/from16 v0, v21

    const/4 v3, 0x1

    move v9, v7

    :goto_a
    add-int/2addr v5, v3

    move/from16 v13, v26

    move/from16 v11, v27

    move/from16 v7, p1

    const/4 v10, 0x0

    goto/16 :goto_0

    :cond_11
    move/from16 v27, v11

    move/from16 v26, v13

    move/from16 v10, v20

    const/4 v3, -0x1

    const/high16 v13, -0x80000000

    move v11, v1

    move v1, v9

    move v9, v2

    iget v2, v6, Lcf;->f:I

    if-lez v2, :cond_12

    move/from16 v2, v27

    invoke-virtual {v6, v2}, Lcf;->a(I)Z

    move-result v5

    if-eqz v5, :cond_13

    iget v5, v6, Lcf;->f:I

    iget v7, v6, Lcf;->m:I

    add-int/2addr v5, v7

    iput v5, v6, Lcf;->f:I

    goto :goto_b

    :cond_12
    move/from16 v2, v27

    :cond_13
    :goto_b
    if-eqz v15, :cond_18

    move/from16 v5, v26

    if-eq v5, v13, :cond_15

    if-nez v5, :cond_14

    goto :goto_c

    :cond_14
    move/from16 v33, v1

    goto :goto_10

    :cond_15
    :goto_c
    const/4 v7, 0x0

    iput v7, v6, Lcf;->f:I

    move v13, v7

    :goto_d
    if-ge v13, v2, :cond_14

    invoke-virtual {v6, v13}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    if-nez v14, :cond_16

    iget v14, v6, Lcf;->f:I

    add-int/2addr v14, v7

    iput v14, v6, Lcf;->f:I

    goto :goto_e

    :cond_16
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v3, 0x8

    if-ne v7, v3, :cond_17

    add-int/lit8 v13, v13, 0x0

    :goto_e
    move/from16 v33, v1

    goto :goto_f

    :cond_17
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lcf$a;

    iget v7, v6, Lcf;->f:I

    add-int v14, v7, v9

    move/from16 v33, v1

    iget v1, v3, Lcf$a;->topMargin:I

    add-int/2addr v14, v1

    iget v1, v3, Lcf$a;->bottomMargin:I

    add-int/2addr v14, v1

    const/4 v1, 0x0

    add-int/2addr v14, v1

    invoke-static {v7, v14}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v6, Lcf;->f:I

    :goto_f
    const/4 v1, 0x1

    add-int/2addr v13, v1

    move/from16 v1, v33

    const/4 v3, -0x1

    const/4 v7, 0x0

    goto :goto_d

    :cond_18
    move/from16 v33, v1

    move/from16 v5, v26

    :goto_10
    const/4 v1, 0x1

    iget v3, v6, Lcf;->f:I

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingTop()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingBottom()I

    move-result v13

    add-int/2addr v7, v13

    add-int/2addr v3, v7

    iput v3, v6, Lcf;->f:I

    iget v3, v6, Lcf;->f:I

    invoke-virtual/range {p0 .. p0}, Lcf;->getSuggestedMinimumHeight()I

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/4 v7, 0x0

    invoke-static {v3, v8, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v3

    const v7, 0xffffff

    and-int/2addr v7, v3

    iget v13, v6, Lcf;->f:I

    sub-int/2addr v7, v13

    if-nez v17, :cond_1c

    if-eqz v7, :cond_19

    cmpl-float v13, v0, v16

    if-lez v13, :cond_19

    goto :goto_12

    :cond_19
    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-eqz v15, :cond_1b

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v5, v1, :cond_1b

    const/4 v1, 0x0

    :goto_11
    if-ge v1, v2, :cond_1b

    invoke-virtual {v6, v1}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1a

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v7, 0x8

    if-eq v5, v7, :cond_1a

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Lcf$a;

    iget v5, v5, Lcf$a;->g:F

    cmpl-float v5, v5, v16

    if-lez v5, :cond_1a

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v5, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-static {v9, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    invoke-virtual {v4, v5, v10}, Landroid/view/View;->measure(II)V

    :cond_1a
    add-int/lit8 v1, v1, 0x1

    goto :goto_11

    :cond_1b
    move/from16 v9, v33

    move/from16 v10, p1

    goto/16 :goto_1b

    :cond_1c
    :goto_12
    iget v9, v6, Lcf;->g:F

    cmpl-float v9, v9, v16

    if-lez v9, :cond_1d

    iget v0, v6, Lcf;->g:F

    :cond_1d
    const/4 v9, 0x0

    iput v9, v6, Lcf;->f:I

    move v10, v0

    move/from16 v9, v33

    const/4 v0, 0x0

    :goto_13
    if-ge v0, v2, :cond_28

    invoke-virtual {v6, v0}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    const/16 v15, 0x8

    if-eq v14, v15, :cond_27

    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Lcf$a;

    iget v1, v14, Lcf$a;->g:F

    cmpl-float v17, v1, v16

    if-lez v17, :cond_22

    int-to-float v15, v7

    mul-float/2addr v15, v1

    div-float/2addr v15, v10

    float-to-int v15, v15

    sub-float/2addr v10, v1

    sub-int/2addr v7, v15

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingLeft()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingRight()I

    move-result v17

    add-int v1, v1, v17

    move/from16 v34, v7

    iget v7, v14, Lcf$a;->leftMargin:I

    add-int/2addr v1, v7

    iget v7, v14, Lcf$a;->rightMargin:I

    add-int/2addr v1, v7

    iget v7, v14, Lcf$a;->width:I

    move/from16 v35, v10

    move/from16 v10, p1

    invoke-static {v10, v1, v7}, Lcf;->getChildMeasureSpec(III)I

    move-result v1

    iget v7, v14, Lcf$a;->height:I

    if-nez v7, :cond_20

    const/high16 v7, 0x40000000    # 2.0f

    if-eq v5, v7, :cond_1e

    goto :goto_14

    :cond_1e
    if-lez v15, :cond_1f

    goto :goto_15

    :cond_1f
    const/high16 v7, 0x40000000    # 2.0f

    const/4 v15, 0x0

    goto :goto_16

    :cond_20
    :goto_14
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    add-int/2addr v7, v15

    if-gez v7, :cond_21

    const/4 v7, 0x0

    :cond_21
    move v15, v7

    :goto_15
    const/high16 v7, 0x40000000    # 2.0f

    :goto_16
    invoke-static {v15, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v15

    invoke-virtual {v13, v1, v15}, Landroid/view/View;->measure(II)V

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredState()I

    move-result v1

    and-int/lit16 v1, v1, -0x100

    invoke-static {v9, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v9

    goto :goto_17

    :cond_22
    move v1, v10

    move/from16 v10, p1

    move/from16 v35, v1

    move/from16 v34, v7

    :goto_17
    iget v1, v14, Lcf$a;->leftMargin:I

    iget v7, v14, Lcf$a;->rightMargin:I

    add-int/2addr v1, v7

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v1

    invoke-static {v11, v7}, Ljava/lang/Math;->max(II)I

    move-result v11

    const/high16 v15, 0x40000000    # 2.0f

    if-eq v12, v15, :cond_23

    iget v15, v14, Lcf$a;->width:I

    move/from16 v36, v1

    const/4 v1, -0x1

    if-ne v15, v1, :cond_24

    const/4 v15, 0x1

    goto :goto_18

    :cond_23
    move/from16 v36, v1

    const/4 v1, -0x1

    :cond_24
    const/4 v15, 0x0

    :goto_18
    if-eqz v15, :cond_25

    move/from16 v7, v36

    :cond_25
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-eqz v18, :cond_26

    iget v7, v14, Lcf$a;->width:I

    if-ne v7, v1, :cond_26

    const/4 v7, 0x1

    goto :goto_19

    :cond_26
    const/4 v7, 0x0

    :goto_19
    iget v15, v6, Lcf;->f:I

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    add-int/2addr v13, v15

    iget v1, v14, Lcf$a;->topMargin:I

    add-int/2addr v13, v1

    iget v1, v14, Lcf$a;->bottomMargin:I

    add-int/2addr v13, v1

    const/4 v1, 0x0

    add-int/2addr v13, v1

    invoke-static {v15, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    iput v13, v6, Lcf;->f:I

    move/from16 v18, v7

    move/from16 v7, v34

    move/from16 v13, v35

    goto :goto_1a

    :cond_27
    move v13, v10

    const/4 v1, 0x0

    move/from16 v10, p1

    :goto_1a
    add-int/lit8 v0, v0, 0x1

    move v10, v13

    const/4 v1, 0x1

    goto/16 :goto_13

    :cond_28
    move/from16 v10, p1

    iget v0, v6, Lcf;->f:I

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingTop()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingBottom()I

    move-result v5

    add-int/2addr v1, v5

    add-int/2addr v0, v1

    iput v0, v6, Lcf;->f:I

    move v0, v4

    :goto_1b
    if-nez v18, :cond_29

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v12, v1, :cond_29

    move v11, v0

    :cond_29
    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingLeft()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcf;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    add-int/2addr v11, v0

    invoke-virtual/range {p0 .. p0}, Lcf;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, v10, v9}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    invoke-virtual {v6, v0, v3}, Lcf;->setMeasuredDimension(II)V

    if-eqz v19, :cond_2a

    invoke-direct {v6, v2, v8}, Lcf;->a(II)V

    :cond_2a
    return-void

    :cond_2b
    move v10, v7

    invoke-direct/range {p0 .. p2}, Lcf;->b(II)V

    return-void
.end method

.method public setBaselineAligned(Z)V
    .locals 0

    iput-boolean p1, p0, Lcf;->a:Z

    return-void
.end method

.method public setBaselineAlignedChildIndex(I)V
    .locals 2

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Lcf;->getChildCount()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lcf;->b:I

    return-void

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "base aligned child index out of range (0, "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcf;->getChildCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object v0, p0, Lcf;->k:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcf;->k:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p0, Lcf;->l:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, p0, Lcf;->m:I

    goto :goto_0

    :cond_1
    iput v0, p0, Lcf;->l:I

    iput v0, p0, Lcf;->m:I

    :goto_0
    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-virtual {p0, v0}, Lcf;->setWillNotDraw(Z)V

    invoke-virtual {p0}, Lcf;->requestLayout()V

    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    iput p1, p0, Lcf;->o:I

    return-void
.end method

.method public setGravity(I)V
    .locals 1

    iget v0, p0, Lcf;->e:I

    if-eq v0, p1, :cond_2

    const v0, 0x800007

    and-int/2addr v0, p1

    if-nez v0, :cond_0

    const v0, 0x800003

    or-int/2addr p1, v0

    :cond_0
    and-int/lit8 v0, p1, 0x70

    if-nez v0, :cond_1

    or-int/lit8 p1, p1, 0x30

    :cond_1
    iput p1, p0, Lcf;->e:I

    invoke-virtual {p0}, Lcf;->requestLayout()V

    :cond_2
    return-void
.end method

.method public setHorizontalGravity(I)V
    .locals 2

    const v0, 0x800007

    and-int/2addr p1, v0

    iget v1, p0, Lcf;->e:I

    and-int/2addr v0, v1

    if-eq v0, p1, :cond_0

    iget v0, p0, Lcf;->e:I

    const v1, -0x800008

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    iput p1, p0, Lcf;->e:I

    invoke-virtual {p0}, Lcf;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setMeasureWithLargestChildEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcf;->h:Z

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    iget v0, p0, Lcf;->d:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcf;->d:I

    invoke-virtual {p0}, Lcf;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setShowDividers(I)V
    .locals 1

    iget v0, p0, Lcf;->n:I

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lcf;->requestLayout()V

    :cond_0
    iput p1, p0, Lcf;->n:I

    return-void
.end method

.method public setVerticalGravity(I)V
    .locals 1

    and-int/lit8 p1, p1, 0x70

    iget v0, p0, Lcf;->e:I

    and-int/lit8 v0, v0, 0x70

    if-eq v0, p1, :cond_0

    iget v0, p0, Lcf;->e:I

    and-int/lit8 v0, v0, -0x71

    or-int/2addr p1, v0

    iput p1, p0, Lcf;->e:I

    invoke-virtual {p0}, Lcf;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setWeightSum(F)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lcf;->g:F

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
