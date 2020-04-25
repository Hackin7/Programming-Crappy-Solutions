.class public final Ln$a;
.super Lu;

# interfaces
.implements Laj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final a:Laj;

.field final synthetic b:Ln;

.field private final e:Landroid/content/Context;

.field private f:Lu$a;

.field private g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln;Landroid/content/Context;Lu$a;)V
    .locals 0

    iput-object p1, p0, Ln$a;->b:Ln;

    invoke-direct {p0}, Lu;-><init>()V

    iput-object p2, p0, Ln$a;->e:Landroid/content/Context;

    iput-object p3, p0, Ln$a;->f:Lu$a;

    new-instance p1, Laj;

    invoke-direct {p1, p2}, Laj;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    iput p2, p1, Laj;->e:I

    iput-object p1, p0, Ln$a;->a:Laj;

    iget-object p1, p0, Ln$a;->a:Laj;

    invoke-virtual {p1, p0}, Laj;->a(Laj$a;)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, Lz;

    iget-object v1, p0, Ln$a;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lz;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ln$a;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final a(Laj;)V
    .locals 0

    iget-object p1, p0, Ln$a;->f:Lu$a;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ln$a;->d()V

    iget-object p1, p0, Ln$a;->b:Ln;

    iget-object p1, p1, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->a()Z

    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ln$a;->g:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    invoke-super {p0, p1}, Lu;->a(Z)V

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method

.method public final a(Laj;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Ln$a;->f:Lu$a;

    if-eqz p1, :cond_0

    iget-object p1, p0, Ln$a;->f:Lu$a;

    invoke-interface {p1, p0, p2}, Lu$a;->a(Lu;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Ln$a;->a:Laj;

    return-object v0
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ln$a;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final b(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->h:Ln$a;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ln$a;->b:Ln;

    iget-boolean v0, v0, Ln;->l:Z

    iget-object v1, p0, Ln$a;->b:Ln;

    iget-boolean v1, v1, Ln;->m:Z

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ln;->a(ZZZ)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln$a;->b:Ln;

    iput-object p0, v0, Ln;->i:Lu;

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v1, p0, Ln$a;->f:Lu$a;

    iput-object v1, v0, Ln;->j:Lu$a;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ln$a;->f:Lu$a;

    invoke-interface {v0, p0}, Lu$a;->a(Lu;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Ln$a;->f:Lu$a;

    iget-object v1, p0, Ln$a;->b:Ln;

    invoke-virtual {v1, v2}, Ln;->e(Z)V

    iget-object v1, p0, Ln$a;->b:Ln;

    iget-object v1, v1, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v2, v1, Landroidx/appcompat/widget/ActionBarContextView;->g:Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->b()V

    :cond_2
    iget-object v1, p0, Ln$a;->b:Ln;

    iget-object v1, v1, Ln;->d:Lca;

    invoke-interface {v1}, Lca;->a()Landroid/view/ViewGroup;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object v1, p0, Ln$a;->b:Ln;

    iget-object v1, v1, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-object v2, p0, Ln$a;->b:Ln;

    iget-boolean v2, v2, Ln;->o:Z

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v1, p0, Ln$a;->b:Ln;

    iput-object v0, v1, Ln;->h:Ln$a;

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->h:Ln$a;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ln$a;->a:Laj;

    invoke-virtual {v0}, Laj;->e()V

    :try_start_0
    iget-object v0, p0, Ln$a;->f:Lu$a;

    iget-object v1, p0, Ln$a;->a:Laj;

    invoke-interface {v0, p0, v1}, Lu$a;->b(Lu;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ln$a;->a:Laj;

    invoke-virtual {v0}, Laj;->f()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ln$a;->a:Laj;

    invoke-virtual {v1}, Laj;->f()V

    throw v0
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, Ln$a;->a:Laj;

    invoke-virtual {v0}, Laj;->e()V

    :try_start_0
    iget-object v0, p0, Ln$a;->f:Lu$a;

    iget-object v1, p0, Ln$a;->a:Laj;

    invoke-interface {v0, p0, v1}, Lu$a;->a(Lu;Landroid/view/Menu;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ln$a;->a:Laj;

    invoke-virtual {v1}, Laj;->f()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ln$a;->a:Laj;

    invoke-virtual {v1}, Laj;->f()V

    throw v0
.end method

.method public final f()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Ln$a;->b:Ln;

    iget-object v0, v0, Ln;->e:Landroidx/appcompat/widget/ActionBarContextView;

    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContextView;->h:Z

    return v0
.end method

.method public final i()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Ln$a;->g:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln$a;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
