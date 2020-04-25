.class public Lwtf/riceteacatpanda/quiz/MainActivity;
.super Le;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le;-><init>()V

    return-void
.end method

.method static synthetic a(Lwtf/riceteacatpanda/quiz/MainActivity;Ljava/lang/String;)V
    .locals 11

    new-instance v0, Lki;

    invoke-direct {v0}, Lki;-><init>()V

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I

    move-result v3

    const/16 v4, 0x40

    if-ge v3, v4, :cond_0

    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkl$a;

    invoke-direct {v2}, Lkl$a;-><init>()V

    invoke-virtual {p0}, Lwtf/riceteacatpanda/quiz/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c0036

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "url == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v8, "ws:"

    const/4 v9, 0x0

    const/4 v10, 0x3

    move-object v5, v3

    invoke-virtual/range {v5 .. v10}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "http:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x3

    :goto_1
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v8, "wss:"

    const/4 v9, 0x0

    const/4 v10, 0x4

    move-object v5, v3

    invoke-virtual/range {v5 .. v10}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v4

    if-eqz v4, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "https:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x4

    goto :goto_1

    :cond_3
    :goto_2
    invoke-static {v3}, Lkf;->d(Ljava/lang/String;)Lkf;

    move-result-object v4

    if-nez v4, :cond_4

    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "unexpected url: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {v2, v4}, Lkl$a;->a(Lkf;)Lkl$a;

    move-result-object v2

    invoke-virtual {v2}, Lkl$a;->a()Lkl;

    move-result-object v4

    new-instance v5, Lwtf/riceteacatpanda/quiz/MainActivity$2;

    invoke-direct {v5, p0, v1, p1}, Lwtf/riceteacatpanda/quiz/MainActivity$2;-><init>(Lwtf/riceteacatpanda/quiz/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lmw;

    new-instance v6, Ljava/util/Random;

    invoke-direct {v6}, Ljava/util/Random;-><init>()V

    iget p1, v0, Lki;->C:I

    int-to-long v7, p1

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lmw;-><init>(Lkl;Lks;Ljava/util/Random;J)V

    new-instance p1, Lki$a;

    invoke-direct {p1, v0}, Lki$a;-><init>(Lki;)V

    sget-object v0, Lkc;->a:Lkc;

    if-nez v0, :cond_5

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "eventListener == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    invoke-static {v0}, Lkc;->a(Lkc;)Lkc$a;

    move-result-object v0

    iput-object v0, p1, Lki$a;->g:Lkc$a;

    sget-object v0, Lmw;->a:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget-object v0, Lkj;->b:Lkj;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "protocols doesn\'t contain http/1.1: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    sget-object v0, Lkj;->a:Lkj;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "protocols must not contain http/1.0: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "protocols must not contain null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    sget-object v0, Lkj;->c:Lkj;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p1, Lki$a;->c:Ljava/util/List;

    new-instance v0, Lki;

    invoke-direct {v0, p1}, Lki;-><init>(Lki$a;)V

    iget-object p1, p0, Lmw;->b:Lkl;

    invoke-virtual {p1}, Lkl;->a()Lkl$a;

    move-result-object p1

    const-string v1, "Upgrade"

    const-string v2, "websocket"

    invoke-virtual {p1, v1, v2}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    move-result-object p1

    const-string v1, "Connection"

    const-string v2, "Upgrade"

    invoke-virtual {p1, v1, v2}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    move-result-object p1

    const-string v1, "Sec-WebSocket-Key"

    iget-object v2, p0, Lmw;->f:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    move-result-object p1

    const-string v1, "Sec-WebSocket-Version"

    const-string v2, "13"

    invoke-virtual {p1, v1, v2}, Lkl$a;->a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;

    move-result-object p1

    invoke-virtual {p1}, Lkl$a;->a()Lkl;

    move-result-object p1

    sget-object v1, Lkt;->a:Lkt;

    invoke-virtual {v1, v0, p1}, Lkt;->a(Lki;Lkl;)Ljs;

    move-result-object v0

    iput-object v0, p0, Lmw;->g:Ljs;

    iget-object v0, p0, Lmw;->g:Ljs;

    new-instance v1, Lmw$2;

    invoke-direct {v1, p0, p1}, Lmw$2;-><init>(Lmw;Lkl;)V

    invoke-interface {v0, v1}, Ljs;->a(Ljt;)V

    invoke-static {p0}, Lnw;->a(Lkr;)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Le;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f09001f

    invoke-virtual {p0, p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->setContentView(I)V

    const p1, 0x7f070051

    invoke-virtual {p0, p1}, Lwtf/riceteacatpanda/quiz/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    const v0, 0x7f07009c

    invoke-virtual {p0, v0}, Lwtf/riceteacatpanda/quiz/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    new-instance v1, Lwtf/riceteacatpanda/quiz/MainActivity$1;

    invoke-direct {v1, p0, v0}, Lwtf/riceteacatpanda/quiz/MainActivity$1;-><init>(Lwtf/riceteacatpanda/quiz/MainActivity;Landroid/widget/EditText;)V

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
