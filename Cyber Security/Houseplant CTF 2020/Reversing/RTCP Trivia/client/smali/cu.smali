.class final Lcu;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/View$OnHoverListener;
.implements Landroid/view/View$OnLongClickListener;


# static fields
.field private static j:Lcu;

.field private static k:Lcu;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Ljava/lang/CharSequence;

.field private final c:I

.field private final d:Ljava/lang/Runnable;

.field private final e:Ljava/lang/Runnable;

.field private f:I

.field private g:I

.field private h:Lcv;

.field private i:Z


# direct methods
.method private constructor <init>(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcu$1;

    invoke-direct {v0, p0}, Lcu$1;-><init>(Lcu;)V

    iput-object v0, p0, Lcu;->d:Ljava/lang/Runnable;

    new-instance v0, Lcu$2;

    invoke-direct {v0, p0}, Lcu$2;-><init>(Lcu;)V

    iput-object v0, p0, Lcu;->e:Ljava/lang/Runnable;

    iput-object p1, p0, Lcu;->a:Landroid/view/View;

    iput-object p2, p0, Lcu;->b:Ljava/lang/CharSequence;

    iget-object p1, p0, Lcu;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-static {p1}, Lgr;->a(Landroid/view/ViewConfiguration;)I

    move-result p1

    iput p1, p0, Lcu;->c:I

    invoke-direct {p0}, Lcu;->b()V

    iget-object p1, p0, Lcu;->a:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object p1, p0, Lcu;->a:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 2

    sget-object v0, Lcu;->j:Lcu;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lcu;->j:Lcu;

    iget-object v0, v0, Lcu;->a:Landroid/view/View;

    if-ne v0, p0, :cond_0

    invoke-static {v1}, Lcu;->a(Lcu;)V

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcu;->k:Lcu;

    if-eqz p1, :cond_1

    sget-object p1, Lcu;->k:Lcu;

    iget-object p1, p1, Lcu;->a:Landroid/view/View;

    if-ne p1, p0, :cond_1

    sget-object p1, Lcu;->k:Lcu;

    invoke-virtual {p1}, Lcu;->a()V

    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setLongClickable(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    return-void

    :cond_2
    new-instance v0, Lcu;

    invoke-direct {v0, p0, p1}, Lcu;-><init>(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static a(Lcu;)V
    .locals 3

    sget-object v0, Lcu;->j:Lcu;

    if-eqz v0, :cond_0

    sget-object v0, Lcu;->j:Lcu;

    iget-object v1, v0, Lcu;->a:Landroid/view/View;

    iget-object v0, v0, Lcu;->d:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    sput-object p0, Lcu;->j:Lcu;

    if-eqz p0, :cond_1

    sget-object p0, Lcu;->j:Lcu;

    iget-object v0, p0, Lcu;->a:Landroid/view/View;

    iget-object p0, p0, Lcu;->d:Ljava/lang/Runnable;

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method private b()V
    .locals 1

    const v0, 0x7fffffff

    iput v0, p0, Lcu;->f:I

    iput v0, p0, Lcu;->g:I

    return-void
.end method


# virtual methods
.method final a()V
    .locals 3

    sget-object v0, Lcu;->k:Lcu;

    const/4 v1, 0x0

    if-ne v0, p0, :cond_1

    sput-object v1, Lcu;->k:Lcu;

    iget-object v0, p0, Lcu;->h:Lcv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcu;->h:Lcv;

    invoke-virtual {v0}, Lcv;->a()V

    iput-object v1, p0, Lcu;->h:Lcv;

    invoke-direct {p0}, Lcu;->b()V

    iget-object v0, p0, Lcu;->a:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    goto :goto_0

    :cond_0
    const-string v0, "TooltipCompatHandler"

    const-string v2, "sActiveHandler.mPopup == null"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    sget-object v0, Lcu;->j:Lcu;

    if-ne v0, p0, :cond_2

    invoke-static {v1}, Lcu;->a(Lcu;)V

    :cond_2
    iget-object v0, p0, Lcu;->a:Landroid/view/View;

    iget-object v1, p0, Lcu;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method final a(Z)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcu;->a:Landroid/view/View;

    invoke-static {v1}, Lgq;->m(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-static {v1}, Lcu;->a(Lcu;)V

    sget-object v1, Lcu;->k:Lcu;

    if-eqz v1, :cond_1

    sget-object v1, Lcu;->k:Lcu;

    invoke-virtual {v1}, Lcu;->a()V

    :cond_1
    sput-object v0, Lcu;->k:Lcu;

    move/from16 v1, p1

    iput-boolean v1, v0, Lcu;->i:Z

    new-instance v1, Lcv;

    iget-object v2, v0, Lcu;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcv;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcu;->h:Lcv;

    iget-object v1, v0, Lcu;->h:Lcv;

    iget-object v2, v0, Lcu;->a:Landroid/view/View;

    iget v3, v0, Lcu;->f:I

    iget v4, v0, Lcu;->g:I

    iget-boolean v5, v0, Lcu;->i:Z

    iget-object v6, v0, Lcu;->b:Ljava/lang/CharSequence;

    invoke-virtual {v1}, Lcv;->b()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v1}, Lcv;->a()V

    :cond_2
    iget-object v7, v1, Lcv;->c:Landroid/widget/TextView;

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, v1, Lcv;->d:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v2}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object v7

    iput-object v7, v6, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    iget-object v7, v1, Lcv;->a:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lb$d;->tooltip_precise_anchor_threshold:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v8

    const/4 v9, 0x2

    if-ge v8, v7, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v3

    div-int/2addr v3, v9

    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v8

    const/4 v10, 0x0

    if-lt v8, v7, :cond_4

    iget-object v7, v1, Lcv;->a:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lb$d;->tooltip_precise_anchor_extra_offset:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    add-int v8, v4, v7

    sub-int/2addr v4, v7

    goto :goto_0

    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v8

    move v4, v10

    :goto_0
    const/16 v7, 0x31

    iput v7, v6, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget-object v7, v1, Lcv;->a:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    if-eqz v5, :cond_5

    sget v11, Lb$d;->tooltip_y_offset_touch:I

    goto :goto_1

    :cond_5
    sget v11, Lb$d;->tooltip_y_offset_non_touch:I

    :goto_1
    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    instance-of v13, v12, Landroid/view/WindowManager$LayoutParams;

    if-eqz v13, :cond_6

    check-cast v12, Landroid/view/WindowManager$LayoutParams;

    iget v12, v12, Landroid/view/WindowManager$LayoutParams;->type:I

    if-eq v12, v9, :cond_8

    :cond_6
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    :goto_2
    instance-of v13, v12, Landroid/content/ContextWrapper;

    if-eqz v13, :cond_8

    instance-of v13, v12, Landroid/app/Activity;

    if-eqz v13, :cond_7

    check-cast v12, Landroid/app/Activity;

    invoke-virtual {v12}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v11

    goto :goto_3

    :cond_7
    check-cast v12, Landroid/content/ContextWrapper;

    invoke-virtual {v12}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v12

    goto :goto_2

    :cond_8
    :goto_3
    const/4 v12, 0x1

    if-nez v11, :cond_9

    const-string v2, "TooltipPopup"

    const-string v3, "Cannot find app view"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_6

    :cond_9
    iget-object v13, v1, Lcv;->e:Landroid/graphics/Rect;

    invoke-virtual {v11, v13}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget-object v13, v1, Lcv;->e:Landroid/graphics/Rect;

    iget v13, v13, Landroid/graphics/Rect;->left:I

    if-gez v13, :cond_b

    iget-object v13, v1, Lcv;->e:Landroid/graphics/Rect;

    iget v13, v13, Landroid/graphics/Rect;->top:I

    if-gez v13, :cond_b

    iget-object v13, v1, Lcv;->a:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const-string v14, "status_bar_height"

    const-string v15, "dimen"

    const-string v9, "android"

    invoke-virtual {v13, v14, v15, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_a

    invoke-virtual {v13, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    goto :goto_4

    :cond_a
    move v9, v10

    :goto_4
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    iget-object v14, v1, Lcv;->e:Landroid/graphics/Rect;

    iget v15, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v13, v13, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v14, v10, v9, v15, v13}, Landroid/graphics/Rect;->set(IIII)V

    :cond_b
    iget-object v9, v1, Lcv;->g:[I

    invoke-virtual {v11, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v9, v1, Lcv;->f:[I

    invoke-virtual {v2, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v2, v1, Lcv;->f:[I

    aget v9, v2, v10

    iget-object v13, v1, Lcv;->g:[I

    aget v13, v13, v10

    sub-int/2addr v9, v13

    aput v9, v2, v10

    iget-object v2, v1, Lcv;->f:[I

    aget v9, v2, v12

    iget-object v13, v1, Lcv;->g:[I

    aget v13, v13, v12

    sub-int/2addr v9, v13

    aput v9, v2, v12

    iget-object v2, v1, Lcv;->f:[I

    aget v2, v2, v10

    add-int/2addr v2, v3

    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    move-result v3

    const/4 v9, 0x2

    div-int/2addr v3, v9

    sub-int/2addr v2, v3

    iput v2, v6, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-static {v10, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    iget-object v3, v1, Lcv;->b:Landroid/view/View;

    invoke-virtual {v3, v2, v2}, Landroid/view/View;->measure(II)V

    iget-object v2, v1, Lcv;->b:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget-object v3, v1, Lcv;->f:[I

    aget v3, v3, v12

    add-int/2addr v3, v4

    sub-int/2addr v3, v7

    sub-int/2addr v3, v2

    iget-object v4, v1, Lcv;->f:[I

    aget v4, v4, v12

    add-int/2addr v4, v8

    add-int/2addr v4, v7

    if-eqz v5, :cond_c

    if-gez v3, :cond_d

    :goto_5
    iput v4, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    goto :goto_6

    :cond_c
    add-int/2addr v2, v4

    iget-object v5, v1, Lcv;->e:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v5

    if-gt v2, v5, :cond_d

    goto :goto_5

    :cond_d
    iput v3, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    :goto_6
    iget-object v2, v1, Lcv;->a:Landroid/content/Context;

    const-string v3, "window"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    iget-object v3, v1, Lcv;->b:Landroid/view/View;

    iget-object v1, v1, Lcv;->d:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v2, v3, v1}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v0, Lcu;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-boolean v1, v0, Lcu;->i:Z

    if-eqz v1, :cond_e

    const-wide/16 v1, 0x9c4

    goto :goto_8

    :cond_e
    iget-object v1, v0, Lcu;->a:Landroid/view/View;

    invoke-static {v1}, Lgq;->f(Landroid/view/View;)I

    move-result v1

    and-int/2addr v1, v12

    if-ne v1, v12, :cond_f

    const-wide/16 v1, 0xbb8

    :goto_7
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    goto :goto_8

    :cond_f
    const-wide/16 v1, 0x3a98

    goto :goto_7

    :goto_8
    iget-object v3, v0, Lcu;->a:Landroid/view/View;

    iget-object v4, v0, Lcu;->e:Ljava/lang/Runnable;

    invoke-virtual {v3, v4}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v3, v0, Lcu;->a:Landroid/view/View;

    iget-object v4, v0, Lcu;->e:Ljava/lang/Runnable;

    invoke-virtual {v3, v4, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final onHover(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    iget-object p1, p0, Lcu;->h:Lcv;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcu;->i:Z

    if-eqz p1, :cond_0

    return v0

    :cond_0
    iget-object p1, p0, Lcu;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "accessibility"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v1, 0x7

    if-eq p1, v1, :cond_3

    const/16 p2, 0xa

    if-eq p1, p2, :cond_2

    return v0

    :cond_2
    invoke-direct {p0}, Lcu;->b()V

    invoke-virtual {p0}, Lcu;->a()V

    return v0

    :cond_3
    iget-object p1, p0, Lcu;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcu;->h:Lcv;

    if-nez p1, :cond_5

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    iget v1, p0, Lcu;->f:I

    sub-int v1, p1, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lcu;->c:I

    if-gt v1, v2, :cond_4

    iget v1, p0, Lcu;->g:I

    sub-int v1, p2, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Lcu;->c:I

    if-gt v1, v2, :cond_4

    move p1, v0

    goto :goto_0

    :cond_4
    iput p1, p0, Lcu;->f:I

    iput p2, p0, Lcu;->g:I

    const/4 p1, 0x1

    :goto_0
    if-eqz p1, :cond_5

    invoke-static {p0}, Lcu;->a(Lcu;)V

    :cond_5
    return v0
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcu;->f:I

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcu;->g:I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcu;->a(Z)V

    return p1
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcu;->a()V

    return-void
.end method
