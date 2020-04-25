.class final Lmb$d$2;
.super Lku;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb$d;->a(Lmh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmb$d;


# direct methods
.method varargs constructor <init>(Lmb$d;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lmb$d$2;->a:Lmb$d;

    invoke-direct {p0, p2, p3}, Lku;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lmb$d$2;->a:Lmb$d;

    iget-object v0, v0, Lmb$d;->c:Lmb;

    iget-object v0, v0, Lmb;->b:Lmb$b;

    iget-object v1, p0, Lmb$d$2;->a:Lmb$d;

    iget-object v1, v1, Lmb$d;->c:Lmb;

    invoke-virtual {v0, v1}, Lmb$b;->a(Lmb;)V

    return-void
.end method
