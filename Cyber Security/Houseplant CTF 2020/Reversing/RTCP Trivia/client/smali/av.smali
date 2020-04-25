.class final Lav;
.super Lao;

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Laq;


# static fields
.field private static final e:I


# instance fields
.field final a:Lci;

.field final b:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field c:Landroid/view/View;

.field d:Landroid/view/ViewTreeObserver;

.field private final f:Landroid/content/Context;

.field private final h:Laj;

.field private final i:Lai;

.field private final j:Z

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:Landroid/view/View$OnAttachStateChangeListener;

.field private o:Landroid/widget/PopupWindow$OnDismissListener;

.field private p:Landroid/view/View;

.field private q:Laq$a;

.field private r:Z

.field private s:Z

.field private t:I

.field private u:I

.field private v:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lb$g;->abc_popup_menu_item_layout:I

    sput v0, Lav;->e:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Laj;Landroid/view/View;IIZ)V
    .locals 3

    invoke-direct {p0}, Lao;-><init>()V

    new-instance v0, Lav$1;

    invoke-direct {v0, p0}, Lav$1;-><init>(Lav;)V

    iput-object v0, p0, Lav;->b:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    new-instance v0, Lav$2;

    invoke-direct {v0, p0}, Lav$2;-><init>(Lav;)V

    iput-object v0, p0, Lav;->n:Landroid/view/View$OnAttachStateChangeListener;

    const/4 v0, 0x0

    iput v0, p0, Lav;->u:I

    iput-object p1, p0, Lav;->f:Landroid/content/Context;

    iput-object p2, p0, Lav;->h:Laj;

    iput-boolean p6, p0, Lav;->j:Z

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p6

    new-instance v0, Lai;

    iget-boolean v1, p0, Lav;->j:Z

    sget v2, Lav;->e:I

    invoke-direct {v0, p2, p6, v1, v2}, Lai;-><init>(Laj;Landroid/view/LayoutInflater;ZI)V

    iput-object v0, p0, Lav;->i:Lai;

    iput p4, p0, Lav;->l:I

    iput p5, p0, Lav;->m:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p5

    iget p5, p5, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p5, p5, 0x2

    sget p6, Lb$d;->abc_config_prefDialogWidth:I

    invoke-virtual {p4, p6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p4

    invoke-static {p5, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    iput p4, p0, Lav;->k:I

    iput-object p3, p0, Lav;->p:Landroid/view/View;

    new-instance p3, Lci;

    iget-object p4, p0, Lav;->f:Landroid/content/Context;

    iget p5, p0, Lav;->l:I

    iget p6, p0, Lav;->m:I

    invoke-direct {p3, p4, p5, p6}, Lci;-><init>(Landroid/content/Context;II)V

    iput-object p3, p0, Lav;->a:Lci;

    invoke-virtual {p2, p0, p1}, Laj;->a(Laq;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    iput p1, p0, Lav;->u:I

    return-void
.end method

.method public final a(Laj;)V
    .locals 0

    return-void
.end method

.method public final a(Laj;Z)V
    .locals 1

    iget-object v0, p0, Lav;->h:Laj;

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lav;->c()V

    iget-object v0, p0, Lav;->q:Laq$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lav;->q:Laq$a;

    invoke-interface {v0, p1, p2}, Laq$a;->a(Laj;Z)V

    :cond_1
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lav;->p:Landroid/view/View;

    return-void
.end method

.method public final a(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Lav;->o:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final a(Laq$a;)V
    .locals 0

    iput-object p1, p0, Lav;->q:Laq$a;

    return-void
.end method

.method public final a(Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lav;->s:Z

    iget-object p1, p0, Lav;->i:Lai;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lav;->i:Lai;

    invoke-virtual {p1}, Lai;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a(Law;)Z
    .locals 9

    invoke-virtual {p1}, Law;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    new-instance v0, Lap;

    iget-object v3, p0, Lav;->f:Landroid/content/Context;

    iget-object v5, p0, Lav;->c:Landroid/view/View;

    iget-boolean v6, p0, Lav;->j:Z

    iget v7, p0, Lav;->l:I

    iget v8, p0, Lav;->m:I

    move-object v2, v0

    move-object v4, p1

    invoke-direct/range {v2 .. v8}, Lap;-><init>(Landroid/content/Context;Laj;Landroid/view/View;ZII)V

    iget-object v2, p0, Lav;->q:Laq$a;

    invoke-virtual {v0, v2}, Lap;->a(Laq$a;)V

    invoke-static {p1}, Lao;->b(Laj;)Z

    move-result v2

    invoke-virtual {v0, v2}, Lap;->a(Z)V

    iget-object v2, p0, Lav;->o:Landroid/widget/PopupWindow$OnDismissListener;

    iput-object v2, v0, Lap;->c:Landroid/widget/PopupWindow$OnDismissListener;

    const/4 v2, 0x0

    iput-object v2, p0, Lav;->o:Landroid/widget/PopupWindow$OnDismissListener;

    iget-object v2, p0, Lav;->h:Laj;

    invoke-virtual {v2, v1}, Laj;->a(Z)V

    iget-object v2, p0, Lav;->a:Lci;

    iget v2, v2, Lcg;->g:I

    iget-object v3, p0, Lav;->a:Lci;

    invoke-virtual {v3}, Lci;->g()I

    move-result v3

    iget v4, p0, Lav;->u:I

    iget-object v5, p0, Lav;->p:Landroid/view/View;

    invoke-static {v5}, Lgq;->b(Landroid/view/View;)I

    move-result v5

    invoke-static {v4, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    and-int/lit8 v4, v4, 0x7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Lav;->p:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v2, v4

    :cond_0
    invoke-virtual {v0}, Lap;->e()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    :goto_0
    move v0, v5

    goto :goto_1

    :cond_1
    iget-object v4, v0, Lap;->a:Landroid/view/View;

    if-nez v4, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v2, v3, v5, v5}, Lap;->a(IIZZ)V

    goto :goto_0

    :goto_1
    if-eqz v0, :cond_4

    iget-object v0, p0, Lav;->q:Laq$a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lav;->q:Laq$a;

    invoke-interface {v0, p1}, Laq$a;->a(Laj;)Z

    :cond_3
    return v5

    :cond_4
    return v1
.end method

.method public final b()V
    .locals 7

    invoke-virtual {p0}, Lav;->d()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-boolean v0, p0, Lav;->r:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lav;->p:Landroid/view/View;

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Lav;->p:Landroid/view/View;

    iput-object v0, p0, Lav;->c:Landroid/view/View;

    iget-object v0, p0, Lav;->a:Lci;

    invoke-virtual {v0, p0}, Lci;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v0, p0, Lav;->a:Lci;

    iput-object p0, v0, Lcg;->n:Landroid/widget/AdapterView$OnItemClickListener;

    iget-object v0, p0, Lav;->a:Lci;

    invoke-virtual {v0}, Lci;->f()V

    iget-object v0, p0, Lav;->c:Landroid/view/View;

    iget-object v3, p0, Lav;->d:Landroid/view/ViewTreeObserver;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_0

    :cond_2
    move v3, v2

    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v4

    iput-object v4, p0, Lav;->d:Landroid/view/ViewTreeObserver;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lav;->d:Landroid/view/ViewTreeObserver;

    iget-object v4, p0, Lav;->b:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v3, v4}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    iget-object v3, p0, Lav;->n:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v3, p0, Lav;->a:Lci;

    iput-object v0, v3, Lcg;->m:Landroid/view/View;

    iget-object v0, p0, Lav;->a:Lci;

    iget v3, p0, Lav;->u:I

    iput v3, v0, Lcg;->j:I

    iget-boolean v0, p0, Lav;->s:Z

    const/4 v3, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Lav;->i:Lai;

    iget-object v4, p0, Lav;->f:Landroid/content/Context;

    iget v5, p0, Lav;->k:I

    invoke-static {v0, v3, v4, v5}, Lav;->a(Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lav;->t:I

    iput-boolean v1, p0, Lav;->s:Z

    :cond_4
    iget-object v0, p0, Lav;->a:Lci;

    iget v4, p0, Lav;->t:I

    invoke-virtual {v0, v4}, Lci;->b(I)V

    iget-object v0, p0, Lav;->a:Lci;

    invoke-virtual {v0}, Lci;->h()V

    iget-object v0, p0, Lav;->a:Lci;

    iget-object v4, p0, Lao;->g:Landroid/graphics/Rect;

    iput-object v4, v0, Lcg;->q:Landroid/graphics/Rect;

    iget-object v0, p0, Lav;->a:Lci;

    invoke-virtual {v0}, Lci;->b()V

    iget-object v0, p0, Lav;->a:Lci;

    iget-object v0, v0, Lcg;->e:Lcc;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-boolean v4, p0, Lav;->v:Z

    if-eqz v4, :cond_6

    iget-object v4, p0, Lav;->h:Laj;

    iget-object v4, v4, Laj;->f:Ljava/lang/CharSequence;

    if-eqz v4, :cond_6

    iget-object v4, p0, Lav;->f:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    sget v5, Lb$g;->abc_popup_menu_header_item_layout:I

    invoke-virtual {v4, v5, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    const v5, 0x1020016

    invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_5

    iget-object v6, p0, Lav;->h:Laj;

    iget-object v6, v6, Laj;->f:Ljava/lang/CharSequence;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    invoke-virtual {v4, v2}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    invoke-virtual {v0, v4, v3, v2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    :cond_6
    iget-object v0, p0, Lav;->a:Lci;

    iget-object v2, p0, Lav;->i:Lai;

    invoke-virtual {v0, v2}, Lci;->a(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lav;->a:Lci;

    invoke-virtual {v0}, Lci;->b()V

    goto :goto_2

    :cond_7
    :goto_1
    move v1, v2

    :goto_2
    if-nez v1, :cond_8

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StandardMenuPopup cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    return-void
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Lav;->a:Lci;

    iput p1, v0, Lcg;->g:I

    return-void
.end method

.method public final b(Z)V
    .locals 1

    iget-object v0, p0, Lav;->i:Lai;

    iput-boolean p1, v0, Lai;->b:Z

    return-void
.end method

.method public final c()V
    .locals 1

    invoke-virtual {p0}, Lav;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lav;->a:Lci;

    invoke-virtual {v0}, Lci;->c()V

    :cond_0
    return-void
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, Lav;->a:Lci;

    invoke-virtual {v0, p1}, Lci;->a(I)V

    return-void
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Lav;->v:Z

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lav;->r:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lav;->a:Lci;

    iget-object v0, v0, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Lav;->a:Lci;

    iget-object v0, v0, Lcg;->e:Lcc;

    return-object v0
.end method

.method public final onDismiss()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lav;->r:Z

    iget-object v0, p0, Lav;->h:Laj;

    invoke-virtual {v0}, Laj;->close()V

    iget-object v0, p0, Lav;->d:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lav;->d:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lav;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lav;->d:Landroid/view/ViewTreeObserver;

    :cond_0
    iget-object v0, p0, Lav;->d:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Lav;->b:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lav;->d:Landroid/view/ViewTreeObserver;

    :cond_1
    iget-object v0, p0, Lav;->c:Landroid/view/View;

    iget-object v1, p0, Lav;->n:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Lav;->o:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lav;->o:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

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

    invoke-virtual {p0}, Lav;->c()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
