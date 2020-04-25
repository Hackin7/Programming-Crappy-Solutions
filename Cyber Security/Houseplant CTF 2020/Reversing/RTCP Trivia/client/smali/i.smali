.class public Li;
.super Landroid/app/Dialog;

# interfaces
.implements Lf;


# instance fields
.field private a:Lg;

.field private final b:Lgg$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    if-nez p2, :cond_0

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lb$a;->dialogTheme:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p2, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    :cond_0
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance p1, Li$1;

    invoke-direct {p1, p0}, Li$1;-><init>(Li;)V

    iput-object p1, p0, Li;->b:Lgg$a;

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lg;->a(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object p1

    invoke-virtual {p1}, Lg;->j()Z

    return-void
.end method


# virtual methods
.method public final a()Lg;
    .locals 1

    iget-object v0, p0, Li;->a:Lg;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Lg;->a(Landroid/app/Dialog;Lf;)Lg;

    move-result-object v0

    iput-object v0, p0, Li;->a:Lg;

    :cond_0
    iget-object v0, p0, Li;->a:Lg;

    return-object v0
.end method

.method final a(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Li;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Li;->b:Lgg$a;

    invoke-static {v1, v0, p0, p1}, Lgg;->a(Lgg$a;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->a(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->g()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->i()V

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->e()V

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->b(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->a(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {p0}, Li;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Li;->a()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->a(Ljava/lang/CharSequence;)V

    return-void
.end method
