.class public final Lld$1;
.super Lmw$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lld;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Llh;

.field final synthetic b:Lld;


# direct methods
.method public constructor <init>(Lld;Lne;Lnd;Llh;)V
    .locals 0

    iput-object p1, p0, Lld$1;->b:Lld;

    iput-object p4, p0, Lld$1;->a:Llh;

    invoke-direct {p0, p2, p3}, Lmw$e;-><init>(Lne;Lnd;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-object v0, p0, Lld$1;->a:Llh;

    iget-object v1, p0, Lld$1;->a:Llh;

    invoke-virtual {v1}, Llh;->a()Llk;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Llh;->a(ZLlk;Ljava/io/IOException;)V

    return-void
.end method
