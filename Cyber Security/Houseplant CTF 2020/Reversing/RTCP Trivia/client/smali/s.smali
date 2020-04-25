.class Ls;
.super Lq;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls$a;
    }
.end annotation


# instance fields
.field private c:Ls$a;

.field private d:Z


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Ls;-><init>(Ls$a;Landroid/content/res/Resources;)V

    return-void
.end method

.method constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lq;-><init>()V

    return-void
.end method

.method constructor <init>(Ls$a;Landroid/content/res/Resources;)V
    .locals 1

    invoke-direct {p0}, Lq;-><init>()V

    new-instance v0, Ls$a;

    invoke-direct {v0, p1, p0, p2}, Ls$a;-><init>(Ls$a;Ls;Landroid/content/res/Resources;)V

    invoke-virtual {p0, v0}, Ls;->a(Lq$b;)V

    invoke-virtual {p0}, Ls;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Ls;->onStateChange([I)Z

    return-void
.end method


# virtual methods
.method a()Ls$a;
    .locals 3

    new-instance v0, Ls$a;

    iget-object v1, p0, Ls;->c:Ls$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Ls$a;-><init>(Ls$a;Ls;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method protected a(Lq$b;)V
    .locals 1

    invoke-super {p0, p1}, Lq;->a(Lq$b;)V

    instance-of v0, p1, Ls$a;

    if-eqz v0, :cond_0

    check-cast p1, Ls$a;

    iput-object p1, p0, Ls;->c:Ls$a;

    :cond_0
    return-void
.end method

.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 0

    invoke-super {p0, p1}, Lq;->applyTheme(Landroid/content/res/Resources$Theme;)V

    invoke-virtual {p0}, Ls;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Ls;->onStateChange([I)Z

    return-void
.end method

.method synthetic b()Lq$b;
    .locals 1

    invoke-virtual {p0}, Ls;->a()Ls$a;

    move-result-object v0

    return-object v0
.end method

.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-boolean v0, p0, Ls;->d:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lq;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_0

    iget-object v0, p0, Ls;->c:Ls$a;

    invoke-virtual {v0}, Ls$a;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls;->d:Z

    :cond_0
    return-object p0
.end method

.method protected onStateChange([I)Z
    .locals 2

    invoke-super {p0, p1}, Lq;->onStateChange([I)Z

    move-result v0

    iget-object v1, p0, Ls;->c:Ls$a;

    invoke-virtual {v1, p1}, Ls$a;->b([I)I

    move-result p1

    if-gez p1, :cond_0

    iget-object p1, p0, Ls;->c:Ls$a;

    sget-object v1, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {p1, v1}, Ls$a;->b([I)I

    move-result p1

    :cond_0
    invoke-virtual {p0, p1}, Ls;->a(I)Z

    move-result p1

    if-nez p1, :cond_2

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
