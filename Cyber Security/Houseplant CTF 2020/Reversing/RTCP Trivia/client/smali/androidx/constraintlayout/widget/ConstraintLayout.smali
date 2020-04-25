.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/ConstraintLayout$a;
    }
.end annotation


# instance fields
.field a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field b:Ldz;

.field public c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field d:I

.field e:I

.field f:I

.field g:I

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lek;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ldy;",
            ">;"
        }
    .end annotation
.end field

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Z

.field private o:I

.field private p:Lel;

.field private q:I

.field private r:I

.field private s:I

.field private t:Ldr;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x64

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Ljava/util/ArrayList;

    new-instance p1, Ldz;

    invoke-direct {p1}, Ldz;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Z

    const/4 v0, 0x3

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    const/4 v1, -0x1

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/HashMap;

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:I

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-direct {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x64

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Ljava/util/ArrayList;

    new-instance p1, Ldz;

    invoke-direct {p1}, Ldz;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Z

    const/4 v0, 0x3

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/HashMap;

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-direct {p0, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    new-instance p1, Ljava/util/ArrayList;

    const/4 p3, 0x4

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p3, 0x64

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Ljava/util/ArrayList;

    new-instance p1, Ldz;

    invoke-direct {p1}, Ldz;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    const p3, 0x7fffffff

    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    const/4 p3, 0x1

    iput-boolean p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Z

    const/4 p3, 0x3

    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    const/4 p3, 0x0

    iput-object p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    const/4 p3, -0x1

    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/HashMap;

    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:I

    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-direct {p0, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static a()Landroidx/constraintlayout/widget/ConstraintLayout$a;
    .locals 1

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>()V

    return-object v0
.end method

.method private final a(I)Ldy;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-ne p1, p0, :cond_1

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    return-object p1

    :cond_1
    if-nez p1, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    return-object p1
.end method

.method private a(Landroid/util/AttributeSet;)V
    .locals 13

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iput-object p0, v0, Ldy;->X:Ljava/lang/Object;

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, La$b;->ConstraintLayout_Layout:[I

    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_a

    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v4

    sget v5, La$b;->ConstraintLayout_Layout_android_minWidth:I

    if-ne v4, v5, :cond_0

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    goto/16 :goto_4

    :cond_0
    sget v5, La$b;->ConstraintLayout_Layout_android_minHeight:I

    if-ne v4, v5, :cond_1

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    goto/16 :goto_4

    :cond_1
    sget v5, La$b;->ConstraintLayout_Layout_android_maxWidth:I

    if-ne v4, v5, :cond_2

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    goto/16 :goto_4

    :cond_2
    sget v5, La$b;->ConstraintLayout_Layout_android_maxHeight:I

    if-ne v4, v5, :cond_3

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    goto/16 :goto_4

    :cond_3
    sget v5, La$b;->ConstraintLayout_Layout_layout_optimizationLevel:I

    if-ne v4, v5, :cond_4

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    goto/16 :goto_4

    :cond_4
    sget v5, La$b;->ConstraintLayout_Layout_constraintSet:I

    if-ne v4, v5, :cond_9

    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    :try_start_0
    new-instance v5, Lel;

    invoke-direct {v5}, Lel;-><init>()V

    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    iget-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v4}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v7
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v8

    :goto_1
    const/4 v9, 0x1

    if-eq v8, v9, :cond_8

    if-eqz v8, :cond_7

    const/4 v10, 0x2

    if-eq v8, v10, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v10

    new-instance v11, Lel$a;

    invoke-direct {v11, v2}, Lel$a;-><init>(B)V

    sget-object v12, La$b;->ConstraintSet:[I

    invoke-virtual {v6, v10, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v10

    invoke-static {v11, v10}, Lel;->a(Lel$a;Landroid/content/res/TypedArray;)V

    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    const-string v10, "Guideline"

    invoke-virtual {v8, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    iput-boolean v9, v11, Lel$a;->a:Z

    :cond_6
    iget-object v8, v5, Lel;->a:Ljava/util/HashMap;

    iget v9, v11, Lel$a;->d:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :goto_2
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v8
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    :catch_0
    move-exception v5

    :try_start_2
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    :catch_1
    move-exception v5

    invoke-virtual {v5}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V
    :try_end_2
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    :cond_8
    :goto_3
    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    :cond_9
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_b
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    iput v0, p1, Ldz;->at:I

    return-void
.end method

.method private a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_2

    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/HashMap;

    :cond_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_1
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method private b()V
    .locals 5

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v0}, Ldz;->A()V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    iget-wide v1, v0, Ldr;->c:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Ldr;->c:J

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Ldy;
    .locals 0

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    return-object p1
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0xe

    if-ge p2, p3, :cond_0

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    return p1
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 18

    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildCount()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_1

    move-object/from16 v5, p0

    invoke-virtual {v5, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_0

    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_0

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_0

    check-cast v6, Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x4

    if-ne v7, v8, :cond_0

    aget-object v7, v6, v3

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    aget-object v8, v6, v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x2

    aget-object v9, v6, v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x3

    aget-object v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    int-to-float v7, v7

    const/high16 v10, 0x44870000    # 1080.0f

    div-float/2addr v7, v10

    mul-float/2addr v7, v1

    float-to-int v7, v7

    int-to-float v8, v8

    const/high16 v11, 0x44f00000    # 1920.0f

    div-float/2addr v8, v11

    mul-float/2addr v8, v2

    float-to-int v8, v8

    int-to-float v9, v9

    div-float/2addr v9, v10

    mul-float/2addr v9, v1

    float-to-int v9, v9

    int-to-float v6, v6

    div-float/2addr v6, v11

    mul-float/2addr v6, v2

    float-to-int v6, v6

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v10, -0x10000

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v14, v7

    int-to-float v13, v8

    add-int/2addr v7, v9

    int-to-float v7, v7

    move-object/from16 v10, p1

    move v11, v14

    move v12, v13

    move v9, v13

    move v13, v7

    move/from16 v16, v14

    move v14, v9

    move-object/from16 v17, v15

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v8, v6

    int-to-float v6, v8

    move v11, v7

    move v12, v9

    move v14, v6

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move/from16 v13, v16

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v11, v16

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const v8, -0xff0100

    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setColor(I)V

    move v12, v9

    move v13, v7

    move v14, v6

    move-object v8, v15

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_1
    move-object/from16 v5, p0

    return-void
.end method

.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>()V

    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iget v0, v0, Ldz;->at:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    move p4, p3

    :goto_0
    if-ge p4, p1, :cond_2

    invoke-virtual {p0, p4}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-nez v2, :cond_0

    if-eqz p2, :cond_1

    :cond_0
    iget-boolean v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->aa:Z

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ldy;->n()I

    move-result v0

    invoke-virtual {v1}, Ldy;->o()I

    move-result v2

    invoke-virtual {v1}, Ldy;->l()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, Ldy;->m()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    instance-of v4, p5, Leo;

    if-eqz v4, :cond_1

    check-cast p5, Leo;

    invoke-virtual {p5}, Leo;->getContent()Landroid/view/View;

    move-result-object p5

    if-eqz p5, :cond_1

    invoke-virtual {p5, p3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :cond_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_3

    :goto_1
    if-ge p3, p1, :cond_3

    iget-object p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method protected onMeasure(II)V
    .locals 59

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    iput v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    iput v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    iput v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    iput v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingLeft()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingTop()I

    move-result v4

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v5, v3}, Ldz;->b(I)V

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v5, v4}, Ldz;->c(I)V

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    iget-object v5, v5, Ldy;->t:[I

    const/4 v7, 0x0

    aput v6, v5, v7

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    iget-object v5, v5, Ldy;->t:[I

    const/4 v8, 0x1

    aput v6, v5, v8

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x11

    if-lt v5, v6, :cond_1

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getLayoutDirection()I

    move-result v9

    if-ne v9, v8, :cond_0

    move v9, v8

    goto :goto_0

    :cond_0
    move v9, v7

    :goto_0
    iput-boolean v9, v5, Ldz;->a:Z

    :cond_1
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v9

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v10

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v11

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingTop()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingBottom()I

    move-result v13

    add-int/2addr v12, v13

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingLeft()I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingRight()I

    move-result v14

    add-int/2addr v13, v14

    sget v14, Ldy$a;->a:I

    sget v15, Ldy$a;->a:I

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    const/high16 v6, -0x80000000

    const/high16 v8, 0x40000000    # 2.0f

    if-eq v5, v6, :cond_4

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    :goto_1
    move v5, v7

    goto :goto_2

    :cond_2
    iget v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    invoke-static {v5, v9}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v5, v13

    goto :goto_2

    :cond_3
    sget v14, Ldy$a;->b:I

    goto :goto_1

    :cond_4
    sget v14, Ldy$a;->b:I

    move v5, v9

    :goto_2
    if-eq v10, v6, :cond_7

    if-eqz v10, :cond_6

    if-eq v10, v8, :cond_5

    :goto_3
    move v11, v7

    goto :goto_4

    :cond_5
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    invoke-static {v6, v11}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v6, v12

    move v11, v6

    goto :goto_4

    :cond_6
    sget v15, Ldy$a;->b:I

    goto :goto_3

    :cond_7
    sget v15, Ldy$a;->b:I

    :goto_4
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v6, v7}, Ldz;->f(I)V

    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v6, v7}, Ldz;->g(I)V

    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v6, v14}, Ldz;->h(I)V

    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v6, v5}, Ldz;->d(I)V

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v5, v15}, Ldz;->i(I)V

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v5, v11}, Ldz;->e(I)V

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingLeft()I

    move-result v9

    sub-int/2addr v6, v9

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingRight()I

    move-result v9

    sub-int/2addr v6, v9

    invoke-virtual {v5, v6}, Ldz;->f(I)V

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingTop()I

    move-result v9

    sub-int/2addr v6, v9

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingBottom()I

    move-result v9

    sub-int/2addr v6, v9

    invoke-virtual {v5, v6}, Ldz;->g(I)V

    iget-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v5}, Ldz;->l()I

    move-result v5

    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v6}, Ldz;->m()I

    move-result v6

    iget-boolean v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Z

    const/16 v11, 0x8

    const/4 v12, -0x1

    if-eqz v9, :cond_3d

    iput-boolean v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Z

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildCount()I

    move-result v9

    move v13, v7

    :goto_5
    if-ge v13, v9, :cond_9

    invoke-virtual {v0, v13}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    invoke-virtual {v14}, Landroid/view/View;->isLayoutRequested()Z

    move-result v14

    if-eqz v14, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_9
    move v9, v7

    :goto_6
    if-eqz v9, :cond_3d

    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->isInEditMode()Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildCount()I

    move-result v13

    if-eqz v9, :cond_b

    move v14, v7

    :goto_7
    if-ge v14, v13, :cond_b

    invoke-virtual {v0, v14}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v15

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v10

    invoke-virtual {v8, v10}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-direct {v0, v8, v10}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v10, 0x2f

    invoke-virtual {v8, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    if-eq v10, v12, :cond_a

    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    :cond_a
    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v10

    invoke-direct {v0, v10}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v10

    iput-object v8, v10, Ldy;->Z:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v14, v14, 0x1

    const/high16 v8, 0x40000000    # 2.0f

    goto :goto_7

    :cond_b
    move v8, v7

    :goto_8
    if-ge v8, v13, :cond_d

    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/view/View;)Ldy;

    move-result-object v10

    if-eqz v10, :cond_c

    invoke-virtual {v10}, Ldy;->f()V

    :cond_c
    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_d
    iget v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    if-eq v8, v12, :cond_f

    move v8, v7

    :goto_9
    if-ge v8, v13, :cond_f

    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->getId()I

    move-result v14

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    if-ne v14, v15, :cond_e

    instance-of v14, v10, Lem;

    if-eqz v14, :cond_e

    check-cast v10, Lem;

    invoke-virtual {v10}, Lem;->getConstraintSet()Lel;

    move-result-object v10

    iput-object v10, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    :cond_e
    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_f
    iget-object v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    if-eqz v8, :cond_10

    iget-object v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    invoke-virtual {v8, v0}, Lel;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_10
    iget-object v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v8}, Ldz;->E()V

    iget-object v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-lez v8, :cond_11

    move v10, v7

    :goto_a
    if-ge v10, v8, :cond_11

    iget-object v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lek;

    invoke-virtual {v14, v0}, Lek;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :cond_11
    move v8, v7

    :goto_b
    if-ge v8, v13, :cond_14

    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    instance-of v14, v10, Leo;

    if-eqz v14, :cond_13

    check-cast v10, Leo;

    iget v14, v10, Leo;->a:I

    if-ne v14, v12, :cond_12

    invoke-virtual {v10}, Leo;->isInEditMode()Z

    move-result v14

    if-nez v14, :cond_12

    iget v14, v10, Leo;->c:I

    invoke-virtual {v10, v14}, Leo;->setVisibility(I)V

    :cond_12
    iget v14, v10, Leo;->a:I

    invoke-virtual {v0, v14}, Landroidx/constraintlayout/widget/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v14

    iput-object v14, v10, Leo;->b:Landroid/view/View;

    iget-object v14, v10, Leo;->b:Landroid/view/View;

    if-eqz v14, :cond_13

    iget-object v14, v10, Leo;->b:Landroid/view/View;

    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    const/4 v15, 0x1

    iput-boolean v15, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->aa:Z

    iget-object v14, v10, Leo;->b:Landroid/view/View;

    invoke-virtual {v14, v7}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v10, v7}, Leo;->setVisibility(I)V

    :cond_13
    add-int/lit8 v8, v8, 0x1

    goto :goto_b

    :cond_14
    move v8, v7

    :goto_c
    if-ge v8, v13, :cond_3d

    invoke-virtual {v0, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v0, v10}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/view/View;)Ldy;

    move-result-object v14

    if-eqz v14, :cond_3b

    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    check-cast v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-virtual {v15}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    iget-boolean v12, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->am:Z

    if-eqz v12, :cond_15

    iput-boolean v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->am:Z

    goto :goto_d

    :cond_15
    if-eqz v9, :cond_16

    :try_start_1
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    invoke-virtual {v10}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual {v12, v7}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10}, Landroid/view/View;->getId()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-direct {v0, v7, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v12, "id/"

    invoke-virtual {v7, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v12

    add-int/lit8 v12, v12, 0x3

    invoke-virtual {v7, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10}, Landroid/view/View;->getId()I

    move-result v12

    invoke-direct {v0, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v12

    iput-object v7, v12, Ldy;->Z:Ljava/lang/String;
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_16
    :goto_d
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v7

    iput v7, v14, Ldy;->Y:I

    iget-boolean v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->aa:Z

    if-eqz v7, :cond_17

    iput v11, v14, Ldy;->Y:I

    :cond_17
    iput-object v10, v14, Ldy;->X:Ljava/lang/Object;

    iget-object v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v7, v14}, Ldz;->a(Ldy;)V

    iget-boolean v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v7, :cond_18

    iget-boolean v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v7, :cond_19

    :cond_18
    iget-object v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Ljava/util/ArrayList;

    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    iget-boolean v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-eqz v7, :cond_1d

    check-cast v14, Lea;

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->ai:I

    iget v10, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->aj:I

    iget v12, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->ak:F

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    move/from16 v25, v7

    const/16 v7, 0x11

    if-ge v11, v7, :cond_1a

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I

    iget v10, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I

    iget v12, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F

    goto :goto_e

    :cond_1a
    move/from16 v7, v25

    :goto_e
    const/high16 v11, -0x40800000    # -1.0f

    cmpl-float v11, v12, v11

    if-eqz v11, :cond_1b

    invoke-virtual {v14, v12}, Lea;->a(F)V

    goto/16 :goto_1e

    :cond_1b
    const/4 v11, -0x1

    if-eq v7, v11, :cond_1c

    invoke-virtual {v14, v7}, Lea;->k(I)V

    goto/16 :goto_1e

    :cond_1c
    if-eq v10, v11, :cond_3b

    invoke-virtual {v14, v10}, Lea;->l(I)V

    goto/16 :goto_1e

    :cond_1d
    const/4 v11, -0x1

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    if-ne v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    if-eq v7, v11, :cond_1e

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    if-ne v7, v11, :cond_3b

    :cond_1e
    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->ab:I

    iget v10, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->ac:I

    iget v11, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->ad:I

    iget v12, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->ae:I

    move/from16 v26, v7

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->af:I

    move/from16 v27, v7

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->ag:I

    move/from16 v28, v7

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->ah:F

    move/from16 v29, v7

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    move/from16 v30, v10

    const/16 v10, 0x11

    if-ge v7, v10, :cond_25

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d:I

    iget v11, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e:I

    iget v12, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f:I

    iget v10, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g:I

    move/from16 v31, v13

    iget v13, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->t:I

    move/from16 v32, v13

    iget v13, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->v:I

    move/from16 v33, v13

    iget v13, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->z:F

    move/from16 v34, v13

    const/4 v13, -0x1

    if-ne v7, v13, :cond_20

    if-ne v11, v13, :cond_20

    move/from16 v35, v7

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    if-eq v7, v13, :cond_1f

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->q:I

    goto :goto_10

    :cond_1f
    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    if-eq v7, v13, :cond_21

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->p:I

    move v11, v7

    goto :goto_f

    :cond_20
    move/from16 v35, v7

    :cond_21
    :goto_f
    move/from16 v7, v35

    :goto_10
    if-ne v12, v13, :cond_23

    if-ne v10, v13, :cond_23

    move/from16 v36, v7

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    if-eq v7, v13, :cond_22

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->r:I

    move/from16 v37, v3

    move/from16 v38, v4

    move v12, v7

    goto :goto_11

    :cond_22
    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    if-eq v7, v13, :cond_24

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->s:I

    move/from16 v37, v3

    move/from16 v38, v4

    move v10, v7

    goto :goto_11

    :cond_23
    move/from16 v36, v7

    :cond_24
    move/from16 v37, v3

    move/from16 v38, v4

    :goto_11
    move/from16 v24, v32

    move/from16 v3, v34

    move/from16 v7, v36

    goto :goto_12

    :cond_25
    move/from16 v31, v13

    const/4 v13, -0x1

    move/from16 v37, v3

    move/from16 v38, v4

    move v10, v12

    move/from16 v7, v26

    move/from16 v24, v27

    move/from16 v33, v28

    move/from16 v3, v29

    move v12, v11

    move/from16 v11, v30

    :goto_12
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    if-eq v4, v13, :cond_26

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    invoke-direct {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v21

    if-eqz v21, :cond_32

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    sget-object v20, Ldx$c;->g:Ldx$c;

    sget-object v22, Ldx$c;->g:Ldx$c;

    const/16 v24, 0x0

    move-object/from16 v19, v14

    move/from16 v23, v4

    invoke-virtual/range {v19 .. v24}, Ldy;->a(Ldx$c;Ldy;Ldx$c;II)V

    iput v3, v14, Ldy;->u:F

    goto/16 :goto_19

    :cond_26
    move v4, v13

    if-eq v7, v4, :cond_28

    invoke-direct {v0, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v21

    if-eqz v21, :cond_27

    sget-object v20, Ldx$c;->b:Ldx$c;

    sget-object v22, Ldx$c;->b:Ldx$c;

    goto :goto_14

    :cond_27
    :goto_13
    const/4 v4, -0x1

    goto :goto_15

    :cond_28
    if-eq v11, v4, :cond_29

    invoke-direct {v0, v11}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v21

    if-eqz v21, :cond_27

    sget-object v20, Ldx$c;->b:Ldx$c;

    sget-object v22, Ldx$c;->d:Ldx$c;

    :goto_14
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->leftMargin:I

    move-object/from16 v19, v14

    move/from16 v23, v4

    invoke-virtual/range {v19 .. v24}, Ldy;->a(Ldx$c;Ldy;Ldx$c;II)V

    goto :goto_13

    :cond_29
    :goto_15
    if-eq v12, v4, :cond_2a

    invoke-direct {v0, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v21

    if-eqz v21, :cond_2b

    sget-object v20, Ldx$c;->d:Ldx$c;

    sget-object v22, Ldx$c;->b:Ldx$c;

    goto :goto_16

    :cond_2a
    if-eq v10, v4, :cond_2b

    invoke-direct {v0, v10}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v21

    if-eqz v21, :cond_2b

    sget-object v20, Ldx$c;->d:Ldx$c;

    sget-object v22, Ldx$c;->d:Ldx$c;

    :goto_16
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->rightMargin:I

    move-object/from16 v19, v14

    move/from16 v23, v4

    move/from16 v24, v33

    invoke-virtual/range {v19 .. v24}, Ldy;->a(Ldx$c;Ldy;Ldx$c;II)V

    :cond_2b
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    const/4 v7, -0x1

    if-eq v4, v7, :cond_2c

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    invoke-direct {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v21

    if-eqz v21, :cond_2d

    sget-object v20, Ldx$c;->c:Ldx$c;

    sget-object v22, Ldx$c;->c:Ldx$c;

    goto :goto_17

    :cond_2c
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    const/4 v7, -0x1

    if-eq v4, v7, :cond_2d

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    invoke-direct {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v21

    if-eqz v21, :cond_2d

    sget-object v20, Ldx$c;->c:Ldx$c;

    sget-object v22, Ldx$c;->e:Ldx$c;

    :goto_17
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->topMargin:I

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    move-object/from16 v19, v14

    move/from16 v23, v4

    move/from16 v24, v7

    invoke-virtual/range {v19 .. v24}, Ldy;->a(Ldx$c;Ldy;Ldx$c;II)V

    :cond_2d
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    const/4 v7, -0x1

    if-eq v4, v7, :cond_2e

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    invoke-direct {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v21

    if-eqz v21, :cond_2f

    sget-object v20, Ldx$c;->e:Ldx$c;

    sget-object v22, Ldx$c;->c:Ldx$c;

    goto :goto_18

    :cond_2e
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    const/4 v7, -0x1

    if-eq v4, v7, :cond_2f

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    invoke-direct {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v21

    if-eqz v21, :cond_2f

    sget-object v20, Ldx$c;->e:Ldx$c;

    sget-object v22, Ldx$c;->e:Ldx$c;

    :goto_18
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->bottomMargin:I

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    move-object/from16 v19, v14

    move/from16 v23, v4

    move/from16 v24, v7

    invoke-virtual/range {v19 .. v24}, Ldy;->a(Ldx$c;Ldy;Ldx$c;II)V

    :cond_2f
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    const/4 v7, -0x1

    if-eq v4, v7, :cond_30

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    invoke-virtual {v4, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    invoke-direct {v0, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(I)Ldy;

    move-result-object v7

    if-eqz v7, :cond_30

    if-eqz v4, :cond_30

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    instance-of v10, v10, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    if-eqz v10, :cond_30

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    const/4 v10, 0x1

    iput-boolean v10, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    iput-boolean v10, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    sget-object v4, Ldx$c;->f:Ldx$c;

    invoke-virtual {v14, v4}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v39

    sget-object v4, Ldx$c;->f:Ldx$c;

    invoke-virtual {v7, v4}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v40

    const/16 v41, 0x0

    const/16 v42, -0x1

    sget v43, Ldx$b;->b:I

    const/16 v44, 0x0

    const/16 v45, 0x1

    invoke-virtual/range {v39 .. v45}, Ldx;->a(Ldx;IIIIZ)Z

    sget-object v4, Ldx$c;->c:Ldx$c;

    invoke-virtual {v14, v4}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v4

    invoke-virtual {v4}, Ldx;->c()V

    sget-object v4, Ldx$c;->e:Ldx$c;

    invoke-virtual {v14, v4}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v4

    invoke-virtual {v4}, Ldx;->c()V

    :cond_30
    const/4 v4, 0x0

    cmpl-float v7, v3, v4

    const/high16 v10, 0x3f000000    # 0.5f

    if-ltz v7, :cond_31

    cmpl-float v7, v3, v10

    if-eqz v7, :cond_31

    iput v3, v14, Ldy;->V:F

    :cond_31
    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    cmpl-float v3, v3, v4

    if-ltz v3, :cond_32

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    cmpl-float v3, v3, v10

    if-eqz v3, :cond_32

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    iput v3, v14, Ldy;->W:F

    :cond_32
    :goto_19
    if-eqz v9, :cond_34

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_33

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    if-eq v3, v4, :cond_34

    :cond_33
    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    invoke-virtual {v14, v3, v4}, Ldy;->a(II)V

    :cond_34
    iget-boolean v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v3, :cond_36

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_35

    sget v3, Ldy$a;->d:I

    invoke-virtual {v14, v3}, Ldy;->h(I)V

    sget-object v3, Ldx$c;->b:Ldx$c;

    invoke-virtual {v14, v3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v3

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->leftMargin:I

    iput v4, v3, Ldx;->e:I

    sget-object v3, Ldx$c;->d:Ldx$c;

    invoke-virtual {v14, v3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v3

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->rightMargin:I

    iput v4, v3, Ldx;->e:I

    goto :goto_1b

    :cond_35
    sget v3, Ldy$a;->c:I

    invoke-virtual {v14, v3}, Ldy;->h(I)V

    const/4 v3, 0x0

    goto :goto_1a

    :cond_36
    sget v3, Ldy$a;->a:I

    invoke-virtual {v14, v3}, Ldy;->h(I)V

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    :goto_1a
    invoke-virtual {v14, v3}, Ldy;->d(I)V

    :goto_1b
    iget-boolean v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-nez v3, :cond_38

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_37

    sget v3, Ldy$a;->d:I

    invoke-virtual {v14, v3}, Ldy;->i(I)V

    sget-object v3, Ldx$c;->c:Ldx$c;

    invoke-virtual {v14, v3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v3

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->topMargin:I

    iput v4, v3, Ldx;->e:I

    sget-object v3, Ldx$c;->e:Ldx$c;

    invoke-virtual {v14, v3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v3

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->bottomMargin:I

    iput v4, v3, Ldx;->e:I

    goto :goto_1d

    :cond_37
    sget v3, Ldy$a;->c:I

    invoke-virtual {v14, v3}, Ldy;->i(I)V

    const/4 v3, 0x0

    goto :goto_1c

    :cond_38
    sget v3, Ldy$a;->a:I

    invoke-virtual {v14, v3}, Ldy;->i(I)V

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    :goto_1c
    invoke-virtual {v14, v3}, Ldy;->e(I)V

    :goto_1d
    iget-object v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    if-eqz v3, :cond_39

    iget-object v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    invoke-virtual {v14, v3}, Ldy;->a(Ljava/lang/String;)V

    :cond_39
    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    iget-object v4, v14, Ldy;->ag:[F

    const/4 v7, 0x0

    aput v3, v4, v7

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:F

    iget-object v4, v14, Ldy;->ag:[F

    const/4 v7, 0x1

    aput v3, v4, v7

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    iput v3, v14, Ldy;->ac:I

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iput v3, v14, Ldy;->ad:I

    iget v3, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iget v10, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    iput v3, v14, Ldy;->g:I

    iput v4, v14, Ldy;->j:I

    iput v7, v14, Ldy;->k:I

    iput v10, v14, Ldy;->l:F

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v4, v10, v3

    if-gez v4, :cond_3a

    iget v4, v14, Ldy;->g:I

    if-nez v4, :cond_3a

    const/4 v4, 0x2

    iput v4, v14, Ldy;->g:I

    :cond_3a
    iget v4, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iget v7, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iget v10, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:I

    iget v11, v15, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:F

    iput v4, v14, Ldy;->h:I

    iput v7, v14, Ldy;->m:I

    iput v10, v14, Ldy;->n:I

    iput v11, v14, Ldy;->o:F

    cmpg-float v3, v11, v3

    if-gez v3, :cond_3c

    iget v3, v14, Ldy;->h:I

    if-nez v3, :cond_3c

    const/4 v3, 0x2

    iput v3, v14, Ldy;->h:I

    goto :goto_1f

    :cond_3b
    :goto_1e
    move/from16 v37, v3

    move/from16 v38, v4

    move/from16 v31, v13

    :cond_3c
    :goto_1f
    add-int/lit8 v8, v8, 0x1

    move/from16 v13, v31

    move/from16 v3, v37

    move/from16 v4, v38

    const/4 v7, 0x0

    const/16 v11, 0x8

    const/4 v12, -0x1

    goto/16 :goto_c

    :cond_3d
    move/from16 v37, v3

    move/from16 v38, v4

    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:I

    const/16 v4, 0x8

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_3e

    const/4 v3, 0x1

    goto :goto_20

    :cond_3e
    const/4 v3, 0x0

    :goto_20
    const/4 v4, -0x2

    if-eqz v3, :cond_67

    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v9}, Ldz;->B()V

    iget-object v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v9, v5, v6}, Ldz;->e(II)V

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingTop()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingBottom()I

    move-result v10

    add-int/2addr v9, v10

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingLeft()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingRight()I

    move-result v11

    add-int/2addr v10, v11

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildCount()I

    move-result v11

    const/4 v12, 0x0

    :goto_21
    if-ge v12, v11, :cond_4b

    invoke-virtual {v0, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    const/16 v15, 0x8

    if-eq v14, v15, :cond_49

    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v15, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    iget-boolean v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v7, :cond_49

    iget-boolean v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-nez v7, :cond_49

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v7

    iput v7, v15, Ldy;->Y:I

    iget v7, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    iget v8, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    if-eqz v7, :cond_48

    if-nez v8, :cond_3f

    goto/16 :goto_27

    :cond_3f
    if-ne v7, v4, :cond_40

    move/from16 v46, v6

    const/16 v16, 0x1

    goto :goto_22

    :cond_40
    move/from16 v46, v6

    const/16 v16, 0x0

    :goto_22
    invoke-static {v1, v10, v7}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v6

    if-ne v8, v4, :cond_41

    const/16 v19, 0x1

    goto :goto_23

    :cond_41
    const/16 v19, 0x0

    :goto_23
    invoke-static {v2, v9, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v4

    invoke-virtual {v13, v6, v4}, Landroid/view/View;->measure(II)V

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    if-eqz v4, :cond_42

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    move/from16 v47, v5

    iget-wide v5, v4, Ldr;->a:J

    const-wide/16 v20, 0x1

    add-long v5, v5, v20

    iput-wide v5, v4, Ldr;->a:J

    goto :goto_24

    :cond_42
    move/from16 v47, v5

    :goto_24
    const/4 v4, -0x2

    if-ne v7, v4, :cond_43

    const/4 v5, 0x1

    goto :goto_25

    :cond_43
    const/4 v5, 0x0

    :goto_25
    iput-boolean v5, v15, Ldy;->p:Z

    if-ne v8, v4, :cond_44

    const/4 v4, 0x1

    goto :goto_26

    :cond_44
    const/4 v4, 0x0

    :goto_26
    iput-boolean v4, v15, Ldy;->q:Z

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-virtual {v15, v4}, Ldy;->d(I)V

    invoke-virtual {v15, v5}, Ldy;->e(I)V

    if-eqz v16, :cond_45

    iput v4, v15, Ldy;->S:I

    :cond_45
    if-eqz v19, :cond_46

    iput v5, v15, Ldy;->T:I

    :cond_46
    iget-boolean v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-eqz v6, :cond_47

    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_47

    iput v6, v15, Ldy;->P:I

    :cond_47
    iget-boolean v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-eqz v6, :cond_4a

    iget-boolean v6, v14, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v6, :cond_4a

    invoke-virtual {v15}, Ldy;->h()Lef;

    move-result-object v6

    invoke-virtual {v6, v4}, Lef;->a(I)V

    invoke-virtual {v15}, Ldy;->i()Lef;

    move-result-object v4

    invoke-virtual {v4, v5}, Lef;->a(I)V

    goto :goto_28

    :cond_48
    :goto_27
    move/from16 v47, v5

    move/from16 v46, v6

    invoke-virtual {v15}, Ldy;->h()Lef;

    move-result-object v4

    invoke-virtual {v4}, Lef;->c()V

    invoke-virtual {v15}, Ldy;->i()Lef;

    move-result-object v4

    invoke-virtual {v4}, Lef;->c()V

    goto :goto_28

    :cond_49
    move/from16 v47, v5

    move/from16 v46, v6

    :cond_4a
    :goto_28
    add-int/lit8 v12, v12, 0x1

    move/from16 v6, v46

    move/from16 v5, v47

    const/4 v4, -0x2

    goto/16 :goto_21

    :cond_4b
    move/from16 v47, v5

    move/from16 v46, v6

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v4}, Ldz;->C()V

    const/4 v4, 0x0

    :goto_29
    if-ge v4, v11, :cond_66

    invoke-virtual {v0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-eq v6, v7, :cond_64

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v7, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    iget-boolean v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v8, :cond_64

    iget-boolean v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-nez v8, :cond_64

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v8

    iput v8, v7, Ldy;->Y:I

    iget v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    iget v12, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    if-eqz v8, :cond_4c

    if-nez v12, :cond_64

    :cond_4c
    sget-object v13, Ldx$c;->b:Ldx$c;

    invoke-virtual {v7, v13}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v13

    iget-object v13, v13, Ldx;->a:Lee;

    sget-object v14, Ldx$c;->d:Ldx$c;

    invoke-virtual {v7, v14}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v14

    iget-object v14, v14, Ldx;->a:Lee;

    sget-object v15, Ldx$c;->b:Ldx$c;

    invoke-virtual {v7, v15}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v15

    iget-object v15, v15, Ldx;->d:Ldx;

    if-eqz v15, :cond_4d

    sget-object v15, Ldx$c;->d:Ldx$c;

    invoke-virtual {v7, v15}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v15

    iget-object v15, v15, Ldx;->d:Ldx;

    if-eqz v15, :cond_4d

    move/from16 v48, v11

    const/4 v15, 0x1

    goto :goto_2a

    :cond_4d
    move/from16 v48, v11

    const/4 v15, 0x0

    :goto_2a
    sget-object v11, Ldx$c;->c:Ldx$c;

    invoke-virtual {v7, v11}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v11

    iget-object v11, v11, Ldx;->a:Lee;

    move/from16 v49, v3

    sget-object v3, Ldx$c;->e:Ldx$c;

    invoke-virtual {v7, v3}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v3

    iget-object v3, v3, Ldx;->a:Lee;

    move/from16 v50, v4

    sget-object v4, Ldx$c;->c:Ldx$c;

    invoke-virtual {v7, v4}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v4

    iget-object v4, v4, Ldx;->d:Ldx;

    if-eqz v4, :cond_4e

    sget-object v4, Ldx$c;->e:Ldx$c;

    invoke-virtual {v7, v4}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v4

    iget-object v4, v4, Ldx;->d:Ldx;

    if-eqz v4, :cond_4e

    const/4 v4, 0x1

    goto :goto_2b

    :cond_4e
    const/4 v4, 0x0

    :goto_2b
    if-nez v8, :cond_50

    if-nez v12, :cond_50

    if-eqz v15, :cond_50

    if-nez v4, :cond_4f

    goto :goto_2c

    :cond_4f
    move-object v11, v0

    const/4 v5, 0x2

    goto/16 :goto_3a

    :cond_50
    :goto_2c
    move-object/from16 v51, v6

    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v6}, Ldz;->x()I

    move-result v6

    move-object/from16 v52, v5

    sget v5, Ldy$a;->b:I

    if-eq v6, v5, :cond_51

    const/4 v5, 0x1

    goto :goto_2d

    :cond_51
    const/4 v5, 0x0

    :goto_2d
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v6}, Ldz;->y()I

    move-result v6

    sget v0, Ldy$a;->b:I

    if-eq v6, v0, :cond_52

    const/4 v0, 0x1

    goto :goto_2e

    :cond_52
    const/4 v0, 0x0

    :goto_2e
    if-nez v5, :cond_53

    invoke-virtual {v7}, Ldy;->h()Lef;

    move-result-object v6

    invoke-virtual {v6}, Lef;->c()V

    :cond_53
    if-nez v0, :cond_54

    invoke-virtual {v7}, Ldy;->i()Lef;

    move-result-object v6

    invoke-virtual {v6}, Lef;->c()V

    :cond_54
    if-nez v8, :cond_56

    if-eqz v5, :cond_55

    invoke-virtual {v7}, Ldy;->d()Z

    move-result v6

    if-eqz v6, :cond_55

    if-eqz v15, :cond_55

    invoke-virtual {v13}, Lee;->e()Z

    move-result v6

    if-eqz v6, :cond_55

    invoke-virtual {v14}, Lee;->e()Z

    move-result v6

    if-eqz v6, :cond_55

    iget v6, v14, Lee;->f:F

    iget v8, v13, Lee;->f:F

    sub-float/2addr v6, v8

    float-to-int v8, v6

    invoke-virtual {v7}, Ldy;->h()Lef;

    move-result-object v6

    invoke-virtual {v6, v8}, Lef;->a(I)V

    goto :goto_2f

    :cond_55
    const/4 v6, -0x2

    invoke-static {v1, v10, v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v5

    move v13, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    goto :goto_31

    :cond_56
    const/4 v6, -0x2

    const/4 v13, -0x1

    if-ne v8, v13, :cond_57

    invoke-static {v1, v10, v13}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v14

    move v13, v14

    const/4 v6, 0x0

    goto :goto_31

    :cond_57
    if-ne v8, v6, :cond_58

    const/4 v6, 0x1

    goto :goto_30

    :cond_58
    :goto_2f
    const/4 v6, 0x0

    :goto_30
    invoke-static {v1, v10, v8}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v13

    :goto_31
    if-nez v12, :cond_5a

    if-eqz v0, :cond_59

    invoke-virtual {v7}, Ldy;->e()Z

    move-result v14

    if-eqz v14, :cond_59

    if-eqz v4, :cond_59

    invoke-virtual {v11}, Lee;->e()Z

    move-result v4

    if-eqz v4, :cond_59

    invoke-virtual {v3}, Lee;->e()Z

    move-result v4

    if-eqz v4, :cond_59

    iget v3, v3, Lee;->f:F

    iget v4, v11, Lee;->f:F

    sub-float/2addr v3, v4

    float-to-int v12, v3

    invoke-virtual {v7}, Ldy;->i()Lef;

    move-result-object v3

    invoke-virtual {v3, v12}, Lef;->a(I)V

    goto :goto_32

    :cond_59
    const/4 v3, -0x2

    invoke-static {v2, v9, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v0

    move v11, v0

    move-object/from16 v0, v52

    const/4 v3, 0x1

    const/4 v4, 0x0

    goto :goto_34

    :cond_5a
    const/4 v3, -0x2

    const/4 v4, -0x1

    if-ne v12, v4, :cond_5b

    invoke-static {v2, v9, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v11

    move v4, v0

    move-object/from16 v0, v52

    const/4 v3, 0x0

    goto :goto_34

    :cond_5b
    if-ne v12, v3, :cond_5c

    const/4 v3, 0x1

    goto :goto_33

    :cond_5c
    :goto_32
    const/4 v3, 0x0

    :goto_33
    invoke-static {v2, v9, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v4

    move v11, v4

    move v4, v0

    move-object/from16 v0, v52

    :goto_34
    invoke-virtual {v0, v13, v11}, Landroid/view/View;->measure(II)V

    move-object/from16 v11, p0

    iget-object v13, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    if-eqz v13, :cond_5d

    iget-object v13, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    iget-wide v14, v13, Ldr;->a:J

    const-wide/16 v19, 0x1

    add-long v14, v14, v19

    iput-wide v14, v13, Ldr;->a:J

    :cond_5d
    const/4 v13, -0x2

    if-ne v8, v13, :cond_5e

    const/4 v8, 0x1

    goto :goto_35

    :cond_5e
    const/4 v8, 0x0

    :goto_35
    iput-boolean v8, v7, Ldy;->p:Z

    if-ne v12, v13, :cond_5f

    const/4 v8, 0x1

    goto :goto_36

    :cond_5f
    const/4 v8, 0x0

    :goto_36
    iput-boolean v8, v7, Ldy;->q:Z

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    invoke-virtual {v7, v8}, Ldy;->d(I)V

    invoke-virtual {v7, v12}, Ldy;->e(I)V

    if-eqz v6, :cond_60

    iput v8, v7, Ldy;->S:I

    :cond_60
    if-eqz v3, :cond_61

    iput v12, v7, Ldy;->T:I

    :cond_61
    if-eqz v5, :cond_62

    invoke-virtual {v7}, Ldy;->h()Lef;

    move-result-object v3

    invoke-virtual {v3, v8}, Lef;->a(I)V

    const/4 v5, 0x2

    goto :goto_37

    :cond_62
    invoke-virtual {v7}, Ldy;->h()Lef;

    move-result-object v3

    const/4 v5, 0x2

    iput v5, v3, Lef;->i:I

    :goto_37
    if-eqz v4, :cond_63

    invoke-virtual {v7}, Ldy;->i()Lef;

    move-result-object v3

    invoke-virtual {v3, v12}, Lef;->a(I)V

    :goto_38
    move-object/from16 v6, v51

    goto :goto_39

    :cond_63
    invoke-virtual {v7}, Ldy;->i()Lef;

    move-result-object v3

    iput v5, v3, Lef;->i:I

    goto :goto_38

    :goto_39
    iget-boolean v3, v6, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-eqz v3, :cond_65

    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_65

    iput v0, v7, Ldy;->P:I

    goto :goto_3a

    :cond_64
    move/from16 v49, v3

    move/from16 v50, v4

    move/from16 v48, v11

    const/4 v5, 0x2

    move-object v11, v0

    :cond_65
    :goto_3a
    add-int/lit8 v4, v50, 0x1

    move-object v0, v11

    move/from16 v11, v48

    move/from16 v3, v49

    goto/16 :goto_29

    :cond_66
    move-object v11, v0

    move/from16 v49, v3

    goto/16 :goto_49

    :cond_67
    move-object v11, v0

    move/from16 v49, v3

    move/from16 v47, v5

    move/from16 v46, v6

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingTop()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingBottom()I

    move-result v3

    add-int/2addr v0, v3

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingLeft()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildCount()I

    move-result v4

    const/4 v5, 0x0

    :goto_3b
    if-ge v5, v4, :cond_7a

    invoke-virtual {v11, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_78

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v8, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    iget-boolean v9, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v9, :cond_78

    iget-boolean v9, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-nez v9, :cond_78

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v9

    iput v9, v8, Ldy;->Y:I

    iget v9, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    iget v10, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    iget-boolean v12, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v12, :cond_6a

    iget-boolean v12, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-nez v12, :cond_6a

    iget-boolean v12, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-nez v12, :cond_68

    iget v12, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    const/4 v15, 0x1

    if-eq v12, v15, :cond_6b

    goto :goto_3c

    :cond_68
    const/4 v15, 0x1

    :goto_3c
    iget v12, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    const/4 v13, -0x1

    if-eq v12, v13, :cond_6b

    iget-boolean v12, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-nez v12, :cond_69

    iget v12, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    if-eq v12, v15, :cond_6b

    iget v12, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    if-ne v12, v13, :cond_69

    goto :goto_3d

    :cond_69
    const/4 v12, 0x0

    goto :goto_3e

    :cond_6a
    const/4 v15, 0x1

    :cond_6b
    :goto_3d
    move v12, v15

    :goto_3e
    if-eqz v12, :cond_75

    if-nez v9, :cond_6c

    const/4 v12, -0x2

    invoke-static {v1, v3, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v13

    move v14, v13

    move/from16 v16, v15

    const/4 v13, -0x1

    goto :goto_40

    :cond_6c
    const/4 v12, -0x2

    const/4 v13, -0x1

    if-ne v9, v13, :cond_6d

    invoke-static {v1, v3, v13}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v14

    const/16 v16, 0x0

    goto :goto_40

    :cond_6d
    if-ne v9, v12, :cond_6e

    move v14, v15

    goto :goto_3f

    :cond_6e
    const/4 v14, 0x0

    :goto_3f
    invoke-static {v1, v3, v9}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v16

    move/from16 v58, v16

    move/from16 v16, v14

    move/from16 v14, v58

    :goto_40
    if-nez v10, :cond_6f

    invoke-static {v2, v0, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v17

    move v13, v15

    :goto_41
    move/from16 v12, v17

    goto :goto_43

    :cond_6f
    if-ne v10, v13, :cond_70

    invoke-static {v2, v0, v13}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v17

    move/from16 v12, v17

    const/4 v13, 0x0

    goto :goto_43

    :cond_70
    if-ne v10, v12, :cond_71

    move v12, v15

    goto :goto_42

    :cond_71
    const/4 v12, 0x0

    :goto_42
    invoke-static {v2, v0, v10}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v17

    move v13, v12

    goto :goto_41

    :goto_43
    invoke-virtual {v6, v14, v12}, Landroid/view/View;->measure(II)V

    iget-object v12, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    if-eqz v12, :cond_72

    iget-object v12, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    move/from16 v53, v3

    move/from16 v54, v4

    iget-wide v3, v12, Ldr;->a:J

    const-wide/16 v18, 0x1

    add-long v3, v3, v18

    iput-wide v3, v12, Ldr;->a:J

    goto :goto_44

    :cond_72
    move/from16 v53, v3

    move/from16 v54, v4

    :goto_44
    const/4 v3, -0x2

    if-ne v9, v3, :cond_73

    move v4, v15

    goto :goto_45

    :cond_73
    const/4 v4, 0x0

    :goto_45
    iput-boolean v4, v8, Ldy;->p:Z

    if-ne v10, v3, :cond_74

    move v3, v15

    goto :goto_46

    :cond_74
    const/4 v3, 0x0

    :goto_46
    iput-boolean v3, v8, Ldy;->q:Z

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    goto :goto_47

    :cond_75
    move/from16 v53, v3

    move/from16 v54, v4

    const/4 v13, 0x0

    const/16 v16, 0x0

    :goto_47
    invoke-virtual {v8, v9}, Ldy;->d(I)V

    invoke-virtual {v8, v10}, Ldy;->e(I)V

    if-eqz v16, :cond_76

    iput v9, v8, Ldy;->S:I

    :cond_76
    if-eqz v13, :cond_77

    iput v10, v8, Ldy;->T:I

    :cond_77
    iget-boolean v3, v7, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-eqz v3, :cond_79

    invoke-virtual {v6}, Landroid/view/View;->getBaseline()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_79

    iput v3, v8, Ldy;->P:I

    goto :goto_48

    :cond_78
    move/from16 v53, v3

    move/from16 v54, v4

    const/4 v15, 0x1

    :cond_79
    :goto_48
    add-int/lit8 v5, v5, 0x1

    move/from16 v3, v53

    move/from16 v4, v54

    goto/16 :goto_3b

    :cond_7a
    :goto_49
    const/4 v15, 0x1

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildCount()I

    move-result v0

    const/4 v3, 0x0

    :goto_4a
    if-ge v3, v0, :cond_7c

    invoke-virtual {v11, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Leo;

    if-eqz v5, :cond_7b

    check-cast v4, Leo;

    iget-object v5, v4, Leo;->b:Landroid/view/View;

    if-eqz v5, :cond_7b

    invoke-virtual {v4}, Leo;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v4, v4, Leo;->b:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v6, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    const/4 v10, 0x0

    iput v10, v6, Ldy;->Y:I

    iget-object v6, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    iget-object v7, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    invoke-virtual {v7}, Ldy;->l()I

    move-result v7

    invoke-virtual {v6, v7}, Ldy;->d(I)V

    iget-object v5, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    iget-object v6, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    invoke-virtual {v6}, Ldy;->m()I

    move-result v6

    invoke-virtual {v5, v6}, Ldy;->e(I)V

    iget-object v4, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    const/16 v5, 0x8

    iput v5, v4, Ldy;->Y:I

    goto :goto_4b

    :cond_7b
    const/4 v10, 0x0

    :goto_4b
    add-int/lit8 v3, v3, 0x1

    goto :goto_4a

    :cond_7c
    const/4 v10, 0x0

    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_7d

    move v3, v10

    :goto_4c
    if-ge v3, v0, :cond_7d

    iget-object v4, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4c

    :cond_7d
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_7e

    invoke-direct/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->b()V

    :cond_7e
    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingBottom()I

    move-result v3

    add-int v4, v38, v3

    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingRight()I

    move-result v3

    add-int v3, v37, v3

    if-lez v0, :cond_9a

    iget-object v6, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v6}, Ldz;->x()I

    move-result v6

    sget v7, Ldy$a;->b:I

    if-ne v6, v7, :cond_7f

    move v6, v15

    goto :goto_4d

    :cond_7f
    move v6, v10

    :goto_4d
    iget-object v7, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v7}, Ldz;->y()I

    move-result v7

    sget v8, Ldy$a;->b:I

    if-ne v7, v8, :cond_80

    move v7, v15

    goto :goto_4e

    :cond_80
    move v7, v10

    :goto_4e
    iget-object v8, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v8}, Ldz;->l()I

    move-result v8

    iget v9, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    iget-object v9, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v9}, Ldz;->m()I

    move-result v9

    iget v12, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    move-result v9

    move v12, v8

    move v13, v9

    move v8, v10

    move v9, v8

    move v14, v9

    :goto_4f
    if-ge v8, v0, :cond_91

    iget-object v10, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ldy;

    iget-object v15, v10, Ldy;->X:Ljava/lang/Object;

    check-cast v15, Landroid/view/View;

    if-eqz v15, :cond_8d

    invoke-virtual {v15}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v16

    move-object/from16 v5, v16

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move/from16 v56, v0

    iget-boolean v0, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-nez v0, :cond_8e

    iget-boolean v0, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v0, :cond_8e

    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    move-result v0

    move/from16 v57, v9

    const/16 v9, 0x8

    if-eq v0, v9, :cond_8f

    if-eqz v49, :cond_81

    invoke-virtual {v10}, Ldy;->h()Lef;

    move-result-object v0

    invoke-virtual {v0}, Lef;->e()Z

    move-result v0

    if-eqz v0, :cond_81

    invoke-virtual {v10}, Ldy;->i()Lef;

    move-result-object v0

    invoke-virtual {v0}, Lef;->e()Z

    move-result v0

    if-nez v0, :cond_8f

    :cond_81
    iget v0, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    const/4 v9, -0x2

    if-ne v0, v9, :cond_82

    iget-boolean v0, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    if-eqz v0, :cond_82

    iget v0, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->width:I

    invoke-static {v1, v3, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v0

    goto :goto_50

    :cond_82
    invoke-virtual {v10}, Ldy;->l()I

    move-result v0

    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v0, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    :goto_50
    iget v9, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    const/4 v1, -0x2

    if-ne v9, v1, :cond_83

    iget-boolean v9, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-eqz v9, :cond_83

    iget v9, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->height:I

    invoke-static {v2, v4, v9}, Landroidx/constraintlayout/widget/ConstraintLayout;->getChildMeasureSpec(III)I

    move-result v9

    goto :goto_51

    :cond_83
    invoke-virtual {v10}, Ldy;->m()I

    move-result v9

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v9, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    :goto_51
    invoke-virtual {v15, v0, v9}, Landroid/view/View;->measure(II)V

    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    if-eqz v0, :cond_84

    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    iget-wide v1, v0, Ldr;->b:J

    const-wide/16 v16, 0x1

    add-long v1, v1, v16

    iput-wide v1, v0, Ldr;->b:J

    :cond_84
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v15}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {v10}, Ldy;->l()I

    move-result v2

    if-eq v0, v2, :cond_87

    invoke-virtual {v10, v0}, Ldy;->d(I)V

    if-eqz v49, :cond_85

    invoke-virtual {v10}, Ldy;->h()Lef;

    move-result-object v2

    invoke-virtual {v2, v0}, Lef;->a(I)V

    :cond_85
    if-eqz v6, :cond_86

    invoke-virtual {v10}, Ldy;->r()I

    move-result v0

    if-le v0, v12, :cond_86

    invoke-virtual {v10}, Ldy;->r()I

    move-result v0

    sget-object v2, Ldx$c;->d:Ldx$c;

    invoke-virtual {v10, v2}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v2

    invoke-virtual {v2}, Ldx;->b()I

    move-result v2

    add-int/2addr v0, v2

    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v12, v0

    :cond_86
    const/16 v57, 0x1

    :cond_87
    invoke-virtual {v10}, Ldy;->m()I

    move-result v0

    if-eq v1, v0, :cond_8a

    invoke-virtual {v10, v1}, Ldy;->e(I)V

    if-eqz v49, :cond_88

    invoke-virtual {v10}, Ldy;->i()Lef;

    move-result-object v0

    invoke-virtual {v0, v1}, Lef;->a(I)V

    :cond_88
    if-eqz v7, :cond_89

    invoke-virtual {v10}, Ldy;->s()I

    move-result v0

    if-le v0, v13, :cond_89

    invoke-virtual {v10}, Ldy;->s()I

    move-result v0

    sget-object v1, Ldx$c;->e:Ldx$c;

    invoke-virtual {v10, v1}, Ldy;->a(Ldx$c;)Ldx;

    move-result-object v1

    invoke-virtual {v1}, Ldx;->b()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v13, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v13, v0

    :cond_89
    const/16 v57, 0x1

    :cond_8a
    iget-boolean v0, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    if-eqz v0, :cond_8b

    invoke-virtual {v15}, Landroid/view/View;->getBaseline()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8c

    iget v2, v10, Ldy;->P:I

    if-eq v0, v2, :cond_8c

    iput v0, v10, Ldy;->P:I

    const/16 v57, 0x1

    goto :goto_52

    :cond_8b
    const/4 v1, -0x1

    :cond_8c
    :goto_52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v0, v2, :cond_90

    invoke-virtual {v15}, Landroid/view/View;->getMeasuredState()I

    move-result v0

    invoke-static {v14, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->combineMeasuredStates(II)I

    move-result v14

    goto :goto_53

    :cond_8d
    move/from16 v56, v0

    :cond_8e
    move/from16 v57, v9

    :cond_8f
    const/4 v1, -0x1

    :cond_90
    :goto_53
    move/from16 v9, v57

    add-int/lit8 v8, v8, 0x1

    move/from16 v0, v56

    move/from16 v1, p1

    move/from16 v2, p2

    const/4 v10, 0x0

    const/4 v15, 0x1

    goto/16 :goto_4f

    :cond_91
    move/from16 v56, v0

    move/from16 v57, v9

    if-eqz v57, :cond_95

    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    move/from16 v1, v47

    invoke-virtual {v0, v1}, Ldz;->d(I)V

    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    move/from16 v1, v46

    invoke-virtual {v0, v1}, Ldz;->e(I)V

    if-eqz v49, :cond_92

    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v0}, Ldz;->C()V

    :cond_92
    invoke-direct/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->b()V

    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v0}, Ldz;->l()I

    move-result v0

    if-ge v0, v12, :cond_93

    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v0, v12}, Ldz;->d(I)V

    const/4 v8, 0x1

    goto :goto_54

    :cond_93
    const/4 v8, 0x0

    :goto_54
    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v0}, Ldz;->m()I

    move-result v0

    if-ge v0, v13, :cond_94

    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v0, v13}, Ldz;->e(I)V

    const/16 v55, 0x1

    goto :goto_55

    :cond_94
    move/from16 v55, v8

    :goto_55
    if-eqz v55, :cond_95

    invoke-direct/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->b()V

    :cond_95
    move/from16 v0, v56

    const/4 v1, 0x0

    :goto_56
    if-ge v1, v0, :cond_9b

    iget-object v2, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldy;

    iget-object v5, v2, Ldy;->X:Ljava/lang/Object;

    check-cast v5, Landroid/view/View;

    if-eqz v5, :cond_97

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    invoke-virtual {v2}, Ldy;->l()I

    move-result v7

    if-ne v6, v7, :cond_96

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    invoke-virtual {v2}, Ldy;->m()I

    move-result v7

    if-eq v6, v7, :cond_97

    :cond_96
    iget v6, v2, Ldy;->Y:I

    const/16 v7, 0x8

    if-eq v6, v7, :cond_98

    invoke-virtual {v2}, Ldy;->l()I

    move-result v6

    const/high16 v8, 0x40000000    # 2.0f

    invoke-static {v6, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v2}, Ldy;->m()I

    move-result v2

    invoke-static {v2, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v5, v6, v2}, Landroid/view/View;->measure(II)V

    iget-object v2, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    if-eqz v2, :cond_99

    iget-object v2, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->t:Ldr;

    iget-wide v5, v2, Ldr;->b:J

    const-wide/16 v9, 0x1

    add-long/2addr v5, v9

    iput-wide v5, v2, Ldr;->b:J

    goto :goto_57

    :cond_97
    const/16 v7, 0x8

    :cond_98
    const/high16 v8, 0x40000000    # 2.0f

    :cond_99
    const-wide/16 v9, 0x1

    :goto_57
    add-int/lit8 v1, v1, 0x1

    goto :goto_56

    :cond_9a
    const/4 v14, 0x0

    :cond_9b
    iget-object v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v0}, Ldz;->l()I

    move-result v0

    add-int/2addr v0, v3

    iget-object v1, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v1}, Ldz;->m()I

    move-result v1

    add-int/2addr v1, v4

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v2, v3, :cond_9d

    move/from16 v2, p1

    invoke-static {v0, v2, v14}, Landroidx/constraintlayout/widget/ConstraintLayout;->resolveSizeAndState(III)I

    move-result v0

    shl-int/lit8 v2, v14, 0x10

    move/from16 v3, p2

    invoke-static {v1, v3, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->resolveSizeAndState(III)I

    move-result v1

    const v2, 0xffffff

    and-int/2addr v0, v2

    and-int/2addr v1, v2

    iget v2, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v2, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iget-boolean v2, v2, Ldz;->au:Z

    if-eqz v2, :cond_9c

    const/high16 v2, 0x1000000

    or-int/2addr v0, v2

    :cond_9c
    iget-object v2, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iget-boolean v2, v2, Ldz;->av:Z

    if-eqz v2, :cond_9d

    const/high16 v2, 0x1000000

    or-int/2addr v1, v2

    :cond_9d
    invoke-virtual {v11, v0, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->setMeasuredDimension(II)V

    iput v0, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    iput v1, v11, Landroidx/constraintlayout/widget/ConstraintLayout;->s:I

    return-void
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/view/View;)Ldy;

    move-result-object v0

    instance-of v1, p1, Len;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    instance-of v0, v0, Lea;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    new-instance v1, Lea;

    invoke-direct {v1}, Lea;-><init>()V

    iput-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    iput-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->al:Ldy;

    check-cast v1, Lea;

    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:I

    invoke-virtual {v1, v0}, Lea;->j(I)V

    :cond_1
    instance-of v0, p1, Lek;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lek;

    invoke-virtual {v0}, Lek;->a()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iput-boolean v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->a(Landroid/view/View;)Ldy;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    invoke-virtual {v1, v0}, Ldz;->b(Ldy;)V

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Z

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public requestLayout()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->s:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return-void
.end method

.method public setConstraintSet(Lel;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:Lel;

    return-void
.end method

.method public setId(I)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setId(I)V

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getId()I

    move-result v0

    invoke-virtual {p1, v0, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ldz;

    iput p1, v0, Ldz;->at:I

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
