.class final Ljn$b;
.super Ljn$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Ley;

.field b:F

.field c:Ley;

.field d:F

.field e:I

.field f:F

.field g:F

.field h:F

.field i:F

.field j:Landroid/graphics/Paint$Cap;

.field k:Landroid/graphics/Paint$Join;

.field l:F

.field private p:[I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljn$e;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ljn$b;->b:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Ljn$b;->d:F

    const/4 v2, 0x0

    iput v2, p0, Ljn$b;->e:I

    iput v1, p0, Ljn$b;->f:F

    iput v0, p0, Ljn$b;->g:F

    iput v1, p0, Ljn$b;->h:F

    iput v0, p0, Ljn$b;->i:F

    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Ljn$b;->j:Landroid/graphics/Paint$Cap;

    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Ljn$b;->k:Landroid/graphics/Paint$Join;

    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Ljn$b;->l:F

    return-void
.end method

.method public constructor <init>(Ljn$b;)V
    .locals 3

    invoke-direct {p0, p1}, Ljn$e;-><init>(Ljn$e;)V

    const/4 v0, 0x0

    iput v0, p0, Ljn$b;->b:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Ljn$b;->d:F

    const/4 v2, 0x0

    iput v2, p0, Ljn$b;->e:I

    iput v1, p0, Ljn$b;->f:F

    iput v0, p0, Ljn$b;->g:F

    iput v1, p0, Ljn$b;->h:F

    iput v0, p0, Ljn$b;->i:F

    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Ljn$b;->j:Landroid/graphics/Paint$Cap;

    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Ljn$b;->k:Landroid/graphics/Paint$Join;

    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Ljn$b;->l:F

    iget-object v0, p1, Ljn$b;->p:[I

    iput-object v0, p0, Ljn$b;->p:[I

    iget-object v0, p1, Ljn$b;->a:Ley;

    iput-object v0, p0, Ljn$b;->a:Ley;

    iget v0, p1, Ljn$b;->b:F

    iput v0, p0, Ljn$b;->b:F

    iget v0, p1, Ljn$b;->d:F

    iput v0, p0, Ljn$b;->d:F

    iget-object v0, p1, Ljn$b;->c:Ley;

    iput-object v0, p0, Ljn$b;->c:Ley;

    iget v0, p1, Ljn$b;->e:I

    iput v0, p0, Ljn$b;->e:I

    iget v0, p1, Ljn$b;->f:F

    iput v0, p0, Ljn$b;->f:F

    iget v0, p1, Ljn$b;->g:F

    iput v0, p0, Ljn$b;->g:F

    iget v0, p1, Ljn$b;->h:F

    iput v0, p0, Ljn$b;->h:F

    iget v0, p1, Ljn$b;->i:F

    iput v0, p0, Ljn$b;->i:F

    iget-object v0, p1, Ljn$b;->j:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Ljn$b;->j:Landroid/graphics/Paint$Cap;

    iget-object v0, p1, Ljn$b;->k:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Ljn$b;->k:Landroid/graphics/Paint$Join;

    iget p1, p1, Ljn$b;->l:F

    iput p1, p0, Ljn$b;->l:F

    return-void
.end method


# virtual methods
.method final a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Ljn$b;->p:[I

    const-string v0, "pathData"

    invoke-static {p2, v0}, Lfd;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iput-object v0, p0, Ljn$b;->n:Ljava/lang/String;

    :cond_1
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lff;->b(Ljava/lang/String;)[Lff$b;

    move-result-object v0

    iput-object v0, p0, Ljn$b;->m:[Lff$b;

    :cond_2
    const-string v0, "fillColor"

    const/4 v1, 0x1

    invoke-static {p1, p2, p3, v0, v1}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Ley;

    move-result-object v0

    iput-object v0, p0, Ljn$b;->c:Ley;

    const-string v0, "fillAlpha"

    const/16 v1, 0xc

    iget v2, p0, Ljn$b;->f:F

    invoke-static {p1, p2, v0, v1, v2}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v0

    iput v0, p0, Ljn$b;->f:F

    const-string v0, "strokeLineCap"

    const/16 v1, 0x8

    const/4 v2, -0x1

    invoke-static {p1, p2, v0, v1, v2}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v0

    iget-object v1, p0, Ljn$b;->j:Landroid/graphics/Paint$Cap;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-object v1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :pswitch_1
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :pswitch_2
    sget-object v1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    :goto_0
    iput-object v1, p0, Ljn$b;->j:Landroid/graphics/Paint$Cap;

    const-string v0, "strokeLineJoin"

    const/16 v1, 0x9

    invoke-static {p1, p2, v0, v1, v2}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v0

    iget-object v1, p0, Ljn$b;->k:Landroid/graphics/Paint$Join;

    packed-switch v0, :pswitch_data_1

    goto :goto_1

    :pswitch_3
    sget-object v1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    goto :goto_1

    :pswitch_4
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    goto :goto_1

    :pswitch_5
    sget-object v1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    :goto_1
    iput-object v1, p0, Ljn$b;->k:Landroid/graphics/Paint$Join;

    const-string v0, "strokeMiterLimit"

    const/16 v1, 0xa

    iget v2, p0, Ljn$b;->l:F

    invoke-static {p1, p2, v0, v1, v2}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v0

    iput v0, p0, Ljn$b;->l:F

    const-string v0, "strokeColor"

    const/4 v1, 0x3

    invoke-static {p1, p2, p3, v0, v1}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Ley;

    move-result-object p3

    iput-object p3, p0, Ljn$b;->a:Ley;

    const-string p3, "strokeAlpha"

    const/16 v0, 0xb

    iget v1, p0, Ljn$b;->d:F

    invoke-static {p1, p2, p3, v0, v1}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p3

    iput p3, p0, Ljn$b;->d:F

    const-string p3, "strokeWidth"

    const/4 v0, 0x4

    iget v1, p0, Ljn$b;->b:F

    invoke-static {p1, p2, p3, v0, v1}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p3

    iput p3, p0, Ljn$b;->b:F

    const-string p3, "trimPathEnd"

    const/4 v0, 0x6

    iget v1, p0, Ljn$b;->h:F

    invoke-static {p1, p2, p3, v0, v1}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p3

    iput p3, p0, Ljn$b;->h:F

    const-string p3, "trimPathOffset"

    const/4 v0, 0x7

    iget v1, p0, Ljn$b;->i:F

    invoke-static {p1, p2, p3, v0, v1}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p3

    iput p3, p0, Ljn$b;->i:F

    const-string p3, "trimPathStart"

    const/4 v0, 0x5

    iget v1, p0, Ljn$b;->g:F

    invoke-static {p1, p2, p3, v0, v1}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p3

    iput p3, p0, Ljn$b;->g:F

    const-string p3, "fillType"

    const/16 v0, 0xd

    iget v1, p0, Ljn$b;->e:I

    invoke-static {p1, p2, p3, v0, v1}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p1

    iput p1, p0, Ljn$b;->e:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public final a([I)Z
    .locals 2

    iget-object v0, p0, Ljn$b;->c:Ley;

    invoke-virtual {v0, p1}, Ley;->a([I)Z

    move-result v0

    iget-object v1, p0, Ljn$b;->a:Ley;

    invoke-virtual {v1, p1}, Ley;->a([I)Z

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Ljn$b;->c:Ley;

    invoke-virtual {v0}, Ley;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ljn$b;->a:Ley;

    invoke-virtual {v0}, Ley;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method final getFillAlpha()F
    .locals 1

    iget v0, p0, Ljn$b;->f:F

    return v0
.end method

.method final getFillColor()I
    .locals 1

    iget-object v0, p0, Ljn$b;->c:Ley;

    iget v0, v0, Ley;->b:I

    return v0
.end method

.method final getStrokeAlpha()F
    .locals 1

    iget v0, p0, Ljn$b;->d:F

    return v0
.end method

.method final getStrokeColor()I
    .locals 1

    iget-object v0, p0, Ljn$b;->a:Ley;

    iget v0, v0, Ley;->b:I

    return v0
.end method

.method final getStrokeWidth()F
    .locals 1

    iget v0, p0, Ljn$b;->b:F

    return v0
.end method

.method final getTrimPathEnd()F
    .locals 1

    iget v0, p0, Ljn$b;->h:F

    return v0
.end method

.method final getTrimPathOffset()F
    .locals 1

    iget v0, p0, Ljn$b;->i:F

    return v0
.end method

.method final getTrimPathStart()F
    .locals 1

    iget v0, p0, Ljn$b;->g:F

    return v0
.end method

.method final setFillAlpha(F)V
    .locals 0

    iput p1, p0, Ljn$b;->f:F

    return-void
.end method

.method final setFillColor(I)V
    .locals 1

    iget-object v0, p0, Ljn$b;->c:Ley;

    iput p1, v0, Ley;->b:I

    return-void
.end method

.method final setStrokeAlpha(F)V
    .locals 0

    iput p1, p0, Ljn$b;->d:F

    return-void
.end method

.method final setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Ljn$b;->a:Ley;

    iput p1, v0, Ley;->b:I

    return-void
.end method

.method final setStrokeWidth(F)V
    .locals 0

    iput p1, p0, Ljn$b;->b:F

    return-void
.end method

.method final setTrimPathEnd(F)V
    .locals 0

    iput p1, p0, Ljn$b;->h:F

    return-void
.end method

.method final setTrimPathOffset(F)V
    .locals 0

    iput p1, p0, Ljn$b;->i:F

    return-void
.end method

.method final setTrimPathStart(F)V
    .locals 0

    iput p1, p0, Ljn$b;->g:F

    return-void
.end method
