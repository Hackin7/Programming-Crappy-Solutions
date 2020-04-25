.class public Le;
.super Lhq;

# interfaces
.implements Leu$a;
.implements Lf;


# instance fields
.field private j:Lg;

.field private k:I

.field private l:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lhq;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Le;->k:I

    return-void
.end method

.method private e()Z
    .locals 6

    invoke-static {p0}, Les;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v3, 0x1

    const/16 v4, 0x10

    if-lt v2, v4, :cond_0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v5, "android.intent.action.MAIN"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    if-eqz v2, :cond_7

    invoke-static {p0}, Leu;->a(Landroid/content/Context;)Leu;

    move-result-object v0

    const/4 v2, 0x0

    instance-of v4, p0, Leu$a;

    if-eqz v4, :cond_2

    move-object v2, p0

    check-cast v2, Leu$a;

    invoke-interface {v2}, Leu$a;->b()Landroid/content/Intent;

    move-result-object v2

    :cond_2
    if-nez v2, :cond_3

    invoke-static {p0}, Les;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v2

    :cond_3
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v4

    if-nez v4, :cond_4

    iget-object v4, v0, Leu;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v4

    :cond_4
    invoke-virtual {v0, v4}, Leu;->a(Landroid/content/ComponentName;)Leu;

    iget-object v4, v0, Leu;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v2, v0, Leu;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No intents added to TaskStackBuilder; cannot startActivities"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    iget-object v2, v0, Leu;->a:Ljava/util/ArrayList;

    iget-object v4, v0, Leu;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v4, v4, [Landroid/content/Intent;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/content/Intent;

    new-instance v4, Landroid/content/Intent;

    aget-object v5, v2, v1

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v5, 0x1000c000

    invoke-virtual {v4, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v4

    aput-object v4, v2, v1

    iget-object v0, v0, Leu;->b:Landroid/content/Context;

    invoke-static {v0, v2}, Lev;->a(Landroid/content/Context;[Landroid/content/Intent;)Z

    :try_start_0
    invoke-static {p0}, Leq;->a(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    invoke-virtual {p0}, Le;->finish()V

    return v3

    :cond_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v4, :cond_8

    invoke-virtual {p0, v0}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    return v3

    :cond_8
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return v3

    :cond_9
    return v1
.end method

.method private f()Lg;
    .locals 1

    iget-object v0, p0, Le;->j:Lg;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Lg;->a(Landroid/app/Activity;Lf;)Lg;

    move-result-object v0

    iput-object v0, p0, Le;->j:Lg;

    :cond_0
    iget-object v0, p0, Le;->j:Lg;

    return-object v0
.end method


# virtual methods
.method public final a_()V
    .locals 1

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->g()V

    return-void
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b()Landroid/content/Intent;
    .locals 1

    invoke-static {p0}, Les;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public closeOptionsMenu()V
    .locals 3

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->a()Lc;

    move-result-object v0

    invoke-virtual {p0}, Le;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc;->d()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Lhq;->closeOptionsMenu()V

    :cond_1
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v1

    invoke-virtual {v1}, Lg;->a()Lc;

    move-result-object v1

    const/16 v2, 0x52

    if-ne v0, v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lc;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Lhq;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->a(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->b()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    iget-object v0, p0, Le;->l:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    invoke-static {}, Lcw;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcw;

    invoke-super {p0}, Lhq;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcw;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V

    iput-object v0, p0, Le;->l:Landroid/content/res/Resources;

    :cond_0
    iget-object v0, p0, Le;->l:Landroid/content/res/Resources;

    if-nez v0, :cond_1

    invoke-super {p0}, Lhq;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Le;->l:Landroid/content/res/Resources;

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->g()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Lhq;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->a(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Le;->l:Landroid/content/res/Resources;

    if-eqz v0, :cond_0

    invoke-super {p0}, Lhq;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v1, p0, Le;->l:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    :cond_0
    return-void
.end method

.method public onContentChanged()V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->i()V

    invoke-virtual {v0, p1}, Lg;->a(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lg;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Le;->k:I

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Le;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, p0, Le;->k:I

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Le;->onApplyThemeResource(Landroid/content/res/Resources$Theme;IZ)V

    goto :goto_0

    :cond_0
    iget v0, p0, Le;->k:I

    invoke-virtual {p0, v0}, Le;->setTheme(I)V

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lhq;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lhq;->onDestroy()V

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->h()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x1a

    if-ge v0, v2, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Le;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-super {p0, p1, p2}, Lhq;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Lhq;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-direct {p0}, Le;->f()Lg;

    move-result-object p1

    invoke-virtual {p1}, Lg;->a()Lc;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x102002c

    if-ne p2, v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lc;->a()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_1

    invoke-direct {p0}, Le;->e()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lhq;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lhq;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lhq;->onPostCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object p1

    invoke-virtual {p1}, Lg;->c()V

    return-void
.end method

.method protected onPostResume()V
    .locals 1

    invoke-super {p0}, Lhq;->onPostResume()V

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->f()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lhq;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Lhq;->onStart()V

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->d()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Lhq;->onStop()V

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->e()V

    return-void
.end method

.method protected onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lhq;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object p2

    invoke-virtual {p2, p1}, Lg;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public openOptionsMenu()V
    .locals 3

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0}, Lg;->a()Lc;

    move-result-object v0

    invoke-virtual {p0}, Le;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc;->c()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Lhq;->openOptionsMenu()V

    :cond_1
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->b(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg;->a(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-direct {p0}, Le;->f()Lg;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTheme(I)V
    .locals 0

    invoke-super {p0, p1}, Lhq;->setTheme(I)V

    iput p1, p0, Le;->k:I

    return-void
.end method
