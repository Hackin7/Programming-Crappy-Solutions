.class final Lh$g;
.super Ljava/lang/Object;

# interfaces
.implements Laq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Lh;


# direct methods
.method constructor <init>(Lh;)V
    .locals 0

    iput-object p1, p0, Lh$g;->a:Lh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laj;Z)V
    .locals 4

    invoke-virtual {p1}, Laj;->l()Laj;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lh$g;->a:Lh;

    if-eqz v2, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {v3, p1}, Lh;->a(Landroid/view/Menu;)Lh$f;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    iget-object p2, p0, Lh$g;->a:Lh;

    iget v2, p1, Lh$f;->a:I

    invoke-virtual {p2, v2, p1, v0}, Lh;->a(ILh$f;Landroid/view/Menu;)V

    iget-object p2, p0, Lh$g;->a:Lh;

    invoke-virtual {p2, p1, v1}, Lh;->a(Lh$f;Z)V

    return-void

    :cond_2
    iget-object v0, p0, Lh$g;->a:Lh;

    invoke-virtual {v0, p1, p2}, Lh;->a(Lh$f;Z)V

    :cond_3
    return-void
.end method

.method public final a(Laj;)Z
    .locals 2

    if-nez p1, :cond_0

    iget-object v0, p0, Lh$g;->a:Lh;

    iget-boolean v0, v0, Lh;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh$g;->a:Lh;

    iget-object v0, v0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lh$g;->a:Lh;

    iget-boolean v1, v1, Lh;->u:Z

    if-nez v1, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
