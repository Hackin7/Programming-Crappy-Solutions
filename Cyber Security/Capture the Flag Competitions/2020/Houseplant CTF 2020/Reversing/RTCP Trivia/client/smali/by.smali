.class final Lby;
.super Ljava/lang/Object;


# static fields
.field private static final i:Landroid/graphics/RectF;

.field private static j:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:I

.field b:Z

.field c:F

.field d:F

.field e:F

.field f:[I

.field g:Z

.field final h:Landroid/content/Context;

.field private k:Landroid/text/TextPaint;

.field private final l:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    sput-object v0, Lby;->i:Landroid/graphics/RectF;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lby;->j:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method constructor <init>(Landroid/widget/TextView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lby;->a:I

    iput-boolean v0, p0, Lby;->b:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lby;->c:F

    iput v1, p0, Lby;->d:F

    iput v1, p0, Lby;->e:F

    new-array v1, v0, [I

    iput-object v1, p0, Lby;->f:[I

    iput-boolean v0, p0, Lby;->g:Z

    iput-object p1, p0, Lby;->l:Landroid/widget/TextView;

    iget-object p1, p0, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lby;->h:Landroid/content/Context;

    return-void
.end method

.method private static a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    :try_start_0
    invoke-static {p1}, Lby;->a(Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_1
    const-string v0, "ACTVAutoSizeHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to invoke TextView#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "() method"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p0, p2

    return-object p0

    :goto_0
    throw p0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 4

    :try_start_0
    sget-object v0, Lby;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    const-class v0, Landroid/widget/TextView;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v0, p0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    sget-object v1, Lby;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "ACTVAutoSizeHelper"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to retrieve TextView#"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "() method"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method static a([I)[I
    .locals 6

    array-length v0, p0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->sort([I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    aget v4, p0, v3

    if-lez v4, :cond_1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ne v0, v3, :cond_3

    return-object p0

    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    new-array v0, p0, [I

    :goto_1
    if-ge v2, p0, :cond_4

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    return-object v0
.end method


# virtual methods
.method final a(FFF)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gtz v1, :cond_0

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Minimum auto-size text size ("

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "px) is less or equal to (0px)"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    cmpg-float v1, p2, p1

    if-gtz v1, :cond_1

    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Maximum auto-size text size ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, "px) is less or equal to minimum auto-size text size ("

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "px)"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_1
    cmpg-float v0, p3, v0

    if-gtz v0, :cond_2

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "The auto-size step granularity ("

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, "px) is less or equal to (0px)"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v0, 0x1

    iput v0, p0, Lby;->a:I

    iput p1, p0, Lby;->d:F

    iput p2, p0, Lby;->e:F

    iput p3, p0, Lby;->c:F

    const/4 p1, 0x0

    iput-boolean p1, p0, Lby;->g:Z

    return-void
.end method

.method final a(IF)V
    .locals 2

    iget-object v0, p0, Lby;->h:Landroid/content/Context;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lby;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iget-object p2, p0, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p2}, Landroid/text/TextPaint;->getTextSize()F

    move-result p2

    cmpl-float p2, p1, p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/text/TextPaint;->setTextSize(F)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x12

    const/4 v0, 0x0

    if-lt p1, p2, :cond_1

    iget-object p1, p0, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->isInLayout()Z

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    iget-object p2, p0, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object p2

    if-eqz p2, :cond_4

    iput-boolean v0, p0, Lby;->b:Z

    :try_start_0
    const-string p2, "nullLayouts"

    invoke-static {p2}, Lby;->a(Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-object v1, p0, Lby;->l:Landroid/widget/TextView;

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    const-string v0, "ACTVAutoSizeHelper"

    const-string v1, "Failed to invoke TextView#nullLayouts() method"

    invoke-static {v0, v1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_2
    if-nez p1, :cond_3

    iget-object p1, p0, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->requestLayout()V

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->forceLayout()V

    :goto_3
    iget-object p1, p0, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->invalidate()V

    :cond_4
    return-void
.end method

.method final a()Z
    .locals 4

    iget-object v0, p0, Lby;->f:[I

    const/4 v1, 0x0

    const/4 v2, 0x1

    array-length v0, v0

    if-lez v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    iput-boolean v3, p0, Lby;->g:Z

    iget-boolean v3, p0, Lby;->g:Z

    if-eqz v3, :cond_1

    iput v2, p0, Lby;->a:I

    iget-object v3, p0, Lby;->f:[I

    aget v1, v3, v1

    int-to-float v1, v1

    iput v1, p0, Lby;->d:F

    iget-object v1, p0, Lby;->f:[I

    sub-int/2addr v0, v2

    aget v0, v1, v0

    int-to-float v0, v0

    iput v0, p0, Lby;->e:F

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lby;->c:F

    :cond_1
    iget-boolean v0, p0, Lby;->g:Z

    return v0
.end method

.method final b()Z
    .locals 6

    invoke-virtual {p0}, Lby;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget v0, p0, Lby;->a:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_4

    iget-boolean v0, p0, Lby;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lby;->f:[I

    array-length v0, v0

    if-nez v0, :cond_3

    :cond_0
    iget v0, p0, Lby;->d:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    move v3, v2

    :goto_0
    iget v4, p0, Lby;->c:F

    add-float/2addr v4, v0

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v5, p0, Lby;->e:F

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    if-gt v4, v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    iget v4, p0, Lby;->c:F

    add-float/2addr v0, v4

    goto :goto_0

    :cond_1
    new-array v0, v3, [I

    iget v4, p0, Lby;->d:F

    :goto_1
    if-ge v1, v3, :cond_2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, v0, v1

    iget v5, p0, Lby;->c:F

    add-float/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lby;->a([I)[I

    move-result-object v0

    iput-object v0, p0, Lby;->f:[I

    :cond_3
    iput-boolean v2, p0, Lby;->b:Z

    goto :goto_2

    :cond_4
    iput-boolean v1, p0, Lby;->b:Z

    :goto_2
    iget-boolean v0, p0, Lby;->b:Z

    return v0
.end method

.method final c()V
    .locals 21

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Lby;->d()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-boolean v2, v1, Lby;->b:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_12

    iget-object v2, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v2

    if-lez v2, :cond_11

    iget-object v2, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    if-gtz v2, :cond_1

    return-void

    :cond_1
    iget-object v2, v1, Lby;->l:Landroid/widget/TextView;

    const-string v4, "getHorizontallyScrolling"

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v2, v4, v6}, Lby;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    const/high16 v2, 0x100000

    goto :goto_0

    :cond_2
    iget-object v2, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    iget-object v4, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v4

    sub-int/2addr v2, v4

    iget-object v4, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getTotalPaddingRight()I

    move-result v4

    sub-int/2addr v2, v4

    :goto_0
    iget-object v4, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getHeight()I

    move-result v4

    iget-object v6, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v6

    sub-int/2addr v4, v6

    iget-object v6, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v6

    sub-int/2addr v4, v6

    if-lez v2, :cond_11

    if-gtz v4, :cond_3

    return-void

    :cond_3
    sget-object v6, Lby;->i:Landroid/graphics/RectF;

    monitor-enter v6

    :try_start_0
    sget-object v7, Lby;->i:Landroid/graphics/RectF;

    invoke-virtual {v7}, Landroid/graphics/RectF;->setEmpty()V

    sget-object v7, Lby;->i:Landroid/graphics/RectF;

    int-to-float v2, v2

    iput v2, v7, Landroid/graphics/RectF;->right:F

    sget-object v2, Lby;->i:Landroid/graphics/RectF;

    int-to-float v4, v4

    iput v4, v2, Landroid/graphics/RectF;->bottom:F

    sget-object v2, Lby;->i:Landroid/graphics/RectF;

    iget-object v4, v1, Lby;->f:[I

    array-length v4, v4

    if-nez v4, :cond_4

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "No available text sizes to choose from."

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    sub-int/2addr v4, v3

    move v7, v4

    move v8, v5

    move v4, v3

    :goto_1
    if-gt v4, v7, :cond_f

    add-int v8, v4, v7

    div-int/lit8 v8, v8, 0x2

    iget-object v9, v1, Lby;->f:[I

    aget v9, v9, v8

    iget-object v10, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v10}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v10

    iget-object v11, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v11}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v11

    if-eqz v11, :cond_5

    iget-object v12, v1, Lby;->l:Landroid/widget/TextView;

    invoke-interface {v11, v10, v12}, Landroid/text/method/TransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v11

    if-eqz v11, :cond_5

    move-object v10, v11

    :cond_5
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x10

    const/4 v15, -0x1

    if-lt v11, v12, :cond_6

    iget-object v11, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v11}, Landroid/widget/TextView;->getMaxLines()I

    move-result v11

    goto :goto_2

    :cond_6
    move v11, v15

    :goto_2
    iget-object v13, v1, Lby;->k:Landroid/text/TextPaint;

    if-nez v13, :cond_7

    new-instance v13, Landroid/text/TextPaint;

    invoke-direct {v13}, Landroid/text/TextPaint;-><init>()V

    iput-object v13, v1, Lby;->k:Landroid/text/TextPaint;

    goto :goto_3

    :cond_7
    iget-object v13, v1, Lby;->k:Landroid/text/TextPaint;

    invoke-virtual {v13}, Landroid/text/TextPaint;->reset()V

    :goto_3
    iget-object v13, v1, Lby;->k:Landroid/text/TextPaint;

    iget-object v14, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v14}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v14

    invoke-virtual {v13, v14}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    iget-object v13, v1, Lby;->k:Landroid/text/TextPaint;

    int-to-float v9, v9

    invoke-virtual {v13, v9}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v9, v1, Lby;->l:Landroid/widget/TextView;

    const-string v13, "getLayoutAlignment"

    sget-object v14, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-static {v9, v13, v14}, Lby;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/text/Layout$Alignment;

    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x17

    if-lt v13, v14, :cond_9

    iget v12, v2, Landroid/graphics/RectF;->right:F

    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v12

    iget-object v13, v1, Lby;->l:Landroid/widget/TextView;

    const-string v14, "getTextDirectionHeuristic"

    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    invoke-static {v13, v14, v3}, Lby;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/text/TextDirectionHeuristic;

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v13

    iget-object v14, v1, Lby;->k:Landroid/text/TextPaint;

    invoke-static {v10, v5, v13, v14, v12}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object v12

    invoke-virtual {v12, v9}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object v9

    iget-object v12, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/widget/TextView;->getLineSpacingExtra()F

    move-result v12

    iget-object v13, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v13}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    move-result v13

    invoke-virtual {v9, v12, v13}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object v9

    iget-object v12, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v12

    invoke-virtual {v9, v12}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object v9

    iget-object v12, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result v12

    invoke-virtual {v9, v12}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object v9

    iget-object v12, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/widget/TextView;->getHyphenationFrequency()I

    move-result v12

    invoke-virtual {v9, v12}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object v9

    if-ne v11, v15, :cond_8

    const v12, 0x7fffffff

    goto :goto_4

    :cond_8
    move v12, v11

    :goto_4
    invoke-virtual {v9, v12}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    move-result-object v9

    invoke-virtual {v9, v3}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object v3

    move/from16 v20, v4

    move v5, v15

    goto/16 :goto_6

    :cond_9
    iget v3, v2, Landroid/graphics/RectF;->right:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v13, v12, :cond_a

    iget-object v12, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v12}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    move-result v12

    iget-object v13, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v13}, Landroid/widget/TextView;->getLineSpacingExtra()F

    move-result v13

    iget-object v14, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v14}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v14

    move/from16 v20, v4

    move/from16 v17, v12

    move/from16 v18, v13

    move/from16 v19, v14

    goto :goto_5

    :cond_a
    iget-object v12, v1, Lby;->l:Landroid/widget/TextView;

    const-string v13, "getLineSpacingMultiplier"

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-static {v12, v13, v14}, Lby;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Float;

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v12

    iget-object v13, v1, Lby;->l:Landroid/widget/TextView;

    const-string v14, "getLineSpacingExtra"

    const/4 v15, 0x0

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-static {v13, v14, v15}, Lby;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Float;

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v13

    iget-object v14, v1, Lby;->l:Landroid/widget/TextView;

    const-string v15, "getIncludeFontPadding"

    move/from16 v20, v4

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v14, v15, v4}, Lby;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move/from16 v19, v4

    move/from16 v17, v12

    move/from16 v18, v13

    :goto_5
    new-instance v4, Landroid/text/StaticLayout;

    iget-object v14, v1, Lby;->k:Landroid/text/TextPaint;

    move-object v12, v4

    move-object v13, v10

    const/4 v5, -0x1

    move v15, v3

    move-object/from16 v16, v9

    invoke-direct/range {v12 .. v19}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    move-object v3, v4

    :goto_6
    if-eq v11, v5, :cond_c

    invoke-virtual {v3}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v4

    if-gt v4, v11, :cond_b

    invoke-virtual {v3}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    invoke-virtual {v3, v4}, Landroid/text/StaticLayout;->getLineEnd(I)I

    move-result v4

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-eq v4, v5, :cond_c

    :cond_b
    :goto_7
    const/4 v3, 0x0

    goto :goto_8

    :cond_c
    invoke-virtual {v3}, Landroid/text/StaticLayout;->getHeight()I

    move-result v3

    int-to-float v3, v3

    iget v4, v2, Landroid/graphics/RectF;->bottom:F

    cmpl-float v3, v3, v4

    if-lez v3, :cond_d

    goto :goto_7

    :cond_d
    const/4 v3, 0x1

    :goto_8
    if-eqz v3, :cond_e

    add-int/lit8 v4, v8, 0x1

    move/from16 v8, v20

    :goto_9
    const/4 v3, 0x1

    const/4 v5, 0x0

    goto/16 :goto_1

    :cond_e
    add-int/lit8 v8, v8, -0x1

    move v7, v8

    move/from16 v4, v20

    goto :goto_9

    :cond_f
    iget-object v2, v1, Lby;->f:[I

    aget v2, v2, v8

    int-to-float v2, v2

    iget-object v3, v1, Lby;->l:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTextSize()F

    move-result v3

    cmpl-float v3, v2, v3

    if-eqz v3, :cond_10

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lby;->a(IF)V

    :cond_10
    monitor-exit v6

    const/4 v2, 0x1

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object v2, v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    :cond_11
    return-void

    :cond_12
    move v2, v3

    :goto_a
    iput-boolean v2, v1, Lby;->b:Z

    return-void
.end method

.method final d()Z
    .locals 1

    invoke-virtual {p0}, Lby;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lby;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final e()Z
    .locals 1

    iget-object v0, p0, Lby;->l:Landroid/widget/TextView;

    instance-of v0, v0, Lbj;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
