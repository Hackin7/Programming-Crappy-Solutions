.class public final Lbr;
.super Landroid/widget/RadioButton;

# interfaces
.implements Lhh;


# instance fields
.field private final a:Lbh;

.field private final b:Lbw;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lb$a;->radioButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lbr;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Lco;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lbh;

    invoke-direct {p1, p0}, Lbh;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Lbr;->a:Lbh;

    iget-object p1, p0, Lbr;->a:Lbh;

    invoke-virtual {p1, p2, p3}, Lbh;->a(Landroid/util/AttributeSet;I)V

    new-instance p1, Lbw;

    invoke-direct {p1, p0}, Lbw;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lbr;->b:Lbw;

    iget-object p1, p0, Lbr;->b:Lbw;

    invoke-virtual {p1, p2, p3}, Lbw;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final getCompoundPaddingLeft()I
    .locals 2

    invoke-super {p0}, Landroid/widget/RadioButton;->getCompoundPaddingLeft()I

    move-result v0

    iget-object v1, p0, Lbr;->a:Lbh;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lbr;->a:Lbh;

    invoke-virtual {v1, v0}, Lbh;->a(I)I

    move-result v0

    :cond_0
    return v0
.end method

.method public final getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lbr;->a:Lbh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbr;->a:Lbh;

    iget-object v0, v0, Lbh;->a:Landroid/content/res/ColorStateList;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lbr;->a:Lbh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbr;->a:Lbh;

    iget-object v0, v0, Lbh;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final setButtonDrawable(I)V
    .locals 1

    invoke-virtual {p0}, Lbr;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbr;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lbr;->a:Lbh;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbr;->a:Lbh;

    invoke-virtual {p1}, Lbh;->a()V

    :cond_0
    return-void
.end method

.method public final setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lbr;->a:Lbh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbr;->a:Lbh;

    invoke-virtual {v0, p1}, Lbh;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public final setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lbr;->a:Lbh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbr;->a:Lbh;

    invoke-virtual {v0, p1}, Lbh;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
