.class abstract Llu$a;
.super Ljava/lang/Object;

# interfaces
.implements Lns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "a"
.end annotation


# instance fields
.field protected final a:Lni;

.field protected b:Z

.field protected c:J

.field final synthetic d:Llu;


# direct methods
.method private constructor <init>(Llu;)V
    .locals 2

    iput-object p1, p0, Llu$a;->d:Llu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lni;

    iget-object v0, p0, Llu$a;->d:Llu;

    iget-object v0, v0, Llu;->c:Lne;

    invoke-interface {v0}, Lne;->a()Lnt;

    move-result-object v0

    invoke-direct {p1, v0}, Lni;-><init>(Lnt;)V

    iput-object p1, p0, Llu$a;->a:Lni;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llu$a;->c:J

    return-void
.end method

.method synthetic constructor <init>(Llu;B)V
    .locals 0

    invoke-direct {p0, p1}, Llu$a;-><init>(Llu;)V

    return-void
.end method


# virtual methods
.method public a(Lnc;J)J
    .locals 2

    :try_start_0
    iget-object v0, p0, Llu$a;->d:Llu;

    iget-object v0, v0, Llu;->c:Lne;

    invoke-interface {v0, p1, p2, p3}, Lne;->a(Lnc;J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_0

    iget-wide v0, p0, Llu$a;->c:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Llu$a;->c:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-wide p1

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, Llu$a;->a(ZLjava/io/IOException;)V

    throw p1
.end method

.method public final a()Lnt;
    .locals 1

    iget-object v0, p0, Llu$a;->a:Lni;

    return-object v0
.end method

.method protected final a(ZLjava/io/IOException;)V
    .locals 3

    iget-object v0, p0, Llu$a;->d:Llu;

    iget v0, v0, Llu;->e:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Llu$a;->d:Llu;

    iget v0, v0, Llu;->e:I

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "state: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Llu$a;->d:Llu;

    iget v0, v0, Llu;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Llu$a;->a:Lni;

    invoke-static {v0}, Llu;->a(Lni;)V

    iget-object v0, p0, Llu$a;->d:Llu;

    iput v1, v0, Llu;->e:I

    iget-object v0, p0, Llu$a;->d:Llu;

    iget-object v0, v0, Llu;->b:Llh;

    if-eqz v0, :cond_2

    iget-object v0, p0, Llu$a;->d:Llu;

    iget-object v0, v0, Llu;->b:Llh;

    xor-int/lit8 p1, p1, 0x1

    iget-object v1, p0, Llu$a;->d:Llu;

    invoke-virtual {v0, p1, v1, p2}, Llh;->a(ZLlk;Ljava/io/IOException;)V

    :cond_2
    return-void
.end method
