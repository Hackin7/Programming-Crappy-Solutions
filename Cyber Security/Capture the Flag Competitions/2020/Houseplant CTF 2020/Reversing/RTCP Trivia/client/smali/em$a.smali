.class public final Lem$a;
.super Landroidx/constraintlayout/widget/ConstraintLayout$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public an:F

.field public ao:Z

.field public ap:F

.field public aq:F

.field public ar:F

.field public as:F

.field public at:F

.field public au:F

.field public av:F

.field public aw:F

.field public ax:F

.field public ay:F

.field public az:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lem$a;->an:F

    const/4 v1, 0x0

    iput-boolean v1, p0, Lem$a;->ao:Z

    const/4 v1, 0x0

    iput v1, p0, Lem$a;->ap:F

    iput v1, p0, Lem$a;->aq:F

    iput v1, p0, Lem$a;->ar:F

    iput v1, p0, Lem$a;->as:F

    iput v0, p0, Lem$a;->at:F

    iput v0, p0, Lem$a;->au:F

    iput v1, p0, Lem$a;->av:F

    iput v1, p0, Lem$a;->aw:F

    iput v1, p0, Lem$a;->ax:F

    iput v1, p0, Lem$a;->ay:F

    iput v1, p0, Lem$a;->az:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lem$a;->an:F

    const/4 v1, 0x0

    iput-boolean v1, p0, Lem$a;->ao:Z

    const/4 v2, 0x0

    iput v2, p0, Lem$a;->ap:F

    iput v2, p0, Lem$a;->aq:F

    iput v2, p0, Lem$a;->ar:F

    iput v2, p0, Lem$a;->as:F

    iput v0, p0, Lem$a;->at:F

    iput v0, p0, Lem$a;->au:F

    iput v2, p0, Lem$a;->av:F

    iput v2, p0, Lem$a;->aw:F

    iput v2, p0, Lem$a;->ax:F

    iput v2, p0, Lem$a;->ay:F

    iput v2, p0, Lem$a;->az:F

    sget-object v0, La$b;->ConstraintSet:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    :goto_0
    if-ge v1, p2, :cond_c

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v0

    sget v2, La$b;->ConstraintSet_android_alpha:I

    if-ne v0, v2, :cond_0

    iget v2, p0, Lem$a;->an:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->an:F

    goto/16 :goto_2

    :cond_0
    sget v2, La$b;->ConstraintSet_android_elevation:I

    if-ne v0, v2, :cond_1

    iget v2, p0, Lem$a;->ap:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->ap:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lem$a;->ao:Z

    goto/16 :goto_2

    :cond_1
    sget v2, La$b;->ConstraintSet_android_rotationX:I

    if-ne v0, v2, :cond_2

    iget v2, p0, Lem$a;->ar:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->ar:F

    goto/16 :goto_2

    :cond_2
    sget v2, La$b;->ConstraintSet_android_rotationY:I

    if-ne v0, v2, :cond_3

    iget v2, p0, Lem$a;->as:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->as:F

    goto :goto_2

    :cond_3
    sget v2, La$b;->ConstraintSet_android_rotation:I

    if-ne v0, v2, :cond_4

    iget v2, p0, Lem$a;->aq:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->aq:F

    goto :goto_2

    :cond_4
    sget v2, La$b;->ConstraintSet_android_scaleX:I

    if-ne v0, v2, :cond_5

    iget v2, p0, Lem$a;->at:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->at:F

    goto :goto_2

    :cond_5
    sget v2, La$b;->ConstraintSet_android_scaleY:I

    if-ne v0, v2, :cond_6

    iget v2, p0, Lem$a;->au:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->au:F

    goto :goto_2

    :cond_6
    sget v2, La$b;->ConstraintSet_android_transformPivotX:I

    if-ne v0, v2, :cond_7

    iget v2, p0, Lem$a;->av:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->av:F

    goto :goto_2

    :cond_7
    sget v2, La$b;->ConstraintSet_android_transformPivotY:I

    if-ne v0, v2, :cond_8

    iget v2, p0, Lem$a;->aw:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->aw:F

    goto :goto_2

    :cond_8
    sget v2, La$b;->ConstraintSet_android_translationX:I

    if-ne v0, v2, :cond_9

    iget v2, p0, Lem$a;->ax:F

    :goto_1
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->ax:F

    goto :goto_2

    :cond_9
    sget v2, La$b;->ConstraintSet_android_translationY:I

    if-ne v0, v2, :cond_a

    iget v2, p0, Lem$a;->ay:F

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lem$a;->ay:F

    goto :goto_2

    :cond_a
    sget v2, La$b;->ConstraintSet_android_translationZ:I

    if-ne v0, v2, :cond_b

    iget v2, p0, Lem$a;->az:F

    goto :goto_1

    :cond_b
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_c
    return-void
.end method
