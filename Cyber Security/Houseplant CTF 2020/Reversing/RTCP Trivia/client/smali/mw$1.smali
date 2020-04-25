.class final Lmw$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmw;-><init>(Lkl;Lks;Ljava/util/Random;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmw;


# direct methods
.method constructor <init>(Lmw;)V
    .locals 0

    iput-object p1, p0, Lmw$1;->a:Lmw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :cond_0
    :try_start_0
    iget-object v0, p0, Lmw$1;->a:Lmw;

    invoke-virtual {v0}, Lmw;->d()Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lmw$1;->a:Lmw;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lmw;->a(Ljava/lang/Exception;Lkn;)V

    return-void
.end method
