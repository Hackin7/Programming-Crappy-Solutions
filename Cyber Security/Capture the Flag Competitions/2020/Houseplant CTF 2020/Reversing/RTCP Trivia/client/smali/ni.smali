.class public final Lni;
.super Lnt;


# instance fields
.field public a:Lnt;


# direct methods
.method public constructor <init>(Lnt;)V
    .locals 1

    invoke-direct {p0}, Lnt;-><init>()V

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "delegate == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lni;->a:Lnt;

    return-void
.end method


# virtual methods
.method public final a(J)Lnt;
    .locals 1

    iget-object v0, p0, Lni;->a:Lnt;

    invoke-virtual {v0, p1, p2}, Lnt;->a(J)Lnt;

    move-result-object p1

    return-object p1
.end method

.method public final a(JLjava/util/concurrent/TimeUnit;)Lnt;
    .locals 1

    iget-object v0, p0, Lni;->a:Lnt;

    invoke-virtual {v0, p1, p2, p3}, Lnt;->a(JLjava/util/concurrent/TimeUnit;)Lnt;

    move-result-object p1

    return-object p1
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lni;->a:Lnt;

    invoke-virtual {v0}, Lnt;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Lnt;
    .locals 1

    iget-object v0, p0, Lni;->a:Lnt;

    invoke-virtual {v0}, Lnt;->d()Lnt;

    move-result-object v0

    return-object v0
.end method

.method public final d_()J
    .locals 2

    iget-object v0, p0, Lni;->a:Lnt;

    invoke-virtual {v0}, Lnt;->d_()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e_()Z
    .locals 1

    iget-object v0, p0, Lni;->a:Lnt;

    invoke-virtual {v0}, Lnt;->e_()Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lni;->a:Lnt;

    invoke-virtual {v0}, Lnt;->f()V

    return-void
.end method

.method public final f_()Lnt;
    .locals 1

    iget-object v0, p0, Lni;->a:Lnt;

    invoke-virtual {v0}, Lnt;->f_()Lnt;

    move-result-object v0

    return-object v0
.end method
