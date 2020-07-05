.class public final Ldo;
.super Ljava/lang/Object;


# instance fields
.field a:Lds$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lds$a<",
            "Ldn;",
            ">;"
        }
    .end annotation
.end field

.field b:Lds$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lds$a<",
            "Ldt;",
            ">;"
        }
    .end annotation
.end field

.field c:[Ldt;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lds$b;

    invoke-direct {v0}, Lds$b;-><init>()V

    iput-object v0, p0, Ldo;->a:Lds$a;

    new-instance v0, Lds$b;

    invoke-direct {v0}, Lds$b;-><init>()V

    iput-object v0, p0, Ldo;->b:Lds$a;

    const/16 v0, 0x20

    new-array v0, v0, [Ldt;

    iput-object v0, p0, Ldo;->c:[Ldt;

    return-void
.end method
