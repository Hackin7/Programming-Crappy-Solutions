.class public final enum Lkj;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkj;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lkj;

.field public static final enum b:Lkj;

.field public static final enum c:Lkj;

.field public static final enum d:Lkj;

.field public static final enum e:Lkj;

.field private static final synthetic g:[Lkj;


# instance fields
.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkj;

    const-string v1, "HTTP_1_0"

    const-string v2, "http/1.0"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lkj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkj;->a:Lkj;

    new-instance v0, Lkj;

    const-string v1, "HTTP_1_1"

    const-string v2, "http/1.1"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lkj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkj;->b:Lkj;

    new-instance v0, Lkj;

    const-string v1, "SPDY_3"

    const-string v2, "spdy/3.1"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lkj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkj;->c:Lkj;

    new-instance v0, Lkj;

    const-string v1, "HTTP_2"

    const-string v2, "h2"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lkj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkj;->d:Lkj;

    new-instance v0, Lkj;

    const-string v1, "QUIC"

    const-string v2, "quic"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lkj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkj;->e:Lkj;

    const/4 v0, 0x5

    new-array v0, v0, [Lkj;

    sget-object v1, Lkj;->a:Lkj;

    aput-object v1, v0, v3

    sget-object v1, Lkj;->b:Lkj;

    aput-object v1, v0, v4

    sget-object v1, Lkj;->c:Lkj;

    aput-object v1, v0, v5

    sget-object v1, Lkj;->d:Lkj;

    aput-object v1, v0, v6

    sget-object v1, Lkj;->e:Lkj;

    aput-object v1, v0, v7

    sput-object v0, Lkj;->g:[Lkj;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lkj;->f:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lkj;
    .locals 3

    sget-object v0, Lkj;->a:Lkj;

    iget-object v0, v0, Lkj;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lkj;->a:Lkj;

    return-object p0

    :cond_0
    sget-object v0, Lkj;->b:Lkj;

    iget-object v0, v0, Lkj;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lkj;->b:Lkj;

    return-object p0

    :cond_1
    sget-object v0, Lkj;->d:Lkj;

    iget-object v0, v0, Lkj;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lkj;->d:Lkj;

    return-object p0

    :cond_2
    sget-object v0, Lkj;->c:Lkj;

    iget-object v0, v0, Lkj;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lkj;->c:Lkj;

    return-object p0

    :cond_3
    sget-object v0, Lkj;->e:Lkj;

    iget-object v0, v0, Lkj;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lkj;->e:Lkj;

    return-object p0

    :cond_4
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected protocol: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkj;
    .locals 1

    const-class v0, Lkj;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkj;

    return-object p0
.end method

.method public static values()[Lkj;
    .locals 1

    sget-object v0, Lkj;->g:[Lkj;

    invoke-virtual {v0}, [Lkj;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkj;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkj;->f:Ljava/lang/String;

    return-object v0
.end method
