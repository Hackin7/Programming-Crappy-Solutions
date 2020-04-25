.class final Lmb$d$1;
.super Lku;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb$d;->a(ZILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmd;

.field final synthetic c:Lmb$d;


# direct methods
.method varargs constructor <init>(Lmb$d;Ljava/lang/String;[Ljava/lang/Object;Lmd;)V
    .locals 0

    iput-object p1, p0, Lmb$d$1;->c:Lmb$d;

    iput-object p4, p0, Lmb$d$1;->a:Lmd;

    invoke-direct {p0, p2, p3}, Lku;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lmb$d$1;->c:Lmb$d;

    iget-object v0, v0, Lmb$d;->c:Lmb;

    iget-object v0, v0, Lmb;->b:Lmb$b;

    iget-object v1, p0, Lmb$d$1;->a:Lmd;

    invoke-virtual {v0, v1}, Lmb$b;->a(Lmd;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lmp;->c()Lmp;

    move-result-object v1

    const/4 v2, 0x4

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Http2Connection.Listener failure for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lmb$d$1;->c:Lmb$d;

    iget-object v4, v4, Lmb$d;->c:Lmb;

    iget-object v4, v4, Lmb;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lmp;->a(ILjava/lang/String;Ljava/lang/Throwable;)V

    :try_start_1
    iget-object v0, p0, Lmb$d$1;->a:Lmd;

    sget-object v1, Llw;->b:Llw;

    invoke-virtual {v0, v1}, Lmd;->a(Llw;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
