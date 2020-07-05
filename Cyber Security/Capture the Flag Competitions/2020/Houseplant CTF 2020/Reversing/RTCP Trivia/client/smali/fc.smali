.class public final Lfc;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfc$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/util/TypedValue;IILfc$a;)Landroid/graphics/Typeface;
    .locals 9

    iget-object v0, p2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-nez v0, :cond_0

    new-instance p0, Landroid/content/res/Resources$NotFoundException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "Resource \""

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" ("

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") is not a Font: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    iget-object p2, p2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "res/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, -0x3

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p5, v1, v2}, Lfc$a;->a(ILandroid/os/Handler;)V

    return-object v2

    :cond_1
    invoke-static {p1, p3, p4}, Lfg;->a(Landroid/content/res/Resources;II)Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p5, v0, v2}, Lfc$a;->a(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    return-object v0

    :cond_2
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v3, ".xml"

    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v0

    invoke-static {v0, p1}, Lez;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;)Lez$a;

    move-result-object v4

    if-nez v4, :cond_3

    const-string p0, "ResourcesCompat"

    const-string p1, "Failed to find font-family tag"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p5, v1, v2}, Lfc$a;->a(ILandroid/os/Handler;)V

    return-object v2

    :cond_3
    move-object v3, p0

    move-object v5, p1

    move v6, p3

    move v7, p4

    move-object v8, p5

    invoke-static/range {v3 .. v8}, Lfg;->a(Landroid/content/Context;Lez$a;Landroid/content/res/Resources;IILfc$a;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p0, p1, p3, p2, p4}, Lfg;->a(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p5, p0, v2}, Lfc$a;->a(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    return-object p0

    :cond_5
    invoke-virtual {p5, v1, v2}, Lfc$a;->a(ILandroid/os/Handler;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "ResourcesCompat"

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed to read xml resource "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception p0

    const-string p1, "ResourcesCompat"

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed to parse xml resource "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {p5, v1, v2}, Lfc$a;->a(ILandroid/os/Handler;)V

    return-object v2
.end method
