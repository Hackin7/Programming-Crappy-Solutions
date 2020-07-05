.class public final Llj;
.super Ljava/lang/Object;

# interfaces
.implements Lkg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llj$a;
    }
.end annotation


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llj;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Lkg$a;)Lkn;
    .locals 9

    check-cast p1, Llo;

    iget-object v0, p1, Llo;->b:Llk;

    iget-object v1, p1, Llo;->a:Llh;

    iget-object v2, p1, Llo;->c:Lld;

    check-cast v2, Lld;

    iget-object p1, p1, Llo;->d:Lkl;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Lkc;->k()V

    invoke-interface {v0, p1}, Llk;->a(Lkl;)V

    invoke-static {}, Lkc;->l()V

    iget-object v5, p1, Lkl;->b:Ljava/lang/String;

    invoke-static {v5}, Lln;->a(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    iget-object v5, p1, Lkl;->d:Lkm;

    if-eqz v5, :cond_2

    const-string v5, "100-continue"

    const-string v7, "Expect"

    invoke-virtual {p1, v7}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Llk;->a()V

    invoke-static {}, Lkc;->o()V

    const/4 v5, 0x1

    invoke-interface {v0, v5}, Llk;->a(Z)Lkn$a;

    move-result-object v6

    :cond_0
    if-nez v6, :cond_1

    invoke-static {}, Lkc;->m()V

    iget-object v2, p1, Lkl;->d:Lkm;

    invoke-virtual {v2}, Lkm;->b()J

    move-result-wide v7

    new-instance v2, Llj$a;

    invoke-interface {v0, p1, v7, v8}, Llk;->a(Lkl;J)Lnr;

    move-result-object v5

    invoke-direct {v2, v5}, Llj$a;-><init>(Lnr;)V

    invoke-static {v2}, Lnl;->a(Lnr;)Lnd;

    move-result-object v2

    iget-object v5, p1, Lkl;->d:Lkm;

    invoke-virtual {v5, v2}, Lkm;->a(Lnd;)V

    invoke-interface {v2}, Lnd;->close()V

    invoke-static {}, Lkc;->n()V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lld;->a()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Llh;->d()V

    :cond_2
    :goto_0
    invoke-interface {v0}, Llk;->b()V

    const/4 v2, 0x0

    if-nez v6, :cond_3

    invoke-static {}, Lkc;->o()V

    invoke-interface {v0, v2}, Llk;->a(Z)Lkn$a;

    move-result-object v6

    :cond_3
    iput-object p1, v6, Lkn$a;->a:Lkl;

    invoke-virtual {v1}, Llh;->b()Lld;

    move-result-object v5

    iget-object v5, v5, Lld;->d:Lkd;

    iput-object v5, v6, Lkn$a;->e:Lkd;

    iput-wide v3, v6, Lkn$a;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iput-wide v7, v6, Lkn$a;->l:J

    invoke-virtual {v6}, Lkn$a;->a()Lkn;

    move-result-object v5

    iget v6, v5, Lkn;->c:I

    const/16 v7, 0x64

    if-ne v6, v7, :cond_4

    invoke-interface {v0, v2}, Llk;->a(Z)Lkn$a;

    move-result-object v2

    iput-object p1, v2, Lkn$a;->a:Lkl;

    invoke-virtual {v1}, Llh;->b()Lld;

    move-result-object p1

    iget-object p1, p1, Lld;->d:Lkd;

    iput-object p1, v2, Lkn$a;->e:Lkd;

    iput-wide v3, v2, Lkn$a;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Lkn$a;->l:J

    invoke-virtual {v2}, Lkn$a;->a()Lkn;

    move-result-object v5

    iget v6, v5, Lkn;->c:I

    :cond_4
    invoke-static {}, Lkc;->p()V

    iget-boolean p1, p0, Llj;->a:Z

    if-eqz p1, :cond_5

    const/16 p1, 0x65

    if-ne v6, p1, :cond_5

    invoke-virtual {v5}, Lkn;->a()Lkn$a;

    move-result-object p1

    sget-object v0, Lkv;->c:Lko;

    goto :goto_1

    :cond_5
    invoke-virtual {v5}, Lkn;->a()Lkn$a;

    move-result-object p1

    invoke-interface {v0, v5}, Llk;->a(Lkn;)Lko;

    move-result-object v0

    :goto_1
    iput-object v0, p1, Lkn$a;->g:Lko;

    invoke-virtual {p1}, Lkn$a;->a()Lkn;

    move-result-object p1

    const-string v0, "close"

    iget-object v2, p1, Lkn;->a:Lkl;

    const-string v3, "Connection"

    invoke-virtual {v2, v3}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "close"

    const-string v2, "Connection"

    invoke-virtual {p1, v2}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    invoke-virtual {v1}, Llh;->d()V

    :cond_7
    const/16 v0, 0xcc

    if-eq v6, v0, :cond_8

    const/16 v0, 0xcd

    if-ne v6, v0, :cond_9

    :cond_8
    iget-object v0, p1, Lkn;->g:Lko;

    invoke-virtual {v0}, Lko;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_9

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HTTP "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lkn;->g:Lko;

    invoke-virtual {p1}, Lko;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    return-object p1
.end method
