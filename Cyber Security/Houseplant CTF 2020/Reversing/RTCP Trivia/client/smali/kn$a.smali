.class public final Lkn$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lkl;

.field public b:Lkj;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lkd;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field f:Lke$a;

.field public g:Lko;

.field h:Lkn;

.field i:Lkn;

.field public j:Lkn;

.field public k:J

.field public l:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lkn$a;->c:I

    new-instance v0, Lke$a;

    invoke-direct {v0}, Lke$a;-><init>()V

    iput-object v0, p0, Lkn$a;->f:Lke$a;

    return-void
.end method

.method constructor <init>(Lkn;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lkn$a;->c:I

    iget-object v0, p1, Lkn;->a:Lkl;

    iput-object v0, p0, Lkn$a;->a:Lkl;

    iget-object v0, p1, Lkn;->b:Lkj;

    iput-object v0, p0, Lkn$a;->b:Lkj;

    iget v0, p1, Lkn;->c:I

    iput v0, p0, Lkn$a;->c:I

    iget-object v0, p1, Lkn;->d:Ljava/lang/String;

    iput-object v0, p0, Lkn$a;->d:Ljava/lang/String;

    iget-object v0, p1, Lkn;->e:Lkd;

    iput-object v0, p0, Lkn$a;->e:Lkd;

    iget-object v0, p1, Lkn;->f:Lke;

    invoke-virtual {v0}, Lke;->a()Lke$a;

    move-result-object v0

    iput-object v0, p0, Lkn$a;->f:Lke$a;

    iget-object v0, p1, Lkn;->g:Lko;

    iput-object v0, p0, Lkn$a;->g:Lko;

    iget-object v0, p1, Lkn;->h:Lkn;

    iput-object v0, p0, Lkn$a;->h:Lkn;

    iget-object v0, p1, Lkn;->i:Lkn;

    iput-object v0, p0, Lkn$a;->i:Lkn;

    iget-object v0, p1, Lkn;->j:Lkn;

    iput-object v0, p0, Lkn$a;->j:Lkn;

    iget-wide v0, p1, Lkn;->k:J

    iput-wide v0, p0, Lkn$a;->k:J

    iget-wide v0, p1, Lkn;->l:J

    iput-wide v0, p0, Lkn$a;->l:J

    return-void
.end method

.method private static a(Ljava/lang/String;Lkn;)V
    .locals 1

    iget-object v0, p1, Lkn;->g:Lko;

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".body != null"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p1, Lkn;->h:Lkn;

    if-eqz v0, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".networkResponse != null"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p1, Lkn;->i:Lkn;

    if-eqz v0, :cond_2

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".cacheResponse != null"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p1, Lkn;->j:Lkn;

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".priorResponse != null"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Lkn$a;
    .locals 1

    iget-object v0, p0, Lkn$a;->f:Lke$a;

    invoke-static {p1, p2}, Lke$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Lke$a;->a(Ljava/lang/String;Ljava/lang/String;)Lke$a;

    return-object p0
.end method

.method public final a(Lke;)Lkn$a;
    .locals 0

    invoke-virtual {p1}, Lke;->a()Lke$a;

    move-result-object p1

    iput-object p1, p0, Lkn$a;->f:Lke$a;

    return-object p0
.end method

.method public final a(Lkn;)Lkn$a;
    .locals 1
    .param p1    # Lkn;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "networkResponse"

    invoke-static {v0, p1}, Lkn$a;->a(Ljava/lang/String;Lkn;)V

    :cond_0
    iput-object p1, p0, Lkn$a;->h:Lkn;

    return-object p0
.end method

.method public final a()Lkn;
    .locals 3

    iget-object v0, p0, Lkn$a;->a:Lkl;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lkn$a;->b:Lkj;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lkn$a;->c:I

    if-gez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "code < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lkn$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lkn$a;->d:Ljava/lang/String;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Lkn;

    invoke-direct {v0, p0}, Lkn;-><init>(Lkn$a;)V

    return-object v0
.end method

.method public final b(Lkn;)Lkn$a;
    .locals 1
    .param p1    # Lkn;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "cacheResponse"

    invoke-static {v0, p1}, Lkn$a;->a(Ljava/lang/String;Lkn;)V

    :cond_0
    iput-object p1, p0, Lkn$a;->i:Lkn;

    return-object p0
.end method
