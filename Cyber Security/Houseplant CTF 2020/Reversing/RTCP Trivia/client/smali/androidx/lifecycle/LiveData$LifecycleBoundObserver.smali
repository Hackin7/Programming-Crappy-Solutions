.class public Landroidx/lifecycle/LiveData$LifecycleBoundObserver;
.super Landroidx/lifecycle/LiveData$a;

# interfaces
.implements Lim;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LifecycleBoundObserver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/LiveData<",
        "TT;>.a;",
        "Lim;"
    }
.end annotation


# instance fields
.field final a:Lip;

.field final synthetic b:Landroidx/lifecycle/LiveData;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/LiveData;Lip;Liv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lip;",
            "Liv<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->b:Landroidx/lifecycle/LiveData;

    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/LiveData$a;-><init>(Landroidx/lifecycle/LiveData;Liv;)V

    iput-object p2, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->a:Lip;

    return-void
.end method


# virtual methods
.method public final a(Lip;Lin$a;)V
    .locals 0

    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->a:Lip;

    invoke-interface {p1}, Lip;->c()Lin;

    move-result-object p1

    invoke-virtual {p1}, Lin;->a()Lin$b;

    move-result-object p1

    sget-object p2, Lin$b;->a:Lin$b;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->b:Landroidx/lifecycle/LiveData;

    iget-object p2, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->c:Liv;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/LiveData;->a(Liv;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->a()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->a(Z)V

    return-void
.end method

.method final a()Z
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->a:Lip;

    invoke-interface {v0}, Lip;->c()Lin;

    move-result-object v0

    invoke-virtual {v0}, Lin;->a()Lin$b;

    move-result-object v0

    sget-object v1, Lin$b;->d:Lin$b;

    invoke-virtual {v0, v1}, Lin$b;->a(Lin$b;)Z

    move-result v0

    return v0
.end method

.method final a(Lip;)Z
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->a:Lip;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method final b()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->a:Lip;

    invoke-interface {v0}, Lip;->c()Lin;

    move-result-object v0

    invoke-virtual {v0, p0}, Lin;->b(Lio;)V

    return-void
.end method
