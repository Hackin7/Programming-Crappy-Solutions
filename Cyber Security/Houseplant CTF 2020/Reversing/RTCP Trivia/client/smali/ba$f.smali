.class final Lba$f;
.super Ljava/lang/Object;

# interfaces
.implements Laq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lba;


# direct methods
.method constructor <init>(Lba;)V
    .locals 0

    iput-object p1, p0, Lba$f;->a:Lba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laj;Z)V
    .locals 2

    instance-of v0, p1, Law;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Laj;->l()Laj;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Laj;->a(Z)V

    :cond_0
    iget-object v0, p0, Lba$f;->a:Lba;

    iget-object v0, v0, Lad;->f:Laq$a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Laq$a;->a(Laj;Z)V

    :cond_1
    return-void
.end method

.method public final a(Laj;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lba$f;->a:Lba;

    move-object v2, p1

    check-cast v2, Law;

    invoke-virtual {v2}, Law;->getItem()Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    iput v2, v1, Lba;->q:I

    iget-object v1, p0, Lba$f;->a:Lba;

    iget-object v1, v1, Lad;->f:Laq$a;

    if-eqz v1, :cond_1

    invoke-interface {v1, p1}, Laq$a;->a(Laj;)Z

    move-result p1

    return p1

    :cond_1
    return v0
.end method
