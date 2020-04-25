.class public final Lnc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;
.implements Lnd;
.implements Lne;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnc$a;
    }
.end annotation


# static fields
.field private static final c:[B


# instance fields
.field a:Lno;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lnc;->c:[B

    return-void

    :array_0
    .array-data 1
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x0

    move-wide v4, p1

    invoke-static/range {v0 .. v5}, Lnu;->a(JJJ)V

    if-nez p3, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "charset == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "byteCount > Integer.MAX_VALUE: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_2

    const-string p1, ""

    return-object p1

    :cond_2
    iget-object v0, p0, Lnc;->a:Lno;

    iget v1, v0, Lno;->b:I

    int-to-long v1, v1

    add-long/2addr v1, p1

    iget v3, v0, Lno;->c:I

    int-to-long v3, v3

    cmp-long v1, v1, v3

    if-lez v1, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lnc;->f(J)[B

    move-result-object p1

    invoke-direct {v0, p1, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0

    :cond_3
    new-instance v1, Ljava/lang/String;

    iget-object v2, v0, Lno;->a:[B

    iget v3, v0, Lno;->b:I

    long-to-int v4, p1

    invoke-direct {v1, v2, v3, v4, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget p3, v0, Lno;->b:I

    int-to-long v2, p3

    add-long/2addr v2, p1

    long-to-int p3, v2

    iput p3, v0, Lno;->b:I

    iget-wide v2, p0, Lnc;->b:J

    sub-long/2addr v2, p1

    iput-wide v2, p0, Lnc;->b:J

    iget p1, v0, Lno;->b:I

    iget p2, v0, Lno;->c:I

    if-ne p1, p2, :cond_4

    invoke-virtual {v0}, Lno;->c()Lno;

    move-result-object p1

    iput-object p1, p0, Lnc;->a:Lno;

    invoke-static {v0}, Lnp;->a(Lno;)V

    :cond_4
    return-object v1
.end method

.method private l(J)Ljava/lang/String;
    .locals 1

    sget-object v0, Lnu;->a:Ljava/nio/charset/Charset;

    invoke-direct {p0, p1, p2, v0}, Lnc;->a(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a([BII)I
    .locals 7

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lnu;->a(JJJ)V

    iget-object v0, p0, Lnc;->a:Lno;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget v1, v0, Lno;->c:I

    iget v2, v0, Lno;->b:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v1, v0, Lno;->a:[B

    iget v2, v0, Lno;->b:I

    invoke-static {v1, v2, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, v0, Lno;->b:I

    add-int/2addr p1, p3

    iput p1, v0, Lno;->b:I

    iget-wide p1, p0, Lnc;->b:J

    int-to-long v1, p3

    sub-long/2addr p1, v1

    iput-wide p1, p0, Lnc;->b:J

    iget p1, v0, Lno;->b:I

    iget p2, v0, Lno;->c:I

    if-ne p1, p2, :cond_1

    invoke-virtual {v0}, Lno;->c()Lno;

    move-result-object p1

    iput-object p1, p0, Lnc;->a:Lno;

    invoke-static {v0}, Lnp;->a(Lno;)V

    :cond_1
    return p3
.end method

.method public final a(BJJ)J
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_9

    cmp-long v2, p4, p2

    if-gez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-wide v2, p0, Lnc;->b:J

    cmp-long v2, p4, v2

    if-lez v2, :cond_1

    iget-wide p4, p0, Lnc;->b:J

    :cond_1
    cmp-long v2, p2, p4

    const-wide/16 v3, -0x1

    if-nez v2, :cond_2

    return-wide v3

    :cond_2
    iget-object v2, p0, Lnc;->a:Lno;

    if-nez v2, :cond_3

    return-wide v3

    :cond_3
    iget-wide v5, p0, Lnc;->b:J

    sub-long/2addr v5, p2

    cmp-long v5, v5, p2

    if-gez v5, :cond_4

    iget-wide v0, p0, Lnc;->b:J

    :goto_0
    cmp-long v5, v0, p2

    if-lez v5, :cond_5

    iget-object v2, v2, Lno;->g:Lno;

    iget v5, v2, Lno;->c:I

    iget v6, v2, Lno;->b:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    sub-long/2addr v0, v5

    goto :goto_0

    :cond_4
    :goto_1
    iget v5, v2, Lno;->c:I

    iget v6, v2, Lno;->b:I

    sub-int/2addr v5, v6

    int-to-long v5, v5

    add-long/2addr v5, v0

    cmp-long v7, v5, p2

    if-gez v7, :cond_5

    iget-object v2, v2, Lno;->f:Lno;

    move-wide v0, v5

    goto :goto_1

    :cond_5
    :goto_2
    cmp-long v5, v0, p4

    if-gez v5, :cond_8

    iget-object v5, v2, Lno;->a:[B

    iget v6, v2, Lno;->c:I

    int-to-long v6, v6

    iget v8, v2, Lno;->b:I

    int-to-long v8, v8

    add-long/2addr v8, p4

    sub-long/2addr v8, v0

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v6, v6

    iget v7, v2, Lno;->b:I

    int-to-long v7, v7

    add-long/2addr v7, p2

    sub-long/2addr v7, v0

    long-to-int p2, v7

    :goto_3
    if-ge p2, v6, :cond_7

    aget-byte p3, v5, p2

    if-ne p3, p1, :cond_6

    iget p1, v2, Lno;->b:I

    sub-int/2addr p2, p1

    int-to-long p1, p2

    add-long/2addr p1, v0

    return-wide p1

    :cond_6
    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_7
    iget p2, v2, Lno;->c:I

    iget p3, v2, Lno;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    add-long/2addr p2, v0

    iget-object v2, v2, Lno;->f:Lno;

    move-wide v0, p2

    goto :goto_2

    :cond_8
    return-wide v3

    :cond_9
    :goto_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "size=%s fromIndex=%s toIndex=%s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-wide v3, p0, Lnc;->b:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, v1, p3

    const/4 p2, 0x2

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, v1, p2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Lnc;J)J
    .locals 4

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "sink == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-gez v2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "byteCount < 0: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v2, p0, Lnc;->b:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_2

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_2
    iget-wide v0, p0, Lnc;->b:J

    cmp-long v0, p2, v0

    if-lez v0, :cond_3

    iget-wide p2, p0, Lnc;->b:J

    :cond_3
    invoke-virtual {p1, p0, p2, p3}, Lnc;->a_(Lnc;J)V

    return-wide p2
.end method

.method public final a(Lns;)J
    .locals 6

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    const-wide/16 v2, 0x2000

    invoke-interface {p1, p0, v2, v3}, Lns;->a(Lnc;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    add-long/2addr v0, v2

    goto :goto_0

    :cond_1
    return-wide v0
.end method

.method public final a(Lnc$a;)Lnc$a;
    .locals 1

    iget-object v0, p1, Lnc$a;->a:Lnc;

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "already attached to a buffer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p0, p1, Lnc$a;->a:Lnc;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lnc$a;->b:Z

    return-object p1
.end method

.method public final a(I)Lnc;
    .locals 3

    const/16 v0, 0x80

    if-ge p1, v0, :cond_0

    :goto_0
    invoke-virtual {p0, p1}, Lnc;->b(I)Lnc;

    return-object p0

    :cond_0
    const/16 v1, 0x800

    const/16 v2, 0x3f

    if-ge p1, v1, :cond_1

    shr-int/lit8 v1, p1, 0x6

    or-int/lit16 v1, v1, 0xc0

    :goto_1
    invoke-virtual {p0, v1}, Lnc;->b(I)Lnc;

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    goto :goto_0

    :cond_1
    const/high16 v1, 0x10000

    if-ge p1, v1, :cond_3

    const v1, 0xd800

    if-lt p1, v1, :cond_2

    const v1, 0xdfff

    if-gt p1, v1, :cond_2

    invoke-virtual {p0, v2}, Lnc;->b(I)Lnc;

    return-object p0

    :cond_2
    shr-int/lit8 v1, p1, 0xc

    or-int/lit16 v1, v1, 0xe0

    :goto_2
    invoke-virtual {p0, v1}, Lnc;->b(I)Lnc;

    shr-int/lit8 v1, p1, 0x6

    and-int/2addr v1, v2

    or-int/2addr v1, v0

    goto :goto_1

    :cond_3
    const v1, 0x10ffff

    if-gt p1, v1, :cond_4

    shr-int/lit8 v1, p1, 0x12

    or-int/lit16 v1, v1, 0xf0

    invoke-virtual {p0, v1}, Lnc;->b(I)Lnc;

    shr-int/lit8 v1, p1, 0xc

    and-int/2addr v1, v2

    or-int/2addr v1, v0

    goto :goto_2

    return-object p0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected code point: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(Ljava/lang/String;)Lnc;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lnc;->a(Ljava/lang/String;II)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;II)Lnc;
    .locals 7

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "string == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-gez p2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "beginIndex < 0: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-ge p3, p2, :cond_2

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "endIndex < beginIndex: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " < "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-le p3, v0, :cond_3

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "endIndex > string.length: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " > "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_0
    if-ge p2, p3, :cond_c

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_5

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lnc;->e(I)Lno;

    move-result-object v2

    iget-object v3, v2, Lno;->a:[B

    iget v4, v2, Lno;->c:I

    sub-int/2addr v4, p2

    rsub-int v5, v4, 0x2000

    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/lit8 v6, p2, 0x1

    add-int/2addr p2, v4

    int-to-byte v0, v0

    aput-byte v0, v3, p2

    :goto_1
    move p2, v6

    if-ge p2, v5, :cond_4

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ge v0, v1, :cond_4

    add-int/lit8 v6, p2, 0x1

    add-int/2addr p2, v4

    int-to-byte v0, v0

    aput-byte v0, v3, p2

    goto :goto_1

    :cond_4
    add-int/2addr v4, p2

    iget v0, v2, Lno;->c:I

    sub-int/2addr v4, v0

    iget v0, v2, Lno;->c:I

    add-int/2addr v0, v4

    iput v0, v2, Lno;->c:I

    iget-wide v0, p0, Lnc;->b:J

    int-to-long v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lnc;->b:J

    goto :goto_0

    :cond_5
    const/16 v2, 0x800

    if-ge v0, v2, :cond_6

    shr-int/lit8 v2, v0, 0x6

    or-int/lit16 v2, v2, 0xc0

    :goto_2
    invoke-virtual {p0, v2}, Lnc;->b(I)Lnc;

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lnc;->b(I)Lnc;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_6
    const v2, 0xd800

    const/16 v3, 0x3f

    if-lt v0, v2, :cond_b

    const v2, 0xdfff

    if-le v0, v2, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v4, p2, 0x1

    if-ge v4, p3, :cond_8

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    goto :goto_3

    :cond_8
    const/4 v5, 0x0

    :goto_3
    const v6, 0xdbff

    if-gt v0, v6, :cond_a

    const v6, 0xdc00

    if-lt v5, v6, :cond_a

    if-le v5, v2, :cond_9

    goto :goto_4

    :cond_9
    const/high16 v2, 0x10000

    const v4, -0xd801

    and-int/2addr v0, v4

    shl-int/lit8 v0, v0, 0xa

    const v4, -0xdc01

    and-int/2addr v4, v5

    or-int/2addr v0, v4

    add-int/2addr v2, v0

    shr-int/lit8 v0, v2, 0x12

    or-int/lit16 v0, v0, 0xf0

    invoke-virtual {p0, v0}, Lnc;->b(I)Lnc;

    shr-int/lit8 v0, v2, 0xc

    and-int/2addr v0, v3

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lnc;->b(I)Lnc;

    shr-int/lit8 v0, v2, 0x6

    and-int/2addr v0, v3

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lnc;->b(I)Lnc;

    and-int/lit8 v0, v2, 0x3f

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lnc;->b(I)Lnc;

    add-int/lit8 p2, p2, 0x2

    goto/16 :goto_0

    :cond_a
    :goto_4
    invoke-virtual {p0, v3}, Lnc;->b(I)Lnc;

    move p2, v4

    goto/16 :goto_0

    :cond_b
    :goto_5
    shr-int/lit8 v2, v0, 0xc

    or-int/lit16 v2, v2, 0xe0

    invoke-virtual {p0, v2}, Lnc;->b(I)Lnc;

    shr-int/lit8 v2, v0, 0x6

    and-int/2addr v2, v3

    or-int/2addr v2, v1

    goto :goto_2

    :cond_c
    return-object p0
.end method

.method public final a(Lnc;JJ)Lnc;
    .locals 6

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "out == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-wide v0, p0, Lnc;->b:J

    move-wide v2, p2

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, Lnu;->a(JJJ)V

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-nez v2, :cond_1

    return-object p0

    :cond_1
    iget-wide v2, p1, Lnc;->b:J

    add-long/2addr v2, p4

    iput-wide v2, p1, Lnc;->b:J

    iget-object v2, p0, Lnc;->a:Lno;

    :goto_0
    iget v3, v2, Lno;->c:I

    iget v4, v2, Lno;->b:I

    sub-int/2addr v3, v4

    int-to-long v3, v3

    cmp-long v3, p2, v3

    if-ltz v3, :cond_2

    iget v3, v2, Lno;->c:I

    iget v4, v2, Lno;->b:I

    sub-int/2addr v3, v4

    int-to-long v3, v3

    sub-long/2addr p2, v3

    iget-object v2, v2, Lno;->f:Lno;

    goto :goto_0

    :cond_2
    :goto_1
    cmp-long v3, p4, v0

    if-lez v3, :cond_4

    invoke-virtual {v2}, Lno;->a()Lno;

    move-result-object v3

    iget v4, v3, Lno;->b:I

    int-to-long v4, v4

    add-long/2addr v4, p2

    long-to-int p2, v4

    iput p2, v3, Lno;->b:I

    iget p2, v3, Lno;->b:I

    long-to-int p3, p4

    add-int/2addr p2, p3

    iget p3, v3, Lno;->c:I

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, v3, Lno;->c:I

    iget-object p2, p1, Lnc;->a:Lno;

    if-nez p2, :cond_3

    iput-object v3, v3, Lno;->g:Lno;

    iput-object v3, v3, Lno;->f:Lno;

    iput-object v3, p1, Lnc;->a:Lno;

    goto :goto_2

    :cond_3
    iget-object p2, p1, Lnc;->a:Lno;

    iget-object p2, p2, Lno;->g:Lno;

    invoke-virtual {p2, v3}, Lno;->a(Lno;)Lno;

    :goto_2
    iget p2, v3, Lno;->c:I

    iget p3, v3, Lno;->b:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    sub-long/2addr p4, p2

    iget-object v2, v2, Lno;->f:Lno;

    move-wide p2, v0

    goto :goto_1

    :cond_4
    return-object p0
.end method

.method public final a(Lnf;)Lnc;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "byteString == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p1, p0}, Lnf;->a(Lnc;)V

    return-object p0
.end method

.method public final a()Lnt;
    .locals 1

    sget-object v0, Lnt;->c:Lnt;

    return-object v0
.end method

.method public final a(J)V
    .locals 2

    iget-wide v0, p0, Lnc;->b:J

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_0
    return-void
.end method

.method public final a([B)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    array-length v1, p1

    sub-int/2addr v1, v0

    invoke-virtual {p0, p1, v0, v1}, Lnc;->a([BII)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_0
    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final a_(Lnc;J)V
    .locals 7

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "source == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-ne p1, p0, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "source == this"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v0, p1, Lnc;->b:J

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Lnu;->a(JJJ)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_d

    iget-object v0, p1, Lnc;->a:Lno;

    iget v0, v0, Lno;->c:I

    iget-object v1, p1, Lnc;->a:Lno;

    iget v1, v1, Lno;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    cmp-long v0, p2, v0

    const/4 v1, 0x0

    if-gez v0, :cond_8

    iget-object v0, p0, Lnc;->a:Lno;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnc;->a:Lno;

    iget-object v0, v0, Lno;->g:Lno;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    iget-boolean v2, v0, Lno;->e:Z

    if-eqz v2, :cond_4

    iget v2, v0, Lno;->c:I

    int-to-long v2, v2

    add-long/2addr v2, p2

    iget-boolean v4, v0, Lno;->d:Z

    if-eqz v4, :cond_3

    move v4, v1

    goto :goto_2

    :cond_3
    iget v4, v0, Lno;->b:I

    :goto_2
    int-to-long v4, v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x2000

    cmp-long v2, v2, v4

    if-gtz v2, :cond_4

    iget-object v1, p1, Lnc;->a:Lno;

    long-to-int v2, p2

    invoke-virtual {v1, v0, v2}, Lno;->a(Lno;I)V

    iget-wide v0, p1, Lnc;->b:J

    sub-long/2addr v0, p2

    iput-wide v0, p1, Lnc;->b:J

    iget-wide v0, p0, Lnc;->b:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lnc;->b:J

    return-void

    :cond_4
    iget-object v0, p1, Lnc;->a:Lno;

    long-to-int v2, p2

    if-lez v2, :cond_7

    iget v3, v0, Lno;->c:I

    iget v4, v0, Lno;->b:I

    sub-int/2addr v3, v4

    if-le v2, v3, :cond_5

    goto :goto_4

    :cond_5
    const/16 v3, 0x400

    if-lt v2, v3, :cond_6

    invoke-virtual {v0}, Lno;->a()Lno;

    move-result-object v3

    goto :goto_3

    :cond_6
    invoke-static {}, Lnp;->a()Lno;

    move-result-object v3

    iget-object v4, v0, Lno;->a:[B

    iget v5, v0, Lno;->b:I

    iget-object v6, v3, Lno;->a:[B

    invoke-static {v4, v5, v6, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_3
    iget v4, v3, Lno;->b:I

    add-int/2addr v4, v2

    iput v4, v3, Lno;->c:I

    iget v4, v0, Lno;->b:I

    add-int/2addr v4, v2

    iput v4, v0, Lno;->b:I

    iget-object v0, v0, Lno;->g:Lno;

    invoke-virtual {v0, v3}, Lno;->a(Lno;)Lno;

    iput-object v3, p1, Lnc;->a:Lno;

    goto :goto_5

    :cond_7
    :goto_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_8
    :goto_5
    iget-object v0, p1, Lnc;->a:Lno;

    iget v2, v0, Lno;->c:I

    iget v3, v0, Lno;->b:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    invoke-virtual {v0}, Lno;->c()Lno;

    move-result-object v4

    iput-object v4, p1, Lnc;->a:Lno;

    iget-object v4, p0, Lnc;->a:Lno;

    if-nez v4, :cond_9

    iput-object v0, p0, Lnc;->a:Lno;

    iget-object v0, p0, Lnc;->a:Lno;

    iget-object v1, p0, Lnc;->a:Lno;

    iget-object v4, p0, Lnc;->a:Lno;

    iput-object v4, v1, Lno;->g:Lno;

    iput-object v4, v0, Lno;->f:Lno;

    goto :goto_7

    :cond_9
    iget-object v4, p0, Lnc;->a:Lno;

    iget-object v4, v4, Lno;->g:Lno;

    invoke-virtual {v4, v0}, Lno;->a(Lno;)Lno;

    move-result-object v0

    iget-object v4, v0, Lno;->g:Lno;

    if-ne v4, v0, :cond_a

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_a
    iget-object v4, v0, Lno;->g:Lno;

    iget-boolean v4, v4, Lno;->e:Z

    if-eqz v4, :cond_c

    iget v4, v0, Lno;->c:I

    iget v5, v0, Lno;->b:I

    sub-int/2addr v4, v5

    iget-object v5, v0, Lno;->g:Lno;

    iget v5, v5, Lno;->c:I

    rsub-int v5, v5, 0x2000

    iget-object v6, v0, Lno;->g:Lno;

    iget-boolean v6, v6, Lno;->d:Z

    if-eqz v6, :cond_b

    goto :goto_6

    :cond_b
    iget-object v1, v0, Lno;->g:Lno;

    iget v1, v1, Lno;->b:I

    :goto_6
    add-int/2addr v5, v1

    if-gt v4, v5, :cond_c

    iget-object v1, v0, Lno;->g:Lno;

    invoke-virtual {v0, v1, v4}, Lno;->a(Lno;I)V

    invoke-virtual {v0}, Lno;->c()Lno;

    invoke-static {v0}, Lnp;->a(Lno;)V

    :cond_c
    :goto_7
    iget-wide v0, p1, Lnc;->b:J

    sub-long/2addr v0, v2

    iput-wide v0, p1, Lnc;->b:J

    iget-wide v0, p0, Lnc;->b:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lnc;->b:J

    sub-long/2addr p2, v2

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method public final b(J)B
    .locals 6

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v4, 0x1

    move-wide v2, p1

    invoke-static/range {v0 .. v5}, Lnu;->a(JJJ)V

    iget-wide v0, p0, Lnc;->b:J

    sub-long/2addr v0, p1

    cmp-long v0, v0, p1

    if-lez v0, :cond_1

    iget-object v0, p0, Lnc;->a:Lno;

    :goto_0
    iget v1, v0, Lno;->c:I

    iget v2, v0, Lno;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    cmp-long v3, p1, v1

    if-gez v3, :cond_0

    iget-object v1, v0, Lno;->a:[B

    iget v0, v0, Lno;->b:I

    long-to-int p1, p1

    add-int/2addr v0, p1

    aget-byte p1, v1, v0

    return p1

    :cond_0
    sub-long/2addr p1, v1

    iget-object v0, v0, Lno;->f:Lno;

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lnc;->b:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Lnc;->a:Lno;

    :cond_2
    iget-object v0, v0, Lno;->g:Lno;

    iget v1, v0, Lno;->c:I

    iget v2, v0, Lno;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    add-long/2addr p1, v1

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    if-ltz v1, :cond_2

    iget-object v1, v0, Lno;->a:[B

    iget v0, v0, Lno;->b:I

    long-to-int p1, p1

    add-int/2addr v0, p1

    aget-byte p1, v1, v0

    return p1
.end method

.method public final b()Lnc;
    .locals 0

    return-object p0
.end method

.method public final b(I)Lnc;
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnc;->e(I)Lno;

    move-result-object v0

    iget-object v1, v0, Lno;->a:[B

    iget v2, v0, Lno;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lno;->c:I

    int-to-byte p1, p1

    aput-byte p1, v1, v2

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lnc;->b:J

    return-object p0
.end method

.method public final b([B)Lnc;
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lnc;->b([BII)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final b([BII)Lnc;
    .locals 9

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "source == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v7, p3

    move-wide v5, v7

    invoke-static/range {v1 .. v6}, Lnu;->a(JJJ)V

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnc;->e(I)Lno;

    move-result-object v0

    sub-int v1, p3, p2

    iget v2, v0, Lno;->c:I

    rsub-int v2, v2, 0x2000

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, v0, Lno;->a:[B

    iget v3, v0, Lno;->c:I

    invoke-static {p1, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v1

    iget v2, v0, Lno;->c:I

    add-int/2addr v2, v1

    iput v2, v0, Lno;->c:I

    goto :goto_0

    :cond_1
    iget-wide p1, p0, Lnc;->b:J

    add-long/2addr p1, v7

    iput-wide p1, p0, Lnc;->b:J

    return-object p0
.end method

.method public final synthetic b(Ljava/lang/String;)Lnd;
    .locals 0

    invoke-virtual {p0, p1}, Lnc;->a(Ljava/lang/String;)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lnf;)Lnd;
    .locals 0

    invoke-virtual {p0, p1}, Lnc;->a(Lnf;)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lnc;J)V
    .locals 2

    iget-wide v0, p0, Lnc;->b:J

    cmp-long v0, v0, p2

    if-gez v0, :cond_0

    iget-wide p2, p0, Lnc;->b:J

    invoke-virtual {p1, p0, p2, p3}, Lnc;->a_(Lnc;J)V

    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_0
    invoke-virtual {p1, p0, p2, p3}, Lnc;->a_(Lnc;J)V

    return-void
.end method

.method public final c(I)Lnc;
    .locals 5

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lnc;->e(I)Lno;

    move-result-object v0

    iget-object v1, v0, Lno;->a:[B

    iget v2, v0, Lno;->c:I

    add-int/lit8 v3, v2, 0x1

    ushr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v2, v3, 0x1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v1, v3

    iput v2, v0, Lno;->c:I

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lnc;->b:J

    return-object p0
.end method

.method public final c()Lnd;
    .locals 0

    return-object p0
.end method

.method public final synthetic c([B)Lnd;
    .locals 0

    invoke-virtual {p0, p1}, Lnc;->b([B)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c([BII)Lnd;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lnc;->b([BII)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final c(J)Lnf;
    .locals 1

    new-instance v0, Lnf;

    invoke-virtual {p0, p1, p2}, Lnc;->f(J)[B

    move-result-object p1

    invoke-direct {v0, p1}, Lnf;-><init>([B)V

    return-object v0
.end method

.method public final synthetic clone()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lnc;

    invoke-direct {v0}, Lnc;-><init>()V

    iget-wide v1, p0, Lnc;->b:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lnc;->a:Lno;

    invoke-virtual {v1}, Lno;->a()Lno;

    move-result-object v1

    iput-object v1, v0, Lnc;->a:Lno;

    iget-object v1, v0, Lnc;->a:Lno;

    iget-object v2, v0, Lnc;->a:Lno;

    iget-object v3, v0, Lnc;->a:Lno;

    iput-object v3, v2, Lno;->g:Lno;

    iput-object v3, v1, Lno;->f:Lno;

    iget-object v1, p0, Lnc;->a:Lno;

    :goto_0
    iget-object v1, v1, Lno;->f:Lno;

    iget-object v2, p0, Lnc;->a:Lno;

    if-eq v1, v2, :cond_1

    iget-object v2, v0, Lnc;->a:Lno;

    iget-object v2, v2, Lno;->g:Lno;

    invoke-virtual {v1}, Lno;->a()Lno;

    move-result-object v3

    invoke-virtual {v2, v3}, Lno;->a(Lno;)Lno;

    goto :goto_0

    :cond_1
    iget-wide v1, p0, Lnc;->b:J

    iput-wide v1, v0, Lnc;->b:J

    return-object v0
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final d(J)Ljava/lang/String;
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "limit < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p1, v0

    const-wide/16 v3, 0x1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    add-long v0, p1, v3

    :goto_0
    const/16 v6, 0xa

    const-wide/16 v7, 0x0

    move-object v5, p0

    move-wide v9, v0

    invoke-virtual/range {v5 .. v10}, Lnc;->a(BJJ)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v2, v5, v7

    if-eqz v2, :cond_2

    invoke-virtual {p0, v5, v6}, Lnc;->e(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    iget-wide v5, p0, Lnc;->b:J

    cmp-long v2, v0, v5

    if-gez v2, :cond_3

    sub-long v2, v0, v3

    invoke-virtual {p0, v2, v3}, Lnc;->b(J)B

    move-result v2

    const/16 v3, 0xd

    if-ne v2, v3, :cond_3

    invoke-virtual {p0, v0, v1}, Lnc;->b(J)B

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_3

    invoke-virtual {p0, v0, v1}, Lnc;->e(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v6, Lnc;

    invoke-direct {v6}, Lnc;-><init>()V

    const-wide/16 v2, 0x0

    const-wide/16 v0, 0x20

    iget-wide v4, p0, Lnc;->b:J

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    move-object v0, p0

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lnc;->a(Lnc;JJ)Lnc;

    new-instance v0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\\n not found: limit="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lnc;->b:J

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " content="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lnc;->m()Lnf;

    move-result-object p1

    invoke-virtual {p1}, Lnf;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2026

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(I)Lnc;
    .locals 5

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lnc;->e(I)Lno;

    move-result-object v0

    iget-object v1, v0, Lno;->a:[B

    iget v2, v0, Lno;->c:I

    add-int/lit8 v3, v2, 0x1

    ushr-int/lit8 v4, p1, 0x18

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v2, v3, 0x1

    ushr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    add-int/lit8 v3, v2, 0x1

    ushr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v2, v3, 0x1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v1, v3

    iput v2, v0, Lno;->c:I

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lnc;->b:J

    return-object p0
.end method

.method public final d()Z
    .locals 4

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()J
    .locals 5

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-object v2, p0, Lnc;->a:Lno;

    iget-object v2, v2, Lno;->g:Lno;

    iget v3, v2, Lno;->c:I

    const/16 v4, 0x2000

    if-ge v3, v4, :cond_1

    iget-boolean v3, v2, Lno;->e:Z

    if-eqz v3, :cond_1

    iget v3, v2, Lno;->c:I

    iget v2, v2, Lno;->b:I

    sub-int/2addr v3, v2

    int-to-long v2, v3

    sub-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method

.method final e(J)Ljava/lang/String;
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const-wide/16 v1, 0x1

    if-lez v0, :cond_0

    sub-long v3, p1, v1

    invoke-virtual {p0, v3, v4}, Lnc;->b(J)B

    move-result v0

    const/16 v5, 0xd

    if-ne v0, v5, :cond_0

    invoke-direct {p0, v3, v4}, Lnc;->l(J)Ljava/lang/String;

    move-result-object p1

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lnc;->g(J)V

    return-object p1

    :cond_0
    invoke-direct {p0, p1, p2}, Lnc;->l(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1, v2}, Lnc;->g(J)V

    return-object p1
.end method

.method public final e(I)Lno;
    .locals 3

    if-lez p1, :cond_4

    const/16 v0, 0x2000

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lnc;->a:Lno;

    if-nez v1, :cond_1

    invoke-static {}, Lnp;->a()Lno;

    move-result-object p1

    iput-object p1, p0, Lnc;->a:Lno;

    iget-object p1, p0, Lnc;->a:Lno;

    iget-object v0, p0, Lnc;->a:Lno;

    iget-object v1, p0, Lnc;->a:Lno;

    iput-object v1, v0, Lno;->g:Lno;

    iput-object v1, p1, Lno;->f:Lno;

    return-object v1

    :cond_1
    iget-object v1, p0, Lnc;->a:Lno;

    iget-object v1, v1, Lno;->g:Lno;

    iget v2, v1, Lno;->c:I

    add-int/2addr v2, p1

    if-gt v2, v0, :cond_2

    iget-boolean p1, v1, Lno;->e:Z

    if-nez p1, :cond_3

    :cond_2
    invoke-static {}, Lnp;->a()Lno;

    move-result-object p1

    invoke-virtual {v1, p1}, Lno;->a(Lno;)Lno;

    move-result-object v1

    :cond_3
    return-object v1

    :cond_4
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 13

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnc;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnc;

    iget-wide v3, p0, Lnc;->b:J

    iget-wide v5, p1, Lnc;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lnc;->b:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget-object v1, p0, Lnc;->a:Lno;

    iget-object p1, p1, Lnc;->a:Lno;

    iget v3, v1, Lno;->b:I

    iget v4, p1, Lno;->b:I

    :goto_0
    iget-wide v7, p0, Lnc;->b:J

    cmp-long v7, v5, v7

    if-gez v7, :cond_8

    iget v7, v1, Lno;->c:I

    sub-int/2addr v7, v3

    iget v8, p1, Lno;->c:I

    sub-int/2addr v8, v4

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    int-to-long v7, v7

    move v9, v4

    move v4, v3

    move v3, v2

    :goto_1
    int-to-long v10, v3

    cmp-long v10, v10, v7

    if-gez v10, :cond_5

    iget-object v10, v1, Lno;->a:[B

    add-int/lit8 v11, v4, 0x1

    aget-byte v4, v10, v4

    iget-object v10, p1, Lno;->a:[B

    add-int/lit8 v12, v9, 0x1

    aget-byte v9, v10, v9

    if-eq v4, v9, :cond_4

    return v2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    move v4, v11

    move v9, v12

    goto :goto_1

    :cond_5
    iget v3, v1, Lno;->c:I

    if-ne v4, v3, :cond_6

    iget-object v1, v1, Lno;->f:Lno;

    iget v3, v1, Lno;->b:I

    goto :goto_2

    :cond_6
    move v3, v4

    :goto_2
    iget v4, p1, Lno;->c:I

    if-ne v9, v4, :cond_7

    iget-object p1, p1, Lno;->f:Lno;

    iget v4, p1, Lno;->b:I

    goto :goto_3

    :cond_7
    move v4, v9

    :goto_3
    add-long/2addr v5, v7

    goto :goto_0

    :cond_8
    return v0
.end method

.method public final f()B
    .locals 9

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "size == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnc;->a:Lno;

    iget v1, v0, Lno;->b:I

    iget v2, v0, Lno;->c:I

    iget-object v3, v0, Lno;->a:[B

    add-int/lit8 v4, v1, 0x1

    aget-byte v1, v3, v1

    iget-wide v5, p0, Lnc;->b:J

    const-wide/16 v7, 0x1

    sub-long/2addr v5, v7

    iput-wide v5, p0, Lnc;->b:J

    if-ne v4, v2, :cond_1

    invoke-virtual {v0}, Lno;->c()Lno;

    move-result-object v2

    iput-object v2, p0, Lnc;->a:Lno;

    invoke-static {v0}, Lnp;->a(Lno;)V

    return v1

    :cond_1
    iput v4, v0, Lno;->b:I

    return v1
.end method

.method public final synthetic f(I)Lnd;
    .locals 0

    invoke-virtual {p0, p1}, Lnc;->d(I)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final f(J)[B
    .locals 6

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x0

    move-wide v4, p1

    invoke-static/range {v0 .. v5}, Lnu;->a(JJJ)V

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "byteCount > Integer.MAX_VALUE: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    long-to-int p1, p1

    new-array p1, p1, [B

    invoke-virtual {p0, p1}, Lnc;->a([B)V

    return-object p1
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final synthetic g(I)Lnd;
    .locals 0

    invoke-virtual {p0, p1}, Lnc;->c(I)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final g()S
    .locals 8

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "size < 2: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lnc;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnc;->a:Lno;

    iget v1, v0, Lno;->b:I

    iget v4, v0, Lno;->c:I

    sub-int v5, v4, v1

    const/4 v6, 0x2

    if-ge v5, v6, :cond_1

    invoke-virtual {p0}, Lnc;->f()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Lnc;->f()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0

    :cond_1
    iget-object v5, v0, Lno;->a:[B

    add-int/lit8 v6, v1, 0x1

    aget-byte v1, v5, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 v7, v6, 0x1

    aget-byte v5, v5, v6

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v1, v5

    iget-wide v5, p0, Lnc;->b:J

    sub-long/2addr v5, v2

    iput-wide v5, p0, Lnc;->b:J

    if-ne v7, v4, :cond_2

    invoke-virtual {v0}, Lno;->c()Lno;

    move-result-object v2

    iput-object v2, p0, Lnc;->a:Lno;

    invoke-static {v0}, Lnp;->a(Lno;)V

    goto :goto_0

    :cond_2
    iput v7, v0, Lno;->b:I

    :goto_0
    int-to-short v0, v1

    return v0
.end method

.method public final g(J)V
    .locals 5

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lnc;->a:Lno;

    if-nez v0, :cond_1

    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    iget-object v0, p0, Lnc;->a:Lno;

    iget v0, v0, Lno;->c:I

    iget-object v1, p0, Lnc;->a:Lno;

    iget v1, v1, Lno;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    iget-wide v1, p0, Lnc;->b:J

    int-to-long v3, v0

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lnc;->b:J

    sub-long/2addr p1, v3

    iget-object v1, p0, Lnc;->a:Lno;

    iget v2, v1, Lno;->b:I

    add-int/2addr v2, v0

    iput v2, v1, Lno;->b:I

    iget-object v0, p0, Lnc;->a:Lno;

    iget v0, v0, Lno;->b:I

    iget-object v1, p0, Lnc;->a:Lno;

    iget v1, v1, Lno;->c:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lnc;->a:Lno;

    invoke-virtual {v0}, Lno;->c()Lno;

    move-result-object v1

    iput-object v1, p0, Lnc;->a:Lno;

    invoke-static {v0}, Lnp;->a(Lno;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final h()I
    .locals 8

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x4

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "size < 4: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lnc;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnc;->a:Lno;

    iget v1, v0, Lno;->b:I

    iget v4, v0, Lno;->c:I

    sub-int v5, v4, v1

    const/4 v6, 0x4

    if-ge v5, v6, :cond_1

    invoke-virtual {p0}, Lnc;->f()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    invoke-virtual {p0}, Lnc;->f()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Lnc;->f()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Lnc;->f()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v5, v0, Lno;->a:[B

    add-int/lit8 v6, v1, 0x1

    aget-byte v1, v5, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v7, v6, 0x1

    aget-byte v6, v5, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v6, v6, 0x10

    or-int/2addr v1, v6

    add-int/lit8 v6, v7, 0x1

    aget-byte v7, v5, v7

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x8

    or-int/2addr v1, v7

    add-int/lit8 v7, v6, 0x1

    aget-byte v5, v5, v6

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v1, v5

    iget-wide v5, p0, Lnc;->b:J

    sub-long/2addr v5, v2

    iput-wide v5, p0, Lnc;->b:J

    if-ne v7, v4, :cond_2

    invoke-virtual {v0}, Lno;->c()Lno;

    move-result-object v2

    iput-object v2, p0, Lnc;->a:Lno;

    invoke-static {v0}, Lnp;->a(Lno;)V

    return v1

    :cond_2
    iput v7, v0, Lno;->b:I

    return v1
.end method

.method public final h(J)Lnc;
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Lnc;->b(I)Lnc;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gez v2, :cond_2

    neg-long p1, p1

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    const-string p1, "-9223372036854775808"

    invoke-virtual {p0, p1}, Lnc;->a(Ljava/lang/String;)Lnc;

    move-result-object p1

    return-object p1

    :cond_1
    move v3, v4

    :cond_2
    const-wide/32 v5, 0x5f5e100

    cmp-long v2, p1, v5

    const-wide/16 v5, 0xa

    if-gez v2, :cond_a

    const-wide/16 v7, 0x2710

    cmp-long v2, p1, v7

    if-gez v2, :cond_6

    const-wide/16 v7, 0x64

    cmp-long v2, p1, v7

    if-gez v2, :cond_4

    cmp-long v2, p1, v5

    if-gez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    const/4 v4, 0x2

    goto/16 :goto_0

    :cond_4
    const-wide/16 v7, 0x3e8

    cmp-long v2, p1, v7

    if-gez v2, :cond_5

    const/4 v4, 0x3

    goto/16 :goto_0

    :cond_5
    const/4 v4, 0x4

    goto/16 :goto_0

    :cond_6
    const-wide/32 v7, 0xf4240

    cmp-long v2, p1, v7

    if-gez v2, :cond_8

    const-wide/32 v7, 0x186a0

    cmp-long v2, p1, v7

    if-gez v2, :cond_7

    const/4 v4, 0x5

    goto/16 :goto_0

    :cond_7
    const/4 v4, 0x6

    goto/16 :goto_0

    :cond_8
    const-wide/32 v7, 0x989680

    cmp-long v2, p1, v7

    if-gez v2, :cond_9

    const/4 v4, 0x7

    goto/16 :goto_0

    :cond_9
    const/16 v4, 0x8

    goto/16 :goto_0

    :cond_a
    const-wide v7, 0xe8d4a51000L

    cmp-long v2, p1, v7

    if-gez v2, :cond_e

    const-wide v7, 0x2540be400L

    cmp-long v2, p1, v7

    if-gez v2, :cond_c

    const-wide/32 v7, 0x3b9aca00

    cmp-long v2, p1, v7

    if-gez v2, :cond_b

    const/16 v4, 0x9

    goto :goto_0

    :cond_b
    const/16 v4, 0xa

    goto :goto_0

    :cond_c
    const-wide v7, 0x174876e800L

    cmp-long v2, p1, v7

    if-gez v2, :cond_d

    const/16 v4, 0xb

    goto :goto_0

    :cond_d
    const/16 v4, 0xc

    goto :goto_0

    :cond_e
    const-wide v7, 0x38d7ea4c68000L

    cmp-long v2, p1, v7

    if-gez v2, :cond_11

    const-wide v7, 0x9184e72a000L

    cmp-long v2, p1, v7

    if-gez v2, :cond_f

    const/16 v4, 0xd

    goto :goto_0

    :cond_f
    const-wide v7, 0x5af3107a4000L

    cmp-long v2, p1, v7

    if-gez v2, :cond_10

    const/16 v4, 0xe

    goto :goto_0

    :cond_10
    const/16 v4, 0xf

    goto :goto_0

    :cond_11
    const-wide v7, 0x16345785d8a0000L

    cmp-long v2, p1, v7

    if-gez v2, :cond_13

    const-wide v7, 0x2386f26fc10000L

    cmp-long v2, p1, v7

    if-gez v2, :cond_12

    const/16 v4, 0x10

    goto :goto_0

    :cond_12
    const/16 v4, 0x11

    goto :goto_0

    :cond_13
    const-wide v7, 0xde0b6b3a7640000L

    cmp-long v2, p1, v7

    if-gez v2, :cond_14

    const/16 v4, 0x12

    goto :goto_0

    :cond_14
    const/16 v4, 0x13

    :goto_0
    if-eqz v3, :cond_15

    add-int/lit8 v4, v4, 0x1

    :cond_15
    invoke-virtual {p0, v4}, Lnc;->e(I)Lno;

    move-result-object v2

    iget-object v7, v2, Lno;->a:[B

    iget v8, v2, Lno;->c:I

    add-int/2addr v8, v4

    :goto_1
    cmp-long v9, p1, v0

    if-eqz v9, :cond_16

    rem-long v9, p1, v5

    long-to-int v9, v9

    add-int/lit8 v8, v8, -0x1

    sget-object v10, Lnc;->c:[B

    aget-byte v9, v10, v9

    aput-byte v9, v7, v8

    div-long/2addr p1, v5

    goto :goto_1

    :cond_16
    if-eqz v3, :cond_17

    add-int/lit8 v8, v8, -0x1

    const/16 p1, 0x2d

    aput-byte p1, v7, v8

    :cond_17
    iget p1, v2, Lno;->c:I

    add-int/2addr p1, v4

    iput p1, v2, Lno;->c:I

    iget-wide p1, p0, Lnc;->b:J

    int-to-long v0, v4

    add-long/2addr p1, v0

    iput-wide p1, p0, Lnc;->b:J

    return-object p0
.end method

.method public final synthetic h(I)Lnd;
    .locals 0

    invoke-virtual {p0, p1}, Lnc;->b(I)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lnc;->a:Lno;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x1

    :cond_1
    iget v2, v0, Lno;->b:I

    iget v3, v0, Lno;->c:I

    :goto_0
    if-ge v2, v3, :cond_2

    const/16 v4, 0x1f

    mul-int/2addr v4, v1

    iget-object v1, v0, Lno;->a:[B

    aget-byte v1, v1, v2

    add-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, v0, Lno;->f:Lno;

    iget-object v2, p0, Lnc;->a:Lno;

    if-ne v0, v2, :cond_1

    return v1
.end method

.method public final i()J
    .locals 15

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "size < 8: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lnc;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnc;->a:Lno;

    iget v1, v0, Lno;->b:I

    iget v4, v0, Lno;->c:I

    sub-int v5, v4, v1

    const/16 v6, 0x20

    const/16 v7, 0x8

    if-ge v5, v7, :cond_1

    invoke-virtual {p0}, Lnc;->h()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    shl-long/2addr v0, v6

    invoke-virtual {p0}, Lnc;->h()I

    move-result v4

    int-to-long v4, v4

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0

    :cond_1
    iget-object v5, v0, Lno;->a:[B

    add-int/lit8 v8, v1, 0x1

    aget-byte v1, v5, v1

    int-to-long v9, v1

    const-wide/16 v11, 0xff

    and-long/2addr v9, v11

    const/16 v1, 0x38

    shl-long/2addr v9, v1

    add-int/lit8 v1, v8, 0x1

    aget-byte v8, v5, v8

    int-to-long v13, v8

    and-long/2addr v13, v11

    const/16 v8, 0x30

    shl-long/2addr v13, v8

    or-long v8, v9, v13

    add-int/lit8 v10, v1, 0x1

    aget-byte v1, v5, v1

    int-to-long v13, v1

    and-long/2addr v13, v11

    const/16 v1, 0x28

    shl-long/2addr v13, v1

    or-long/2addr v8, v13

    add-int/lit8 v1, v10, 0x1

    aget-byte v10, v5, v10

    int-to-long v13, v10

    and-long/2addr v13, v11

    shl-long/2addr v13, v6

    or-long/2addr v8, v13

    add-int/lit8 v6, v1, 0x1

    aget-byte v1, v5, v1

    int-to-long v13, v1

    and-long/2addr v13, v11

    const/16 v1, 0x18

    shl-long/2addr v13, v1

    or-long/2addr v8, v13

    add-int/lit8 v1, v6, 0x1

    aget-byte v6, v5, v6

    int-to-long v13, v6

    and-long/2addr v13, v11

    const/16 v6, 0x10

    shl-long/2addr v13, v6

    or-long/2addr v8, v13

    add-int/lit8 v6, v1, 0x1

    aget-byte v1, v5, v1

    int-to-long v13, v1

    and-long/2addr v13, v11

    shl-long/2addr v13, v7

    or-long v7, v8, v13

    add-int/lit8 v1, v6, 0x1

    aget-byte v5, v5, v6

    int-to-long v5, v5

    and-long/2addr v5, v11

    or-long/2addr v5, v7

    iget-wide v7, p0, Lnc;->b:J

    sub-long/2addr v7, v2

    iput-wide v7, p0, Lnc;->b:J

    if-ne v1, v4, :cond_2

    invoke-virtual {v0}, Lno;->c()Lno;

    move-result-object v1

    iput-object v1, p0, Lnc;->a:Lno;

    invoke-static {v0}, Lnp;->a(Lno;)V

    return-wide v5

    :cond_2
    iput v1, v0, Lno;->b:I

    return-wide v5
.end method

.method public final i(J)Lnc;
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Lnc;->b(I)Lnc;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->highestOneBit(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    const/4 v1, 0x4

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lnc;->e(I)Lno;

    move-result-object v2

    iget-object v3, v2, Lno;->a:[B

    iget v4, v2, Lno;->c:I

    add-int/2addr v4, v0

    add-int/lit8 v4, v4, -0x1

    iget v5, v2, Lno;->c:I

    :goto_0
    if-lt v4, v5, :cond_1

    sget-object v6, Lnc;->c:[B

    const-wide/16 v7, 0xf

    and-long/2addr v7, p1

    long-to-int v7, v7

    aget-byte v6, v6, v7

    aput-byte v6, v3, v4

    ushr-long/2addr p1, v1

    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_1
    iget p1, v2, Lno;->c:I

    add-int/2addr p1, v0

    iput p1, v2, Lno;->c:I

    iget-wide p1, p0, Lnc;->b:J

    int-to-long v0, v0

    add-long/2addr p1, v0

    iput-wide p1, p0, Lnc;->b:J

    return-object p0
.end method

.method public final isOpen()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic j(J)Lnd;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnc;->i(J)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final j()S
    .locals 1

    invoke-virtual {p0}, Lnc;->g()S

    move-result v0

    invoke-static {v0}, Lnu;->a(S)S

    move-result v0

    return v0
.end method

.method public final k()I
    .locals 1

    invoke-virtual {p0}, Lnc;->h()I

    move-result v0

    invoke-static {v0}, Lnu;->a(I)I

    move-result v0

    return v0
.end method

.method public final synthetic k(J)Lnd;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnc;->h(J)Lnc;

    move-result-object p1

    return-object p1
.end method

.method public final l()J
    .locals 14

    iget-wide v0, p0, Lnc;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "size == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    move-wide v4, v2

    :cond_1
    iget-object v6, p0, Lnc;->a:Lno;

    iget-object v7, v6, Lno;->a:[B

    iget v8, v6, Lno;->b:I

    iget v9, v6, Lno;->c:I

    :goto_0
    if-ge v8, v9, :cond_7

    aget-byte v10, v7, v8

    const/16 v11, 0x30

    if-lt v10, v11, :cond_2

    const/16 v11, 0x39

    if-gt v10, v11, :cond_2

    add-int/lit8 v11, v10, -0x30

    goto :goto_2

    :cond_2
    const/16 v11, 0x61

    if-lt v10, v11, :cond_3

    const/16 v11, 0x66

    if-gt v10, v11, :cond_3

    add-int/lit8 v11, v10, -0x61

    :goto_1
    add-int/lit8 v11, v11, 0xa

    goto :goto_2

    :cond_3
    const/16 v11, 0x41

    if-lt v10, v11, :cond_5

    const/16 v11, 0x46

    if-gt v10, v11, :cond_5

    add-int/lit8 v11, v10, -0x41

    goto :goto_1

    :goto_2
    const-wide/high16 v12, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v12, v4

    cmp-long v12, v12, v2

    if-eqz v12, :cond_4

    new-instance v0, Lnc;

    invoke-direct {v0}, Lnc;-><init>()V

    invoke-virtual {v0, v4, v5}, Lnc;->i(J)Lnc;

    move-result-object v0

    invoke-virtual {v0, v10}, Lnc;->b(I)Lnc;

    move-result-object v0

    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Number too large: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnc;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    const/4 v10, 0x4

    shl-long/2addr v4, v10

    int-to-long v10, v11

    or-long/2addr v4, v10

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    if-nez v0, :cond_6

    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/4 v1, 0x1

    :cond_7
    if-ne v8, v9, :cond_8

    invoke-virtual {v6}, Lno;->c()Lno;

    move-result-object v7

    iput-object v7, p0, Lnc;->a:Lno;

    invoke-static {v6}, Lnp;->a(Lno;)V

    goto :goto_3

    :cond_8
    iput v8, v6, Lno;->b:I

    :goto_3
    if-nez v1, :cond_9

    iget-object v6, p0, Lnc;->a:Lno;

    if-nez v6, :cond_1

    :cond_9
    iget-wide v1, p0, Lnc;->b:J

    int-to-long v6, v0

    sub-long/2addr v1, v6

    iput-wide v1, p0, Lnc;->b:J

    return-wide v4
.end method

.method public final m()Lnf;
    .locals 2

    new-instance v0, Lnf;

    invoke-virtual {p0}, Lnc;->p()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lnf;-><init>([B)V

    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 3

    :try_start_0
    iget-wide v0, p0, Lnc;->b:J

    sget-object v2, Lnu;->a:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, v1, v2}, Lnc;->a(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final o()Ljava/lang/String;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lnc;->d(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final p()[B
    .locals 2

    :try_start_0
    iget-wide v0, p0, Lnc;->b:J

    invoke-virtual {p0, v0, v1}, Lnc;->f(J)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final q()V
    .locals 2

    :try_start_0
    iget-wide v0, p0, Lnc;->b:J

    invoke-virtual {p0, v0, v1}, Lnc;->g(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final r()J
    .locals 6

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lnc;->a(BJJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 6

    iget-object v0, p0, Lnc;->a:Lno;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    iget v2, v0, Lno;->c:I

    iget v3, v0, Lno;->b:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, v0, Lno;->a:[B

    iget v3, v0, Lno;->b:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    iget p1, v0, Lno;->b:I

    add-int/2addr p1, v1

    iput p1, v0, Lno;->b:I

    iget-wide v2, p0, Lnc;->b:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lnc;->b:J

    iget p1, v0, Lno;->b:I

    iget v2, v0, Lno;->c:I

    if-ne p1, v2, :cond_1

    invoke-virtual {v0}, Lno;->c()Lno;

    move-result-object p1

    iput-object p1, p0, Lnc;->a:Lno;

    invoke-static {v0}, Lnp;->a(Lno;)V

    :cond_1
    return v1
.end method

.method public final bridge synthetic s()Lnd;
    .locals 0

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, Lnc;->b:J

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "size > Integer.MAX_VALUE: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lnc;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-wide v0, p0, Lnc;->b:J

    long-to-int v0, v0

    if-nez v0, :cond_1

    sget-object v0, Lnf;->b:Lnf;

    goto :goto_0

    :cond_1
    new-instance v1, Lnq;

    invoke-direct {v1, p0, v0}, Lnq;-><init>(Lnc;I)V

    move-object v0, v1

    :goto_0
    invoke-virtual {v0}, Lnf;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 6

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    move v1, v0

    :goto_0
    if-lez v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lnc;->e(I)Lno;

    move-result-object v2

    iget v3, v2, Lno;->c:I

    rsub-int v3, v3, 0x2000

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v4, v2, Lno;->a:[B

    iget v5, v2, Lno;->c:I

    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v1, v3

    iget v4, v2, Lno;->c:I

    add-int/2addr v4, v3

    iput v4, v2, Lno;->c:I

    goto :goto_0

    :cond_1
    iget-wide v1, p0, Lnc;->b:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lnc;->b:J

    return v0
.end method
