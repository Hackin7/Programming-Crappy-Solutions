.class public final Ley;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/graphics/Shader;

.field public b:I

.field private final c:Landroid/content/res/ColorStateList;


# direct methods
.method private constructor <init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ley;->a:Landroid/graphics/Shader;

    iput-object p2, p0, Ley;->c:Landroid/content/res/ColorStateList;

    iput p3, p0, Ley;->b:I

    return-void
.end method

.method static a(I)Ley;
    .locals 2

    new-instance v0, Ley;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, p0}, Ley;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v0
.end method

.method public static a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ley;
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    :try_start_0
    invoke-virtual/range {p0 .. p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v4

    invoke-static {v4}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v5

    :cond_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x2

    if-eq v6, v8, :cond_1

    if-ne v6, v7, :cond_0

    :cond_1
    if-eq v6, v8, :cond_2

    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v2, "No start tag found"

    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    const/4 v8, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v9

    const v10, 0x557f730

    const/4 v11, 0x0

    if-eq v9, v10, :cond_4

    const v7, 0x4705f3df

    if-eq v9, v7, :cond_3

    goto :goto_0

    :cond_3
    const-string v7, "selector"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v11

    goto :goto_1

    :cond_4
    const-string v9, "gradient"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_1

    :cond_5
    :goto_0
    move v7, v8

    :goto_1
    packed-switch v7, :pswitch_data_0

    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    goto/16 :goto_5

    :pswitch_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "gradient"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": invalid gradient color tag "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    sget-object v6, Lep$c;->GradientColor:[I

    invoke-static {v1, v2, v5, v6}, Lfd;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    const-string v7, "startX"

    sget v8, Lep$c;->GradientColor_android_startX:I

    const/4 v9, 0x0

    invoke-static {v6, v4, v7, v8, v9}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v13

    const-string v7, "startY"

    sget v8, Lep$c;->GradientColor_android_startY:I

    invoke-static {v6, v4, v7, v8, v9}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v14

    const-string v7, "endX"

    sget v8, Lep$c;->GradientColor_android_endX:I

    invoke-static {v6, v4, v7, v8, v9}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v15

    const-string v7, "endY"

    sget v8, Lep$c;->GradientColor_android_endY:I

    invoke-static {v6, v4, v7, v8, v9}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v16

    const-string v7, "centerX"

    sget v8, Lep$c;->GradientColor_android_centerX:I

    invoke-static {v6, v4, v7, v8, v9}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v7

    const-string v8, "centerY"

    sget v10, Lep$c;->GradientColor_android_centerY:I

    invoke-static {v6, v4, v8, v10, v9}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v8

    const-string v10, "type"

    sget v12, Lep$c;->GradientColor_android_type:I

    invoke-static {v6, v4, v10, v12, v11}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v10

    const-string v12, "startColor"

    sget v3, Lep$c;->GradientColor_android_startColor:I

    invoke-static {v6, v4, v12, v3}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v3

    const-string v12, "centerColor"

    invoke-static {v4, v12}, Lfd;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v12

    const-string v9, "centerColor"

    sget v11, Lep$c;->GradientColor_android_centerColor:I

    invoke-static {v6, v4, v9, v11}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v9

    const-string v11, "endColor"

    move/from16 v24, v15

    sget v15, Lep$c;->GradientColor_android_endColor:I

    invoke-static {v6, v4, v11, v15}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v11

    const-string v15, "tileMode"

    move/from16 v25, v14

    sget v14, Lep$c;->GradientColor_android_tileMode:I

    move/from16 v26, v13

    const/4 v13, 0x0

    invoke-static {v6, v4, v15, v14, v13}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v14

    const-string v13, "gradientRadius"

    sget v15, Lep$c;->GradientColor_android_gradientRadius:I

    move/from16 v27, v14

    const/4 v14, 0x0

    invoke-static {v6, v4, v13, v15, v14}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v20

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {v1, v4, v5, v2}, Lfa;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lfa$a;

    move-result-object v1

    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    if-eqz v12, :cond_8

    new-instance v1, Lfa$a;

    invoke-direct {v1, v3, v9, v11}, Lfa$a;-><init>(III)V

    goto :goto_2

    :cond_8
    new-instance v1, Lfa$a;

    invoke-direct {v1, v3, v11}, Lfa$a;-><init>(II)V

    :goto_2
    packed-switch v10, :pswitch_data_1

    move/from16 v4, v27

    new-instance v2, Landroid/graphics/LinearGradient;

    goto :goto_3

    :pswitch_1
    new-instance v2, Landroid/graphics/SweepGradient;

    iget-object v3, v1, Lfa$a;->a:[I

    iget-object v1, v1, Lfa$a;->b:[F

    invoke-direct {v2, v7, v8, v3, v1}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    goto :goto_4

    :pswitch_2
    const/4 v2, 0x0

    cmpg-float v2, v20, v2

    if-gtz v2, :cond_9

    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v2, "<gradient> tag requires \'gradientRadius\' attribute with radial type"

    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v2, Landroid/graphics/RadialGradient;

    iget-object v3, v1, Lfa$a;->a:[I

    iget-object v1, v1, Lfa$a;->b:[F

    move/from16 v4, v27

    invoke-static {v4}, Lfa;->a(I)Landroid/graphics/Shader$TileMode;

    move-result-object v23

    move-object/from16 v17, v2

    move/from16 v18, v7

    move/from16 v19, v8

    move-object/from16 v21, v3

    move-object/from16 v22, v1

    invoke-direct/range {v17 .. v23}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    goto :goto_4

    :goto_3
    iget-object v3, v1, Lfa$a;->a:[I

    iget-object v1, v1, Lfa$a;->b:[F

    invoke-static {v4}, Lfa;->a(I)Landroid/graphics/Shader$TileMode;

    move-result-object v19

    move-object v12, v2

    move/from16 v13, v26

    move/from16 v14, v25

    move/from16 v15, v24

    move-object/from16 v17, v3

    move-object/from16 v18, v1

    invoke-direct/range {v12 .. v19}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    :goto_4
    new-instance v1, Ley;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3}, Ley;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v1

    :pswitch_3
    invoke-static {v1, v4, v5, v2}, Lex;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v1

    new-instance v2, Ley;

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v2, v4, v1, v3}, Ley;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v2

    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": unsupported complex color tag "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    move-object v1, v0

    const-string v2, "ComplexColorCompat"

    const-string v3, "Failed to inflate ComplexColor."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v1, 0x0

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Ley;->a:Landroid/graphics/Shader;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a([I)Z
    .locals 2

    invoke-virtual {p0}, Ley;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ley;->c:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Ley;->c:Landroid/content/res/ColorStateList;

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    iget v0, p0, Ley;->b:I

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    iput p1, p0, Ley;->b:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Ley;->a:Landroid/graphics/Shader;

    if-nez v0, :cond_0

    iget-object v0, p0, Ley;->c:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ley;->c:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 1

    invoke-virtual {p0}, Ley;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Ley;->b:I

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
