.class public final Ljj;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljj$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;I)Landroid/animation/Animator;
    .locals 10

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getAnimation(I)Landroid/content/res/XmlResourceParser;

    move-result-object v9
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v9}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v9

    invoke-static/range {v1 .. v8}, Ljj;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator;

    move-result-object p0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v9, :cond_0

    invoke-interface {v9}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    move-object v0, v9

    goto :goto_2

    :catch_0
    move-exception p0

    move-object v0, v9

    goto :goto_0

    :catch_1
    move-exception p0

    move-object v0, v9

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_2
    move-exception p0

    :goto_0
    :try_start_2
    new-instance p1, Landroid/content/res/Resources$NotFoundException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t load animation resource ID #0x"

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p1

    :catch_3
    move-exception p0

    :goto_1
    new-instance p1, Landroid/content/res/Resources$NotFoundException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Can\'t load animation resource ID #0x"

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_1
    throw p0
.end method

.method private static a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator;
    .locals 18

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p5

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v12

    const/4 v0, 0x0

    move-object v13, v0

    :cond_0
    :goto_0
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x3

    const/4 v14, 0x0

    if-ne v1, v2, :cond_1

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    if-le v2, v12, :cond_9

    :cond_1
    const/4 v2, 0x1

    if-eq v1, v2, :cond_9

    const/4 v3, 0x2

    if-ne v1, v3, :cond_8

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "objectAnimator"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v7, Landroid/animation/ObjectAnimator;

    invoke-direct {v7}, Landroid/animation/ObjectAnimator;-><init>()V

    move-object/from16 v0, p0

    move-object v1, v8

    move-object v2, v9

    move-object/from16 v3, p4

    move-object v4, v7

    move/from16 v5, p7

    move-object v6, v10

    invoke-static/range {v0 .. v6}, Ljj;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ValueAnimator;FLorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator;

    move-object/from16 v3, p0

    move-object v0, v7

    goto/16 :goto_1

    :cond_2
    const-string v3, "animator"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object v1, v8

    move-object v2, v9

    move-object/from16 v3, p4

    move/from16 v5, p7

    move-object v6, v10

    invoke-static/range {v0 .. v6}, Ljj;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ValueAnimator;FLorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator;

    move-result-object v0

    move-object/from16 v3, p0

    goto :goto_1

    :cond_3
    const-string v3, "set"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v15, Landroid/animation/AnimatorSet;

    invoke-direct {v15}, Landroid/animation/AnimatorSet;-><init>()V

    sget-object v0, Ljf;->h:[I

    move-object/from16 v7, p4

    invoke-static {v8, v9, v7, v0}, Lfd;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    const-string v0, "ordering"

    invoke-static {v6, v10, v0, v14, v14}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v16

    move-object v5, v15

    check-cast v5, Landroid/animation/AnimatorSet;

    move-object/from16 v0, p0

    move-object v1, v8

    move-object v2, v9

    move-object v3, v10

    move-object v4, v7

    move-object v14, v6

    move/from16 v6, v16

    move/from16 v7, p7

    invoke-static/range {v0 .. v7}, Ljj;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator;

    invoke-virtual {v14}, Landroid/content/res/TypedArray;->recycle()V

    move-object/from16 v3, p0

    move-object v0, v15

    const/4 v14, 0x0

    goto :goto_1

    :cond_4
    const-string v3, "propertyValuesHolder"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static/range {p3 .. p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    move-object/from16 v3, p0

    invoke-static {v3, v8, v9, v10, v1}, Ljj;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)[Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    if-eqz v1, :cond_5

    if-eqz v0, :cond_5

    instance-of v4, v0, Landroid/animation/ValueAnimator;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Landroid/animation/ValueAnimator;

    invoke-virtual {v4, v1}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    :cond_5
    move v14, v2

    :goto_1
    if-eqz v11, :cond_0

    if-nez v14, :cond_0

    if-nez v13, :cond_6

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    :cond_6
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown animator name: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object/from16 v3, p0

    goto/16 :goto_0

    :cond_9
    if-eqz v11, :cond_c

    if-eqz v13, :cond_c

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Landroid/animation/Animator;

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/16 v17, 0x0

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    add-int/lit8 v4, v17, 0x1

    aput-object v3, v1, v17

    move/from16 v17, v4

    goto :goto_2

    :cond_a
    if-nez p6, :cond_b

    invoke-virtual {v11, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-object v0

    :cond_b
    invoke-virtual {v11, v1}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    :cond_c
    return-object v0
.end method

.method private static a(Landroid/animation/Keyframe;F)Landroid/animation/Keyframe;
    .locals 2

    invoke-virtual {p0}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Landroid/animation/Keyframe;->ofFloat(F)Landroid/animation/Keyframe;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;

    move-result-object p0

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_1

    invoke-static {p1}, Landroid/animation/Keyframe;->ofInt(F)Landroid/animation/Keyframe;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p1}, Landroid/animation/Keyframe;->ofObject(F)Landroid/animation/Keyframe;

    move-result-object p0

    return-object p0
.end method

.method private static a(Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;
    .locals 11

    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz v3, :cond_1

    iget v0, v0, Landroid/util/TypedValue;->type:I

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    if-eqz v4, :cond_2

    move v5, v1

    goto :goto_2

    :cond_2
    move v5, v2

    :goto_2
    if-eqz v5, :cond_3

    iget v4, v4, Landroid/util/TypedValue;->type:I

    goto :goto_3

    :cond_3
    move v4, v2

    :goto_3
    const/4 v6, 0x4

    const/4 v7, 0x3

    if-ne p1, v6, :cond_7

    if-eqz v3, :cond_4

    invoke-static {v0}, Ljj;->a(I)Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    if-eqz v5, :cond_6

    invoke-static {v4}, Ljj;->a(I)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    move p1, v7

    goto :goto_4

    :cond_6
    move p1, v2

    :cond_7
    :goto_4
    if-nez p1, :cond_8

    move v6, v1

    goto :goto_5

    :cond_8
    move v6, v2

    :goto_5
    const/4 v8, 0x0

    const/4 v9, 0x2

    if-ne p1, v9, :cond_e

    invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Lff;->b(Ljava/lang/String;)[Lff$b;

    move-result-object p2

    invoke-static {p0}, Lff;->b(Ljava/lang/String;)[Lff$b;

    move-result-object p3

    if-nez p2, :cond_9

    if-eqz p3, :cond_d

    :cond_9
    if-eqz p2, :cond_c

    new-instance v0, Ljj$a;

    invoke-direct {v0}, Ljj$a;-><init>()V

    if-eqz p3, :cond_b

    invoke-static {p2, p3}, Lff;->a([Lff$b;[Lff$b;)Z

    move-result v3

    if-nez v3, :cond_a

    new-instance p2, Landroid/view/InflateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, " Can\'t morph from "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_a
    new-array p0, v9, [Ljava/lang/Object;

    aput-object p2, p0, v2

    aput-object p3, p0, v1

    goto :goto_6

    :cond_b
    new-array p0, v1, [Ljava/lang/Object;

    aput-object p2, p0, v2

    :goto_6
    invoke-static {p4, v0, p0}, Landroid/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    return-object p0

    :cond_c
    if-eqz p3, :cond_d

    new-instance p0, Ljj$a;

    invoke-direct {p0}, Ljj$a;-><init>()V

    new-array p1, v1, [Ljava/lang/Object;

    aput-object p3, p1, v2

    invoke-static {p4, p0, p1}, Landroid/animation/PropertyValuesHolder;->ofObject(Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    :cond_d
    move-object p0, v8

    return-object p0

    :cond_e
    if-ne p1, v7, :cond_f

    invoke-static {}, Ljk;->a()Ljk;

    move-result-object p1

    goto :goto_7

    :cond_f
    move-object p1, v8

    :goto_7
    const/4 v7, 0x5

    const/4 v10, 0x0

    if-eqz v6, :cond_15

    if-eqz v3, :cond_13

    if-ne v0, v7, :cond_10

    invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    goto :goto_8

    :cond_10
    invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    :goto_8
    if-eqz v5, :cond_12

    if-ne v4, v7, :cond_11

    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    goto :goto_9

    :cond_11
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p0

    :goto_9
    new-array p3, v9, [F

    aput p2, p3, v2

    aput p0, p3, v1

    invoke-static {p4, p3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    goto/16 :goto_e

    :cond_12
    new-array p0, v1, [F

    aput p2, p0, v2

    invoke-static {p4, p0}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    goto/16 :goto_e

    :cond_13
    if-ne v4, v7, :cond_14

    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    goto :goto_a

    :cond_14
    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p0

    :goto_a
    new-array p2, v1, [F

    aput p0, p2, v2

    invoke-static {p4, p2}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    goto/16 :goto_e

    :cond_15
    if-eqz v3, :cond_1b

    if-ne v0, v7, :cond_16

    invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    goto :goto_b

    :cond_16
    invoke-static {v0}, Ljj;->a(I)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {p0, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    goto :goto_b

    :cond_17
    invoke-virtual {p0, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    :goto_b
    if-eqz v5, :cond_1a

    if-ne v4, v7, :cond_18

    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    float-to-int p0, p0

    goto :goto_c

    :cond_18
    invoke-static {v4}, Ljj;->a(I)Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p0

    goto :goto_c

    :cond_19
    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    :goto_c
    new-array p3, v9, [I

    aput p2, p3, v2

    aput p0, p3, v1

    invoke-static {p4, p3}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    goto :goto_e

    :cond_1a
    new-array p0, v1, [I

    aput p2, p0, v2

    invoke-static {p4, p0}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    goto :goto_e

    :cond_1b
    if-eqz v5, :cond_1e

    if-ne v4, v7, :cond_1c

    invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    float-to-int p0, p0

    goto :goto_d

    :cond_1c
    invoke-static {v4}, Ljj;->a(I)Z

    move-result p2

    if-eqz p2, :cond_1d

    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p0

    goto :goto_d

    :cond_1d
    invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    :goto_d
    new-array p2, v1, [I

    aput p0, p2, v2

    invoke-static {p4, p2}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v8

    :cond_1e
    :goto_e
    move-object p0, v8

    if-eqz p0, :cond_1f

    if-eqz p1, :cond_1f

    invoke-virtual {p0, p1}, Landroid/animation/PropertyValuesHolder;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    :cond_1f
    return-object p0
.end method

.method private static a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ValueAnimator;FLorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator;
    .locals 2

    sget-object v0, Ljf;->g:[I

    invoke-static {p1, p2, p3, v0}, Lfd;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget-object v1, Ljf;->k:[I

    invoke-static {p1, p2, p3, v1}, Lfd;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    if-nez p4, :cond_0

    new-instance p4, Landroid/animation/ValueAnimator;

    invoke-direct {p4}, Landroid/animation/ValueAnimator;-><init>()V

    :cond_0
    invoke-static {p4, v0, p1, p5, p6}, Ljj;->a(Landroid/animation/ValueAnimator;Landroid/content/res/TypedArray;Landroid/content/res/TypedArray;FLorg/xmlpull/v1/XmlPullParser;)V

    const-string p2, "interpolator"

    const/4 p3, 0x0

    invoke-static {v0, p6, p2, p3}, Lfd;->b(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result p2

    if-lez p2, :cond_1

    invoke-static {p0, p2}, Lji;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p0

    invoke-virtual {p4, p0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    :cond_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_2
    return-object p4
.end method

.method private static a(Landroid/animation/ValueAnimator;Landroid/content/res/TypedArray;Landroid/content/res/TypedArray;FLorg/xmlpull/v1/XmlPullParser;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    const-string v4, "duration"

    const/4 v5, 0x1

    const/16 v6, 0x12c

    invoke-static {v1, v3, v4, v5, v6}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v4

    int-to-long v6, v4

    const-string v4, "startOffset"

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static {v1, v3, v4, v8, v9}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v4

    int-to-long v10, v4

    const-string v4, "valueType"

    const/4 v12, 0x4

    const/4 v13, 0x7

    invoke-static {v1, v3, v4, v13, v12}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v4

    const-string v13, "valueFrom"

    invoke-static {v3, v13}, Lfd;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v13

    const/4 v14, 0x3

    if-eqz v13, :cond_8

    const-string v13, "valueTo"

    invoke-static {v3, v13}, Lfd;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/4 v13, 0x6

    const/4 v15, 0x5

    if-ne v4, v12, :cond_7

    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    if-eqz v4, :cond_0

    move/from16 v16, v5

    goto :goto_0

    :cond_0
    move/from16 v16, v9

    :goto_0
    if-eqz v16, :cond_1

    iget v4, v4, Landroid/util/TypedValue;->type:I

    goto :goto_1

    :cond_1
    move v4, v9

    :goto_1
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v8

    if-eqz v8, :cond_2

    move/from16 v17, v5

    goto :goto_2

    :cond_2
    move/from16 v17, v9

    :goto_2
    if-eqz v17, :cond_3

    iget v8, v8, Landroid/util/TypedValue;->type:I

    goto :goto_3

    :cond_3
    move v8, v9

    :goto_3
    if-eqz v16, :cond_4

    invoke-static {v4}, Ljj;->a(I)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    if-eqz v17, :cond_6

    invoke-static {v8}, Ljj;->a(I)Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_5
    move v4, v14

    goto :goto_4

    :cond_6
    move v4, v9

    :cond_7
    :goto_4
    const-string v8, ""

    invoke-static {v1, v4, v15, v13, v8}, Ljj;->a(Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;

    move-result-object v4

    if-eqz v4, :cond_8

    new-array v8, v5, [Landroid/animation/PropertyValuesHolder;

    aput-object v4, v8, v9

    invoke-virtual {v0, v8}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    :cond_8
    invoke-virtual {v0, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v10, v11}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    const-string v4, "repeatCount"

    invoke-static {v1, v3, v4, v14, v9}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-string v4, "repeatMode"

    invoke-static {v1, v3, v4, v12, v5}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    if-eqz v2, :cond_b

    check-cast v0, Landroid/animation/ObjectAnimator;

    const-string v1, "pathData"

    invoke-static {v2, v3, v1, v5}, Lfd;->c(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    const-string v4, "propertyXName"

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lfd;->c(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "propertyYName"

    invoke-static {v2, v3, v5, v14}, Lfd;->c(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    if-nez v4, :cond_9

    if-nez v3, :cond_9

    new-instance v0, Landroid/view/InflateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " propertyXName or propertyYName is needed for PathData"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-static {v1}, Lff;->a(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v2, v2, p3

    invoke-static {v1, v0, v2, v4, v3}, Ljj;->a(Landroid/graphics/Path;Landroid/animation/ObjectAnimator;FLjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_a
    const-string v1, "propertyName"

    invoke-static {v2, v3, v1, v9}, Lfd;->c(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setPropertyName(Ljava/lang/String;)V

    :cond_b
    return-void
.end method

.method private static a(Landroid/graphics/Path;Landroid/animation/ObjectAnimator;FLjava/lang/String;Ljava/lang/String;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    new-instance v4, Landroid/graphics/PathMeasure;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v8, v7

    :cond_0
    invoke-virtual {v4}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v9

    add-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4}, Landroid/graphics/PathMeasure;->nextContour()Z

    move-result v9

    if-nez v9, :cond_0

    new-instance v4, Landroid/graphics/PathMeasure;

    invoke-direct {v4, v0, v5}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    const/16 v0, 0x64

    div-float v9, v8, p2

    float-to-int v9, v9

    const/4 v10, 0x1

    add-int/2addr v9, v10

    invoke-static {v0, v9}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v9, v0, [F

    new-array v11, v0, [F

    const/4 v12, 0x2

    new-array v13, v12, [F

    add-int/lit8 v14, v0, -0x1

    int-to-float v14, v14

    div-float/2addr v8, v14

    move v15, v5

    move v14, v7

    move v7, v15

    :goto_0
    const/4 v12, 0x0

    if-ge v7, v0, :cond_2

    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v10, v16

    check-cast v10, Ljava/lang/Float;

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v10

    sub-float v10, v14, v10

    invoke-virtual {v4, v10, v13, v12}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z

    aget v10, v13, v5

    aput v10, v9, v7

    const/4 v10, 0x1

    aget v12, v13, v10

    aput v12, v11, v7

    add-float/2addr v14, v8

    add-int/lit8 v10, v15, 0x1

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v10, v12, :cond_1

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Float;

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v12

    cmpl-float v12, v14, v12

    if-lez v12, :cond_1

    invoke-virtual {v4}, Landroid/graphics/PathMeasure;->nextContour()Z

    move v15, v10

    :cond_1
    add-int/lit8 v7, v7, 0x1

    const/4 v10, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    invoke-static {v2, v9}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v12

    :goto_1
    if-eqz v3, :cond_4

    invoke-static {v3, v11}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v12

    :cond_4
    if-nez v0, :cond_5

    const/4 v2, 0x1

    new-array v0, v2, [Landroid/animation/PropertyValuesHolder;

    aput-object v12, v0, v5

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    return-void

    :cond_5
    const/4 v2, 0x1

    if-nez v12, :cond_6

    new-array v2, v2, [Landroid/animation/PropertyValuesHolder;

    aput-object v0, v2, v5

    invoke-virtual {v1, v2}, Landroid/animation/ObjectAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    return-void

    :cond_6
    const/4 v3, 0x2

    new-array v3, v3, [Landroid/animation/PropertyValuesHolder;

    aput-object v0, v3, v5

    aput-object v12, v3, v2

    invoke-virtual {v1, v3}, Landroid/animation/ObjectAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    return-void
.end method

.method private static a([Landroid/animation/Keyframe;FII)V
    .locals 2

    sub-int v0, p3, p2

    add-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    div-float/2addr p1, v0

    :goto_0
    if-gt p2, p3, :cond_0

    aget-object v0, p0, p2

    add-int/lit8 v1, p2, -0x1

    aget-object v1, p0, v1

    invoke-virtual {v1}, Landroid/animation/Keyframe;->getFraction()F

    move-result v1

    add-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/animation/Keyframe;->setFraction(F)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static a(I)Z
    .locals 1

    const/16 v0, 0x1c

    if-lt p0, v0, :cond_0

    const/16 v0, 0x1f

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)[Landroid/animation/PropertyValuesHolder;
    .locals 21

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v4, 0x0

    :goto_0
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    if-eq v5, v6, :cond_1f

    const/4 v8, 0x1

    if-eq v5, v8, :cond_1f

    const/4 v9, 0x2

    if-eq v5, v9, :cond_0

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    goto :goto_0

    :cond_0
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v10, "propertyValuesHolder"

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    sget-object v5, Ljf;->i:[I

    move-object/from16 v10, p4

    invoke-static {v0, v1, v10, v5}, Lfd;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    const-string v11, "propertyName"

    invoke-static {v5, v2, v11, v6}, Lfd;->c(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v11

    const-string v12, "valueType"

    const/4 v13, 0x4

    invoke-static {v5, v2, v12, v9, v13}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v9

    move v14, v9

    const/4 v12, 0x0

    :goto_1
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v15

    if-eq v15, v6, :cond_e

    if-eq v15, v8, :cond_e

    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v15

    const-string v8, "keyframe"

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    if-ne v14, v13, :cond_3

    invoke-static/range {p3 .. p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    sget-object v14, Ljf;->j:[I

    invoke-static {v0, v1, v8, v14}, Lfd;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v8

    const-string v14, "value"

    invoke-static {v8, v2, v14}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroid/util/TypedValue;

    move-result-object v14

    if-eqz v14, :cond_1

    const/4 v15, 0x1

    goto :goto_2

    :cond_1
    move v15, v7

    :goto_2
    if-eqz v15, :cond_2

    iget v14, v14, Landroid/util/TypedValue;->type:I

    invoke-static {v14}, Ljj;->a(I)Z

    move-result v14

    if-eqz v14, :cond_2

    move v14, v6

    goto :goto_3

    :cond_2
    move v14, v7

    :goto_3
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3
    invoke-static/range {p3 .. p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    sget-object v15, Ljf;->j:[I

    invoke-static {v0, v1, v8, v15}, Lfd;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v8

    const-string v15, "fraction"

    const/high16 v3, -0x40800000    # -1.0f

    invoke-static {v8, v2, v15, v6, v3}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v3

    const-string v15, "value"

    invoke-static {v8, v2, v15}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Landroid/util/TypedValue;

    move-result-object v15

    if-eqz v15, :cond_4

    const/16 v18, 0x1

    goto :goto_4

    :cond_4
    move/from16 v18, v7

    :goto_4
    if-ne v14, v13, :cond_6

    if-eqz v18, :cond_5

    iget v15, v15, Landroid/util/TypedValue;->type:I

    invoke-static {v15}, Ljj;->a(I)Z

    move-result v15

    if-eqz v15, :cond_5

    move v15, v6

    goto :goto_5

    :cond_5
    move v15, v7

    goto :goto_5

    :cond_6
    move v15, v14

    :goto_5
    if-eqz v18, :cond_8

    if-eq v15, v6, :cond_7

    packed-switch v15, :pswitch_data_0

    const/4 v3, 0x0

    goto :goto_6

    :pswitch_0
    const-string v15, "value"

    const/4 v13, 0x0

    invoke-static {v8, v2, v15, v7, v13}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v13

    invoke-static {v3, v13}, Landroid/animation/Keyframe;->ofFloat(FF)Landroid/animation/Keyframe;

    move-result-object v3

    goto :goto_6

    :cond_7
    :pswitch_1
    const-string v13, "value"

    invoke-static {v8, v2, v13, v7, v7}, Lfd;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v13

    invoke-static {v3, v13}, Landroid/animation/Keyframe;->ofInt(FI)Landroid/animation/Keyframe;

    move-result-object v3

    goto :goto_6

    :cond_8
    if-nez v15, :cond_9

    invoke-static {v3}, Landroid/animation/Keyframe;->ofFloat(F)Landroid/animation/Keyframe;

    move-result-object v3

    goto :goto_6

    :cond_9
    invoke-static {v3}, Landroid/animation/Keyframe;->ofInt(F)Landroid/animation/Keyframe;

    move-result-object v3

    :goto_6
    const-string v13, "interpolator"

    const/4 v15, 0x1

    invoke-static {v8, v2, v13, v15}, Lfd;->b(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v13

    if-lez v13, :cond_a

    move-object/from16 v15, p0

    invoke-static {v15, v13}, Lji;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v13

    invoke-virtual {v3, v13}, Landroid/animation/Keyframe;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    goto :goto_7

    :cond_a
    move-object/from16 v15, p0

    :goto_7
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v3, :cond_c

    if-nez v12, :cond_b

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_b
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    goto :goto_8

    :cond_d
    move-object/from16 v15, p0

    :goto_8
    const/4 v8, 0x1

    const/4 v13, 0x4

    goto/16 :goto_1

    :cond_e
    move-object/from16 v15, p0

    if-eqz v12, :cond_19

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_19

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/animation/Keyframe;

    add-int/lit8 v13, v3, -0x1

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/animation/Keyframe;

    invoke-virtual {v13}, Landroid/animation/Keyframe;->getFraction()F

    move-result v18

    const/high16 v6, 0x3f800000    # 1.0f

    cmpg-float v19, v18, v6

    if-gez v19, :cond_10

    const/16 v17, 0x0

    cmpg-float v18, v18, v17

    if-gez v18, :cond_f

    invoke-virtual {v13, v6}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_9

    :cond_f
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v13, v6}, Ljj;->a(Landroid/animation/Keyframe;F)Landroid/animation/Keyframe;

    move-result-object v13

    invoke-virtual {v12, v7, v13}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    :cond_10
    :goto_9
    invoke-virtual {v8}, Landroid/animation/Keyframe;->getFraction()F

    move-result v7

    const/4 v13, 0x0

    cmpl-float v17, v7, v13

    if-eqz v17, :cond_12

    cmpg-float v7, v7, v13

    if-gez v7, :cond_11

    invoke-virtual {v8, v13}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_a

    :cond_11
    invoke-static {v8, v13}, Ljj;->a(Landroid/animation/Keyframe;F)Landroid/animation/Keyframe;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v12, v8, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    :cond_12
    :goto_a
    new-array v7, v3, [Landroid/animation/Keyframe;

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    const/4 v8, 0x0

    :goto_b
    if-ge v8, v3, :cond_18

    aget-object v12, v7, v8

    invoke-virtual {v12}, Landroid/animation/Keyframe;->getFraction()F

    move-result v13

    const/4 v6, 0x0

    cmpg-float v13, v13, v6

    if-gez v13, :cond_17

    if-nez v8, :cond_13

    invoke-virtual {v12, v6}, Landroid/animation/Keyframe;->setFraction(F)V

    goto :goto_d

    :cond_13
    add-int/lit8 v6, v3, -0x1

    if-ne v8, v6, :cond_14

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-virtual {v12, v13}, Landroid/animation/Keyframe;->setFraction(F)V

    const/16 v17, 0x0

    goto :goto_e

    :cond_14
    const/high16 v13, 0x3f800000    # 1.0f

    add-int/lit8 v12, v8, 0x1

    move v13, v8

    :goto_c
    if-ge v12, v6, :cond_15

    aget-object v0, v7, v12

    invoke-virtual {v0}, Landroid/animation/Keyframe;->getFraction()F

    move-result v0

    const/16 v17, 0x0

    cmpl-float v0, v0, v17

    if-gez v0, :cond_16

    add-int/lit8 v0, v12, 0x1

    move v13, v12

    move v12, v0

    move-object/from16 v0, p1

    goto :goto_c

    :cond_15
    const/16 v17, 0x0

    :cond_16
    add-int/lit8 v0, v13, 0x1

    aget-object v0, v7, v0

    invoke-virtual {v0}, Landroid/animation/Keyframe;->getFraction()F

    move-result v0

    add-int/lit8 v6, v8, -0x1

    aget-object v6, v7, v6

    invoke-virtual {v6}, Landroid/animation/Keyframe;->getFraction()F

    move-result v6

    sub-float/2addr v0, v6

    invoke-static {v7, v0, v8, v13}, Ljj;->a([Landroid/animation/Keyframe;FII)V

    goto :goto_e

    :cond_17
    :goto_d
    move/from16 v17, v6

    :goto_e
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p1

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_b

    :cond_18
    invoke-static {v11, v7}, Landroid/animation/PropertyValuesHolder;->ofKeyframe(Ljava/lang/String;[Landroid/animation/Keyframe;)Landroid/animation/PropertyValuesHolder;

    move-result-object v3

    const/4 v0, 0x3

    if-ne v14, v0, :cond_1a

    invoke-static {}, Ljk;->a()Ljk;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/animation/PropertyValuesHolder;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    goto :goto_f

    :cond_19
    const/4 v3, 0x0

    :cond_1a
    :goto_f
    if-nez v3, :cond_1b

    const/4 v0, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v9, v8, v0, v11}, Ljj;->a(Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;

    move-result-object v3

    :cond_1b
    if-eqz v3, :cond_1d

    if-nez v4, :cond_1c

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_1c
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1d
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_10

    :cond_1e
    move-object/from16 v15, p0

    move-object/from16 v10, p4

    :goto_10
    invoke-interface/range {p3 .. p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-object/from16 v0, p1

    goto/16 :goto_0

    :cond_1f
    move v8, v7

    if-eqz v4, :cond_21

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v3, v0, [Landroid/animation/PropertyValuesHolder;

    :goto_11
    if-ge v8, v0, :cond_20

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/PropertyValuesHolder;

    aput-object v1, v3, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_11

    :cond_20
    move-object/from16 v16, v3

    return-object v16

    :cond_21
    const/16 v16, 0x0

    return-object v16

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
