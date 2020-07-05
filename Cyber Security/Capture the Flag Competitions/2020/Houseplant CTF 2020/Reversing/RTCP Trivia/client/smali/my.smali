.class final Lmy;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmy$a;
    }
.end annotation


# instance fields
.field final a:Z

.field final b:Lne;

.field final c:Lmy$a;

.field d:Z

.field e:I

.field f:J

.field g:Z

.field h:Z

.field final i:Lnc;

.field private final j:Lnc;

.field private final k:[B

.field private final l:Lnc$a;


# direct methods
.method constructor <init>(ZLne;Lmy$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnc;

    invoke-direct {v0}, Lnc;-><init>()V

    iput-object v0, p0, Lmy;->j:Lnc;

    new-instance v0, Lnc;

    invoke-direct {v0}, Lnc;-><init>()V

    iput-object v0, p0, Lmy;->i:Lnc;

    if-nez p2, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "source == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-nez p3, :cond_1

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "frameCallback == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput-boolean p1, p0, Lmy;->a:Z

    iput-object p2, p0, Lmy;->b:Lne;

    iput-object p3, p0, Lmy;->c:Lmy$a;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    move-object p3, p2

    goto :goto_0

    :cond_2
    const/4 p3, 0x4

    new-array p3, p3, [B

    :goto_0
    iput-object p3, p0, Lmy;->k:[B

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p2, Lnc$a;

    invoke-direct {p2}, Lnc$a;-><init>()V

    :goto_1
    iput-object p2, p0, Lmy;->l:Lnc$a;

    return-void
.end method

.method private d()V
    .locals 1

    :goto_0
    iget-boolean v0, p0, Lmy;->d:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lmy;->a()V

    iget-boolean v0, p0, Lmy;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lmy;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method final a()V
    .locals 6

    iget-boolean v0, p0, Lmy;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lmy;->b:Lne;

    invoke-interface {v0}, Lne;->a()Lnt;

    move-result-object v0

    invoke-virtual {v0}, Lnt;->d_()J

    move-result-wide v0

    iget-object v2, p0, Lmy;->b:Lne;

    invoke-interface {v2}, Lne;->a()Lnt;

    move-result-object v2

    invoke-virtual {v2}, Lnt;->d()Lnt;

    :try_start_0
    iget-object v2, p0, Lmy;->b:Lne;

    invoke-interface {v2}, Lne;->f()B

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/lit16 v2, v2, 0xff

    iget-object v3, p0, Lmy;->b:Lne;

    invoke-interface {v3}, Lne;->a()Lnt;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v0, v1, v4}, Lnt;->a(JLjava/util/concurrent/TimeUnit;)Lnt;

    and-int/lit8 v0, v2, 0xf

    iput v0, p0, Lmy;->e:I

    and-int/lit16 v0, v2, 0x80

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lmy;->g:Z

    and-int/lit8 v0, v2, 0x8

    if-eqz v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lmy;->h:Z

    iget-boolean v0, p0, Lmy;->h:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lmy;->g:Z

    if-nez v0, :cond_3

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frames must be final."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    and-int/lit8 v0, v2, 0x40

    if-eqz v0, :cond_4

    move v0, v3

    goto :goto_2

    :cond_4
    move v0, v1

    :goto_2
    and-int/lit8 v4, v2, 0x20

    if-eqz v4, :cond_5

    move v4, v3

    goto :goto_3

    :cond_5
    move v4, v1

    :goto_3
    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_6

    move v2, v3

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    if-nez v0, :cond_f

    if-nez v4, :cond_f

    if-eqz v2, :cond_7

    goto/16 :goto_7

    :cond_7
    iget-object v0, p0, Lmy;->b:Lne;

    invoke-interface {v0}, Lne;->f()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_8

    move v1, v3

    :cond_8
    iget-boolean v2, p0, Lmy;->a:Z

    if-ne v1, v2, :cond_a

    new-instance v0, Ljava/net/ProtocolException;

    iget-boolean v1, p0, Lmy;->a:Z

    if-eqz v1, :cond_9

    const-string v1, "Server-sent frames must not be masked."

    goto :goto_5

    :cond_9
    const-string v1, "Client-sent frames must be masked."

    :goto_5
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    and-int/lit8 v0, v0, 0x7f

    int-to-long v2, v0

    iput-wide v2, p0, Lmy;->f:J

    iget-wide v2, p0, Lmy;->f:J

    const-wide/16 v4, 0x7e

    cmp-long v0, v2, v4

    if-nez v0, :cond_b

    iget-object v0, p0, Lmy;->b:Lne;

    invoke-interface {v0}, Lne;->g()S

    move-result v0

    int-to-long v2, v0

    const-wide/32 v4, 0xffff

    and-long/2addr v2, v4

    iput-wide v2, p0, Lmy;->f:J

    goto :goto_6

    :cond_b
    iget-wide v2, p0, Lmy;->f:J

    const-wide/16 v4, 0x7f

    cmp-long v0, v2, v4

    if-nez v0, :cond_c

    iget-object v0, p0, Lmy;->b:Lne;

    invoke-interface {v0}, Lne;->i()J

    move-result-wide v2

    iput-wide v2, p0, Lmy;->f:J

    iget-wide v2, p0, Lmy;->f:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gez v0, :cond_c

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Frame length 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lmy;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " > 0x7FFFFFFFFFFFFFFF"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_6
    iget-boolean v0, p0, Lmy;->h:Z

    if-eqz v0, :cond_d

    iget-wide v2, p0, Lmy;->f:J

    const-wide/16 v4, 0x7d

    cmp-long v0, v2, v4

    if-lez v0, :cond_d

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frame must be less than 125B."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    if-eqz v1, :cond_e

    iget-object v0, p0, Lmy;->b:Lne;

    iget-object v1, p0, Lmy;->k:[B

    invoke-interface {v0, v1}, Lne;->a([B)V

    :cond_e
    return-void

    :cond_f
    :goto_7
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Reserved flags are unsupported."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v2

    iget-object v3, p0, Lmy;->b:Lne;

    invoke-interface {v3}, Lne;->a()Lnt;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v0, v1, v4}, Lnt;->a(JLjava/util/concurrent/TimeUnit;)Lnt;

    throw v2
.end method

.method final b()V
    .locals 8

    iget-wide v0, p0, Lmy;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lmy;->b:Lne;

    iget-object v1, p0, Lmy;->j:Lnc;

    iget-wide v4, p0, Lmy;->f:J

    invoke-interface {v0, v1, v4, v5}, Lne;->b(Lnc;J)V

    iget-boolean v0, p0, Lmy;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lmy;->j:Lnc;

    iget-object v1, p0, Lmy;->l:Lnc$a;

    invoke-virtual {v0, v1}, Lnc;->a(Lnc$a;)Lnc$a;

    iget-object v0, p0, Lmy;->l:Lnc$a;

    invoke-virtual {v0, v2, v3}, Lnc$a;->a(J)I

    iget-object v0, p0, Lmy;->l:Lnc$a;

    iget-object v1, p0, Lmy;->k:[B

    invoke-static {v0, v1}, Lmx;->a(Lnc$a;[B)V

    iget-object v0, p0, Lmy;->l:Lnc$a;

    invoke-virtual {v0}, Lnc$a;->close()V

    :cond_0
    iget v0, p0, Lmy;->e:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown control opcode: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lmy;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lmy;->c:Lmy$a;

    iget-object v1, p0, Lmy;->j:Lnc;

    invoke-virtual {v1}, Lnc;->m()Lnf;

    invoke-interface {v0}, Lmy$a;->b()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lmy;->c:Lmy$a;

    iget-object v1, p0, Lmy;->j:Lnc;

    invoke-virtual {v1}, Lnc;->m()Lnf;

    move-result-object v1

    invoke-interface {v0, v1}, Lmy$a;->a(Lnf;)V

    return-void

    :pswitch_2
    const/16 v0, 0x3ed

    const-string v1, ""

    iget-object v4, p0, Lmy;->j:Lnc;

    iget-wide v4, v4, Lnc;->b:J

    const-wide/16 v6, 0x1

    cmp-long v6, v4, v6

    if-nez v6, :cond_1

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Malformed close payload length of 1."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    cmp-long v2, v4, v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lmy;->j:Lnc;

    invoke-virtual {v0}, Lnc;->g()S

    move-result v0

    iget-object v1, p0, Lmy;->j:Lnc;

    invoke-virtual {v1}, Lnc;->n()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lmx;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, p0, Lmy;->c:Lmy$a;

    invoke-interface {v2, v0, v1}, Lmy$a;->a(ILjava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmy;->d:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method final c()V
    .locals 5

    :cond_0
    iget-boolean v0, p0, Lmy;->d:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v0, p0, Lmy;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-object v0, p0, Lmy;->b:Lne;

    iget-object v1, p0, Lmy;->i:Lnc;

    iget-wide v2, p0, Lmy;->f:J

    invoke-interface {v0, v1, v2, v3}, Lne;->b(Lnc;J)V

    iget-boolean v0, p0, Lmy;->a:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lmy;->i:Lnc;

    iget-object v1, p0, Lmy;->l:Lnc$a;

    invoke-virtual {v0, v1}, Lnc;->a(Lnc$a;)Lnc$a;

    iget-object v0, p0, Lmy;->l:Lnc$a;

    iget-object v1, p0, Lmy;->i:Lnc;

    iget-wide v1, v1, Lnc;->b:J

    iget-wide v3, p0, Lmy;->f:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lnc$a;->a(J)I

    iget-object v0, p0, Lmy;->l:Lnc$a;

    iget-object v1, p0, Lmy;->k:[B

    invoke-static {v0, v1}, Lmx;->a(Lnc$a;[B)V

    iget-object v0, p0, Lmy;->l:Lnc$a;

    invoke-virtual {v0}, Lnc$a;->close()V

    :cond_2
    iget-boolean v0, p0, Lmy;->g:Z

    if-nez v0, :cond_3

    invoke-direct {p0}, Lmy;->d()V

    iget v0, p0, Lmy;->e:I

    if-eqz v0, :cond_0

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected continuation opcode. Got: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lmy;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-void
.end method
