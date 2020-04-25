.class public Lwtf/riceteacatpanda/quiz/Game;
.super Le;


# instance fields
.field j:Landroid/os/CountDownTimer;

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Le;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwtf/riceteacatpanda/quiz/Game;->k:Z

    return-void
.end method

.method static synthetic a(Lwtf/riceteacatpanda/quiz/Game;)Z
    .locals 0

    iget-boolean p0, p0, Lwtf/riceteacatpanda/quiz/Game;->k:Z

    return p0
.end method

.method static synthetic b(Lwtf/riceteacatpanda/quiz/Game;)Z
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwtf/riceteacatpanda/quiz/Game;->k:Z

    return v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Le;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f09001d

    invoke-virtual {p0, p1}, Lwtf/riceteacatpanda/quiz/Game;->setContentView(I)V

    const p1, 0x7f07002e

    invoke-virtual {p0, p1}, Lwtf/riceteacatpanda/quiz/Game;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/high16 v0, 0x7f0b0000

    invoke-static {p0, v0}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v0

    new-instance v1, Lwtf/riceteacatpanda/quiz/Game$1;

    invoke-direct {v1, p0, v0, p1}, Lwtf/riceteacatpanda/quiz/Game$1;-><init>(Lwtf/riceteacatpanda/quiz/Game;Landroid/media/MediaPlayer;Landroid/widget/TextView;)V

    iget-boolean p1, p0, Lwtf/riceteacatpanda/quiz/Game;->k:Z

    if-eqz p1, :cond_0

    invoke-static {}, Lnw;->a()Lkr;

    move-result-object p1

    const-string v0, "{\"method\":\"start\"}"

    invoke-interface {p1, v0}, Lkr;->a(Ljava/lang/String;)Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lwtf/riceteacatpanda/quiz/Game;->k:Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    :goto_0
    invoke-static {v1}, Lnw;->a(Lnv;)V

    const-string p1, "XO"

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "isFirst = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lwtf/riceteacatpanda/quiz/Game;->k:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
