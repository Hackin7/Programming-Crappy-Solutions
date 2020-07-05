.class public final Lcs;
.super Ljava/lang/Object;

# interfaces
.implements Lca;


# instance fields
.field a:Landroidx/appcompat/widget/Toolbar;

.field b:Ljava/lang/CharSequence;

.field c:Landroid/view/Window$Callback;

.field d:Z

.field private e:I

.field private f:Landroid/view/View;

.field private g:Landroid/view/View;

.field private h:Landroid/graphics/drawable/Drawable;

.field private i:Landroid/graphics/drawable/Drawable;

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Z

.field private l:Ljava/lang/CharSequence;

.field private m:Ljava/lang/CharSequence;

.field private n:Lba;

.field private o:I

.field private p:I

.field private q:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 1

    sget v0, Lb$h;->abc_action_bar_up_description:I

    invoke-direct {p0, p1, v0}, Lcs;-><init>(Landroidx/appcompat/widget/Toolbar;I)V

    return-void
.end method

.method private constructor <init>(Landroidx/appcompat/widget/Toolbar;I)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcs;->o:I

    iput v0, p0, Lcs;->p:I

    iput-object p1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, p0, Lcs;->b:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, p0, Lcs;->l:Ljava/lang/CharSequence;

    iget-object v1, p0, Lcs;->b:Ljava/lang/CharSequence;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iput-boolean v1, p0, Lcs;->k:Z

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcs;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v1, Lb$j;->ActionBar:[I

    sget v3, Lb$a;->actionBarStyle:I

    const/4 v4, 0x0

    invoke-static {p1, v4, v1, v3, v0}, Lcr;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lcr;

    move-result-object p1

    sget v1, Lb$j;->ActionBar_homeAsUpIndicator:I

    invoke-virtual {p1, v1}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcs;->q:Landroid/graphics/drawable/Drawable;

    sget v1, Lb$j;->ActionBar_title:I

    invoke-virtual {p1, v1}, Lcr;->c(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    iput-boolean v2, p0, Lcs;->k:Z

    invoke-direct {p0, v1}, Lcs;->b(Ljava/lang/CharSequence;)V

    :cond_1
    sget v1, Lb$j;->ActionBar_subtitle:I

    invoke-virtual {p1, v1}, Lcr;->c(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    iput-object v1, p0, Lcs;->l:Ljava/lang/CharSequence;

    iget v2, p0, Lcs;->e:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    :cond_2
    sget v1, Lb$j;->ActionBar_logo:I

    invoke-virtual {p1, v1}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-direct {p0, v1}, Lcs;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    sget v1, Lb$j;->ActionBar_icon:I

    invoke-virtual {p1, v1}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, v1}, Lcs;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    iget-object v1, p0, Lcs;->j:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_5

    iget-object v1, p0, Lcs;->q:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcs;->q:Landroid/graphics/drawable/Drawable;

    iput-object v1, p0, Lcs;->j:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Lcs;->s()V

    :cond_5
    sget v1, Lb$j;->ActionBar_displayOptions:I

    invoke-virtual {p1, v1, v0}, Lcr;->a(II)I

    move-result v1

    invoke-virtual {p0, v1}, Lcs;->c(I)V

    sget v1, Lb$j;->ActionBar_customNavigationLayout:I

    invoke-virtual {p1, v1, v0}, Lcr;->g(II)I

    move-result v1

    if-eqz v1, :cond_8

    iget-object v2, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    iget-object v3, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2, v1, v3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcs;->g:Landroid/view/View;

    if-eqz v2, :cond_6

    iget v2, p0, Lcs;->e:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v3, p0, Lcs;->g:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/Toolbar;->removeView(Landroid/view/View;)V

    :cond_6
    iput-object v1, p0, Lcs;->g:Landroid/view/View;

    if-eqz v1, :cond_7

    iget v1, p0, Lcs;->e:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, p0, Lcs;->g:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->addView(Landroid/view/View;)V

    :cond_7
    iget v1, p0, Lcs;->e:I

    or-int/lit8 v1, v1, 0x10

    invoke-virtual {p0, v1}, Lcs;->c(I)V

    :cond_8
    sget v1, Lb$j;->ActionBar_height:I

    invoke-virtual {p1, v1, v0}, Lcr;->f(II)I

    move-result v1

    if-lez v1, :cond_9

    iget-object v2, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_9
    sget v1, Lb$j;->ActionBar_contentInsetStart:I

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Lcr;->d(II)I

    move-result v1

    sget v3, Lb$j;->ActionBar_contentInsetEnd:I

    invoke-virtual {p1, v3, v2}, Lcr;->d(II)I

    move-result v2

    if-gez v1, :cond_a

    if-ltz v2, :cond_b

    :cond_a
    iget-object v3, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v3}, Landroidx/appcompat/widget/Toolbar;->f()V

    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->m:Lck;

    invoke-virtual {v3, v1, v2}, Lck;->a(II)V

    :cond_b
    sget v1, Lb$j;->ActionBar_titleTextStyle:I

    invoke-virtual {p1, v1, v0}, Lcr;->g(II)I

    move-result v1

    if-eqz v1, :cond_c

    iget-object v2, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v3, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v3}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v3

    iput v1, v2, Landroidx/appcompat/widget/Toolbar;->j:I

    iget-object v5, v2, Landroidx/appcompat/widget/Toolbar;->b:Landroid/widget/TextView;

    if-eqz v5, :cond_c

    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->b:Landroid/widget/TextView;

    invoke-virtual {v2, v3, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_c
    sget v1, Lb$j;->ActionBar_subtitleTextStyle:I

    invoke-virtual {p1, v1, v0}, Lcr;->g(II)I

    move-result v1

    if-eqz v1, :cond_d

    iget-object v2, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v3, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v3}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v3

    iput v1, v2, Landroidx/appcompat/widget/Toolbar;->k:I

    iget-object v5, v2, Landroidx/appcompat/widget/Toolbar;->c:Landroid/widget/TextView;

    if-eqz v5, :cond_d

    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v3, v1}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_d
    sget v1, Lb$j;->ActionBar_popupTheme:I

    invoke-virtual {p1, v1, v0}, Lcr;->g(II)I

    move-result v0

    if-eqz v0, :cond_e

    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setPopupTheme(I)V

    :cond_e
    iget-object p1, p1, Lcr;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iget p1, p0, Lcs;->p:I

    if-eq p2, p1, :cond_10

    iput p2, p0, Lcs;->p:I

    iget-object p1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_10

    iget p1, p0, Lcs;->p:I

    if-nez p1, :cond_f

    goto :goto_1

    :cond_f
    iget-object p2, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p2}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    iput-object v4, p0, Lcs;->m:Ljava/lang/CharSequence;

    invoke-direct {p0}, Lcs;->t()V

    :cond_10
    iget-object p1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lcs;->m:Ljava/lang/CharSequence;

    iget-object p1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    new-instance p2, Lcs$1;

    invoke-direct {p2, p0}, Lcs$1;-><init>(Lcs;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private b(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcs;->i:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Lcs;->r()V

    return-void
.end method

.method private b(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Lcs;->b:Ljava/lang/CharSequence;

    iget v0, p0, Lcs;->e:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private r()V
    .locals 2

    iget v0, p0, Lcs;->e:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    iget v0, p0, Lcs;->e:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcs;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcs;->i:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcs;->h:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private s()V
    .locals 2

    iget v0, p0, Lcs;->e:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Lcs;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcs;->j:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcs;->q:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private t()V
    .locals 2

    iget v0, p0, Lcs;->e:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcs;->m:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget v1, p0, Lcs;->p:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Lcs;->m:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    return-object v0
.end method

.method public final a(IJ)Lgt;
    .locals 2

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-static {v0}, Lgq;->d(Landroid/view/View;)Lgt;

    move-result-object v0

    if-nez p1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lgt;->a(F)Lgt;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lgt;->a(J)Lgt;

    move-result-object p2

    new-instance p3, Lcs$2;

    invoke-direct {p3, p0, p1}, Lcs$2;-><init>(Lcs;I)V

    invoke-virtual {p2, p3}, Lgt;->a(Lgu;)Lgt;

    move-result-object p1

    return-object p1
.end method

.method public final a(I)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcs;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcs;->h:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Lcs;->r()V

    return-void
.end method

.method public final a(Landroid/view/Menu;Laq$a;)V
    .locals 4

    iget-object v0, p0, Lcs;->n:Lba;

    if-nez v0, :cond_0

    new-instance v0, Lba;

    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lba;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcs;->n:Lba;

    iget-object v0, p0, Lcs;->n:Lba;

    sget v1, Lb$f;->action_menu_presenter:I

    iput v1, v0, Lad;->h:I

    :cond_0
    iget-object v0, p0, Lcs;->n:Lba;

    iput-object p2, v0, Lad;->f:Laq$a;

    iget-object p2, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    check-cast p1, Laj;

    iget-object v0, p0, Lcs;->n:Lba;

    if-nez p1, :cond_1

    iget-object v1, p2, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v1, :cond_5

    :cond_1
    invoke-virtual {p2}, Landroidx/appcompat/widget/Toolbar;->d()V

    iget-object v1, p2, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v1, v1, Landroidx/appcompat/widget/ActionMenuView;->a:Laj;

    if-eq v1, p1, :cond_5

    if-eqz v1, :cond_2

    iget-object v2, p2, Landroidx/appcompat/widget/Toolbar;->p:Lba;

    invoke-virtual {v1, v2}, Laj;->b(Laq;)V

    iget-object v2, p2, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/Toolbar$a;

    invoke-virtual {v1, v2}, Laj;->b(Laq;)V

    :cond_2
    iget-object v1, p2, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/Toolbar$a;

    if-nez v1, :cond_3

    new-instance v1, Landroidx/appcompat/widget/Toolbar$a;

    invoke-direct {v1, p2}, Landroidx/appcompat/widget/Toolbar$a;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    iput-object v1, p2, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/Toolbar$a;

    :cond_3
    const/4 v1, 0x1

    iput-boolean v1, v0, Lba;->l:Z

    if-eqz p1, :cond_4

    iget-object v1, p2, Landroidx/appcompat/widget/Toolbar;->h:Landroid/content/Context;

    invoke-virtual {p1, v0, v1}, Laj;->a(Laq;Landroid/content/Context;)V

    iget-object v1, p2, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/Toolbar$a;

    iget-object v2, p2, Landroidx/appcompat/widget/Toolbar;->h:Landroid/content/Context;

    invoke-virtual {p1, v1, v2}, Laj;->a(Laq;Landroid/content/Context;)V

    goto :goto_0

    :cond_4
    iget-object p1, p2, Landroidx/appcompat/widget/Toolbar;->h:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Lba;->a(Landroid/content/Context;Laj;)V

    iget-object p1, p2, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/Toolbar$a;

    iget-object v3, p2, Landroidx/appcompat/widget/Toolbar;->h:Landroid/content/Context;

    invoke-virtual {p1, v3, v2}, Landroidx/appcompat/widget/Toolbar$a;->a(Landroid/content/Context;Laj;)V

    invoke-virtual {v0, v1}, Lba;->a(Z)V

    iget-object p1, p2, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/Toolbar$a;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar$a;->a(Z)V

    :goto_0
    iget-object p1, p2, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    iget v1, p2, Landroidx/appcompat/widget/Toolbar;->i:I

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V

    iget-object p1, p2, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Lba;)V

    iput-object v0, p2, Landroidx/appcompat/widget/Toolbar;->p:Lba;

    :cond_5
    return-void
.end method

.method public final a(Landroid/view/Window$Callback;)V
    .locals 0

    iput-object p1, p0, Lcs;->c:Landroid/view/Window$Callback;

    return-void
.end method

.method public final a(Laq$a;Laj$a;)V
    .locals 2

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iput-object p1, v0, Landroidx/appcompat/widget/Toolbar;->r:Laq$a;

    iput-object p2, v0, Landroidx/appcompat/widget/Toolbar;->s:Laj$a;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/ActionMenuView;->a(Laq$a;Laj$a;)V

    :cond_0
    return-void
.end method

.method public final a(Lcl;)V
    .locals 3

    iget-object v0, p0, Lcs;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcs;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Lcs;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->removeView(Landroid/view/View;)V

    :cond_0
    iput-object p1, p0, Lcs;->f:Landroid/view/View;

    if-eqz p1, :cond_1

    iget v0, p0, Lcs;->o:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, Lcs;->f:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/widget/Toolbar;->addView(Landroid/view/View;I)V

    iget-object v0, p0, Lcs;->f:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar$b;

    const/4 v1, -0x2

    iput v1, v0, Landroidx/appcompat/widget/Toolbar$b;->width:I

    iput v1, v0, Landroidx/appcompat/widget/Toolbar$b;->height:I

    const v1, 0x800053

    iput v1, v0, Landroidx/appcompat/widget/Toolbar$b;->a:I

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcl;->setAllowCollapse(Z)V

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-boolean v0, p0, Lcs;->k:Z

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcs;->b(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V

    return-void
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final b(I)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lcs;->b(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final c(I)V
    .locals 3

    iget v0, p0, Lcs;->e:I

    xor-int/2addr v0, p1

    iput p1, p0, Lcs;->e:I

    if-eqz v0, :cond_6

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    and-int/lit8 v1, p1, 0x4

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcs;->t()V

    :cond_0
    invoke-direct {p0}, Lcs;->s()V

    :cond_1
    and-int/lit8 v1, v0, 0x3

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lcs;->r()V

    :cond_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_4

    and-int/lit8 v1, p1, 0x8

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, p0, Lcs;->b:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, p0, Lcs;->l:Ljava/lang/CharSequence;

    :goto_0
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setSubtitle(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    goto :goto_0

    :cond_4
    :goto_1
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcs;->g:Landroid/view/View;

    if-eqz v0, :cond_6

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, p0, Lcs;->g:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->addView(Landroid/view/View;)V

    return-void

    :cond_5
    iget-object p1, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, p0, Lcs;->g:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->removeView(Landroid/view/View;)V

    :cond_6
    return-void
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/Toolbar$a;

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->q:Landroidx/appcompat/widget/Toolbar$a;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar$a;->b:Lal;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->c()V

    return-void
.end method

.method public final d(I)V
    .locals 1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setVisibility(I)V

    return-void
.end method

.method public final e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 2

    const-string v0, "ToolbarWidgetWrapper"

    const-string v1, "Progress display unsupported"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final g()V
    .locals 2

    const-string v0, "ToolbarWidgetWrapper"

    const-string v1, "Progress display unsupported"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionMenuView;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->a()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 4

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v1, v0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    iget-object v1, v0, Lba;->o:Lba$c;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lba;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v3

    :goto_1
    if-eqz v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    if-eqz v0, :cond_3

    return v3

    :cond_3
    return v2
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->b()Z

    move-result v0

    return v0
.end method

.method public final l()Z
    .locals 4

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v1, v0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->c:Lba;

    invoke-virtual {v0}, Lba;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    return v3

    :cond_1
    return v2
.end method

.method public final m()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcs;->d:Z

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionMenuView;->b()V

    :cond_0
    return-void
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lcs;->e:I

    return v0
.end method

.method public final p()I
    .locals 1

    iget v0, p0, Lcs;->o:I

    return v0
.end method

.method public final q()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method
