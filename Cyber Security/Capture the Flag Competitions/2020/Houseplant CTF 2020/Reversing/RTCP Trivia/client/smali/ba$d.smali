.class public final Lba$d;
.super Lbn;

# interfaces
.implements Landroidx/appcompat/widget/ActionMenuView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lba;

.field private final b:[F


# direct methods
.method public constructor <init>(Lba;Landroid/content/Context;)V
    .locals 2

    iput-object p1, p0, Lba$d;->a:Lba;

    sget v0, Lb$a;->actionOverflowButtonStyle:I

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1, v0}, Lbn;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x2

    new-array p2, p2, [F

    iput-object p2, p0, Lba$d;->b:[F

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Lba$d;->setClickable(Z)V

    invoke-virtual {p0, p2}, Lba$d;->setFocusable(Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lba$d;->setVisibility(I)V

    invoke-virtual {p0, p2}, Lba$d;->setEnabled(Z)V

    invoke-virtual {p0}, Lba$d;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-static {p0, p2}, Lct;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    new-instance p2, Lba$d$1;

    invoke-direct {p2, p0, p0, p1}, Lba$d$1;-><init>(Lba$d;Landroid/view/View;Lba;)V

    invoke-virtual {p0, p2}, Lba$d;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final performClick()Z
    .locals 2

    invoke-super {p0}, Lbn;->performClick()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lba$d;->playSoundEffect(I)V

    iget-object v0, p0, Lba$d;->a:Lba;

    invoke-virtual {v0}, Lba;->d()Z

    return v1
.end method

.method protected final setFrame(IIII)Z
    .locals 4

    invoke-super {p0, p1, p2, p3, p4}, Lbn;->setFrame(IIII)Z

    move-result p1

    invoke-virtual {p0}, Lba$d;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0}, Lba$d;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lba$d;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Lba$d;->getHeight()I

    move-result p4

    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Lba$d;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Lba$d;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lba$d;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Lba$d;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    add-int/2addr p2, v1

    div-int/lit8 p2, p2, 0x2

    add-int/2addr p4, v2

    div-int/lit8 p4, p4, 0x2

    sub-int v1, p2, v0

    sub-int v2, p4, v0

    add-int/2addr p2, v0

    add-int/2addr p4, v0

    invoke-static {p3, v1, v2, p2, p4}, Lfn;->a(Landroid/graphics/drawable/Drawable;IIII)V

    :cond_0
    return p1
.end method
