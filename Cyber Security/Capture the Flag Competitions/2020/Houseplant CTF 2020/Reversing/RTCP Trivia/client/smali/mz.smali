.class final Lmz;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmz$a;
    }
.end annotation


# instance fields
.field final a:Z

.field final b:Ljava/util/Random;

.field final c:Lnd;

.field final d:Lnc;

.field e:Z

.field final f:Lnc;

.field final g:Lmz$a;

.field h:Z

.field private final i:[B

.field private final j:Lnc$a;


# direct methods
.method constructor <init>(ZLnd;Ljava/util/Random;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnc;

    invoke-direct {v0}, Lnc;-><init>()V

    iput-object v0, p0, Lmz;->f:Lnc;

    new-instance v0, Lmz$a;

    invoke-direct {v0, p0}, Lmz$a;-><init>(Lmz;)V

    iput-object v0, p0, Lmz;->g:Lmz$a;

    if-nez p2, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "sink == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-nez p3, :cond_1

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "random == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput-boolean p1, p0, Lmz;->a:Z

    iput-object p2, p0, Lmz;->c:Lnd;

    invoke-interface {p2}, Lnd;->b()Lnc;

    move-result-object p2

    iput-object p2, p0, Lmz;->d:Lnc;

    iput-object p3, p0, Lmz;->b:Ljava/util/Random;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    const/4 p3, 0x4

    new-array p3, p3, [B

    goto :goto_0

    :cond_2
    move-object p3, p2

    :goto_0
    iput-object p3, p0, Lmz;->i:[B

    if-eqz p1, :cond_3

    new-instance p2, Lnc$a;

    invoke-direct {p2}, Lnc$a;-><init>()V

    :cond_3
    iput-object p2, p0, Lmz;->j:Lnc$a;

    return-void
.end method


# virtual methods
.method final a(IJZZ)V
    .locals 7

    iget-boolean v0, p0, Lmz;->e:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    if-eqz p5, :cond_2

    or-int/lit16 p1, p1, 0x80

    :cond_2
    iget-object p4, p0, Lmz;->d:Lnc;

    invoke-virtual {p4, p1}, Lnc;->b(I)Lnc;

    iget-boolean p1, p0, Lmz;->a:Z

    if-eqz p1, :cond_3

    const/16 v0, 0x80

    :cond_3
    const-wide/16 p4, 0x7d

    cmp-long p1, p2, p4

    if-gtz p1, :cond_4

    long-to-int p1, p2

    or-int/2addr p1, v0

    iget-object p4, p0, Lmz;->d:Lnc;

    invoke-virtual {p4, p1}, Lnc;->b(I)Lnc;

    goto/16 :goto_1

    :cond_4
    const-wide/32 p4, 0xffff

    cmp-long p1, p2, p4

    if-gtz p1, :cond_5

    or-int/lit8 p1, v0, 0x7e

    iget-object p4, p0, Lmz;->d:Lnc;

    invoke-virtual {p4, p1}, Lnc;->b(I)Lnc;

    iget-object p1, p0, Lmz;->d:Lnc;

    long-to-int p4, p2

    invoke-virtual {p1, p4}, Lnc;->c(I)Lnc;

    goto :goto_1

    :cond_5
    or-int/lit8 p1, v0, 0x7f

    iget-object p4, p0, Lmz;->d:Lnc;

    invoke-virtual {p4, p1}, Lnc;->b(I)Lnc;

    iget-object p1, p0, Lmz;->d:Lnc;

    const/16 p4, 0x8

    invoke-virtual {p1, p4}, Lnc;->e(I)Lno;

    move-result-object p5

    iget-object v0, p5, Lno;->a:[B

    iget v1, p5, Lno;->c:I

    add-int/lit8 v2, v1, 0x1

    const/16 v3, 0x38

    ushr-long v3, p2, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    const/16 v3, 0x30

    ushr-long v3, p2, v3

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x1

    const/16 v3, 0x28

    ushr-long v3, p2, v3

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    const/16 v3, 0x20

    ushr-long v3, p2, v3

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x1

    const/16 v3, 0x18

    ushr-long v3, p2, v3

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    const/16 v3, 0x10

    ushr-long v3, p2, v3

    and-long/2addr v3, v5

    long-to-int v3, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v1, 0x1

    ushr-long v3, p2, p4

    and-long/2addr v3, v5

    long-to-int p4, v3

    int-to-byte p4, p4

    aput-byte p4, v0, v1

    add-int/lit8 p4, v2, 0x1

    and-long v3, p2, v5

    long-to-int v1, v3

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    iput p4, p5, Lno;->c:I

    iget-wide p4, p1, Lnc;->b:J

    const-wide/16 v0, 0x8

    add-long/2addr p4, v0

    iput-wide p4, p1, Lnc;->b:J

    :goto_1
    iget-boolean p1, p0, Lmz;->a:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lmz;->b:Ljava/util/Random;

    iget-object p4, p0, Lmz;->i:[B

    invoke-virtual {p1, p4}, Ljava/util/Random;->nextBytes([B)V

    iget-object p1, p0, Lmz;->d:Lnc;

    iget-object p4, p0, Lmz;->i:[B

    invoke-virtual {p1, p4}, Lnc;->b([B)Lnc;

    const-wide/16 p4, 0x0

    cmp-long p1, p2, p4

    if-lez p1, :cond_7

    iget-object p1, p0, Lmz;->d:Lnc;

    iget-wide p4, p1, Lnc;->b:J

    iget-object p1, p0, Lmz;->d:Lnc;

    iget-object v0, p0, Lmz;->f:Lnc;

    invoke-virtual {p1, v0, p2, p3}, Lnc;->a_(Lnc;J)V

    iget-object p1, p0, Lmz;->d:Lnc;

    iget-object p2, p0, Lmz;->j:Lnc$a;

    invoke-virtual {p1, p2}, Lnc;->a(Lnc$a;)Lnc$a;

    iget-object p1, p0, Lmz;->j:Lnc$a;

    invoke-virtual {p1, p4, p5}, Lnc$a;->a(J)I

    iget-object p1, p0, Lmz;->j:Lnc$a;

    iget-object p2, p0, Lmz;->i:[B

    invoke-static {p1, p2}, Lmx;->a(Lnc$a;[B)V

    iget-object p1, p0, Lmz;->j:Lnc$a;

    invoke-virtual {p1}, Lnc$a;->close()V

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lmz;->d:Lnc;

    iget-object p4, p0, Lmz;->f:Lnc;

    invoke-virtual {p1, p4, p2, p3}, Lnc;->a_(Lnc;J)V

    :cond_7
    :goto_2
    iget-object p1, p0, Lmz;->c:Lnd;

    invoke-interface {p1}, Lnd;->c()Lnd;

    return-void
.end method

.method final a(ILnf;)V
    .locals 5

    iget-boolean v0, p0, Lmz;->e:Z

    if-eqz v0, :cond_0

    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p2}, Lnf;->g()I

    move-result v0

    int-to-long v1, v0

    const-wide/16 v3, 0x7d

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Payload size must be less than or equal to 125"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/16 v1, 0x80

    or-int/2addr p1, v1

    iget-object v1, p0, Lmz;->d:Lnc;

    invoke-virtual {v1, p1}, Lnc;->b(I)Lnc;

    iget-boolean p1, p0, Lmz;->a:Z

    if-eqz p1, :cond_2

    or-int/lit16 p1, v0, 0x80

    iget-object v1, p0, Lmz;->d:Lnc;

    invoke-virtual {v1, p1}, Lnc;->b(I)Lnc;

    iget-object p1, p0, Lmz;->b:Ljava/util/Random;

    iget-object v1, p0, Lmz;->i:[B

    invoke-virtual {p1, v1}, Ljava/util/Random;->nextBytes([B)V

    iget-object p1, p0, Lmz;->d:Lnc;

    iget-object v1, p0, Lmz;->i:[B

    invoke-virtual {p1, v1}, Lnc;->b([B)Lnc;

    if-lez v0, :cond_3

    iget-object p1, p0, Lmz;->d:Lnc;

    iget-wide v0, p1, Lnc;->b:J

    iget-object p1, p0, Lmz;->d:Lnc;

    invoke-virtual {p1, p2}, Lnc;->a(Lnf;)Lnc;

    iget-object p1, p0, Lmz;->d:Lnc;

    iget-object p2, p0, Lmz;->j:Lnc$a;

    invoke-virtual {p1, p2}, Lnc;->a(Lnc$a;)Lnc$a;

    iget-object p1, p0, Lmz;->j:Lnc$a;

    invoke-virtual {p1, v0, v1}, Lnc$a;->a(J)I

    iget-object p1, p0, Lmz;->j:Lnc$a;

    iget-object p2, p0, Lmz;->i:[B

    invoke-static {p1, p2}, Lmx;->a(Lnc$a;[B)V

    iget-object p1, p0, Lmz;->j:Lnc$a;

    invoke-virtual {p1}, Lnc$a;->close()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lmz;->d:Lnc;

    invoke-virtual {p1, v0}, Lnc;->b(I)Lnc;

    iget-object p1, p0, Lmz;->d:Lnc;

    invoke-virtual {p1, p2}, Lnc;->a(Lnf;)Lnc;

    :cond_3
    :goto_0
    iget-object p1, p0, Lmz;->c:Lnd;

    invoke-interface {p1}, Lnd;->flush()V

    return-void
.end method
