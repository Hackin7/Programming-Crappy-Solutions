.class public final Landroidx/appcompat/widget/ActivityChooserView;
.super Landroid/view/ViewGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActivityChooserView$InnerLayout;,
        Landroidx/appcompat/widget/ActivityChooserView$a;,
        Landroidx/appcompat/widget/ActivityChooserView$b;
    }
.end annotation


# instance fields
.field final a:Landroidx/appcompat/widget/ActivityChooserView$a;

.field final b:Landroid/widget/FrameLayout;

.field final c:Landroid/widget/FrameLayout;

.field d:Lge;

.field final e:Landroid/database/DataSetObserver;

.field f:Landroid/widget/PopupWindow$OnDismissListener;

.field g:Z

.field h:I

.field private final i:Landroidx/appcompat/widget/ActivityChooserView$b;

.field private final j:Landroid/view/View;

.field private final k:Landroid/widget/ImageView;

.field private final l:I

.field private final m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private n:Lcg;

.field private o:Z

.field private p:I


# direct methods
.method private b()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Lcg;

    move-result-object v0

    iget-object v0, v0, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method


# virtual methods
.method final a(I)V
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->a:Lbb;

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No data model. Did you call #setDataModel?"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    iget-object v3, v3, Landroidx/appcompat/widget/ActivityChooserView$a;->a:Lbb;

    invoke-virtual {v3}, Lbb;->a()I

    move-result v3

    const v4, 0x7fffffff

    if-eq p1, v4, :cond_2

    add-int v4, p1, v0

    if-le v3, v4, :cond_2

    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    invoke-virtual {v3, v2}, Landroidx/appcompat/widget/ActivityChooserView$a;->a(Z)V

    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    sub-int/2addr p1, v2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    invoke-virtual {v3, v1}, Landroidx/appcompat/widget/ActivityChooserView$a;->a(Z)V

    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    :goto_1
    invoke-virtual {v3, p1}, Landroidx/appcompat/widget/ActivityChooserView$a;->a(I)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Lcg;

    move-result-object p1

    iget-object v3, p1, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v3

    if-nez v3, :cond_6

    iget-boolean v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->g:Z

    if-nez v3, :cond_4

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    invoke-virtual {v0, v1, v1}, Landroidx/appcompat/widget/ActivityChooserView$a;->a(ZZ)V

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    invoke-virtual {v3, v2, v0}, Landroidx/appcompat/widget/ActivityChooserView$a;->a(ZZ)V

    :goto_3
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$a;->a()I

    move-result v0

    iget v3, p0, Landroidx/appcompat/widget/ActivityChooserView;->l:I

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p1, v0}, Lcg;->b(I)V

    invoke-virtual {p1}, Lcg;->b()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->d:Lge;

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->d:Lge;

    invoke-virtual {v0, v2}, Lge;->a(Z)V

    :cond_5
    iget-object v0, p1, Lcg;->e:Lcc;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lb$h;->abc_activitychooserview_choose_application:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Lcg;->e:Lcc;

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    :cond_6
    return-void
.end method

.method public final a()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Lcg;

    move-result-object v0

    iget-object v0, v0, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Lcg;

    move-result-object v0

    invoke-virtual {v0}, Lcg;->c()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getDataModel()Lbb;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->a:Lbb;

    return-object v0
.end method

.method final getListPopupWindow()Lcg;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->n:Lcg;

    if-nez v0, :cond_0

    new-instance v0, Lcg;

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcg;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->n:Lcg;

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->n:Lcg;

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    invoke-virtual {v0, v1}, Lcg;->a(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->n:Lcg;

    iput-object p0, v0, Lcg;->m:Landroid/view/View;

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->n:Lcg;

    invoke-virtual {v0}, Lcg;->f()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->n:Lcg;

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->i:Landroidx/appcompat/widget/ActivityChooserView$b;

    iput-object v1, v0, Lcg;->n:Landroid/widget/AdapterView$OnItemClickListener;

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->n:Lcg;

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->i:Landroidx/appcompat/widget/ActivityChooserView$b;

    invoke-virtual {v0, v1}, Lcg;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->n:Lcg;

    return-object v0
.end method

.method protected final onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->a:Lbb;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->e:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Lbb;->registerObserver(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->o:Z

    return-void
.end method

.method protected final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->a:Lbb;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->e:Landroid/database/DataSetObserver;

    invoke-virtual {v0, v1}, Lbb;->unregisterObserver(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->m:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    invoke-direct {p0}, Landroidx/appcompat/widget/ActivityChooserView;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->a()Z

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->o:Z

    return-void
.end method

.method protected final onLayout(ZIIII)V
    .locals 0

    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->j:Landroid/view/View;

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    invoke-direct {p0}, Landroidx/appcompat/widget/ActivityChooserView;->b()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->a()Z

    :cond_0
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->j:Landroid/view/View;

    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    :cond_0
    invoke-virtual {p0, v0, p1, p2}, Landroidx/appcompat/widget/ActivityChooserView;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/ActivityChooserView;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setActivityChooserModel(Lbb;)V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    iget-object v1, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->c:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v1, v1, Landroidx/appcompat/widget/ActivityChooserView;->a:Landroidx/appcompat/widget/ActivityChooserView$a;

    iget-object v1, v1, Landroidx/appcompat/widget/ActivityChooserView$a;->a:Lbb;

    if-eqz v1, :cond_0

    iget-object v2, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->c:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActivityChooserView;->isShown()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->c:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v2, v2, Landroidx/appcompat/widget/ActivityChooserView;->e:Landroid/database/DataSetObserver;

    invoke-virtual {v1, v2}, Lbb;->unregisterObserver(Ljava/lang/Object;)V

    :cond_0
    iput-object p1, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->a:Lbb;

    if-eqz p1, :cond_1

    iget-object v1, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->c:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActivityChooserView;->isShown()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Landroidx/appcompat/widget/ActivityChooserView$a;->c:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v1, v1, Landroidx/appcompat/widget/ActivityChooserView;->e:Landroid/database/DataSetObserver;

    invoke-virtual {p1, v1}, Lbb;->registerObserver(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView$a;->notifyDataSetChanged()V

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Lcg;

    move-result-object p1

    iget-object p1, p1, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->a()Z

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Lcg;

    move-result-object p1

    iget-object p1, p1, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-nez p1, :cond_3

    iget-boolean p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->o:Z

    if-nez p1, :cond_2

    return-void

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->g:Z

    iget p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->h:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActivityChooserView;->a(I)V

    return-void

    :cond_3
    return-void
.end method

.method public final setDefaultActionButtonContentDescription(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->p:I

    return-void
.end method

.method public final setExpandActivityOverflowButtonContentDescription(I)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setInitialActivityCount(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->h:I

    return-void
.end method

.method public final setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->f:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final setProvider(Lge;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->d:Lge;

    return-void
.end method
