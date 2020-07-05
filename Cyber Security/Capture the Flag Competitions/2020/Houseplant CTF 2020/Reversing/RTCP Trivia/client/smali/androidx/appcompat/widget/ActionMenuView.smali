.class public Landroidx/appcompat/widget/ActionMenuView;
.super Lcf;

# interfaces
.implements Laj$b;
.implements Lar;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActionMenuView$c;,
        Landroidx/appcompat/widget/ActionMenuView$a;,
        Landroidx/appcompat/widget/ActionMenuView$b;,
        Landroidx/appcompat/widget/ActionMenuView$d;,
        Landroidx/appcompat/widget/ActionMenuView$e;
    }
.end annotation


# instance fields
.field public a:Laj;

.field public b:Z

.field public c:Lba;

.field d:Laj$a;

.field e:Landroidx/appcompat/widget/ActionMenuView$e;

.field private f:Landroid/content/Context;

.field private g:I

.field private h:Laq$a;

.field private i:Z

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcf;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/ActionMenuView;->setBaselineAligned(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x42600000    # 56.0f

    mul-float/2addr v1, v0

    float-to-int v1, v1

    iput v1, p0, Landroidx/appcompat/widget/ActionMenuView;->k:I

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v1, v0

    float-to-int v0, v1

    iput v0, p0, Landroidx/appcompat/widget/ActionMenuView;->l:I

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->f:Landroid/content/Context;

    iput p2, p0, Landroidx/appcompat/widget/ActionMenuView;->g:I

    return-void
.end method

.method public static a(Landroid/view/View;IIII)I
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView$c;

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    sub-int/2addr v1, p4

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p3

    invoke-static {v1, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    instance-of p4, p0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    if-eqz p4, :cond_0

    move-object p4, p0

    check-cast p4, Landroidx/appcompat/view/menu/ActionMenuItemView;

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Landroidx/appcompat/view/menu/ActionMenuItemView;->b()Z

    move-result p4

    if-eqz p4, :cond_1

    move p4, v2

    goto :goto_1

    :cond_1
    move p4, v1

    :goto_1
    const/4 v3, 0x2

    if-lez p2, :cond_5

    if-eqz p4, :cond_2

    if-lt p2, v3, :cond_5

    :cond_2
    mul-int/2addr p2, p1

    const/high16 v4, -0x80000000

    invoke-static {p2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0, p2, p3}, Landroid/view/View;->measure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    div-int v4, p2, p1

    rem-int/2addr p2, p1

    if-eqz p2, :cond_3

    add-int/lit8 v4, v4, 0x1

    :cond_3
    if-eqz p4, :cond_4

    if-ge v4, v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v4

    goto :goto_2

    :cond_5
    move v3, v1

    :goto_2
    iget-boolean p2, v0, Landroidx/appcompat/widget/ActionMenuView$c;->a:Z

    if-nez p2, :cond_6

    if-eqz p4, :cond_6

    move v1, v2

    :cond_6
    iput-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView$c;->d:Z

    iput v3, v0, Landroidx/appcompat/widget/ActionMenuView$c;->b:I

    mul-int/2addr p1, v3

    const/high16 p2, 0x40000000    # 2.0f

    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-virtual {p0, p1, p3}, Landroid/view/View;->measure(II)V

    return v3
.end method

.method public static a()Landroidx/appcompat/widget/ActionMenuView$c;
    .locals 2

    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->d()Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView$c;->a:Z

    return-object v0
.end method

.method public static a(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$c;
    .locals 1

    if-eqz p0, :cond_2

    instance-of v0, p0, Landroidx/appcompat/widget/ActionMenuView$c;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$c;

    check-cast p0, Landroidx/appcompat/widget/ActionMenuView$c;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActionMenuView$c;-><init>(Landroidx/appcompat/widget/ActionMenuView$c;)V

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$c;

    invoke-direct {v0, p0}, Landroidx/appcompat/widget/ActionMenuView$c;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    iget p0, v0, Landroidx/appcompat/widget/ActionMenuView$c;->h:I

    if-gtz p0, :cond_1

    const/16 p0, 0x10

    iput p0, v0, Landroidx/appcompat/widget/ActionMenuView$c;->h:I

    :cond_1
    return-object v0

    :cond_2
    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->d()Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object p0

    return-object p0
.end method

.method private b(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionMenuView$c;
    .locals 2

    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$c;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/ActionMenuView$c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method private b(I)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, p1, -0x1

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getChildCount()I

    move-result v3

    if-ge p1, v3, :cond_1

    instance-of v3, v1, Landroidx/appcompat/widget/ActionMenuView$a;

    if-eqz v3, :cond_1

    check-cast v1, Landroidx/appcompat/widget/ActionMenuView$a;

    invoke-interface {v1}, Landroidx/appcompat/widget/ActionMenuView$a;->d()Z

    move-result v1

    or-int/2addr v0, v1

    :cond_1
    if-lez p1, :cond_2

    instance-of p1, v2, Landroidx/appcompat/widget/ActionMenuView$a;

    if-eqz p1, :cond_2

    check-cast v2, Landroidx/appcompat/widget/ActionMenuView$a;

    invoke-interface {v2}, Landroidx/appcompat/widget/ActionMenuView$a;->c()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    return v0
.end method

.method private static d()Landroidx/appcompat/widget/ActionMenuView$c;
    .locals 2

    new-instance v0, Landroidx/appcompat/widget/ActionMenuView$c;

    invoke-direct {v0}, Landroidx/appcompat/widget/ActionMenuView$c;-><init>()V

    const/16 v1, 0x10

    iput v1, v0, Landroidx/appcompat/widget/ActionMenuView$c;->h:I

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Landroid/util/AttributeSet;)Lcf$a;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->b(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object p1

    return-object p1
.end method

.method public final a(Laj;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    return-void
.end method

.method public final a(Laq$a;Laj$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->h:Laq$a;

    iput-object p2, p0, Landroidx/appcompat/widget/ActionMenuView;->d:Laj$a;

    return-void
.end method

.method public final a(Lal;)Z
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Laj;->a(Landroid/view/MenuItem;Laq;I)Z

    move-result p1

    return p1
.end method

.method protected final synthetic b(Landroid/view/ViewGroup$LayoutParams;)Lcf$a;
    .locals 0

    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuView;->a(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object p1

    return-object p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    invoke-virtual {v0}, Lba;->f()Z

    :cond_0
    return-void
.end method

.method protected final synthetic c()Lcf$a;
    .locals 1

    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->d()Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object v0

    return-object v0
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    if-eqz p1, :cond_0

    instance-of p1, p1, Landroidx/appcompat/widget/ActionMenuView$c;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->d()Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->b(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object p1

    return-object p1
.end method

.method protected synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuView;->a(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object p1

    return-object p1
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Laj;

    invoke-direct {v1, v0}, Laj;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    new-instance v2, Landroidx/appcompat/widget/ActionMenuView$d;

    invoke-direct {v2, p0}, Landroidx/appcompat/widget/ActionMenuView$d;-><init>(Landroidx/appcompat/widget/ActionMenuView;)V

    invoke-virtual {v1, v2}, Laj;->a(Laj$a;)V

    new-instance v1, Lba;

    invoke-direct {v1, v0}, Lba;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    invoke-virtual {v0}, Lba;->c()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->h:Laq$a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->h:Laq$a;

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/appcompat/widget/ActionMenuView$b;

    invoke-direct {v1}, Landroidx/appcompat/widget/ActionMenuView$b;-><init>()V

    :goto_0
    iput-object v1, v0, Lad;->f:Laq$a;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    iget-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    iget-object v2, p0, Landroidx/appcompat/widget/ActionMenuView;->f:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Laj;->a(Laq;Landroid/content/Context;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    invoke-virtual {v0, p0}, Lba;->a(Landroidx/appcompat/widget/ActionMenuView;)V

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    return-object v0
.end method

.method public getOverflowIcon()Landroid/graphics/drawable/Drawable;
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    iget-object v1, v0, Lba;->i:Lba$d;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lba;->i:Lba$d;

    invoke-virtual {v0}, Lba$d;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_0
    iget-boolean v1, v0, Lba;->k:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, Lba;->j:Landroid/graphics/drawable/Drawable;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPopupTheme()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/ActionMenuView;->g:I

    return v0
.end method

.method public getWindowAnimations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Lcf;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lba;->a(Z)V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    invoke-virtual {p1}, Lba;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    invoke-virtual {p1}, Lba;->e()Z

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    invoke-virtual {p1}, Lba;->d()Z

    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Lcf;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->b()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 18

    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView;->i:Z

    if-nez v1, :cond_0

    invoke-super/range {p0 .. p5}, Lcf;->onLayout(ZIIII)V

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getChildCount()I

    move-result v1

    sub-int v2, p5, p3

    div-int/lit8 v2, v2, 0x2

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getDividerWidth()I

    move-result v3

    sub-int v4, p4, p2

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingRight()I

    move-result v5

    sub-int v5, v4, v5

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingLeft()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static/range {p0 .. p0}, Lcx;->a(Landroid/view/View;)Z

    move-result v6

    move v10, v5

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    const/16 v11, 0x8

    const/4 v12, 0x1

    if-ge v5, v1, :cond_5

    invoke-virtual {v0, v5}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    if-eq v14, v11, :cond_4

    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroidx/appcompat/widget/ActionMenuView$c;

    iget-boolean v14, v11, Landroidx/appcompat/widget/ActionMenuView$c;->a:Z

    if-eqz v14, :cond_3

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-direct {v0, v5}, Landroidx/appcompat/widget/ActionMenuView;->b(I)Z

    move-result v14

    if-eqz v14, :cond_1

    add-int/2addr v8, v3

    :cond_1
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    if-eqz v6, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingLeft()I

    move-result v15

    iget v11, v11, Landroidx/appcompat/widget/ActionMenuView$c;->leftMargin:I

    add-int/2addr v15, v11

    add-int v11, v15, v8

    goto :goto_1

    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getWidth()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingRight()I

    move-result v16

    sub-int v15, v15, v16

    iget v11, v11, Landroidx/appcompat/widget/ActionMenuView$c;->rightMargin:I

    sub-int v11, v15, v11

    sub-int v15, v11, v8

    :goto_1
    div-int/lit8 v16, v14, 0x2

    sub-int v7, v2, v16

    add-int/2addr v14, v7

    invoke-virtual {v13, v15, v7, v11, v14}, Landroid/view/View;->layout(IIII)V

    sub-int/2addr v10, v8

    move v8, v12

    goto :goto_2

    :cond_3
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    iget v12, v11, Landroidx/appcompat/widget/ActionMenuView$c;->leftMargin:I

    add-int/2addr v7, v12

    iget v11, v11, Landroidx/appcompat/widget/ActionMenuView$c;->rightMargin:I

    add-int/2addr v7, v11

    sub-int/2addr v10, v7

    invoke-direct {v0, v5}, Landroidx/appcompat/widget/ActionMenuView;->b(I)Z

    add-int/lit8 v9, v9, 0x1

    :cond_4
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    if-ne v1, v12, :cond_6

    if-nez v8, :cond_6

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    div-int/lit8 v4, v4, 0x2

    div-int/lit8 v6, v3, 0x2

    sub-int/2addr v4, v6

    div-int/lit8 v6, v5, 0x2

    sub-int/2addr v2, v6

    add-int/2addr v3, v4

    add-int/2addr v5, v2

    invoke-virtual {v1, v4, v2, v3, v5}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_6
    xor-int/lit8 v3, v8, 0x1

    sub-int/2addr v9, v3

    if-lez v9, :cond_7

    div-int v7, v10, v9

    const/4 v3, 0x0

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    const/4 v7, 0x0

    :goto_3
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-eqz v6, :cond_a

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getWidth()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    :goto_4
    if-ge v3, v1, :cond_9

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/appcompat/widget/ActionMenuView$c;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eq v8, v11, :cond_8

    iget-boolean v8, v7, Landroidx/appcompat/widget/ActionMenuView$c;->a:Z

    if-nez v8, :cond_8

    iget v8, v7, Landroidx/appcompat/widget/ActionMenuView$c;->rightMargin:I

    sub-int/2addr v5, v8

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    div-int/lit8 v10, v9, 0x2

    sub-int v10, v2, v10

    sub-int v12, v5, v8

    add-int/2addr v9, v10

    invoke-virtual {v6, v12, v10, v5, v9}, Landroid/view/View;->layout(IIII)V

    iget v6, v7, Landroidx/appcompat/widget/ActionMenuView$c;->leftMargin:I

    add-int/2addr v8, v6

    add-int/2addr v8, v4

    sub-int/2addr v5, v8

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    return-void

    :cond_a
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingLeft()I

    move-result v5

    :goto_5
    if-ge v3, v1, :cond_c

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/appcompat/widget/ActionMenuView$c;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-eq v8, v11, :cond_b

    iget-boolean v8, v7, Landroidx/appcompat/widget/ActionMenuView$c;->a:Z

    if-nez v8, :cond_b

    iget v8, v7, Landroidx/appcompat/widget/ActionMenuView$c;->leftMargin:I

    add-int/2addr v5, v8

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    div-int/lit8 v10, v9, 0x2

    sub-int v10, v2, v10

    add-int v12, v5, v8

    add-int/2addr v9, v10

    invoke-virtual {v6, v5, v10, v12, v9}, Landroid/view/View;->layout(IIII)V

    iget v6, v7, Landroidx/appcompat/widget/ActionMenuView$c;->rightMargin:I

    add-int/2addr v8, v6

    add-int/2addr v8, v4

    add-int/2addr v5, v8

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_c
    return-void
.end method

.method protected onMeasure(II)V
    .locals 34

    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView;->i:Z

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    iput-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->i:Z

    iget-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->i:Z

    if-eq v1, v2, :cond_1

    iput v4, v0, Landroidx/appcompat/widget/ActionMenuView;->j:I

    :cond_1
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    iget-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->i:Z

    if-eqz v2, :cond_2

    iget-object v2, v0, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    if-eqz v2, :cond_2

    iget v2, v0, Landroidx/appcompat/widget/ActionMenuView;->j:I

    if-eq v1, v2, :cond_2

    iput v1, v0, Landroidx/appcompat/widget/ActionMenuView;->j:I

    iget-object v1, v0, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    invoke-virtual {v1, v5}, Laj;->b(Z)V

    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getChildCount()I

    move-result v1

    iget-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->i:Z

    if-eqz v2, :cond_27

    if-lez v1, :cond_27

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingLeft()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingRight()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingTop()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getPaddingBottom()I

    move-result v9

    add-int/2addr v8, v9

    const/4 v9, -0x2

    move/from16 v10, p2

    invoke-static {v10, v8, v9}, Landroidx/appcompat/widget/ActionMenuView;->getChildMeasureSpec(III)I

    move-result v9

    sub-int/2addr v2, v7

    iget v7, v0, Landroidx/appcompat/widget/ActionMenuView;->k:I

    div-int v7, v2, v7

    iget v10, v0, Landroidx/appcompat/widget/ActionMenuView;->k:I

    rem-int v10, v2, v10

    if-nez v7, :cond_3

    invoke-virtual {v0, v2, v4}, Landroidx/appcompat/widget/ActionMenuView;->setMeasuredDimension(II)V

    return-void

    :cond_3
    iget v11, v0, Landroidx/appcompat/widget/ActionMenuView;->k:I

    div-int/2addr v10, v7

    add-int/2addr v11, v10

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/ActionMenuView;->getChildCount()I

    move-result v10

    move v3, v4

    move v12, v3

    move v14, v12

    move v15, v14

    move/from16 v17, v15

    move/from16 v16, v7

    const-wide/16 v20, 0x0

    move/from16 v7, v17

    :goto_1
    if-ge v7, v10, :cond_b

    invoke-virtual {v0, v7}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v5

    const/16 v4, 0x8

    if-eq v5, v4, :cond_a

    instance-of v4, v13, Landroidx/appcompat/view/menu/ActionMenuItemView;

    add-int/lit8 v15, v15, 0x1

    if-eqz v4, :cond_4

    iget v5, v0, Landroidx/appcompat/widget/ActionMenuView;->l:I

    move/from16 v22, v6

    iget v6, v0, Landroidx/appcompat/widget/ActionMenuView;->l:I

    move/from16 v23, v15

    const/4 v15, 0x0

    invoke-virtual {v13, v5, v15, v6, v15}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_2

    :cond_4
    move/from16 v22, v6

    move/from16 v23, v15

    const/4 v15, 0x0

    :goto_2
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/appcompat/widget/ActionMenuView$c;

    iput-boolean v15, v5, Landroidx/appcompat/widget/ActionMenuView$c;->f:Z

    iput v15, v5, Landroidx/appcompat/widget/ActionMenuView$c;->c:I

    iput v15, v5, Landroidx/appcompat/widget/ActionMenuView$c;->b:I

    iput-boolean v15, v5, Landroidx/appcompat/widget/ActionMenuView$c;->d:Z

    iput v15, v5, Landroidx/appcompat/widget/ActionMenuView$c;->leftMargin:I

    iput v15, v5, Landroidx/appcompat/widget/ActionMenuView$c;->rightMargin:I

    if-eqz v4, :cond_5

    move-object v4, v13

    check-cast v4, Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-virtual {v4}, Landroidx/appcompat/view/menu/ActionMenuItemView;->b()Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, 0x1

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    :goto_3
    iput-boolean v4, v5, Landroidx/appcompat/widget/ActionMenuView$c;->e:Z

    iget-boolean v4, v5, Landroidx/appcompat/widget/ActionMenuView$c;->a:Z

    if-eqz v4, :cond_6

    const/4 v4, 0x1

    goto :goto_4

    :cond_6
    move/from16 v4, v16

    :goto_4
    invoke-static {v13, v11, v4, v9, v8}, Landroidx/appcompat/widget/ActionMenuView;->a(Landroid/view/View;IIII)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget-boolean v6, v5, Landroidx/appcompat/widget/ActionMenuView$c;->d:Z

    if-eqz v6, :cond_7

    add-int/lit8 v17, v17, 0x1

    :cond_7
    iget-boolean v5, v5, Landroidx/appcompat/widget/ActionMenuView$c;->a:Z

    if-eqz v5, :cond_8

    const/4 v14, 0x1

    :cond_8
    sub-int v16, v16, v4

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-static {v12, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v6, 0x1

    if-ne v4, v6, :cond_9

    shl-int v4, v6, v7

    int-to-long v12, v4

    or-long v12, v20, v12

    move-wide/from16 v20, v12

    move/from16 v15, v23

    move v12, v5

    goto :goto_5

    :cond_9
    move v12, v5

    move/from16 v15, v23

    goto :goto_5

    :cond_a
    move/from16 v22, v6

    :goto_5
    add-int/lit8 v7, v7, 0x1

    move/from16 v6, v22

    const/4 v4, 0x0

    const/4 v5, 0x1

    goto/16 :goto_1

    :cond_b
    move/from16 v22, v6

    const/4 v4, 0x2

    if-eqz v14, :cond_c

    if-ne v15, v4, :cond_c

    const/4 v5, 0x1

    goto :goto_6

    :cond_c
    const/4 v5, 0x0

    :goto_6
    move/from16 v6, v16

    const/4 v7, 0x0

    :goto_7
    const-wide/16 v23, 0x1

    if-lez v17, :cond_15

    if-lez v6, :cond_15

    const v8, 0x7fffffff

    move v4, v8

    const/4 v8, 0x0

    const/4 v13, 0x0

    const-wide/16 v25, 0x0

    :goto_8
    if-ge v8, v10, :cond_f

    move/from16 v27, v7

    invoke-virtual {v0, v8}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/appcompat/widget/ActionMenuView$c;

    move/from16 v28, v12

    iget-boolean v12, v7, Landroidx/appcompat/widget/ActionMenuView$c;->d:Z

    if-eqz v12, :cond_e

    iget v12, v7, Landroidx/appcompat/widget/ActionMenuView$c;->b:I

    if-ge v12, v4, :cond_d

    iget v4, v7, Landroidx/appcompat/widget/ActionMenuView$c;->b:I

    shl-long v12, v23, v8

    move-wide/from16 v25, v12

    const/4 v13, 0x1

    goto :goto_9

    :cond_d
    iget v7, v7, Landroidx/appcompat/widget/ActionMenuView$c;->b:I

    if-ne v7, v4, :cond_e

    shl-long v29, v23, v8

    or-long v25, v25, v29

    add-int/lit8 v13, v13, 0x1

    :cond_e
    :goto_9
    add-int/lit8 v8, v8, 0x1

    move/from16 v7, v27

    move/from16 v12, v28

    goto :goto_8

    :cond_f
    move/from16 v27, v7

    move/from16 v28, v12

    or-long v20, v20, v25

    if-gt v13, v6, :cond_14

    add-int/lit8 v4, v4, 0x1

    move v7, v6

    const/4 v6, 0x0

    :goto_a
    if-ge v6, v10, :cond_13

    invoke-virtual {v0, v6}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroidx/appcompat/widget/ActionMenuView$c;

    move/from16 v31, v2

    const/4 v13, 0x1

    shl-int v2, v13, v6

    move/from16 v32, v1

    int-to-long v1, v2

    and-long v23, v25, v1

    const-wide/16 v18, 0x0

    cmp-long v13, v23, v18

    if-nez v13, :cond_10

    iget v8, v12, Landroidx/appcompat/widget/ActionMenuView$c;->b:I

    if-ne v8, v4, :cond_12

    or-long v20, v20, v1

    goto :goto_b

    :cond_10
    if-eqz v5, :cond_11

    iget-boolean v1, v12, Landroidx/appcompat/widget/ActionMenuView$c;->e:Z

    if-eqz v1, :cond_11

    const/4 v1, 0x1

    if-ne v7, v1, :cond_11

    iget v2, v0, Landroidx/appcompat/widget/ActionMenuView;->l:I

    add-int/2addr v2, v11

    iget v13, v0, Landroidx/appcompat/widget/ActionMenuView;->l:I

    const/4 v1, 0x0

    invoke-virtual {v8, v2, v1, v13, v1}, Landroid/view/View;->setPadding(IIII)V

    :cond_11
    iget v1, v12, Landroidx/appcompat/widget/ActionMenuView$c;->b:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v12, Landroidx/appcompat/widget/ActionMenuView$c;->b:I

    iput-boolean v2, v12, Landroidx/appcompat/widget/ActionMenuView$c;->f:Z

    add-int/lit8 v7, v7, -0x1

    :cond_12
    :goto_b
    add-int/lit8 v6, v6, 0x1

    move/from16 v2, v31

    move/from16 v1, v32

    goto :goto_a

    :cond_13
    move v6, v7

    move/from16 v12, v28

    const/4 v4, 0x2

    const/4 v7, 0x1

    goto/16 :goto_7

    :cond_14
    move/from16 v32, v1

    move/from16 v31, v2

    goto :goto_c

    :cond_15
    move/from16 v32, v1

    move/from16 v31, v2

    move/from16 v27, v7

    move/from16 v28, v12

    :goto_c
    move-wide/from16 v1, v20

    if-nez v14, :cond_16

    const/4 v4, 0x1

    if-ne v15, v4, :cond_17

    move v5, v4

    goto :goto_d

    :cond_16
    const/4 v4, 0x1

    :cond_17
    const/4 v5, 0x0

    :goto_d
    if-lez v6, :cond_23

    const-wide/16 v7, 0x0

    cmp-long v12, v1, v7

    if-eqz v12, :cond_23

    sub-int/2addr v15, v4

    if-lt v6, v15, :cond_18

    if-nez v5, :cond_18

    if-le v3, v4, :cond_23

    :cond_18
    invoke-static {v1, v2}, Ljava/lang/Long;->bitCount(J)I

    move-result v3

    int-to-float v3, v3

    if-nez v5, :cond_1a

    and-long v4, v1, v23

    const-wide/16 v7, 0x0

    cmp-long v4, v4, v7

    const/high16 v5, 0x3f000000    # 0.5f

    if-eqz v4, :cond_19

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/widget/ActionMenuView$c;

    iget-boolean v4, v4, Landroidx/appcompat/widget/ActionMenuView$c;->e:Z

    if-nez v4, :cond_19

    sub-float/2addr v3, v5

    :cond_19
    add-int/lit8 v4, v10, -0x1

    const/4 v7, 0x1

    shl-int v8, v7, v4

    int-to-long v7, v8

    and-long/2addr v7, v1

    const-wide/16 v12, 0x0

    cmp-long v7, v7, v12

    if-eqz v7, :cond_1a

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/widget/ActionMenuView$c;

    iget-boolean v4, v4, Landroidx/appcompat/widget/ActionMenuView$c;->e:Z

    if-nez v4, :cond_1a

    sub-float/2addr v3, v5

    :cond_1a
    const/4 v4, 0x0

    cmpl-float v4, v3, v4

    if-lez v4, :cond_1b

    mul-int/2addr v6, v11

    int-to-float v4, v6

    div-float/2addr v4, v3

    float-to-int v4, v4

    goto :goto_e

    :cond_1b
    const/4 v4, 0x0

    :goto_e
    move/from16 v5, v27

    const/4 v3, 0x0

    :goto_f
    if-ge v3, v10, :cond_22

    const/4 v6, 0x1

    shl-int v7, v6, v3

    int-to-long v7, v7

    and-long/2addr v7, v1

    const-wide/16 v12, 0x0

    cmp-long v7, v7, v12

    if-eqz v7, :cond_20

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/appcompat/widget/ActionMenuView$c;

    instance-of v7, v7, Landroidx/appcompat/view/menu/ActionMenuItemView;

    if-eqz v7, :cond_1d

    iput v4, v8, Landroidx/appcompat/widget/ActionMenuView$c;->c:I

    iput-boolean v6, v8, Landroidx/appcompat/widget/ActionMenuView$c;->f:Z

    if-nez v3, :cond_1c

    iget-boolean v5, v8, Landroidx/appcompat/widget/ActionMenuView$c;->e:Z

    if-nez v5, :cond_1c

    neg-int v5, v4

    const/4 v6, 0x2

    div-int/2addr v5, v6

    iput v5, v8, Landroidx/appcompat/widget/ActionMenuView$c;->leftMargin:I

    goto :goto_10

    :cond_1c
    const/4 v6, 0x2

    :goto_10
    const/4 v5, 0x1

    const/4 v7, 0x1

    goto :goto_11

    :cond_1d
    const/4 v6, 0x2

    iget-boolean v7, v8, Landroidx/appcompat/widget/ActionMenuView$c;->a:Z

    if-eqz v7, :cond_1e

    iput v4, v8, Landroidx/appcompat/widget/ActionMenuView$c;->c:I

    const/4 v7, 0x1

    iput-boolean v7, v8, Landroidx/appcompat/widget/ActionMenuView$c;->f:Z

    neg-int v5, v4

    div-int/2addr v5, v6

    iput v5, v8, Landroidx/appcompat/widget/ActionMenuView$c;->rightMargin:I

    move v5, v7

    goto :goto_11

    :cond_1e
    const/4 v7, 0x1

    if-eqz v3, :cond_1f

    div-int/lit8 v14, v4, 0x2

    iput v14, v8, Landroidx/appcompat/widget/ActionMenuView$c;->leftMargin:I

    :cond_1f
    add-int/lit8 v14, v10, -0x1

    if-eq v3, v14, :cond_21

    div-int/lit8 v14, v4, 0x2

    iput v14, v8, Landroidx/appcompat/widget/ActionMenuView$c;->rightMargin:I

    goto :goto_11

    :cond_20
    move v7, v6

    const/4 v6, 0x2

    :cond_21
    :goto_11
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_22
    move/from16 v27, v5

    :cond_23
    if-eqz v27, :cond_25

    const/4 v1, 0x0

    :goto_12
    if-ge v1, v10, :cond_25

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ActionMenuView$c;

    iget-boolean v4, v3, Landroidx/appcompat/widget/ActionMenuView$c;->f:Z

    if-eqz v4, :cond_24

    iget v4, v3, Landroidx/appcompat/widget/ActionMenuView$c;->b:I

    mul-int/2addr v4, v11

    iget v3, v3, Landroidx/appcompat/widget/ActionMenuView$c;->c:I

    add-int/2addr v4, v3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v2, v4, v9}, Landroid/view/View;->measure(II)V

    goto :goto_13

    :cond_24
    const/high16 v3, 0x40000000    # 2.0f

    :goto_13
    add-int/lit8 v1, v1, 0x1

    goto :goto_12

    :cond_25
    const/high16 v3, 0x40000000    # 2.0f

    move/from16 v1, v32

    if-eq v1, v3, :cond_26

    move/from16 v1, v28

    goto :goto_14

    :cond_26
    move/from16 v1, v22

    :goto_14
    move/from16 v2, v31

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/widget/ActionMenuView;->setMeasuredDimension(II)V

    return-void

    :cond_27
    move/from16 v10, p2

    const/4 v2, 0x0

    :goto_15
    if-ge v2, v1, :cond_28

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/ActionMenuView$c;

    const/4 v4, 0x0

    iput v4, v3, Landroidx/appcompat/widget/ActionMenuView$c;->rightMargin:I

    iput v4, v3, Landroidx/appcompat/widget/ActionMenuView$c;->leftMargin:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_28
    invoke-super/range {p0 .. p2}, Lcf;->onMeasure(II)V

    return-void
.end method

.method public setExpandedActionViewsExclusive(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    iput-boolean p1, v0, Lba;->l:Z

    return-void
.end method

.method public setOnMenuItemClickListener(Landroidx/appcompat/widget/ActionMenuView$e;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->e:Landroidx/appcompat/widget/ActionMenuView$e;

    return-void
.end method

.method public setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    iget-object v1, v0, Lba;->i:Lba$d;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lba;->i:Lba$d;

    invoke-virtual {v0, p1}, Lba$d;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, v0, Lba;->k:Z

    iput-object p1, v0, Lba;->j:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public setOverflowReserved(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionMenuView;->b:Z

    return-void
.end method

.method public setPopupTheme(I)V
    .locals 2

    iget v0, p0, Landroidx/appcompat/widget/ActionMenuView;->g:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Landroidx/appcompat/widget/ActionMenuView;->g:I

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->f:Landroid/content/Context;

    return-void

    :cond_0
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->f:Landroid/content/Context;

    :cond_1
    return-void
.end method

.method public setPresenter(Lba;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    invoke-virtual {p1, p0}, Lba;->a(Landroidx/appcompat/widget/ActionMenuView;)V

    return-void
.end method
