.class public Lwtf/riceteacatpanda/quiz/Flag;
.super Le;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Le;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f09001c

    invoke-virtual {p0, p1}, Lwtf/riceteacatpanda/quiz/Flag;->setContentView(I)V

    const p1, 0x7f07003d

    invoke-virtual {p0, p1}, Lwtf/riceteacatpanda/quiz/Flag;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p0}, Lwtf/riceteacatpanda/quiz/Flag;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "flag"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
