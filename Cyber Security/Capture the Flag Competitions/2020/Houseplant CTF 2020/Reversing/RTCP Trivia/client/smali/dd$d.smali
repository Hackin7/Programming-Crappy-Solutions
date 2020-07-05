.class public final Ldd$d;
.super Ljava/lang/Object;

# interfaces
.implements Ldd$f;
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldd$f<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ldd;

.field private b:Ldd$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldd$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method constructor <init>(Ldd;)V
    .locals 0

    iput-object p1, p0, Ldd$d;->a:Ldd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ldd$d;->c:Z

    return-void
.end method


# virtual methods
.method public final a_(Ldd$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ldd$d;->b:Ldd$c;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Ldd$d;->b:Ldd$c;

    iget-object p1, p1, Ldd$c;->d:Ldd$c;

    iput-object p1, p0, Ldd$d;->b:Ldd$c;

    iget-object p1, p0, Ldd$d;->b:Ldd$c;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ldd$d;->c:Z

    :cond_1
    return-void
.end method

.method public final hasNext()Z
    .locals 3

    iget-boolean v0, p0, Ldd$d;->c:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldd$d;->a:Ldd;

    iget-object v0, v0, Ldd;->b:Ldd$c;

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Ldd$d;->b:Ldd$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldd$d;->b:Ldd$c;

    iget-object v0, v0, Ldd$c;->c:Ldd$c;

    if-eqz v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Ldd$d;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldd$d;->c:Z

    iget-object v0, p0, Ldd$d;->a:Ldd;

    iget-object v0, v0, Ldd;->b:Ldd$c;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ldd$d;->b:Ldd$c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldd$d;->b:Ldd$c;

    iget-object v0, v0, Ldd$c;->c:Ldd$c;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ldd$d;->b:Ldd$c;

    iget-object v0, p0, Ldd$d;->b:Ldd$c;

    return-object v0
.end method
