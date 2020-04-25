.class final Lcs$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcs;-><init>(Landroidx/appcompat/widget/Toolbar;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final a:Lac;

.field final synthetic b:Lcs;


# direct methods
.method constructor <init>(Lcs;)V
    .locals 2

    iput-object p1, p0, Lcs$1;->b:Lcs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lac;

    iget-object v0, p0, Lcs$1;->b:Lcs;

    iget-object v0, v0, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcs$1;->b:Lcs;

    iget-object v1, v1, Lcs;->b:Ljava/lang/CharSequence;

    invoke-direct {p1, v0, v1}, Lac;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    iput-object p1, p0, Lcs$1;->a:Lac;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcs$1;->b:Lcs;

    iget-object p1, p1, Lcs;->c:Landroid/view/Window$Callback;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcs$1;->b:Lcs;

    iget-boolean p1, p1, Lcs;->d:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcs$1;->b:Lcs;

    iget-object p1, p1, Lcs;->c:Landroid/view/Window$Callback;

    const/4 v0, 0x0

    iget-object v1, p0, Lcs$1;->a:Lac;

    invoke-interface {p1, v0, v1}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    :cond_0
    return-void
.end method
