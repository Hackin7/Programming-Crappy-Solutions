.class public final Lx;
.super Lu;

# interfaces
.implements Laj$a;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroidx/appcompat/widget/ActionBarContextView;

.field private e:Lu$a;

.field private f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Z

.field private i:Laj;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lu$a;Z)V
    .locals 0

    invoke-direct {p0}, Lu;-><init>()V

    iput-object p1, p0, Lx;->a:Landroid/content/Context;

    iput-object p2, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    iput-object p3, p0, Lx;->e:Lu$a;

    new-instance p1, Laj;

    invoke-virtual {p2}, Landroidx/appcompat/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Laj;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    iput p2, p1, Laj;->e:I

    iput-object p1, p0, Lx;->i:Laj;

    iget-object p1, p0, Lx;->i:Laj;

    invoke-virtual {p1, p0}, Laj;->a(Laj$a;)V

    iput-boolean p4, p0, Lx;->h:Z

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, Lz;

    iget-object v1, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lz;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lx;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final a(Laj;)V
    .locals 0

    invoke-virtual {p0}, Lx;->d()V

    iget-object p1, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->a()Z

    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lx;->f:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    invoke-super {p0, p1}, Lu;->a(Z)V

    iget-object v0, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method

.method public final a(Laj;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Lx;->e:Lu$a;

    invoke-interface {p1, p0, p2}, Lu$a;->a(Lu;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final b()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Lx;->i:Laj;

    return-object v0
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Lx;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final b(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Lx;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lx;->g:Z

    iget-object v0, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->sendAccessibilityEvent(I)V

    iget-object v0, p0, Lx;->e:Lu$a;

    invoke-interface {v0, p0}, Lu$a;->a(Lu;)V

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lx;->e:Lu$a;

    iget-object v1, p0, Lx;->i:Laj;

    invoke-interface {v0, p0, v1}, Lu$a;->b(Lu;Landroid/view/Menu;)Z

    return-void
.end method

.method public final f()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lx;->b:Landroidx/appcompat/widget/ActionBarContextView;

    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContextView;->h:Z

    return v0
.end method

.method public final i()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lx;->f:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
