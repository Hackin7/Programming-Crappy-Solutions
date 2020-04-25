.class public final Lma;
.super Ljava/lang/Object;

# interfaces
.implements Llk;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lma$a;
    }
.end annotation


# static fields
.field private static final b:Lnf;

.field private static final c:Lnf;

.field private static final d:Lnf;

.field private static final e:Lnf;

.field private static final f:Lnf;

.field private static final g:Lnf;

.field private static final h:Lnf;

.field private static final i:Lnf;

.field private static final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnf;",
            ">;"
        }
    .end annotation
.end field

.field private static final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:Llh;

.field private final l:Lki;

.field private final m:Lkg$a;

.field private final n:Lmb;

.field private o:Lmd;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v0, "connection"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Lma;->b:Lnf;

    const-string v0, "host"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Lma;->c:Lnf;

    const-string v0, "keep-alive"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Lma;->d:Lnf;

    const-string v0, "proxy-connection"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Lma;->e:Lnf;

    const-string v0, "transfer-encoding"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Lma;->f:Lnf;

    const-string v0, "te"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Lma;->g:Lnf;

    const-string v0, "encoding"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Lma;->h:Lnf;

    const-string v0, "upgrade"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Lma;->i:Lnf;

    const/16 v0, 0xc

    new-array v0, v0, [Lnf;

    sget-object v1, Lma;->b:Lnf;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lma;->c:Lnf;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lma;->d:Lnf;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    sget-object v1, Lma;->e:Lnf;

    const/4 v5, 0x3

    aput-object v1, v0, v5

    sget-object v1, Lma;->g:Lnf;

    const/4 v6, 0x4

    aput-object v1, v0, v6

    sget-object v1, Lma;->f:Lnf;

    const/4 v7, 0x5

    aput-object v1, v0, v7

    sget-object v1, Lma;->h:Lnf;

    const/4 v8, 0x6

    aput-object v1, v0, v8

    sget-object v1, Lma;->i:Lnf;

    const/4 v9, 0x7

    aput-object v1, v0, v9

    sget-object v1, Llx;->c:Lnf;

    const/16 v10, 0x8

    aput-object v1, v0, v10

    sget-object v1, Llx;->d:Lnf;

    const/16 v11, 0x9

    aput-object v1, v0, v11

    sget-object v1, Llx;->e:Lnf;

    const/16 v11, 0xa

    aput-object v1, v0, v11

    sget-object v1, Llx;->f:Lnf;

    const/16 v11, 0xb

    aput-object v1, v0, v11

    invoke-static {v0}, Lkv;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lma;->j:Ljava/util/List;

    new-array v0, v10, [Lnf;

    sget-object v1, Lma;->b:Lnf;

    aput-object v1, v0, v2

    sget-object v1, Lma;->c:Lnf;

    aput-object v1, v0, v3

    sget-object v1, Lma;->d:Lnf;

    aput-object v1, v0, v4

    sget-object v1, Lma;->e:Lnf;

    aput-object v1, v0, v5

    sget-object v1, Lma;->g:Lnf;

    aput-object v1, v0, v6

    sget-object v1, Lma;->f:Lnf;

    aput-object v1, v0, v7

    sget-object v1, Lma;->h:Lnf;

    aput-object v1, v0, v8

    sget-object v1, Lma;->i:Lnf;

    aput-object v1, v0, v9

    invoke-static {v0}, Lkv;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lma;->k:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lki;Lkg$a;Llh;Lmb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lma;->l:Lki;

    iput-object p2, p0, Lma;->m:Lkg$a;

    iput-object p3, p0, Lma;->a:Llh;

    iput-object p4, p0, Lma;->n:Lmb;

    return-void
.end method


# virtual methods
.method public final a(Z)Lkn$a;
    .locals 9

    iget-object v0, p0, Lma;->o:Lmd;

    invoke-virtual {v0}, Lmd;->c()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lke$a;

    invoke-direct {v1}, Lke$a;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v1

    move-object v1, v3

    :goto_0
    const/16 v6, 0x64

    if-ge v4, v2, :cond_3

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Llx;

    if-nez v7, :cond_0

    if-eqz v1, :cond_2

    iget v7, v1, Lls;->b:I

    if-ne v7, v6, :cond_2

    new-instance v1, Lke$a;

    invoke-direct {v1}, Lke$a;-><init>()V

    move-object v5, v1

    move-object v1, v3

    goto :goto_1

    :cond_0
    iget-object v6, v7, Llx;->g:Lnf;

    iget-object v7, v7, Llx;->h:Lnf;

    invoke-virtual {v7}, Lnf;->a()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Llx;->b:Lnf;

    invoke-virtual {v6, v8}, Lnf;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "HTTP/1.1 "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lls;->a(Ljava/lang/String;)Lls;

    move-result-object v1

    goto :goto_1

    :cond_1
    sget-object v8, Lma;->k:Ljava/util/List;

    invoke-interface {v8, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    sget-object v8, Lkt;->a:Lkt;

    invoke-virtual {v6}, Lnf;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v5, v6, v7}, Lkt;->a(Lke$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance v0, Lkn$a;

    invoke-direct {v0}, Lkn$a;-><init>()V

    sget-object v2, Lkj;->d:Lkj;

    iput-object v2, v0, Lkn$a;->b:Lkj;

    iget v2, v1, Lls;->b:I

    iput v2, v0, Lkn$a;->c:I

    iget-object v1, v1, Lls;->c:Ljava/lang/String;

    iput-object v1, v0, Lkn$a;->d:Ljava/lang/String;

    invoke-virtual {v5}, Lke$a;->a()Lke;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkn$a;->a(Lke;)Lkn$a;

    move-result-object v0

    if-eqz p1, :cond_5

    sget-object p1, Lkt;->a:Lkt;

    invoke-virtual {p1, v0}, Lkt;->a(Lkn$a;)I

    move-result p1

    if-ne p1, v6, :cond_5

    return-object v3

    :cond_5
    return-object v0
.end method

.method public final a(Lkn;)Lko;
    .locals 4

    iget-object v0, p0, Lma;->a:Llh;

    iget-object v0, v0, Llh;->f:Lkc;

    iget-object v0, p0, Lma;->a:Llh;

    iget-object v0, v0, Llh;->e:Ljs;

    invoke-static {}, Lkc;->q()V

    const-string v0, "Content-Type"

    invoke-virtual {p1, v0}, Lkn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Llm;->a(Lkn;)J

    move-result-wide v1

    new-instance p1, Lma$a;

    iget-object v3, p0, Lma;->o:Lmd;

    iget-object v3, v3, Lmd;->g:Lmd$b;

    invoke-direct {p1, p0, v3}, Lma$a;-><init>(Lma;Lns;)V

    new-instance v3, Llp;

    invoke-static {p1}, Lnl;->a(Lns;)Lne;

    move-result-object p1

    invoke-direct {v3, v0, v1, v2, p1}, Llp;-><init>(Ljava/lang/String;JLne;)V

    return-object v3
.end method

.method public final a(Lkl;J)Lnr;
    .locals 0

    iget-object p1, p0, Lma;->o:Lmd;

    invoke-virtual {p1}, Lmd;->d()Lnr;

    move-result-object p1

    return-object p1
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Lma;->n:Lmb;

    iget-object v0, v0, Lmb;->q:Lme;

    invoke-virtual {v0}, Lme;->b()V

    return-void
.end method

.method public final a(Lkl;)V
    .locals 7

    iget-object v0, p0, Lma;->o:Lmd;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lkl;->d:Lkm;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget-object v2, p1, Lkl;->c:Lke;

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, v2, Lke;->a:[Ljava/lang/String;

    array-length v4, v4

    div-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Llx;

    sget-object v5, Llx;->c:Lnf;

    iget-object v6, p1, Lkl;->b:Ljava/lang/String;

    invoke-direct {v4, v5, v6}, Llx;-><init>(Lnf;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Llx;

    sget-object v5, Llx;->d:Lnf;

    iget-object v6, p1, Lkl;->a:Lkf;

    invoke-static {v6}, Llq;->a(Lkf;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Llx;-><init>(Lnf;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v4, "Host"

    invoke-virtual {p1, v4}, Lkl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    new-instance v5, Llx;

    sget-object v6, Llx;->f:Lnf;

    invoke-direct {v5, v6, v4}, Llx;-><init>(Lnf;Ljava/lang/String;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    new-instance v4, Llx;

    sget-object v5, Llx;->e:Lnf;

    iget-object p1, p1, Lkl;->a:Lkf;

    iget-object p1, p1, Lkf;->a:Ljava/lang/String;

    invoke-direct {v4, v5, p1}, Llx;-><init>(Lnf;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, v2, Lke;->a:[Ljava/lang/String;

    array-length p1, p1

    div-int/lit8 p1, p1, 0x2

    :goto_1
    if-ge v1, p1, :cond_4

    invoke-virtual {v2, v1}, Lke;->a(I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v4

    sget-object v5, Lma;->j:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    new-instance v5, Llx;

    invoke-virtual {v2, v1}, Lke;->b(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v4, v6}, Llx;-><init>(Lnf;Ljava/lang/String;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lma;->n:Lmb;

    invoke-virtual {p1, v3, v0}, Lmb;->a(Ljava/util/List;Z)Lmd;

    move-result-object p1

    iput-object p1, p0, Lma;->o:Lmd;

    iget-object p1, p0, Lma;->o:Lmd;

    iget-object p1, p1, Lmd;->i:Lmd$c;

    iget-object v0, p0, Lma;->m:Lkg$a;

    invoke-interface {v0}, Lkg$a;->c()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lnt;->a(JLjava/util/concurrent/TimeUnit;)Lnt;

    iget-object p1, p0, Lma;->o:Lmd;

    iget-object p1, p1, Lmd;->j:Lmd$c;

    iget-object v0, p0, Lma;->m:Lkg$a;

    invoke-interface {v0}, Lkg$a;->d()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lnt;->a(JLjava/util/concurrent/TimeUnit;)Lnt;

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lma;->o:Lmd;

    invoke-virtual {v0}, Lmd;->d()Lnr;

    move-result-object v0

    invoke-interface {v0}, Lnr;->close()V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lma;->o:Lmd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lma;->o:Lmd;

    sget-object v1, Llw;->f:Llw;

    invoke-virtual {v0, v1}, Lmd;->b(Llw;)V

    :cond_0
    return-void
.end method
