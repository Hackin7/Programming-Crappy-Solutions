.class final Lba$a;
.super Lap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lba;


# direct methods
.method public constructor <init>(Lba;Landroid/content/Context;Law;Landroid/view/View;)V
    .locals 6

    iput-object p1, p0, Lba$a;->d:Lba;

    sget v5, Lb$a;->actionOverflowMenuStyle:I

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Lap;-><init>(Landroid/content/Context;Laj;Landroid/view/View;ZI)V

    invoke-virtual {p3}, Law;->getItem()Landroid/view/MenuItem;

    move-result-object p2

    check-cast p2, Lal;

    invoke-virtual {p2}, Lal;->f()Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p1, Lba;->i:Lba$d;

    if-nez p2, :cond_0

    invoke-static {p1}, Lba;->c(Lba;)Lar;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    goto :goto_0

    :cond_0
    iget-object p2, p1, Lba;->i:Lba$d;

    :goto_0
    iput-object p2, p0, Lap;->a:Landroid/view/View;

    :cond_1
    iget-object p1, p1, Lba;->p:Lba$f;

    invoke-virtual {p0, p1}, Lba$a;->a(Laq$a;)V

    return-void
.end method


# virtual methods
.method protected final d()V
    .locals 2

    iget-object v0, p0, Lba$a;->d:Lba;

    const/4 v1, 0x0

    iput-object v1, v0, Lba;->n:Lba$a;

    iget-object v0, p0, Lba$a;->d:Lba;

    const/4 v1, 0x0

    iput v1, v0, Lba;->q:I

    invoke-super {p0}, Lap;->d()V

    return-void
.end method
