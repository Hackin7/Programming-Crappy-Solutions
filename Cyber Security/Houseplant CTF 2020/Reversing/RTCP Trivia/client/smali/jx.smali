.class public final Ljx;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljx$a;
    }
.end annotation


# static fields
.field public static final a:Ljx;

.field public static final b:Ljx;

.field public static final c:Ljx;

.field private static final h:[Ljv;


# instance fields
.field final d:Z

.field public final e:Z

.field final f:[Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final g:[Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/16 v0, 0xd

    new-array v0, v0, [Ljv;

    sget-object v1, Ljv;->aX:Ljv;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ljv;->bb:Ljv;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Ljv;->aY:Ljv;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    sget-object v1, Ljv;->bc:Ljv;

    const/4 v5, 0x3

    aput-object v1, v0, v5

    sget-object v1, Ljv;->bi:Ljv;

    const/4 v6, 0x4

    aput-object v1, v0, v6

    sget-object v1, Ljv;->bh:Ljv;

    const/4 v7, 0x5

    aput-object v1, v0, v7

    sget-object v1, Ljv;->aI:Ljv;

    const/4 v7, 0x6

    aput-object v1, v0, v7

    sget-object v1, Ljv;->aJ:Ljv;

    const/4 v7, 0x7

    aput-object v1, v0, v7

    sget-object v1, Ljv;->ag:Ljv;

    const/16 v7, 0x8

    aput-object v1, v0, v7

    sget-object v1, Ljv;->ah:Ljv;

    const/16 v7, 0x9

    aput-object v1, v0, v7

    sget-object v1, Ljv;->E:Ljv;

    const/16 v7, 0xa

    aput-object v1, v0, v7

    sget-object v1, Ljv;->I:Ljv;

    const/16 v7, 0xb

    aput-object v1, v0, v7

    sget-object v1, Ljv;->i:Ljv;

    const/16 v7, 0xc

    aput-object v1, v0, v7

    sput-object v0, Ljx;->h:[Ljv;

    new-instance v0, Ljx$a;

    invoke-direct {v0, v3}, Ljx$a;-><init>(Z)V

    sget-object v1, Ljx;->h:[Ljv;

    iget-boolean v7, v0, Ljx$a;->a:Z

    if-nez v7, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no cipher suites for cleartext connections"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    array-length v7, v1

    new-array v7, v7, [Ljava/lang/String;

    move v8, v2

    :goto_0
    array-length v9, v1

    if-ge v8, v9, :cond_1

    aget-object v9, v1, v8

    iget-object v9, v9, Ljv;->bj:Ljava/lang/String;

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v7}, Ljx$a;->a([Ljava/lang/String;)Ljx$a;

    move-result-object v0

    new-array v1, v6, [Lkq;

    sget-object v6, Lkq;->a:Lkq;

    aput-object v6, v1, v2

    sget-object v6, Lkq;->b:Lkq;

    aput-object v6, v1, v3

    sget-object v6, Lkq;->c:Lkq;

    aput-object v6, v1, v4

    sget-object v4, Lkq;->d:Lkq;

    aput-object v4, v1, v5

    invoke-virtual {v0, v1}, Ljx$a;->a([Lkq;)Ljx$a;

    move-result-object v0

    invoke-virtual {v0}, Ljx$a;->a()Ljx$a;

    move-result-object v0

    invoke-virtual {v0}, Ljx$a;->b()Ljx;

    move-result-object v0

    sput-object v0, Ljx;->a:Ljx;

    new-instance v0, Ljx$a;

    sget-object v1, Ljx;->a:Ljx;

    invoke-direct {v0, v1}, Ljx$a;-><init>(Ljx;)V

    new-array v1, v3, [Lkq;

    sget-object v3, Lkq;->d:Lkq;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Ljx$a;->a([Lkq;)Ljx$a;

    move-result-object v0

    invoke-virtual {v0}, Ljx$a;->a()Ljx$a;

    move-result-object v0

    invoke-virtual {v0}, Ljx$a;->b()Ljx;

    move-result-object v0

    sput-object v0, Ljx;->b:Ljx;

    new-instance v0, Ljx$a;

    invoke-direct {v0, v2}, Ljx$a;-><init>(Z)V

    invoke-virtual {v0}, Ljx$a;->b()Ljx;

    move-result-object v0

    sput-object v0, Ljx;->c:Ljx;

    return-void
.end method

.method constructor <init>(Ljx$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Ljx$a;->a:Z

    iput-boolean v0, p0, Ljx;->d:Z

    iget-object v0, p1, Ljx$a;->b:[Ljava/lang/String;

    iput-object v0, p0, Ljx;->f:[Ljava/lang/String;

    iget-object v0, p1, Ljx$a;->c:[Ljava/lang/String;

    iput-object v0, p0, Ljx;->g:[Ljava/lang/String;

    iget-boolean p1, p1, Ljx$a;->d:Z

    iput-boolean p1, p0, Ljx;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 4

    iget-boolean v0, p0, Ljx;->d:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ljx;->g:[Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v0, Lkv;->h:Ljava/util/Comparator;

    iget-object v2, p0, Ljx;->g:[Ljava/lang/String;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lkv;->b(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Ljx;->f:[Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v0, Ljv;->a:Ljava/util/Comparator;

    iget-object v2, p0, Ljx;->f:[Ljava/lang/String;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lkv;->b(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, Ljx;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    check-cast p1, Ljx;

    iget-boolean v2, p0, Ljx;->d:Z

    iget-boolean v3, p1, Ljx;->d:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-boolean v2, p0, Ljx;->d:Z

    if-eqz v2, :cond_5

    iget-object v2, p0, Ljx;->f:[Ljava/lang/String;

    iget-object v3, p1, Ljx;->f:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Ljx;->g:[Ljava/lang/String;

    iget-object v3, p1, Ljx;->g:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Ljx;->e:Z

    iget-boolean p1, p1, Ljx;->e:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Ljx;->d:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x20f

    iget-object v1, p0, Ljx;->f:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljx;->g:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/2addr v1, v0

    iget-boolean v0, p0, Ljx;->e:Z

    xor-int/lit8 v0, v0, 0x1

    add-int/2addr v1, v0

    return v1

    :cond_0
    const/16 v1, 0x11

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Ljx;->d:Z

    if-nez v0, :cond_0

    const-string v0, "ConnectionSpec()"

    return-object v0

    :cond_0
    iget-object v0, p0, Ljx;->f:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ljx;->f:[Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljx;->f:[Ljava/lang/String;

    invoke-static {v0}, Ljv;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const-string v0, "[all enabled]"

    :goto_1
    iget-object v2, p0, Ljx;->g:[Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v2, p0, Ljx;->g:[Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v1, p0, Ljx;->g:[Ljava/lang/String;

    invoke-static {v1}, Lkq;->a([Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_4
    const-string v1, "[all enabled]"

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ConnectionSpec(cipherSuites="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tlsVersions="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", supportsTlsExtensions="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ljx;->e:Z

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
