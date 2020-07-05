.class abstract Ljn$e;
.super Ljn$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "e"
.end annotation


# instance fields
.field protected m:[Lff$b;

.field n:Ljava/lang/String;

.field o:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljn$d;-><init>(B)V

    const/4 v0, 0x0

    iput-object v0, p0, Ljn$e;->m:[Lff$b;

    return-void
.end method

.method public constructor <init>(Ljn$e;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljn$d;-><init>(B)V

    const/4 v0, 0x0

    iput-object v0, p0, Ljn$e;->m:[Lff$b;

    iget-object v0, p1, Ljn$e;->n:Ljava/lang/String;

    iput-object v0, p0, Ljn$e;->n:Ljava/lang/String;

    iget v0, p1, Ljn$e;->o:I

    iput v0, p0, Ljn$e;->o:I

    iget-object p1, p1, Ljn$e;->m:[Lff$b;

    invoke-static {p1}, Lff;->a([Lff$b;)[Lff$b;

    move-result-object p1

    iput-object p1, p0, Ljn$e;->m:[Lff$b;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Path;)V
    .locals 1

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Ljn$e;->m:[Lff$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljn$e;->m:[Lff$b;

    invoke-static {v0, p1}, Lff$b;->a([Lff$b;Landroid/graphics/Path;)V

    :cond_0
    return-void
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getPathData()[Lff$b;
    .locals 1

    iget-object v0, p0, Ljn$e;->m:[Lff$b;

    return-object v0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljn$e;->n:Ljava/lang/String;

    return-object v0
.end method

.method public setPathData([Lff$b;)V
    .locals 6

    iget-object v0, p0, Ljn$e;->m:[Lff$b;

    invoke-static {v0, p1}, Lff;->a([Lff$b;[Lff$b;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lff;->a([Lff$b;)[Lff$b;

    move-result-object p1

    iput-object p1, p0, Ljn$e;->m:[Lff$b;

    return-void

    :cond_0
    iget-object v0, p0, Ljn$e;->m:[Lff$b;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_2

    aget-object v3, v0, v2

    aget-object v4, p1, v2

    iget-char v4, v4, Lff$b;->a:C

    iput-char v4, v3, Lff$b;->a:C

    move v3, v1

    :goto_1
    aget-object v4, p1, v2

    iget-object v4, v4, Lff$b;->b:[F

    array-length v4, v4

    if-ge v3, v4, :cond_1

    aget-object v4, v0, v2

    iget-object v4, v4, Lff$b;->b:[F

    aget-object v5, p1, v2

    iget-object v5, v5, Lff$b;->b:[F

    aget v5, v5, v3

    aput v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
