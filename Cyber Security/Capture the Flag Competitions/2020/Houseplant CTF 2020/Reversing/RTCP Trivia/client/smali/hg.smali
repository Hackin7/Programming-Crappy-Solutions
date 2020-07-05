.class public final Lhg;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhg$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-gt v0, v1, :cond_1

    instance-of v0, p1, Lhg$a;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lhg$a;

    invoke-direct {v0, p1, p0}, Lhg$a;-><init>(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)V

    return-object v0

    :cond_1
    return-object p1
.end method

.method public static a(Landroid/widget/TextView;)Lfy$a;
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Lfy$a;

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextMetricsParams()Landroid/text/PrecomputedText$Params;

    move-result-object p0

    invoke-direct {v0, p0}, Lfy$a;-><init>(Landroid/text/PrecomputedText$Params;)V

    return-object v0

    :cond_0
    new-instance v0, Lfy$a$a;

    new-instance v2, Landroid/text/TextPaint;

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    invoke-direct {v0, v2}, Lfy$a$a;-><init>(Landroid/text/TextPaint;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_1

    invoke-virtual {p0}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result v2

    iput v2, v0, Lfy$a$a;->c:I

    invoke-virtual {p0}, Landroid/widget/TextView;->getHyphenationFrequency()I

    move-result v2

    iput v2, v0, Lfy$a$a;->d:I

    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x12

    if-lt v2, v3, :cond_8

    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v2

    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v2, :cond_3

    :cond_2
    :pswitch_0
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_1

    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-lt v2, v1, :cond_5

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v1

    and-int/lit8 v1, v1, 0xf

    const/4 v2, 0x3

    if-ne v1, v2, :cond_5

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextLocale()Ljava/util/Locale;

    move-result-object p0

    invoke-static {p0}, Landroid/icu/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Landroid/icu/text/DecimalFormatSymbols;

    move-result-object p0

    invoke-virtual {p0}, Landroid/icu/text/DecimalFormatSymbols;->getDigitStrings()[Ljava/lang/String;

    move-result-object p0

    aget-object p0, p0, v4

    invoke-virtual {p0, v4}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->getDirectionality(I)B

    move-result p0

    if-eq p0, v3, :cond_4

    const/4 v1, 0x2

    if-ne p0, v1, :cond_2

    :cond_4
    :pswitch_1
    sget-object p0, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayoutDirection()I

    move-result v1

    if-ne v1, v3, :cond_6

    goto :goto_0

    :cond_6
    move v3, v4

    :goto_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextDirection()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    if-nez v3, :cond_7

    :pswitch_2
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_1

    :pswitch_3
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    goto :goto_1

    :pswitch_4
    sget-object p0, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    goto :goto_1

    :cond_7
    :pswitch_5
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    :goto_1
    iput-object p0, v0, Lfy$a$a;->b:Landroid/text/TextDirectionHeuristic;

    :cond_8
    new-instance p0, Lfy$a;

    iget-object v1, v0, Lfy$a$a;->a:Landroid/text/TextPaint;

    iget-object v2, v0, Lfy$a$a;->b:Landroid/text/TextDirectionHeuristic;

    iget v3, v0, Lfy$a$a;->c:I

    iget v0, v0, Lfy$a$a;->d:I

    invoke-direct {p0, v1, v2, v3, v0}, Lfy$a;-><init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_5
    .end packed-switch
.end method

.method public static a(Landroid/widget/TextView;I)V
    .locals 3

    invoke-static {p1}, Lgc;->a(I)I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_2

    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    goto :goto_1

    :cond_2
    :goto_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    :goto_1
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p1, v1, :cond_3

    neg-int v0, v0

    sub-int/2addr p1, v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_3
    return-void
.end method

.method public static a(Landroid/widget/TextView;Lfy;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    iget-object v0, p1, Lfy;->a:Landroid/text/Spannable;

    instance-of v0, v0, Landroid/text/PrecomputedText;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lfy;->a:Landroid/text/Spannable;

    check-cast p1, Landroid/text/PrecomputedText;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    invoke-static {p0}, Lhg;->a(Landroid/widget/TextView;)Lfy$a;

    move-result-object v0

    iget-object v1, p1, Lfy;->b:Lfy$a;

    invoke-virtual {v0, v1}, Lfy$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Given text can not be applied to TextView."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static b(Landroid/widget/TextView;I)V
    .locals 3

    invoke-static {p1}, Lgc;->a(I)I

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    goto :goto_1

    :cond_1
    :goto_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    :goto_1
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p1, v1, :cond_2

    sub-int/2addr p1, v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_2
    return-void
.end method

.method public static c(Landroid/widget/TextView;I)V
    .locals 2

    invoke-static {p1}, Lgc;->a(I)I

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq p1, v0, :cond_0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void
.end method
