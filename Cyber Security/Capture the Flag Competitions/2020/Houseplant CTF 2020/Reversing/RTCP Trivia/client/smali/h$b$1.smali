.class final Lh$b$1;
.super Lgv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh$b;->a(Lu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh$b;


# direct methods
.method constructor <init>(Lh$b;)V
    .locals 0

    iput-object p1, p0, Lh$b$1;->a:Lh$b;

    invoke-direct {p0}, Lgv;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lh$b$1;->a:Lh$b;

    iget-object p1, p1, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lh$b$1;->a:Lh$b;

    iget-object p1, p1, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->k:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh$b$1;->a:Lh$b;

    iget-object p1, p1, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->k:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lh$b$1;->a:Lh$b;

    iget-object p1, p1, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh$b$1;->a:Lh$b;

    iget-object p1, p1, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lgq;->g(Landroid/view/View;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lh$b$1;->a:Lh$b;

    iget-object p1, p1, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->removeAllViews()V

    iget-object p1, p0, Lh$b$1;->a:Lh$b;

    iget-object p1, p1, Lh$b;->a:Lh;

    iget-object p1, p1, Lh;->m:Lgt;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgt;->a(Lgu;)Lgt;

    iget-object p1, p0, Lh$b$1;->a:Lh$b;

    iget-object p1, p1, Lh$b;->a:Lh;

    iput-object v0, p1, Lh;->m:Lgt;

    return-void
.end method
