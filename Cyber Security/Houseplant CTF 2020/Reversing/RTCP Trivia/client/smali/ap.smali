.class public Lap;
.super Ljava/lang/Object;


# instance fields
.field protected a:Landroid/view/View;

.field protected b:I

.field c:Landroid/widget/PopupWindow$OnDismissListener;

.field private final d:Landroid/content/Context;

.field private final e:Laj;

.field private final f:Z

.field private final g:I

.field private final h:I

.field private i:Z

.field private j:Laq$a;

.field private k:Lao;

.field private final l:Landroid/widget/PopupWindow$OnDismissListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Laj;Landroid/view/View;ZI)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lap;-><init>(Landroid/content/Context;Laj;Landroid/view/View;ZII)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Laj;Landroid/view/View;ZII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x800003

    iput v0, p0, Lap;->b:I

    new-instance v0, Lap$1;

    invoke-direct {v0, p0}, Lap$1;-><init>(Lap;)V

    iput-object v0, p0, Lap;->l:Landroid/widget/PopupWindow$OnDismissListener;

    iput-object p1, p0, Lap;->d:Landroid/content/Context;

    iput-object p2, p0, Lap;->e:Laj;

    iput-object p3, p0, Lap;->a:Landroid/view/View;

    iput-boolean p4, p0, Lap;->f:Z

    iput p5, p0, Lap;->g:I

    iput p6, p0, Lap;->h:I

    return-void
.end method


# virtual methods
.method public final a()Lao;
    .locals 14

    iget-object v0, p0, Lap;->k:Lao;

    if-nez v0, :cond_3

    iget-object v0, p0, Lap;->d:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v2, v3, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    :goto_0
    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lap;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lb$d;->abc_cascading_menus_min_smallest_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    new-instance v0, Lag;

    iget-object v2, p0, Lap;->d:Landroid/content/Context;

    iget-object v3, p0, Lap;->a:Landroid/view/View;

    iget v4, p0, Lap;->g:I

    iget v5, p0, Lap;->h:I

    iget-boolean v6, p0, Lap;->f:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lag;-><init>(Landroid/content/Context;Landroid/view/View;IIZ)V

    goto :goto_2

    :cond_2
    new-instance v0, Lav;

    iget-object v8, p0, Lap;->d:Landroid/content/Context;

    iget-object v9, p0, Lap;->e:Laj;

    iget-object v10, p0, Lap;->a:Landroid/view/View;

    iget v11, p0, Lap;->g:I

    iget v12, p0, Lap;->h:I

    iget-boolean v13, p0, Lap;->f:Z

    move-object v7, v0

    invoke-direct/range {v7 .. v13}, Lav;-><init>(Landroid/content/Context;Laj;Landroid/view/View;IIZ)V

    :goto_2
    iget-object v1, p0, Lap;->e:Laj;

    invoke-virtual {v0, v1}, Lao;->a(Laj;)V

    iget-object v1, p0, Lap;->l:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {v0, v1}, Lao;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v1, p0, Lap;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Lao;->a(Landroid/view/View;)V

    iget-object v1, p0, Lap;->j:Laq$a;

    invoke-virtual {v0, v1}, Lao;->a(Laq$a;)V

    iget-boolean v1, p0, Lap;->i:Z

    invoke-virtual {v0, v1}, Lao;->b(Z)V

    iget v1, p0, Lap;->b:I

    invoke-virtual {v0, v1}, Lao;->a(I)V

    iput-object v0, p0, Lap;->k:Lao;

    :cond_3
    iget-object v0, p0, Lap;->k:Lao;

    return-object v0
.end method

.method final a(IIZZ)V
    .locals 3

    invoke-virtual {p0}, Lap;->a()Lao;

    move-result-object v0

    invoke-virtual {v0, p4}, Lao;->c(Z)V

    if-eqz p3, :cond_1

    iget p3, p0, Lap;->b:I

    iget-object p4, p0, Lap;->a:Landroid/view/View;

    invoke-static {p4}, Lgq;->b(Landroid/view/View;)I

    move-result p4

    invoke-static {p3, p4}, Lgf;->a(II)I

    move-result p3

    and-int/lit8 p3, p3, 0x7

    const/4 p4, 0x5

    if-ne p3, p4, :cond_0

    iget-object p3, p0, Lap;->a:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    sub-int/2addr p1, p3

    :cond_0
    invoke-virtual {v0, p1}, Lao;->b(I)V

    invoke-virtual {v0, p2}, Lao;->c(I)V

    iget-object p3, p0, Lap;->d:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x42400000    # 48.0f

    mul-float/2addr p4, p3

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p4, p3

    float-to-int p3, p4

    new-instance p4, Landroid/graphics/Rect;

    sub-int v1, p1, p3

    sub-int v2, p2, p3

    add-int/2addr p1, p3

    add-int/2addr p2, p3

    invoke-direct {p4, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p4, v0, Lao;->g:Landroid/graphics/Rect;

    :cond_1
    invoke-virtual {v0}, Lao;->b()V

    return-void
.end method

.method public final a(Laq$a;)V
    .locals 1

    iput-object p1, p0, Lap;->j:Laq$a;

    iget-object v0, p0, Lap;->k:Lao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lap;->k:Lao;

    invoke-virtual {v0, p1}, Lao;->a(Laq$a;)V

    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 1

    iput-boolean p1, p0, Lap;->i:Z

    iget-object v0, p0, Lap;->k:Lao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lap;->k:Lao;

    invoke-virtual {v0, p1}, Lao;->b(Z)V

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 3

    invoke-virtual {p0}, Lap;->e()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lap;->a:Landroid/view/View;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0, v2, v2, v2, v2}, Lap;->a(IIZZ)V

    return v1
.end method

.method public final c()V
    .locals 1

    invoke-virtual {p0}, Lap;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lap;->k:Lao;

    invoke-virtual {v0}, Lao;->c()V

    :cond_0
    return-void
.end method

.method protected d()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lap;->k:Lao;

    iget-object v0, p0, Lap;->c:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lap;->c:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_0
    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lap;->k:Lao;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lap;->k:Lao;

    invoke-virtual {v0}, Lao;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
