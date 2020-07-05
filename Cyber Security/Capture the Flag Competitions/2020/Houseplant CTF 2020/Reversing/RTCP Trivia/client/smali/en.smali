.class public final Len;
.super Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method protected final onMeasure(II)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Len;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setGuidelineBegin(I)V
    .locals 1

    invoke-virtual {p0}, Len;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iput p1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    invoke-virtual {p0, v0}, Len;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setGuidelineEnd(I)V
    .locals 1

    invoke-virtual {p0}, Len;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iput p1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    invoke-virtual {p0, v0}, Len;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setGuidelinePercent(F)V
    .locals 1

    invoke-virtual {p0}, Len;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iput p1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    invoke-virtual {p0, v0}, Len;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setVisibility(I)V
    .locals 0

    return-void
.end method
