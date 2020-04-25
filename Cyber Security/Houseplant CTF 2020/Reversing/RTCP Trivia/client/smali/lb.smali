.class public final Llb;
.super Ljava/lang/Object;

# interfaces
.implements Lkg;


# instance fields
.field public final a:Lki;


# direct methods
.method public constructor <init>(Lki;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb;->a:Lki;

    return-void
.end method


# virtual methods
.method public final a(Lkg$a;)Lkn;
    .locals 5

    move-object v0, p1

    check-cast v0, Llo;

    iget-object v1, v0, Llo;->d:Lkl;

    iget-object v2, v0, Llo;->a:Llh;

    iget-object v3, v1, Lkl;->b:Ljava/lang/String;

    const-string v4, "GET"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Llb;->a:Lki;

    invoke-virtual {v2, v4, p1, v3}, Llh;->a(Lki;Lkg$a;Z)Llk;

    move-result-object p1

    invoke-virtual {v2}, Llh;->b()Lld;

    move-result-object v3

    invoke-virtual {v0, v1, v2, p1, v3}, Llo;->a(Lkl;Llh;Llk;Lld;)Lkn;

    move-result-object p1

    return-object p1
.end method
