.class public Lhq;
.super Ler;

# interfaces
.implements Ljb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhq$a;,
        Lhq$b;
    }
.end annotation


# instance fields
.field final a:Landroid/os/Handler;

.field final b:Lhs;

.field c:Z

.field d:Z

.field e:Z

.field f:Z

.field g:Z

.field h:I

.field i:Ldl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldl<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lja;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ler;-><init>()V

    new-instance v0, Lhq$1;

    invoke-direct {v0, p0}, Lhq$1;-><init>(Lhq;)V

    iput-object v0, p0, Lhq;->a:Landroid/os/Handler;

    new-instance v0, Lhq$a;

    invoke-direct {v0, p0}, Lhq$a;-><init>(Lhq;)V

    new-instance v1, Lhs;

    invoke-direct {v1, v0}, Lhs;-><init>(Lht;)V

    iput-object v1, p0, Lhq;->b:Lhs;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhq;->e:Z

    return-void
.end method

.method private a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0, p1, p2, p3, p4}, Lhv;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method private static a(I)V
    .locals 1

    const/high16 v0, -0x10000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can only use lower 16 bits for requestCode"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    return-void
.end method

.method private static a(Lhu;Lin$b;)Z
    .locals 4

    invoke-virtual {p0}, Lhu;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhp;->c()Lin;

    move-result-object v2

    invoke-virtual {v2}, Lin;->a()Lin$b;

    move-result-object v2

    sget-object v3, Lin$b;->d:Lin$b;

    invoke-virtual {v2, v3}, Lin$b;->a(Lin$b;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, v1, Lhp;->T:Liq;

    invoke-virtual {v0, p1}, Liq;->a(Lin$b;)V

    const/4 v0, 0x1

    :cond_1
    iget-object v1, v1, Lhp;->u:Lhv;

    if-eqz v1, :cond_0

    invoke-static {v1, p1}, Lhq;->a(Lhu;Lin$b;)Z

    move-result v1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_2
    return v0
.end method

.method private b()V
    .locals 2

    :cond_0
    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    sget-object v1, Lin$b;->c:Lin$b;

    invoke-static {v0, v1}, Lhq;->a(Lhu;Lin$b;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method


# virtual methods
.method public final a()Lja;
    .locals 2

    invoke-virtual {p0}, Lhq;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lhq;->j:Lja;

    if-nez v0, :cond_1

    new-instance v0, Lja;

    invoke-direct {v0}, Lja;-><init>()V

    iput-object v0, p0, Lhq;->j:Lja;

    :cond_1
    iget-object v0, p0, Lhq;->j:Lja;

    return-object v0
.end method

.method public a_()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lhq;->invalidateOptionsMenu()V

    return-void
.end method

.method public final c()Lin;
    .locals 1

    invoke-super {p0}, Ler;->c()Lin;

    move-result-object v0

    return-object v0
.end method

.method protected final d()V
    .locals 1

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhv;->j()V

    return-void
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Ler;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lhq;->c:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lhq;->d:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Lhq;->e:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Lhq;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Ljc;->a(Lip;)Ljc;

    move-result-object v1

    invoke-virtual {v1, v0, p3}, Ljc;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_0
    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0, p1, p2, p3, p4}, Lhu;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lhq;->b:Lhs;

    invoke-virtual {v0}, Lhs;->a()V

    shr-int/lit8 v0, p1, 0x10

    if-eqz v0, :cond_2

    add-int/lit8 v0, v0, -0x1

    iget-object p1, p0, Lhq;->i:Ldl;

    const/4 p2, 0x0

    invoke-virtual {p1, v0, p2}, Ldl;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, Lhq;->i:Ldl;

    invoke-virtual {p2, v0}, Ldl;->a(I)V

    if-nez p1, :cond_0

    const-string p1, "FragmentActivity"

    const-string p2, "Activity result delivered for unknown Fragment."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object p2, p0, Lhq;->b:Lhs;

    invoke-virtual {p2, p1}, Lhs;->a(Ljava/lang/String;)Lhp;

    move-result-object p2

    if-nez p2, :cond_1

    const-string p2, "FragmentActivity"

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Activity result no fragment exists for who: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-static {}, Lhp;->g()V

    return-void

    :cond_2
    invoke-static {}, Leq;->a()Leq$a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Leq$a;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    invoke-super {p0, p1, p2, p3}, Ler;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 4

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhu;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x19

    if-gt v2, v3, :cond_0

    return-void

    :cond_0
    if-nez v1, :cond_1

    invoke-virtual {v0}, Lhu;->a()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-super {p0}, Ler;->onBackPressed()V

    :cond_2
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Ler;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lhq;->b:Lhs;

    invoke-virtual {v0}, Lhs;->a()V

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0, p1}, Lhv;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v1, v0, Lhs;->a:Lht;

    iget-object v1, v1, Lht;->e:Lhv;

    iget-object v2, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lhs;->a:Lht;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lhv;->a(Lht;Lhr;Lhp;)V

    invoke-super {p0, p1}, Ler;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lhq;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhq$b;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lhq$b;->b:Lja;

    iput-object v1, p0, Lhq;->j:Lja;

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const-string v2, "android:support:fragments"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    iget-object v4, p0, Lhq;->b:Lhs;

    if-eqz v0, :cond_1

    iget-object v3, v0, Lhq$b;->c:Lhw;

    :cond_1
    iget-object v0, v4, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0, v2, v3}, Lhv;->a(Landroid/os/Parcelable;Lhw;)V

    const-string v0, "android:support:next_request_index"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "android:support:next_request_index"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lhq;->h:I

    const-string v0, "android:support:request_indicies"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v0

    const-string v2, "android:support:request_fragment_who"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    array-length v2, v0

    array-length v3, p1

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Ldl;

    array-length v3, v0

    invoke-direct {v2, v3}, Ldl;-><init>(I)V

    iput-object v2, p0, Lhq;->i:Ldl;

    move v2, v1

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_4

    iget-object v3, p0, Lhq;->i:Ldl;

    aget v4, v0, v2

    aget-object v5, p1, v2

    invoke-virtual {v3, v4, v5}, Ldl;->b(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    const-string p1, "FragmentActivity"

    const-string v0, "Invalid requestCode mapping in savedInstanceState."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object p1, p0, Lhq;->i:Ldl;

    if-nez p1, :cond_5

    new-instance p1, Ldl;

    invoke-direct {p1}, Ldl;-><init>()V

    iput-object p1, p0, Lhq;->i:Ldl;

    iput v1, p0, Lhq;->h:I

    :cond_5
    iget-object p1, p0, Lhq;->b:Lhs;

    iget-object p1, p1, Lhs;->a:Lht;

    iget-object p1, p1, Lht;->e:Lhv;

    invoke-virtual {p1}, Lhv;->g()V

    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 2

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2}, Ler;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    iget-object v0, p0, Lhq;->b:Lhs;

    invoke-virtual {p0}, Lhq;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v1

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0, p2, v1}, Lhv;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Ler;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Lhq;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Ler;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2, p3}, Lhq;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Ler;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Ler;->onDestroy()V

    iget-object v0, p0, Lhq;->j:Lja;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhq;->isChangingConfigurations()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhq;->j:Lja;

    invoke-virtual {v0}, Lja;->a()V

    :cond_0
    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhv;->l()V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    invoke-super {p0}, Ler;->onLowMemory()V

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhv;->m()V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Ler;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object p1, p0, Lhq;->b:Lhs;

    iget-object p1, p1, Lhs;->a:Lht;

    iget-object p1, p1, Lht;->e:Lhv;

    invoke-virtual {p1, p2}, Lhv;->b(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_2
    iget-object p1, p0, Lhq;->b:Lhs;

    iget-object p1, p1, Lhs;->a:Lht;

    iget-object p1, p1, Lht;->e:Lhv;

    invoke-virtual {p1, p2}, Lhv;->a(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 1

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0, p1}, Lhv;->a(Z)V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1}, Ler;->onNewIntent(Landroid/content/Intent;)V

    iget-object p1, p0, Lhq;->b:Lhs;

    invoke-virtual {p1}, Lhs;->a()V

    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0, p2}, Lhv;->b(Landroid/view/Menu;)V

    :goto_0
    invoke-super {p0, p1, p2}, Ler;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method protected onPause()V
    .locals 2

    invoke-super {p0}, Ler;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhq;->d:Z

    iget-object v0, p0, Lhq;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhq;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p0}, Lhq;->d()V

    :cond_0
    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lhv;->a(I)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 1

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0, p1}, Lhv;->b(Z)V

    return-void
