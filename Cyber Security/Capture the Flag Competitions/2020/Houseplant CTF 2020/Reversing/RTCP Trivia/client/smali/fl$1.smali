.class final Lfl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lfl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl;->a([Lfw$b;I)Lfw$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfl$a<",
        "Lfw$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lfl;


# direct methods
.method constructor <init>(Lfl;)V
    .locals 0

    iput-object p1, p0, Lfl$1;->a:Lfl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfw$b;

    iget-boolean p1, p1, Lfw$b;->d:Z

    return p1
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfw$b;

    iget p1, p1, Lfw$b;->c:I

    return p1
.end method
