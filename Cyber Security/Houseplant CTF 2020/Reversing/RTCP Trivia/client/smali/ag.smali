.class final Lag;
.super Lao;

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Laq;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lag$a;
    }
.end annotation


# static fields
.field private static final h:I


# instance fields
.field private A:Laq$a;

.field private B:Landroid/widget/PopupWindow$OnDismissListener;

.field final a:Landroid/os/Handler;

.field final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lag$a;",
            ">;"
        }
    .end annotation
.end field

.field final c:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field d:Landroid/view/View;

.field e:Landroid/view/ViewTreeObserver;

.field f:Z

.field private final i:Landroid/content/Context;

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:Z

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Laj;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Landroid/view/View$OnAttachStateChangeListener;

.field private final p:Lch;

.field private q:I

.field private r:I

.field private s:Landroid/view/View;

.field private t:I

.field private u:Z

.field private v:Z

.field private w:I

.field private x:I

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lb$g;->abc_cascading_menu_item_layout:I

    sput v0, Lag;->h:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IIZ)V
    .locals 1

    invoke-direct {p0}, Lao;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lag;->n:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lag;->b:Ljava/util/List;

    new-instance v0, Lag$1;

    invoke-direct {v0, p0}, Lag$1;-><init>(Lag;)V

    iput-object v0, p0, Lag;->c:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    new-instance v0, Lag$2;

    invoke-direct {v0, p0}, Lag$2;-><init>(Lag;)V

    iput-object v0, p0, Lag;->o:Landroid/view/View$OnAttachStateChangeListener;

    new-instance v0, Lag$3;

    invoke-direct {v0, p0}, Lag$3;-><init>(Lag;)V

    iput-object v0, p0, Lag;->p:Lch;

    const/4 v0, 0x0

    iput v0, p0, Lag;->q:I

    iput v0, p0, Lag;->r:I

    iput-object p1, p0, Lag;->i:Landroid/content/Context;

    iput-object p2, p0, Lag;->s:Landroid/view/View;

    iput p3, p0, Lag;->k:I

    iput p4, p0, Lag;->l:I

    iput-boolean p5, p0, Lag;->m:Z

    iput-boolean v0, p0, Lag;->y:Z

    invoke-direct {p0}, Lag;->g()I

    move-result p2

    iput p2, p0, Lag;->t:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p2, p2, 0x2

    sget p3, Lb$d;->abc_config_prefDialogWidth:I

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lag;->j:I

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lag;->a:Landroid/os/Handler;

    return-void
.end method

