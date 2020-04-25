.class public abstract Lce;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lce$b;,
        Lce$a;
    }
.end annotation


# instance fields
.field private final a:F

.field private final b:I

.field final c:Landroid/view/View;

.field d:Z

.field private final e:I

.field private f:Ljava/lang/Runnable;

.field private g:Ljava/lang/Runnable;

.field private h:I

.field private final i:[I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [I

    iput-object v1, p0, Lce;->i:[I

    iput-object p1, p0, Lce;->c:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/view/View;->setLongClickable(Z)V

    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lce;->a:F

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result p1

    iput p1, p0, Lce;->b:I

    iget p1, p0, Lce;->b:I

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    add-int/2addr p1, v1

    div-int/2addr p1, v0

    iput p1, p0, Lce;->e:I

    return-void
.end method


# virtual methods
.method public abstract a()Lau;
.end method

.method public b()Z
    .locals 2

    invoke-virtual {p0}, Lce;->a()Lau;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lau;->d()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lau;->b()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method protected c()Z
    .locals 2

    invoke-virtual {p0}, Lce;->a()Lau;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lau;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lau;->c()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method final d()V
    .locals 2

    iget-object v0, p0, Lce;->g:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lce;->c:Landroid/view/View;

    iget-object v1, p0, Lce;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v0, p0, Lce;->f:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lce;->c:Landroid/view/View;

    iget-object v1, p0, Lce;->f:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    iget-boolean p1, p0, Lce;->d:Z

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    iget-object v2, p0, Lce;->c:Landroid/view/View;

    invoke-virtual {p0}, Lce;->a()Lau;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lau;->d()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v3}, Lau;->e()Landroid/widget/ListView;

    move-result-object v3

    check-cast v3, Lcc;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcc;->isShown()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p2}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v4

    iget-object v5, p0, Lce;->i:[I

    invoke-virtual {v2, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v2, v5, v1

    int-to-float v2, v2

    aget v5, v5, v0

    int-to-float v5, v5

    invoke-virtual {v4, v2, v5}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    iget-object v2, p0, Lce;->i:[I

    invoke-virtual {v3, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v5, v2, v1

    neg-int v5, v5

    int-to-float v5, v5

    aget v2, v2, v0

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v4, v5, v2}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    iget v2, p0, Lce;->h:I

    invoke-virtual {v3, v4, v2}, Lcc;->a(Landroid/view/MotionEvent;I)Z

    move-result v2

    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p2

    if-eq p2, v0, :cond_2

    const/4 v3, 0x3

    if-eq p2, v3, :cond_2

    move p2, v0

    goto :goto_0

    :cond_2
    move p2, v1

    :goto_0
    if-eqz v2, :cond_3

    if-eqz p2, :cond_3

    move p2, v0

    goto :goto_2

    :cond_3
    :goto_1
    move p2, v1

    :goto_2
    if-nez p2, :cond_5

    invoke-virtual {p0}, Lce;->c()Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    move p2, v1

    goto/16 :goto_8

    :cond_5
    :goto_3
    move p2, v0

    goto/16 :goto_8

    :cond_6
    iget-object v2, p0, Lce;->c:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    iget v3, p0, Lce;->h:I

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    if-ltz v3, :cond_a

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    invoke-virtual {p2, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result p2

    iget v3, p0, Lce;->a:F

    neg-float v5, v3

    cmpl-float v6, v4, v5

    if-ltz v6, :cond_7

    cmpl-float v5, p2, v5

    if-ltz v5, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    add-float/2addr v5, v3

    cmpg-float v4, v4, v5

    if-gez v4, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    add-float/2addr v4, v3

    cmpg-float p2, p2, v4

    if-gez p2, :cond_7

    move p2, v0

    goto :goto_4

    :cond_7
    move p2, v1

    :goto_4
    if-nez p2, :cond_a

    invoke-virtual {p0}, Lce;->d()V

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    invoke-interface {p2, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    move p2, v0

    goto :goto_6

    :pswitch_1
    invoke-virtual {p0}, Lce;->d()V

    goto :goto_5

    :pswitch_2
    invoke-virtual {p2, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p2

    iput p2, p0, Lce;->h:I

    iget-object p2, p0, Lce;->f:Ljava/lang/Runnable;

    if-nez p2, :cond_8

    new-instance p2, Lce$a;

    invoke-direct {p2, p0}, Lce$a;-><init>(Lce;)V

    iput-object p2, p0, Lce;->f:Ljava/lang/Runnable;

    :cond_8
    iget-object p2, p0, Lce;->f:Ljava/lang/Runnable;

    iget v3, p0, Lce;->b:I

    int-to-long v3, v3

    invoke-virtual {v2, p2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object p2, p0, Lce;->g:Ljava/lang/Runnable;

    if-nez p2, :cond_9

    new-instance p2, Lce$b;

    invoke-direct {p2, p0}, Lce$b;-><init>(Lce;)V

    iput-object p2, p0, Lce;->g:Ljava/lang/Runnable;

    :cond_9
    iget-object p2, p0, Lce;->g:Ljava/lang/Runnable;

    iget v3, p0, Lce;->e:I

    int-to-long v3, v3

    invoke-virtual {v2, p2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_a
    :goto_5
    move p2, v1

    :goto_6
    if-eqz p2, :cond_b

    invoke-virtual {p0}, Lce;->b()Z

    move-result p2

    if-eqz p2, :cond_b

    move p2, v0

    goto :goto_7

    :cond_b
    move p2, v1

    :goto_7
    if-eqz p2, :cond_c

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide v2, v4

    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    iget-object v3, p0, Lce;->c:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    :cond_c
    :goto_8
    iput-boolean p2, p0, Lce;->d:Z

    if-nez p2, :cond_e

    if-eqz p1, :cond_d

    return v0

    :cond_d
    return v1

    :cond_e
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lce;->d:Z

    const/4 p1, -0x1

    iput p1, p0, Lce;->h:I

    iget-object p1, p0, Lce;->f:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lce;->c:Landroid/view/View;

    iget-object v0, p0, Lce;->f:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
