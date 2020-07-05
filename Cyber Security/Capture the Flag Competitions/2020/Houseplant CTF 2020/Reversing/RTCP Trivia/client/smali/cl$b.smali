.class final Lcl$b;
.super Landroid/widget/LinearLayout;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:Lc$b;

.field final synthetic b:Lcl;

.field private final c:[I

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcl;Landroid/content/Context;Lc$b;)V
    .locals 3

    iput-object p1, p0, Lcl$b;->b:Lcl;

    sget p1, Lb$a;->actionBarTabStyle:I

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    new-array p1, p1, [I

    const/4 v1, 0x0

    const v2, 0x10100d4

    aput v2, p1, v1

    iput-object p1, p0, Lcl$b;->c:[I

    iput-object p3, p0, Lcl$b;->a:Lc$b;

    iget-object p1, p0, Lcl$b;->c:[I

    sget p3, Lb$a;->actionBarTabStyle:I

    invoke-static {p2, v0, p1, p3, v1}, Lcr;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lcr;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcr;->f(I)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1, v1}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcl$b;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object p1, p1, Lcr;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    const p1, 0x800013

    invoke-virtual {p0, p1}, Lcl$b;->setGravity(I)V

    invoke-virtual {p0}, Lcl$b;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    iget-object v0, p0, Lcl$b;->a:Lc$b;

    invoke-virtual {v0}, Lc$b;->c()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_1

    if-eqz v0, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0, v1}, Lcl$b;->addView(Landroid/view/View;)V

    :cond_1
    iput-object v1, p0, Lcl$b;->f:Landroid/view/View;

    iget-object v0, p0, Lcl$b;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcl$b;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    iget-object v0, p0, Lcl$b;->e:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcl$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcl$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return-void

    :cond_4
    iget-object v1, p0, Lcl$b;->f:Landroid/view/View;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcl$b;->f:Landroid/view/View;

    invoke-virtual {p0, v1}, Lcl$b;->removeView(Landroid/view/View;)V

    iput-object v3, p0, Lcl$b;->f:Landroid/view/View;

    :cond_5
    invoke-virtual {v0}, Lc$b;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0}, Lc$b;->b()Ljava/lang/CharSequence;

    move-result-object v4

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v7, -0x2

    if-eqz v1, :cond_7

    iget-object v8, p0, Lcl$b;->e:Landroid/widget/ImageView;

    if-nez v8, :cond_6

    new-instance v8, Lbn;

    invoke-virtual {p0}, Lcl$b;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v8, v9}, Lbn;-><init>(Landroid/content/Context;)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v9, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v5, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v8, v9}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, v8, v6}, Lcl$b;->addView(Landroid/view/View;I)V

    iput-object v8, p0, Lcl$b;->e:Landroid/widget/ImageView;

    :cond_6
    iget-object v8, p0, Lcl$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v8, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lcl$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_7
    iget-object v1, p0, Lcl$b;->e:Landroid/widget/ImageView;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcl$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Lcl$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_8
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_a

    iget-object v2, p0, Lcl$b;->d:Landroid/widget/TextView;

    if-nez v2, :cond_9

    new-instance v2, Lbx;

    invoke-virtual {p0}, Lcl$b;->getContext()Landroid/content/Context;

    move-result-object v8

    sget v9, Lb$a;->actionBarTabTextStyle:I

    invoke-direct {v2, v8, v3, v9}, Lbx;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v5, v8, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, v2}, Lcl$b;->addView(Landroid/view/View;)V

    iput-object v2, p0, Lcl$b;->d:Landroid/widget/TextView;

    :cond_9
    iget-object v2, p0, Lcl$b;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcl$b;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :cond_a
    iget-object v4, p0, Lcl$b;->d:Landroid/widget/TextView;

    if-eqz v4, :cond_b

    iget-object v4, p0, Lcl$b;->d:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v2, p0, Lcl$b;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_b
    :goto_1
    iget-object v2, p0, Lcl$b;->e:Landroid/widget/ImageView;

    if-eqz v2, :cond_c

    iget-object v2, p0, Lcl$b;->e:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lc$b;->d()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_c
    if-eqz v1, :cond_d

    goto :goto_2

    :cond_d
    invoke-virtual {v0}, Lc$b;->d()Ljava/lang/CharSequence;

    move-result-object v3

    :goto_2
    invoke-static {p0, v3}, Lct;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Lc$b;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-class v0, Lc$b;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    iget-object p1, p0, Lcl$b;->b:Lcl;

    iget p1, p1, Lcl;->c:I

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lcl$b;->getMeasuredWidth()I

    move-result p1

    iget-object v0, p0, Lcl$b;->b:Lcl;

    iget v0, v0, Lcl;->c:I

    if-le p1, v0, :cond_0

    iget-object p1, p0, Lcl$b;->b:Lcl;

    iget p1, p1, Lcl;->c:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    :cond_0
    return-void
.end method

.method public final setSelected(Z)V
    .locals 1

    invoke-virtual {p0}, Lcl$b;->isSelected()Z

    move-result v0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setSelected(Z)V

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Lcl$b;->sendAccessibilityEvent(I)V

    :cond_1
    return-void
.end method
