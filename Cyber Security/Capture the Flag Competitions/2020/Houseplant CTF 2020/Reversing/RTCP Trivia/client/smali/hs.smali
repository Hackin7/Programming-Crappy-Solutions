.class public final Lhs;
.super Ljava/lang/Object;


# instance fields
.field final a:Lht;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lht<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lht;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhs;->a:Lht;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lhp;
    .locals 1

    iget-object v0, p0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0, p1}, Lhv;->a(Ljava/lang/String;)Lhp;

    move-result-object p1

    return-object p1
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhv;->f()V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lhs;->a:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    invoke-virtual {v0}, Lhv;->d()Z

    move-result v0

    return v0
.end method
