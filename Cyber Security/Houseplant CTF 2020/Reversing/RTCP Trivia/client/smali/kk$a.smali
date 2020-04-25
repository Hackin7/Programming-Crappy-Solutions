.class final Lkk$a;
.super Lku;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkk;

.field private final c:Ljt;


# direct methods
.method constructor <init>(Lkk;Ljt;)V
    .locals 3

    iput-object p1, p0, Lkk$a;->a:Lkk;

    const-string v0, "OkHttp %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lkk;->b()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-direct {p0, v0, v1}, Lku;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p2, p0, Lkk$a;->c:Ljt;

    return-void
.end method


# virtual methods
.method final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkk$a;->a:Lkk;

    iget-object v0, v0, Lkk;->d:Lkl;

    iget-object v0, v0, Lkl;->a:Lkf;

    iget-object v0, v0, Lkf;->b:Ljava/lang/String;

    return-object v0
.end method

.method protected final b()V
    .locals 19

    move-object/from16 v1, p0

    :try_start_0
    iget-object v15, v1, Lkk$a;->a:Lkk;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v15, Lkk;->a:Lki;

    iget-object v4, v4, Lki;->g:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v4, v15, Lkk;->b:Llr;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lli;

    iget-object v6, v15, Lkk;->a:Lki;

    iget-object v6, v6, Lki;->k:Ljz;

    invoke-direct {v4, v6}, Lli;-><init>(Ljz;)V

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Lkw;

    iget-object v6, v15, Lkk;->a:Lki;

    iget-object v7, v6, Lki;->l:Ljq;

    if-eqz v7, :cond_0

    iget-object v6, v6, Lki;->l:Ljq;

    iget-object v6, v6, Ljq;->a:Lla;

    goto :goto_0

    :cond_0
    iget-object v6, v6, Lki;->m:Lla;

    :goto_0
    invoke-direct {v4, v6}, Lkw;-><init>(Lla;)V

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Llb;

    iget-object v6, v15, Lkk;->a:Lki;

    invoke-direct {v4, v6}, Llb;-><init>(Lki;)V

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v4, v15, Lkk;->e:Z

    if-nez v4, :cond_1

    iget-object v4, v15, Lkk;->a:Lki;

    iget-object v4, v4, Lki;->h:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    new-instance v4, Llj;

    iget-boolean v6, v15, Lkk;->e:Z

    invoke-direct {v4, v6}, Llj;-><init>(Z)V

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v14, Llo;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget-object v10, v15, Lkk;->d:Lkl;

    iget-object v12, v15, Lkk;->c:Lkc;

    iget-object v4, v15, Lkk;->a:Lki;

    iget v13, v4, Lki;->z:I

    iget-object v4, v15, Lkk;->a:Lki;

    iget v11, v4, Lki;->A:I

    iget-object v4, v15, Lkk;->a:Lki;

    iget v4, v4, Lki;->B:I

    move/from16 v16, v4

    move-object v4, v14

    move/from16 v17, v11

    move-object v11, v15

    move-object v2, v14

    move/from16 v14, v17

    move-object v3, v15

    move/from16 v15, v16

    invoke-direct/range {v4 .. v15}, Llo;-><init>(Ljava/util/List;Llh;Llk;Lld;ILkl;Ljs;Lkc;III)V

    iget-object v3, v3, Lkk;->d:Lkl;

    invoke-interface {v2, v3}, Lkg$a;->a(Lkl;)Lkn;

    move-result-object v2

    iget-object v3, v1, Lkk$a;->a:Lkk;

    iget-object v3, v3, Lkk;->b:Llr;

    iget-boolean v3, v3, Llr;->c:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_2

    :try_start_1
    iget-object v2, v1, Lkk$a;->c:Ljt;

    new-instance v3, Ljava/io/IOException;

    const-string v4, "Canceled"

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljt;->a(Ljava/io/IOException;)V

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v2, v0

    const/16 v18, 0x1

    goto :goto_2

    :cond_2
    iget-object v3, v1, Lkk$a;->c:Ljt;

    iget-object v4, v1, Lkk$a;->a:Lkk;

    invoke-interface {v3, v4, v2}, Ljt;->a(Ljs;Lkn;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iget-object v2, v1, Lkk$a;->a:Lkk;

    iget-object v2, v2, Lkk;->a:Lki;

    iget-object v2, v2, Lki;->c:Lka;

    invoke-virtual {v2, v1}, Lka;->b(Lkk$a;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_5

    :catch_1
    move-exception v0

    move-object v2, v0

    const/16 v18, 0x0

    :goto_2
    if-eqz v18, :cond_5

    :try_start_2
    invoke-static {}, Lmp;->c()Lmp;

    move-result-object v3

    const/4 v4, 0x4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Callback failure for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v1, Lkk$a;->a:Lkk;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, v6, Lkk;->b:Llr;

    iget-boolean v8, v8, Llr;->c:Z

    if-eqz v8, :cond_3

    const-string v8, "canceled "

    goto :goto_3

    :cond_3
    const-string v8, ""

    :goto_3
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v8, v6, Lkk;->e:Z

    if-eqz v8, :cond_4

    const-string v8, "web socket"

    goto :goto_4

    :cond_4
    const-string v8, "call"

    :goto_4
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " to "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lkk;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5, v2}, Lmp;->a(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_5
    invoke-static {}, Lkc;->t()V

    iget-object v3, v1, Lkk$a;->c:Ljt;

    invoke-interface {v3, v2}, Ljt;->a(Ljava/io/IOException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_5
    iget-object v3, v1, Lkk$a;->a:Lkk;

    iget-object v3, v3, Lkk;->a:Lki;

    iget-object v3, v3, Lki;->c:Lka;

    invoke-virtual {v3, v1}, Lka;->b(Lkk$a;)V

    throw v2
.end method
