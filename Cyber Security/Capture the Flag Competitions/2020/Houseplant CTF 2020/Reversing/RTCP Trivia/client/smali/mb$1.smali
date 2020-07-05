.class final Lmb$1;
.super Lku;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb;->a(ILlw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Llw;

.field final synthetic d:Lmb;


# direct methods
.method varargs constructor <init>(Lmb;Ljava/lang/String;[Ljava/lang/Object;ILlw;)V
    .locals 0

    iput-object p1, p0, Lmb$1;->d:Lmb;

    iput p4, p0, Lmb$1;->a:I

    iput-object p5, p0, Lmb$1;->c:Llw;

    invoke-direct {p0, p2, p3}, Lku;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lmb$1;->d:Lmb;

    iget v1, p0, Lmb$1;->a:I

    iget-object v2, p0, Lmb$1;->c:Llw;

    invoke-virtual {v0, v1, v2}, Lmb;->b(ILlw;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object v0, p0, Lmb$1;->d:Lmb;

    invoke-static {v0}, Lmb;->a(Lmb;)V

    return-void
.end method
