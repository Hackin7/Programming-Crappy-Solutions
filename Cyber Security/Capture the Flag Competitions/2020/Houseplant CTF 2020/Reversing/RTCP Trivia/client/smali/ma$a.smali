.class final Lma$a;
.super Lnh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:J

.field final synthetic c:Lma;


# direct methods
.method constructor <init>(Lma;Lns;)V
    .locals 0

    iput-object p1, p0, Lma$a;->c:Lma;

    invoke-direct {p0, p2}, Lnh;-><init>(Lns;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lma$a;->a:Z

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lma$a;->b:J

    return-void
.end method

.method private a(Ljava/io/IOException;)V
    .locals 3

    iget-boolean v0, p0, Lma$a;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lma$a;->a:Z

    iget-object v0, p0, Lma$a;->c:Lma;

    iget-object v0, v0, Lma;->a:Llh;

    const/4 v1, 0x0

    iget-object v2, p0, Lma$a;->c:Lma;

    invoke-virtual {v0, v1, v2, p1}, Llh;->a(ZLlk;Ljava/io/IOException;)V

    return-void
.end method


# virtual methods
.method public final a(Lnc;J)J
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnh;->d:Lns;

    invoke-interface {v0, p1, p2, p3}, Lns;->a(Lnc;J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_0

    iget-wide v0, p0, Lma$a;->b:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lma$a;->b:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-wide p1

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Lma$a;->a(Ljava/io/IOException;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    invoke-super {p0}, Lnh;->close()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lma$a;->a(Ljava/io/IOException;)V

    return-void
.end method
