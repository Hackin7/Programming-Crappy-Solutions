.class abstract Lae;
.super Laf;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Laf<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Landroid/content/Context;

.field b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lft;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lfu;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Laf;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lae;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method final a(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, Lft;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lft;

    iget-object v1, p0, Lae;->b:Ljava/util/Map;

    if-nez v1, :cond_0

    new-instance v1, Lde;

    invoke-direct {v1}, Lde;-><init>()V

    iput-object v1, p0, Lae;->b:Ljava/util/Map;

    :cond_0
    iget-object v1, p0, Lae;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    if-nez p1, :cond_1

    iget-object p1, p0, Lae;->a:Landroid/content/Context;

    invoke-static {p1, v0}, Las;->a(Landroid/content/Context;Lft;)Landroid/view/MenuItem;

    move-result-object p1

    iget-object v1, p0, Lae;->b:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p1
.end method

.method final a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 2

    instance-of v0, p1, Lfu;

    if-eqz v0, :cond_2

    check-cast p1, Lfu;

    iget-object v0, p0, Lae;->c:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Lde;

    invoke-direct {v0}, Lde;-><init>()V

    iput-object v0, p0, Lae;->c:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lae;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    if-nez v0, :cond_1

    iget-object v0, p0, Lae;->a:Landroid/content/Context;

    new-instance v1, Lax;

    invoke-direct {v1, v0, p1}, Lax;-><init>(Landroid/content/Context;Lfu;)V

    iget-object v0, p0, Lae;->c:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method
