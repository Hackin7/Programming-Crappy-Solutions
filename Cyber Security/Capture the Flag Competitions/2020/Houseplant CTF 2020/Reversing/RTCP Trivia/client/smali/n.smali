.class public Ln;
.super Lc;

# interfaces
.implements Landroidx/appcompat/widget/ActionBarOverlayLayout$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln$a;
    }
.end annotation


# static fields
.field static final synthetic s:Z = true

.field private static final t:Landroid/view/animation/Interpolator;

.field private static final u:Landroid/view/animation/Interpolator;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private D:Z

.field private E:I

.field private F:Z

.field private G:Z

.field private H:Z

.field a:Landroid/content/Context;

.field b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field c:Landroidx/appcompat/widget/ActionBarContainer;

.field d:Lca;

.field e:Landroidx/appcompat/widget/ActionBarContextView;

.field f:Landroid/view/View;

.field g:Lcl;

.field h:Ln$a;

.field i:Lu;

.field j:Lu$a;

.field k:Z

.field l:Z

.field m:Z

.field n:Laa;

.field o:Z

.field final p:Lgu;

.field final q:Lgu;

.field final r:Lgw;

.field private v:Landroid/content/Context;

.field private w:Landroid/app/Activity;

.field private x:Landroid/app/Dialog;

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Ln;->t:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Ln;->u:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 1

    invoke-direct {p0}, Lc;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln;->y:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Ln;->z:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln;->C:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Ln;->E:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln;->k:Z

    iput-boolean v0, p0, Ln;->G:Z

    new-instance v0, Ln$1;

    invoke-direct {v0, p0}, Ln$1;-><init>(Ln;)V

    iput-object v0, p0, Ln;->p:Lgu;

    new-instance v0, Ln$2;

    invoke-direct {v0, p0}, Ln$2;-><init>(Ln;)V

    iput-object v0, p0, Ln;->q:Lgu;

    new-instance v0, Ln$3;

    invoke-direct {v0, p0}, Ln$3;-><init>(Ln;)V

    iput-object v0, p0, Ln;->r:Lgw;

    iput-object p1, p0, Ln;->w:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Ln;->a(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ln;->f:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 1

    invoke-direct {p0}, Lc;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln;->y:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Ln;->z:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln;->C:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Ln;->E:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln;->k:Z

    iput-boolean v0, p0, Ln;->G:Z

    new-instance v0, Ln$1;

    invoke-direct {v0, p0}, Ln$1;-><init>(Ln;)V

    iput-object v0, p0, Ln;->p:Lgu;

    new-instance v0, Ln$2;

    invoke-direct {v0, p0}, Ln$2;-><init>(Ln;)V

    iput-object v0, p0, Ln;->q:Lgu;

    new-instance v0, Ln$3;

    invoke-direct {v0, p0}, Ln$3;-><init>(Ln;)V

    iput-object v0, p0, Ln;->r:Lgw;

    iput-object p1, p0, Ln;->x:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Ln;->a(Landroid/view/View;)V

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 5

    sget v0, Lb$f;->decor_content_parent:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iput-object v0, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-object v0, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Landroidx/appcompat/widget/ActionBarOverlayLayout$a;)V

    :cond_0
    sget v0, Lb$f;->action_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lca;

    if-eqz v1, :cond_1

    check-cast v0, Lca;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    if-eqz v1, :cond_9

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lca;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ln;->d:Lca;

    sget v0, Lb$f;->action_context_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    sget v0, Lb$f;->action_bar_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    iput-object p1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object p1, p0, Ln;->d:Lca;

    if-eqz p1, :cond_8

    iget-object p1, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz p1, :cond_8

    iget-object p1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p1, p0, Ln;->d:Lca;

    invoke-interface {p1}, Lca;->b()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ln;->a:Landroid/content/Context;

    iget-object p1, p0, Ln;->d:Lca;

    invoke-interface {p1}, Lca;->o()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    move p1, v1

    goto :goto_1

    :cond_3
    move p1, v0

    :goto_1
    if-eqz p1, :cond_4

    iput-boolean v1, p0, Ln;->A:Z

    :cond_4
    iget-object p1, p0, Ln;->a:Landroid/content/Context;

    invoke-static {p1}, Lt;->a(Landroid/content/Context;)Lt;

    move-result-object p1

    iget-object v2, p1, Lt;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-virtual {p1}, Lt;->b()Z

    move-result p1

    invoke-direct {p0, p1}, Ln;->f(Z)V

    iget-object p1, p0, Ln;->a:Landroid/content/Context;

    const/4 v2, 0x0

    sget-object v3, Lb$j;->ActionBar:[I

    sget v4, Lb$a;->actionBarStyle:I

    invoke-virtual {p1, v2, v3, v4, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v2, Lb$j;->ActionBar_hideOnContentScroll:I

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->b:Z

    if-nez v2, :cond_5

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iput-boolean v1, p0, Ln;->o:Z

    iget-object v2, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    :cond_6
    sget v1, Lb$j;->ActionBar_elevation:I

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-eqz v0, :cond_7

    int-to-float v0, v0

    iget-object v1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v1, v0}, Lgq;->a(Landroid/view/View;F)V

    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_8
    :goto_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " can only be used with a compatible window decor layout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t make a decor toolbar out of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_a
    const-string v0, "null"

    :goto_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static a(ZZZ)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private f(Z)V
    .locals 4

    iput-boolean p1, p0, Ln;->D:Z

    iget-boolean p1, p0, Ln;->D:Z

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Ln;->d:Lca;

    invoke-interface {p1, v0}, Lca;->a(Lcl;)V

    iget-object p1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object v0, p0, Ln;->g:Lcl;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lcl;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lcl;)V

    iget-object p1, p0, Ln;->d:Lca;

    iget-object v0, p0, Ln;->g:Lcl;

    invoke-interface {p1, v0}, Lca;->a(Lcl;)V

    :goto_0
    iget-object p1, p0, Ln;->d:Lca;

    invoke-interface {p1}, Lca;->p()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    iget-object v0, p0, Ln;->g:Lcl;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    iget-object v0, p0, Ln;->g:Lcl;

    invoke-virtual {v0, v2}, Lcl;->setVisibility(I)V

    iget-object v0, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-static {v0}, Lgq;->g(Landroid/view/View;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Ln;->g:Lcl;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcl;->setVisibility(I)V

    :cond_3
    :goto_2
    iget-object v0, p0, Ln;->d:Lca;

    iget-boolean v3, p0, Ln;->D:Z

    if-nez v3, :cond_4

    if-eqz p1, :cond_4

    move v3, v1

    goto :goto_3

    :cond_4
    move v3, v2

    :goto_3
    invoke-interface {v0, v3}, Lca;->a(Z)V

    iget-object v0, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v3, p0, Ln;->D:Z

    if-nez v3, :cond_5

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    move v1, v2

    :goto_4
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    return-void
.end method

.method private g(Z)V
    .locals 6

    iget-boolean v0, p0, Ln;->l:Z

    iget-boolean v1, p0, Ln;->m:Z

    iget-boolean v2, p0, Ln;->F:Z

    invoke-static {v0, v1, v2}, Ln;->a(ZZZ)Z

    move-result v0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Ln;->G:Z

    if-nez v0, :cond_d

    iput-boolean v5, p0, Ln;->G:Z

    iget-object v0, p0, Ln;->n:Laa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln;->n:Laa;

    invoke-virtual {v0}, Laa;->b()V

    :cond_0
    iget-object v0, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget v0, p0, Ln;->E:I

    const/4 v4, 0x0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ln;->H:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    iget-object v0, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ActionBarContainer;->setTranslationY(F)V

    iget-object v0, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContainer;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    if-eqz p1, :cond_2

    new-array p1, v3, [I

    fill-array-data p1, :array_0

    iget-object v1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/ActionBarContainer;->getLocationInWindow([I)V

    aget p1, p1, v5

    int-to-float p1, p1

    sub-float/2addr v0, p1

    :cond_2
    iget-object p1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTranslationY(F)V

    new-instance p1, Laa;

    invoke-direct {p1}, Laa;-><init>()V

    iget-object v1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v1}, Lgq;->d(Landroid/view/View;)Lgt;

    move-result-object v1

    invoke-virtual {v1, v4}, Lgt;->b(F)Lgt;

    move-result-object v1

    iget-object v2, p0, Ln;->r:Lgw;

    invoke-virtual {v1, v2}, Lgt;->a(Lgw;)Lgt;

    invoke-virtual {p1, v1}, Laa;->a(Lgt;)Laa;

    iget-boolean v1, p0, Ln;->k:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Ln;->f:Landroid/view/View;

    if-eqz v1, :cond_3

    iget-object v1, p0, Ln;->f:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, Ln;->f:Landroid/view/View;

    invoke-static {v0}, Lgq;->d(Landroid/view/View;)Lgt;

    move-result-object v0

    invoke-virtual {v0, v4}, Lgt;->b(F)Lgt;

    move-result-object v0

    invoke-virtual {p1, v0}, Laa;->a(Lgt;)Laa;

    :cond_3
    sget-object v0, Ln;->u:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0}, Laa;->a(Landroid/view/animation/Interpolator;)Laa;

    invoke-virtual {p1}, Laa;->c()Laa;

    iget-object v0, p0, Ln;->q:Lgu;

    invoke-virtual {p1, v0}, Laa;->a(Lgu;)Laa;

    iput-object p1, p0, Ln;->n:Laa;

    invoke-virtual {p1}, Laa;->a()V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContainer;->setAlpha(F)V

    iget-object p1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/ActionBarContainer;->setTranslationY(F)V

    iget-boolean p1, p0, Ln;->k:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Ln;->f:Landroid/view/View;

    if-eqz p1, :cond_5

    iget-object p1, p0, Ln;->f:Landroid/view/View;

    invoke-virtual {p1, v4}, Landroid/view/View;->setTranslationY(F)V

    :cond_5
    iget-object p1, p0, Ln;->q:Lgu;

    invoke-interface {p1, v1}, Lgu;->b(Landroid/view/View;)V

    :goto_0
    iget-object p1, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_6

    iget-object p1, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-static {p1}, Lgq;->g(Landroid/view/View;)V

    :cond_6
    return-void

    :cond_7
    iget-boolean v0, p0, Ln;->G:Z

    if-eqz v0, :cond_d

    iput-boolean v4, p0, Ln;->G:Z

    iget-object v0, p0, Ln;->n:Laa;

    if-eqz v0, :cond_8

    iget-object v0, p0, Ln;->n:Laa;

    invoke-virtual {v0}, Laa;->b()V

    :cond_8
    iget v0, p0, Ln;->E:I

    if-nez v0, :cond_c

    iget-boolean v0, p0, Ln;->H:Z

    if-nez v0, :cond_9

    if-eqz p1, :cond_c

    :cond_9
    iget-object v0, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarContainer;->setAlpha(F)V

    iget-object v0, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v5}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    new-instance v0, Laa;

    invoke-direct {v0}, Laa;-><init>()V

    iget-object v1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContainer;->getHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    if-eqz p1, :cond_a

    new-array p1, v3, [I

    fill-array-data p1, :array_1

    iget-object v2, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v2, p1}, Landroidx/appcompat/widget/ActionBarContainer;->getLocationInWindow([I)V

    aget p1, p1, v5

    int-to-float p1, p1

    sub-float/2addr v1, p1

    :cond_a
    iget-object p1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {p1}, Lgq;->d(Landroid/view/View;)Lgt;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgt;->b(F)Lgt;

    move-result-object p1

    iget-object v2, p0, Ln;->r:Lgw;

    invoke-virtual {p1, v2}, Lgt;->a(Lgw;)Lgt;

    invoke-virtual {v0, p1}, Laa;->a(Lgt;)Laa;

    iget-boolean p1, p0, Ln;->k:Z

    if-eqz p1, :cond_b

    iget-object p1, p0, Ln;->f:Landroid/view/View;

    if-eqz p1, :cond_b

    iget-object p1, p0, Ln;->f:Landroid/view/View;

    invoke-static {p1}, Lgq;->d(Landroid/view/View;)Lgt;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgt;->b(F)Lgt;

    move-result-object p1

    invoke-virtual {v0, p1}, Laa;->a(Lgt;)Laa;

    :cond_b
    sget-object p1, Ln;->t:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p1}, Laa;->a(Landroid/view/animation/Interpolator;)Laa;

    invoke-virtual {v0}, Laa;->c()Laa;

    iget-object p1, p0, Ln;->p:Lgu;

    invoke-virtual {v0, p1}, Laa;->a(Lgu;)Laa;

    iput-object v0, p0, Ln;->n:Laa;

    invoke-virtual {v0}, Laa;->a()V

    return-void

    :cond_c
    iget-object p1, p0, Ln;->p:Lgu;

    invoke-interface {p1, v1}, Lgu;->b(Landroid/view/View;)V

    :cond_d
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Ln;->d:Lca;

    invoke-interface {v0}, Lca;->o()I

    move-result v0

    return v0
