.class final Lh$a;
.super Ljava/lang/Object;

# interfaces
.implements Laq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lh;


# direct methods
.method constructor <init>(Lh;)V
    .locals 0

    iput-object p1, p0, Lh$a;->a:Lh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laj;Z)V
    .locals 0

    iget-object p2, p0, Lh$a;->a:Lh;

    invoke-virtual {p2, p1}, Lh;->b(Laj;)V

    return-void
.end method

.method public final a(Laj;)Z
    .locals 2

    iget-object v0, p0, Lh$a;->a:Lh;

    iget-object v0, v0, Lh;->c:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
