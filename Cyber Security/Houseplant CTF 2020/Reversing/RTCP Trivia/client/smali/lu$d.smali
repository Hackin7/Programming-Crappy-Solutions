.class final Llu$d;
.super Ljava/lang/Object;

# interfaces
.implements Lnr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Llu;

.field private final b:Lni;

.field private c:Z

.field private d:J


# direct methods
.method constructor <init>(Llu;J)V
    .locals 1

    iput-object p1, p0, Llu$d;->a:Llu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lni;

    iget-object v0, p0, Llu$d;->a:Llu;

    iget-object v0, v0, Llu;->d:Lnd;

    invoke-interface {v0}, Lnd;->a()Lnt;

    move-result-object v0

    invoke-direct {p1, v0}, Lni;-><init>(Lnt;)V

    iput-object p1, p0, Llu$d;->b:Lni;

    iput-wide p2, p0, Llu$d;->d:J

    return-void
.end method


# virtual methods
.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Llu$d;->b:Lni;

    return-object v0
.end method

.method public final a_(Lnc;J)V
    .locals 3

    iget-boolean v0, p0, Llu$d;->c:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-wide v0, p1, Lnc;->b:J

    invoke-static {v0, v1, p2, p3}, Lkv;->a(JJ)V

    iget-wide v0, p0, Llu$d;->d:J

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expected "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llu$d;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " bytes but received "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Llu$d;->a:Llu;

    iget-object v0, v0, Llu;->d:Lnd;

    invoke-interface {v0, p1, p2, p3}, Lnd;->a_(Lnc;J)V

    iget-wide v0, p0, Llu$d;->d:J

    sub-long/2addr v0, p2

    iput-wide v0, p0, Llu$d;->d:J

    return-void
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, Llu$d;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Llu$d;->c:Z

    iget-wide v0, p0, Llu$d;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Llu$d;->b:Lni;

    invoke-static {v0}, Llu;->a(Lni;)V

    iget-object v0, p0, Llu$d;->a:Llu;

    const/4 v1, 0x3

    iput v1, v0, Llu;->e:I

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-boolean v0, p0, Llu$d;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Llu$d;->a:Llu;

    iget-object v0, v0, Llu;->d:Lnd;

    invoke-interface {v0}, Lnd;->flush()V

    return-void
.end method
