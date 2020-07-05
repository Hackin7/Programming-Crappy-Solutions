.class final Lwtf/riceteacatpanda/quiz/Game$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwtf/riceteacatpanda/quiz/Game$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwtf/riceteacatpanda/quiz/Game$1;


# direct methods
.method constructor <init>(Lwtf/riceteacatpanda/quiz/Game$1;)V
    .locals 0

    iput-object p1, p0, Lwtf/riceteacatpanda/quiz/Game$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/Game$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game$1;->c:Lwtf/riceteacatpanda/quiz/Game;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game;->j:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/Game$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game$1;->c:Lwtf/riceteacatpanda/quiz/Game;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game;->j:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/Game$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game$1;->c:Lwtf/riceteacatpanda/quiz/Game;

    const/4 v1, 0x0

    iput-object v1, v0, Lwtf/riceteacatpanda/quiz/Game;->j:Landroid/os/CountDownTimer;

    :cond_0
    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/Game$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game$1;->c:Lwtf/riceteacatpanda/quiz/Game;

    new-instance v1, Lwtf/riceteacatpanda/quiz/Game$1$1$1;

    invoke-direct {v1, p0}, Lwtf/riceteacatpanda/quiz/Game$1$1$1;-><init>(Lwtf/riceteacatpanda/quiz/Game$1$1;)V

    iput-object v1, v0, Lwtf/riceteacatpanda/quiz/Game;->j:Landroid/os/CountDownTimer;

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/Game$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game$1;->c:Lwtf/riceteacatpanda/quiz/Game;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game;->j:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method
