.class public final Lix;
.super Landroid/app/Fragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lix$a;
    }
.end annotation


# instance fields
.field private a:Lix$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    new-instance v1, Lix;

    invoke-direct {v1}, Lix;-><init>()V

    const-string v2, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"

    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z

    :cond_0
    return-void
.end method

.method private a(Lin$a;)V
    .locals 2

    invoke-virtual {p0}, Lix;->getActivity()Landroid/app/Activity;

    move-result-object v0

    instance-of v1, v0, Lir;

    if-eqz v1, :cond_0

    check-cast v0, Lir;

    invoke-interface {v0}, Lir;->a()Liq;

    move-result-object v0

    invoke-virtual {v0, p1}, Liq;->a(Lin$a;)V

    return-void

    :cond_0
    instance-of v1, v0, Lip;

    if-eqz v1, :cond_1

    check-cast v0, Lip;

    invoke-interface {v0}, Lip;->c()Lin;

    move-result-object v0

    instance-of v1, v0, Liq;

    if-eqz v1, :cond_1

    check-cast v0, Liq;

    invoke-virtual {v0, p1}, Liq;->a(Lin$a;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    sget-object p1, Lin$a;->ON_CREATE:Lin$a;

    invoke-direct {p0, p1}, Lix;->a(Lin$a;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, Lin$a;->ON_DESTROY:Lin$a;

    invoke-direct {p0, v0}, Lix;->a(Lin$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lix;->a:Lix$a;

    return-void
.end method

.method public final onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, Lin$a;->ON_PAUSE:Lin$a;

    invoke-direct {p0, v0}, Lix;->a(Lin$a;)V

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    sget-object v0, Lin$a;->ON_RESUME:Lin$a;

    invoke-direct {p0, v0}, Lix;->a(Lin$a;)V

    return-void
.end method

.method public final onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    sget-object v0, Lin$a;->ON_START:Lin$a;

    invoke-direct {p0, v0}, Lix;->a(Lin$a;)V

    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, Lin$a;->ON_STOP:Lin$a;

    invoke-direct {p0, v0}, Lix;->a(Lin$a;)V

    return-void
.end method
