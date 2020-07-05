.class public final Lmx;
.super Ljava/lang/Object;


# direct methods
.method static a(I)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x3e8

    if-lt p0, v0, :cond_4

    const/16 v0, 0x1388

    if-lt p0, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x3ec

    if-lt p0, v0, :cond_1

    const/16 v0, 0x3ee

    if-le p0, v0, :cond_2

    :cond_1
    const/16 v0, 0x3f4

    if-lt p0, v0, :cond_3

    const/16 v0, 0xbb7

    if-gt p0, v0, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Code "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " is reserved and may not be used."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0

    :cond_4
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Code must be in range [1000,5000): "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method static a(Lnc$a;[B)V
    .locals 7

    const/4 v0, 0x0

    array-length v1, p1

    :cond_0
    iget-object v2, p0, Lnc$a;->d:[B

    iget v3, p0, Lnc$a;->e:I

    iget v4, p0, Lnc$a;->f:I

    :goto_0
    if-ge v3, v4, :cond_1

    rem-int/2addr v0, v1

    aget-byte v5, v2, v3

    aget-byte v6, p1, v0

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-wide v2, p0, Lnc$a;->c:J

    iget-object v4, p0, Lnc$a;->a:Lnc;

    iget-wide v4, v4, Lnc;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    iget-wide v2, p0, Lnc$a;->c:J

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_3

    const-wide/16 v2, 0x0

    :goto_1
    invoke-virtual {p0, v2, v3}, Lnc$a;->a(J)I

    move-result v2

    goto :goto_2

    :cond_3
    iget-wide v2, p0, Lnc$a;->c:J

    iget v4, p0, Lnc$a;->f:I

    iget v5, p0, Lnc$a;->e:I

    sub-int/2addr v4, v5

    int-to-long v4, v4

    add-long/2addr v2, v4

    goto :goto_1

    :goto_2
    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    return-void
.end method

.method static b(I)V
    .locals 1

    invoke-static {p0}, Lmx;->a(I)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method
