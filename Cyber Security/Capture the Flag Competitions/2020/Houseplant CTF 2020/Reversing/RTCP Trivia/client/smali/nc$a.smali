.class public final Lnc$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lnc;

.field public b:Z

.field public c:J

.field public d:[B

.field public e:I

.field public f:I

.field private g:Lno;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lnc$a;->c:J

    const/4 v0, -0x1

    iput v0, p0, Lnc$a;->e:I

    iput v0, p0, Lnc$a;->f:I

    return-void
.end method


# virtual methods
.method public final a(J)I
    .locals 10

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-ltz v0, :cond_9

    iget-object v1, p0, Lnc$a;->a:Lnc;

    iget-wide v1, v1, Lnc;->b:J

    cmp-long v1, p1, v1

    if-lez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    if-eqz v0, :cond_8

    iget-object v0, p0, Lnc$a;->a:Lnc;

    iget-wide v0, v0, Lnc;->b:J

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    goto/16 :goto_3

    :cond_1
    const-wide/16 v0, 0x0

    iget-object v2, p0, Lnc$a;->a:Lnc;

    iget-wide v2, v2, Lnc;->b:J

    iget-object v4, p0, Lnc$a;->a:Lnc;

    iget-object v4, v4, Lnc;->a:Lno;

    iget-object v5, p0, Lnc$a;->a:Lnc;

    iget-object v5, v5, Lnc;->a:Lno;

    iget-object v6, p0, Lnc$a;->g:Lno;

    if-eqz v6, :cond_3

    iget-wide v6, p0, Lnc$a;->c:J

    iget v8, p0, Lnc$a;->e:I

    iget-object v9, p0, Lnc$a;->g:Lno;

    iget v9, v9, Lno;->b:I

    sub-int/2addr v8, v9

    int-to-long v8, v8

    sub-long/2addr v6, v8

    cmp-long v8, v6, p1

    if-lez v8, :cond_2

    iget-object v5, p0, Lnc$a;->g:Lno;

    move-wide v2, v6

    goto :goto_0

    :cond_2
    iget-object v4, p0, Lnc$a;->g:Lno;

    move-wide v0, v6

    :cond_3
    :goto_0
    sub-long v6, v2, p1

    sub-long v8, p1, v0

    cmp-long v6, v6, v8

    if-lez v6, :cond_4

    :goto_1
    iget v2, v4, Lno;->c:I

    iget v3, v4, Lno;->b:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v2, v0

    cmp-long v2, p1, v2

    if-ltz v2, :cond_5

    iget v2, v4, Lno;->c:I

    iget v3, v4, Lno;->b:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-object v4, v4, Lno;->f:Lno;

    goto :goto_1

    :cond_4
    move-wide v0, v2

    move-object v4, v5

    :goto_2
    cmp-long v2, v0, p1

    if-lez v2, :cond_5

    iget-object v4, v4, Lno;->g:Lno;

    iget v2, v4, Lno;->c:I

    iget v3, v4, Lno;->b:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    sub-long/2addr v0, v2

    goto :goto_2

    :cond_5
    iget-boolean v2, p0, Lnc$a;->b:Z

    if-eqz v2, :cond_7

    iget-boolean v2, v4, Lno;->d:Z

    if-eqz v2, :cond_7

    invoke-virtual {v4}, Lno;->b()Lno;

    move-result-object v2

    iget-object v3, p0, Lnc$a;->a:Lnc;

    iget-object v3, v3, Lnc;->a:Lno;

    if-ne v3, v4, :cond_6

    iget-object v3, p0, Lnc$a;->a:Lnc;

    iput-object v2, v3, Lnc;->a:Lno;

    :cond_6
    invoke-virtual {v4, v2}, Lno;->a(Lno;)Lno;

    move-result-object v4

    iget-object v2, v4, Lno;->g:Lno;

    invoke-virtual {v2}, Lno;->c()Lno;

    :cond_7
    iput-object v4, p0, Lnc$a;->g:Lno;

    iput-wide p1, p0, Lnc$a;->c:J

    iget-object v2, v4, Lno;->a:[B

    iput-object v2, p0, Lnc$a;->d:[B

    iget v2, v4, Lno;->b:I

    sub-long/2addr p1, v0

    long-to-int p1, p1

    add-int/2addr v2, p1

    iput v2, p0, Lnc$a;->e:I

    iget p1, v4, Lno;->c:I

    iput p1, p0, Lnc$a;->f:I

    iget p1, p0, Lnc$a;->f:I

    iget p2, p0, Lnc$a;->e:I

    sub-int/2addr p1, p2

    return p1

    :cond_8
    :goto_3
    const/4 v0, 0x0

    iput-object v0, p0, Lnc$a;->g:Lno;

    iput-wide p1, p0, Lnc$a;->c:J

    iput-object v0, p0, Lnc$a;->d:[B

    const/4 p1, -0x1

    iput p1, p0, Lnc$a;->e:I

    iput p1, p0, Lnc$a;->f:I

    return p1

    :cond_9
    :goto_4
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v1, "offset=%s > size=%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v2, v3

    const/4 p1, 0x1

    iget-object p2, p0, Lnc$a;->a:Lnc;

    iget-wide v3, p2, Lnc;->b:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v2, p1

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lnc$a;->a:Lnc;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not attached to a buffer"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lnc$a;->a:Lnc;

    iput-object v0, p0, Lnc$a;->g:Lno;

    const-wide/16 v1, -0x1

    iput-wide v1, p0, Lnc$a;->c:J

    iput-object v0, p0, Lnc$a;->d:[B

    const/4 v0, -0x1

    iput v0, p0, Lnc$a;->e:I

    iput v0, p0, Lnc$a;->f:I

    return-void
.end method
