.class final Lba$c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lba;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lba;

.field private b:Lba$e;


# direct methods
.method public constructor <init>(Lba;Lba$e;)V
    .locals 0

    iput-object p1, p0, Lba$c;->a:Lba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lba$c;->b:Lba$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lba$c;->a:Lba;

    invoke-static {v0}, Lba;->d(Lba;)Laj;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lba$c;->a:Lba;

    invoke-static {v0}, Lba;->e(Lba;)Laj;

    move-result-object v0

    iget-object v1, v0, Laj;->b:Laj$a;

    if-eqz v1, :cond_0

    iget-object v1, v0, Laj;->b:Laj$a;

    invoke-interface {v1, v0}, Laj$a;->a(Laj;)V

    :cond_0
    iget-object v0, p0, Lba$c;->a:Lba;

    invoke-static {v0}, Lba;->f(Lba;)Lar;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lba$c;->b:Lba$e;

    invoke-virtual {v0}, Lba$e;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lba$c;->a:Lba;

    iget-object v1, p0, Lba$c;->b:Lba$e;

    iput-object v1, v0, Lba;->m:Lba$e;

    :cond_1
    iget-object v0, p0, Lba$c;->a:Lba;

    const/4 v1, 0x0

    iput-object v1, v0, Lba;->o:Lba$c;

    return-void
.end method
