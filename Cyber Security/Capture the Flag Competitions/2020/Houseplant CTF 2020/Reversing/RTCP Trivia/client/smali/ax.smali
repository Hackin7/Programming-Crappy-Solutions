.class final Lax;
.super Lat;

# interfaces
.implements Landroid/view/SubMenu;


# direct methods
.method constructor <init>(Landroid/content/Context;Lfu;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lat;-><init>(Landroid/content/Context;Lfs;)V

    return-void
.end method


# virtual methods
.method public final clearHeader()V
    .locals 1

    iget-object v0, p0, Lax;->d:Ljava/lang/Object;

    check-cast v0, Lfu;

    invoke-interface {v0}, Lfu;->clearHeader()V

    return-void
.end method

.method public final getItem()Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lax;->d:Ljava/lang/Object;

    check-cast v0, Lfu;

    invoke-interface {v0}, Lfu;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Lax;->a(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public final setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lax;->d:Ljava/lang/Object;

    check-cast v0, Lfu;

    invoke-interface {v0, p1}, Lfu;->setHeaderIcon(I)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lax;->d:Ljava/lang/Object;

    check-cast v0, Lfu;

    invoke-interface {v0, p1}, Lfu;->setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lax;->d:Ljava/lang/Object;

    check-cast v0, Lfu;

    invoke-interface {v0, p1}, Lfu;->setHeaderTitle(I)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lax;->d:Ljava/lang/Object;

    check-cast v0, Lfu;

    invoke-interface {v0, p1}, Lfu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lax;->d:Ljava/lang/Object;

    check-cast v0, Lfu;

    invoke-interface {v0, p1}, Lfu;->setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setIcon(I)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lax;->d:Ljava/lang/Object;

    check-cast v0, Lfu;

    invoke-interface {v0, p1}, Lfu;->setIcon(I)Landroid/view/SubMenu;

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lax;->d:Ljava/lang/Object;

    check-cast v0, Lfu;

    invoke-interface {v0, p1}, Lfu;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;

    return-object p0
.end method
