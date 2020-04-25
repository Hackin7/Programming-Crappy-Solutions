.class public Lwtf/riceteacatpanda/quiz/LoggedIn;
.super Le;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Le;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f09001e

    invoke-virtual {p0, p1}, Lwtf/riceteacatpanda/quiz/LoggedIn;->setContentView(I)V

    invoke-virtual {p0}, Lwtf/riceteacatpanda/quiz/LoggedIn;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "u"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f07009d

    invoke-virtual {p0, v0}, Lwtf/riceteacatpanda/quiz/LoggedIn;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Welcome, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "!"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f070063

    invoke-virtual {p0, p1}, Lwtf/riceteacatpanda/quiz/LoggedIn;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance v0, Lwtf/riceteacatpanda/quiz/LoggedIn$1;

    invoke-direct {v0, p0}, Lwtf/riceteacatpanda/quiz/LoggedIn$1;-><init>(Lwtf/riceteacatpanda/quiz/LoggedIn;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
