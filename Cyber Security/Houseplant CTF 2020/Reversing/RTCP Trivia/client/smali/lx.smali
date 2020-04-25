.class public final Llx;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lnf;

.field public static final b:Lnf;

.field public static final c:Lnf;

.field public static final d:Lnf;

.field public static final e:Lnf;

.field public static final f:Lnf;


# instance fields
.field public final g:Lnf;

.field public final h:Lnf;

.field final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, ":"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Llx;->a:Lnf;

    const-string v0, ":status"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Llx;->b:Lnf;

    const-string v0, ":method"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Llx;->c:Lnf;

    const-string v0, ":path"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Llx;->d:Lnf;

    const-string v0, ":scheme"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Llx;->e:Lnf;

    const-string v0, ":authority"

    invoke-static {v0}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object v0

    sput-object v0, Llx;->f:Lnf;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object p1

    invoke-static {p2}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Llx;-><init>(Lnf;Lnf;)V

    return-void
.end method

.method public constructor <init>(Lnf;Ljava/lang/String;)V
    .locals 0

    invoke-static {p2}, Lnf;->a(Ljava/lang/String;)Lnf;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Llx;-><init>(Lnf;Lnf;)V

    return-void
.end method

.method public constructor <init>(Lnf;Lnf;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llx;->g:Lnf;

    iput-object p2, p0, Llx;->h:Lnf;

    invoke-virtual {p1}, Lnf;->g()I

    move-result p1

    const/16 v0, 0x20

    add-int/2addr v0, p1

    invoke-virtual {p2}, Lnf;->g()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, Llx;->i:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Llx;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Llx;

    iget-object v0, p0, Llx;->g:Lnf;

    iget-object v2, p1, Llx;->g:Lnf;

    invoke-virtual {v0, v2}, Lnf;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llx;->h:Lnf;

    iget-object p1, p1, Llx;->h:Lnf;

    invoke-virtual {v0, p1}, Lnf;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Llx;->g:Lnf;

    invoke-virtual {v0}, Lnf;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    const/16 v0, 0x1f

    mul-int/2addr v0, v1

    iget-object v1, p0, Llx;->h:Lnf;

    invoke-virtual {v1}, Lnf;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    const-string v0, "%s: %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Llx;->g:Lnf;

    invoke-virtual {v2}, Lnf;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Llx;->h:Lnf;

    invoke-virtual {v2}, Lnf;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lkv;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
