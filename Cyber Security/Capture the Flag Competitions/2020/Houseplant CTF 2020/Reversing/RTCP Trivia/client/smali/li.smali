.class public final Lli;
.super Ljava/lang/Object;

# interfaces
.implements Lkg;


# instance fields
.field private final a:Ljz;


# direct methods
.method public constructor <init>(Ljz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli;->a:Ljz;

    return-void
.end method


# virtual methods
.method public final a(Lkg$a;)Lkn;
    .locals 12

    invoke-interface {p1}, Lkg$a;->a()Lkl;

    move-result-object v0

    invoke-virtual {v0}, Lkl;->a()Lkl$a;

    move-result-object v1

    iget-object v2, v0, Lkl;->d:Lkm;

    const-wide/16 v3, -0x1

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lkm;->a()Lkh;

    move-result-object v5

    if-eqz v5, :cond_0

    const-string v6, "Content-Type"

    invoke-virtual {v5}, Lkh;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v6, v5}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    :cond_0
    invoke-virtual {v2}, Lkm;->b()J

    move-result-wide v5

    cmp-long v2, v5, v3

    if-eqz v2, :cond_1

    const-string v2, "Content-Length"

    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    const-string v2, "Transfer-Encoding"

    :goto_0
    invoke-virtual {v1, v2}, Lkl$a;->a(Ljava/lang/String;)Lkl$a;

    goto :goto_1

    :cond_1
    const-string v2, "Transfer-Encoding"

    const-string v5, "chunked"

    invoke-virtual {v1, v2, v5}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    const-string v2, "Content-Length"

    goto :goto_0

    :cond_2
    :goto_1
    const-string v2, "Host"

    invoke-virtual {v0, v2}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    if-nez v2, :cond_3

    const-string v2, "Host"

    iget-object v6, v0, Lkl;->a:Lkf;

    invoke-static {v6, v5}, Lkv;->a(Lkf;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    :cond_3
    const-string v2, "Connection"

    invoke-virtual {v0, v2}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    const-string v2, "Connection"

    const-string v6, "Keep-Alive"

    invoke-virtual {v1, v2, v6}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    :cond_4
    const-string v2, "Accept-Encoding"

    invoke-virtual {v0, v2}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    const-string v2, "Range"

    invoke-virtual {v0, v2}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    const-string v2, "Accept-Encoding"

    const-string v6, "gzip"

    invoke-virtual {v1, v2, v6}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    move v2, v5

    :goto_2
    iget-object v6, p0, Lli;->a:Ljz;

    invoke-interface {v6}, Ljz;->b()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, "Cookie"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    :goto_3
    if-ge v5, v9, :cond_7

    if-lez v5, :cond_6

    const-string v10, "; "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljy;

    iget-object v11, v10, Ljy;->a:Ljava/lang/String;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v11, 0x3d

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v10, v10, Ljy;->b:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v7, v5}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    :cond_8
    const-string v5, "User-Agent"

    invoke-virtual {v0, v5}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_9

    const-string v5, "User-Agent"

    const-string v6, "okhttp/3.10.0"

    invoke-virtual {v1, v5, v6}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    :cond_9
    invoke-virtual {v1}, Lkl$a;->a()Lkl;

    move-result-object v1

    invoke-interface {p1, v1}, Lkg$a;->a(Lkl;)Lkn;

    move-result-object p1

    iget-object v1, p0, Lli;->a:Ljz;

    iget-object v5, v0, Lkl;->a:Lkf;

    iget-object v6, p1, Lkn;->f:Lke;

    invoke-static {v1, v5, v6}, Llm;->a(Ljz;Lkf;Lke;)V

    invoke-virtual {p1}, Lkn;->a()Lkn$a;

    move-result-object v1

    iput-object v0, v1, Lkn$a;->a:Lkl;

    if-eqz v2, :cond_a

    const-string v0, "gzip"

    const-string v2, "Content-Encoding"

    invoke-virtual {p1, v2}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {p1}, Llm;->b(Lkn;)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Lnj;

    iget-object v2, p1, Lkn;->g:Lko;

    invoke-virtual {v2}, Lko;->b()Lne;

    move-result-object v2

    invoke-direct {v0, v2}, Lnj;-><init>(Lns;)V

    iget-object v2, p1, Lkn;->f:Lke;

    invoke-virtual {v2}, Lke;->a()Lke$a;

    move-result-object v2

    const-string v5, "Content-Encoding"

    invoke-virtual {v2, v5}, Lke$a;->a(Ljava/lang/String;)Lke$a;

    move-result-object v2

    const-string v5, "Content-Length"

    invoke-virtual {v2, v5}, Lke$a;->a(Ljava/lang/String;)Lke$a;

    move-result-object v2

    invoke-virtual {v2}, Lke$a;->a()Lke;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkn$a;->a(Lke;)Lkn$a;

    const-string v2, "Content-Type"

    invoke-virtual {p1, v2}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Llp;

    invoke-static {v0}, Lnl;->a(Lns;)Lne;

    move-result-object v0

    invoke-direct {v2, p1, v3, v4, v0}, Llp;-><init>(Ljava/lang/String;JLne;)V

    iput-object v2, v1, Lkn$a;->g:Lko;

    :cond_a
    invoke-virtual {v1}, Lkn$a;->a()Lkn;

    move-result-object p1

    return-object p1
.end method