.end method

.method protected onPostResume()V
    .locals 2

    invoke-super {p0}, Ler;->onPostResume()V

    iget-object v0, p0, Lhq;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p0}, Lhq;->d()V

    iget-object v0, p0, Lhq;->b:Lhs;

    invoke-virtual {v0}, Lhs;->b()Z

    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1, p2, p3}, Ler;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    iget-object p2, p0, Lhq;->b:Lhs;

    iget-object p2, p2, Lhs;->a:Lht;

    iget-object p2, p2, Lht;->e:Lhv;

    invoke-virtual {p2, p3}, Lhv;->a(Landroid/view/Menu;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Ler;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object p2, p0, Lhq;->b:Lhs;

    invoke-virtual {p2}, Lhs;->a()V

    shr-int/lit8 p1, p1, 0x10

    const p2, 0xffff

    and-int/2addr p1, p2

    if-eqz p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    iget-object p2, p0, Lhq;->i:Ldl;

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Ldl;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object p3, p0, Lhq;->i:Ldl;

    invoke-virtual {p3, p1}, Ldl;->a(I)V

    if-nez p2, :cond_0

    const-string p1, "FragmentActivity"

    const-string p2, "Activity result delivered for unknown Fragment."

    :goto_0
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object p1, p0, Lhq;->b:Lhs;

    invoke-virtual {p1, p2}, Lhs;->a(Ljava/lang/String;)Lhp;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "FragmentActivity"

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Activity result no fragment exists for who: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-static {}, Lhp;->h()V

    :cond_2
    return-void
.end method

.method protected onResume()V
    .locals 2

    invoke-super {p0}, Ler;->onResume()V

    iget-object v0, p0, Lhq;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhq;->d:Z

    iget-object v0, p0, Lhq;->b:Lhs;

    invoke-virtual {v0}, Lhs;->b()Z

    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    iget-object v1, v0, Lhv;->D:Lhw;

    invoke-static {v1}, Lhv;->a(Lhw;)V

    iget-object v0, v0, Lhv;->D:Lhw;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v2, p0, Lhq;->j:Lja;

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    new-instance v2, Lhq$b;

    invoke-direct {v2}, Lhq$b;-><init>()V

    iput-object v1, v2, Lhq$b;->a:Ljava/lang/Object;

    iget-object v1, p0, Lhq;->j:Lja;

    iput-object v1, v2, Lhq$b;->b:Lja;

    iput-object v0, v2, Lhq$b;->c:Lhw;

    return-object v2
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Ler;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lhq;->b()V

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhv;->e()Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    iget-object v0, p0, Lhq;->i:Ldl;

    invoke-virtual {v0}, Ldl;->b()I

    move-result v0

    if-lez v0, :cond_2

    const-string v0, "android:support:next_request_index"

    iget v1, p0, Lhq;->h:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lhq;->i:Ldl;

    invoke-virtual {v0}, Ldl;->b()I

    move-result v0

    new-array v0, v0, [I

    iget-object v1, p0, Lhq;->i:Ldl;

    invoke-virtual {v1}, Ldl;->b()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lhq;->i:Ldl;

    invoke-virtual {v3}, Ldl;->b()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lhq;->i:Ldl;

    invoke-virtual {v3, v2}, Ldl;->b(I)I

    move-result v3

    aput v3, v0, v2

    iget-object v3, p0, Lhq;->i:Ldl;

    invoke-virtual {v3, v2}, Ldl;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-string v2, "android:support:request_indicies"

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v0, "android:support:request_fragment_who"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Ler;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhq;->e:Z

    iget-boolean v0, p0, Lhq;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhq;->c:Z

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhv;->h()V

    :cond_0
    iget-object v0, p0, Lhq;->b:Lhs;

    invoke-virtual {v0}, Lhs;->a()V

    iget-object v0, p0, Lhq;->b:Lhs;

    invoke-virtual {v0}, Lhs;->b()Z

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhv;->i()V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Lhq;->b:Lhs;

    invoke-virtual {v0}, Lhs;->a()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Ler;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhq;->e:Z

    invoke-direct {p0}, Lhq;->b()V

    iget-object v0, p0, Lhq;->b:Lhs;

    iget-object v0, v0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhv;->k()V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    iget-boolean v0, p0, Lhq;->g:Z

    if-nez v0, :cond_0

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    invoke-static {p2}, Lhq;->a(I)V

    :cond_0
    invoke-super {p0, p1, p2}, Ler;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1

    iget-boolean v0, p0, Lhq;->g:Z

    if-nez v0, :cond_0

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    invoke-static {p2}, Lhq;->a(I)V

    :cond_0
    invoke-super {p0, p1, p2, p3}, Ler;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    .locals 1

    iget-boolean v0, p0, Lhq;->f:Z

    if-nez v0, :cond_0

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    invoke-static {p2}, Lhq;->a(I)V

    :cond_0
    invoke-super/range {p0 .. p6}, Ler;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 1

    iget-boolean v0, p0, Lhq;->f:Z

    if-nez v0, :cond_0

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    invoke-static {p2}, Lhq;->a(I)V

    :cond_0
    invoke-super/range {p0 .. p7}, Ler;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method
