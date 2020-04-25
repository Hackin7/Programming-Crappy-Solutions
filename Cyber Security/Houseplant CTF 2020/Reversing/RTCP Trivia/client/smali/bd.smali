.class final Lbd;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Lbi;

.field private c:I

.field private d:Lcp;

.field private e:Lcp;

.field private f:Lcp;


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lbd;->c:I

    iput-object p1, p0, Lbd;->a:Landroid/view/View;

    invoke-static {}, Lbi;->a()Lbi;

    move-result-object p1

    iput-object p1, p0, Lbd;->b:Lbi;

    return-void
.end method

.method private b(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lbd;->d:Lcp;

    if-nez v0, :cond_0

    new-instance v0, Lcp;

    invoke-direct {v0}, Lcp;-><init>()V

    iput-object v0, p0, Lbd;->d:Lcp;

    :cond_0
    iget-object v0, p0, Lbd;->d:Lcp;

    iput-object p1, v0, Lcp;->a:Landroid/content/res/ColorStateList;

    iget-object p1, p0, Lbd;->d:Lcp;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcp;->d:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lbd;->d:Lcp;

    :goto_0
    invoke-virtual {p0}, Lbd;->d()V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lbd;->c:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lbd;->b(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lbd;->d()V

    return-void
.end method

.method final a(I)V
    .locals 2

    iput p1, p0, Lbd;->c:I

    iget-object v0, p0, Lbd;->b:Lbi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbd;->b:Lbi;

    iget-object v1, p0, Lbd;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lbi;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lbd;->b(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lbd;->d()V

    return-void
.end method

.method final a(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lbd;->e:Lcp;

    if-nez v0, :cond_0

    new-instance v0, Lcp;

    invoke-direct {v0}, Lcp;-><init>()V

    iput-object v0, p0, Lbd;->e:Lcp;

    :cond_0
    iget-object v0, p0, Lbd;->e:Lcp;

    iput-object p1, v0, Lcp;->a:Landroid/content/res/ColorStateList;

    iget-object p1, p0, Lbd;->e:Lcp;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcp;->d:Z

    invoke-virtual {p0}, Lbd;->d()V

    return-void
.end method

.method final a(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lbd;->e:Lcp;

    if-nez v0, :cond_0

    new-instance v0, Lcp;

    invoke-direct {v0}, Lcp;-><init>()V

    iput-object v0, p0, Lbd;->e:Lcp;

    :cond_0
    iget-object v0, p0, Lbd;->e:Lcp;

    iput-object p1, v0, Lcp;->b:Landroid/graphics/PorterDuff$Mode;

    iget-object p1, p0, Lbd;->e:Lcp;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcp;->c:Z

    invoke-virtual {p0}, Lbd;->d()V

    return-void
.end method

.method final a(Landroid/util/AttributeSet;I)V
    .locals 3

    iget-object v0, p0, Lbd;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lb$j;->ViewBackgroundHelper:[I

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, p2, v2}, Lcr;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lcr;

    move-result-object p1

    :try_start_0
    sget p2, Lb$j;->ViewBackgroundHelper_android_background:I

    invoke-virtual {p1, p2}, Lcr;->f(I)Z

    move-result p2

    const/4 v0, -0x1

    if-eqz p2, :cond_0

    sget p2, Lb$j;->ViewBackgroundHelper_android_background:I

    invoke-virtual {p1, p2, v0}, Lcr;->g(II)I

    move-result p2

    iput p2, p0, Lbd;->c:I

    iget-object p2, p0, Lbd;->b:Lbi;

    iget-object v1, p0, Lbd;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lbd;->c:I

    invoke-virtual {p2, v1, v2}, Lbi;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p2}, Lbd;->b(Landroid/content/res/ColorStateList;)V

    :cond_0
    sget p2, Lb$j;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {p1, p2}, Lcr;->f(I)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lbd;->a:Landroid/view/View;

    sget v1, Lb$j;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {p1, v1}, Lcr;->e(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {p2, v1}, Lgq;->a(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    :cond_1
    sget p2, Lb$j;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {p1, p2}, Lcr;->f(I)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lbd;->a:Landroid/view/View;

    sget v1, Lb$j;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {p1, v1, v0}, Lcr;->a(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcb;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    invoke-static {p2, v0}, Lgq;->a(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    iget-object p1, p1, Lcr;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    iget-object p1, p1, Lcr;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method final b()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lbd;->e:Lcp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbd;->e:Lcp;

    iget-object v0, v0, Lcp;->a:Landroid/content/res/ColorStateList;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method final c()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lbd;->e:Lcp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbd;->e:Lcp;

    iget-object v0, v0, Lcp;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method final d()V
    .locals 5

    iget-object v0, p0, Lbd;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_9

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-le v1, v2, :cond_1

    iget-object v1, p0, Lbd;->d:Lcp;

    if-eqz v1, :cond_0

    :goto_0
    move v1, v4

    goto :goto_1

    :cond_0
    move v1, v3

    goto :goto_1

    :cond_1
    if-ne v1, v2, :cond_0

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_7

    iget-object v1, p0, Lbd;->f:Lcp;

    if-nez v1, :cond_2

    new-instance v1, Lcp;

    invoke-direct {v1}, Lcp;-><init>()V

    iput-object v1, p0, Lbd;->f:Lcp;

    :cond_2
    iget-object v1, p0, Lbd;->f:Lcp;

    invoke-virtual {v1}, Lcp;->a()V

    iget-object v2, p0, Lbd;->a:Landroid/view/View;

    invoke-static {v2}, Lgq;->i(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v2

    if-eqz v2, :cond_3

    iput-boolean v4, v1, Lcp;->d:Z

    iput-object v2, v1, Lcp;->a:Landroid/content/res/ColorStateList;

    :cond_3
    iget-object v2, p0, Lbd;->a:Landroid/view/View;

    invoke-static {v2}, Lgq;->j(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    if-eqz v2, :cond_4

    iput-boolean v4, v1, Lcp;->c:Z

    iput-object v2, v1, Lcp;->b:Landroid/graphics/PorterDuff$Mode;

    :cond_4
    iget-boolean v2, v1, Lcp;->d:Z

    if-nez v2, :cond_5

    iget-boolean v2, v1, Lcp;->c:Z

    if-eqz v2, :cond_6

    :cond_5
    iget-object v2, p0, Lbd;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Lbi;->a(Landroid/graphics/drawable/Drawable;Lcp;[I)V

    move v3, v4

    :cond_6
    if-eqz v3, :cond_7

    return-void

    :cond_7
    iget-object v1, p0, Lbd;->e:Lcp;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lbd;->e:Lcp;

    iget-object v2, p0, Lbd;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Lbi;->a(Landroid/graphics/drawable/Drawable;Lcp;[I)V

    return-void

    :cond_8
    iget-object v1, p0, Lbd;->d:Lcp;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lbd;->d:Lcp;

    iget-object v2, p0, Lbd;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    invoke-static {v0, v1, v2}, Lbi;->a(Landroid/graphics/drawable/Drawable;Lcp;[I)V

    :cond_9
    return-void
.end method
