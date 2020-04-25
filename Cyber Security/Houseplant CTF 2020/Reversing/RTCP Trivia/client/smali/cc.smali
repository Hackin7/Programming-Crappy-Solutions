.class Lcc;
.super Landroid/widget/ListView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcc$b;,
        Lcc$a;
    }
.end annotation


# instance fields
.field a:Lcc$b;

.field private final b:Landroid/graphics/Rect;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/lang/reflect/Field;

.field private i:Lcc$a;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Lgt;

.field private n:Lhe;


# direct methods
.method constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    sget v0, Lb$a;->dropDownListViewStyle:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcc;->b:Landroid/graphics/Rect;

    const/4 p1, 0x0

    iput p1, p0, Lcc;->c:I

    iput p1, p0, Lcc;->d:I

    iput p1, p0, Lcc;->e:I

    iput p1, p0, Lcc;->f:I

    iput-boolean p2, p0, Lcc;->k:Z

    invoke-virtual {p0, p1}, Lcc;->setCacheColorHint(I)V

    :try_start_0
    const-class p1, Landroid/widget/AbsListView;

    const-string p2, "mIsChildViewEnabled"

    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    iput-object p1, p0, Lcc;->h:Ljava/lang/reflect/Field;

    iget-object p1, p0, Lcc;->h:Ljava/lang/reflect/Field;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/NoSuchFieldException;->printStackTrace()V

    return-void
.end method

.method private a()V
    .locals 2

    invoke-virtual {p0}, Lcc;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcc;->l:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcc;->isPressed()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcc;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    return-void
.end method

