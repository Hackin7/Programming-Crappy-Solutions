.class final Ln$1;
.super Lgv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln;


# direct methods
.method constructor <init>(Ln;)V
    .locals 0

    iput-object p1, p0, Ln$1;->a:Ln;

    invoke-direct {p0}, Lgv;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Ln$1;->a:Ln;

    iget-boolean p1, p1, Ln;->k:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ln$1;->a:Ln;

    iget-object p1, p1, Ln;->f:Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Ln$1;->a:Ln;

    iget-object p1, p1, Ln;->f:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Ln$1;->a:Ln;

    iget-object p1, p1, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Ln$1;->a:Ln;

    iget-object p1, p1, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Ln$1;->a:Ln;

    iget-object p1, p1, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Ln$1;->a:Ln;

    const/4 v0, 0x0

    iput-object v0, p1, Ln;->n:Laa;

    iget-object p1, p0, Ln$1;->a:Ln;

    iget-object v1, p1, Ln;->j:Lu$a;

    if-eqz v1, :cond_1

    iget-object v1, p1, Ln;->j:Lu$a;

    iget-object v2, p1, Ln;->i:Lu;

    invoke-interface {v1, v2}, Lu$a;->a(Lu;)V

    iput-object v0, p1, Ln;->i:Lu;

    iput-object v0, p1, Ln;->j:Lu$a;

    :cond_1
    iget-object p1, p0, Ln$1;->a:Ln;

    iget-object p1, p1, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_2

    iget-object p1, p0, Ln$1;->a:Ln;

    iget-object p1, p1, Ln;->b:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-static {p1}, Lgq;->g(Landroid/view/View;)V

    :cond_2
    return-void
.end method
