.class final Lag$3$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lag$3;->b(Laj;Landroid/view/MenuItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lag$a;

.field final synthetic b:Landroid/view/MenuItem;

.field final synthetic c:Laj;

.field final synthetic d:Lag$3;


# direct methods
.method constructor <init>(Lag$3;Lag$a;Landroid/view/MenuItem;Laj;)V
    .locals 0

    iput-object p1, p0, Lag$3$1;->d:Lag$3;

    iput-object p2, p0, Lag$3$1;->a:Lag$a;

    iput-object p3, p0, Lag$3$1;->b:Landroid/view/MenuItem;

    iput-object p4, p0, Lag$3$1;->c:Laj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lag$3$1;->a:Lag$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lag$3$1;->d:Lag$3;

    iget-object v0, v0, Lag$3;->a:Lag;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lag;->f:Z

    iget-object v0, p0, Lag$3$1;->a:Lag$a;

    iget-object v0, v0, Lag$a;->b:Laj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Laj;->a(Z)V

    iget-object v0, p0, Lag$3$1;->d:Lag$3;

    iget-object v0, v0, Lag$3;->a:Lag;

    iput-boolean v1, v0, Lag;->f:Z

    :cond_0
    iget-object v0, p0, Lag$3$1;->b:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lag$3$1;->b:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lag$3$1;->c:Laj;

    iget-object v1, p0, Lag$3$1;->b:Landroid/view/MenuItem;

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-virtual {v0, v1, v2, v3}, Laj;->a(Landroid/view/MenuItem;Laq;I)Z

    :cond_1
    return-void
.end method
