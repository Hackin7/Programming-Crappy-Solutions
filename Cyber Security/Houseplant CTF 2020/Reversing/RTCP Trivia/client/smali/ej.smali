.class public final Lej;
.super Lek;


# instance fields
.field private f:I

.field private g:I

.field private h:Ldu;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lek;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput p1, p0, Lej;->f:I

    iput p1, p0, Lej;->g:I

    const/16 p1, 0x8

    invoke-super {p0, p1}, Lek;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method protected final a(Landroid/util/AttributeSet;)V
    .locals 6

    invoke-super {p0, p1}, Lek;->a(Landroid/util/AttributeSet;)V

    new-instance v0, Ldu;

    invoke-direct {v0}, Ldu;-><init>()V

    iput-object v0, p0, Lej;->h:Ldu;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lej;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, La$b;->ConstraintLayout_Layout:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget v4, La$b;->ConstraintLayout_Layout_barrierDirection:I

    if-ne v3, v4, :cond_0

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {p0, v3}, Lej;->setType(I)V

    goto :goto_1

    :cond_0
    sget v4, La$b;->ConstraintLayout_Layout_barrierAllowsGoneWidgets:I

    if-ne v3, v4, :cond_1

    iget-object v4, p0, Lej;->h:Ldu;

    const/4 v5, 0x1

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v4, Ldu;->b:Z

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lej;->h:Ldu;

    iput-object p1, p0, Lej;->d:Leb;

    invoke-virtual {p0}, Lej;->a()V

    return-void
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lej;->f:I

    return v0
.end method

.method public final setType(I)V
    .locals 5

    iput p1, p0, Lej;->f:I

    iput p1, p0, Lej;->g:I

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x6

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x11

    if-ge p1, v4, :cond_1

    iget p1, p0, Lej;->f:I

    if-ne p1, v1, :cond_0

    :goto_0
    iput v2, p0, Lej;->g:I

    goto :goto_3

    :cond_0
    iget p1, p0, Lej;->f:I

    if-ne p1, v0, :cond_6

    :goto_1
    iput v3, p0, Lej;->g:I

    goto :goto_3

    :cond_1
    invoke-virtual {p0}, Lej;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    if-ne v3, p1, :cond_2

    move p1, v3

    goto :goto_2

    :cond_2
    move p1, v2

    :goto_2
    if-eqz p1, :cond_4

    iget p1, p0, Lej;->f:I

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    iget p1, p0, Lej;->f:I

    if-ne p1, v0, :cond_6

    goto :goto_0

    :cond_4
    iget p1, p0, Lej;->f:I

    if-ne p1, v1, :cond_5

    goto :goto_0

    :cond_5
    iget p1, p0, Lej;->f:I

    if-ne p1, v0, :cond_6

    goto :goto_1

    :cond_6
    :goto_3
    iget-object p1, p0, Lej;->h:Ldu;

    iget v0, p0, Lej;->g:I

    iput v0, p1, Ldu;->a:I

    return-void
.end method
