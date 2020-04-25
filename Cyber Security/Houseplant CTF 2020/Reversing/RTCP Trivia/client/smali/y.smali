.class public final Ly;
.super Landroid/view/ActionMode;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly$a;
    }
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lu;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, Ly;->a:Landroid/content/Context;

    iput-object p2, p0, Ly;->b:Lu;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0}, Lu;->c()V

    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0}, Lu;->i()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 2

    iget-object v0, p0, Ly;->a:Landroid/content/Context;

    iget-object v1, p0, Ly;->b:Lu;

    invoke-virtual {v1}, Lu;->b()Landroid/view/Menu;

    move-result-object v1

    check-cast v1, Lfs;

    invoke-static {v0, v1}, Las;->a(Landroid/content/Context;Lfs;)Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0}, Lu;->a()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0}, Lu;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    iget-object v0, v0, Lu;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0}, Lu;->f()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    iget-boolean v0, v0, Lu;->d:Z

    return v0
.end method

.method public final invalidate()V
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0}, Lu;->d()V

    return-void
.end method

.method public final isTitleOptional()Z
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0}, Lu;->h()Z

    move-result v0

    return v0
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0, p1}, Lu;->a(Landroid/view/View;)V

    return-void
.end method

.method public final setSubtitle(I)V
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0, p1}, Lu;->b(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0, p1}, Lu;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    iput-object p1, v0, Lu;->c:Ljava/lang/Object;

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0, p1}, Lu;->a(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0, p1}, Lu;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, Ly;->b:Lu;

    invoke-virtual {v0, p1}, Lu;->a(Z)V

    return-void
.end method
