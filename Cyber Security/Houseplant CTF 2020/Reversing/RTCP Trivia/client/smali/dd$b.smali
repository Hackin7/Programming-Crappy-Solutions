.class public final Ldd$b;
.super Ldd$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ldd$e<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ldd$c;Ldd$c;)V
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

    invoke-direct {p0, p1, p2}, Ldd$e;-><init>(Ldd$c;Ldd$c;)V

    return-void
.end method


# virtual methods
.method final a(Ldd$c;)Ldd$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd$c<",
            "TK;TV;>;)",
            "Ldd$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Ldd$c;->d:Ldd$c;

    return-object p1
.end method

.method final b(Ldd$c;)Ldd$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd$c<",
            "TK;TV;>;)",
            "Ldd$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Ldd$c;->c:Ldd$c;

    return-object p1
.end method
