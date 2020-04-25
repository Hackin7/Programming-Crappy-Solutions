.class abstract Ldd$e;
.super Ljava/lang/Object;

# interfaces
.implements Ldd$f;
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldd$f<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field a:Ldd$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldd$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field b:Ldd$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldd$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldd$c;Ldd$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd$c<",
            "TK;TV;>;",
            "Ldd$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldd$e;->a:Ldd$c;

    iput-object p1, p0, Ldd$e;->b:Ldd$c;

    return-void
.end method

.method private a()Ldd$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldd$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Ldd$e;->b:Ldd$c;

    iget-object v1, p0, Ldd$e;->a:Ldd$c;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Ldd$e;->a:Ldd$c;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ldd$e;->b:Ldd$c;

    invoke-virtual {p0, v0}, Ldd$e;->a(Ldd$c;)Ldd$c;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method abstract a(Ldd$c;)Ldd$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd$c<",
            "TK;TV;>;)",
            "Ldd$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public final a_(Ldd$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ldd$e;->a:Ldd$c;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ldd$e;->b:Ldd$c;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Ldd$e;->b:Ldd$c;

    iput-object v0, p0, Ldd$e;->a:Ldd$c;

    :cond_0
    iget-object v0, p0, Ldd$e;->a:Ldd$c;

    if-ne v0, p1, :cond_1

    iget-object v0, p0, Ldd$e;->a:Ldd$c;

    invoke-virtual {p0, v0}, Ldd$e;->b(Ldd$c;)Ldd$c;

    move-result-object v0

    iput-object v0, p0, Ldd$e;->a:Ldd$c;

    :cond_1
    iget-object v0, p0, Ldd$e;->b:Ldd$c;

    if-ne v0, p1, :cond_2

    invoke-direct {p0}, Ldd$e;->a()Ldd$c;

    move-result-object p1

    iput-object p1, p0, Ldd$e;->b:Ldd$c;

    :cond_2
    return-void
.end method

.method abstract b(Ldd$c;)Ldd$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd$c<",
            "TK;TV;>;)",
            "Ldd$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Ldd$e;->b:Ldd$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ldd$e;->b:Ldd$c;

    invoke-direct {p0}, Ldd$e;->a()Ldd$c;

    move-result-object v1

    iput-object v1, p0, Ldd$e;->b:Ldd$c;

    return-object v0
.end method
