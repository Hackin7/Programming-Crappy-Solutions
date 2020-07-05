.class final Lhv$3;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lhp;

.field final synthetic d:Lhv;


# direct methods
.method constructor <init>(Lhv;Landroid/view/ViewGroup;Landroid/view/View;Lhp;)V
    .locals 0

    iput-object p1, p0, Lhv$3;->d:Lhv;

    iput-object p2, p0, Lhv$3;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lhv$3;->b:Landroid/view/View;

    iput-object p4, p0, Lhv$3;->c:Lhp;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 6

    iget-object p1, p0, Lhv$3;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lhv$3;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object p1, p0, Lhv$3;->c:Lhp;

    invoke-virtual {p1}, Lhp;->H()Landroid/animation/Animator;

    move-result-object p1

    iget-object v0, p0, Lhv$3;->c:Lhp;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhp;->a(Landroid/animation/Animator;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lhv$3;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lhv$3;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    if-gez p1, :cond_0

    iget-object v0, p0, Lhv$3;->d:Lhv;

    iget-object v1, p0, Lhv$3;->c:Lhp;

    iget-object p1, p0, Lhv$3;->c:Lhp;

    invoke-virtual {p1}, Lhp;->I()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lhv;->a(Lhp;IIIZ)V

    :cond_0
    return-void
.end method
