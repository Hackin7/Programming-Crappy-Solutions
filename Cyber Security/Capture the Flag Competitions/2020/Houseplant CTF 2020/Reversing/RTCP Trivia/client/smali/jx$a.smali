.class public final Ljx$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:[Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field c:[Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field d:Z


# direct methods
.method public constructor <init>(Ljx;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Ljx;->d:Z

    iput-boolean v0, p0, Ljx$a;->a:Z

    iget-object v0, p1, Ljx;->f:[Ljava/lang/String;

    iput-object v0, p0, Ljx$a;->b:[Ljava/lang/String;

    iget-object v0, p1, Ljx;->g:[Ljava/lang/String;

    iput-object v0, p0, Ljx$a;->c:[Ljava/lang/String;

    iget-boolean p1, p1, Ljx;->e:Z

    iput-boolean p1, p0, Ljx$a;->d:Z

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ljx$a;->a:Z

    return-void
.end method


# virtual methods
.method public final a()Ljx$a;
    .locals 2

    iget-boolean v0, p0, Ljx$a;->a:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no TLS extensions for cleartext connections"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljx$a;->d:Z

    return-object p0
.end method

.method public final varargs a([Ljava/lang/String;)Ljx$a;
    .locals 1

    iget-boolean v0, p0, Ljx$a;->a:Z

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no cipher suites for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one cipher suite is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Ljx$a;->b:[Ljava/lang/String;

    return-object p0
.end method

.method public final varargs a([Lkq;)Ljx$a;
    .locals 3

    iget-boolean v0, p0, Ljx$a;->a:Z

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no TLS versions for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    array-length v0, p1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    iget-object v2, v2, Lkq;->f:Ljava/lang/String;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Ljx$a;->b([Ljava/lang/String;)Ljx$a;

    move-result-object p1

    return-object p1
.end method

.method public final varargs b([Ljava/lang/String;)Ljx$a;
    .locals 1

    iget-boolean v0, p0, Ljx$a;->a:Z

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "no TLS versions for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    array-length v0, p1

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one TLS version is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Ljx$a;->c:[Ljava/lang/String;

    return-object p0
.end method

.method public final b()Ljx;
    .locals 1

    new-instance v0, Ljx;

    invoke-direct {v0, p0}, Ljx;-><init>(Ljx$a;)V

    return-object v0
.end method
