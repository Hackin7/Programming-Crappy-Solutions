.class final Lwtf/riceteacatpanda/quiz/MainActivity$2;
.super Lks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwtf/riceteacatpanda/quiz/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lwtf/riceteacatpanda/quiz/MainActivity;


# direct methods
.method constructor <init>(Lwtf/riceteacatpanda/quiz/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    iput-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->b:Ljava/lang/String;

    invoke-direct {p0}, Lks;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)V
    .locals 3

    const-string v0, "WS"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CLOSE: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f0b0001

    invoke-static {p1, p2}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    new-instance p1, Landroid/content/Intent;

    iget-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    const-class v0, Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {p2, p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;Lkn;)V
    .locals 3

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {v0}, Lwtf/riceteacatpanda/quiz/MainActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0b0001

    invoke-static {v0, v1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    const-string v0, "WS"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CLOSE: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Landroid/content/Intent;

    iget-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    const-class v0, Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {p2, p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final a(Lkr;Ljava/lang/String;)V
    .locals 3

    :try_start_0
    const-string v0, "WS"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "IN: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "method"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ident"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p1, "success"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroid/content/Intent;

    iget-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    const-class v0, Lwtf/riceteacatpanda/quiz/LoggedIn;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p2, "u"

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->b:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "id"

    iget-object v1, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->a:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {p2, p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    iget-object p1, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->finish()V

    return-void

    :cond_1
    const-string v2, "end"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string p2, ""

    invoke-interface {p1, p2}, Lkr;->b(Ljava/lang/String;)Z

    return-void

    :cond_2
    const-string p1, "question"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Lnw;->b()Lnv;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {}, Lnw;->b()Lnv;

    move-result-object p1

    iput-object p2, p1, Lnv;->d:Ljava/lang/String;

    invoke-static {}, Lnw;->b()Lnv;

    move-result-object p1

    invoke-virtual {p1}, Lnv;->run()V

    return-void

    :cond_3
    const-string p1, "flag"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "flag"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Landroid/content/Intent;

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    const-class v1, Lwtf/riceteacatpanda/quiz/Flag;

    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "flag"

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {p1, p2}, Lwtf/riceteacatpanda/quiz/MainActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    return-void
.end method

.method public final a(Lkr;Lkn;)V
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "method"

    const-string v2, "ident"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "userToken"

    iget-object v2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lkr;->a(Ljava/lang/String;)Z

    const-string v1, "WS"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OUT: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1, p2}, Lks;->a(Lkr;Lkn;)V

    return-void
.end method

.method public final b(ILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {v0}, Lwtf/riceteacatpanda/quiz/MainActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0b0001

    invoke-static {v0, v1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    const-string v0, "WS"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CLOSE: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Landroid/content/Intent;

    iget-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    const-class v0, Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p2, p0, Lwtf/riceteacatpanda/quiz/MainActivity$2;->c:Lwtf/riceteacatpanda/quiz/MainActivity;

    invoke-virtual {p2, p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
