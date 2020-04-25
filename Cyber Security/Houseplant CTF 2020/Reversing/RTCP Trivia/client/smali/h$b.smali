.class final Lh$b;
.super Ljava/lang/Object;

# interfaces
.implements Lu$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lh;

.field private b:Lu$a;


# direct methods
.method public constructor <init>(Lh;Lu$a;)V
    .locals 0

    iput-object p1, p0, Lh$b;->a:Lh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh$b;->b:Lu$a;

    return-void
.end method


# virtual methods
.method public final a(Lu;)V
    .locals 2

    iget-object v0, p0, Lh$b;->b:Lu$a;

    invoke-interface {v0, p1}, Lu$a;->a(Lu;)V

    iget-object p1, p0, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->k:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->c:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lh$b;->a:Lh;

    iget-object v0, v0, Lh;->l:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh$b;->a:Lh;

    invoke-virtual {p1}, Lh;->m()V

    iget-object p1, p0, Lh$b;->a:Lh;

    iget-object v0, p0, Lh$b;->a:Lh;

    iget-object v0, v0, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Lgq;->d(Landroid/view/View;)Lgt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lgt;->a(F)Lgt;

    move-result-object v0

    iput-object v0, p1, Lh;->m:Lgt;

    iget-object p1, p0, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->m:Lgt;

    new-instance v0, Lh$b$1;

    invoke-direct {v0, p0}, Lh$b$1;-><init>(Lh$b;)V

    invoke-virtual {p1, v0}, Lgt;->a(Lgu;)Lgt;

    :cond_1
    iget-object p1, p0, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->f:Lf;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->f:Lf;

    iget-object p1, p0, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->i:Lu;

    :cond_2
    iget-object p1, p0, Lh$b;->a:Lh;

    const/4 v0, 0x0

    iput-object v0, p1, Lh;->i:Lu;

    return-void
.end method

.method public final a(Lu;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lh$b;->b:Lu$a;

    invoke-interface {v0, p1, p2}, Lu$a;->a(Lu;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final a(Lu;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lh$b;->b:Lu$a;

    invoke-interface {v0, p1, p2}, Lu$a;->a(Lu;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final b(Lu;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lh$b;->b:Lu$a;

    invoke-interface {v0, p1, p2}, Lu$a;->b(Lu;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
