.class Lam$a;
.super Lge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lam;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final a:Landroid/view/ActionProvider;

.field final synthetic b:Lam;


# direct methods
.method public constructor <init>(Lam;Landroid/content/Context;Landroid/view/ActionProvider;)V
    .locals 0

    iput-object p1, p0, Lam$a;->b:Lam;

    invoke-direct {p0, p2}, Lge;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lam$a;->a:Landroid/view/ActionProvider;

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lam$a;->a:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onCreateActionView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/view/SubMenu;)V
    .locals 2

    iget-object v0, p0, Lam$a;->a:Landroid/view/ActionProvider;

    iget-object v1, p0, Lam$a;->b:Lam;

    invoke-virtual {v1, p1}, Lam;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lam$a;->a:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->onPerformDefaultAction()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lam$a;->a:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->hasSubMenu()Z

    move-result v0

    return v0
.end method