.method private c(Laj;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lag;->i:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    new-instance v3, Lai;

    iget-boolean v4, v0, Lag;->m:Z

    sget v5, Lag;->h:I

    invoke-direct {v3, v1, v2, v4, v5}, Lai;-><init>(Laj;Landroid/view/LayoutInflater;ZI)V

    invoke-virtual/range {p0 .. p0}, Lag;->d()Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_0

    iget-boolean v4, v0, Lag;->y:Z

    if-eqz v4, :cond_0

    iput-boolean v5, v3, Lai;->b:Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lag;->d()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static/range {p1 .. p1}, Lao;->b(Laj;)Z

    move-result v4

    iput-boolean v4, v3, Lai;->b:Z

    :cond_1
    :goto_0
    iget-object v4, v0, Lag;->i:Landroid/content/Context;

    iget v6, v0, Lag;->j:I

    const/4 v7, 0x0

    invoke-static {v3, v7, v4, v6}, Lag;->a(Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I

    move-result v4

    new-instance v6, Lci;

    iget-object v8, v0, Lag;->i:Landroid/content/Context;

    iget v9, v0, Lag;->k:I

    iget v10, v0, Lag;->l:I

    invoke-direct {v6, v8, v9, v10}, Lci;-><init>(Landroid/content/Context;II)V

    iget-object v8, v0, Lag;->p:Lch;

    iput-object v8, v6, Lci;->b:Lch;

    iput-object v0, v6, Lcg;->n:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v6, v0}, Lci;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v8, v0, Lag;->s:Landroid/view/View;

    iput-object v8, v6, Lcg;->m:Landroid/view/View;

    iget v8, v0, Lag;->r:I

    iput v8, v6, Lcg;->j:I

    invoke-virtual {v6}, Lci;->f()V

    invoke-virtual {v6}, Lci;->h()V

    invoke-virtual {v6, v3}, Lci;->a(Landroid/widget/ListAdapter;)V

    invoke-virtual {v6, v4}, Lci;->b(I)V

    iget v3, v0, Lag;->r:I

    iput v3, v6, Lcg;->j:I

    iget-object v3, v0, Lag;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v8, 0x0

    if-lez v3, :cond_a

    iget-object v3, v0, Lag;->b:Ljava/util/List;

    iget-object v9, v0, Lag;->b:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    sub-int/2addr v9, v5

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lag$a;

    iget-object v9, v3, Lag$a;->b:Laj;

    invoke-virtual {v9}, Laj;->size()I

    move-result v10

    move v11, v8

    :goto_1
    if-ge v11, v10, :cond_3

    invoke-virtual {v9, v11}, Laj;->getItem(I)Landroid/view/MenuItem;

    move-result-object v12

    invoke-interface {v12}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-interface {v12}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v13

    if-ne v1, v13, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_3
    move-object v12, v7

    :goto_2
    if-nez v12, :cond_4

    goto :goto_7

    :cond_4
    iget-object v9, v3, Lag$a;->a:Lci;

    iget-object v9, v9, Lcg;->e:Lcc;

    invoke-virtual {v9}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v10

    instance-of v11, v10, Landroid/widget/HeaderViewListAdapter;

    if-eqz v11, :cond_5

    check-cast v10, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v10}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    move-result v11

    invoke-virtual {v10}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v10

    check-cast v10, Lai;

    goto :goto_3

    :cond_5
    check-cast v10, Lai;

    move v11, v8

    :goto_3
    invoke-virtual {v10}, Lai;->getCount()I

    move-result v13

    move v14, v8

    :goto_4
    const/4 v15, -0x1

    if-ge v14, v13, :cond_7

    invoke-virtual {v10, v14}, Lai;->a(I)Lal;

    move-result-object v7

    if-ne v12, v7, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v14, v14, 0x1

    const/4 v7, 0x0

    goto :goto_4

    :cond_7
    move v14, v15

    :goto_5
    if-ne v14, v15, :cond_8

    goto :goto_6

    :cond_8
    add-int/2addr v14, v11

    invoke-virtual {v9}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v7

    sub-int/2addr v14, v7

    if-ltz v14, :cond_b

    invoke-virtual {v9}, Landroid/widget/ListView;->getChildCount()I

    move-result v7

    if-lt v14, v7, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v9, v14}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    goto :goto_7

    :cond_a
    const/4 v3, 0x0

    :cond_b
    :goto_6
    const/4 v7, 0x0

    :goto_7
    if-eqz v7, :cond_16

    sget-object v9, Lci;->a:Ljava/lang/reflect/Method;

    if-eqz v9, :cond_c

    :try_start_0
    sget-object v9, Lci;->a:Ljava/lang/reflect/Method;

    iget-object v10, v6, Lci;->s:Landroid/widget/PopupWindow;

    new-array v11, v5, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    aput-object v12, v11, v8

    invoke-virtual {v9, v10, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    const-string v9, "MenuPopupWindow"

    const-string v10, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    invoke-static {v9, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    :goto_8
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x17

    if-lt v9, v10, :cond_d

    iget-object v9, v6, Lci;->s:Landroid/widget/PopupWindow;

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setEnterTransition(Landroid/transition/Transition;)V

    :cond_d
    iget-object v9, v0, Lag;->b:Ljava/util/List;

    iget-object v10, v0, Lag;->b:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v10, v5

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lag$a;

    iget-object v9, v9, Lag$a;->a:Lci;

    iget-object v9, v9, Lcg;->e:Lcc;

    const/4 v10, 0x2

    new-array v11, v10, [I

    invoke-virtual {v9, v11}, Landroid/widget/ListView;->getLocationOnScreen([I)V

    new-instance v12, Landroid/graphics/Rect;

    invoke-direct {v12}, Landroid/graphics/Rect;-><init>()V

    iget-object v13, v0, Lag;->d:Landroid/view/View;

    invoke-virtual {v13, v12}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget v13, v0, Lag;->t:I

    if-ne v13, v5, :cond_e

    aget v11, v11, v8

    invoke-virtual {v9}, Landroid/widget/ListView;->getWidth()I

    move-result v9

    add-int/2addr v11, v9

    add-int/2addr v11, v4

    iget v9, v12, Landroid/graphics/Rect;->right:I

    if-gt v11, v9, :cond_f

    :goto_9
    move v9, v5

    goto :goto_a

    :cond_e
    aget v9, v11, v8

    sub-int/2addr v9, v4

    if-gez v9, :cond_f

    goto :goto_9

    :cond_f
    move v9, v8

    :goto_a
    if-ne v9, v5, :cond_10

    move v11, v5

    goto :goto_b

    :cond_10
    move v11, v8

    :goto_b
    iput v9, v0, Lag;->t:I

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1a

    const/4 v13, 0x5

    if-lt v9, v12, :cond_11

    iput-object v7, v6, Lcg;->m:Landroid/view/View;

    move v9, v8

    move v12, v9

    goto :goto_c

    :cond_11
    new-array v9, v10, [I

    iget-object v12, v0, Lag;->s:Landroid/view/View;

    invoke-virtual {v12, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    new-array v10, v10, [I

    invoke-virtual {v7, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    iget v12, v0, Lag;->r:I

    and-int/lit8 v12, v12, 0x7

    if-ne v12, v13, :cond_12

    aget v12, v9, v8

    iget-object v14, v0, Lag;->s:Landroid/view/View;

    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    move-result v14

    add-int/2addr v12, v14

    aput v12, v9, v8

    aget v12, v10, v8

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v14

    add-int/2addr v12, v14

    aput v12, v10, v8

    :cond_12
    aget v12, v10, v8

    aget v14, v9, v8

    sub-int/2addr v12, v14

    aget v10, v10, v5

    aget v9, v9, v5

    sub-int v9, v10, v9

    :goto_c
    iget v10, v0, Lag;->r:I

    and-int/2addr v10, v13

    if-ne v10, v13, :cond_15

    if-eqz v11, :cond_13

    :goto_d
    add-int/2addr v12, v4

    goto :goto_e

    :cond_13
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v4

    :cond_14
    sub-int/2addr v12, v4

    goto :goto_e

    :cond_15
    if-eqz v11, :cond_14

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v4

    goto :goto_d

    :goto_e
    iput v12, v6, Lcg;->g:I

    iput-boolean v5, v6, Lcg;->i:Z

    iput-boolean v5, v6, Lcg;->h:Z

    invoke-virtual {v6, v9}, Lci;->a(I)V

    goto :goto_f

    :cond_16
    iget-boolean v4, v0, Lag;->u:Z

    if-eqz v4, :cond_17

    iget v4, v0, Lag;->w:I

    iput v4, v6, Lcg;->g:I

    :cond_17
    iget-boolean v4, v0, Lag;->v:Z

    if-eqz v4, :cond_18

    iget v4, v0, Lag;->x:I

    invoke-virtual {v6, v4}, Lci;->a(I)V

    :cond_18
    iget-object v4, v0, Lao;->g:Landroid/graphics/Rect;

    iput-object v4, v6, Lcg;->q:Landroid/graphics/Rect;

    :goto_f
    new-instance v4, Lag$a;

    iget v5, v0, Lag;->t:I

    invoke-direct {v4, v6, v1, v5}, Lag$a;-><init>(Lci;Laj;I)V

    iget-object v5, v0, Lag;->b:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lci;->b()V

    iget-object v4, v6, Lcg;->e:Lcc;

    invoke-virtual {v4, v0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    if-nez v3, :cond_19

    iget-boolean v3, v0, Lag;->z:Z

    if-eqz v3, :cond_19

    iget-object v3, v1, Laj;->f:Ljava/lang/CharSequence;

    if-eqz v3, :cond_19

    sget v3, Lb$g;->abc_popup_menu_header_item_layout:I

    invoke-virtual {v2, v3, v4, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    const v3, 0x1020016

    invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v2, v8}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    iget-object v1, v1, Laj;->f:Ljava/lang/CharSequence;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    invoke-virtual {v4, v2, v1, v8}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    invoke-virtual {v6}, Lci;->b()V

    :cond_19
    return-void
.end method

.method private g()I
    .locals 2

    iget-object v0, p0, Lag;->s:Landroid/view/View;

    invoke-static {v0}, Lgq;->b(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v1
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget v0, p0, Lag;->q:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lag;->q:I

    iget-object v0, p0, Lag;->s:Landroid/view/View;

    invoke-static {v0}, Lgq;->b(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Lgf;->a(II)I

    move-result p1

    iput p1, p0, Lag;->r:I

    :cond_0
    return-void
.end method

.method public final a(Laj;)V
    .locals 1

    iget-object v0, p0, Lag;->i:Landroid/content/Context;

    invoke-virtual {p1, p0, v0}, Laj;->a(Laq;Landroid/content/Context;)V

    invoke-virtual {p0}, Lag;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lag;->c(Laj;)V

    return-void

    :cond_0
    iget-object v0, p0, Lag;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Laj;Z)V
    .locals 6

    iget-object v0, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lag$a;

    iget-object v3, v3, Lag$a;->b:Laj;

    if-ne p1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    if-gez v2, :cond_2

    return-void

    :cond_2
    add-int/lit8 v0, v2, 0x1

    iget-object v3, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lag$a;

    iget-object v0, v0, Lag$a;->b:Laj;

    invoke-virtual {v0, v1}, Laj;->a(Z)V

    :cond_3
    iget-object v0, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lag$a;

    iget-object v2, v0, Lag$a;->b:Laj;

    invoke-virtual {v2, p0}, Laj;->b(Laq;)V

    iget-boolean v2, p0, Lag;->f:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    iget-object v2, v0, Lag$a;->a:Lci;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-lt v4, v5, :cond_4

    iget-object v2, v2, Lci;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v3}, Landroid/widget/PopupWindow;->setExitTransition(Landroid/transition/Transition;)V

    :cond_4
    iget-object v2, v0, Lag$a;->a:Lci;

    iget-object v2, v2, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    :cond_5
    iget-object v0, v0, Lag$a;->a:Lci;

    invoke-virtual {v0}, Lci;->c()V

    iget-object v0, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    iget-object v2, p0, Lag;->b:Ljava/util/List;

    add-int/lit8 v4, v0, -0x1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lag$a;

    iget v2, v2, Lag$a;->c:I

    :goto_2
    iput v2, p0, Lag;->t:I

    goto :goto_3

    :cond_6
    invoke-direct {p0}, Lag;->g()I

    move-result v2

    goto :goto_2

    :goto_3
    if-nez v0, :cond_a

    invoke-virtual {p0}, Lag;->c()V

    iget-object p2, p0, Lag;->A:Laq$a;

    if-eqz p2, :cond_7

    iget-object p2, p0, Lag;->A:Laq$a;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Laq$a;->a(Laj;Z)V

    :cond_7
    iget-object p1, p0, Lag;->e:Landroid/view/ViewTreeObserver;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lag;->e:Landroid/view/ViewTreeObserver;

    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lag;->e:Landroid/view/ViewTreeObserver;

    iget-object p2, p0, Lag;->c:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_8
    iput-object v3, p0, Lag;->e:Landroid/view/ViewTreeObserver;

    :cond_9
    iget-object p1, p0, Lag;->d:Landroid/view/View;

    iget-object p2, p0, Lag;->o:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lag;->B:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    return-void

    :cond_a
    if-eqz p2, :cond_b

    iget-object p1, p0, Lag;->b:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lag$a;

    iget-object p1, p1, Lag$a;->b:Laj;

    invoke-virtual {p1, v1}, Laj;->a(Z)V

    :cond_b
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lag;->s:Landroid/view/View;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lag;->s:Landroid/view/View;

    iget p1, p0, Lag;->q:I

    iget-object v0, p0, Lag;->s:Landroid/view/View;

    invoke-static {v0}, Lgq;->b(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Lgf;->a(II)I

    move-result p1

    iput p1, p0, Lag;->r:I

    :cond_0
    return-void
.end method

.method public final a(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Lag;->B:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final a(Laq$a;)V
    .locals 0

    iput-object p1, p0, Lag;->A:Laq$a;

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-object p1, p0, Lag;->b:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lag$a;

    iget-object v0, v0, Lag$a;->a:Lci;

    iget-object v0, v0, Lcg;->e:Lcc;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-static {v0}, Lag;->a(Landroid/widget/ListAdapter;)Lai;

    move-result-object v0

    invoke-virtual {v0}, Lai;->notifyDataSetChanged()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a(Law;)Z
    .locals 4

    iget-object v0, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lag$a;

    iget-object v3, v1, Lag$a;->b:Laj;

    if-ne p1, v3, :cond_0

    iget-object p1, v1, Lag$a;->a:Lci;

    iget-object p1, p1, Lcg;->e:Lcc;

    invoke-virtual {p1}, Landroid/widget/ListView;->requestFocus()Z

    return v2

    :cond_1
    invoke-virtual {p1}, Law;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Lag;->a(Laj;)V

    iget-object v0, p0, Lag;->A:Laq$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lag;->A:Laq$a;

    invoke-interface {v0, p1}, Laq$a;->a(Laj;)Z

    :cond_2
    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final b()V
    .locals 2

    invoke-virtual {p0}, Lag;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lag;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laj;

    invoke-direct {p0, v1}, Lag;->c(Laj;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lag;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lag;->s:Landroid/view/View;

    iput-object v0, p0, Lag;->d:Landroid/view/View;

    iget-object v0, p0, Lag;->d:Landroid/view/View;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lag;->e:Landroid/view/ViewTreeObserver;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lag;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iput-object v1, p0, Lag;->e:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lag;->e:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Lag;->c:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    iget-object v0, p0, Lag;->d:Landroid/view/View;

    iget-object v1, p0, Lag;->o:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_4
    return-void
.end method

.method public final b(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lag;->u:Z

    iput p1, p0, Lag;->w:I

    return-void
.end method

.method public final b(Z)V
    .locals 0

    iput-boolean p1, p0, Lag;->y:Z

    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v1, p0, Lag;->b:Ljava/util/List;

    new-array v2, v0, [Lag$a;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lag$a;

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    aget-object v2, v1, v0

    iget-object v3, v2, Lag$a;->a:Lci;

    iget-object v3, v3, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Lag$a;->a:Lci;

    invoke-virtual {v2}, Lci;->c()V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lag;->v:Z

    iput p1, p0, Lag;->x:I

    return-void
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Lag;->z:Z

    return-void
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    iget-object v0, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lag$a;

    iget-object v0, v0, Lag$a;->a:Lci;

    iget-object v0, v0, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final e()Landroid/widget/ListView;
    .locals 2

    iget-object v0, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lag;->b:Ljava/util/List;

    iget-object v1, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lag$a;

    iget-object v0, v0, Lag$a;->a:Lci;

    iget-object v0, v0, Lcg;->e:Lcc;

    return-object v0
.end method

.method protected final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final onDismiss()V
    .locals 5

    iget-object v0, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lag;->b:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lag$a;

    iget-object v4, v3, Lag$a;->a:Lci;

    iget-object v4, v4, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v4}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    iget-object v0, v3, Lag$a;->b:Laj;

    invoke-virtual {v0, v1}, Laj;->a(Z)V

    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lag;->c()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
