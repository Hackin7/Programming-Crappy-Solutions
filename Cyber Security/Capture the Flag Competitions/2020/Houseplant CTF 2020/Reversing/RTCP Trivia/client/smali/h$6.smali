.class final Lh$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh;


# direct methods
.method constructor <init>(Lh;)V
    .locals 0

    iput-object p1, p0, Lh$6;->a:Lh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lh$6;->a:Lh;

    iget-object v0, v0, Lh;->k:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lh$6;->a:Lh;

    iget-object v1, v1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    const/16 v3, 0x37

    invoke-virtual {v0, v1, v3, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Lh$6;->a:Lh;

    invoke-virtual {v0}, Lh;->m()V

    iget-object v0, p0, Lh$6;->a:Lh;

    invoke-virtual {v0}, Lh;->l()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh$6;->a:Lh;

    iget-object v0, v0, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setAlpha(F)V

    iget-object v0, p0, Lh$6;->a:Lh;

    iget-object v2, p0, Lh$6;->a:Lh;

    iget-object v2, v2, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Lgq;->d(Landroid/view/View;)Lgt;

    move-result-object v2

    invoke-virtual {v2, v1}, Lgt;->a(F)Lgt;

    move-result-object v1

    iput-object v1, v0, Lh;->m:Lgt;

    iget-object v0, p0, Lh$6;->a:Lh;

    iget-object v0, v0, Lh;->m:Lgt;

    new-instance v1, Lh$6$1;

    invoke-direct {v1, p0}, Lh$6$1;-><init>(Lh$6;)V

    invoke-virtual {v0, v1}, Lgt;->a(Lgu;)Lgt;

    return-void

    :cond_0
    iget-object v0, p0, Lh$6;->a:Lh;

    iget-object v0, v0, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setAlpha(F)V

    iget-object v0, p0, Lh$6;->a:Lh;

    iget-object v0, v0, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method
