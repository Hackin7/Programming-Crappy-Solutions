.class public final Lgk;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/view/View;

.field public b:Z

.field private c:Landroid/view/ViewParent;

.field private d:Landroid/view/ViewParent;

.field private e:[I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgk;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(ILandroid/view/ViewParent;)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iput-object p2, p0, Lgk;->d:Landroid/view/ViewParent;

    return-void

    :pswitch_1
    iput-object p2, p0, Lgk;->c:Landroid/view/ViewParent;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lgk;->b(I)Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final a(II)Z
    .locals 5

    invoke-virtual {p0, p2}, Lgk;->a(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lgk;->b:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lgk;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v2, p0, Lgk;->a:Landroid/view/View;

    :goto_0
    if-eqz v0, :cond_6

    iget-object v3, p0, Lgk;->a:Landroid/view/View;

    invoke-static {v0, v2, v3, p1, p2}, Lgs;->a(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;II)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p2, v0}, Lgk;->a(ILandroid/view/ViewParent;)V

    iget-object v3, p0, Lgk;->a:Landroid/view/View;

    instance-of v4, v0, Lgm;

    if-eqz v4, :cond_1

    check-cast v0, Lgm;

    invoke-interface {v0, p1, p2}, Lgm;->a(II)V

    return v1

    :cond_1
    if-nez p2, :cond_3

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt p2, v4, :cond_2

    :try_start_0
    invoke-interface {v0, v2, v3, p1}, Landroid/view/ViewParent;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    const-string p2, "ViewParentCompat"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ViewParent "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not implement interface method onNestedScrollAccepted"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v1

    :cond_2
    instance-of p2, v0, Lgl;

    if-eqz p2, :cond_3

    check-cast v0, Lgl;

    invoke-interface {v0, v2, v3, p1}, Lgl;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    :cond_3
    return v1

    :cond_4
    instance-of v3, v0, Landroid/view/View;

    if-eqz v3, :cond_5

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    :cond_5
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_6
    const/4 p1, 0x0

    return p1
.end method

.method public final a(IIII[II)Z
    .locals 15

    move-object v1, p0

    move/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v2, p6

    iget-boolean v3, v1, Lgk;->b:Z

    const/4 v9, 0x0

    if-eqz v3, :cond_8

    invoke-virtual {v1, v2}, Lgk;->b(I)Landroid/view/ViewParent;

    move-result-object v10

    if-nez v10, :cond_0

    return v9

    :cond_0
    const/4 v11, 0x1

    if-nez p1, :cond_2

    if-nez p2, :cond_2

    if-nez p3, :cond_2

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v8, :cond_8

    aput v9, v8, v9

    aput v9, v8, v11

    return v9

    :cond_2
    :goto_0
    if-eqz v8, :cond_3

    iget-object v3, v1, Lgk;->a:Landroid/view/View;

    invoke-virtual {v3, v8}, Landroid/view/View;->getLocationInWindow([I)V

    aget v3, v8, v9

    aget v12, v8, v11

    move v13, v12

    move v12, v3

    goto :goto_1

    :cond_3
    move v12, v9

    move v13, v12

    :goto_1
    iget-object v3, v1, Lgk;->a:Landroid/view/View;

    instance-of v14, v10, Lgm;

    if-eqz v14, :cond_4

    check-cast v10, Lgm;

    invoke-interface {v10, v7, v2}, Lgm;->b(II)V

    goto :goto_2

    :cond_4
    if-nez v2, :cond_6

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x15

    if-lt v2, v14, :cond_5

    move-object v2, v10

    move/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    :try_start_0
    invoke-interface/range {v2 .. v7}, Landroid/view/ViewParent;->onNestedScroll(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v2, "ViewParentCompat"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ViewParent "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " does not implement interface method onNestedScroll"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :cond_5
    instance-of v2, v10, Lgl;

    if-eqz v2, :cond_6

    move-object v2, v10

    check-cast v2, Lgl;

    move/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    invoke-interface/range {v2 .. v7}, Lgl;->onNestedScroll(Landroid/view/View;IIII)V

    :cond_6
    :goto_2
    if-eqz v8, :cond_7

    iget-object v2, v1, Lgk;->a:Landroid/view/View;

    invoke-virtual {v2, v8}, Landroid/view/View;->getLocationInWindow([I)V

    aget v2, v8, v9

    sub-int/2addr v2, v12

    aput v2, v8, v9

    aget v2, v8, v11

    sub-int/2addr v2, v13

    aput v2, v8, v11

    :cond_7
    return v11

    :cond_8
    return v9
.end method

.method public final a(II[I[II)Z
    .locals 7

    iget-boolean v0, p0, Lgk;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    invoke-virtual {p0, p5}, Lgk;->b(I)Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p4, :cond_c

    aput v1, p4, v1

    aput v1, p4, v2

    return v1

    :cond_2
    :goto_0
    if-eqz p4, :cond_3

    iget-object v3, p0, Lgk;->a:Landroid/view/View;

    invoke-virtual {v3, p4}, Landroid/view/View;->getLocationInWindow([I)V

    aget v3, p4, v1

    aget v4, p4, v2

    goto :goto_1

    :cond_3
    move v3, v1

    move v4, v3

    :goto_1
    if-nez p3, :cond_5

    iget-object p3, p0, Lgk;->e:[I

    if-nez p3, :cond_4

    const/4 p3, 0x2

    new-array p3, p3, [I

    iput-object p3, p0, Lgk;->e:[I

    :cond_4
    iget-object p3, p0, Lgk;->e:[I

    :cond_5
    aput v1, p3, v1

    aput v1, p3, v2

    iget-object v5, p0, Lgk;->a:Landroid/view/View;

    instance-of v6, v0, Lgm;

    if-eqz v6, :cond_6

    check-cast v0, Lgm;

    invoke-interface {v0, p1, p2, p3, p5}, Lgm;->a(II[II)V

    goto :goto_2

    :cond_6
    if-nez p5, :cond_8

    sget p5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x15

    if-lt p5, v6, :cond_7

    :try_start_0
    invoke-interface {v0, v5, p1, p2, p3}, Landroid/view/ViewParent;->onNestedPreScroll(Landroid/view/View;II[I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string p2, "ViewParentCompat"

    new-instance p5, Ljava/lang/StringBuilder;

    const-string v5, "ViewParent "

    invoke-direct {p5, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " does not implement interface method onNestedPreScroll"

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p2, p5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    :cond_7
    instance-of p5, v0, Lgl;

    if-eqz p5, :cond_8

    check-cast v0, Lgl;

    invoke-interface {v0, v5, p1, p2, p3}, Lgl;->onNestedPreScroll(Landroid/view/View;II[I)V

    :cond_8
    :goto_2
    if-eqz p4, :cond_9

    iget-object p1, p0, Lgk;->a:Landroid/view/View;

    invoke-virtual {p1, p4}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, p4, v1

    sub-int/2addr p1, v3

    aput p1, p4, v1

    aget p1, p4, v2

    sub-int/2addr p1, v4

    aput p1, p4, v2

    :cond_9
    aget p1, p3, v1

    if-nez p1, :cond_b

    aget p1, p3, v2

    if-eqz p1, :cond_a

    return v2

    :cond_a
    return v1

    :cond_b
    return v2

    :cond_c
    return v1
.end method

.method public final b(I)Landroid/view/ViewParent;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    iget-object p1, p0, Lgk;->d:Landroid/view/ViewParent;

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lgk;->c:Landroid/view/ViewParent;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
