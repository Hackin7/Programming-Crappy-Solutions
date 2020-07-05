.class final Lhp$2;
.super Lhr;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhp;->L()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhp;


# direct methods
.method constructor <init>(Lhp;)V
    .locals 0

    iput-object p1, p0, Lhp$2;->a:Lhp;

    invoke-direct {p0}, Lhr;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lhp$2;->a:Lhp;

    iget-object v0, v0, Lhp;->J:Landroid/view/View;

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment does not have a view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lhp$2;->a:Lhp;

    iget-object v0, v0, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lhp;
    .locals 1

    iget-object v0, p0, Lhp$2;->a:Lhp;

    iget-object v0, v0, Lhp;->t:Lht;

    invoke-virtual {v0, p1, p2, p3}, Lht;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lhp;

    move-result-object p1

    return-object p1
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Lhp$2;->a:Lhp;

    iget-object v0, v0, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
