.class final Lmc$a;
.super Ljava/lang/Object;

# interfaces
.implements Lns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:B

.field c:I

.field d:I

.field e:S

.field private final f:Lne;


# direct methods
.method constructor <init>(Lne;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc$a;->f:Lne;

    return-void
.end method


# virtual methods
.method public final a(Lnc;J)J
    .locals 8

    :cond_0
    iget v0, p0, Lmc$a;->d:I

    const-wide/16 v1, -0x1

    if-nez v0, :cond_4

    iget-object v0, p0, Lmc$a;->f:Lne;

    iget-short v3, p0, Lmc$a;->e:S

    int-to-long v3, v3

    invoke-interface {v0, v3, v4}, Lne;->g(J)V

    const/4 v0, 0x0

    iput-short v0, p0, Lmc$a;->e:S

    iget-byte v3, p0, Lmc$a;->b:B

    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_1

    return-wide v1

    :cond_1
    iget v1, p0, Lmc$a;->c:I

    iget-object v2, p0, Lmc$a;->f:Lne;

    invoke-static {v2}, Lmc;->a(Lne;)I

    move-result v2

    iput v2, p0, Lmc$a;->d:I

    iput v2, p0, Lmc$a;->a:I

    iget-object v2, p0, Lmc$a;->f:Lne;

    invoke-interface {v2}, Lne;->f()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    iget-object v3, p0, Lmc$a;->f:Lne;

    invoke-interface {v3}, Lne;->f()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    iput-byte v3, p0, Lmc$a;->b:B

    sget-object v3, Lmc;->a:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    sget-object v3, Lmc;->a:Ljava/util/logging/Logger;

    iget v5, p0, Lmc$a;->c:I

    iget v6, p0, Lmc$a;->a:I

    iget-byte v7, p0, Lmc$a;->b:B

    invoke-static {v4, v5, v6, v2, v7}, Llz;->a(ZIIBB)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_2
    iget-object v3, p0, Lmc$a;->f:Lne;

    invoke-interface {v3}, Lne;->h()I

    move-result v3

    const v5, 0x7fffffff

    and-int/2addr v3, v5

    iput v3, p0, Lmc$a;->c:I

    const/16 v3, 0x9

    if-eq v2, v3, :cond_3

    const-string p1, "%s != TYPE_CONTINUATION"

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p3

    aput-object p3, p2, v0

    invoke-static {p1, p2}, Llz;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_3
    iget v2, p0, Lmc$a;->c:I

    if-eq v2, v1, :cond_0

    const-string p1, "TYPE_CONTINUATION streamId changed"

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Llz;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_4
    iget-object v0, p0, Lmc$a;->f:Lne;

    iget v3, p0, Lmc$a;->d:I

    int-to-long v3, v3

    invoke-static {p2, p3, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v0, p1, p2, p3}, Lne;->a(Lnc;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_5

    return-wide v1

    :cond_5
    iget p3, p0, Lmc$a;->d:I

    int-to-long v0, p3

    sub-long/2addr v0, p1

    long-to-int p3, v0

    iput p3, p0, Lmc$a;->d:I

    return-wide p1
.end method

.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Lmc$a;->f:Lne;

    invoke-interface {v0}, Lne;->a()Lnt;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 0

    return-void
.end method
