.class final Lwtf/riceteacatpanda/quiz/LoggedIn$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwtf/riceteacatpanda/quiz/LoggedIn;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwtf/riceteacatpanda/quiz/LoggedIn;


# direct methods
.method constructor <init>(Lwtf/riceteacatpanda/quiz/LoggedIn;)V
    .locals 0

    iput-object p1, p0, Lwtf/riceteacatpanda/quiz/LoggedIn$1;->a:Lwtf/riceteacatpanda/quiz/LoggedIn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/LoggedIn$1;->a:Lwtf/riceteacatpanda/quiz/LoggedIn;

    const-class v1, Lwtf/riceteacatpanda/quiz/Game;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "id"

    iget-object v1, p0, Lwtf/riceteacatpanda/quiz/LoggedIn$1;->a:Lwtf/riceteacatpanda/quiz/LoggedIn;

    invoke-virtual {v1}, Lwtf/riceteacatpanda/quiz/LoggedIn;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "id"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/LoggedIn$1;->a:Lwtf/riceteacatpanda/quiz/LoggedIn;

    invoke-virtual {v0, p1}, Lwtf/riceteacatpanda/quiz/LoggedIn;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
