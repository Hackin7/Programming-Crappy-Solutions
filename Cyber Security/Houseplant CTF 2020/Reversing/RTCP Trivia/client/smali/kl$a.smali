.class public final Lkl$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Lkf;

.field b:Ljava/lang/String;

.field public c:Lke$a;

.field d:Lkm;

.field e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "GET"

    iput-object v0, p0, Lkl$a;->b:Ljava/lang/String;

    new-instance v0, Lke$a;

    invoke-direct {v0}, Lke$a;-><init>()V

    iput-object v0, p0, Lkl$a;->c:Lke$a;

    return-void
.end method

.method constructor <init>(Lkl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lkl;->a:Lkf;

    iput-object v0, p0, Lkl$a;->a:Lkf;

    iget-object v0, p1, Lkl;->b:Ljava/lang/String;

    iput-object v0, p0, Lkl$a;->b:Ljava/lang/String;

    iget-object v0, p1, Lkl;->d:Lkm;

    iput-object v0, p0, Lkl$a;->d:Lkm;

    iget-object v0, p1, Lkl;->e:Ljava/lang/Object;

    iput-object v0, p0, Lkl$a;->e:Ljava/lang/Object;

    iget-object p1, p1, Lkl;->c:Lke;

    invoke-virtual {p1}, Lke;->a()Lke$a;

    move-result-object p1

    iput-object p1, p0, Lkl$a;->c:Lke$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lkl$a;
    .locals 1

    iget-object v0, p0, Lkl$a;->c:Lke$a;

    invoke-virtual {v0, p1}, Lke$a;->a(Ljava/lang/String;)Lke$a;

    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Lkl$a;
    .locals 1

    iget-object v0, p0, Lkl$a;->c:Lke$a;

    invoke-static {p1, p2}, Lke$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lke$a;->a(Ljava/lang/String;)Lke$a;

    invoke-virtual {v0, p1, p2}, Lke$a;->a(Ljava/lang/String;Ljava/lang/String;)Lke$a;

    return-object p0
.end method

.method public final a(Ljava/lang/String;Lkm;)Lkl$a;
    .locals 2
    .param p2    # Lkm;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "method == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.length() == 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-eqz p2, :cond_2

    invoke-static {p1}, Lln;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "method "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must not have a request body."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    if-nez p2, :cond_5

    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "PUT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "PATCH"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "PROPPATCH"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "REPORT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_5

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "method "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must have a request body."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    iput-object p1, p0, Lkl$a;->b:Ljava/lang/String;

    iput-object p2, p0, Lkl$a;->d:Lkm;

    return-object p0
.end method

.method public final a(Lkf;)Lkl$a;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lkl$a;->a:Lkf;

    return-object p0
.end method

.method public final a()Lkl;
    .locals 2

    iget-object v0, p0, Lkl$a;->a:Lkf;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lkl;

    invoke-direct {v0, p0}, Lkl;-><init>(Lkl$a;)V

    return-object v0
.end method
