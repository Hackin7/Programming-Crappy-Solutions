.class final Lwtf/riceteacatpanda/quiz/Game$1$1$1;
.super Landroid/os/CountDownTimer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwtf/riceteacatpanda/quiz/Game$1$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwtf/riceteacatpanda/quiz/Game$1$1;


# direct methods
.method constructor <init>(Lwtf/riceteacatpanda/quiz/Game$1$1;)V
    .locals 4

    iput-object p1, p0, Lwtf/riceteacatpanda/quiz/Game$1$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1$1;

    const-wide/16 v0, 0x2710

    const-wide/16 v2, 0x3e8

    invoke-direct {p0, v0, v1, v2, v3}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 2

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/Game$1$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1$1;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game$1;->b:Landroid/widget/TextView;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onTick(J)V
    .locals 3

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/Game$1$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1$1;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game$1$1;->a:Lwtf/riceteacatpanda/quiz/Game$1;

    iget-object v0, v0, Lwtf/riceteacatpanda/quiz/Game$1;->b:Landroid/widget/TextView;

    const-wide/16 v1, 0x3e8

    div-long/2addr p1, v1

    long-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
