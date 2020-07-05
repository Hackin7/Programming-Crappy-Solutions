.class public abstract Lha;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lha$a;,
        Lha$b;
    }
.end annotation


# static fields
.field private static final r:I


# instance fields
.field final a:Lha$a;

.field final b:Landroid/view/View;

.field c:Z

.field d:Z

.field e:Z

.field private final f:Landroid/view/animation/Interpolator;

.field private g:Ljava/lang/Runnable;

.field private h:[F

.field private i:[F

.field private j:I

.field private k:I

.field private l:[F

.field private m:[F

.field private n:[F

.field private o:Z

.field private p:Z

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    sput v0, Lha;->r:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lha$a;

    invoke-direct {v0}, Lha$a;-><init>()V

    iput-object v0, p0, Lha;->a:Lha$a;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object v0, p0, Lha;->f:Landroid/view/animation/Interpolator;

    const/4 v0, 0x2

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    iput-object v1, p0, Lha;->h:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_1

    iput-object v1, p0, Lha;->i:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_2

    iput-object v1, p0, Lha;->l:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_3

    iput-object v1, p0, Lha;->m:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_4

    iput-object v0, p0, Lha;->n:[F

    iput-object p1, p0, Lha;->b:Landroid/view/View;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget v0, p1, Landroid/util/DisplayMetrics;->density:F

    const v1, 0x44c4e000    # 1575.0f

    mul-float/2addr v1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr v1, v0

    float-to-int v1, v1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const v2, 0x439d8000    # 315.0f

    mul-float/2addr v2, p1

    add-float/2addr v2, v0

    float-to-int p1, v2

    int-to-float v0, v1

    iget-object v1, p0, Lha;->n:[F

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v0, v2

    const/4 v3, 0x0

    aput v0, v1, v3

    iget-object v1, p0, Lha;->n:[F

    const/4 v4, 0x1

    aput v0, v1, v4

    int-to-float p1, p1

    iget-object v0, p0, Lha;->m:[F

    div-float/2addr p1, v2

    aput p1, v0, v3

    iget-object v0, p0, Lha;->m:[F

    aput p1, v0, v4

    iput v4, p0, Lha;->j:I

    iget-object p1, p0, Lha;->i:[F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    aput v0, p1, v3

    iget-object p1, p0, Lha;->i:[F

    aput v0, p1, v4

    iget-object p1, p0, Lha;->h:[F

    const v0, 0x3e4ccccd    # 0.2f

    aput v0, p1, v3

    iget-object p1, p0, Lha;->h:[F

    aput v0, p1, v4

    iget-object p1, p0, Lha;->l:[F

    const v0, 0x3a83126f    # 0.001f

    aput v0, p1, v3

    iget-object p1, p0, Lha;->l:[F

    aput v0, p1, v4

    sget p1, Lha;->r:I

    iput p1, p0, Lha;->k:I

    iget-object p1, p0, Lha;->a:Lha$a;

    const/16 v0, 0x1f4

    iput v0, p1, Lha$a;->a:I

    iget-object p1, p0, Lha;->a:Lha$a;

    iput v0, p1, Lha$a;->b:I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_4
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data
.end method

.method private a(FF)F
    .locals 3

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget v1, p0, Lha;->j:I

    packed-switch v1, :pswitch_data_0

    return v0

    :pswitch_0
    cmpg-float v1, p1, v0

    if-gez v1, :cond_2

    neg-float p2, p2

    div-float/2addr p1, p2

    return p1

    :pswitch_1
    cmpg-float v1, p1, p2

    if-gez v1, :cond_2

    cmpl-float v1, p1, v0

    const/high16 v2, 0x3f800000    # 1.0f

    if-ltz v1, :cond_1

    div-float/2addr p1, p2

    sub-float/2addr v2, p1

    return v2

    :cond_1
    iget-boolean p1, p0, Lha;->e:Z

    if-eqz p1, :cond_2

    iget p1, p0, Lha;->j:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    return v2

    :cond_2
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static a(FFF)F
    .locals 1

    cmpl-float v0, p0, p2

    if-lez v0, :cond_0

    return p2

    :cond_0
    cmpg-float p2, p0, p1

    if-gez p2, :cond_1

    return p1

    :cond_1
    return p0
.end method

.method private a(IFFF)F
    .locals 3

    iget-object v0, p0, Lha;->h:[F

    aget v0, v0, p1

    iget-object v1, p0, Lha;->i:[F

    aget v1, v1, p1

    mul-float/2addr v0, p3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lha;->a(FFF)F

    move-result v0

    invoke-direct {p0, p2, v0}, Lha;->a(FF)F

    move-result v1

    sub-float/2addr p3, p2

    invoke-direct {p0, p3, v0}, Lha;->a(FF)F

    move-result p2

    sub-float/2addr p2, v1

    cmpg-float p3, p2, v2

    if-gez p3, :cond_0

    iget-object p3, p0, Lha;->f:Landroid/view/animation/Interpolator;

    neg-float p2, p2

    invoke-interface {p3, p2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p2

    neg-float p2, p2

    goto :goto_0

    :cond_0
    cmpl-float p3, p2, v2

    if-lez p3, :cond_1

    iget-object p3, p0, Lha;->f:Landroid/view/animation/Interpolator;

    invoke-interface {p3, p2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result p2

    :goto_0
    const/high16 p3, -0x40800000    # -1.0f

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p2, p3, v0}, Lha;->a(FFF)F

    move-result p2

    goto :goto_1

    :cond_1
    move p2, v2

    :goto_1
    cmpl-float p3, p2, v2

    if-nez p3, :cond_2

    return v2

    :cond_2
    iget-object v0, p0, Lha;->l:[F

    aget v0, v0, p1

    iget-object v1, p0, Lha;->m:[F

    aget v1, v1, p1

    iget-object v2, p0, Lha;->n:[F

    aget p1, v2, p1

    mul-float/2addr v0, p4

    if-lez p3, :cond_3

    mul-float/2addr p2, v0

    invoke-static {p2, v1, p1}, Lha;->a(FFF)F

    move-result p1

    return p1

    :cond_3
    neg-float p2, p2

    mul-float/2addr p2, v0

    invoke-static {p2, v1, p1}, Lha;->a(FFF)F

    move-result p1

    neg-float p1, p1

    return p1
.end method

.method private b()V
    .locals 6

    iget-boolean v0, p0, Lha;->c:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lha;->e:Z

    return-void

    :cond_0
    iget-object v0, p0, Lha;->a:Lha$a;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, Lha$a;->e:J

    sub-long v4, v2, v4

    long-to-int v4, v4

    iget v5, v0, Lha$a;->b:I

    if-le v4, v5, :cond_1

    move v1, v5

    goto :goto_0

    :cond_1
    if-gez v4, :cond_2

    goto :goto_0

    :cond_2
    move v1, v4

    :goto_0
    iput v1, v0, Lha$a;->k:I

    invoke-virtual {v0, v2, v3}, Lha$a;->a(J)F

    move-result v1

    iput v1, v0, Lha$a;->j:F

    iput-wide v2, v0, Lha$a;->i:J

    return-void
.end method


# virtual methods
.method public final a(Z)Lha;
    .locals 1

    iget-boolean v0, p0, Lha;->p:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    invoke-direct {p0}, Lha;->b()V

    :cond_0
    iput-boolean p1, p0, Lha;->p:Z

    return-object p0
.end method

.method public abstract a(I)V
.end method

.method final a()Z
    .locals 3

    iget-object v0, p0, Lha;->a:Lha$a;

    iget v1, v0, Lha$a;->d:F

    iget v2, v0, Lha$a;->d:F

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    div-float/2addr v1, v2

    float-to-int v1, v1

    iget v2, v0, Lha$a;->c:F

    iget v0, v0, Lha$a;->c:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    div-float/2addr v2, v0

    float-to-int v0, v2

    if-eqz v1, :cond_1

    invoke-virtual {p0, v1}, Lha;->b(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract b(I)Z
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    iget-boolean v0, p0, Lha;->p:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-direct {p0}, Lha;->b()V

    goto :goto_1

    :pswitch_1
    iput-boolean v2, p0, Lha;->d:Z

    iput-boolean v1, p0, Lha;->o:Z

    :pswitch_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lha;->b:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {p0, v1, v0, v3, v4}, Lha;->a(IFFF)F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget-object v3, p0, Lha;->b:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-direct {p0, v2, p2, p1, v3}, Lha;->a(IFFF)F

    move-result p1

    iget-object p2, p0, Lha;->a:Lha$a;

    iput v0, p2, Lha$a;->c:F

    iput p1, p2, Lha$a;->d:F

    iget-boolean p1, p0, Lha;->e:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lha;->a()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lha;->g:Ljava/lang/Runnable;

    if-nez p1, :cond_1

    new-instance p1, Lha$b;

    invoke-direct {p1, p0}, Lha$b;-><init>(Lha;)V

    iput-object p1, p0, Lha;->g:Ljava/lang/Runnable;

    :cond_1
    iput-boolean v2, p0, Lha;->e:Z

    iput-boolean v2, p0, Lha;->c:Z

    iget-boolean p1, p0, Lha;->o:Z

    if-nez p1, :cond_2

    iget p1, p0, Lha;->k:I

    if-lez p1, :cond_2

    iget-object p1, p0, Lha;->b:Landroid/view/View;

    iget-object p2, p0, Lha;->g:Ljava/lang/Runnable;

    iget v0, p0, Lha;->k:I

    int-to-long v3, v0

    invoke-static {p1, p2, v3, v4}, Lgq;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lha;->g:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    iput-boolean v2, p0, Lha;->o:Z

    :cond_3
    :goto_1
    iget-boolean p1, p0, Lha;->q:Z

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lha;->e:Z

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
