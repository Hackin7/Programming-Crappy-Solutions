.class public Lam;
.super Lae;

# interfaces
.implements Landroid/view/MenuItem;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lam$b;,
        Lam$a;,
        Lam$c;,
        Lam$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lae<",
        "Lft;",
        ">;",
        "Landroid/view/MenuItem;"
    }
.end annotation


# instance fields
.field public e:Ljava/lang/reflect/Method;


# direct methods
.method constructor <init>(Landroid/content/Context;Lft;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lae;-><init>(Landroid/content/Context;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method a(Landroid/view/ActionProvider;)Lam$a;
    .locals 2

    new-instance v0, Lam$a;

    iget-object v1, p0, Lam;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1, p1}, Lam$a;-><init>(Lam;Landroid/content/Context;Landroid/view/ActionProvider;)V

    return-object v0
.end method

.method public collapseActionView()Z
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->collapseActionView()Z

    move-result v0

    return v0
.end method

.method public expandActionView()Z
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->expandActionView()Z

    move-result v0

    return v0
.end method

.method public getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->a()Lge;

    move-result-object v0

    instance-of v1, v0, Lam$a;

    if-eqz v1, :cond_0

    check-cast v0, Lam$a;

    iget-object v0, v0, Lam$a;->a:Landroid/view/ActionProvider;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getActionView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getActionView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lam$b;

    if-eqz v1, :cond_0

    check-cast v0, Lam$b;

    iget-object v0, v0, Lam$b;->a:Landroid/view/CollapsibleActionView;

    check-cast v0, Landroid/view/View;

    :cond_0
    return-object v0
.end method

.method public getAlphabeticModifiers()I
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getAlphabeticModifiers()I

    move-result v0

    return v0
.end method

.method public getAlphabeticShortcut()C
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getAlphabeticShortcut()C

    move-result v0

    return v0
.end method

.method public getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getGroupId()I
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getGroupId()I

    move-result v0

    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getIconTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getIconTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getItemId()I
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getItemId()I

    move-result v0

    return v0
.end method

.method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;

    move-result-object v0

    return-object v0
.end method

.method public getNumericModifiers()I
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getNumericModifiers()I

    move-result v0

    return v0
.end method

.method public getNumericShortcut()C
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getNumericShortcut()C

    move-result v0

    return v0
.end method

.method public getOrder()I
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getOrder()I

    move-result v0

    return v0
.end method

.method public getSubMenu()Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-virtual {p0, v0}, Lam;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTooltipText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->getTooltipText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public hasSubMenu()Z
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->hasSubMenu()Z

    move-result v0

    return v0
.end method

.method public isActionViewExpanded()Z
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->isActionViewExpanded()Z

    move-result v0

    return v0
.end method

.method public isCheckable()Z
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->isCheckable()Z

    move-result v0

    return v0
.end method

.method public isChecked()Z
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->isChecked()Z

    move-result v0

    return v0
.end method

.method public isEnabled()Z
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public isVisible()Z
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0}, Lft;->isVisible()Z

    move-result v0

    return v0
.end method

.method public setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lam;->a(Landroid/view/ActionProvider;)Lam$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Lft;->a(Lge;)Lft;

    return-object p0
.end method

.method public setActionView(I)Landroid/view/MenuItem;
    .locals 2

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setActionView(I)Landroid/view/MenuItem;

    iget-object p1, p0, Lam;->d:Ljava/lang/Object;

    check-cast p1, Lft;

    invoke-interface {p1}, Lft;->getActionView()Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/CollapsibleActionView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    new-instance v1, Lam$b;

    invoke-direct {v1, p1}, Lam$b;-><init>(Landroid/view/View;)V

    invoke-interface {v0, v1}, Lft;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    :cond_0
    return-object p0
.end method

.method public setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 1

    instance-of v0, p1, Landroid/view/CollapsibleActionView;

    if-eqz v0, :cond_0

    new-instance v0, Lam$b;

    invoke-direct {v0, p1}, Lam$b;-><init>(Landroid/view/View;)V

    move-object p1, v0

    :cond_0
    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setAlphabeticShortcut(C)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setAlphabeticShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1, p2}, Lft;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setCheckable(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setCheckable(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setChecked(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setChecked(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->a(Ljava/lang/CharSequence;)Lft;

    return-object p0
.end method

.method public setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setEnabled(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(I)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setNumericShortcut(C)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setNumericShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1, p2}, Lft;->setNumericShortcut(CI)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 2

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    if-eqz p1, :cond_0

    new-instance v1, Lam$c;

    invoke-direct {v1, p0, p1}, Lam$c;-><init>(Lam;Landroid/view/MenuItem$OnActionExpandListener;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lft;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 2

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    if-eqz p1, :cond_0

    new-instance v1, Lam$d;

    invoke-direct {v1, p0, p1}, Lam$d;-><init>(Lam;Landroid/view/MenuItem$OnMenuItemClickListener;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lft;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setShortcut(CC)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1, p2}, Lft;->setShortcut(CC)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setShortcut(CCII)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1, p2, p3, p4}, Lft;->setShortcut(CCII)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setShowAsAction(I)V
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setShowAsAction(I)V

    return-void
.end method

.method public setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTitle(I)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setTitle(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->b(Ljava/lang/CharSequence;)Lft;

    return-object p0
.end method

.method public setVisible(Z)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lam;->d:Ljava/lang/Object;

    check-cast v0, Lft;

    invoke-interface {v0, p1}, Lft;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method
