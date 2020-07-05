.class public final Landroidx/appcompat/widget/Toolbar$a;
.super Ljava/lang/Object;

# interfaces
.implements Laq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field a:Laj;

.field public b:Lal;

.field final synthetic c:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laj;Z)V
    .locals 0

    return-void
.end method

.method public final a(Landroid/content/Context;Laj;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->a:Laj;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->b:Lal;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->a:Laj;

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->b:Lal;

    invoke-virtual {p1, v0}, Laj;->b(Lal;)Z

    :cond_0
    iput-object p2, p0, Landroidx/appcompat/widget/Toolbar$a;->a:Laj;

    return-void
.end method

.method public final a(Laq$a;)V
    .locals 0

    return-void
.end method

.method public final a(Z)V
    .locals 4

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->b:Lal;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->a:Laj;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->a:Laj;

    invoke-virtual {p1}, Laj;->size()I

    move-result p1

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_1

    iget-object v2, p0, Landroidx/appcompat/widget/Toolbar$a;->a:Laj;

    invoke-virtual {v2, v1}, Laj;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Landroidx/appcompat/widget/Toolbar$a;->b:Lal;

    if-ne v2, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v0, :cond_2

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->b:Lal;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar$a;->c(Lal;)Z

    :cond_2
    return-void
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a(Law;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lal;)Z
    .locals 7

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    const v2, 0x800003

    const/4 v3, 0x2

    if-nez v1, :cond_0

    new-instance v1, Lbl;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v4

    const/4 v5, 0x0

    sget v6, Lb$a;->toolbarNavigationButtonStyle:I

    invoke-direct {v1, v4, v5, v6}, Lbl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v4}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->e:Ljava/lang/CharSequence;

    invoke-virtual {v1, v4}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    new-instance v1, Landroidx/appcompat/widget/Toolbar$b;

    invoke-direct {v1}, Landroidx/appcompat/widget/Toolbar$b;-><init>()V

    iget v4, v0, Landroidx/appcompat/widget/Toolbar;->l:I

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v4, v2

    iput v4, v1, Landroidx/appcompat/widget/Toolbar$b;->a:I

    iput v3, v1, Landroidx/appcompat/widget/Toolbar$b;->b:I

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    invoke-virtual {v4, v1}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    new-instance v4, Landroidx/appcompat/widget/Toolbar$3;

    invoke-direct {v4, v0}, Landroidx/appcompat/widget/Toolbar$3;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {v1, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    if-eq v0, v1, :cond_2

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->addView(Landroid/view/View;)V

    :cond_2
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Lal;->getActionView()Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    iput-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->b:Lal;

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    if-eq v0, v1, :cond_4

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->e()Landroidx/appcompat/widget/Toolbar$b;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget v1, v1, Landroidx/appcompat/widget/Toolbar;->l:I

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    iput v1, v0, Landroidx/appcompat/widget/Toolbar$b;->a:I

    iput v3, v0, Landroidx/appcompat/widget/Toolbar$b;->b:I

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->addView(Landroid/view/View;)V

    :cond_4
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getChildCount()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_6

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/appcompat/widget/Toolbar$b;

    iget v5, v5, Landroidx/appcompat/widget/Toolbar$b;->b:I

    if-eq v5, v3, :cond_5

    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eq v4, v5, :cond_5

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->removeViewAt(I)V

    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->n:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_6
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->requestLayout()V

    invoke-virtual {p1, v2}, Lal;->d(Z)V

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    instance-of p1, p1, Lv;

    if-eqz p1, :cond_7

    iget-object p1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    check-cast p1, Lv;

    invoke-interface {p1}, Lv;->a()V

    :cond_7
    return v2
.end method

.method public final c(Lal;)Z
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    instance-of v0, v0, Lv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    check-cast v0, Lv;

    invoke-interface {v0}, Lv;->b()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->f:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->g:Landroid/view/View;

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->n:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    :goto_0
    if-ltz v2, :cond_1

    iget-object v4, v0, Landroidx/appcompat/widget/Toolbar;->n:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/Toolbar;->addView(Landroid/view/View;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-object v1, p0, Landroidx/appcompat/widget/Toolbar$a;->b:Lal;

    iget-object v0, p0, Landroidx/appcompat/widget/Toolbar$a;->c:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->requestLayout()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lal;->d(Z)V

    return v3
.end method
