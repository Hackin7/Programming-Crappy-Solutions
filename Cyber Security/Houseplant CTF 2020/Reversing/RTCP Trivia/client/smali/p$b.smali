.class final Lp$b;
.super Ls$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Ldh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldh<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field b:Ldl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldl<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lp$b;Lp;Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ls$a;-><init>(Ls$a;Ls;Landroid/content/res/Resources;)V

    if-eqz p1, :cond_0

    iget-object p2, p1, Lp$b;->a:Ldh;

    iput-object p2, p0, Lp$b;->a:Ldh;

    iget-object p1, p1, Lp$b;->b:Ldl;

    :goto_0
    iput-object p1, p0, Lp$b;->b:Ldl;

    return-void

    :cond_0
    new-instance p1, Ldh;

    invoke-direct {p1}, Ldh;-><init>()V

    iput-object p1, p0, Lp$b;->a:Ldh;

    new-instance p1, Ldl;

    invoke-direct {p1}, Ldl;-><init>()V

    goto :goto_0
.end method

.method static a(II)J
    .locals 2

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    or-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method final a(I)I
    .locals 2

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lp$b;->b:Ldl;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ldl;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method final a(IILandroid/graphics/drawable/Drawable;Z)I
    .locals 9

    invoke-super {p0, p3}, Ls$a;->a(Landroid/graphics/drawable/Drawable;)I

    move-result p3

    invoke-static {p1, p2}, Lp$b;->a(II)J

    move-result-wide v0

    if-eqz p4, :cond_0

    const-wide v2, 0x200000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    iget-object v4, p0, Lp$b;->a:Ldh;

    int-to-long v5, p3

    or-long v7, v5, v2

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v4, v0, v1, v7}, Ldh;->c(JLjava/lang/Object;)V

    if-eqz p4, :cond_1

    invoke-static {p2, p1}, Lp$b;->a(II)J

    move-result-wide p1

    iget-object p4, p0, Lp$b;->a:Ldh;

    const-wide v0, 0x100000000L

    or-long/2addr v0, v5

    or-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p4, p1, p2, v0}, Ldh;->c(JLjava/lang/Object;)V

    :cond_1
    return p3
.end method

.method final a([I)I
    .locals 0

    invoke-super {p0, p1}, Ls$a;->b([I)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    sget-object p1, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-super {p0, p1}, Ls$a;->b([I)I

    move-result p1

    return p1
.end method

.method final a()V
    .locals 1

    iget-object v0, p0, Lp$b;->a:Ldh;

    invoke-virtual {v0}, Ldh;->a()Ldh;

    move-result-object v0

    iput-object v0, p0, Lp$b;->a:Ldh;

    iget-object v0, p0, Lp$b;->b:Ldl;

    invoke-virtual {v0}, Ldl;->a()Ldl;

    move-result-object v0

    iput-object v0, p0, Lp$b;->b:Ldl;

    return-void
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, Lp;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp;-><init>(Lp$b;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Lp;

    invoke-direct {v0, p0, p1}, Lp;-><init>(Lp$b;Landroid/content/res/Resources;)V

    return-object v0
.end method
