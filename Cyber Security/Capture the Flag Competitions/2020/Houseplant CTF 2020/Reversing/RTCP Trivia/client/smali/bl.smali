.class public final Lbl;
.super Landroid/widget/ImageButton;

# interfaces
.implements Lgp;
.implements Lhi;


# instance fields
.field private final a:Lbd;

.field private final b:Lbm;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lb$a;->imageButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lbl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Lco;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lbd;

    invoke-direct {p1, p0}, Lbd;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lbl;->a:Lbd;

    iget-object p1, p0, Lbl;->a:Lbd;

    invoke-virtual {p1, p2, p3}, Lbd;->a(Landroid/util/AttributeSet;I)V

    new-instance p1, Lbm;

    invoke-direct {p1, p0}, Lbm;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, Lbl;->b:Lbm;

    iget-object p1, p0, Lbl;->b:Lbm;

    invoke-virtual {p1, p2, p3}, Lbm;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/ImageButton;->drawableStateChanged()V

    iget-object v0, p0, Lbl;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->a:Lbd;

    invoke-virtual {v0}, Lbd;->d()V

    :cond_0
    iget-object v0, p0, Lbl;->b:Lbm;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbl;->b:Lbm;

    invoke-virtual {v0}, Lbm;->d()V

    :cond_1
    return-void
.end method

.method public final getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lbl;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->a:Lbd;

    invoke-virtual {v0}, Lbd;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lbl;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->a:Lbd;

    invoke-virtual {v0}, Lbd;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lbl;->b:Lbm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->b:Lbm;

    invoke-virtual {v0}, Lbm;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lbl;->b:Lbm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->b:Lbm;

    invoke-virtual {v0}, Lbm;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hasOverlappingRendering()Z
    .locals 1

    iget-object v0, p0, Lbl;->b:Lbm;

    invoke-virtual {v0}, Lbm;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/ImageButton;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lbl;->a:Lbd;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbl;->a:Lbd;

    invoke-virtual {p1}, Lbd;->a()V

    :cond_0
    return-void
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    iget-object v0, p0, Lbl;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->a:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(I)V

    :cond_0
    return-void
.end method

.method public final setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lbl;->b:Lbm;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbl;->b:Lbm;

    invoke-virtual {p1}, Lbm;->d()V

    :cond_0
    return-void
.end method

.method public final setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lbl;->b:Lbm;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbl;->b:Lbm;

    invoke-virtual {p1}, Lbm;->d()V

    :cond_0
    return-void
.end method

.method public final setImageResource(I)V
    .locals 1

    iget-object v0, p0, Lbl;->b:Lbm;

    invoke-virtual {v0, p1}, Lbm;->a(I)V

    return-void
.end method

.method public final setImageURI(Landroid/net/Uri;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, Lbl;->b:Lbm;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbl;->b:Lbm;

    invoke-virtual {p1}, Lbm;->d()V

    :cond_0
    return-void
.end method

.method public final setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lbl;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->a:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public final setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lbl;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->a:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public final setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lbl;->b:Lbm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->b:Lbm;

    invoke-virtual {v0, p1}, Lbm;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public final setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lbl;->b:Lbm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbl;->b:Lbm;

    invoke-virtual {v0, p1}, Lbm;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