.method private setSelectorEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcc;->i:Lcc$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcc;->i:Lcc$a;

    iput-boolean p1, v0, Lcc$a;->b:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(IIIII)I
    .locals 10

    invoke-virtual {p0}, Lcc;->getListPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Lcc;->getListPaddingBottom()I

    move-result p3

    invoke-virtual {p0}, Lcc;->getListPaddingLeft()I

    invoke-virtual {p0}, Lcc;->getListPaddingRight()I

    invoke-virtual {p0}, Lcc;->getDividerHeight()I

    move-result v0

    invoke-virtual {p0}, Lcc;->getDivider()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0}, Lcc;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    if-nez v2, :cond_0

    add-int/2addr p2, p3

    return p2

    :cond_0
    add-int/2addr p2, p3

    const/4 p3, 0x0

    if-lez v0, :cond_1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v0, p3

    :goto_0
    invoke-interface {v2}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    const/4 v3, 0x0

    move v5, p2

    move p2, p3

    move v4, p2

    move v7, v4

    move-object v6, v3

    :goto_1
    if-ge p2, v1, :cond_9

    invoke-interface {v2, p2}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v8

    if-eq v8, v4, :cond_2

    move-object v6, v3

    move v4, v8

    :cond_2
    invoke-interface {v2, p2, v6, p0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    if-nez v8, :cond_3

    invoke-virtual {p0}, Lcc;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    iget v9, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v9, :cond_4

    iget v8, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    goto :goto_2

    :cond_4
    invoke-static {p3, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    :goto_2
    invoke-virtual {v6, p1, v8}, Landroid/view/View;->measure(II)V

    invoke-virtual {v6}, Landroid/view/View;->forceLayout()V

    if-lez p2, :cond_5

    add-int/2addr v5, v0

    :cond_5
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    add-int/2addr v5, v8

    if-lt v5, p4, :cond_7

    if-ltz p5, :cond_6

    if-le p2, p5, :cond_6

    if-lez v7, :cond_6

    if-eq v5, p4, :cond_6

    return v7

    :cond_6
    return p4

    :cond_7
    if-ltz p5, :cond_8

    if-lt p2, p5, :cond_8

    move v7, v5

    :cond_8
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_9
    return v5
.end method

.method public a(Landroid/view/MotionEvent;I)Z
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v3, :pswitch_data_0

    :cond_0
    :goto_0
    move v5, v4

    const/4 v3, 0x0

    goto/16 :goto_8

    :goto_1
    :pswitch_0
    move v3, v5

    goto/16 :goto_8

    :pswitch_1
    move v6, v4

    goto :goto_2

    :pswitch_2
    move v6, v5

    :goto_2
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v7

    if-gez v7, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getX(I)F

    move-result v8

    float-to-int v8, v8

    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    float-to-int v7, v7

    invoke-virtual {v1, v8, v7}, Lcc;->pointToPosition(II)I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_2

    move v3, v4

    move v5, v6

    goto/16 :goto_8

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcc;->getFirstVisiblePosition()I

    move-result v6

    sub-int v6, v9, v6

    invoke-virtual {v1, v6}, Lcc;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    int-to-float v8, v8

    int-to-float v7, v7

    iput-boolean v4, v1, Lcc;->l:Z

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x15

    if-lt v11, v12, :cond_3

    invoke-virtual {v1, v8, v7}, Lcc;->drawableHotspotChanged(FF)V

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcc;->isPressed()Z

    move-result v11

    if-nez v11, :cond_4

    invoke-virtual {v1, v4}, Lcc;->setPressed(Z)V

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcc;->layoutChildren()V

    iget v11, v1, Lcc;->g:I

    if-eq v11, v10, :cond_5

    iget v11, v1, Lcc;->g:I

    invoke-virtual/range {p0 .. p0}, Lcc;->getFirstVisiblePosition()I

    move-result v13

    sub-int/2addr v11, v13

    invoke-virtual {v1, v11}, Lcc;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_5

    if-eq v11, v6, :cond_5

    invoke-virtual {v11}, Landroid/view/View;->isPressed()Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-virtual {v11, v5}, Landroid/view/View;->setPressed(Z)V

    :cond_5
    iput v9, v1, Lcc;->g:I

    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v11

    int-to-float v11, v11

    sub-float v11, v8, v11

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v13

    int-to-float v13, v13

    sub-float v13, v7, v13

    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v14, v12, :cond_6

    invoke-virtual {v6, v11, v13}, Landroid/view/View;->drawableHotspotChanged(FF)V

    :cond_6
    invoke-virtual {v6}, Landroid/view/View;->isPressed()Z

    move-result v11

    if-nez v11, :cond_7

    invoke-virtual {v6, v4}, Landroid/view/View;->setPressed(Z)V

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lcc;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v11

    if-eqz v11, :cond_8

    if-eq v9, v10, :cond_8

    move v12, v4

    goto :goto_3

    :cond_8
    move v12, v5

    :goto_3
    if-eqz v12, :cond_9

    invoke-virtual {v11, v5, v5}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_9
    iget-object v13, v1, Lcc;->b:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v14

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v15

    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v10

    invoke-virtual {v13, v14, v15, v5, v10}, Landroid/graphics/Rect;->set(IIII)V

    iget v5, v13, Landroid/graphics/Rect;->left:I

    iget v10, v1, Lcc;->c:I

    sub-int/2addr v5, v10

    iput v5, v13, Landroid/graphics/Rect;->left:I

    iget v5, v13, Landroid/graphics/Rect;->top:I

    iget v10, v1, Lcc;->d:I

    sub-int/2addr v5, v10

    iput v5, v13, Landroid/graphics/Rect;->top:I

    iget v5, v13, Landroid/graphics/Rect;->right:I

    iget v10, v1, Lcc;->e:I

    add-int/2addr v5, v10

    iput v5, v13, Landroid/graphics/Rect;->right:I

    iget v5, v13, Landroid/graphics/Rect;->bottom:I

    iget v10, v1, Lcc;->f:I

    add-int/2addr v5, v10

    iput v5, v13, Landroid/graphics/Rect;->bottom:I

    :try_start_0
    iget-object v5, v1, Lcc;->h:Ljava/lang/reflect/Field;

    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v6}, Landroid/view/View;->isEnabled()Z

    move-result v10

    if-eq v10, v5, :cond_a

    iget-object v10, v1, Lcc;->h:Ljava/lang/reflect/Field;

    xor-int/2addr v5, v4

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v10, v1, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, -0x1

    if-eq v9, v5, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcc;->refreshDrawableState()V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object v5, v0

    invoke-virtual {v5}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    :cond_a
    :goto_4
    if-eqz v12, :cond_c

    iget-object v5, v1, Lcc;->b:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v10

    invoke-virtual {v5}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lcc;->getVisibility()I

    move-result v12

    if-nez v12, :cond_b

    move v12, v4

    :goto_5
    const/4 v13, 0x0

    goto :goto_6

    :cond_b
    const/4 v12, 0x0

    goto :goto_5

    :goto_6
    invoke-virtual {v11, v12, v13}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    invoke-static {v11, v10, v5}, Lfn;->a(Landroid/graphics/drawable/Drawable;FF)V

    goto :goto_7

    :cond_c
    const/4 v13, 0x0

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcc;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_d

    const/4 v10, -0x1

    if-eq v9, v10, :cond_d

    invoke-static {v5, v8, v7}, Lfn;->a(Landroid/graphics/drawable/Drawable;FF)V

    :cond_d
    invoke-direct {v1, v13}, Lcc;->setSelectorEnabled(Z)V

    invoke-virtual/range {p0 .. p0}, Lcc;->refreshDrawableState()V

    if-ne v3, v4, :cond_0

    invoke-virtual {v1, v9}, Lcc;->getItemIdAtPosition(I)J

    move-result-wide v7

    invoke-virtual {v1, v6, v9, v7, v8}, Lcc;->performItemClick(Landroid/view/View;IJ)Z

    goto/16 :goto_0

    :goto_8
    if-eqz v5, :cond_e

    if-eqz v3, :cond_10

    :cond_e
    const/4 v3, 0x0

    iput-boolean v3, v1, Lcc;->l:Z

    invoke-virtual {v1, v3}, Lcc;->setPressed(Z)V

    invoke-virtual/range {p0 .. p0}, Lcc;->drawableStateChanged()V

    iget v6, v1, Lcc;->g:I

    invoke-virtual/range {p0 .. p0}, Lcc;->getFirstVisiblePosition()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-virtual {v1, v6}, Lcc;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_f

    invoke-virtual {v6, v3}, Landroid/view/View;->setPressed(Z)V

    :cond_f
    iget-object v3, v1, Lcc;->m:Lgt;

    if-eqz v3, :cond_10

    iget-object v3, v1, Lcc;->m:Lgt;

    invoke-virtual {v3}, Lgt;->a()V

    const/4 v3, 0x0

    iput-object v3, v1, Lcc;->m:Lgt;

    :cond_10
    if-eqz v5, :cond_12

    iget-object v3, v1, Lcc;->n:Lhe;

    if-nez v3, :cond_11

    new-instance v3, Lhe;

    invoke-direct {v3, v1}, Lhe;-><init>(Landroid/widget/ListView;)V

    iput-object v3, v1, Lcc;->n:Lhe;

    :cond_11
    iget-object v3, v1, Lcc;->n:Lhe;

    invoke-virtual {v3, v4}, Lhe;->a(Z)Lha;

    iget-object v3, v1, Lcc;->n:Lhe;

    invoke-virtual {v3, v1, v2}, Lhe;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    return v5

    :cond_12
    iget-object v2, v1, Lcc;->n:Lhe;

    if-eqz v2, :cond_13

    iget-object v2, v1, Lcc;->n:Lhe;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lhe;->a(Z)Lha;

    :cond_13
    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    iget-object v0, p0, Lcc;->b:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcc;->getSelector()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcc;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected drawableStateChanged()V
    .locals 1

    iget-object v0, p0, Lcc;->a:Lcc$b;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->drawableStateChanged()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcc;->setSelectorEnabled(Z)V

    invoke-direct {p0}, Lcc;->a()V

    return-void
.end method

.method public hasFocus()Z
    .locals 1

    iget-boolean v0, p0, Lcc;->k:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public hasWindowFocus()Z
    .locals 1

    iget-boolean v0, p0, Lcc;->k:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isFocused()Z
    .locals 1

    iget-boolean v0, p0, Lcc;->k:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isInTouchMode()Z
    .locals 1

    iget-boolean v0, p0, Lcc;->k:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcc;->j:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcc;->a:Lcc$b;

    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    return-void
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    iget-object v1, p0, Lcc;->a:Lcc$b;

    if-nez v1, :cond_1

    new-instance v1, Lcc$b;

    invoke-direct {v1, p0}, Lcc$b;-><init>(Lcc;)V

    iput-object v1, p0, Lcc;->a:Lcc$b;

    iget-object v1, p0, Lcc;->a:Lcc$b;

    iget-object v2, v1, Lcc$b;->a:Lcc;

    invoke-virtual {v2, v1}, Lcc;->post(Ljava/lang/Runnable;)Z

    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ListView;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    const/16 v2, 0x9

    const/4 v3, -0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x7

    if-ne v0, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v3}, Lcc;->setSelection(I)V

    return v1

    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1}, Lcc;->pointToPosition(II)I

    move-result p1

    if-eq p1, v3, :cond_5

    invoke-virtual {p0}, Lcc;->getSelectedItemPosition()I

    move-result v0

    if-eq p1, v0, :cond_5

    invoke-virtual {p0}, Lcc;->getFirstVisiblePosition()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0, v0}, Lcc;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0}, Lcc;->getTop()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0, p1, v0}, Lcc;->setSelectionFromTop(II)V

    :cond_4
    invoke-direct {p0}, Lcc;->a()V

    :cond_5
    return v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0, v0, v1}, Lcc;->pointToPosition(II)I

    move-result v0

    iput v0, p0, Lcc;->g:I

    :goto_0
    iget-object v0, p0, Lcc;->a:Lcc$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcc;->a:Lcc$b;

    iget-object v1, v0, Lcc$b;->a:Lcc;

    const/4 v2, 0x0

    iput-object v2, v1, Lcc;->a:Lcc$b;

    iget-object v1, v0, Lcc$b;->a:Lcc;

    invoke-virtual {v1, v0}, Lcc;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method setListSelectionHidden(Z)V
    .locals 0

    iput-boolean p1, p0, Lcc;->j:Z

    return-void
.end method

.method public setSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Lcc$a;

    invoke-direct {v0, p1}, Lcc$a;-><init>(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcc;->i:Lcc$a;

    iget-object v0, p0, Lcc;->i:Lcc$a;

    invoke-super {p0, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    :cond_1
    iget p1, v0, Landroid/graphics/Rect;->left:I

    iput p1, p0, Lcc;->c:I

    iget p1, v0, Landroid/graphics/Rect;->top:I

    iput p1, p0, Lcc;->d:I

    iget p1, v0, Landroid/graphics/Rect;->right:I

    iput p1, p0, Lcc;->e:I

    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    iput p1, p0, Lcc;->f:I

    return-void
.end method
