.class final Lmb$d$3;
.super Lku;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh;

.field final synthetic c:Lmb$d;


# direct methods
.method varargs constructor <init>(Lmb$d;Ljava/lang/String;[Ljava/lang/Object;Lmh;)V
    .locals 0

    iput-object p1, p0, Lmb$d$3;->c:Lmb$d;

    iput-object p4, p0, Lmb$d$3;->a:Lmh;

    invoke-direct {p0, p2, p3}, Lku;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lmb$d$3;->c:Lmb$d;

    iget-object v0, v0, Lmb$d;->c:Lmb;

    iget-object v0, v0, Lmb;->q:Lme;

    iget-object v1, p0, Lmb$d$3;->a:Lmh;

    invoke-virtual {v0, v1}, Lme;->a(Lmh;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object v0, p0, Lmb$d$3;->c:Lmb$d;

    iget-object v0, v0, Lmb$d;->c:Lmb;

    invoke-static {v0}, Lmb;->a(Lmb;)V

    return-void
.end method