.end method

.method public final a(Lu$a;)Lu;
    .locals 2

    iget-object v0, p0, Ln;->h:Ln$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln;->h:Ln$a;

    invoke-virtual {v0}, Ln$a;->c()V

    :cond_0
    iget-object v0, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v0, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->b()V

    new-instance v0, Ln$a;

    iget-object v1, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Ln$a;-><init>(Ln;Landroid/content/Context;Lu$a;)V

    invoke-virtual {v0}, Ln$a;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v0, p0, Ln;->h:Ln$a;

    invoke-virtual {v0}, Ln$a;->d()V

    iget-object p1, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(Lu;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ln;->e(Z)V

    iget-object p1, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v1, 0x20

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/ActionBarContextView;->sendAccessibilityEvent(I)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(I)V
    .locals 0

    iput p1, p0, Ln;->E:I

    return-void
.end method

.method public final a(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p0, Ln;->a:Landroid/content/Context;

    invoke-static {p1}, Lt;->a(Landroid/content/Context;)Lt;

    move-result-object p1

    invoke-virtual {p1}, Lt;->b()Z

    move-result p1

    invoke-direct {p0, p1}, Ln;->f(Z)V

    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Ln;->d:Lca;

    invoke-interface {v0, p1}, Lca;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final a(Z)V
    .locals 3

    iget-boolean v0, p0, Ln;->A:Z

    if-nez v0, :cond_1

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Ln;->d:Lca;

    invoke-interface {v1}, Lca;->o()I

    move-result v1

    const/4 v2, 0x1

    iput-boolean v2, p0, Ln;->A:Z

    iget-object v2, p0, Ln;->d:Lca;

    and-int/2addr p1, v0

    and-int/lit8 v0, v1, -0x5

    or-int/2addr p1, v0

    invoke-interface {v2, p1}, Lca;->c(I)V

    :cond_1
    return-void
.end method

.method public final a(ILandroid/view/KeyEvent;)Z
    .locals 4

    iget-object v0, p0, Ln;->h:Ln$a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ln;->h:Ln$a;

    iget-object v0, v0, Ln$a;->a:Laj;

    if-eqz v0, :cond_3

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public final b()Landroid/content/Context;
    .locals 4

    iget-object v0, p0, Ln;->v:Landroid/content/Context;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Ln;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, Lb$a;->actionBarWidgetTheme:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, Ln;->a:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Ln;->v:Landroid/content/Context;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln;->a:Landroid/content/Context;

    iput-object v0, p0, Ln;->v:Landroid/content/Context;

    :cond_1
    :goto_0
    iget-object v0, p0, Ln;->v:Landroid/content/Context;

    return-object v0
.end method

.method public final b(Z)V
    .locals 0

    iput-boolean p1, p0, Ln;->H:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Ln;->n:Laa;

    if-eqz p1, :cond_0

    iget-object p1, p0, Ln;->n:Laa;

    invoke-virtual {p1}, Laa;->b()V

    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 2

    iget-boolean v0, p0, Ln;->B:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Ln;->B:Z

    iget-object p1, p0, Ln;->C:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    iget-object v1, p0, Ln;->C:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Ln;->k:Z

    return-void
.end method

.method public final e(Z)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-boolean v1, p0, Ln;->F:Z

    if-nez v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, p0, Ln;->F:Z

    iget-object v2, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v2, :cond_1

    iget-object v2, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Ln;->F:Z

    if-eqz v1, :cond_2

    iput-boolean v0, p0, Ln;->F:Z

    iget-object v1, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_1
    :goto_0
    invoke-direct {p0, v0}, Ln;->g(Z)V

    :cond_2
    iget-object v1, p0, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v1}, Lgq;->l(Landroid/view/View;)Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x4

    if-eqz v1, :cond_6

    const-wide/16 v4, 0xc8

    const-wide/16 v6, 0x64

    if-eqz p1, :cond_3

    iget-object p1, p0, Ln;->d:Lca;

    invoke-interface {p1, v3, v6, v7}, Lca;->a(IJ)Lgt;

    move-result-object p1

    iget-object v1, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1, v0, v4, v5}, Landroidx/appcompat/widget/ActionBarContextView;->a(IJ)Lgt;

    move-result-object v0

    goto :goto_1

    :cond_3
    iget-object p1, p0, Ln;->d:Lca;

    invoke-interface {p1, v0, v4, v5}, Lca;->a(IJ)Lgt;

    move-result-object v0

    iget-object p1, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2, v6, v7}, Landroidx/appcompat/widget/ActionBarContextView;->a(IJ)Lgt;

    move-result-object p1

    :goto_1
    new-instance v1, Laa;

    invoke-direct {v1}, Laa;-><init>()V

    iget-object v2, v1, Laa;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Lgt;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->getDuration()J

    move-result-wide v2

    goto :goto_2

    :cond_4
    const-wide/16 v2, 0x0

    :goto_2
    iget-object p1, v0, Lgt;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    :cond_5
    iget-object p1, v1, Laa;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Laa;->a()V

    return-void

    :cond_6
    if-eqz p1, :cond_7

    iget-object p1, p0, Ln;->d:Lca;

    invoke-interface {p1, v3}, Lca;->d(I)V

    iget-object p1, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void

    :cond_7
    iget-object p1, p0, Ln;->d:Lca;

    invoke-interface {p1, v0}, Lca;->d(I)V

    iget-object p1, p0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Ln;->d:Lca;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln;->d:Lca;

    invoke-interface {v0}, Lca;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln;->d:Lca;

    invoke-interface {v0}, Lca;->d()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h()V
    .locals 1

    iget-boolean v0, p0, Ln;->m:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln;->m:Z

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ln;->g(Z)V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 1

    iget-boolean v0, p0, Ln;->m:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln;->m:Z

    invoke-direct {p0, v0}, Ln;->g(Z)V

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Ln;->n:Laa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln;->n:Laa;

    invoke-virtual {v0}, Laa;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Ln;->n:Laa;

    :cond_0
    return-void
.end method
