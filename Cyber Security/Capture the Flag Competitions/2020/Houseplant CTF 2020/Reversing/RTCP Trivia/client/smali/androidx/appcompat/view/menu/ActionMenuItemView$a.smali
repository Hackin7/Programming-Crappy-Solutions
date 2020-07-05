.class final Landroidx/appcompat/view/menu/ActionMenuItemView$a;
.super Lce;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/ActionMenuItemView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/view/menu/ActionMenuItemView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$a;->a:Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-direct {p0, p1}, Lce;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()Lau;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$a;->a:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->c:Landroidx/appcompat/view/menu/ActionMenuItemView$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$a;->a:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->c:Landroidx/appcompat/view/menu/ActionMenuItemView$b;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ActionMenuItemView$b;->a()Lau;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected final b()Z
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$a;->a:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->b:Laj$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$a;->a:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->b:Laj$b;

    iget-object v2, p0, Landroidx/appcompat/view/menu/ActionMenuItemView$a;->a:Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v2, v2, Landroidx/appcompat/view/menu/ActionMenuItemView;->a:Lal;

    invoke-interface {v0, v2}, Laj$b;->a(Lal;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ActionMenuItemView$a;->a()Lau;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lau;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method
