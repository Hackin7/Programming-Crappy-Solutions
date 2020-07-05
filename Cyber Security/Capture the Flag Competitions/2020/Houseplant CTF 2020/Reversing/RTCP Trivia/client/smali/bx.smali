.class public Lbx;
.super Landroid/widget/TextView;

# interfaces
.implements Lgp;
.implements Lhb;


# instance fields
.field private final a:Lbd;

.field private final b:Lbw;

.field private c:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Lfy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lbx;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    invoke-direct {p0, p1, p2, v0}, Lbx;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Lco;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lbd;

    invoke-direct {p1, p0}, Lbd;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lbx;->a:Lbd;

    iget-object p1, p0, Lbx;->a:Lbd;

    invoke-virtual {p1, p2, p3}, Lbd;->a(Landroid/util/AttributeSet;I)V

    new-instance p1, Lbw;

    invoke-direct {p1, p0}, Lbw;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lbx;->b:Lbw;

    iget-object p1, p0, Lbx;->b:Lbw;

    invoke-virtual {p1, p2, p3}, Lbw;->a(Landroid/util/AttributeSet;I)V

    iget-object p1, p0, Lbx;->b:Lbw;

    invoke-virtual {p1}, Lbw;->a()V

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lbx;->c:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lbx;->c:Ljava/util/concurrent/Future;

    const/4 v1, 0x0

    iput-object v1, p0, Lbx;->c:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfy;

    invoke-static {p0, v0}, Lhg;->a(Landroid/widget/TextView;Lfy;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V

    iget-object v0, p0, Lbx;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbx;->a:Lbd;

    invoke-virtual {v0}, Lbd;->d()V

    :cond_0
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbx;->b:Lbw;

    invoke-virtual {v0}, Lbw;->a()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    sget-boolean v0, Lbx;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbx;->b:Lbw;

    iget-object v0, v0, Lbw;->a:Lby;

    iget v0, v0, Lby;->e:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    sget-boolean v0, Lbx;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbx;->b:Lbw;

    iget-object v0, v0, Lbw;->a:Lby;

    iget v0, v0, Lby;->d:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    sget-boolean v0, Lbx;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbx;->b:Lbw;

    iget-object v0, v0, Lbw;->a:Lby;

    iget v0, v0, Lby;->c:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    sget-boolean v0, Lbx;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbx;->b:Lbw;

    iget-object v0, v0, Lbw;->a:Lby;

    iget-object v0, v0, Lby;->f:[I

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 3

    sget-boolean v0, Lbx;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lbx;->b:Lbw;

    iget-object v0, v0, Lbw;->a:Lby;

    iget v0, v0, Lby;->a:I

    return v0

    :cond_2
    return v1
.end method

.method public getFirstBaselineToTopHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getLastBaselineToBottomHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lbx;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbx;->a:Lbd;

    invoke-virtual {v0}, Lbd;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lbx;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbx;->a:Lbd;

    invoke-virtual {v0}, Lbd;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    invoke-direct {p0}, Lbx;->a()V

    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTextMetricsParamsCompat()Lfy$a;
    .locals 1

    invoke-static {p0}, Lhg;->a(Landroid/widget/TextView;)Lfy$a;

    move-result-object v0

    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lbk;->a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    iget-object p1, p0, Lbx;->b:Lbw;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbx;->b:Lbw;

    invoke-virtual {p1}, Lbw;->b()V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-direct {p0}, Lbx;->a()V

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    return-void
.end method

.method protected onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Lbx;->b:Lbw;

    if-eqz p1, :cond_0

    sget-boolean p1, Lbx;->d:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lbx;->b:Lbw;

    iget-object p1, p1, Lbw;->a:Lby;

    invoke-virtual {p1}, Lby;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbx;->b:Lbw;

    iget-object p1, p1, Lbw;->a:Lby;

    invoke-virtual {p1}, Lby;->c()V

    :cond_0
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    sget-boolean v0, Lbx;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    return-void

    :cond_0
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbx;->b:Lbw;

    invoke-virtual {v0, p1, p2, p3, p4}, Lbw;->a(IIII)V

    :cond_1
    return-void
.end method

.method public setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    sget-boolean v0, Lbx;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    return-void

    :cond_0
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbx;->b:Lbw;

    invoke-virtual {v0, p1, p2}, Lbw;->a([II)V

    :cond_1
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    sget-boolean v0, Lbx;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbx;->b:Lbw;

    invoke-virtual {v0, p1}, Lbw;->a(I)V

    :cond_1
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lbx;->a:Lbd;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbx;->a:Lbd;

    invoke-virtual {p1}, Lbd;->a()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    iget-object v0, p0, Lbx;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbx;->a:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(I)V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p0, p1}, Lhg;->a(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setFirstBaselineToTopHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void

    :cond_0
    invoke-static {p0, p1}, Lhg;->a(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setLastBaselineToBottomHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V

    return-void

    :cond_0
    invoke-static {p0, p1}, Lhg;->b(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setLineHeight(I)V
    .locals 0

    invoke-static {p0, p1}, Lhg;->c(Landroid/widget/TextView;I)V

    return-void
.end method

.method public setPrecomputedText(Lfy;)V
    .locals 0

    invoke-static {p0, p1}, Lhg;->a(Landroid/widget/TextView;Lfy;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lbx;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbx;->a:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lbx;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbx;->a:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbx;->b:Lbw;

    invoke-virtual {v0, p1, p2}, Lbw;->a(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextFuture(Ljava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "Lfy;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbx;->c:Ljava/util/concurrent/Future;

    invoke-virtual {p0}, Lbx;->requestLayout()V

    return-void
.end method

.method public setTextMetricsParamsCompat(Lfy$a;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_6

    iget-object v0, p1, Lfy$a;->b:Landroid/text/TextDirectionHeuristic;

    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    if-eq v0, v1, :cond_5

    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-eq v0, v1, :cond_5

    sget-object v1, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    sget-object v1, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    sget-object v1, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x4

    goto :goto_0

    :cond_2
    sget-object v1, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v1, :cond_3

    const/4 v0, 0x5

    goto :goto_0

    :cond_3
    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v1, :cond_4

    const/4 v0, 0x6

    goto :goto_0

    :cond_4
    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v1, :cond_5

    const/4 v0, 0x7

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextDirection(I)V

    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_8

    iget-object v0, p1, Lfy$a;->a:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getTextScaleX()F

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    iget-object p1, p1, Lfy$a;->a:Landroid/text/TextPaint;

    invoke-virtual {v1, p1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextScaleX()F

    move-result p1

    cmpl-float p1, v0, p1

    if-nez p1, :cond_7

    const/high16 p1, 0x40000000    # 2.0f

    div-float p1, v0, p1

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr p1, v1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextScaleX(F)V

    :cond_7
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextScaleX(F)V

    return-void

    :cond_8
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iget-object v1, p1, Lfy$a;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    iget v0, p1, Lfy$a;->c:I

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setBreakStrategy(I)V

    iget p1, p1, Lfy$a;->d:I

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHyphenationFrequency(I)V

    return-void
.end method

.method public setTextSize(IF)V
    .locals 1

    sget-boolean v0, Lbx;->d:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    return-void

    :cond_0
    iget-object v0, p0, Lbx;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbx;->b:Lbw;

    invoke-virtual {v0, p1, p2}, Lbw;->a(IF)V

    :cond_1
    return-void
.end method
