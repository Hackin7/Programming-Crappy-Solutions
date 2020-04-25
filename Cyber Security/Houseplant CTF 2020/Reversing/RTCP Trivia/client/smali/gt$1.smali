.class final Lgt$1;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgt;->a(Landroid/view/View;Lgu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgu;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lgt;


# direct methods
.method constructor <init>(Lgt;Lgu;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lgt$1;->c:Lgt;

    iput-object p2, p0, Lgt$1;->a:Lgu;

    iput-object p3, p0, Lgt$1;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lgt$1;->a:Lgu;

    iget-object v0, p0, Lgt$1;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lgu;->c(Landroid/view/View;)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lgt$1;->a:Lgu;

    iget-object v0, p0, Lgt$1;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lgu;->b(Landroid/view/View;)V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lgt$1;->a:Lgu;

    iget-object v0, p0, Lgt$1;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lgu;->a(Landroid/view/View;)V

    return-void
.end method
