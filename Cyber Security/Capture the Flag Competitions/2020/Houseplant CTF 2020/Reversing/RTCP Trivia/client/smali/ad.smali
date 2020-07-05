.class public abstract Lad;
.super Ljava/lang/Object;

# interfaces
.implements Laq;


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Landroid/content/Context;

.field protected c:Laj;

.field protected d:Landroid/view/LayoutInflater;

.field protected e:Landroid/view/LayoutInflater;

.field public f:Laq$a;

.field protected g:Lar;

.field public h:I

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lad;->a:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lad;->d:Landroid/view/LayoutInflater;

    iput p2, p0, Lad;->i:I

    iput p3, p0, Lad;->j:I

    return-void
.end method


# virtual methods
.method public a(Lal;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    instance-of v0, p2, Lar$a;

    if-eqz v0, :cond_0

    :goto_0
    check-cast p2, Lar$a;

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lad;->d:Landroid/view/LayoutInflater;

    iget v0, p0, Lad;->j:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    :goto_1
    invoke-virtual {p0, p1, p2}, Lad;->a(Lal;Lar$a;)V

    check-cast p2, Landroid/view/View;

    return-object p2
.end method

.method public a(Landroid/view/ViewGroup;)Lar;
    .locals 3

    iget-object v0, p0, Lad;->g:Lar;

    if-nez v0, :cond_0

    iget-object v0, p0, Lad;->d:Landroid/view/LayoutInflater;

    iget v1, p0, Lad;->i:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lar;

    iput-object p1, p0, Lad;->g:Lar;

    iget-object p1, p0, Lad;->g:Lar;

    iget-object v0, p0, Lad;->c:Laj;

    invoke-interface {p1, v0}, Lar;->a(Laj;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lad;->a(Z)V

    :cond_0
    iget-object p1, p0, Lad;->g:Lar;

    return-object p1
.end method

.method public a(Laj;Z)V
    .locals 1

    iget-object v0, p0, Lad;->f:Laq$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lad;->f:Laq$a;

    invoke-interface {v0, p1, p2}, Laq$a;->a(Laj;Z)V

    :cond_0
    return-void
.end method

.method public abstract a(Lal;Lar$a;)V
.end method

.method public a(Landroid/content/Context;Laj;)V
    .locals 0

    iput-object p1, p0, Lad;->b:Landroid/content/Context;

    iget-object p1, p0, Lad;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lad;->e:Landroid/view/LayoutInflater;

    iput-object p2, p0, Lad;->c:Laj;

    return-void
.end method

.method public final a(Laq$a;)V
    .locals 0

    iput-object p1, p0, Lad;->f:Laq$a;

    return-void
.end method

.method public a(Z)V
    .locals 9

    iget-object p1, p0, Lad;->g:Lar;

    check-cast p1, Landroid/view/ViewGroup;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lad;->c:Laj;

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lad;->c:Laj;

    invoke-virtual {v0}, Laj;->j()V

    iget-object v0, p0, Lad;->c:Laj;

    invoke-virtual {v0}, Laj;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v1

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_6

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lal;

    invoke-virtual {p0, v5}, Lad;->a(Lal;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    instance-of v7, v6, Lar$a;

    if-eqz v7, :cond_1

    move-object v7, v6

    check-cast v7, Lar$a;

    invoke-interface {v7}, Lar$a;->getItemData()Lal;

    move-result-object v7

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    invoke-virtual {p0, v5, v6, p1}, Lad;->a(Lal;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    if-eq v5, v7, :cond_2

    invoke-virtual {v8, v1}, Landroid/view/View;->setPressed(Z)V

    invoke-virtual {v8}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    :cond_2
    if-eq v8, v6, :cond_4

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    if-eqz v5, :cond_3

    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    iget-object v5, p0, Lad;->g:Lar;

    check-cast v5, Landroid/view/ViewGroup;

    invoke-virtual {v5, v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_4
    add-int/lit8 v4, v4, 0x1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    move v1, v4

    :cond_7
    :goto_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_8

    invoke-virtual {p0, p1, v1}, Lad;->a(Landroid/view/ViewGroup;I)Z

    move-result v0

    if-nez v0, :cond_7

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    return-void
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(Lal;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public a(Landroid/view/ViewGroup;I)Z
    .locals 0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public a(Law;)Z
    .locals 1

    iget-object v0, p0, Lad;->f:Laq$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lad;->f:Laq$a;

    invoke-interface {v0, p1}, Laq$a;->a(Laj;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lal;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lal;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
