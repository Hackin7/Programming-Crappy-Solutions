.class public abstract Landroidx/lifecycle/LiveData;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/LiveData$a;,
        Landroidx/lifecycle/LiveData$LifecycleBoundObserver;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/Object;


# instance fields
.field final a:Ljava/lang/Object;

.field protected c:Ldd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldd<",
            "Liv<",
            "-TT;>;",
            "Landroidx/lifecycle/LiveData<",
            "TT;>.a;>;"
        }
    .end annotation
.end field

.field public d:I

.field public volatile e:Ljava/lang/Object;

.field volatile f:Ljava/lang/Object;

.field private g:I

.field private h:Z

.field private i:Z

.field private final j:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/LiveData;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->a:Ljava/lang/Object;

    new-instance v0, Ldd;

    invoke-direct {v0}, Ldd;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->c:Ldd;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/LiveData;->d:I

    sget-object v0, Landroidx/lifecycle/LiveData;->b:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->e:Ljava/lang/Object;

    sget-object v0, Landroidx/lifecycle/LiveData;->b:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->f:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/lifecycle/LiveData;->g:I

    new-instance v0, Landroidx/lifecycle/LiveData$1;

    invoke-direct {v0, p0}, Landroidx/lifecycle/LiveData$1;-><init>(Landroidx/lifecycle/LiveData;)V

    iput-object v0, p0, Landroidx/lifecycle/LiveData;->j:Ljava/lang/Runnable;

    return-void
.end method

.method protected static a(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcz;->a()Lcz;

    move-result-object v0

    iget-object v0, v0, Lcz;->a:Ldb;

    invoke-virtual {v0}, Ldb;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot invoke "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " on a background thread"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method private b(Landroidx/lifecycle/LiveData$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "TT;>.a;)V"
        }
    .end annotation

    iget-boolean v0, p1, Landroidx/lifecycle/LiveData$a;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData$a;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData$a;->a(Z)V

    return-void

    :cond_1
    iget v0, p1, Landroidx/lifecycle/LiveData$a;->e:I

    iget v1, p0, Landroidx/lifecycle/LiveData;->g:I

    if-lt v0, v1, :cond_2

    return-void

    :cond_2
    iget v0, p0, Landroidx/lifecycle/LiveData;->g:I

    iput v0, p1, Landroidx/lifecycle/LiveData$a;->e:I

    iget-object p1, p1, Landroidx/lifecycle/LiveData$a;->c:Liv;

    iget-object v0, p0, Landroidx/lifecycle/LiveData;->e:Ljava/lang/Object;

    invoke-interface {p1, v0}, Liv;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method final a(Landroidx/lifecycle/LiveData$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/LiveData<",
            "TT;>.a;)V"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/lifecycle/LiveData;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->i:Z

    return-void

    :cond_0
    iput-boolean v1, p0, Landroidx/lifecycle/LiveData;->h:Z

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/LiveData;->i:Z

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Landroidx/lifecycle/LiveData;->b(Landroidx/lifecycle/LiveData$a;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroidx/lifecycle/LiveData;->c:Ldd;

    invoke-virtual {v1}, Ldd;->a()Ldd$d;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/LiveData$a;

    invoke-direct {p0, v2}, Landroidx/lifecycle/LiveData;->b(Landroidx/lifecycle/LiveData$a;)V

    iget-boolean v2, p0, Landroidx/lifecycle/LiveData;->i:Z

    if-eqz v2, :cond_3

    :cond_4
    :goto_0
    iget-boolean v1, p0, Landroidx/lifecycle/LiveData;->i:Z

    if-nez v1, :cond_1

    iput-boolean v0, p0, Landroidx/lifecycle/LiveData;->h:Z

    return-void
.end method

.method public a(Liv;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "removeObserver"

    invoke-static {v0}, Landroidx/lifecycle/LiveData;->a(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/LiveData;->c:Ldd;

    invoke-virtual {v0, p1}, Ldd;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/LiveData$a;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData$a;->b()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/LiveData$a;->a(Z)V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "setValue"

    invoke-static {v0}, Landroidx/lifecycle/LiveData;->a(Ljava/lang/String;)V

    iget v0, p0, Landroidx/lifecycle/LiveData;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/lifecycle/LiveData;->g:I

    iput-object p1, p0, Landroidx/lifecycle/LiveData;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/LiveData;->a(Landroidx/lifecycle/LiveData$a;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
