.class final Lh$6$1;
.super Lgv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh$6;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh$6;


# direct methods
.method constructor <init>(Lh$6;)V
    .locals 0

    iput-object p1, p0, Lh$6$1;->a:Lh$6;

    invoke-direct {p0}, Lgv;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lh$6$1;->a:Lh$6;

    iget-object p1, p1, Lh$6;->a:Lh;

    iget-object p1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lh$6$1;->a:Lh$6;

    iget-object p1, p1, Lh$6;->a:Lh;

    iget-object p1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setAlpha(F)V

    iget-object p1, p0, Lh$6$1;->a:Lh$6;

    iget-object p1, p1, Lh$6;->a:Lh;

    iget-object p1, p1, Lh;->m:Lgt;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lgt;->a(Lgu;)Lgt;

    iget-object p1, p0, Lh$6$1;->a:Lh$6;

    iget-object p1, p1, Lh$6;->a:Lh;

    iput-object v0, p1, Lh;->m:Lgt;

    return-void
.end method
